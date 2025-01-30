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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = HitRulesDetails.Builder.class)
public final class HitRulesDetails {
    private final Optional<String> ruleId;

    private final String ruleInstanceId;

    private final String ruleName;

    private final String ruleDescription;

    private final Optional<Double> executedAt;

    private final RuleAction ruleAction;

    private final Optional<RuleHitMeta> ruleHitMeta;

    private final Optional<List<RuleLabels>> labels;

    private final Optional<RuleNature> nature;

    private final Optional<Boolean> isShadow;

    private final Map<String, Object> additionalProperties;

    private HitRulesDetails(
            Optional<String> ruleId,
            String ruleInstanceId,
            String ruleName,
            String ruleDescription,
            Optional<Double> executedAt,
            RuleAction ruleAction,
            Optional<RuleHitMeta> ruleHitMeta,
            Optional<List<RuleLabels>> labels,
            Optional<RuleNature> nature,
            Optional<Boolean> isShadow,
            Map<String, Object> additionalProperties) {
        this.ruleId = ruleId;
        this.ruleInstanceId = ruleInstanceId;
        this.ruleName = ruleName;
        this.ruleDescription = ruleDescription;
        this.executedAt = executedAt;
        this.ruleAction = ruleAction;
        this.ruleHitMeta = ruleHitMeta;
        this.labels = labels;
        this.nature = nature;
        this.isShadow = isShadow;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Unique rule identifier
     */
    @JsonProperty("ruleId")
    public Optional<String> getRuleId() {
        return ruleId;
    }

    @JsonProperty("ruleInstanceId")
    public String getRuleInstanceId() {
        return ruleInstanceId;
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

    /**
     * @return Timestamp when the rule was hit
     */
    @JsonProperty("executedAt")
    public Optional<Double> getExecutedAt() {
        return executedAt;
    }

    @JsonProperty("ruleAction")
    public RuleAction getRuleAction() {
        return ruleAction;
    }

    @JsonProperty("ruleHitMeta")
    public Optional<RuleHitMeta> getRuleHitMeta() {
        return ruleHitMeta;
    }

    @JsonProperty("labels")
    public Optional<List<RuleLabels>> getLabels() {
        return labels;
    }

    @JsonProperty("nature")
    public Optional<RuleNature> getNature() {
        return nature;
    }

    @JsonProperty("isShadow")
    public Optional<Boolean> getIsShadow() {
        return isShadow;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof HitRulesDetails && equalTo((HitRulesDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(HitRulesDetails other) {
        return ruleId.equals(other.ruleId)
                && ruleInstanceId.equals(other.ruleInstanceId)
                && ruleName.equals(other.ruleName)
                && ruleDescription.equals(other.ruleDescription)
                && executedAt.equals(other.executedAt)
                && ruleAction.equals(other.ruleAction)
                && ruleHitMeta.equals(other.ruleHitMeta)
                && labels.equals(other.labels)
                && nature.equals(other.nature)
                && isShadow.equals(other.isShadow);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.ruleId,
                this.ruleInstanceId,
                this.ruleName,
                this.ruleDescription,
                this.executedAt,
                this.ruleAction,
                this.ruleHitMeta,
                this.labels,
                this.nature,
                this.isShadow);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RuleInstanceIdStage builder() {
        return new Builder();
    }

    public interface RuleInstanceIdStage {
        RuleNameStage ruleInstanceId(@NotNull String ruleInstanceId);

        Builder from(HitRulesDetails other);
    }

    public interface RuleNameStage {
        RuleDescriptionStage ruleName(@NotNull String ruleName);
    }

    public interface RuleDescriptionStage {
        RuleActionStage ruleDescription(@NotNull String ruleDescription);
    }

    public interface RuleActionStage {
        _FinalStage ruleAction(@NotNull RuleAction ruleAction);
    }

    public interface _FinalStage {
        HitRulesDetails build();

        _FinalStage ruleId(Optional<String> ruleId);

        _FinalStage ruleId(String ruleId);

        _FinalStage executedAt(Optional<Double> executedAt);

        _FinalStage executedAt(Double executedAt);

        _FinalStage ruleHitMeta(Optional<RuleHitMeta> ruleHitMeta);

        _FinalStage ruleHitMeta(RuleHitMeta ruleHitMeta);

        _FinalStage labels(Optional<List<RuleLabels>> labels);

        _FinalStage labels(List<RuleLabels> labels);

        _FinalStage nature(Optional<RuleNature> nature);

        _FinalStage nature(RuleNature nature);

        _FinalStage isShadow(Optional<Boolean> isShadow);

        _FinalStage isShadow(Boolean isShadow);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements RuleInstanceIdStage, RuleNameStage, RuleDescriptionStage, RuleActionStage, _FinalStage {
        private String ruleInstanceId;

        private String ruleName;

        private String ruleDescription;

        private RuleAction ruleAction;

        private Optional<Boolean> isShadow = Optional.empty();

        private Optional<RuleNature> nature = Optional.empty();

        private Optional<List<RuleLabels>> labels = Optional.empty();

        private Optional<RuleHitMeta> ruleHitMeta = Optional.empty();

        private Optional<Double> executedAt = Optional.empty();

        private Optional<String> ruleId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(HitRulesDetails other) {
            ruleId(other.getRuleId());
            ruleInstanceId(other.getRuleInstanceId());
            ruleName(other.getRuleName());
            ruleDescription(other.getRuleDescription());
            executedAt(other.getExecutedAt());
            ruleAction(other.getRuleAction());
            ruleHitMeta(other.getRuleHitMeta());
            labels(other.getLabels());
            nature(other.getNature());
            isShadow(other.getIsShadow());
            return this;
        }

        @java.lang.Override
        @JsonSetter("ruleInstanceId")
        public RuleNameStage ruleInstanceId(@NotNull String ruleInstanceId) {
            this.ruleInstanceId = Objects.requireNonNull(ruleInstanceId, "ruleInstanceId must not be null");
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
        public RuleActionStage ruleDescription(@NotNull String ruleDescription) {
            this.ruleDescription = Objects.requireNonNull(ruleDescription, "ruleDescription must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("ruleAction")
        public _FinalStage ruleAction(@NotNull RuleAction ruleAction) {
            this.ruleAction = Objects.requireNonNull(ruleAction, "ruleAction must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage isShadow(Boolean isShadow) {
            this.isShadow = Optional.ofNullable(isShadow);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "isShadow", nulls = Nulls.SKIP)
        public _FinalStage isShadow(Optional<Boolean> isShadow) {
            this.isShadow = isShadow;
            return this;
        }

        @java.lang.Override
        public _FinalStage nature(RuleNature nature) {
            this.nature = Optional.ofNullable(nature);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "nature", nulls = Nulls.SKIP)
        public _FinalStage nature(Optional<RuleNature> nature) {
            this.nature = nature;
            return this;
        }

        @java.lang.Override
        public _FinalStage labels(List<RuleLabels> labels) {
            this.labels = Optional.ofNullable(labels);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "labels", nulls = Nulls.SKIP)
        public _FinalStage labels(Optional<List<RuleLabels>> labels) {
            this.labels = labels;
            return this;
        }

        @java.lang.Override
        public _FinalStage ruleHitMeta(RuleHitMeta ruleHitMeta) {
            this.ruleHitMeta = Optional.ofNullable(ruleHitMeta);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "ruleHitMeta", nulls = Nulls.SKIP)
        public _FinalStage ruleHitMeta(Optional<RuleHitMeta> ruleHitMeta) {
            this.ruleHitMeta = ruleHitMeta;
            return this;
        }

        /**
         * <p>Timestamp when the rule was hit</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage executedAt(Double executedAt) {
            this.executedAt = Optional.ofNullable(executedAt);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "executedAt", nulls = Nulls.SKIP)
        public _FinalStage executedAt(Optional<Double> executedAt) {
            this.executedAt = executedAt;
            return this;
        }

        /**
         * <p>Unique rule identifier</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage ruleId(String ruleId) {
            this.ruleId = Optional.ofNullable(ruleId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "ruleId", nulls = Nulls.SKIP)
        public _FinalStage ruleId(Optional<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        @java.lang.Override
        public HitRulesDetails build() {
            return new HitRulesDetails(
                    ruleId,
                    ruleInstanceId,
                    ruleName,
                    ruleDescription,
                    executedAt,
                    ruleAction,
                    ruleHitMeta,
                    labels,
                    nature,
                    isShadow,
                    additionalProperties);
        }
    }
}
