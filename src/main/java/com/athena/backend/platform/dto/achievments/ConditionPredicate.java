package com.athena.backend.platform.dto.achievments;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Objects;

@JsonInclude(value= JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConditionPredicate {

    public String index;
    public String field;
    public String condition;
    public String value;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ConditionPredicate that = (ConditionPredicate) o;
        return Objects.equals(index, that.index) &&
                Objects.equals(field, that.field) &&
                Objects.equals(condition, that.condition) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, field, condition, value);
    }

    @Override
    public String toString() {
        return "ConditionPredicate{" +
                "index='" + index + '\'' +
                ", field='" + field + '\'' +
                ", condition='" + condition + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
