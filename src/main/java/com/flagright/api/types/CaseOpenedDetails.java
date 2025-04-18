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
@JsonDeserialize(builder = CaseOpenedDetails.Builder.class)
public final class CaseOpenedDetails {
    private final Optional<String> caseId;

    private final Optional<String> status;

    private final Optional<String> userId;

    private final Optional<List<String>> transactionIds;

    private final Map<String, Object> additionalProperties;

    private CaseOpenedDetails(
            Optional<String> caseId,
            Optional<String> status,
            Optional<String> userId,
            Optional<List<String>> transactionIds,
            Map<String, Object> additionalProperties) {
        this.caseId = caseId;
        this.status = status;
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
        return other instanceof CaseOpenedDetails && equalTo((CaseOpenedDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CaseOpenedDetails other) {
        return caseId.equals(other.caseId)
                && status.equals(other.status)
                && userId.equals(other.userId)
                && transactionIds.equals(other.transactionIds);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.caseId, this.status, this.userId, this.transactionIds);
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

        private Optional<String> userId = Optional.empty();

        private Optional<List<String>> transactionIds = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CaseOpenedDetails other) {
            caseId(other.getCaseId());
            status(other.getStatus());
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

        public CaseOpenedDetails build() {
            return new CaseOpenedDetails(caseId, status, userId, transactionIds, additionalProperties);
        }
    }
}
