package com.athena.backend.platform.dto.achievments;

import java.util.Objects;

public class MessageScheduler {

    public Long offset;

    public boolean repeatable;

    public String intervalValue;

    public String intervalTemplate;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MessageScheduler that = (MessageScheduler) o;
        return repeatable == that.repeatable &&
                intervalValue == that.intervalValue &&
                Objects.equals(offset, that.offset) &&
                Objects.equals(intervalTemplate, that.intervalTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, repeatable, intervalValue, intervalTemplate);
    }

    @Override
    public String toString() {
        return "MessageScheduler{" +
                "offset=" + offset +
                ", repeatable=" + repeatable +
                ", intervalValue=" + intervalValue +
                ", intervalTemplate='" + intervalTemplate + '\'' +
                '}';
    }
}
