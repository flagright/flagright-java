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
@JsonDeserialize(builder = SanctionsDetails.Builder.class)
public final class SanctionsDetails {
    private final String name;

    private final String searchId;

    private final Optional<String> iban;

    private final Optional<SanctionsDetailsEntityType> entityType;

    private final Optional<List<String>> sanctionHitIds;

    private final Optional<SanctionsHitContext> hitContext;

    private final Map<String, Object> additionalProperties;

    private SanctionsDetails(
            String name,
            String searchId,
            Optional<String> iban,
            Optional<SanctionsDetailsEntityType> entityType,
            Optional<List<String>> sanctionHitIds,
            Optional<SanctionsHitContext> hitContext,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.searchId = searchId;
        this.iban = iban;
        this.entityType = entityType;
        this.sanctionHitIds = sanctionHitIds;
        this.hitContext = hitContext;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("searchId")
    public String getSearchId() {
        return searchId;
    }

    @JsonProperty("iban")
    public Optional<String> getIban() {
        return iban;
    }

    @JsonProperty("entityType")
    public Optional<SanctionsDetailsEntityType> getEntityType() {
        return entityType;
    }

    @JsonProperty("sanctionHitIds")
    public Optional<List<String>> getSanctionHitIds() {
        return sanctionHitIds;
    }

    @JsonProperty("hitContext")
    public Optional<SanctionsHitContext> getHitContext() {
        return hitContext;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SanctionsDetails && equalTo((SanctionsDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SanctionsDetails other) {
        return name.equals(other.name)
                && searchId.equals(other.searchId)
                && iban.equals(other.iban)
                && entityType.equals(other.entityType)
                && sanctionHitIds.equals(other.sanctionHitIds)
                && hitContext.equals(other.hitContext);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.searchId, this.iban, this.entityType, this.sanctionHitIds, this.hitContext);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        SearchIdStage name(@NotNull String name);

        Builder from(SanctionsDetails other);
    }

    public interface SearchIdStage {
        _FinalStage searchId(@NotNull String searchId);
    }

    public interface _FinalStage {
        SanctionsDetails build();

        _FinalStage iban(Optional<String> iban);

        _FinalStage iban(String iban);

        _FinalStage entityType(Optional<SanctionsDetailsEntityType> entityType);

        _FinalStage entityType(SanctionsDetailsEntityType entityType);

        _FinalStage sanctionHitIds(Optional<List<String>> sanctionHitIds);

        _FinalStage sanctionHitIds(List<String> sanctionHitIds);

        _FinalStage hitContext(Optional<SanctionsHitContext> hitContext);

        _FinalStage hitContext(SanctionsHitContext hitContext);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, SearchIdStage, _FinalStage {
        private String name;

        private String searchId;

        private Optional<SanctionsHitContext> hitContext = Optional.empty();

        private Optional<List<String>> sanctionHitIds = Optional.empty();

        private Optional<SanctionsDetailsEntityType> entityType = Optional.empty();

        private Optional<String> iban = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(SanctionsDetails other) {
            name(other.getName());
            searchId(other.getSearchId());
            iban(other.getIban());
            entityType(other.getEntityType());
            sanctionHitIds(other.getSanctionHitIds());
            hitContext(other.getHitContext());
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public SearchIdStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("searchId")
        public _FinalStage searchId(@NotNull String searchId) {
            this.searchId = Objects.requireNonNull(searchId, "searchId must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage hitContext(SanctionsHitContext hitContext) {
            this.hitContext = Optional.ofNullable(hitContext);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "hitContext", nulls = Nulls.SKIP)
        public _FinalStage hitContext(Optional<SanctionsHitContext> hitContext) {
            this.hitContext = hitContext;
            return this;
        }

        @java.lang.Override
        public _FinalStage sanctionHitIds(List<String> sanctionHitIds) {
            this.sanctionHitIds = Optional.ofNullable(sanctionHitIds);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "sanctionHitIds", nulls = Nulls.SKIP)
        public _FinalStage sanctionHitIds(Optional<List<String>> sanctionHitIds) {
            this.sanctionHitIds = sanctionHitIds;
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
        public SanctionsDetails build() {
            return new SanctionsDetails(
                    name, searchId, iban, entityType, sanctionHitIds, hitContext, additionalProperties);
        }
    }
}
