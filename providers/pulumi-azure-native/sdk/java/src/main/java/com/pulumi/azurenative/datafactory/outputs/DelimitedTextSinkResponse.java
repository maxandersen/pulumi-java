// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.AzureBlobFSWriteSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureBlobStorageWriteSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureDataLakeStoreWriteSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureFileStorageWriteSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.DelimitedTextWriteSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.FileServerWriteSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.SftpWriteSettingsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DelimitedTextSinkResponse {
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * DelimitedText format settings.
     * 
     */
    private final @Nullable DelimitedTextWriteSettingsResponse formatSettings;
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
     * DelimitedText store settings.
     * 
     */
    private final @Nullable Object storeSettings;
    /**
     * Copy sink type.
     * Expected value is &#39;DelimitedTextSink&#39;.
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
    private DelimitedTextSinkResponse(
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("formatSettings") @Nullable DelimitedTextWriteSettingsResponse formatSettings,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("sinkRetryCount") @Nullable Object sinkRetryCount,
        @CustomType.Parameter("sinkRetryWait") @Nullable Object sinkRetryWait,
        @CustomType.Parameter("storeSettings") @Nullable Object storeSettings,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("writeBatchSize") @Nullable Object writeBatchSize,
        @CustomType.Parameter("writeBatchTimeout") @Nullable Object writeBatchTimeout) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.formatSettings = formatSettings;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.storeSettings = storeSettings;
        this.type = type;
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * DelimitedText format settings.
     * 
    */
    public Optional<DelimitedTextWriteSettingsResponse> formatSettings() {
        return Optional.ofNullable(this.formatSettings);
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
     * DelimitedText store settings.
     * 
    */
    public Optional<Object> storeSettings() {
        return Optional.ofNullable(this.storeSettings);
    }
    /**
     * Copy sink type.
     * Expected value is &#39;DelimitedTextSink&#39;.
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

    public static Builder builder(DelimitedTextSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object disableMetricsCollection;
        private @Nullable DelimitedTextWriteSettingsResponse formatSettings;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private @Nullable Object storeSettings;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(DelimitedTextSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.formatSettings = defaults.formatSettings;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.storeSettings = defaults.storeSettings;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder formatSettings(@Nullable DelimitedTextWriteSettingsResponse formatSettings) {
            this.formatSettings = formatSettings;
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
        public Builder storeSettings(@Nullable Object storeSettings) {
            this.storeSettings = storeSettings;
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
        }        public DelimitedTextSinkResponse build() {
            return new DelimitedTextSinkResponse(disableMetricsCollection, formatSettings, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, storeSettings, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
