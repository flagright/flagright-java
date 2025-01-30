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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ExecutedLogicVars.Builder.class)
public final class ExecutedLogicVars {
    private final Optional<RuleHitDirection> direction;

    private final Map<String, Object> value;

    private final Map<String, Object> additionalProperties;

    private ExecutedLogicVars(
            Optional<RuleHitDirection> direction, Map<String, Object> value, Map<String, Object> additionalProperties) {
        this.direction = direction;
        this.value = value;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("direction")
    public Optional<RuleHitDirection> getDirection() {
        return direction;
    }

    @JsonProperty("value")
    public Map<String, Object> getValue() {
        return value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ExecutedLogicVars && equalTo((ExecutedLogicVars) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ExecutedLogicVars other) {
        return direction.equals(other.direction) && value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.direction, this.value);
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
        private Optional<RuleHitDirection> direction = Optional.empty();

        private Map<String, Object> value = new LinkedHashMap<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ExecutedLogicVars other) {
            direction(other.getDirection());
            value(other.getValue());
            return this;
        }

        @JsonSetter(value = "direction", nulls = Nulls.SKIP)
        public Builder direction(Optional<RuleHitDirection> direction) {
            this.direction = direction;
            return this;
        }

        public Builder direction(RuleHitDirection direction) {
            this.direction = Optional.ofNullable(direction);
            return this;
        }

        @JsonSetter(value = "value", nulls = Nulls.SKIP)
        public Builder value(Map<String, Object> value) {
            this.value.clear();
            this.value.putAll(value);
            return this;
        }

        public Builder putAllValue(Map<String, Object> value) {
            this.value.putAll(value);
            return this;
        }

        public Builder value(String key, Object value) {
            this.value.put(key, value);
            return this;
        }

        public ExecutedLogicVars build() {
            return new ExecutedLogicVars(direction, value, additionalProperties);
        }
    }
}
