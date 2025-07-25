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
@JsonDeserialize(builder = BusinessOptional.Builder.class)
public final class BusinessOptional {
    private final Optional<Double> activatedTimestamp;

    private final Optional<UserStateDetails> userStateDetails;

    private final Optional<KycStatusDetails> kycStatusDetails;

    private final Optional<LegalEntity> legalEntity;

    private final Optional<List<Person>> shareHolders;

    private final Optional<List<Person>> directors;

    private final Optional<TransactionLimits> transactionLimits;

    private final Optional<RiskLevel> riskLevel;

    private final Optional<RiskLevel> kycRiskLevel;

    private final Optional<List<PaymentMethod>> allowedPaymentMethods;

    private final Optional<Double> lastTransactionTimestamp;

    private final Optional<UserEntityLink> linkedEntities;

    private final Optional<AcquisitionChannel> acquisitionChannel;

    private final Optional<List<BusinessOptionalSavedPaymentDetailsItem>> savedPaymentDetails;

    private final Optional<MccDetails> mccDetails;

    private final Optional<List<UserTag>> tags;

    private final Optional<List<PersonAttachment>> attachments;

    private final Optional<Double> updateCount;

    private final Map<String, Object> additionalProperties;

    private BusinessOptional(
            Optional<Double> activatedTimestamp,
            Optional<UserStateDetails> userStateDetails,
            Optional<KycStatusDetails> kycStatusDetails,
            Optional<LegalEntity> legalEntity,
            Optional<List<Person>> shareHolders,
            Optional<List<Person>> directors,
            Optional<TransactionLimits> transactionLimits,
            Optional<RiskLevel> riskLevel,
            Optional<RiskLevel> kycRiskLevel,
            Optional<List<PaymentMethod>> allowedPaymentMethods,
            Optional<Double> lastTransactionTimestamp,
            Optional<UserEntityLink> linkedEntities,
            Optional<AcquisitionChannel> acquisitionChannel,
            Optional<List<BusinessOptionalSavedPaymentDetailsItem>> savedPaymentDetails,
            Optional<MccDetails> mccDetails,
            Optional<List<UserTag>> tags,
            Optional<List<PersonAttachment>> attachments,
            Optional<Double> updateCount,
            Map<String, Object> additionalProperties) {
        this.activatedTimestamp = activatedTimestamp;
        this.userStateDetails = userStateDetails;
        this.kycStatusDetails = kycStatusDetails;
        this.legalEntity = legalEntity;
        this.shareHolders = shareHolders;
        this.directors = directors;
        this.transactionLimits = transactionLimits;
        this.riskLevel = riskLevel;
        this.kycRiskLevel = kycRiskLevel;
        this.allowedPaymentMethods = allowedPaymentMethods;
        this.lastTransactionTimestamp = lastTransactionTimestamp;
        this.linkedEntities = linkedEntities;
        this.acquisitionChannel = acquisitionChannel;
        this.savedPaymentDetails = savedPaymentDetails;
        this.mccDetails = mccDetails;
        this.tags = tags;
        this.attachments = attachments;
        this.updateCount = updateCount;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Timestamp when the user was activated
     */
    @JsonProperty("activatedTimestamp")
    public Optional<Double> getActivatedTimestamp() {
        return activatedTimestamp;
    }

    @JsonProperty("userStateDetails")
    public Optional<UserStateDetails> getUserStateDetails() {
        return userStateDetails;
    }

    @JsonProperty("kycStatusDetails")
    public Optional<KycStatusDetails> getKycStatusDetails() {
        return kycStatusDetails;
    }

    @JsonProperty("legalEntity")
    public Optional<LegalEntity> getLegalEntity() {
        return legalEntity;
    }

    /**
     * @return Shareholders (beneficiaries) of the company that hold at least 25% ownership. Can be another company or an individual
     */
    @JsonProperty("shareHolders")
    public Optional<List<Person>> getShareHolders() {
        return shareHolders;
    }

    /**
     * @return Director(s) of the company. Must be at least one
     */
    @JsonProperty("directors")
    public Optional<List<Person>> getDirectors() {
        return directors;
    }

    @JsonProperty("transactionLimits")
    public Optional<TransactionLimits> getTransactionLimits() {
        return transactionLimits;
    }

    @JsonProperty("riskLevel")
    public Optional<RiskLevel> getRiskLevel() {
        return riskLevel;
    }

    @JsonProperty("kycRiskLevel")
    public Optional<RiskLevel> getKycRiskLevel() {
        return kycRiskLevel;
    }

    @JsonProperty("allowedPaymentMethods")
    public Optional<List<PaymentMethod>> getAllowedPaymentMethods() {
        return allowedPaymentMethods;
    }

    /**
     * @return Timestamp of the last successful transaction of the user
     */
    @JsonProperty("lastTransactionTimestamp")
    public Optional<Double> getLastTransactionTimestamp() {
        return lastTransactionTimestamp;
    }

    @JsonProperty("linkedEntities")
    public Optional<UserEntityLink> getLinkedEntities() {
        return linkedEntities;
    }

    @JsonProperty("acquisitionChannel")
    public Optional<AcquisitionChannel> getAcquisitionChannel() {
        return acquisitionChannel;
    }

    @JsonProperty("savedPaymentDetails")
    public Optional<List<BusinessOptionalSavedPaymentDetailsItem>> getSavedPaymentDetails() {
        return savedPaymentDetails;
    }

    @JsonProperty("mccDetails")
    public Optional<MccDetails> getMccDetails() {
        return mccDetails;
    }

    /**
     * @return Additional information that can be added via tags
     */
    @JsonProperty("tags")
    public Optional<List<UserTag>> getTags() {
        return tags;
    }

    /**
     * @return User's attachments uploaded by business user
     */
    @JsonProperty("attachments")
    public Optional<List<PersonAttachment>> getAttachments() {
        return attachments;
    }

    @JsonProperty("updateCount")
    public Optional<Double> getUpdateCount() {
        return updateCount;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BusinessOptional && equalTo((BusinessOptional) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BusinessOptional other) {
        return activatedTimestamp.equals(other.activatedTimestamp)
                && userStateDetails.equals(other.userStateDetails)
                && kycStatusDetails.equals(other.kycStatusDetails)
                && legalEntity.equals(other.legalEntity)
                && shareHolders.equals(other.shareHolders)
                && directors.equals(other.directors)
                && transactionLimits.equals(other.transactionLimits)
                && riskLevel.equals(other.riskLevel)
                && kycRiskLevel.equals(other.kycRiskLevel)
                && allowedPaymentMethods.equals(other.allowedPaymentMethods)
                && lastTransactionTimestamp.equals(other.lastTransactionTimestamp)
                && linkedEntities.equals(other.linkedEntities)
                && acquisitionChannel.equals(other.acquisitionChannel)
                && savedPaymentDetails.equals(other.savedPaymentDetails)
                && mccDetails.equals(other.mccDetails)
                && tags.equals(other.tags)
                && attachments.equals(other.attachments)
                && updateCount.equals(other.updateCount);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.activatedTimestamp,
                this.userStateDetails,
                this.kycStatusDetails,
                this.legalEntity,
                this.shareHolders,
                this.directors,
                this.transactionLimits,
                this.riskLevel,
                this.kycRiskLevel,
                this.allowedPaymentMethods,
                this.lastTransactionTimestamp,
                this.linkedEntities,
                this.acquisitionChannel,
                this.savedPaymentDetails,
                this.mccDetails,
                this.tags,
                this.attachments,
                this.updateCount);
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
        private Optional<Double> activatedTimestamp = Optional.empty();

        private Optional<UserStateDetails> userStateDetails = Optional.empty();

        private Optional<KycStatusDetails> kycStatusDetails = Optional.empty();

        private Optional<LegalEntity> legalEntity = Optional.empty();

        private Optional<List<Person>> shareHolders = Optional.empty();

        private Optional<List<Person>> directors = Optional.empty();

        private Optional<TransactionLimits> transactionLimits = Optional.empty();

        private Optional<RiskLevel> riskLevel = Optional.empty();

        private Optional<RiskLevel> kycRiskLevel = Optional.empty();

        private Optional<List<PaymentMethod>> allowedPaymentMethods = Optional.empty();

        private Optional<Double> lastTransactionTimestamp = Optional.empty();

        private Optional<UserEntityLink> linkedEntities = Optional.empty();

        private Optional<AcquisitionChannel> acquisitionChannel = Optional.empty();

        private Optional<List<BusinessOptionalSavedPaymentDetailsItem>> savedPaymentDetails = Optional.empty();

        private Optional<MccDetails> mccDetails = Optional.empty();

        private Optional<List<UserTag>> tags = Optional.empty();

        private Optional<List<PersonAttachment>> attachments = Optional.empty();

        private Optional<Double> updateCount = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(BusinessOptional other) {
            activatedTimestamp(other.getActivatedTimestamp());
            userStateDetails(other.getUserStateDetails());
            kycStatusDetails(other.getKycStatusDetails());
            legalEntity(other.getLegalEntity());
            shareHolders(other.getShareHolders());
            directors(other.getDirectors());
            transactionLimits(other.getTransactionLimits());
            riskLevel(other.getRiskLevel());
            kycRiskLevel(other.getKycRiskLevel());
            allowedPaymentMethods(other.getAllowedPaymentMethods());
            lastTransactionTimestamp(other.getLastTransactionTimestamp());
            linkedEntities(other.getLinkedEntities());
            acquisitionChannel(other.getAcquisitionChannel());
            savedPaymentDetails(other.getSavedPaymentDetails());
            mccDetails(other.getMccDetails());
            tags(other.getTags());
            attachments(other.getAttachments());
            updateCount(other.getUpdateCount());
            return this;
        }

        @JsonSetter(value = "activatedTimestamp", nulls = Nulls.SKIP)
        public Builder activatedTimestamp(Optional<Double> activatedTimestamp) {
            this.activatedTimestamp = activatedTimestamp;
            return this;
        }

        public Builder activatedTimestamp(Double activatedTimestamp) {
            this.activatedTimestamp = Optional.ofNullable(activatedTimestamp);
            return this;
        }

        @JsonSetter(value = "userStateDetails", nulls = Nulls.SKIP)
        public Builder userStateDetails(Optional<UserStateDetails> userStateDetails) {
            this.userStateDetails = userStateDetails;
            return this;
        }

        public Builder userStateDetails(UserStateDetails userStateDetails) {
            this.userStateDetails = Optional.ofNullable(userStateDetails);
            return this;
        }

        @JsonSetter(value = "kycStatusDetails", nulls = Nulls.SKIP)
        public Builder kycStatusDetails(Optional<KycStatusDetails> kycStatusDetails) {
            this.kycStatusDetails = kycStatusDetails;
            return this;
        }

        public Builder kycStatusDetails(KycStatusDetails kycStatusDetails) {
            this.kycStatusDetails = Optional.ofNullable(kycStatusDetails);
            return this;
        }

        @JsonSetter(value = "legalEntity", nulls = Nulls.SKIP)
        public Builder legalEntity(Optional<LegalEntity> legalEntity) {
            this.legalEntity = legalEntity;
            return this;
        }

        public Builder legalEntity(LegalEntity legalEntity) {
            this.legalEntity = Optional.ofNullable(legalEntity);
            return this;
        }

        @JsonSetter(value = "shareHolders", nulls = Nulls.SKIP)
        public Builder shareHolders(Optional<List<Person>> shareHolders) {
            this.shareHolders = shareHolders;
            return this;
        }

        public Builder shareHolders(List<Person> shareHolders) {
            this.shareHolders = Optional.ofNullable(shareHolders);
            return this;
        }

        @JsonSetter(value = "directors", nulls = Nulls.SKIP)
        public Builder directors(Optional<List<Person>> directors) {
            this.directors = directors;
            return this;
        }

        public Builder directors(List<Person> directors) {
            this.directors = Optional.ofNullable(directors);
            return this;
        }

        @JsonSetter(value = "transactionLimits", nulls = Nulls.SKIP)
        public Builder transactionLimits(Optional<TransactionLimits> transactionLimits) {
            this.transactionLimits = transactionLimits;
            return this;
        }

        public Builder transactionLimits(TransactionLimits transactionLimits) {
            this.transactionLimits = Optional.ofNullable(transactionLimits);
            return this;
        }

        @JsonSetter(value = "riskLevel", nulls = Nulls.SKIP)
        public Builder riskLevel(Optional<RiskLevel> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }

        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = Optional.ofNullable(riskLevel);
            return this;
        }

        @JsonSetter(value = "kycRiskLevel", nulls = Nulls.SKIP)
        public Builder kycRiskLevel(Optional<RiskLevel> kycRiskLevel) {
            this.kycRiskLevel = kycRiskLevel;
            return this;
        }

        public Builder kycRiskLevel(RiskLevel kycRiskLevel) {
            this.kycRiskLevel = Optional.ofNullable(kycRiskLevel);
            return this;
        }

        @JsonSetter(value = "allowedPaymentMethods", nulls = Nulls.SKIP)
        public Builder allowedPaymentMethods(Optional<List<PaymentMethod>> allowedPaymentMethods) {
            this.allowedPaymentMethods = allowedPaymentMethods;
            return this;
        }

        public Builder allowedPaymentMethods(List<PaymentMethod> allowedPaymentMethods) {
            this.allowedPaymentMethods = Optional.ofNullable(allowedPaymentMethods);
            return this;
        }

        @JsonSetter(value = "lastTransactionTimestamp", nulls = Nulls.SKIP)
        public Builder lastTransactionTimestamp(Optional<Double> lastTransactionTimestamp) {
            this.lastTransactionTimestamp = lastTransactionTimestamp;
            return this;
        }

        public Builder lastTransactionTimestamp(Double lastTransactionTimestamp) {
            this.lastTransactionTimestamp = Optional.ofNullable(lastTransactionTimestamp);
            return this;
        }

        @JsonSetter(value = "linkedEntities", nulls = Nulls.SKIP)
        public Builder linkedEntities(Optional<UserEntityLink> linkedEntities) {
            this.linkedEntities = linkedEntities;
            return this;
        }

        public Builder linkedEntities(UserEntityLink linkedEntities) {
            this.linkedEntities = Optional.ofNullable(linkedEntities);
            return this;
        }

        @JsonSetter(value = "acquisitionChannel", nulls = Nulls.SKIP)
        public Builder acquisitionChannel(Optional<AcquisitionChannel> acquisitionChannel) {
            this.acquisitionChannel = acquisitionChannel;
            return this;
        }

        public Builder acquisitionChannel(AcquisitionChannel acquisitionChannel) {
            this.acquisitionChannel = Optional.ofNullable(acquisitionChannel);
            return this;
        }

        @JsonSetter(value = "savedPaymentDetails", nulls = Nulls.SKIP)
        public Builder savedPaymentDetails(
                Optional<List<BusinessOptionalSavedPaymentDetailsItem>> savedPaymentDetails) {
            this.savedPaymentDetails = savedPaymentDetails;
            return this;
        }

        public Builder savedPaymentDetails(List<BusinessOptionalSavedPaymentDetailsItem> savedPaymentDetails) {
            this.savedPaymentDetails = Optional.ofNullable(savedPaymentDetails);
            return this;
        }

        @JsonSetter(value = "mccDetails", nulls = Nulls.SKIP)
        public Builder mccDetails(Optional<MccDetails> mccDetails) {
            this.mccDetails = mccDetails;
            return this;
        }

        public Builder mccDetails(MccDetails mccDetails) {
            this.mccDetails = Optional.ofNullable(mccDetails);
            return this;
        }

        @JsonSetter(value = "tags", nulls = Nulls.SKIP)
        public Builder tags(Optional<List<UserTag>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(List<UserTag> tags) {
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        @JsonSetter(value = "attachments", nulls = Nulls.SKIP)
        public Builder attachments(Optional<List<PersonAttachment>> attachments) {
            this.attachments = attachments;
            return this;
        }

        public Builder attachments(List<PersonAttachment> attachments) {
            this.attachments = Optional.ofNullable(attachments);
            return this;
        }

        @JsonSetter(value = "updateCount", nulls = Nulls.SKIP)
        public Builder updateCount(Optional<Double> updateCount) {
            this.updateCount = updateCount;
            return this;
        }

        public Builder updateCount(Double updateCount) {
            this.updateCount = Optional.ofNullable(updateCount);
            return this;
        }

        public BusinessOptional build() {
            return new BusinessOptional(
                    activatedTimestamp,
                    userStateDetails,
                    kycStatusDetails,
                    legalEntity,
                    shareHolders,
                    directors,
                    transactionLimits,
                    riskLevel,
                    kycRiskLevel,
                    allowedPaymentMethods,
                    lastTransactionTimestamp,
                    linkedEntities,
                    acquisitionChannel,
                    savedPaymentDetails,
                    mccDetails,
                    tags,
                    attachments,
                    updateCount,
                    additionalProperties);
        }
    }
}
