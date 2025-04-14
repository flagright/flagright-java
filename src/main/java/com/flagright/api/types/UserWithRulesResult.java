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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = UserWithRulesResult.Builder.class)
public final class UserWithRulesResult {
    private final String userId;

    private final double createdTimestamp;

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

    private final Optional<Double> lastTransactionTimestamp;

    private final Optional<UserEntityLink> linkedEntities;

    private final Optional<List<UserWithRulesResultSavedPaymentDetailsItem>> savedPaymentDetails;

    private final Optional<List<UserTag>> tags;

    private final Optional<List<PersonAttachment>> attachments;

    private final Optional<List<ExecutedRulesResult>> executedRules;

    private final Optional<List<HitRulesDetails>> hitRules;

    private final Optional<UserRiskScoreDetails> riskScoreDetails;

    private final Map<String, Object> additionalProperties;

    private UserWithRulesResult(
            String userId,
            double createdTimestamp,
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
            Optional<Double> lastTransactionTimestamp,
            Optional<UserEntityLink> linkedEntities,
            Optional<List<UserWithRulesResultSavedPaymentDetailsItem>> savedPaymentDetails,
            Optional<List<UserTag>> tags,
            Optional<List<PersonAttachment>> attachments,
            Optional<List<ExecutedRulesResult>> executedRules,
            Optional<List<HitRulesDetails>> hitRules,
            Optional<UserRiskScoreDetails> riskScoreDetails,
            Map<String, Object> additionalProperties) {
        this.userId = userId;
        this.createdTimestamp = createdTimestamp;
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
        this.lastTransactionTimestamp = lastTransactionTimestamp;
        this.linkedEntities = linkedEntities;
        this.savedPaymentDetails = savedPaymentDetails;
        this.tags = tags;
        this.attachments = attachments;
        this.executedRules = executedRules;
        this.hitRules = hitRules;
        this.riskScoreDetails = riskScoreDetails;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Unique user ID
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * @return Timestamp when userId is created
     */
    @JsonProperty("createdTimestamp")
    public double getCreatedTimestamp() {
        return createdTimestamp;
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
    public Optional<List<UserWithRulesResultSavedPaymentDetailsItem>> getSavedPaymentDetails() {
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

    @JsonProperty("executedRules")
    public Optional<List<ExecutedRulesResult>> getExecutedRules() {
        return executedRules;
    }

    @JsonProperty("hitRules")
    public Optional<List<HitRulesDetails>> getHitRules() {
        return hitRules;
    }

    @JsonProperty("riskScoreDetails")
    public Optional<UserRiskScoreDetails> getRiskScoreDetails() {
        return riskScoreDetails;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserWithRulesResult && equalTo((UserWithRulesResult) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserWithRulesResult other) {
        return userId.equals(other.userId)
                && createdTimestamp == other.createdTimestamp
                && activatedTimestamp.equals(other.activatedTimestamp)
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
                && lastTransactionTimestamp.equals(other.lastTransactionTimestamp)
                && linkedEntities.equals(other.linkedEntities)
                && savedPaymentDetails.equals(other.savedPaymentDetails)
                && tags.equals(other.tags)
                && attachments.equals(other.attachments)
                && executedRules.equals(other.executedRules)
                && hitRules.equals(other.hitRules)
                && riskScoreDetails.equals(other.riskScoreDetails);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.userId,
                this.createdTimestamp,
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
                this.lastTransactionTimestamp,
                this.linkedEntities,
                this.savedPaymentDetails,
                this.tags,
                this.attachments,
                this.executedRules,
                this.hitRules,
                this.riskScoreDetails);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        CreatedTimestampStage userId(@NotNull String userId);

        Builder from(UserWithRulesResult other);
    }

    public interface CreatedTimestampStage {
        _FinalStage createdTimestamp(double createdTimestamp);
    }

    public interface _FinalStage {
        UserWithRulesResult build();

        _FinalStage activatedTimestamp(Optional<Double> activatedTimestamp);

        _FinalStage activatedTimestamp(Double activatedTimestamp);

        _FinalStage userDetails(Optional<UserDetails> userDetails);

        _FinalStage userDetails(UserDetails userDetails);

        _FinalStage userStateDetails(Optional<UserStateDetails> userStateDetails);

        _FinalStage userStateDetails(UserStateDetails userStateDetails);

        _FinalStage kycStatusDetails(Optional<KycStatusDetails> kycStatusDetails);

        _FinalStage kycStatusDetails(KycStatusDetails kycStatusDetails);

        _FinalStage eoddDate(Optional<Double> eoddDate);

        _FinalStage eoddDate(Double eoddDate);

        _FinalStage employmentStatus(Optional<EmploymentStatus> employmentStatus);

        _FinalStage employmentStatus(EmploymentStatus employmentStatus);

        _FinalStage occupation(Optional<String> occupation);

        _FinalStage occupation(String occupation);

        _FinalStage legalDocuments(Optional<List<LegalDocument>> legalDocuments);

        _FinalStage legalDocuments(List<LegalDocument> legalDocuments);

        _FinalStage contactDetails(Optional<ContactDetails> contactDetails);

        _FinalStage contactDetails(ContactDetails contactDetails);

        _FinalStage employmentDetails(Optional<EmploymentDetails> employmentDetails);

        _FinalStage employmentDetails(EmploymentDetails employmentDetails);

        _FinalStage transactionLimits(Optional<TransactionLimits> transactionLimits);

        _FinalStage transactionLimits(TransactionLimits transactionLimits);

        _FinalStage expectedIncome(Optional<ExpectedIncome> expectedIncome);

        _FinalStage expectedIncome(ExpectedIncome expectedIncome);

        _FinalStage riskLevel(Optional<RiskLevel> riskLevel);

        _FinalStage riskLevel(RiskLevel riskLevel);

        _FinalStage kycRiskLevel(Optional<RiskLevel> kycRiskLevel);

        _FinalStage kycRiskLevel(RiskLevel kycRiskLevel);

        _FinalStage acquisitionChannel(Optional<AcquisitionChannel> acquisitionChannel);

        _FinalStage acquisitionChannel(AcquisitionChannel acquisitionChannel);

        _FinalStage reasonForAccountOpening(Optional<List<String>> reasonForAccountOpening);

        _FinalStage reasonForAccountOpening(List<String> reasonForAccountOpening);

        _FinalStage sourceOfFunds(Optional<List<SourceOfFunds>> sourceOfFunds);

        _FinalStage sourceOfFunds(List<SourceOfFunds> sourceOfFunds);

        _FinalStage userSegment(Optional<ConsumerUserSegment> userSegment);

        _FinalStage userSegment(ConsumerUserSegment userSegment);

        _FinalStage pepStatus(Optional<List<PepStatus>> pepStatus);

        _FinalStage pepStatus(List<PepStatus> pepStatus);

        _FinalStage lastTransactionTimestamp(Optional<Double> lastTransactionTimestamp);

        _FinalStage lastTransactionTimestamp(Double lastTransactionTimestamp);

        _FinalStage linkedEntities(Optional<UserEntityLink> linkedEntities);

        _FinalStage linkedEntities(UserEntityLink linkedEntities);

        _FinalStage savedPaymentDetails(Optional<List<UserWithRulesResultSavedPaymentDetailsItem>> savedPaymentDetails);

        _FinalStage savedPaymentDetails(List<UserWithRulesResultSavedPaymentDetailsItem> savedPaymentDetails);

        _FinalStage tags(Optional<List<UserTag>> tags);

        _FinalStage tags(List<UserTag> tags);

        _FinalStage attachments(Optional<List<PersonAttachment>> attachments);

        _FinalStage attachments(List<PersonAttachment> attachments);

        _FinalStage executedRules(Optional<List<ExecutedRulesResult>> executedRules);

        _FinalStage executedRules(List<ExecutedRulesResult> executedRules);

        _FinalStage hitRules(Optional<List<HitRulesDetails>> hitRules);

        _FinalStage hitRules(List<HitRulesDetails> hitRules);

        _FinalStage riskScoreDetails(Optional<UserRiskScoreDetails> riskScoreDetails);

        _FinalStage riskScoreDetails(UserRiskScoreDetails riskScoreDetails);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, CreatedTimestampStage, _FinalStage {
        private String userId;

        private double createdTimestamp;

        private Optional<UserRiskScoreDetails> riskScoreDetails = Optional.empty();

        private Optional<List<HitRulesDetails>> hitRules = Optional.empty();

        private Optional<List<ExecutedRulesResult>> executedRules = Optional.empty();

        private Optional<List<PersonAttachment>> attachments = Optional.empty();

        private Optional<List<UserTag>> tags = Optional.empty();

        private Optional<List<UserWithRulesResultSavedPaymentDetailsItem>> savedPaymentDetails = Optional.empty();

        private Optional<UserEntityLink> linkedEntities = Optional.empty();

        private Optional<Double> lastTransactionTimestamp = Optional.empty();

        private Optional<List<PepStatus>> pepStatus = Optional.empty();

        private Optional<ConsumerUserSegment> userSegment = Optional.empty();

        private Optional<List<SourceOfFunds>> sourceOfFunds = Optional.empty();

        private Optional<List<String>> reasonForAccountOpening = Optional.empty();

        private Optional<AcquisitionChannel> acquisitionChannel = Optional.empty();

        private Optional<RiskLevel> kycRiskLevel = Optional.empty();

        private Optional<RiskLevel> riskLevel = Optional.empty();

        private Optional<ExpectedIncome> expectedIncome = Optional.empty();

        private Optional<TransactionLimits> transactionLimits = Optional.empty();

        private Optional<EmploymentDetails> employmentDetails = Optional.empty();

        private Optional<ContactDetails> contactDetails = Optional.empty();

        private Optional<List<LegalDocument>> legalDocuments = Optional.empty();

        private Optional<String> occupation = Optional.empty();

        private Optional<EmploymentStatus> employmentStatus = Optional.empty();

        private Optional<Double> eoddDate = Optional.empty();

        private Optional<KycStatusDetails> kycStatusDetails = Optional.empty();

        private Optional<UserStateDetails> userStateDetails = Optional.empty();

        private Optional<UserDetails> userDetails = Optional.empty();

        private Optional<Double> activatedTimestamp = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UserWithRulesResult other) {
            userId(other.getUserId());
            createdTimestamp(other.getCreatedTimestamp());
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
            lastTransactionTimestamp(other.getLastTransactionTimestamp());
            linkedEntities(other.getLinkedEntities());
            savedPaymentDetails(other.getSavedPaymentDetails());
            tags(other.getTags());
            attachments(other.getAttachments());
            executedRules(other.getExecutedRules());
            hitRules(other.getHitRules());
            riskScoreDetails(other.getRiskScoreDetails());
            return this;
        }

        /**
         * <p>Unique user ID</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("userId")
        public CreatedTimestampStage userId(@NotNull String userId) {
            this.userId = Objects.requireNonNull(userId, "userId must not be null");
            return this;
        }

        /**
         * <p>Timestamp when userId is created</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("createdTimestamp")
        public _FinalStage createdTimestamp(double createdTimestamp) {
            this.createdTimestamp = createdTimestamp;
            return this;
        }

        @java.lang.Override
        public _FinalStage riskScoreDetails(UserRiskScoreDetails riskScoreDetails) {
            this.riskScoreDetails = Optional.ofNullable(riskScoreDetails);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "riskScoreDetails", nulls = Nulls.SKIP)
        public _FinalStage riskScoreDetails(Optional<UserRiskScoreDetails> riskScoreDetails) {
            this.riskScoreDetails = riskScoreDetails;
            return this;
        }

        @java.lang.Override
        public _FinalStage hitRules(List<HitRulesDetails> hitRules) {
            this.hitRules = Optional.ofNullable(hitRules);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "hitRules", nulls = Nulls.SKIP)
        public _FinalStage hitRules(Optional<List<HitRulesDetails>> hitRules) {
            this.hitRules = hitRules;
            return this;
        }

        @java.lang.Override
        public _FinalStage executedRules(List<ExecutedRulesResult> executedRules) {
            this.executedRules = Optional.ofNullable(executedRules);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "executedRules", nulls = Nulls.SKIP)
        public _FinalStage executedRules(Optional<List<ExecutedRulesResult>> executedRules) {
            this.executedRules = executedRules;
            return this;
        }

        /**
         * <p>Uploaded user's attachment</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage attachments(List<PersonAttachment> attachments) {
            this.attachments = Optional.ofNullable(attachments);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "attachments", nulls = Nulls.SKIP)
        public _FinalStage attachments(Optional<List<PersonAttachment>> attachments) {
            this.attachments = attachments;
            return this;
        }

        /**
         * <p>Additional information that can be added via tags</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage tags(List<UserTag> tags) {
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "tags", nulls = Nulls.SKIP)
        public _FinalStage tags(Optional<List<UserTag>> tags) {
            this.tags = tags;
            return this;
        }

        @java.lang.Override
        public _FinalStage savedPaymentDetails(List<UserWithRulesResultSavedPaymentDetailsItem> savedPaymentDetails) {
            this.savedPaymentDetails = Optional.ofNullable(savedPaymentDetails);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "savedPaymentDetails", nulls = Nulls.SKIP)
        public _FinalStage savedPaymentDetails(
                Optional<List<UserWithRulesResultSavedPaymentDetailsItem>> savedPaymentDetails) {
            this.savedPaymentDetails = savedPaymentDetails;
            return this;
        }

        @java.lang.Override
        public _FinalStage linkedEntities(UserEntityLink linkedEntities) {
            this.linkedEntities = Optional.ofNullable(linkedEntities);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "linkedEntities", nulls = Nulls.SKIP)
        public _FinalStage linkedEntities(Optional<UserEntityLink> linkedEntities) {
            this.linkedEntities = linkedEntities;
            return this;
        }

        /**
         * <p>Timestamp of the last successful transaction of the user</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage lastTransactionTimestamp(Double lastTransactionTimestamp) {
            this.lastTransactionTimestamp = Optional.ofNullable(lastTransactionTimestamp);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "lastTransactionTimestamp", nulls = Nulls.SKIP)
        public _FinalStage lastTransactionTimestamp(Optional<Double> lastTransactionTimestamp) {
            this.lastTransactionTimestamp = lastTransactionTimestamp;
            return this;
        }

        @java.lang.Override
        public _FinalStage pepStatus(List<PepStatus> pepStatus) {
            this.pepStatus = Optional.ofNullable(pepStatus);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "pepStatus", nulls = Nulls.SKIP)
        public _FinalStage pepStatus(Optional<List<PepStatus>> pepStatus) {
            this.pepStatus = pepStatus;
            return this;
        }

        @java.lang.Override
        public _FinalStage userSegment(ConsumerUserSegment userSegment) {
            this.userSegment = Optional.ofNullable(userSegment);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "userSegment", nulls = Nulls.SKIP)
        public _FinalStage userSegment(Optional<ConsumerUserSegment> userSegment) {
            this.userSegment = userSegment;
            return this;
        }

        @java.lang.Override
        public _FinalStage sourceOfFunds(List<SourceOfFunds> sourceOfFunds) {
            this.sourceOfFunds = Optional.ofNullable(sourceOfFunds);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "sourceOfFunds", nulls = Nulls.SKIP)
        public _FinalStage sourceOfFunds(Optional<List<SourceOfFunds>> sourceOfFunds) {
            this.sourceOfFunds = sourceOfFunds;
            return this;
        }

        @java.lang.Override
        public _FinalStage reasonForAccountOpening(List<String> reasonForAccountOpening) {
            this.reasonForAccountOpening = Optional.ofNullable(reasonForAccountOpening);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "reasonForAccountOpening", nulls = Nulls.SKIP)
        public _FinalStage reasonForAccountOpening(Optional<List<String>> reasonForAccountOpening) {
            this.reasonForAccountOpening = reasonForAccountOpening;
            return this;
        }

        @java.lang.Override
        public _FinalStage acquisitionChannel(AcquisitionChannel acquisitionChannel) {
            this.acquisitionChannel = Optional.ofNullable(acquisitionChannel);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "acquisitionChannel", nulls = Nulls.SKIP)
        public _FinalStage acquisitionChannel(Optional<AcquisitionChannel> acquisitionChannel) {
            this.acquisitionChannel = acquisitionChannel;
            return this;
        }

        @java.lang.Override
        public _FinalStage kycRiskLevel(RiskLevel kycRiskLevel) {
            this.kycRiskLevel = Optional.ofNullable(kycRiskLevel);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "kycRiskLevel", nulls = Nulls.SKIP)
        public _FinalStage kycRiskLevel(Optional<RiskLevel> kycRiskLevel) {
            this.kycRiskLevel = kycRiskLevel;
            return this;
        }

        @java.lang.Override
        public _FinalStage riskLevel(RiskLevel riskLevel) {
            this.riskLevel = Optional.ofNullable(riskLevel);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "riskLevel", nulls = Nulls.SKIP)
        public _FinalStage riskLevel(Optional<RiskLevel> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }

        @java.lang.Override
        public _FinalStage expectedIncome(ExpectedIncome expectedIncome) {
            this.expectedIncome = Optional.ofNullable(expectedIncome);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "expectedIncome", nulls = Nulls.SKIP)
        public _FinalStage expectedIncome(Optional<ExpectedIncome> expectedIncome) {
            this.expectedIncome = expectedIncome;
            return this;
        }

        @java.lang.Override
        public _FinalStage transactionLimits(TransactionLimits transactionLimits) {
            this.transactionLimits = Optional.ofNullable(transactionLimits);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "transactionLimits", nulls = Nulls.SKIP)
        public _FinalStage transactionLimits(Optional<TransactionLimits> transactionLimits) {
            this.transactionLimits = transactionLimits;
            return this;
        }

        @java.lang.Override
        public _FinalStage employmentDetails(EmploymentDetails employmentDetails) {
            this.employmentDetails = Optional.ofNullable(employmentDetails);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "employmentDetails", nulls = Nulls.SKIP)
        public _FinalStage employmentDetails(Optional<EmploymentDetails> employmentDetails) {
            this.employmentDetails = employmentDetails;
            return this;
        }

        @java.lang.Override
        public _FinalStage contactDetails(ContactDetails contactDetails) {
            this.contactDetails = Optional.ofNullable(contactDetails);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "contactDetails", nulls = Nulls.SKIP)
        public _FinalStage contactDetails(Optional<ContactDetails> contactDetails) {
            this.contactDetails = contactDetails;
            return this;
        }

        /**
         * <p>User's legal identity documents - See Document Model for details</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage legalDocuments(List<LegalDocument> legalDocuments) {
            this.legalDocuments = Optional.ofNullable(legalDocuments);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "legalDocuments", nulls = Nulls.SKIP)
        public _FinalStage legalDocuments(Optional<List<LegalDocument>> legalDocuments) {
            this.legalDocuments = legalDocuments;
            return this;
        }

        @java.lang.Override
        public _FinalStage occupation(String occupation) {
            this.occupation = Optional.ofNullable(occupation);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "occupation", nulls = Nulls.SKIP)
        public _FinalStage occupation(Optional<String> occupation) {
            this.occupation = occupation;
            return this;
        }

        @java.lang.Override
        public _FinalStage employmentStatus(EmploymentStatus employmentStatus) {
            this.employmentStatus = Optional.ofNullable(employmentStatus);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "employmentStatus", nulls = Nulls.SKIP)
        public _FinalStage employmentStatus(Optional<EmploymentStatus> employmentStatus) {
            this.employmentStatus = employmentStatus;
            return this;
        }

        @java.lang.Override
        public _FinalStage eoddDate(Double eoddDate) {
            this.eoddDate = Optional.ofNullable(eoddDate);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "eoddDate", nulls = Nulls.SKIP)
        public _FinalStage eoddDate(Optional<Double> eoddDate) {
            this.eoddDate = eoddDate;
            return this;
        }

        @java.lang.Override
        public _FinalStage kycStatusDetails(KycStatusDetails kycStatusDetails) {
            this.kycStatusDetails = Optional.ofNullable(kycStatusDetails);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "kycStatusDetails", nulls = Nulls.SKIP)
        public _FinalStage kycStatusDetails(Optional<KycStatusDetails> kycStatusDetails) {
            this.kycStatusDetails = kycStatusDetails;
            return this;
        }

        @java.lang.Override
        public _FinalStage userStateDetails(UserStateDetails userStateDetails) {
            this.userStateDetails = Optional.ofNullable(userStateDetails);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "userStateDetails", nulls = Nulls.SKIP)
        public _FinalStage userStateDetails(Optional<UserStateDetails> userStateDetails) {
            this.userStateDetails = userStateDetails;
            return this;
        }

        @java.lang.Override
        public _FinalStage userDetails(UserDetails userDetails) {
            this.userDetails = Optional.ofNullable(userDetails);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "userDetails", nulls = Nulls.SKIP)
        public _FinalStage userDetails(Optional<UserDetails> userDetails) {
            this.userDetails = userDetails;
            return this;
        }

        /**
         * <p>Timestamp when user was activated</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage activatedTimestamp(Double activatedTimestamp) {
            this.activatedTimestamp = Optional.ofNullable(activatedTimestamp);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "activatedTimestamp", nulls = Nulls.SKIP)
        public _FinalStage activatedTimestamp(Optional<Double> activatedTimestamp) {
            this.activatedTimestamp = activatedTimestamp;
            return this;
        }

        @java.lang.Override
        public UserWithRulesResult build() {
            return new UserWithRulesResult(
                    userId,
                    createdTimestamp,
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
                    lastTransactionTimestamp,
                    linkedEntities,
                    savedPaymentDetails,
                    tags,
                    attachments,
                    executedRules,
                    hitRules,
                    riskScoreDetails,
                    additionalProperties);
        }
    }
}
