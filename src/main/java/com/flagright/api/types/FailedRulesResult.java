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
@JsonDeserialize(builder = FailedRulesResult.Builder.class)
public final class FailedRulesResult {
    private final String ruleId;

    private final String ruleName;

    private final String ruleDescription;

    private final RuleFailureException failureException;

    private final Map<String, Object> additionalProperties;

    private FailedRulesResult(
            String ruleId,
            String ruleName,
            String ruleDescription,
            RuleFailureException failureException,
            Map<String, Object> additionalProperties) {
        this.ruleId = ruleId;
        this.ruleName = ruleName;
        this.ruleDescription = ruleDescription;
        this.failureException = failureException;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Unique rule identifier
     */
    @JsonProperty("ruleId")
    public String getRuleId() {
        return ruleId;
    }

    /**
     * @return Name of the rule
     */
    @JsonProperty("ruleName")
    public String getRuleName() {
        return ruleName;
    }

    /**
     * @return Description of the rule
     */
    @JsonProperty("ruleDescription")
    public String getRuleDescription() {
        return ruleDescription;
    }

    @JsonProperty("failureException")
    public RuleFailureException getFailureException() {
        return failureException;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FailedRulesResult && equalTo((FailedRulesResult) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FailedRulesResult other) {
        return ruleId.equals(other.ruleId)
                && ruleName.equals(other.ruleName)
                && ruleDescription.equals(other.ruleDescription)
                && failureException.equals(other.failureException);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.ruleId, this.ruleName, this.ruleDescription, this.failureException);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RuleIdStage builder() {
        return new Builder();
    }

    public interface RuleIdStage {
        RuleNameStage ruleId(@NotNull String ruleId);

        Builder from(FailedRulesResult other);
    }

    public interface RuleNameStage {
        RuleDescriptionStage ruleName(@NotNull String ruleName);
    }

    public interface RuleDescriptionStage {
        FailureExceptionStage ruleDescription(@NotNull String ruleDescription);
    }

    public interface FailureExceptionStage {
        _FinalStage failureException(@NotNull RuleFailureException failureException);
    }

    public interface _FinalStage {
        FailedRulesResult build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements RuleIdStage, RuleNameStage, RuleDescriptionStage, FailureExceptionStage, _FinalStage {
        private String ruleId;

        private String ruleName;

        private String ruleDescription;

        private RuleFailureException failureException;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(FailedRulesResult other) {
            ruleId(other.getRuleId());
            ruleName(other.getRuleName());
            ruleDescription(other.getRuleDescription());
            failureException(other.getFailureException());
            return this;
        }

        /**
         * <p>Unique rule identifier</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("ruleId")
        public RuleNameStage ruleId(@NotNull String ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId, "ruleId must not be null");
            return this;
        }

        /**
         * <p>Name of the rule</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("ruleName")
        public RuleDescriptionStage ruleName(@NotNull String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName, "ruleName must not be null");
            return this;
        }

        /**
         * <p>Description of the rule</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("ruleDescription")
        public FailureExceptionStage ruleDescription(@NotNull String ruleDescription) {
            this.ruleDescription = Objects.requireNonNull(ruleDescription, "ruleDescription must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("failureException")
        public _FinalStage failureException(@NotNull RuleFailureException failureException) {
            this.failureException = Objects.requireNonNull(failureException, "failureException must not be null");
            return this;
        }

        @java.lang.Override
        public FailedRulesResult build() {
            return new FailedRulesResult(ruleId, ruleName, ruleDescription, failureException, additionalProperties);
        }
    }
}
