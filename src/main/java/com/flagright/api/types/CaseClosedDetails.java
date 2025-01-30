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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CaseClosedDetails.Builder.class)
public final class CaseClosedDetails {
    private final Optional<String> caseId;

    private final Optional<String> status;

    private final Optional<List<String>> reasons;

    private final Optional<String> reasonDescriptionForOther;

    private final Optional<String> comment;

    private final Optional<String> userId;

    private final Optional<List<String>> transactionIds;

    private final Map<String, Object> additionalProperties;

    private CaseClosedDetails(
            Optional<String> caseId,
            Optional<String> status,
            Optional<List<String>> reasons,
            Optional<String> reasonDescriptionForOther,
            Optional<String> comment,
            Optional<String> userId,
            Optional<List<String>> transactionIds,
            Map<String, Object> additionalProperties) {
        this.caseId = caseId;
        this.status = status;
        this.reasons = reasons;
        this.reasonDescriptionForOther = reasonDescriptionForOther;
        this.comment = comment;
        this.userId = userId;
        this.transactionIds = transactionIds;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("caseId")
    public Optional<String> getCaseId() {
        return caseId;
    }

    @JsonProperty("status")
    public Optional<String> getStatus() {
        return status;
    }

    @JsonProperty("reasons")
    public Optional<List<String>> getReasons() {
        return reasons;
    }

    @JsonProperty("reasonDescriptionForOther")
    public Optional<String> getReasonDescriptionForOther() {
        return reasonDescriptionForOther;
    }

    @JsonProperty("comment")
    public Optional<String> getComment() {
        return comment;
    }

    @JsonProperty("userId")
    public Optional<String> getUserId() {
        return userId;
    }

    @JsonProperty("transactionIds")
    public Optional<List<String>> getTransactionIds() {
        return transactionIds;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CaseClosedDetails && equalTo((CaseClosedDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CaseClosedDetails other) {
        return caseId.equals(other.caseId)
                && status.equals(other.status)
                && reasons.equals(other.reasons)
                && reasonDescriptionForOther.equals(other.reasonDescriptionForOther)
                && comment.equals(other.comment)
                && userId.equals(other.userId)
                && transactionIds.equals(other.transactionIds);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.caseId,
                this.status,
                this.reasons,
                this.reasonDescriptionForOther,
                this.comment,
                this.userId,
                this.transactionIds);
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
        private Optional<String> caseId = Optional.empty();

        private Optional<String> status = Optional.empty();

        private Optional<List<String>> reasons = Optional.empty();

        private Optional<String> reasonDescriptionForOther = Optional.empty();

        private Optional<String> comment = Optional.empty();

        private Optional<String> userId = Optional.empty();

        private Optional<List<String>> transactionIds = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CaseClosedDetails other) {
            caseId(other.getCaseId());
            status(other.getStatus());
            reasons(other.getReasons());
            reasonDescriptionForOther(other.getReasonDescriptionForOther());
            comment(other.getComment());
            userId(other.getUserId());
            transactionIds(other.getTransactionIds());
            return this;
        }

        @JsonSetter(value = "caseId", nulls = Nulls.SKIP)
        public Builder caseId(Optional<String> caseId) {
            this.caseId = caseId;
            return this;
        }

        public Builder caseId(String caseId) {
            this.caseId = Optional.ofNullable(caseId);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(String status) {
            this.status = Optional.ofNullable(status);
            return this;
        }

        @JsonSetter(value = "reasons", nulls = Nulls.SKIP)
        public Builder reasons(Optional<List<String>> reasons) {
            this.reasons = reasons;
            return this;
        }

        public Builder reasons(List<String> reasons) {
            this.reasons = Optional.ofNullable(reasons);
            return this;
        }

        @JsonSetter(value = "reasonDescriptionForOther", nulls = Nulls.SKIP)
        public Builder reasonDescriptionForOther(Optional<String> reasonDescriptionForOther) {
            this.reasonDescriptionForOther = reasonDescriptionForOther;
            return this;
        }

        public Builder reasonDescriptionForOther(String reasonDescriptionForOther) {
            this.reasonDescriptionForOther = Optional.ofNullable(reasonDescriptionForOther);
            return this;
        }

        @JsonSetter(value = "comment", nulls = Nulls.SKIP)
        public Builder comment(Optional<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            this.comment = Optional.ofNullable(comment);
            return this;
        }

        @JsonSetter(value = "userId", nulls = Nulls.SKIP)
        public Builder userId(Optional<String> userId) {
            this.userId = userId;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        @JsonSetter(value = "transactionIds", nulls = Nulls.SKIP)
        public Builder transactionIds(Optional<List<String>> transactionIds) {
            this.transactionIds = transactionIds;
            return this;
        }

        public Builder transactionIds(List<String> transactionIds) {
            this.transactionIds = Optional.ofNullable(transactionIds);
            return this;
        }

        public CaseClosedDetails build() {
            return new CaseClosedDetails(
                    caseId,
                    status,
                    reasons,
                    reasonDescriptionForOther,
                    comment,
                    userId,
                    transactionIds,
                    additionalProperties);
        }
    }
}
