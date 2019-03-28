package com.vivala.data.transformers;

import com.athena.backend.platform.dto.game.Bet;
import com.athena.backend.platform.dto.game.BetBonus;
import com.gf.collections.GfCollection;
import com.gf.collections.GfCollections;
import com.gf.collections.tuples.Tuple2;
import com.gf.collections.tuples.Tuples;
import com.gf.http.GenericHttpEndpoint;
import com.gf.http.HttpEndpointCreator;
import com.gf.util.string.MC;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.io.File;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public final class ClosedBetsTransformer {

	private static final String betExtUrl = "https://athena-backend-api-rest-usa.herokuapp.com/bets/getUserBundles?userId=${0}";
	private static final String usersUrl = "https://athena-backend-api-rest-usa.herokuapp.com/users/listAll?page=${0}&size=${1}";
	private static final String outputPathAll = "/Users/dmitry/athena/athena-platform/closed_bets_all.csv";
	private static final String outputTeam = "/Users/dmitry/athena/athena-platform/closed_bets_team.csv";
	private static final String outputTeamPlayer = "/Users/dmitry/athena/athena-platform/closed_bets_team_player.csv";
	private static final String outputTeamPlayerLocation = "/Users/dmitry/athena/athena-platform/closed_bets_team_player_location.csv";

	public static final void main(final String[] args) throws IOException {
		final Logger root = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
		root.setLevel(Level.INFO);
		final ClosedBetsTransformer inst = new ClosedBetsTransformer();
		inst.close();
	}

	private final HttpEndpointCreator httpEndpoint;
	private final GenericHttpEndpoint generalRepo;

	public ClosedBetsTransformer() throws IOException {
		this.httpEndpoint = new HttpEndpointCreator();
		this.generalRepo = this.httpEndpoint.getGenericEndPoint();
		this.start();
	}

	private final void close() throws IOException {
		httpEndpoint.close();
	}

	@SuppressWarnings("unchecked")
	private final GfCollection<Map<String, Object>> getUsers() {
		final int size = 1000;
		int page = 0;
		final GfCollection<Tuple2<Map<String, Object>, Map<String, Object>>> result = GfCollections.asLinkedCollection();
		GfCollection<Object> list = null;
		do {
			list = GfCollections.wrapAsCollection(generalRepo.get(MC.fmt(usersUrl, page, size), List.class));
			list.map(u -> {
				final Map<String, Object> data = (Map<String, Object>) u;
				final Map<String, Object> user = (Map<String, Object>) data.get("user");
				final Map<String, Object> extra = (Map<String, Object>) data.get("extra");
				return Tuples.get(user, extra);
			})
					.forEach(u -> {
						result.add(u);
					});
			page++;
			System.out.println("Downloading userpage: " + page);
		} while (!list.isEmpty());

		return result.filter(u -> {
			final Map<String, Object> user = u.v1;
			final Map<String, Object> extra = u.v2;
			if (!extra.containsKey("country"))
				return false;
			final String country = extra.get("country").toString().toLowerCase().trim();
			if (country.contains("united states") || country.contains("usa") || country.equals("us")) {
				extra.put("userId", user.get("userId").toString());
				return true;
			}
			return false;
		}).map(u -> u.v2);
	}

	private final void start() throws IOException {
		final AtomicLong progress = new AtomicLong(0);
		final GfCollection<Map<String, Object>> users = getUsers();
		final int usersAmount = users.size();
		final GfCollection<ClosedBetDescriptor> bets = users.flatMap(user -> {
			final long currentProgress = progress.incrementAndGet();
			final int percent = (int)Math.round((((double)currentProgress) / ((double)usersAmount)) * 100.0);
			System.out.println(MC.fmt("Processing user ${0} out of ${1}. ${2}", currentProgress, usersAmount, percent));
			final String userId = user.get("userId").toString();
			final String country = user.get("country").toString();
			final String city = user.containsKey("city") ? user.get("city").toString() : "";
			final String platform = user.containsKey("platform") ? user.get("platform").toString() : "";
			return GfCollections.wrapAsCollection(generalRepo.get(MC.fmt(betExtUrl, userId), BetsBundleEntList.class))
					.action(lst -> {
						System.out.println("Got: " + lst.size() + " bets for user: " + userId);
					})
					.map(bundle -> {
						final ClosedBetDescriptor descriptor = new ClosedBetDescriptor();
						descriptor.betid = bundle.commonId;
						descriptor.gameid = bundle.bets.get(0).gameId;
						descriptor.action_time_miliseconds = bundle.bets.get(0).madeTime;
						descriptor.action_time = new Date(descriptor.action_time_miliseconds).toString();
						descriptor.country = country;
						descriptor.city = city;
						descriptor.platform = platform;
						descriptor.user_id = userId;
						descriptor.type = "closed_bet";
						descriptor.project_id = "hoopit_production";

						descriptor.bonus = "";
						descriptor.teamid = descriptor.playerid = descriptor.location = null;
						descriptor.profitnetto = bundle.nettoProfit;
						descriptor.noBonusProfit = bundle.nettoProfit - bundle.totalBonusAmount;
						descriptor.risked = 0;
						GfCollections.wrapAsCollection(bundle.bets)
								.action(coll -> {
									descriptor.bonus = coll.flatMap(b -> b.bonuses).map(b -> b.type.toString()).join("|");
								})
								.forEach(b -> {
									descriptor.risked += b.stake;
									switch (b.type) {
										case TEAM:
											descriptor.teamid = b.teamId;
											break;
										case PLAYER:
											descriptor.playerid = b.playerId;
											break;
										case LOCATION:
											descriptor.location = b.gameZone.toString();
											break;
									}
								});
						return descriptor;
					});
		}).sortCollection((b1, b2) -> Double.compare(b1.action_time_miliseconds, b2.action_time_miliseconds));
		writeAll(bets);
		writeTeam(bets);
		writeTeamPlayer(bets);
		writeTeamPlayerLocation(bets);
	}

	private final void writeTeamPlayerLocation(final GfCollection<ClosedBetDescriptor> bets) throws IOException {
		final GfCollection<String> csvLines = addHeader(bets
				.filter(b -> (!isEmpty(b.teamid)) && (!isEmpty(b.playerid)) && (!isEmpty(b.location)))
				.map(d -> GfCollections.asLinkedCollection(d.project_id, d.country, d.city, d.platform, d.user_id, d.type, d.action_time, d.betid, d.gameid, d.teamid, d.playerid, d.location, d.bonus, d.profitnetto, d.risked, d.noBonusProfit).join()));
		Files.write(new File(outputTeamPlayerLocation).toPath(), csvLines.join("\n").getBytes());
	}

	private final void writeTeamPlayer(final GfCollection<ClosedBetDescriptor> bets) throws IOException {
		final GfCollection<String> csvLines = addHeader(bets
				.filter(b -> (!isEmpty(b.teamid)) && (!isEmpty(b.playerid)) && isEmpty(b.location))
				.map(d -> GfCollections.asLinkedCollection(d.project_id, d.country, d.city, d.platform, d.user_id, d.type, d.action_time, d.betid, d.gameid, d.teamid, d.playerid, d.location, d.bonus, d.profitnetto, d.risked, d.noBonusProfit).join()));
		Files.write(new File(outputTeamPlayer).toPath(), csvLines.join("\n").getBytes());
	}

	private final void writeTeam(final GfCollection<ClosedBetDescriptor> bets) throws IOException {
		final GfCollection<String> csvLines = addHeader(bets
				.filter(b -> (!isEmpty(b.teamid)) && isEmpty(b.playerid) && isEmpty(b.location))
				.map(d -> GfCollections.asLinkedCollection(d.project_id, d.country, d.city, d.platform, d.user_id, d.type, d.action_time, d.betid, d.gameid, d.teamid, d.playerid, d.location, d.bonus, d.profitnetto, d.risked, d.noBonusProfit).join()));
		Files.write(new File(outputTeam).toPath(), csvLines.join("\n").getBytes());
	}

	private final void writeAll(final GfCollection<ClosedBetDescriptor> bets) throws IOException {
		final GfCollection<String> csvLines = addHeader(bets.map(d -> GfCollections.asLinkedCollection(d.project_id, d.country, d.city, d.platform, d.user_id, d.type, d.action_time, d.betid, d.gameid, d.teamid, d.playerid, d.location, d.bonus, d.profitnetto, d.risked, d.noBonusProfit).join()));
		Files.write(new File(outputPathAll).toPath(), csvLines.join("\n").getBytes());
	}

	private final GfCollection<String> addHeader(final GfCollection<String> csv) {
		final GfCollection<String> res = GfCollections.asLinkedCollection();
		res.add("project id, country, city, platform, user id, event type, action time, bet id, game id, team id, player id, location, bonus type, profit netto, risked, won without bonus");
		csv.forEach(b -> res.add(b));
		return res;
	}

	private static final boolean isEmpty(final String str) {
		if (str == null)
			return true;
		if (str.isEmpty())
			return true;
		if (str.trim().isEmpty())
			return true;
		return false;
	}

	public static final class BetsBundleEnt {
		public String commonId;
		public List<Bet> bets;
		public int totalBonusAmount;
		public int nettoProfit;
		public BetBonus.BetBonusType bonusType;
	}

	public static final class BetsBundleEntList extends ArrayList<BetsBundleEnt> implements List<BetsBundleEnt> {
		private static final long serialVersionUID = 1463974603197260830L;
	}
}
