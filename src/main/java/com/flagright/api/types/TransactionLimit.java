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
@JsonDeserialize(builder = TransactionLimit.Builder.class)
public final class TransactionLimit {
    private final Optional<TransactionCountLimit> transactionCountLimit;

    private final Optional<TransactionAmountLimit> transactionAmountLimit;

    private final Optional<TransactionAmountLimit> averageTransactionAmountLimit;

    private final Map<String, Object> additionalProperties;

    private TransactionLimit(
            Optional<TransactionCountLimit> transactionCountLimit,
            Optional<TransactionAmountLimit> transactionAmountLimit,
            Optional<TransactionAmountLimit> averageTransactionAmountLimit,
            Map<String, Object> additionalProperties) {
        this.transactionCountLimit = transactionCountLimit;
        this.transactionAmountLimit = transactionAmountLimit;
        this.averageTransactionAmountLimit = averageTransactionAmountLimit;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("transactionCountLimit")
    public Optional<TransactionCountLimit> getTransactionCountLimit() {
        return transactionCountLimit;
    }

    @JsonProperty("transactionAmountLimit")
    public Optional<TransactionAmountLimit> getTransactionAmountLimit() {
        return transactionAmountLimit;
    }

    @JsonProperty("averageTransactionAmountLimit")
    public Optional<TransactionAmountLimit> getAverageTransactionAmountLimit() {
        return averageTransactionAmountLimit;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TransactionLimit && equalTo((TransactionLimit) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TransactionLimit other) {
        return transactionCountLimit.equals(other.transactionCountLimit)
                && transactionAmountLimit.equals(other.transactionAmountLimit)
                && averageTransactionAmountLimit.equals(other.averageTransactionAmountLimit);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.transactionCountLimit, this.transactionAmountLimit, this.averageTransactionAmountLimit);
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
        private Optional<TransactionCountLimit> transactionCountLimit = Optional.empty();

        private Optional<TransactionAmountLimit> transactionAmountLimit = Optional.empty();

        private Optional<TransactionAmountLimit> averageTransactionAmountLimit = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TransactionLimit other) {
            transactionCountLimit(other.getTransactionCountLimit());
            transactionAmountLimit(other.getTransactionAmountLimit());
            averageTransactionAmountLimit(other.getAverageTransactionAmountLimit());
            return this;
        }

        @JsonSetter(value = "transactionCountLimit", nulls = Nulls.SKIP)
        public Builder transactionCountLimit(Optional<TransactionCountLimit> transactionCountLimit) {
            this.transactionCountLimit = transactionCountLimit;
            return this;
        }

        public Builder transactionCountLimit(TransactionCountLimit transactionCountLimit) {
            this.transactionCountLimit = Optional.ofNullable(transactionCountLimit);
            return this;
        }

        @JsonSetter(value = "transactionAmountLimit", nulls = Nulls.SKIP)
        public Builder transactionAmountLimit(Optional<TransactionAmountLimit> transactionAmountLimit) {
            this.transactionAmountLimit = transactionAmountLimit;
            return this;
        }

        public Builder transactionAmountLimit(TransactionAmountLimit transactionAmountLimit) {
            this.transactionAmountLimit = Optional.ofNullable(transactionAmountLimit);
            return this;
        }

        @JsonSetter(value = "averageTransactionAmountLimit", nulls = Nulls.SKIP)
        public Builder averageTransactionAmountLimit(Optional<TransactionAmountLimit> averageTransactionAmountLimit) {
            this.averageTransactionAmountLimit = averageTransactionAmountLimit;
            return this;
        }

        public Builder averageTransactionAmountLimit(TransactionAmountLimit averageTransactionAmountLimit) {
            this.averageTransactionAmountLimit = Optional.ofNullable(averageTransactionAmountLimit);
            return this;
        }

        public TransactionLimit build() {
            return new TransactionLimit(
                    transactionCountLimit, transactionAmountLimit, averageTransactionAmountLimit, additionalProperties);
        }
    }
}
