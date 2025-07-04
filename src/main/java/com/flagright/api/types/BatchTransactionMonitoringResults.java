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
@JsonDeserialize(builder = BatchTransactionMonitoringResults.Builder.class)
public final class BatchTransactionMonitoringResults {
    private final List<BatchTransactionMonitoringResult> transactions;

    private final double totalCount;

    private final Map<String, Object> additionalProperties;

    private BatchTransactionMonitoringResults(
            List<BatchTransactionMonitoringResult> transactions,
            double totalCount,
            Map<String, Object> additionalProperties) {
        this.transactions = transactions;
        this.totalCount = totalCount;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("transactions")
    public List<BatchTransactionMonitoringResult> getTransactions() {
        return transactions;
    }

    @JsonProperty("totalCount")
    public double getTotalCount() {
        return totalCount;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BatchTransactionMonitoringResults && equalTo((BatchTransactionMonitoringResults) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BatchTransactionMonitoringResults other) {
        return transactions.equals(other.transactions) && totalCount == other.totalCount;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.transactions, this.totalCount);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TotalCountStage builder() {
        return new Builder();
    }

    public interface TotalCountStage {
        _FinalStage totalCount(double totalCount);

        Builder from(BatchTransactionMonitoringResults other);
    }

    public interface _FinalStage {
        BatchTransactionMonitoringResults build();

        _FinalStage transactions(List<BatchTransactionMonitoringResult> transactions);

        _FinalStage addTransactions(BatchTransactionMonitoringResult transactions);

        _FinalStage addAllTransactions(List<BatchTransactionMonitoringResult> transactions);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TotalCountStage, _FinalStage {
        private double totalCount;

        private List<BatchTransactionMonitoringResult> transactions = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(BatchTransactionMonitoringResults other) {
            transactions(other.getTransactions());
            totalCount(other.getTotalCount());
            return this;
        }

        @java.lang.Override
        @JsonSetter("totalCount")
        public _FinalStage totalCount(double totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllTransactions(List<BatchTransactionMonitoringResult> transactions) {
            this.transactions.addAll(transactions);
            return this;
        }

        @java.lang.Override
        public _FinalStage addTransactions(BatchTransactionMonitoringResult transactions) {
            this.transactions.add(transactions);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "transactions", nulls = Nulls.SKIP)
        public _FinalStage transactions(List<BatchTransactionMonitoringResult> transactions) {
            this.transactions.clear();
            this.transactions.addAll(transactions);
            return this;
        }

        @java.lang.Override
        public BatchTransactionMonitoringResults build() {
            return new BatchTransactionMonitoringResults(transactions, totalCount, additionalProperties);
        }
    }
}
