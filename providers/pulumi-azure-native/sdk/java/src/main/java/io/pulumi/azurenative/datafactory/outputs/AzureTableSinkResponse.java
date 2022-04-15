// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureTableSinkResponse {
    /**
     * Azure Table default partition key value. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object azureTableDefaultPartitionKeyValue;
    /**
     * Azure Table insert type. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object azureTableInsertType;
    /**
     * Azure Table partition key name. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object azureTablePartitionKeyName;
    /**
     * Azure Table row key name. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object azureTableRowKeyName;
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
     * Expected value is 'AzureTableSink'.
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
    private AzureTableSinkResponse(
        @CustomType.Parameter("azureTableDefaultPartitionKeyValue") @Nullable Object azureTableDefaultPartitionKeyValue,
        @CustomType.Parameter("azureTableInsertType") @Nullable Object azureTableInsertType,
        @CustomType.Parameter("azureTablePartitionKeyName") @Nullable Object azureTablePartitionKeyName,
        @CustomType.Parameter("azureTableRowKeyName") @Nullable Object azureTableRowKeyName,
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("sinkRetryCount") @Nullable Object sinkRetryCount,
        @CustomType.Parameter("sinkRetryWait") @Nullable Object sinkRetryWait,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("writeBatchSize") @Nullable Object writeBatchSize,
        @CustomType.Parameter("writeBatchTimeout") @Nullable Object writeBatchTimeout) {
        this.azureTableDefaultPartitionKeyValue = azureTableDefaultPartitionKeyValue;
        this.azureTableInsertType = azureTableInsertType;
        this.azureTablePartitionKeyName = azureTablePartitionKeyName;
        this.azureTableRowKeyName = azureTableRowKeyName;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = type;
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    /**
     * Azure Table default partition key value. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> azureTableDefaultPartitionKeyValue() {
        return Optional.ofNullable(this.azureTableDefaultPartitionKeyValue);
    }
    /**
     * Azure Table insert type. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> azureTableInsertType() {
        return Optional.ofNullable(this.azureTableInsertType);
    }
    /**
     * Azure Table partition key name. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> azureTablePartitionKeyName() {
        return Optional.ofNullable(this.azureTablePartitionKeyName);
    }
    /**
     * Azure Table row key name. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> azureTableRowKeyName() {
        return Optional.ofNullable(this.azureTableRowKeyName);
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
     * Expected value is 'AzureTableSink'.
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

    public static Builder builder(AzureTableSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object azureTableDefaultPartitionKeyValue;
        private @Nullable Object azureTableInsertType;
        private @Nullable Object azureTablePartitionKeyName;
        private @Nullable Object azureTableRowKeyName;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureTableSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureTableDefaultPartitionKeyValue = defaults.azureTableDefaultPartitionKeyValue;
    	      this.azureTableInsertType = defaults.azureTableInsertType;
    	      this.azureTablePartitionKeyName = defaults.azureTablePartitionKeyName;
    	      this.azureTableRowKeyName = defaults.azureTableRowKeyName;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder azureTableDefaultPartitionKeyValue(@Nullable Object azureTableDefaultPartitionKeyValue) {
            this.azureTableDefaultPartitionKeyValue = azureTableDefaultPartitionKeyValue;
            return this;
        }
        public Builder azureTableInsertType(@Nullable Object azureTableInsertType) {
            this.azureTableInsertType = azureTableInsertType;
            return this;
        }
        public Builder azureTablePartitionKeyName(@Nullable Object azureTablePartitionKeyName) {
            this.azureTablePartitionKeyName = azureTablePartitionKeyName;
            return this;
        }
        public Builder azureTableRowKeyName(@Nullable Object azureTableRowKeyName) {
            this.azureTableRowKeyName = azureTableRowKeyName;
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
        }        public AzureTableSinkResponse build() {
            return new AzureTableSinkResponse(azureTableDefaultPartitionKeyValue, azureTableInsertType, azureTablePartitionKeyName, azureTableRowKeyName, disableMetricsCollection, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
