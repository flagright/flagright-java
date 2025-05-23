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
@JsonDeserialize(builder = TransactionBase.Builder.class)
public final class TransactionBase {
    private final String type;

    private final String transactionId;

    private final double timestamp;

    private final Optional<String> originUserId;

    private final Optional<String> destinationUserId;

    private final Map<String, Object> additionalProperties;

    private TransactionBase(
            String type,
            String transactionId,
            double timestamp,
            Optional<String> originUserId,
            Optional<String> destinationUserId,
            Map<String, Object> additionalProperties) {
        this.type = type;
        this.transactionId = transactionId;
        this.timestamp = timestamp;
        this.originUserId = originUserId;
        this.destinationUserId = destinationUserId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Type of transaction (ex: DEPOSIT, WITHDRAWAL, TRANSFER, EXTERNAL_PAYMENT, REFUND, OTHER)
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * @return Unique transaction identifier
     */
    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * @return Timestamp of when transaction took place
     */
    @JsonProperty("timestamp")
    public double getTimestamp() {
        return timestamp;
    }

    /**
     * @return UserId for where the transaction originates from
     */
    @JsonProperty("originUserId")
    public Optional<String> getOriginUserId() {
        return originUserId;
    }

    /**
     * @return UserId for transaction's destination. In other words, where the value is being transferred to.
     */
    @JsonProperty("destinationUserId")
    public Optional<String> getDestinationUserId() {
        return destinationUserId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TransactionBase && equalTo((TransactionBase) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TransactionBase other) {
        return type.equals(other.type)
                && transactionId.equals(other.transactionId)
                && timestamp == other.timestamp
                && originUserId.equals(other.originUserId)
                && destinationUserId.equals(other.destinationUserId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.type, this.transactionId, this.timestamp, this.originUserId, this.destinationUserId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        TransactionIdStage type(@NotNull String type);

        Builder from(TransactionBase other);
    }

    public interface TransactionIdStage {
        TimestampStage transactionId(@NotNull String transactionId);
    }

    public interface TimestampStage {
        _FinalStage timestamp(double timestamp);
    }

    public interface _FinalStage {
        TransactionBase build();

        _FinalStage originUserId(Optional<String> originUserId);

        _FinalStage originUserId(String originUserId);

        _FinalStage destinationUserId(Optional<String> destinationUserId);

        _FinalStage destinationUserId(String destinationUserId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TypeStage, TransactionIdStage, TimestampStage, _FinalStage {
        private String type;

        private String transactionId;

        private double timestamp;

        private Optional<String> destinationUserId = Optional.empty();

        private Optional<String> originUserId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TransactionBase other) {
            type(other.getType());
            transactionId(other.getTransactionId());
            timestamp(other.getTimestamp());
            originUserId(other.getOriginUserId());
            destinationUserId(other.getDestinationUserId());
            return this;
        }

        /**
         * <p>Type of transaction (ex: DEPOSIT, WITHDRAWAL, TRANSFER, EXTERNAL_PAYMENT, REFUND, OTHER)</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("type")
        public TransactionIdStage type(@NotNull String type) {
            this.type = Objects.requireNonNull(type, "type must not be null");
            return this;
        }

        /**
         * <p>Unique transaction identifier</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("transactionId")
        public TimestampStage transactionId(@NotNull String transactionId) {
            this.transactionId = Objects.requireNonNull(transactionId, "transactionId must not be null");
            return this;
        }

        /**
         * <p>Timestamp of when transaction took place</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("timestamp")
        public _FinalStage timestamp(double timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>UserId for transaction's destination. In other words, where the value is being transferred to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage destinationUserId(String destinationUserId) {
            this.destinationUserId = Optional.ofNullable(destinationUserId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "destinationUserId", nulls = Nulls.SKIP)
        public _FinalStage destinationUserId(Optional<String> destinationUserId) {
            this.destinationUserId = destinationUserId;
            return this;
        }

        /**
         * <p>UserId for where the transaction originates from</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage originUserId(String originUserId) {
            this.originUserId = Optional.ofNullable(originUserId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "originUserId", nulls = Nulls.SKIP)
        public _FinalStage originUserId(Optional<String> originUserId) {
            this.originUserId = originUserId;
            return this;
        }

        @java.lang.Override
        public TransactionBase build() {
            return new TransactionBase(
                    type, transactionId, timestamp, originUserId, destinationUserId, additionalProperties);
        }
    }
}
