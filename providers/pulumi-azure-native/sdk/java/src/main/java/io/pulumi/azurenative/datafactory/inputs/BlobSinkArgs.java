// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.MetadataItemArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Azure Blob sink.
 * 
 */
public final class BlobSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlobSinkArgs Empty = new BlobSinkArgs();

    /**
     * Blob writer add header. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="blobWriterAddHeader")
      private final @Nullable Output<Object> blobWriterAddHeader;

    public Output<Object> blobWriterAddHeader() {
        return this.blobWriterAddHeader == null ? Codegen.empty() : this.blobWriterAddHeader;
    }

    /**
     * Blob writer date time format. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="blobWriterDateTimeFormat")
      private final @Nullable Output<Object> blobWriterDateTimeFormat;

    public Output<Object> blobWriterDateTimeFormat() {
        return this.blobWriterDateTimeFormat == null ? Codegen.empty() : this.blobWriterDateTimeFormat;
    }

    /**
     * Blob writer overwrite files. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="blobWriterOverwriteFiles")
      private final @Nullable Output<Object> blobWriterOverwriteFiles;

    public Output<Object> blobWriterOverwriteFiles() {
        return this.blobWriterOverwriteFiles == null ? Codegen.empty() : this.blobWriterOverwriteFiles;
    }

    /**
     * The type of copy behavior for copy sink.
     * 
     */
    @Import(name="copyBehavior")
      private final @Nullable Output<Object> copyBehavior;

    public Output<Object> copyBehavior() {
        return this.copyBehavior == null ? Codegen.empty() : this.copyBehavior;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> disableMetricsCollection() {
        return this.disableMetricsCollection == null ? Codegen.empty() : this.disableMetricsCollection;
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Codegen.empty() : this.maxConcurrentConnections;
    }

    /**
     * Specify the custom metadata to be added to sink data. Type: array of objects (or Expression with resultType array of objects).
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<List<MetadataItemArgs>> metadata;

    public Output<List<MetadataItemArgs>> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
      private final @Nullable Output<Object> sinkRetryCount;

    public Output<Object> sinkRetryCount() {
        return this.sinkRetryCount == null ? Codegen.empty() : this.sinkRetryCount;
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
      private final @Nullable Output<Object> sinkRetryWait;

    public Output<Object> sinkRetryWait() {
        return this.sinkRetryWait == null ? Codegen.empty() : this.sinkRetryWait;
    }

    /**
     * Copy sink type.
     * Expected value is 'BlobSink'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
      private final @Nullable Output<Object> writeBatchSize;

    public Output<Object> writeBatchSize() {
        return this.writeBatchSize == null ? Codegen.empty() : this.writeBatchSize;
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
      private final @Nullable Output<Object> writeBatchTimeout;

    public Output<Object> writeBatchTimeout() {
        return this.writeBatchTimeout == null ? Codegen.empty() : this.writeBatchTimeout;
    }

    public BlobSinkArgs(
        @Nullable Output<Object> blobWriterAddHeader,
        @Nullable Output<Object> blobWriterDateTimeFormat,
        @Nullable Output<Object> blobWriterOverwriteFiles,
        @Nullable Output<Object> copyBehavior,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<List<MetadataItemArgs>> metadata,
        @Nullable Output<Object> sinkRetryCount,
        @Nullable Output<Object> sinkRetryWait,
        Output<String> type,
        @Nullable Output<Object> writeBatchSize,
        @Nullable Output<Object> writeBatchTimeout) {
        this.blobWriterAddHeader = blobWriterAddHeader;
        this.blobWriterDateTimeFormat = blobWriterDateTimeFormat;
        this.blobWriterOverwriteFiles = blobWriterOverwriteFiles;
        this.copyBehavior = copyBehavior;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.metadata = metadata;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    private BlobSinkArgs() {
        this.blobWriterAddHeader = Codegen.empty();
        this.blobWriterDateTimeFormat = Codegen.empty();
        this.blobWriterOverwriteFiles = Codegen.empty();
        this.copyBehavior = Codegen.empty();
        this.disableMetricsCollection = Codegen.empty();
        this.maxConcurrentConnections = Codegen.empty();
        this.metadata = Codegen.empty();
        this.sinkRetryCount = Codegen.empty();
        this.sinkRetryWait = Codegen.empty();
        this.type = Codegen.empty();
        this.writeBatchSize = Codegen.empty();
        this.writeBatchTimeout = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> blobWriterAddHeader;
        private @Nullable Output<Object> blobWriterDateTimeFormat;
        private @Nullable Output<Object> blobWriterOverwriteFiles;
        private @Nullable Output<Object> copyBehavior;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<List<MetadataItemArgs>> metadata;
        private @Nullable Output<Object> sinkRetryCount;
        private @Nullable Output<Object> sinkRetryWait;
        private Output<String> type;
        private @Nullable Output<Object> writeBatchSize;
        private @Nullable Output<Object> writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobSinkArgs defaults) {
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

        public Builder blobWriterAddHeader(@Nullable Output<Object> blobWriterAddHeader) {
            this.blobWriterAddHeader = blobWriterAddHeader;
            return this;
        }
        public Builder blobWriterAddHeader(@Nullable Object blobWriterAddHeader) {
            this.blobWriterAddHeader = Codegen.ofNullable(blobWriterAddHeader);
            return this;
        }
        public Builder blobWriterDateTimeFormat(@Nullable Output<Object> blobWriterDateTimeFormat) {
            this.blobWriterDateTimeFormat = blobWriterDateTimeFormat;
            return this;
        }
        public Builder blobWriterDateTimeFormat(@Nullable Object blobWriterDateTimeFormat) {
            this.blobWriterDateTimeFormat = Codegen.ofNullable(blobWriterDateTimeFormat);
            return this;
        }
        public Builder blobWriterOverwriteFiles(@Nullable Output<Object> blobWriterOverwriteFiles) {
            this.blobWriterOverwriteFiles = blobWriterOverwriteFiles;
            return this;
        }
        public Builder blobWriterOverwriteFiles(@Nullable Object blobWriterOverwriteFiles) {
            this.blobWriterOverwriteFiles = Codegen.ofNullable(blobWriterOverwriteFiles);
            return this;
        }
        public Builder copyBehavior(@Nullable Output<Object> copyBehavior) {
            this.copyBehavior = copyBehavior;
            return this;
        }
        public Builder copyBehavior(@Nullable Object copyBehavior) {
            this.copyBehavior = Codegen.ofNullable(copyBehavior);
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Codegen.ofNullable(disableMetricsCollection);
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Codegen.ofNullable(maxConcurrentConnections);
            return this;
        }
        public Builder metadata(@Nullable Output<List<MetadataItemArgs>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable List<MetadataItemArgs> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder metadata(MetadataItemArgs... metadata) {
            return metadata(List.of(metadata));
        }
        public Builder sinkRetryCount(@Nullable Output<Object> sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }
        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = Codegen.ofNullable(sinkRetryCount);
            return this;
        }
        public Builder sinkRetryWait(@Nullable Output<Object> sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }
        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = Codegen.ofNullable(sinkRetryWait);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder writeBatchSize(@Nullable Output<Object> writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }
        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = Codegen.ofNullable(writeBatchSize);
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Output<Object> writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = Codegen.ofNullable(writeBatchTimeout);
            return this;
        }        public BlobSinkArgs build() {
            return new BlobSinkArgs(blobWriterAddHeader, blobWriterDateTimeFormat, blobWriterOverwriteFiles, copyBehavior, disableMetricsCollection, maxConcurrentConnections, metadata, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
