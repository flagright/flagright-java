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
@JsonDeserialize(builder = ConsumerUserEvent.Builder.class)
public final class ConsumerUserEvent {
    private final double timestamp;

    private final String userId;

    private final Optional<String> eventId;

    private final Optional<String> reason;

    private final Optional<String> eventDescription;

    private final Optional<UserOptional> updatedConsumerUserAttributes;

    private final Optional<Double> updateCount;

    private final Map<String, Object> additionalProperties;

    private ConsumerUserEvent(
            double timestamp,
            String userId,
            Optional<String> eventId,
            Optional<String> reason,
            Optional<String> eventDescription,
            Optional<UserOptional> updatedConsumerUserAttributes,
            Optional<Double> updateCount,
            Map<String, Object> additionalProperties) {
        this.timestamp = timestamp;
        this.userId = userId;
        this.eventId = eventId;
        this.reason = reason;
        this.eventDescription = eventDescription;
        this.updatedConsumerUserAttributes = updatedConsumerUserAttributes;
        this.updateCount = updateCount;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Timestamp of the event
     */
    @JsonProperty("timestamp")
    public double getTimestamp() {
        return timestamp;
    }

    /**
     * @return Transaction ID the event pertains to
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * @return Unique event ID
     */
    @JsonProperty("eventId")
    public Optional<String> getEventId() {
        return eventId;
    }

    /**
     * @return Reason for the event or a state change
     */
    @JsonProperty("reason")
    public Optional<String> getReason() {
        return reason;
    }

    /**
     * @return Event description
     */
    @JsonProperty("eventDescription")
    public Optional<String> getEventDescription() {
        return eventDescription;
    }

    @JsonProperty("updatedConsumerUserAttributes")
    public Optional<UserOptional> getUpdatedConsumerUserAttributes() {
        return updatedConsumerUserAttributes;
    }

    @JsonProperty("updateCount")
    public Optional<Double> getUpdateCount() {
        return updateCount;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConsumerUserEvent && equalTo((ConsumerUserEvent) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ConsumerUserEvent other) {
        return timestamp == other.timestamp
                && userId.equals(other.userId)
                && eventId.equals(other.eventId)
                && reason.equals(other.reason)
                && eventDescription.equals(other.eventDescription)
                && updatedConsumerUserAttributes.equals(other.updatedConsumerUserAttributes)
                && updateCount.equals(other.updateCount);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.timestamp,
                this.userId,
                this.eventId,
                this.reason,
                this.eventDescription,
                this.updatedConsumerUserAttributes,
                this.updateCount);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TimestampStage builder() {
        return new Builder();
    }

    public interface TimestampStage {
        UserIdStage timestamp(double timestamp);

        Builder from(ConsumerUserEvent other);
    }

    public interface UserIdStage {
        _FinalStage userId(@NotNull String userId);
    }

    public interface _FinalStage {
        ConsumerUserEvent build();

        _FinalStage eventId(Optional<String> eventId);

        _FinalStage eventId(String eventId);

        _FinalStage reason(Optional<String> reason);

        _FinalStage reason(String reason);

        _FinalStage eventDescription(Optional<String> eventDescription);

        _FinalStage eventDescription(String eventDescription);

        _FinalStage updatedConsumerUserAttributes(Optional<UserOptional> updatedConsumerUserAttributes);

        _FinalStage updatedConsumerUserAttributes(UserOptional updatedConsumerUserAttributes);

        _FinalStage updateCount(Optional<Double> updateCount);

        _FinalStage updateCount(Double updateCount);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TimestampStage, UserIdStage, _FinalStage {
        private double timestamp;

        private String userId;

        private Optional<Double> updateCount = Optional.empty();

        private Optional<UserOptional> updatedConsumerUserAttributes = Optional.empty();

        private Optional<String> eventDescription = Optional.empty();

        private Optional<String> reason = Optional.empty();

        private Optional<String> eventId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ConsumerUserEvent other) {
            timestamp(other.getTimestamp());
            userId(other.getUserId());
            eventId(other.getEventId());
            reason(other.getReason());
            eventDescription(other.getEventDescription());
            updatedConsumerUserAttributes(other.getUpdatedConsumerUserAttributes());
            updateCount(other.getUpdateCount());
            return this;
        }

        /**
         * <p>Timestamp of the event</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("timestamp")
        public UserIdStage timestamp(double timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>Transaction ID the event pertains to</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("userId")
        public _FinalStage userId(@NotNull String userId) {
            this.userId = Objects.requireNonNull(userId, "userId must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage updateCount(Double updateCount) {
            this.updateCount = Optional.ofNullable(updateCount);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "updateCount", nulls = Nulls.SKIP)
        public _FinalStage updateCount(Optional<Double> updateCount) {
            this.updateCount = updateCount;
            return this;
        }

        @java.lang.Override
        public _FinalStage updatedConsumerUserAttributes(UserOptional updatedConsumerUserAttributes) {
            this.updatedConsumerUserAttributes = Optional.ofNullable(updatedConsumerUserAttributes);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "updatedConsumerUserAttributes", nulls = Nulls.SKIP)
        public _FinalStage updatedConsumerUserAttributes(Optional<UserOptional> updatedConsumerUserAttributes) {
            this.updatedConsumerUserAttributes = updatedConsumerUserAttributes;
            return this;
        }

        /**
         * <p>Event description</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage eventDescription(String eventDescription) {
            this.eventDescription = Optional.ofNullable(eventDescription);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "eventDescription", nulls = Nulls.SKIP)
        public _FinalStage eventDescription(Optional<String> eventDescription) {
            this.eventDescription = eventDescription;
            return this;
        }

        /**
         * <p>Reason for the event or a state change</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage reason(String reason) {
            this.reason = Optional.ofNullable(reason);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "reason", nulls = Nulls.SKIP)
        public _FinalStage reason(Optional<String> reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>Unique event ID</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage eventId(String eventId) {
            this.eventId = Optional.ofNullable(eventId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "eventId", nulls = Nulls.SKIP)
        public _FinalStage eventId(Optional<String> eventId) {
            this.eventId = eventId;
            return this;
        }

        @java.lang.Override
        public ConsumerUserEvent build() {
            return new ConsumerUserEvent(
                    timestamp,
                    userId,
                    eventId,
                    reason,
                    eventDescription,
                    updatedConsumerUserAttributes,
                    updateCount,
                    additionalProperties);
        }
    }
}
