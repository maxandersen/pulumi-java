// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.MetadataItemResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BlobSinkResponse {
    /**
     * Blob writer add header. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object blobWriterAddHeader;
    /**
     * Blob writer date time format. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object blobWriterDateTimeFormat;
    /**
     * Blob writer overwrite files. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object blobWriterOverwriteFiles;
    /**
     * The type of copy behavior for copy sink.
     * 
     */
    private final @Nullable Object copyBehavior;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * Specify the custom metadata to be added to sink data. Type: array of objects (or Expression with resultType array of objects).
     * 
     */
    private final @Nullable List<MetadataItemResponse> metadata;
    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sinkRetryCount;
    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sinkRetryWait;
    /**
     * Copy sink type.
     * Expected value is &#39;BlobSink&#39;.
     * 
     */
    private final String type;
    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    private final @Nullable Object writeBatchSize;
    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object writeBatchTimeout;

    @CustomType.Constructor
    private BlobSinkResponse(
        @CustomType.Parameter("blobWriterAddHeader") @Nullable Object blobWriterAddHeader,
        @CustomType.Parameter("blobWriterDateTimeFormat") @Nullable Object blobWriterDateTimeFormat,
        @CustomType.Parameter("blobWriterOverwriteFiles") @Nullable Object blobWriterOverwriteFiles,
        @CustomType.Parameter("copyBehavior") @Nullable Object copyBehavior,
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("metadata") @Nullable List<MetadataItemResponse> metadata,
        @CustomType.Parameter("sinkRetryCount") @Nullable Object sinkRetryCount,
        @CustomType.Parameter("sinkRetryWait") @Nullable Object sinkRetryWait,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("writeBatchSize") @Nullable Object writeBatchSize,
        @CustomType.Parameter("writeBatchTimeout") @Nullable Object writeBatchTimeout) {
        this.blobWriterAddHeader = blobWriterAddHeader;
        this.blobWriterDateTimeFormat = blobWriterDateTimeFormat;
        this.blobWriterOverwriteFiles = blobWriterOverwriteFiles;
        this.copyBehavior = copyBehavior;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.metadata = metadata;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = type;
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    /**
     * Blob writer add header. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> blobWriterAddHeader() {
        return Optional.ofNullable(this.blobWriterAddHeader);
    }
    /**
     * Blob writer date time format. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> blobWriterDateTimeFormat() {
        return Optional.ofNullable(this.blobWriterDateTimeFormat);
    }
    /**
     * Blob writer overwrite files. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> blobWriterOverwriteFiles() {
        return Optional.ofNullable(this.blobWriterOverwriteFiles);
    }
    /**
     * The type of copy behavior for copy sink.
     * 
    */
    public Optional<Object> copyBehavior() {
        return Optional.ofNullable(this.copyBehavior);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * Specify the custom metadata to be added to sink data. Type: array of objects (or Expression with resultType array of objects).
     * 
    */
    public List<MetadataItemResponse> metadata() {
        return this.metadata == null ? List.of() : this.metadata;
    }
    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> sinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }
    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> sinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }
    /**
     * Copy sink type.
     * Expected value is &#39;BlobSink&#39;.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
    */
    public Optional<Object> writeBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }
    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> writeBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object blobWriterAddHeader;
        private @Nullable Object blobWriterDateTimeFormat;
        private @Nullable Object blobWriterOverwriteFiles;
        private @Nullable Object copyBehavior;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable List<MetadataItemResponse> metadata;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobWriterAddHeader = defaults.blobWriterAddHeader;
    	      this.blobWriterDateTimeFormat = defaults.blobWriterDateTimeFormat;
    	      this.blobWriterOverwriteFiles = defaults.blobWriterOverwriteFiles;
    	      this.copyBehavior = defaults.copyBehavior;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.metadata = defaults.metadata;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder blobWriterAddHeader(@Nullable Object blobWriterAddHeader) {
            this.blobWriterAddHeader = blobWriterAddHeader;
            return this;
        }
        public Builder blobWriterDateTimeFormat(@Nullable Object blobWriterDateTimeFormat) {
            this.blobWriterDateTimeFormat = blobWriterDateTimeFormat;
            return this;
        }
        public Builder blobWriterOverwriteFiles(@Nullable Object blobWriterOverwriteFiles) {
            this.blobWriterOverwriteFiles = blobWriterOverwriteFiles;
            return this;
        }
        public Builder copyBehavior(@Nullable Object copyBehavior) {
            this.copyBehavior = copyBehavior;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder metadata(@Nullable List<MetadataItemResponse> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(MetadataItemResponse... metadata) {
            return metadata(List.of(metadata));
        }
        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }
        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }        public BlobSinkResponse build() {
            return new BlobSinkResponse(blobWriterAddHeader, blobWriterDateTimeFormat, blobWriterOverwriteFiles, copyBehavior, disableMetricsCollection, maxConcurrentConnections, metadata, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
