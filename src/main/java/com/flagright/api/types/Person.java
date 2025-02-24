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
@JsonDeserialize(builder = Person.Builder.class)
public final class Person {
    private final Optional<String> userId;

    private final UserDetails generalDetails;

    private final Optional<List<LegalDocument>> legalDocuments;

    private final Optional<ContactDetails> contactDetails;

    private final Optional<List<PepStatus>> pepStatus;

    private final Optional<List<Tag>> tags;

    private final Optional<List<PersonAttachment>> attachments;

    private final Map<String, Object> additionalProperties;

    private Person(
            Optional<String> userId,
            UserDetails generalDetails,
            Optional<List<LegalDocument>> legalDocuments,
            Optional<ContactDetails> contactDetails,
            Optional<List<PepStatus>> pepStatus,
            Optional<List<Tag>> tags,
            Optional<List<PersonAttachment>> attachments,
            Map<String, Object> additionalProperties) {
        this.userId = userId;
        this.generalDetails = generalDetails;
        this.legalDocuments = legalDocuments;
        this.contactDetails = contactDetails;
        this.pepStatus = pepStatus;
        this.tags = tags;
        this.attachments = attachments;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Unique user ID for the person
     */
    @JsonProperty("userId")
    public Optional<String> getUserId() {
        return userId;
    }

    @JsonProperty("generalDetails")
    public UserDetails getGeneralDetails() {
        return generalDetails;
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

    @JsonProperty("pepStatus")
    public Optional<List<PepStatus>> getPepStatus() {
        return pepStatus;
    }

    /**
     * @return Additional information that can be added via tags
     */
    @JsonProperty("tags")
    public Optional<List<Tag>> getTags() {
        return tags;
    }

    /**
     * @return User's attachments uploaded by business user
     */
    @JsonProperty("attachments")
    public Optional<List<PersonAttachment>> getAttachments() {
        return attachments;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Person && equalTo((Person) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Person other) {
        return userId.equals(other.userId)
                && generalDetails.equals(other.generalDetails)
                && legalDocuments.equals(other.legalDocuments)
                && contactDetails.equals(other.contactDetails)
                && pepStatus.equals(other.pepStatus)
                && tags.equals(other.tags)
                && attachments.equals(other.attachments);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.userId,
                this.generalDetails,
                this.legalDocuments,
                this.contactDetails,
                this.pepStatus,
                this.tags,
                this.attachments);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static GeneralDetailsStage builder() {
        return new Builder();
    }

    public interface GeneralDetailsStage {
        _FinalStage generalDetails(@NotNull UserDetails generalDetails);

        Builder from(Person other);
    }

    public interface _FinalStage {
        Person build();

        _FinalStage userId(Optional<String> userId);

        _FinalStage userId(String userId);

        _FinalStage legalDocuments(Optional<List<LegalDocument>> legalDocuments);

        _FinalStage legalDocuments(List<LegalDocument> legalDocuments);

        _FinalStage contactDetails(Optional<ContactDetails> contactDetails);

        _FinalStage contactDetails(ContactDetails contactDetails);

        _FinalStage pepStatus(Optional<List<PepStatus>> pepStatus);

        _FinalStage pepStatus(List<PepStatus> pepStatus);

        _FinalStage tags(Optional<List<Tag>> tags);

        _FinalStage tags(List<Tag> tags);

        _FinalStage attachments(Optional<List<PersonAttachment>> attachments);

        _FinalStage attachments(List<PersonAttachment> attachments);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements GeneralDetailsStage, _FinalStage {
        private UserDetails generalDetails;

        private Optional<List<PersonAttachment>> attachments = Optional.empty();

        private Optional<List<Tag>> tags = Optional.empty();

        private Optional<List<PepStatus>> pepStatus = Optional.empty();

        private Optional<ContactDetails> contactDetails = Optional.empty();

        private Optional<List<LegalDocument>> legalDocuments = Optional.empty();

        private Optional<String> userId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Person other) {
            userId(other.getUserId());
            generalDetails(other.getGeneralDetails());
            legalDocuments(other.getLegalDocuments());
            contactDetails(other.getContactDetails());
            pepStatus(other.getPepStatus());
            tags(other.getTags());
            attachments(other.getAttachments());
            return this;
        }

        @java.lang.Override
        @JsonSetter("generalDetails")
        public _FinalStage generalDetails(@NotNull UserDetails generalDetails) {
            this.generalDetails = Objects.requireNonNull(generalDetails, "generalDetails must not be null");
            return this;
        }

        /**
         * <p>User's attachments uploaded by business user</p>
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
        public _FinalStage tags(List<Tag> tags) {
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "tags", nulls = Nulls.SKIP)
        public _FinalStage tags(Optional<List<Tag>> tags) {
            this.tags = tags;
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

        /**
         * <p>Unique user ID for the person</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
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
        public Person build() {
            return new Person(
                    userId,
                    generalDetails,
                    legalDocuments,
                    contactDetails,
                    pepStatus,
                    tags,
                    attachments,
                    additionalProperties);
        }
    }
}
