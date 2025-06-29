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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = HitRulesResults.Builder.class)
public final class HitRulesResults {
    private final List<HitRulesDetails> hitRules;

    private final Map<String, Object> additionalProperties;

    private HitRulesResults(List<HitRulesDetails> hitRules, Map<String, Object> additionalProperties) {
        this.hitRules = hitRules;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Uniquue transaction identifier
     */
    @JsonProperty("hitRules")
    public List<HitRulesDetails> getHitRules() {
        return hitRules;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof HitRulesResults && equalTo((HitRulesResults) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(HitRulesResults other) {
        return hitRules.equals(other.hitRules);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.hitRules);
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
        private List<HitRulesDetails> hitRules = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(HitRulesResults other) {
            hitRules(other.getHitRules());
            return this;
        }

        @JsonSetter(value = "hitRules", nulls = Nulls.SKIP)
        public Builder hitRules(List<HitRulesDetails> hitRules) {
            this.hitRules.clear();
            this.hitRules.addAll(hitRules);
            return this;
        }

        public Builder addHitRules(HitRulesDetails hitRules) {
            this.hitRules.add(hitRules);
            return this;
        }

        public Builder addAllHitRules(List<HitRulesDetails> hitRules) {
            this.hitRules.addAll(hitRules);
            return this;
        }

        public HitRulesResults build() {
            return new HitRulesResults(hitRules, additionalProperties);
        }
    }
}
