package com.athena.backend.platform.dto.achievments;

import java.util.Objects;

public class MessageBonusTemplate {

    public String valueProvider;
    public String bonusTemplate;
    public String value;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MessageBonusTemplate that = (MessageBonusTemplate) o;
        return Objects.equals(valueProvider, that.valueProvider) &&
                Objects.equals(bonusTemplate, that.bonusTemplate) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueProvider, bonusTemplate, value);
    }

    @Override
    public String toString() {
        return "MessageBonusTemplate{" +
                "valueProvider='" + valueProvider + '\'' +
                ", bonusTemplate='" + bonusTemplate + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
