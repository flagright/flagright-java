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
@JsonDeserialize(builder = FileInfo.Builder.class)
public final class FileInfo {
    private final String s3Key;

    private final Optional<String> bucket;

    private final String filename;

    private final double size;

    private final Optional<String> downloadLink;

    private final Optional<String> aiSummary;

    private final Map<String, Object> additionalProperties;

    private FileInfo(
            String s3Key,
            Optional<String> bucket,
            String filename,
            double size,
            Optional<String> downloadLink,
            Optional<String> aiSummary,
            Map<String, Object> additionalProperties) {
        this.s3Key = s3Key;
        this.bucket = bucket;
        this.filename = filename;
        this.size = size;
        this.downloadLink = downloadLink;
        this.aiSummary = aiSummary;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("s3Key")
    public String getS3Key() {
        return s3Key;
    }

    @JsonProperty("bucket")
    public Optional<String> getBucket() {
        return bucket;
    }

    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    @JsonProperty("size")
    public double getSize() {
        return size;
    }

    @JsonProperty("downloadLink")
    public Optional<String> getDownloadLink() {
        return downloadLink;
    }

    @JsonProperty("aiSummary")
    public Optional<String> getAiSummary() {
        return aiSummary;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FileInfo && equalTo((FileInfo) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FileInfo other) {
        return s3Key.equals(other.s3Key)
                && bucket.equals(other.bucket)
                && filename.equals(other.filename)
                && size == other.size
                && downloadLink.equals(other.downloadLink)
                && aiSummary.equals(other.aiSummary);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.s3Key, this.bucket, this.filename, this.size, this.downloadLink, this.aiSummary);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static S3KeyStage builder() {
        return new Builder();
    }

    public interface S3KeyStage {
        FilenameStage s3Key(@NotNull String s3Key);

        Builder from(FileInfo other);
    }

    public interface FilenameStage {
        SizeStage filename(@NotNull String filename);
    }

    public interface SizeStage {
        _FinalStage size(double size);
    }

    public interface _FinalStage {
        FileInfo build();

        _FinalStage bucket(Optional<String> bucket);

        _FinalStage bucket(String bucket);

        _FinalStage downloadLink(Optional<String> downloadLink);

        _FinalStage downloadLink(String downloadLink);

        _FinalStage aiSummary(Optional<String> aiSummary);

        _FinalStage aiSummary(String aiSummary);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements S3KeyStage, FilenameStage, SizeStage, _FinalStage {
        private String s3Key;

        private String filename;

        private double size;

        private Optional<String> aiSummary = Optional.empty();

        private Optional<String> downloadLink = Optional.empty();

        private Optional<String> bucket = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(FileInfo other) {
            s3Key(other.getS3Key());
            bucket(other.getBucket());
            filename(other.getFilename());
            size(other.getSize());
            downloadLink(other.getDownloadLink());
            aiSummary(other.getAiSummary());
            return this;
        }

        @java.lang.Override
        @JsonSetter("s3Key")
        public FilenameStage s3Key(@NotNull String s3Key) {
            this.s3Key = Objects.requireNonNull(s3Key, "s3Key must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("filename")
        public SizeStage filename(@NotNull String filename) {
            this.filename = Objects.requireNonNull(filename, "filename must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("size")
        public _FinalStage size(double size) {
            this.size = size;
            return this;
        }

        @java.lang.Override
        public _FinalStage aiSummary(String aiSummary) {
            this.aiSummary = Optional.ofNullable(aiSummary);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "aiSummary", nulls = Nulls.SKIP)
        public _FinalStage aiSummary(Optional<String> aiSummary) {
            this.aiSummary = aiSummary;
            return this;
        }

        @java.lang.Override
        public _FinalStage downloadLink(String downloadLink) {
            this.downloadLink = Optional.ofNullable(downloadLink);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "downloadLink", nulls = Nulls.SKIP)
        public _FinalStage downloadLink(Optional<String> downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }

        @java.lang.Override
        public _FinalStage bucket(String bucket) {
            this.bucket = Optional.ofNullable(bucket);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "bucket", nulls = Nulls.SKIP)
        public _FinalStage bucket(Optional<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        @java.lang.Override
        public FileInfo build() {
            return new FileInfo(s3Key, bucket, filename, size, downloadLink, aiSummary, additionalProperties);
        }
    }
}
