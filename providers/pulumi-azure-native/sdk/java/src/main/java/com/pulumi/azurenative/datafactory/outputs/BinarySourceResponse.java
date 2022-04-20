// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.AmazonS3CompatibleReadSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.AmazonS3ReadSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureBlobFSReadSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureBlobStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureDataLakeStoreReadSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureFileStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.BinaryReadSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.FileServerReadSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.FtpReadSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.GoogleCloudStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.HdfsReadSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.HttpReadSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.OracleCloudStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.outputs.SftpReadSettingsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BinarySourceResponse {
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * Binary format settings.
     * 
     */
    private final @Nullable BinaryReadSettingsResponse formatSettings;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sourceRetryCount;
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sourceRetryWait;
    /**
     * Binary store settings.
     * 
     */
    private final @Nullable Object storeSettings;
    /**
     * Copy source type.
     * Expected value is &#39;BinarySource&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private BinarySourceResponse(
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("formatSettings") @Nullable BinaryReadSettingsResponse formatSettings,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("sourceRetryCount") @Nullable Object sourceRetryCount,
        @CustomType.Parameter("sourceRetryWait") @Nullable Object sourceRetryWait,
        @CustomType.Parameter("storeSettings") @Nullable Object storeSettings,
        @CustomType.Parameter("type") String type) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.formatSettings = formatSettings;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.storeSettings = storeSettings;
        this.type = type;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * Binary format settings.
     * 
    */
    public Optional<BinaryReadSettingsResponse> formatSettings() {
        return Optional.ofNullable(this.formatSettings);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }
    /**
     * Binary store settings.
     * 
    */
    public Optional<Object> storeSettings() {
        return Optional.ofNullable(this.storeSettings);
    }
    /**
     * Copy source type.
     * Expected value is &#39;BinarySource&#39;.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BinarySourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object disableMetricsCollection;
        private @Nullable BinaryReadSettingsResponse formatSettings;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private @Nullable Object storeSettings;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BinarySourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.formatSettings = defaults.formatSettings;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.storeSettings = defaults.storeSettings;
    	      this.type = defaults.type;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder formatSettings(@Nullable BinaryReadSettingsResponse formatSettings) {
            this.formatSettings = formatSettings;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }
        public Builder storeSettings(@Nullable Object storeSettings) {
            this.storeSettings = storeSettings;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public BinarySourceResponse build() {
            return new BinarySourceResponse(disableMetricsCollection, formatSettings, maxConcurrentConnections, sourceRetryCount, sourceRetryWait, storeSettings, type);
        }
    }
}
