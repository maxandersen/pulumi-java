// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AmazonS3ReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobFSReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureFileStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.FileServerReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.FtpReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.HdfsReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.HttpReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.OracleCloudStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.SftpReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.XmlReadSettingsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Xml source.
 * 
 */
public final class XmlSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final XmlSourceResponse Empty = new XmlSourceResponse();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
      private final @Nullable Object additionalColumns;

    public Optional<Object> additionalColumns() {
        return this.additionalColumns == null ? Optional.empty() : Optional.ofNullable(this.additionalColumns);
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
     * Xml format settings.
     * 
     */
    @Import(name="formatSettings")
      private final @Nullable XmlReadSettingsResponse formatSettings;

    public Optional<XmlReadSettingsResponse> formatSettings() {
        return this.formatSettings == null ? Optional.empty() : Optional.ofNullable(this.formatSettings);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
      private final @Nullable Object sourceRetryCount;

    public Optional<Object> sourceRetryCount() {
        return this.sourceRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
      private final @Nullable Object sourceRetryWait;

    public Optional<Object> sourceRetryWait() {
        return this.sourceRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Xml store settings.
     * 
     */
    @Import(name="storeSettings")
      private final @Nullable Object storeSettings;

    public Object storeSettings() {
        return this.storeSettings == null ? null : this.storeSettings;
    }

    /**
     * Copy source type.
     * Expected value is 'XmlSource'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public XmlSourceResponse(
        @Nullable Object additionalColumns,
        @Nullable Object disableMetricsCollection,
        @Nullable XmlReadSettingsResponse formatSettings,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        @Nullable Object storeSettings,
        String type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.formatSettings = formatSettings;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.storeSettings = storeSettings;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private XmlSourceResponse() {
        this.additionalColumns = null;
        this.disableMetricsCollection = null;
        this.formatSettings = null;
        this.maxConcurrentConnections = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.storeSettings = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XmlSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object disableMetricsCollection;
        private @Nullable XmlReadSettingsResponse formatSettings;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private @Nullable Object storeSettings;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(XmlSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.formatSettings = defaults.formatSettings;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.storeSettings = defaults.storeSettings;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder formatSettings(@Nullable XmlReadSettingsResponse formatSettings) {
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
        }        public XmlSourceResponse build() {
            return new XmlSourceResponse(additionalColumns, disableMetricsCollection, formatSettings, maxConcurrentConnections, sourceRetryCount, sourceRetryWait, storeSettings, type);
        }
    }
}
