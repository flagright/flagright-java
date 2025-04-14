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
@JsonDeserialize(builder = SanctionsHitContext.Builder.class)
public final class SanctionsHitContext {
    private final SanctionsScreeningEntity entity;

    private final Optional<SanctionsDetailsEntityType> entityType;

    private final Optional<String> userId;

    private final Optional<String> transactionId;

    private final Optional<String> ruleInstanceId;

    private final Optional<String> ruleId;

    private final Optional<String> iban;

    private final Optional<Double> yearOfBirth;

    private final Optional<String> searchTerm;

    private final Optional<String> paymentMethodId;

    private final Map<String, Object> additionalProperties;

    private SanctionsHitContext(
            SanctionsScreeningEntity entity,
            Optional<SanctionsDetailsEntityType> entityType,
            Optional<String> userId,
            Optional<String> transactionId,
            Optional<String> ruleInstanceId,
            Optional<String> ruleId,
            Optional<String> iban,
            Optional<Double> yearOfBirth,
            Optional<String> searchTerm,
            Optional<String> paymentMethodId,
            Map<String, Object> additionalProperties) {
        this.entity = entity;
        this.entityType = entityType;
        this.userId = userId;
        this.transactionId = transactionId;
        this.ruleInstanceId = ruleInstanceId;
        this.ruleId = ruleId;
        this.iban = iban;
        this.yearOfBirth = yearOfBirth;
        this.searchTerm = searchTerm;
        this.paymentMethodId = paymentMethodId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("entity")
    public SanctionsScreeningEntity getEntity() {
        return entity;
    }

    @JsonProperty("entityType")
    public Optional<SanctionsDetailsEntityType> getEntityType() {
        return entityType;
    }

    @JsonProperty("userId")
    public Optional<String> getUserId() {
        return userId;
    }

    @JsonProperty("transactionId")
    public Optional<String> getTransactionId() {
        return transactionId;
    }

    @JsonProperty("ruleInstanceId")
    public Optional<String> getRuleInstanceId() {
        return ruleInstanceId;
    }

    @JsonProperty("ruleId")
    public Optional<String> getRuleId() {
        return ruleId;
    }

    @JsonProperty("iban")
    public Optional<String> getIban() {
        return iban;
    }

    @JsonProperty("yearOfBirth")
    public Optional<Double> getYearOfBirth() {
        return yearOfBirth;
    }

    @JsonProperty("searchTerm")
    public Optional<String> getSearchTerm() {
        return searchTerm;
    }

    @JsonProperty("paymentMethodId")
    public Optional<String> getPaymentMethodId() {
        return paymentMethodId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SanctionsHitContext && equalTo((SanctionsHitContext) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SanctionsHitContext other) {
        return entity.equals(other.entity)
                && entityType.equals(other.entityType)
                && userId.equals(other.userId)
                && transactionId.equals(other.transactionId)
                && ruleInstanceId.equals(other.ruleInstanceId)
                && ruleId.equals(other.ruleId)
                && iban.equals(other.iban)
                && yearOfBirth.equals(other.yearOfBirth)
                && searchTerm.equals(other.searchTerm)
                && paymentMethodId.equals(other.paymentMethodId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.entity,
                this.entityType,
                this.userId,
                this.transactionId,
                this.ruleInstanceId,
                this.ruleId,
                this.iban,
                this.yearOfBirth,
                this.searchTerm,
                this.paymentMethodId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EntityStage builder() {
        return new Builder();
    }

    public interface EntityStage {
        _FinalStage entity(@NotNull SanctionsScreeningEntity entity);

        Builder from(SanctionsHitContext other);
    }

    public interface _FinalStage {
        SanctionsHitContext build();

        _FinalStage entityType(Optional<SanctionsDetailsEntityType> entityType);

        _FinalStage entityType(SanctionsDetailsEntityType entityType);

        _FinalStage userId(Optional<String> userId);

        _FinalStage userId(String userId);

        _FinalStage transactionId(Optional<String> transactionId);

        _FinalStage transactionId(String transactionId);

        _FinalStage ruleInstanceId(Optional<String> ruleInstanceId);

        _FinalStage ruleInstanceId(String ruleInstanceId);

        _FinalStage ruleId(Optional<String> ruleId);

        _FinalStage ruleId(String ruleId);

        _FinalStage iban(Optional<String> iban);

        _FinalStage iban(String iban);

        _FinalStage yearOfBirth(Optional<Double> yearOfBirth);

        _FinalStage yearOfBirth(Double yearOfBirth);

        _FinalStage searchTerm(Optional<String> searchTerm);

        _FinalStage searchTerm(String searchTerm);

        _FinalStage paymentMethodId(Optional<String> paymentMethodId);

        _FinalStage paymentMethodId(String paymentMethodId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EntityStage, _FinalStage {
        private SanctionsScreeningEntity entity;

        private Optional<String> paymentMethodId = Optional.empty();

        private Optional<String> searchTerm = Optional.empty();

        private Optional<Double> yearOfBirth = Optional.empty();

        private Optional<String> iban = Optional.empty();

        private Optional<String> ruleId = Optional.empty();

        private Optional<String> ruleInstanceId = Optional.empty();

        private Optional<String> transactionId = Optional.empty();

        private Optional<String> userId = Optional.empty();

        private Optional<SanctionsDetailsEntityType> entityType = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(SanctionsHitContext other) {
            entity(other.getEntity());
            entityType(other.getEntityType());
            userId(other.getUserId());
            transactionId(other.getTransactionId());
            ruleInstanceId(other.getRuleInstanceId());
            ruleId(other.getRuleId());
            iban(other.getIban());
            yearOfBirth(other.getYearOfBirth());
            searchTerm(other.getSearchTerm());
            paymentMethodId(other.getPaymentMethodId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("entity")
        public _FinalStage entity(@NotNull SanctionsScreeningEntity entity) {
            this.entity = Objects.requireNonNull(entity, "entity must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage paymentMethodId(String paymentMethodId) {
            this.paymentMethodId = Optional.ofNullable(paymentMethodId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "paymentMethodId", nulls = Nulls.SKIP)
        public _FinalStage paymentMethodId(Optional<String> paymentMethodId) {
            this.paymentMethodId = paymentMethodId;
            return this;
        }

        @java.lang.Override
        public _FinalStage searchTerm(String searchTerm) {
            this.searchTerm = Optional.ofNullable(searchTerm);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "searchTerm", nulls = Nulls.SKIP)
        public _FinalStage searchTerm(Optional<String> searchTerm) {
            this.searchTerm = searchTerm;
            return this;
        }

        @java.lang.Override
        public _FinalStage yearOfBirth(Double yearOfBirth) {
            this.yearOfBirth = Optional.ofNullable(yearOfBirth);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "yearOfBirth", nulls = Nulls.SKIP)
        public _FinalStage yearOfBirth(Optional<Double> yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
            return this;
        }

        @java.lang.Override
        public _FinalStage iban(String iban) {
            this.iban = Optional.ofNullable(iban);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "iban", nulls = Nulls.SKIP)
        public _FinalStage iban(Optional<String> iban) {
            this.iban = iban;
            return this;
        }

        @java.lang.Override
        public _FinalStage ruleId(String ruleId) {
            this.ruleId = Optional.ofNullable(ruleId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "ruleId", nulls = Nulls.SKIP)
        public _FinalStage ruleId(Optional<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        @java.lang.Override
        public _FinalStage ruleInstanceId(String ruleInstanceId) {
            this.ruleInstanceId = Optional.ofNullable(ruleInstanceId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "ruleInstanceId", nulls = Nulls.SKIP)
        public _FinalStage ruleInstanceId(Optional<String> ruleInstanceId) {
            this.ruleInstanceId = ruleInstanceId;
            return this;
        }

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

        @java.lang.Override
        public _FinalStage entityType(SanctionsDetailsEntityType entityType) {
            this.entityType = Optional.ofNullable(entityType);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "entityType", nulls = Nulls.SKIP)
        public _FinalStage entityType(Optional<SanctionsDetailsEntityType> entityType) {
            this.entityType = entityType;
            return this;
        }

        @java.lang.Override
        public SanctionsHitContext build() {
            return new SanctionsHitContext(
                    entity,
                    entityType,
                    userId,
                    transactionId,
                    ruleInstanceId,
                    ruleId,
                    iban,
                    yearOfBirth,
                    searchTerm,
                    paymentMethodId,
                    additionalProperties);
        }
    }
}
