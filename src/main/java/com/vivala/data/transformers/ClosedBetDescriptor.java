package com.vivala.data.transformers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gf.util.string.JSON;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ClosedBetDescriptor {
    public String project_id;
    public String country;
    public String city;
    public String platform;
    public String user_id;
    public String type;
    public String action_time;
    public long action_time_miliseconds;
    public String betid;
    public String gameid;
    public String teamid;
    public String playerid;
    public String location;
    public String bonus;
    public int profitnetto;
    public int risked = 0;
    public int noBonusProfit = 0;

    @Override
    public final boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final ClosedBetDescriptor that = (ClosedBetDescriptor) o;
        return this.toString().equals(that.toString());
    }

    @Override
    public final int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public final String toString() {
        return JSON.toJson(this);
    }

    public static final class _List extends ArrayList<ClosedBetDescriptor> implements List<ClosedBetDescriptor>{
		private static final long serialVersionUID = -5086457219426430982L;
    }
}
