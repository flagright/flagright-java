/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flagright.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flagright.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ListMetadataTtl.Builder.class)
public final class ListMetadataTtl {
    private final ListMetadataTtlUnit unit;

    private final double value;

    private final Map<String, Object> additionalProperties;

    private ListMetadataTtl(ListMetadataTtlUnit unit, double value, Map<String, Object> additionalProperties) {
        this.unit = unit;
        this.value = value;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("unit")
    public ListMetadataTtlUnit getUnit() {
        return unit;
    }

    @JsonProperty("value")
    public double getValue() {
        return value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ListMetadataTtl && equalTo((ListMetadataTtl) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ListMetadataTtl other) {
        return unit.equals(other.unit) && value == other.value;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.unit, this.value);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UnitStage builder() {
        return new Builder();
    }

    public interface UnitStage {
        ValueStage unit(@NotNull ListMetadataTtlUnit unit);

        Builder from(ListMetadataTtl other);
    }

    public interface ValueStage {
        _FinalStage value(double value);
    }

    public interface _FinalStage {
        ListMetadataTtl build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UnitStage, ValueStage, _FinalStage {
        private ListMetadataTtlUnit unit;

        private double value;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ListMetadataTtl other) {
            unit(other.getUnit());
            value(other.getValue());
            return this;
        }

        @java.lang.Override
        @JsonSetter("unit")
        public ValueStage unit(@NotNull ListMetadataTtlUnit unit) {
            this.unit = Objects.requireNonNull(unit, "unit must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("value")
        public _FinalStage value(double value) {
            this.value = value;
            return this;
        }

        @java.lang.Override
        public ListMetadataTtl build() {
            return new ListMetadataTtl(unit, value, additionalProperties);
        }
    }
}
