// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Common Data Service for Apps sink.
 * 
 */
public final class CommonDataServiceForAppsSinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final CommonDataServiceForAppsSinkResponse Empty = new CommonDataServiceForAppsSinkResponse();

    /**
     * The logical name of the alternate key which will be used when upserting records. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="alternateKeyName")
      private final @Nullable Object alternateKeyName;

    public Optional<Object> alternateKeyName() {
        return this.alternateKeyName == null ? Optional.empty() : Optional.ofNullable(this.alternateKeyName);
    }

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
     * The flag indicating whether to ignore null values from input dataset (except key fields) during write operation. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="ignoreNullValues")
      private final @Nullable Object ignoreNullValues;

    public Optional<Object> ignoreNullValues() {
        return this.ignoreNullValues == null ? Optional.empty() : Optional.ofNullable(this.ignoreNullValues);
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
     * Expected value is 'CommonDataServiceForAppsSink'.
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

    /**
     * The write behavior for the operation.
     * 
     */
    @Import(name="writeBehavior", required=true)
      private final String writeBehavior;

    public String writeBehavior() {
        return this.writeBehavior;
    }

    public CommonDataServiceForAppsSinkResponse(
        @Nullable Object alternateKeyName,
        @Nullable Object disableMetricsCollection,
        @Nullable Object ignoreNullValues,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object sinkRetryCount,
        @Nullable Object sinkRetryWait,
        String type,
        @Nullable Object writeBatchSize,
        @Nullable Object writeBatchTimeout,
        String writeBehavior) {
        this.alternateKeyName = alternateKeyName;
        this.disableMetricsCollection = disableMetricsCollection;
        this.ignoreNullValues = ignoreNullValues;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
        this.writeBehavior = Objects.requireNonNull(writeBehavior, "expected parameter 'writeBehavior' to be non-null");
    }

    private CommonDataServiceForAppsSinkResponse() {
        this.alternateKeyName = null;
        this.disableMetricsCollection = null;
        this.ignoreNullValues = null;
        this.maxConcurrentConnections = null;
        this.sinkRetryCount = null;
        this.sinkRetryWait = null;
        this.type = null;
        this.writeBatchSize = null;
        this.writeBatchTimeout = null;
        this.writeBehavior = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommonDataServiceForAppsSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object alternateKeyName;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object ignoreNullValues;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;
        private String writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(CommonDataServiceForAppsSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateKeyName = defaults.alternateKeyName;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.ignoreNullValues = defaults.ignoreNullValues;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
    	      this.writeBehavior = defaults.writeBehavior;
        }

        public Builder alternateKeyName(@Nullable Object alternateKeyName) {
            this.alternateKeyName = alternateKeyName;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder ignoreNullValues(@Nullable Object ignoreNullValues) {
            this.ignoreNullValues = ignoreNullValues;
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
        }
        public Builder writeBehavior(String writeBehavior) {
            this.writeBehavior = Objects.requireNonNull(writeBehavior);
            return this;
        }        public CommonDataServiceForAppsSinkResponse build() {
            return new CommonDataServiceForAppsSinkResponse(alternateKeyName, disableMetricsCollection, ignoreNullValues, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}
