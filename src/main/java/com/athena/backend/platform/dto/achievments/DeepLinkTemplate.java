package com.athena.backend.platform.dto.achievments;

import java.util.Objects;

public class DeepLinkTemplate {

    public String template;
    public String valueProvider;
    public String value;
    public String valueStub;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        DeepLinkTemplate that = (DeepLinkTemplate) o;
        return Objects.equals(template, that.template) &&
                Objects.equals(valueProvider, that.valueProvider) &&
                Objects.equals(value, that.value) &&
                Objects.equals(valueStub, that.valueStub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(template, valueProvider, value, valueStub);
    }

    @Override
    public String toString() {
        return "DeepLinkTemplate{" +
                "template='" + template + '\'' +
                ", valueProvider='" + valueProvider + '\'' +
                ", value='" + value + '\'' +
                ", valueStub='" + valueStub + '\'' +
                '}';
    }
}
