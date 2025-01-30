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
@JsonDeserialize(builder = CaseManagementEvent.Builder.class)
public final class CaseManagementEvent {
    private final CaseManagementEventCaseStatus caseStatus;

    private final double timestamp;

    private final CaseManagementEventCaseStatusReason caseStatusReason;

    private final Optional<String> transactionId;

    private final Optional<String> userId;

    private final Optional<String> eventId;

    private final Optional<String> caseStatusReasonDescription;

    private final Map<String, Object> additionalProperties;

    private CaseManagementEvent(
            CaseManagementEventCaseStatus caseStatus,
            double timestamp,
            CaseManagementEventCaseStatusReason caseStatusReason,
            Optional<String> transactionId,
            Optional<String> userId,
            Optional<String> eventId,
            Optional<String> caseStatusReasonDescription,
            Map<String, Object> additionalProperties) {
        this.caseStatus = caseStatus;
        this.timestamp = timestamp;
        this.caseStatusReason = caseStatusReason;
        this.transactionId = transactionId;
        this.userId = userId;
        this.eventId = eventId;
        this.caseStatusReasonDescription = caseStatusReasonDescription;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Status of a case. E.g. Open, Closed etc.
     */
    @JsonProperty("caseStatus")
    public CaseManagementEventCaseStatus getCaseStatus() {
        return caseStatus;
    }

    /**
     * @return Timestamp of the event
     */
    @JsonProperty("timestamp")
    public double getTimestamp() {
        return timestamp;
    }

    /**
     * @return Case status reason. E.g. Closed &amp; False Positive, Closed &amp; Investigation Completed etc.
     */
    @JsonProperty("caseStatusReason")
    public CaseManagementEventCaseStatusReason getCaseStatusReason() {
        return caseStatusReason;
    }

    /**
     * @return Transaction ID the case pertains to
     */
    @JsonProperty("transactionId")
    public Optional<String> getTransactionId() {
        return transactionId;
    }

    /**
     * @return User ID the case pertains to
     */
    @JsonProperty("userId")
    public Optional<String> getUserId() {
        return userId;
    }

    /**
     * @return Event ID the case pertains to
     */
    @JsonProperty("eventId")
    public Optional<String> getEventId() {
        return eventId;
    }

    /**
     * @return Case status reason description
     */
    @JsonProperty("caseStatusReasonDescription")
    public Optional<String> getCaseStatusReasonDescription() {
        return caseStatusReasonDescription;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CaseManagementEvent && equalTo((CaseManagementEvent) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CaseManagementEvent other) {
        return caseStatus.equals(other.caseStatus)
                && timestamp == other.timestamp
                && caseStatusReason.equals(other.caseStatusReason)
                && transactionId.equals(other.transactionId)
                && userId.equals(other.userId)
                && eventId.equals(other.eventId)
                && caseStatusReasonDescription.equals(other.caseStatusReasonDescription);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.caseStatus,
                this.timestamp,
                this.caseStatusReason,
                this.transactionId,
                this.userId,
                this.eventId,
                this.caseStatusReasonDescription);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CaseStatusStage builder() {
        return new Builder();
    }

    public interface CaseStatusStage {
        TimestampStage caseStatus(@NotNull CaseManagementEventCaseStatus caseStatus);

        Builder from(CaseManagementEvent other);
    }

    public interface TimestampStage {
        CaseStatusReasonStage timestamp(double timestamp);
    }

    public interface CaseStatusReasonStage {
        _FinalStage caseStatusReason(@NotNull CaseManagementEventCaseStatusReason caseStatusReason);
    }

    public interface _FinalStage {
        CaseManagementEvent build();

        _FinalStage transactionId(Optional<String> transactionId);

        _FinalStage transactionId(String transactionId);

        _FinalStage userId(Optional<String> userId);

        _FinalStage userId(String userId);

        _FinalStage eventId(Optional<String> eventId);

        _FinalStage eventId(String eventId);

        _FinalStage caseStatusReasonDescription(Optional<String> caseStatusReasonDescription);

        _FinalStage caseStatusReasonDescription(String caseStatusReasonDescription);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CaseStatusStage, TimestampStage, CaseStatusReasonStage, _FinalStage {
        private CaseManagementEventCaseStatus caseStatus;

        private double timestamp;

        private CaseManagementEventCaseStatusReason caseStatusReason;

        private Optional<String> caseStatusReasonDescription = Optional.empty();

        private Optional<String> eventId = Optional.empty();

        private Optional<String> userId = Optional.empty();

        private Optional<String> transactionId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CaseManagementEvent other) {
            caseStatus(other.getCaseStatus());
            timestamp(other.getTimestamp());
            caseStatusReason(other.getCaseStatusReason());
            transactionId(other.getTransactionId());
            userId(other.getUserId());
            eventId(other.getEventId());
            caseStatusReasonDescription(other.getCaseStatusReasonDescription());
            return this;
        }

        /**
         * <p>Status of a case. E.g. Open, Closed etc.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("caseStatus")
        public TimestampStage caseStatus(@NotNull CaseManagementEventCaseStatus caseStatus) {
            this.caseStatus = Objects.requireNonNull(caseStatus, "caseStatus must not be null");
            return this;
        }

        /**
         * <p>Timestamp of the event</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("timestamp")
        public CaseStatusReasonStage timestamp(double timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>Case status reason. E.g. Closed &amp; False Positive, Closed &amp; Investigation Completed etc.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("caseStatusReason")
        public _FinalStage caseStatusReason(@NotNull CaseManagementEventCaseStatusReason caseStatusReason) {
            this.caseStatusReason = Objects.requireNonNull(caseStatusReason, "caseStatusReason must not be null");
            return this;
        }

        /**
         * <p>Case status reason description</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage caseStatusReasonDescription(String caseStatusReasonDescription) {
            this.caseStatusReasonDescription = Optional.ofNullable(caseStatusReasonDescription);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "caseStatusReasonDescription", nulls = Nulls.SKIP)
        public _FinalStage caseStatusReasonDescription(Optional<String> caseStatusReasonDescription) {
            this.caseStatusReasonDescription = caseStatusReasonDescription;
            return this;
        }

        /**
         * <p>Event ID the case pertains to</p>
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

        /**
         * <p>User ID the case pertains to</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage userId(String userId) {
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "userId", nulls = Nulls.SKIP)
        public _FinalStage userId(Optional<String> userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>Transaction ID the case pertains to</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage transactionId(String transactionId) {
            this.transactionId = Optional.ofNullable(transactionId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "transactionId", nulls = Nulls.SKIP)
        public _FinalStage transactionId(Optional<String> transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        @java.lang.Override
        public CaseManagementEvent build() {
            return new CaseManagementEvent(
                    caseStatus,
                    timestamp,
                    caseStatusReason,
                    transactionId,
                    userId,
                    eventId,
                    caseStatusReasonDescription,
                    additionalProperties);
        }
    }
}
