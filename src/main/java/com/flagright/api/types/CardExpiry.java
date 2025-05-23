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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flagright.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CardExpiry.Builder.class)
public final class CardExpiry {
    private final Optional<Double> month;

    private final Optional<Double> year;

    private final Map<String, Object> additionalProperties;

    private CardExpiry(Optional<Double> month, Optional<Double> year, Map<String, Object> additionalProperties) {
        this.month = month;
        this.year = year;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("month")
    public Optional<Double> getMonth() {
        return month;
    }

    @JsonProperty("year")
    public Optional<Double> getYear() {
        return year;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CardExpiry && equalTo((CardExpiry) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CardExpiry other) {
        return month.equals(other.month) && year.equals(other.year);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.month, this.year);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<Double> month = Optional.empty();

        private Optional<Double> year = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CardExpiry other) {
            month(other.getMonth());
            year(other.getYear());
            return this;
        }

        @JsonSetter(value = "month", nulls = Nulls.SKIP)
        public Builder month(Optional<Double> month) {
            this.month = month;
            return this;
        }

        public Builder month(Double month) {
            this.month = Optional.ofNullable(month);
            return this;
        }

        @JsonSetter(value = "year", nulls = Nulls.SKIP)
        public Builder year(Optional<Double> year) {
            this.year = year;
            return this;
        }

        public Builder year(Double year) {
            this.year = Optional.ofNullable(year);
            return this;
        }

        public CardExpiry build() {
            return new CardExpiry(month, year, additionalProperties);
        }
    }
}
