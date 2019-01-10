package com.athena.backend.platform.dto.achievments;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@JsonInclude(value= JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Reward {

    public final String id;

    public final Badge badge;

    public final boolean claimed;

    public final long generatedTime;

    public final long claimedTime;

    public final long completedTime;

    public final List<Currency> amount;

    public final double progress;

    public final boolean isRead;

    public Reward(String id, Badge badge, boolean claimed, long generatedTime, long claimedTime, long completedTime,
            List<Currency> amount, double progress, boolean isRead) {
        this.id = id;
        this.badge = badge;
        this.claimed = claimed;
        this.generatedTime = generatedTime;
        this.claimedTime = claimedTime;
        this.completedTime = completedTime;
        this.amount = amount;
        this.progress = progress;
        this.isRead = isRead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Reward reward = (Reward) o;
        return claimed == reward.claimed &&
                Double.compare(reward.progress, progress) == 0 &&
                isRead == reward.isRead &&
                Objects.equals(id, reward.id) &&
                Objects.equals(badge, reward.badge) &&
                Objects.equals(generatedTime, reward.generatedTime) &&
                Objects.equals(claimedTime, reward.claimedTime) &&
                Objects.equals(completedTime, reward.completedTime) &&
                Objects.equals(amount, reward.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, badge, claimed, generatedTime, claimedTime, completedTime, amount, progress, isRead);
    }

    @Override
    public String toString() {
        return "Reward{" +
                "id='" + id + '\'' +
                ", badge=" + badge +
                ", claimed=" + claimed +
                ", generatedTime=" + generatedTime +
                ", claimedTime=" + claimedTime +
                ", completedTime=" + completedTime +
                ", amount=" + amount +
                ", progress=" + progress +
                ", isRead=" + isRead +
                '}';
    }
}
