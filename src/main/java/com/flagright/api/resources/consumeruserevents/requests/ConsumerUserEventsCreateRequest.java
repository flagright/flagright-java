/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flagright.api.resources.consumeruserevents.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flagright.api.core.ObjectMappers;
import com.flagright.api.types.BooleanString;
import com.flagright.api.types.ConsumerUserEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ConsumerUserEventsCreateRequest.Builder.class)
public final class ConsumerUserEventsCreateRequest {
    private final Optional<BooleanString> allowUserTypeConversion;

    private final Optional<BooleanString> lockKycRiskLevel;

    private final Optional<BooleanString> lockCraRiskLevel;

    private final ConsumerUserEvent body;

    private final Map<String, Object> additionalProperties;

    private ConsumerUserEventsCreateRequest(
            Optional<BooleanString> allowUserTypeConversion,
            Optional<BooleanString> lockKycRiskLevel,
            Optional<BooleanString> lockCraRiskLevel,
            ConsumerUserEvent body,
            Map<String, Object> additionalProperties) {
        this.allowUserTypeConversion = allowUserTypeConversion;
        this.lockKycRiskLevel = lockKycRiskLevel;
        this.lockCraRiskLevel = lockCraRiskLevel;
        this.body = body;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Boolean string whether Flagright should allow a Consumer user event to be applied to a Business user with the same user ID. This will converts a Business user to a Consumer user.
     */
    @JsonProperty("allowUserTypeConversion")
    public Optional<BooleanString> getAllowUserTypeConversion() {
        return allowUserTypeConversion;
    }

    /**
     * @return Boolean string whether Flagright should lock the KYC risk level for the user.
     */
    @JsonProperty("lockKycRiskLevel")
    public Optional<BooleanString> getLockKycRiskLevel() {
        return lockKycRiskLevel;
    }

    /**
     * @return Boolean string whether Flagright should lock the CRA risk level for the user.
     */
    @JsonProperty("lockCraRiskLevel")
    public Optional<BooleanString> getLockCraRiskLevel() {
        return lockCraRiskLevel;
    }

    @JsonProperty("body")
    public ConsumerUserEvent getBody() {
        return body;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConsumerUserEventsCreateRequest && equalTo((ConsumerUserEventsCreateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ConsumerUserEventsCreateRequest other) {
        return allowUserTypeConversion.equals(other.allowUserTypeConversion)
                && lockKycRiskLevel.equals(other.lockKycRiskLevel)
                && lockCraRiskLevel.equals(other.lockCraRiskLevel)
                && body.equals(other.body);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.allowUserTypeConversion, this.lockKycRiskLevel, this.lockCraRiskLevel, this.body);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static BodyStage builder() {
        return new Builder();
    }

    public interface BodyStage {
        _FinalStage body(@NotNull ConsumerUserEvent body);

        Builder from(ConsumerUserEventsCreateRequest other);
    }

    public interface _FinalStage {
        ConsumerUserEventsCreateRequest build();

        _FinalStage allowUserTypeConversion(Optional<BooleanString> allowUserTypeConversion);

        _FinalStage allowUserTypeConversion(BooleanString allowUserTypeConversion);

        _FinalStage lockKycRiskLevel(Optional<BooleanString> lockKycRiskLevel);

        _FinalStage lockKycRiskLevel(BooleanString lockKycRiskLevel);

        _FinalStage lockCraRiskLevel(Optional<BooleanString> lockCraRiskLevel);

        _FinalStage lockCraRiskLevel(BooleanString lockCraRiskLevel);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements BodyStage, _FinalStage {
        private ConsumerUserEvent body;

        private Optional<BooleanString> lockCraRiskLevel = Optional.empty();

        private Optional<BooleanString> lockKycRiskLevel = Optional.empty();

        private Optional<BooleanString> allowUserTypeConversion = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ConsumerUserEventsCreateRequest other) {
            allowUserTypeConversion(other.getAllowUserTypeConversion());
            lockKycRiskLevel(other.getLockKycRiskLevel());
            lockCraRiskLevel(other.getLockCraRiskLevel());
            body(other.getBody());
            return this;
        }

        @java.lang.Override
        @JsonSetter("body")
        public _FinalStage body(@NotNull ConsumerUserEvent body) {
            this.body = Objects.requireNonNull(body, "body must not be null");
            return this;
        }

        /**
         * <p>Boolean string whether Flagright should lock the CRA risk level for the user.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage lockCraRiskLevel(BooleanString lockCraRiskLevel) {
            this.lockCraRiskLevel = Optional.ofNullable(lockCraRiskLevel);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "lockCraRiskLevel", nulls = Nulls.SKIP)
        public _FinalStage lockCraRiskLevel(Optional<BooleanString> lockCraRiskLevel) {
            this.lockCraRiskLevel = lockCraRiskLevel;
            return this;
        }

        /**
         * <p>Boolean string whether Flagright should lock the KYC risk level for the user.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage lockKycRiskLevel(BooleanString lockKycRiskLevel) {
            this.lockKycRiskLevel = Optional.ofNullable(lockKycRiskLevel);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "lockKycRiskLevel", nulls = Nulls.SKIP)
        public _FinalStage lockKycRiskLevel(Optional<BooleanString> lockKycRiskLevel) {
            this.lockKycRiskLevel = lockKycRiskLevel;
            return this;
        }

        /**
         * <p>Boolean string whether Flagright should allow a Consumer user event to be applied to a Business user with the same user ID. This will converts a Business user to a Consumer user.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage allowUserTypeConversion(BooleanString allowUserTypeConversion) {
            this.allowUserTypeConversion = Optional.ofNullable(allowUserTypeConversion);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "allowUserTypeConversion", nulls = Nulls.SKIP)
        public _FinalStage allowUserTypeConversion(Optional<BooleanString> allowUserTypeConversion) {
            this.allowUserTypeConversion = allowUserTypeConversion;
            return this;
        }

        @java.lang.Override
        public ConsumerUserEventsCreateRequest build() {
            return new ConsumerUserEventsCreateRequest(
                    allowUserTypeConversion, lockKycRiskLevel, lockCraRiskLevel, body, additionalProperties);
        }
    }
}
