// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Azure Data Explorer sink.
 * 
 */
public final class AzureDataExplorerSinkResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureDataExplorerSinkResponse Empty = new AzureDataExplorerSinkResponse();

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Object disableMetricsCollection;

    public Optional<Object> disableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * If set to true, any aggregation will be skipped. Default is false. Type: boolean.
     * 
     */
    @Import(name="flushImmediately")
      private final @Nullable Object flushImmediately;

    public Optional<Object> flushImmediately() {
        return this.flushImmediately == null ? Optional.empty() : Optional.ofNullable(this.flushImmediately);
    }

    /**
     * An explicit column mapping description provided in a json format. Type: string.
     * 
     */
    @Import(name="ingestionMappingAsJson")
      private final @Nullable Object ingestionMappingAsJson;

    public Optional<Object> ingestionMappingAsJson() {
        return this.ingestionMappingAsJson == null ? Optional.empty() : Optional.ofNullable(this.ingestionMappingAsJson);
    }

    /**
     * A name of a pre-created csv mapping that was defined on the target Kusto table. Type: string.
     * 
     */
    @Import(name="ingestionMappingName")
      private final @Nullable Object ingestionMappingName;

    public Optional<Object> ingestionMappingName() {
        return this.ingestionMappingName == null ? Optional.empty() : Optional.ofNullable(this.ingestionMappingName);
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
      private final @Nullable Object sinkRetryCount;

    public Optional<Object> sinkRetryCount() {
        return this.sinkRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sinkRetryCount);
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
      private final @Nullable Object sinkRetryWait;

    public Optional<Object> sinkRetryWait() {
        return this.sinkRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sinkRetryWait);
    }

    /**
     * Copy sink type.
     * Expected value is &#39;AzureDataExplorerSink&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
      private final @Nullable Object writeBatchSize;

    public Optional<Object> writeBatchSize() {
        return this.writeBatchSize == null ? Optional.empty() : Optional.ofNullable(this.writeBatchSize);
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
      private final @Nullable Object writeBatchTimeout;

    public Optional<Object> writeBatchTimeout() {
        return this.writeBatchTimeout == null ? Optional.empty() : Optional.ofNullable(this.writeBatchTimeout);
    }

    public AzureDataExplorerSinkResponse(
        @Nullable Object disableMetricsCollection,
        @Nullable Object flushImmediately,
        @Nullable Object ingestionMappingAsJson,
        @Nullable Object ingestionMappingName,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object sinkRetryCount,
        @Nullable Object sinkRetryWait,
        String type,
        @Nullable Object writeBatchSize,
        @Nullable Object writeBatchTimeout) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.flushImmediately = flushImmediately;
        this.ingestionMappingAsJson = ingestionMappingAsJson;
        this.ingestionMappingName = ingestionMappingName;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Codegen.stringProp("type").arg(type).require();
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    private AzureDataExplorerSinkResponse() {
        this.disableMetricsCollection = null;
        this.flushImmediately = null;
        this.ingestionMappingAsJson = null;
        this.ingestionMappingName = null;
        this.maxConcurrentConnections = null;
        this.sinkRetryCount = null;
        this.sinkRetryWait = null;
        this.type = null;
        this.writeBatchSize = null;
        this.writeBatchTimeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataExplorerSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object flushImmediately;
        private @Nullable Object ingestionMappingAsJson;
        private @Nullable Object ingestionMappingName;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataExplorerSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.flushImmediately = defaults.flushImmediately;
    	      this.ingestionMappingAsJson = defaults.ingestionMappingAsJson;
    	      this.ingestionMappingName = defaults.ingestionMappingName;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder flushImmediately(@Nullable Object flushImmediately) {
            this.flushImmediately = flushImmediately;
            return this;
        }
        public Builder ingestionMappingAsJson(@Nullable Object ingestionMappingAsJson) {
            this.ingestionMappingAsJson = ingestionMappingAsJson;
            return this;
        }
        public Builder ingestionMappingName(@Nullable Object ingestionMappingName) {
            this.ingestionMappingName = ingestionMappingName;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
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
        }        public AzureDataExplorerSinkResponse build() {
            return new AzureDataExplorerSinkResponse(disableMetricsCollection, flushImmediately, ingestionMappingAsJson, ingestionMappingName, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
