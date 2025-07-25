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
@JsonDeserialize(builder = UserOptional.Builder.class)
public final class UserOptional {
    private final Optional<Double> activatedTimestamp;

    private final Optional<UserDetails> userDetails;

    private final Optional<UserStateDetails> userStateDetails;

    private final Optional<KycStatusDetails> kycStatusDetails;

    private final Optional<Double> eoddDate;

    private final Optional<EmploymentStatus> employmentStatus;

    private final Optional<String> occupation;

    private final Optional<List<LegalDocument>> legalDocuments;

    private final Optional<ContactDetails> contactDetails;

    private final Optional<EmploymentDetails> employmentDetails;

    private final Optional<TransactionLimits> transactionLimits;

    private final Optional<ExpectedIncome> expectedIncome;

    private final Optional<RiskLevel> riskLevel;

    private final Optional<RiskLevel> kycRiskLevel;

    private final Optional<AcquisitionChannel> acquisitionChannel;

    private final Optional<List<String>> reasonForAccountOpening;

    private final Optional<List<SourceOfFunds>> sourceOfFunds;

    private final Optional<ConsumerUserSegment> userSegment;

    private final Optional<List<PepStatus>> pepStatus;

    private final Optional<Boolean> sanctionsStatus;

    private final Optional<Boolean> adverseMediaStatus;

    private final Optional<Double> lastTransactionTimestamp;

    private final Optional<UserEntityLink> linkedEntities;

    private final Optional<List<UserOptionalSavedPaymentDetailsItem>> savedPaymentDetails;

    private final Optional<List<UserTag>> tags;

    private final Optional<List<PersonAttachment>> attachments;

    private final Optional<Double> updateCount;

    private final Map<String, Object> additionalProperties;

