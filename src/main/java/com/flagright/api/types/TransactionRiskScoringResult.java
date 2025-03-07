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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TransactionRiskScoringResult.Builder.class)
public final class TransactionRiskScoringResult {
    private final double trsScore;

    private final RiskLevel trsRiskLevel;

    private final Optional<Double> originUserCraRiskScore;

    private final Optional<Double> destinationUserCraRiskScore;

    private final Optional<RiskLevel> originUserCraRiskLevel;

    private final Optional<RiskLevel> destinationUserCraRiskLevel;

    private final Map<String, Object> additionalProperties;

    private TransactionRiskScoringResult(
            double trsScore,
            RiskLevel trsRiskLevel,
            Optional<Double> originUserCraRiskScore,
            Optional<Double> destinationUserCraRiskScore,
            Optional<RiskLevel> originUserCraRiskLevel,
            Optional<RiskLevel> destinationUserCraRiskLevel,
            Map<String, Object> additionalProperties) {
        this.trsScore = trsScore;
        this.trsRiskLevel = trsRiskLevel;
        this.originUserCraRiskScore = originUserCraRiskScore;
        this.destinationUserCraRiskScore = destinationUserCraRiskScore;
        this.originUserCraRiskLevel = originUserCraRiskLevel;
        this.destinationUserCraRiskLevel = destinationUserCraRiskLevel;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Transaction risk scoring score
     */
    @JsonProperty("trsScore")
    public double getTrsScore() {
        return trsScore;
    }

    @JsonProperty("trsRiskLevel")
    public RiskLevel getTrsRiskLevel() {
        return trsRiskLevel;
    }

    /**
     * @return Origin user's CRA risk score
     */
    @JsonProperty("originUserCraRiskScore")
    public Optional<Double> getOriginUserCraRiskScore() {
        return originUserCraRiskScore;
    }

    /**
     * @return Destination user's CRA risk score
     */
    @JsonProperty("destinationUserCraRiskScore")
    public Optional<Double> getDestinationUserCraRiskScore() {
        return destinationUserCraRiskScore;
    }

    @JsonProperty("originUserCraRiskLevel")
    public Optional<RiskLevel> getOriginUserCraRiskLevel() {
        return originUserCraRiskLevel;
    }

    @JsonProperty("destinationUserCraRiskLevel")
    public Optional<RiskLevel> getDestinationUserCraRiskLevel() {
        return destinationUserCraRiskLevel;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TransactionRiskScoringResult && equalTo((TransactionRiskScoringResult) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TransactionRiskScoringResult other) {
        return trsScore == other.trsScore
                && trsRiskLevel.equals(other.trsRiskLevel)
                && originUserCraRiskScore.equals(other.originUserCraRiskScore)
                && destinationUserCraRiskScore.equals(other.destinationUserCraRiskScore)
                && originUserCraRiskLevel.equals(other.originUserCraRiskLevel)
                && destinationUserCraRiskLevel.equals(other.destinationUserCraRiskLevel);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.trsScore,
                this.trsRiskLevel,
                this.originUserCraRiskScore,
                this.destinationUserCraRiskScore,
                this.originUserCraRiskLevel,
                this.destinationUserCraRiskLevel);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TrsScoreStage builder() {
        return new Builder();
    }

    public interface TrsScoreStage {
        TrsRiskLevelStage trsScore(double trsScore);

        Builder from(TransactionRiskScoringResult other);
    }

    public interface TrsRiskLevelStage {
        _FinalStage trsRiskLevel(@NotNull RiskLevel trsRiskLevel);
    }

    public interface _FinalStage {
        TransactionRiskScoringResult build();

        _FinalStage originUserCraRiskScore(Optional<Double> originUserCraRiskScore);

        _FinalStage originUserCraRiskScore(Double originUserCraRiskScore);

        _FinalStage destinationUserCraRiskScore(Optional<Double> destinationUserCraRiskScore);

        _FinalStage destinationUserCraRiskScore(Double destinationUserCraRiskScore);

        _FinalStage originUserCraRiskLevel(Optional<RiskLevel> originUserCraRiskLevel);

        _FinalStage originUserCraRiskLevel(RiskLevel originUserCraRiskLevel);

        _FinalStage destinationUserCraRiskLevel(Optional<RiskLevel> destinationUserCraRiskLevel);

        _FinalStage destinationUserCraRiskLevel(RiskLevel destinationUserCraRiskLevel);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TrsScoreStage, TrsRiskLevelStage, _FinalStage {
        private double trsScore;

        private RiskLevel trsRiskLevel;

        private Optional<RiskLevel> destinationUserCraRiskLevel = Optional.empty();

        private Optional<RiskLevel> originUserCraRiskLevel = Optional.empty();

        private Optional<Double> destinationUserCraRiskScore = Optional.empty();

        private Optional<Double> originUserCraRiskScore = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TransactionRiskScoringResult other) {
            trsScore(other.getTrsScore());
            trsRiskLevel(other.getTrsRiskLevel());
            originUserCraRiskScore(other.getOriginUserCraRiskScore());
            destinationUserCraRiskScore(other.getDestinationUserCraRiskScore());
            originUserCraRiskLevel(other.getOriginUserCraRiskLevel());
            destinationUserCraRiskLevel(other.getDestinationUserCraRiskLevel());
            return this;
        }

        /**
         * <p>Transaction risk scoring score</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("trsScore")
        public TrsRiskLevelStage trsScore(double trsScore) {
            this.trsScore = trsScore;
            return this;
        }

        @java.lang.Override
        @JsonSetter("trsRiskLevel")
        public _FinalStage trsRiskLevel(@NotNull RiskLevel trsRiskLevel) {
            this.trsRiskLevel = Objects.requireNonNull(trsRiskLevel, "trsRiskLevel must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage destinationUserCraRiskLevel(RiskLevel destinationUserCraRiskLevel) {
            this.destinationUserCraRiskLevel = Optional.ofNullable(destinationUserCraRiskLevel);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "destinationUserCraRiskLevel", nulls = Nulls.SKIP)
        public _FinalStage destinationUserCraRiskLevel(Optional<RiskLevel> destinationUserCraRiskLevel) {
            this.destinationUserCraRiskLevel = destinationUserCraRiskLevel;
            return this;
        }

        @java.lang.Override
        public _FinalStage originUserCraRiskLevel(RiskLevel originUserCraRiskLevel) {
            this.originUserCraRiskLevel = Optional.ofNullable(originUserCraRiskLevel);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "originUserCraRiskLevel", nulls = Nulls.SKIP)
        public _FinalStage originUserCraRiskLevel(Optional<RiskLevel> originUserCraRiskLevel) {
            this.originUserCraRiskLevel = originUserCraRiskLevel;
            return this;
        }

        /**
         * <p>Destination user's CRA risk score</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage destinationUserCraRiskScore(Double destinationUserCraRiskScore) {
            this.destinationUserCraRiskScore = Optional.ofNullable(destinationUserCraRiskScore);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "destinationUserCraRiskScore", nulls = Nulls.SKIP)
        public _FinalStage destinationUserCraRiskScore(Optional<Double> destinationUserCraRiskScore) {
            this.destinationUserCraRiskScore = destinationUserCraRiskScore;
            return this;
        }

        /**
         * <p>Origin user's CRA risk score</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage originUserCraRiskScore(Double originUserCraRiskScore) {
            this.originUserCraRiskScore = Optional.ofNullable(originUserCraRiskScore);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "originUserCraRiskScore", nulls = Nulls.SKIP)
        public _FinalStage originUserCraRiskScore(Optional<Double> originUserCraRiskScore) {
            this.originUserCraRiskScore = originUserCraRiskScore;
            return this;
        }

        @java.lang.Override
        public TransactionRiskScoringResult build() {
            return new TransactionRiskScoringResult(
                    trsScore,
                    trsRiskLevel,
                    originUserCraRiskScore,
                    destinationUserCraRiskScore,
                    originUserCraRiskLevel,
                    destinationUserCraRiskLevel,
                    additionalProperties);
        }
    }
}
