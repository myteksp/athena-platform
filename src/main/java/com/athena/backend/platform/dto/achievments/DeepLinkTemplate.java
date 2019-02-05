package com.athena.backend.platform.dto.achievments;

import java.util.Objects;

public class DeepLinkTemplate {

    public String template;
    public String value;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        DeepLinkTemplate that = (DeepLinkTemplate) o;
        return Objects.equals(template, that.template) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(template, value);
    }

    @Override
    public String toString() {
        return "DeepLinkTemplate{" +
                "template='" + template + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