    private UserOptional(
            Optional<Double> activatedTimestamp,
            Optional<UserDetails> userDetails,
            Optional<UserStateDetails> userStateDetails,
            Optional<KycStatusDetails> kycStatusDetails,
            Optional<Double> eoddDate,
            Optional<EmploymentStatus> employmentStatus,
            Optional<String> occupation,
            Optional<List<LegalDocument>> legalDocuments,
            Optional<ContactDetails> contactDetails,
            Optional<EmploymentDetails> employmentDetails,
            Optional<TransactionLimits> transactionLimits,
            Optional<ExpectedIncome> expectedIncome,
            Optional<RiskLevel> riskLevel,
            Optional<RiskLevel> kycRiskLevel,
            Optional<AcquisitionChannel> acquisitionChannel,
            Optional<List<String>> reasonForAccountOpening,
            Optional<List<SourceOfFunds>> sourceOfFunds,
            Optional<ConsumerUserSegment> userSegment,
            Optional<List<PepStatus>> pepStatus,
            Optional<Boolean> sanctionsStatus,
            Optional<Boolean> adverseMediaStatus,
            Optional<Double> lastTransactionTimestamp,
            Optional<UserEntityLink> linkedEntities,
            Optional<List<UserOptionalSavedPaymentDetailsItem>> savedPaymentDetails,
            Optional<List<UserTag>> tags,
            Optional<List<PersonAttachment>> attachments,
            Optional<Double> updateCount,
            Map<String, Object> additionalProperties) {
        this.activatedTimestamp = activatedTimestamp;
        this.userDetails = userDetails;
        this.userStateDetails = userStateDetails;
        this.kycStatusDetails = kycStatusDetails;
        this.eoddDate = eoddDate;
        this.employmentStatus = employmentStatus;
        this.occupation = occupation;
        this.legalDocuments = legalDocuments;
        this.contactDetails = contactDetails;
        this.employmentDetails = employmentDetails;
        this.transactionLimits = transactionLimits;
        this.expectedIncome = expectedIncome;
        this.riskLevel = riskLevel;
        this.kycRiskLevel = kycRiskLevel;
        this.acquisitionChannel = acquisitionChannel;
        this.reasonForAccountOpening = reasonForAccountOpening;
        this.sourceOfFunds = sourceOfFunds;
        this.userSegment = userSegment;
        this.pepStatus = pepStatus;
        this.sanctionsStatus = sanctionsStatus;
        this.adverseMediaStatus = adverseMediaStatus;
        this.lastTransactionTimestamp = lastTransactionTimestamp;
        this.linkedEntities = linkedEntities;
        this.savedPaymentDetails = savedPaymentDetails;
        this.tags = tags;
        this.attachments = attachments;
        this.updateCount = updateCount;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Timestamp when user was activated
     */
    @JsonProperty("activatedTimestamp")
    public Optional<Double> getActivatedTimestamp() {
        return activatedTimestamp;
    }

    @JsonProperty("userDetails")
    public Optional<UserDetails> getUserDetails() {
        return userDetails;
    }

    @JsonProperty("userStateDetails")
    public Optional<UserStateDetails> getUserStateDetails() {
        return userStateDetails;
    }

    @JsonProperty("kycStatusDetails")
    public Optional<KycStatusDetails> getKycStatusDetails() {
        return kycStatusDetails;
    }

    @JsonProperty("eoddDate")
    public Optional<Double> getEoddDate() {
        return eoddDate;
    }

    @JsonProperty("employmentStatus")
    public Optional<EmploymentStatus> getEmploymentStatus() {
        return employmentStatus;
    }

    @JsonProperty("occupation")
    public Optional<String> getOccupation() {
        return occupation;
    }

    /**
     * @return User's legal identity documents - See Document Model for details
     */
    @JsonProperty("legalDocuments")
    public Optional<List<LegalDocument>> getLegalDocuments() {
        return legalDocuments;
    }

    @JsonProperty("contactDetails")
    public Optional<ContactDetails> getContactDetails() {
        return contactDetails;
    }

    @JsonProperty("employmentDetails")
    public Optional<EmploymentDetails> getEmploymentDetails() {
        return employmentDetails;
    }

    @JsonProperty("transactionLimits")
    public Optional<TransactionLimits> getTransactionLimits() {
        return transactionLimits;
    }

    @JsonProperty("expectedIncome")
    public Optional<ExpectedIncome> getExpectedIncome() {
        return expectedIncome;
    }

    @JsonProperty("riskLevel")
    public Optional<RiskLevel> getRiskLevel() {
        return riskLevel;
    }

    @JsonProperty("kycRiskLevel")
    public Optional<RiskLevel> getKycRiskLevel() {
        return kycRiskLevel;
    }

    @JsonProperty("acquisitionChannel")
    public Optional<AcquisitionChannel> getAcquisitionChannel() {
        return acquisitionChannel;
    }

    @JsonProperty("reasonForAccountOpening")
    public Optional<List<String>> getReasonForAccountOpening() {
        return reasonForAccountOpening;
    }

    @JsonProperty("sourceOfFunds")
    public Optional<List<SourceOfFunds>> getSourceOfFunds() {
        return sourceOfFunds;
    }

    @JsonProperty("userSegment")
    public Optional<ConsumerUserSegment> getUserSegment() {
        return userSegment;
    }

    @JsonProperty("pepStatus")
    public Optional<List<PepStatus>> getPepStatus() {
        return pepStatus;
    }

    @JsonProperty("sanctionsStatus")
    public Optional<Boolean> getSanctionsStatus() {
        return sanctionsStatus;
    }

    @JsonProperty("adverseMediaStatus")
    public Optional<Boolean> getAdverseMediaStatus() {
        return adverseMediaStatus;
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

    @JsonProperty("savedPaymentDetails")
    public Optional<List<UserOptionalSavedPaymentDetailsItem>> getSavedPaymentDetails() {
        return savedPaymentDetails;
    }

    /**
     * @return Additional information that can be added via tags
     */
    @JsonProperty("tags")
    public Optional<List<UserTag>> getTags() {
        return tags;
    }

    /**
     * @return Uploaded user's attachment
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
        return other instanceof UserOptional && equalTo((UserOptional) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserOptional other) {
        return activatedTimestamp.equals(other.activatedTimestamp)
                && userDetails.equals(other.userDetails)
                && userStateDetails.equals(other.userStateDetails)
                && kycStatusDetails.equals(other.kycStatusDetails)
                && eoddDate.equals(other.eoddDate)
                && employmentStatus.equals(other.employmentStatus)
                && occupation.equals(other.occupation)
                && legalDocuments.equals(other.legalDocuments)
                && contactDetails.equals(other.contactDetails)
                && employmentDetails.equals(other.employmentDetails)
                && transactionLimits.equals(other.transactionLimits)
                && expectedIncome.equals(other.expectedIncome)
                && riskLevel.equals(other.riskLevel)
                && kycRiskLevel.equals(other.kycRiskLevel)
                && acquisitionChannel.equals(other.acquisitionChannel)
                && reasonForAccountOpening.equals(other.reasonForAccountOpening)
                && sourceOfFunds.equals(other.sourceOfFunds)
                && userSegment.equals(other.userSegment)
                && pepStatus.equals(other.pepStatus)
                && sanctionsStatus.equals(other.sanctionsStatus)
                && adverseMediaStatus.equals(other.adverseMediaStatus)
                && lastTransactionTimestamp.equals(other.lastTransactionTimestamp)
                && linkedEntities.equals(other.linkedEntities)
                && savedPaymentDetails.equals(other.savedPaymentDetails)
                && tags.equals(other.tags)
                && attachments.equals(other.attachments)
                && updateCount.equals(other.updateCount);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.activatedTimestamp,
                this.userDetails,
                this.userStateDetails,
                this.kycStatusDetails,
                this.eoddDate,
                this.employmentStatus,
                this.occupation,
                this.legalDocuments,
                this.contactDetails,
                this.employmentDetails,
                this.transactionLimits,
                this.expectedIncome,
                this.riskLevel,
                this.kycRiskLevel,
                this.acquisitionChannel,
                this.reasonForAccountOpening,
                this.sourceOfFunds,
                this.userSegment,
                this.pepStatus,
                this.sanctionsStatus,
                this.adverseMediaStatus,
                this.lastTransactionTimestamp,
                this.linkedEntities,
                this.savedPaymentDetails,
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

        private Optional<UserDetails> userDetails = Optional.empty();

        private Optional<UserStateDetails> userStateDetails = Optional.empty();

        private Optional<KycStatusDetails> kycStatusDetails = Optional.empty();

        private Optional<Double> eoddDate = Optional.empty();

        private Optional<EmploymentStatus> employmentStatus = Optional.empty();

        private Optional<String> occupation = Optional.empty();

        private Optional<List<LegalDocument>> legalDocuments = Optional.empty();

        private Optional<ContactDetails> contactDetails = Optional.empty();

        private Optional<EmploymentDetails> employmentDetails = Optional.empty();

        private Optional<TransactionLimits> transactionLimits = Optional.empty();

        private Optional<ExpectedIncome> expectedIncome = Optional.empty();

        private Optional<RiskLevel> riskLevel = Optional.empty();

        private Optional<RiskLevel> kycRiskLevel = Optional.empty();

        private Optional<AcquisitionChannel> acquisitionChannel = Optional.empty();

        private Optional<List<String>> reasonForAccountOpening = Optional.empty();

        private Optional<List<SourceOfFunds>> sourceOfFunds = Optional.empty();

        private Optional<ConsumerUserSegment> userSegment = Optional.empty();

        private Optional<List<PepStatus>> pepStatus = Optional.empty();

        private Optional<Boolean> sanctionsStatus = Optional.empty();

        private Optional<Boolean> adverseMediaStatus = Optional.empty();

        private Optional<Double> lastTransactionTimestamp = Optional.empty();

        private Optional<UserEntityLink> linkedEntities = Optional.empty();

        private Optional<List<UserOptionalSavedPaymentDetailsItem>> savedPaymentDetails = Optional.empty();

        private Optional<List<UserTag>> tags = Optional.empty();

        private Optional<List<PersonAttachment>> attachments = Optional.empty();

        private Optional<Double> updateCount = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(UserOptional other) {
            activatedTimestamp(other.getActivatedTimestamp());
            userDetails(other.getUserDetails());
            userStateDetails(other.getUserStateDetails());
            kycStatusDetails(other.getKycStatusDetails());
            eoddDate(other.getEoddDate());
            employmentStatus(other.getEmploymentStatus());
            occupation(other.getOccupation());
            legalDocuments(other.getLegalDocuments());
            contactDetails(other.getContactDetails());
            employmentDetails(other.getEmploymentDetails());
            transactionLimits(other.getTransactionLimits());
            expectedIncome(other.getExpectedIncome());
            riskLevel(other.getRiskLevel());
            kycRiskLevel(other.getKycRiskLevel());
            acquisitionChannel(other.getAcquisitionChannel());
            reasonForAccountOpening(other.getReasonForAccountOpening());
            sourceOfFunds(other.getSourceOfFunds());
            userSegment(other.getUserSegment());
            pepStatus(other.getPepStatus());
            sanctionsStatus(other.getSanctionsStatus());
            adverseMediaStatus(other.getAdverseMediaStatus());
            lastTransactionTimestamp(other.getLastTransactionTimestamp());
            linkedEntities(other.getLinkedEntities());
            savedPaymentDetails(other.getSavedPaymentDetails());
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

        @JsonSetter(value = "userDetails", nulls = Nulls.SKIP)
        public Builder userDetails(Optional<UserDetails> userDetails) {
            this.userDetails = userDetails;
            return this;
        }

        public Builder userDetails(UserDetails userDetails) {
            this.userDetails = Optional.ofNullable(userDetails);
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

        @JsonSetter(value = "eoddDate", nulls = Nulls.SKIP)
        public Builder eoddDate(Optional<Double> eoddDate) {
            this.eoddDate = eoddDate;
            return this;
        }

        public Builder eoddDate(Double eoddDate) {
            this.eoddDate = Optional.ofNullable(eoddDate);
            return this;
        }

        @JsonSetter(value = "employmentStatus", nulls = Nulls.SKIP)
        public Builder employmentStatus(Optional<EmploymentStatus> employmentStatus) {
            this.employmentStatus = employmentStatus;
            return this;
        }

        public Builder employmentStatus(EmploymentStatus employmentStatus) {
            this.employmentStatus = Optional.ofNullable(employmentStatus);
            return this;
        }

        @JsonSetter(value = "occupation", nulls = Nulls.SKIP)
        public Builder occupation(Optional<String> occupation) {
            this.occupation = occupation;
            return this;
        }

        public Builder occupation(String occupation) {
            this.occupation = Optional.ofNullable(occupation);
            return this;
        }

        @JsonSetter(value = "legalDocuments", nulls = Nulls.SKIP)
        public Builder legalDocuments(Optional<List<LegalDocument>> legalDocuments) {
            this.legalDocuments = legalDocuments;
            return this;
        }

        public Builder legalDocuments(List<LegalDocument> legalDocuments) {
            this.legalDocuments = Optional.ofNullable(legalDocuments);
            return this;
        }

        @JsonSetter(value = "contactDetails", nulls = Nulls.SKIP)
        public Builder contactDetails(Optional<ContactDetails> contactDetails) {
            this.contactDetails = contactDetails;
            return this;
        }

        public Builder contactDetails(ContactDetails contactDetails) {
            this.contactDetails = Optional.ofNullable(contactDetails);
            return this;
        }

        @JsonSetter(value = "employmentDetails", nulls = Nulls.SKIP)
        public Builder employmentDetails(Optional<EmploymentDetails> employmentDetails) {
            this.employmentDetails = employmentDetails;
            return this;
        }

        public Builder employmentDetails(EmploymentDetails employmentDetails) {
            this.employmentDetails = Optional.ofNullable(employmentDetails);
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

        @JsonSetter(value = "expectedIncome", nulls = Nulls.SKIP)
        public Builder expectedIncome(Optional<ExpectedIncome> expectedIncome) {
            this.expectedIncome = expectedIncome;
            return this;
        }

        public Builder expectedIncome(ExpectedIncome expectedIncome) {
            this.expectedIncome = Optional.ofNullable(expectedIncome);
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

        @JsonSetter(value = "acquisitionChannel", nulls = Nulls.SKIP)
        public Builder acquisitionChannel(Optional<AcquisitionChannel> acquisitionChannel) {
            this.acquisitionChannel = acquisitionChannel;
            return this;
        }

        public Builder acquisitionChannel(AcquisitionChannel acquisitionChannel) {
            this.acquisitionChannel = Optional.ofNullable(acquisitionChannel);
            return this;
        }

        @JsonSetter(value = "reasonForAccountOpening", nulls = Nulls.SKIP)
        public Builder reasonForAccountOpening(Optional<List<String>> reasonForAccountOpening) {
            this.reasonForAccountOpening = reasonForAccountOpening;
            return this;
        }

        public Builder reasonForAccountOpening(List<String> reasonForAccountOpening) {
            this.reasonForAccountOpening = Optional.ofNullable(reasonForAccountOpening);
            return this;
        }

        @JsonSetter(value = "sourceOfFunds", nulls = Nulls.SKIP)
        public Builder sourceOfFunds(Optional<List<SourceOfFunds>> sourceOfFunds) {
            this.sourceOfFunds = sourceOfFunds;
            return this;
        }

        public Builder sourceOfFunds(List<SourceOfFunds> sourceOfFunds) {
            this.sourceOfFunds = Optional.ofNullable(sourceOfFunds);
            return this;
        }

        @JsonSetter(value = "userSegment", nulls = Nulls.SKIP)
        public Builder userSegment(Optional<ConsumerUserSegment> userSegment) {
            this.userSegment = userSegment;
            return this;
        }

        public Builder userSegment(ConsumerUserSegment userSegment) {
            this.userSegment = Optional.ofNullable(userSegment);
            return this;
        }

        @JsonSetter(value = "pepStatus", nulls = Nulls.SKIP)
        public Builder pepStatus(Optional<List<PepStatus>> pepStatus) {
            this.pepStatus = pepStatus;
            return this;
        }

        public Builder pepStatus(List<PepStatus> pepStatus) {
            this.pepStatus = Optional.ofNullable(pepStatus);
            return this;
        }

        @JsonSetter(value = "sanctionsStatus", nulls = Nulls.SKIP)
        public Builder sanctionsStatus(Optional<Boolean> sanctionsStatus) {
            this.sanctionsStatus = sanctionsStatus;
            return this;
        }

        public Builder sanctionsStatus(Boolean sanctionsStatus) {
            this.sanctionsStatus = Optional.ofNullable(sanctionsStatus);
            return this;
        }

        @JsonSetter(value = "adverseMediaStatus", nulls = Nulls.SKIP)
        public Builder adverseMediaStatus(Optional<Boolean> adverseMediaStatus) {
            this.adverseMediaStatus = adverseMediaStatus;
            return this;
        }

        public Builder adverseMediaStatus(Boolean adverseMediaStatus) {
            this.adverseMediaStatus = Optional.ofNullable(adverseMediaStatus);
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

        @JsonSetter(value = "savedPaymentDetails", nulls = Nulls.SKIP)
        public Builder savedPaymentDetails(Optional<List<UserOptionalSavedPaymentDetailsItem>> savedPaymentDetails) {
            this.savedPaymentDetails = savedPaymentDetails;
            return this;
        }

        public Builder savedPaymentDetails(List<UserOptionalSavedPaymentDetailsItem> savedPaymentDetails) {
            this.savedPaymentDetails = Optional.ofNullable(savedPaymentDetails);
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

        public UserOptional build() {
            return new UserOptional(
                    activatedTimestamp,
                    userDetails,
                    userStateDetails,
                    kycStatusDetails,
                    eoddDate,
                    employmentStatus,
                    occupation,
                    legalDocuments,
                    contactDetails,
                    employmentDetails,
                    transactionLimits,
                    expectedIncome,
                    riskLevel,
                    kycRiskLevel,
                    acquisitionChannel,
                    reasonForAccountOpening,
                    sourceOfFunds,
                    userSegment,
                    pepStatus,
                    sanctionsStatus,
                    adverseMediaStatus,
                    lastTransactionTimestamp,
                    linkedEntities,
                    savedPaymentDetails,
                    tags,
                    attachments,
                    updateCount,
                    additionalProperties);
        }
    }
}
