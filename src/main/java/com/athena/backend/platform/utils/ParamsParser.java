package com.athena.backend.platform.utils;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.HashMap;
import java.util.Map;

import com.gf.collections.GfCollection;
import com.gf.collections.GfCollections;
import com.gf.collections.tuples.Tuples;
import com.gf.util.string.MC;
import com.gf.util.string.Splitter;

public final class ParamsParser {
	private static final Decoder decoder = Base64.getUrlDecoder();
	private static final Encoder encoder = Base64.getUrlEncoder();

	private static final String decode(final String str) {
		try {
			return new String(decoder.decode(str), "UTF-8");
		} catch (final Throwable e) {
			return str;
		}
	}

	private static final String encode(final String str) {
		try {
			return encoder.encodeToString(str.getBytes("UTF-8"));
		} catch (final Throwable e) {
			return str;
		}
	}

	public static final Map<String, GfCollection<String>> parseQueryBase64Params(final String uri){
		final Map<String, GfCollection<String>> res = new HashMap<String, GfCollection<String>>();
		GfCollections.asArrayCollection(Splitter.split(uri, '&'))
		.flatMap(pair->{
			final GfCollection<String> p = GfCollections.asArrayCollection(Splitter.split(pair, '='));
			if (p.size() < 2)
				return GfCollections.asLinkedCollection();
			if (p.size() == 2) 
				return GfCollections.asLinkedCollection(Tuples.get(p.findFirst().trim(), decode(p.get(1))));
			return GfCollections.asLinkedCollection(Tuples.get(p.findFirst().trim(), decode(p.takeFromEnd(p.size() - 1).join("="))));
		})
		.forEach(t->{
			GfCollection<String> col = res.get(t.v1);
			if (col == null) {
				col = GfCollections.asLinkedCollection();
				res.put(t.v1, col);
			}
			col.add(t.v2);
		});
		return res;
	}

	public static final Map<String, GfCollection<String>> parseQueryParams(final String uri){
		final Map<String, GfCollection<String>> res = new HashMap<String, GfCollection<String>>();
		GfCollections.asArrayCollection(Splitter.split(uri, '&'))
		.flatMap(pair->{
			final GfCollection<String> p = GfCollections.asArrayCollection(Splitter.split(pair, '='));
			if (p.size() < 2)
				return GfCollections.asLinkedCollection();
			if (p.size() == 2) 
				return GfCollections.asLinkedCollection(Tuples.get(p.findFirst().trim(), p.get(1)));
			return GfCollections.asLinkedCollection(Tuples.get(p.findFirst().trim(), p.takeFromEnd(p.size() - 1).join("=")));
		})
		.forEach(t->{
			GfCollection<String> col = res.get(t.v1);
			if (col == null) {
				col = GfCollections.asLinkedCollection();
				res.put(t.v1, col);
			}
			col.add(t.v2);
		});
		return res;
	}

	public static final String toQuery(final Map<String, GfCollection<String>> params) {
		return GfCollections.asArrayCollection(params.entrySet())
				.flatMap(e->{
					final String name = e.getKey();
					return e.getValue().map(v->Tuples.get(name, v));
				})
				.map(t->MC.fmt("${0}=${1}", t.v1, t.v2))
				.join("&");
	}

	public static final String toBase64Query(final Map<String, GfCollection<String>> params) {
		return GfCollections.asArrayCollection(params.entrySet())
				.flatMap(e->{
					final String name = e.getKey();
					return e.getValue().map(v->Tuples.get(name, encode(v)));
				})
				.map(t->MC.fmt("${0}=${1}", t.v1, t.v2))
				.join("&");
	}
}
