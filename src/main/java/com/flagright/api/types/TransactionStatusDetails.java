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
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TransactionStatusDetails.Builder.class)
public final class TransactionStatusDetails {
    private final String transactionId;

    private final List<String> reasons;

    private final RuleAction status;

    private final Optional<String> comment;

    private final Map<String, Object> additionalProperties;

    private TransactionStatusDetails(
            String transactionId,
            List<String> reasons,
            RuleAction status,
            Optional<String> comment,
            Map<String, Object> additionalProperties) {
        this.transactionId = transactionId;
        this.reasons = reasons;
        this.status = status;
        this.comment = comment;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("reasons")
    public List<String> getReasons() {
        return reasons;
    }

    @JsonProperty("status")
    public RuleAction getStatus() {
        return status;
    }

    @JsonProperty("comment")
    public Optional<String> getComment() {
        return comment;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TransactionStatusDetails && equalTo((TransactionStatusDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TransactionStatusDetails other) {
        return transactionId.equals(other.transactionId)
                && reasons.equals(other.reasons)
                && status.equals(other.status)
                && comment.equals(other.comment);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.transactionId, this.reasons, this.status, this.comment);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TransactionIdStage builder() {
        return new Builder();
    }

    public interface TransactionIdStage {
        StatusStage transactionId(@NotNull String transactionId);

        Builder from(TransactionStatusDetails other);
    }

    public interface StatusStage {
        _FinalStage status(@NotNull RuleAction status);
    }

    public interface _FinalStage {
        TransactionStatusDetails build();

        _FinalStage reasons(List<String> reasons);

        _FinalStage addReasons(String reasons);

        _FinalStage addAllReasons(List<String> reasons);

        _FinalStage comment(Optional<String> comment);

        _FinalStage comment(String comment);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TransactionIdStage, StatusStage, _FinalStage {
        private String transactionId;

        private RuleAction status;

        private Optional<String> comment = Optional.empty();

        private List<String> reasons = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TransactionStatusDetails other) {
            transactionId(other.getTransactionId());
            reasons(other.getReasons());
            status(other.getStatus());
            comment(other.getComment());
            return this;
        }

        @java.lang.Override
        @JsonSetter("transactionId")
        public StatusStage transactionId(@NotNull String transactionId) {
            this.transactionId = Objects.requireNonNull(transactionId, "transactionId must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("status")
        public _FinalStage status(@NotNull RuleAction status) {
            this.status = Objects.requireNonNull(status, "status must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage comment(String comment) {
            this.comment = Optional.ofNullable(comment);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "comment", nulls = Nulls.SKIP)
        public _FinalStage comment(Optional<String> comment) {
            this.comment = comment;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllReasons(List<String> reasons) {
            this.reasons.addAll(reasons);
            return this;
        }

        @java.lang.Override
        public _FinalStage addReasons(String reasons) {
            this.reasons.add(reasons);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "reasons", nulls = Nulls.SKIP)
        public _FinalStage reasons(List<String> reasons) {
            this.reasons.clear();
            this.reasons.addAll(reasons);
            return this;
        }

        @java.lang.Override
        public TransactionStatusDetails build() {
            return new TransactionStatusDetails(transactionId, reasons, status, comment, additionalProperties);
        }
    }
}
