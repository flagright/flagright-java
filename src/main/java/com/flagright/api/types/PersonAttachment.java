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
@JsonDeserialize(builder = PersonAttachment.Builder.class)
public final class PersonAttachment {
    private final Optional<String> id;

    private final Optional<String> comment;

    private final List<FileInfo> files;

    private final String userId;

    private final Optional<Double> createdAt;

    private final Optional<Double> deletedAt;

    private final Map<String, Object> additionalProperties;

    private PersonAttachment(
            Optional<String> id,
            Optional<String> comment,
            List<FileInfo> files,
            String userId,
            Optional<Double> createdAt,
            Optional<Double> deletedAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.comment = comment;
        this.files = files;
        this.userId = userId;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return User's comment on the attached file.
     */
    @JsonProperty("comment")
    public Optional<String> getComment() {
        return comment;
    }

    @JsonProperty("files")
    public List<FileInfo> getFiles() {
        return files;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("createdAt")
    public Optional<Double> getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("deletedAt")
    public Optional<Double> getDeletedAt() {
        return deletedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PersonAttachment && equalTo((PersonAttachment) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PersonAttachment other) {
        return id.equals(other.id)
                && comment.equals(other.comment)
                && files.equals(other.files)
                && userId.equals(other.userId)
                && createdAt.equals(other.createdAt)
                && deletedAt.equals(other.deletedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.comment, this.files, this.userId, this.createdAt, this.deletedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        _FinalStage userId(@NotNull String userId);

        Builder from(PersonAttachment other);
    }

    public interface _FinalStage {
        PersonAttachment build();

        _FinalStage id(Optional<String> id);

        _FinalStage id(String id);

        _FinalStage comment(Optional<String> comment);

        _FinalStage comment(String comment);

        _FinalStage files(List<FileInfo> files);

        _FinalStage addFiles(FileInfo files);

        _FinalStage addAllFiles(List<FileInfo> files);

        _FinalStage createdAt(Optional<Double> createdAt);

        _FinalStage createdAt(Double createdAt);

        _FinalStage deletedAt(Optional<Double> deletedAt);

        _FinalStage deletedAt(Double deletedAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, _FinalStage {
        private String userId;

        private Optional<Double> deletedAt = Optional.empty();

        private Optional<Double> createdAt = Optional.empty();

        private List<FileInfo> files = new ArrayList<>();

        private Optional<String> comment = Optional.empty();

        private Optional<String> id = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PersonAttachment other) {
            id(other.getId());
            comment(other.getComment());
            files(other.getFiles());
            userId(other.getUserId());
            createdAt(other.getCreatedAt());
            deletedAt(other.getDeletedAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("userId")
        public _FinalStage userId(@NotNull String userId) {
            this.userId = Objects.requireNonNull(userId, "userId must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage deletedAt(Double deletedAt) {
            this.deletedAt = Optional.ofNullable(deletedAt);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "deletedAt", nulls = Nulls.SKIP)
        public _FinalStage deletedAt(Optional<Double> deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        @java.lang.Override
        public _FinalStage createdAt(Double createdAt) {
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "createdAt", nulls = Nulls.SKIP)
        public _FinalStage createdAt(Optional<Double> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllFiles(List<FileInfo> files) {
            this.files.addAll(files);
            return this;
        }

        @java.lang.Override
        public _FinalStage addFiles(FileInfo files) {
            this.files.add(files);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "files", nulls = Nulls.SKIP)
        public _FinalStage files(List<FileInfo> files) {
            this.files.clear();
            this.files.addAll(files);
            return this;
        }

        /**
         * <p>User's comment on the attached file.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
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
        public _FinalStage id(String id) {
            this.id = Optional.ofNullable(id);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public _FinalStage id(Optional<String> id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        public PersonAttachment build() {
            return new PersonAttachment(id, comment, files, userId, createdAt, deletedAt, additionalProperties);
        }
    }
}
