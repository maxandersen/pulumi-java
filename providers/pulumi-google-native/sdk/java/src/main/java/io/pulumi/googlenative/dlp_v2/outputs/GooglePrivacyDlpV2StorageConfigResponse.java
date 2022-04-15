// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2BigQueryOptionsResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2CloudStorageOptionsResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2DatastoreOptionsResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2HybridOptionsResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2TimespanConfigResponse;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2StorageConfigResponse {
    /**
     * BigQuery options.
     * 
     */
    private final GooglePrivacyDlpV2BigQueryOptionsResponse bigQueryOptions;
    /**
     * Google Cloud Storage options.
     * 
     */
    private final GooglePrivacyDlpV2CloudStorageOptionsResponse cloudStorageOptions;
    /**
     * Google Cloud Datastore options.
     * 
     */
    private final GooglePrivacyDlpV2DatastoreOptionsResponse datastoreOptions;
    /**
     * Hybrid inspection options.
     * 
     */
    private final GooglePrivacyDlpV2HybridOptionsResponse hybridOptions;
    private final GooglePrivacyDlpV2TimespanConfigResponse timespanConfig;

    @CustomType.Constructor
    private GooglePrivacyDlpV2StorageConfigResponse(
        @CustomType.Parameter("bigQueryOptions") GooglePrivacyDlpV2BigQueryOptionsResponse bigQueryOptions,
        @CustomType.Parameter("cloudStorageOptions") GooglePrivacyDlpV2CloudStorageOptionsResponse cloudStorageOptions,
        @CustomType.Parameter("datastoreOptions") GooglePrivacyDlpV2DatastoreOptionsResponse datastoreOptions,
        @CustomType.Parameter("hybridOptions") GooglePrivacyDlpV2HybridOptionsResponse hybridOptions,
        @CustomType.Parameter("timespanConfig") GooglePrivacyDlpV2TimespanConfigResponse timespanConfig) {
        this.bigQueryOptions = bigQueryOptions;
        this.cloudStorageOptions = cloudStorageOptions;
        this.datastoreOptions = datastoreOptions;
        this.hybridOptions = hybridOptions;
        this.timespanConfig = timespanConfig;
    }

    /**
     * BigQuery options.
     * 
    */
    public GooglePrivacyDlpV2BigQueryOptionsResponse bigQueryOptions() {
        return this.bigQueryOptions;
    }
    /**
     * Google Cloud Storage options.
     * 
    */
    public GooglePrivacyDlpV2CloudStorageOptionsResponse cloudStorageOptions() {
        return this.cloudStorageOptions;
    }
    /**
     * Google Cloud Datastore options.
     * 
    */
    public GooglePrivacyDlpV2DatastoreOptionsResponse datastoreOptions() {
        return this.datastoreOptions;
    }
    /**
     * Hybrid inspection options.
     * 
    */
    public GooglePrivacyDlpV2HybridOptionsResponse hybridOptions() {
        return this.hybridOptions;
    }
    public GooglePrivacyDlpV2TimespanConfigResponse timespanConfig() {
        return this.timespanConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2StorageConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2BigQueryOptionsResponse bigQueryOptions;
        private GooglePrivacyDlpV2CloudStorageOptionsResponse cloudStorageOptions;
        private GooglePrivacyDlpV2DatastoreOptionsResponse datastoreOptions;
        private GooglePrivacyDlpV2HybridOptionsResponse hybridOptions;
        private GooglePrivacyDlpV2TimespanConfigResponse timespanConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2StorageConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigQueryOptions = defaults.bigQueryOptions;
    	      this.cloudStorageOptions = defaults.cloudStorageOptions;
    	      this.datastoreOptions = defaults.datastoreOptions;
    	      this.hybridOptions = defaults.hybridOptions;
    	      this.timespanConfig = defaults.timespanConfig;
        }

        public Builder bigQueryOptions(GooglePrivacyDlpV2BigQueryOptionsResponse bigQueryOptions) {
            this.bigQueryOptions = Objects.requireNonNull(bigQueryOptions);
            return this;
        }
        public Builder cloudStorageOptions(GooglePrivacyDlpV2CloudStorageOptionsResponse cloudStorageOptions) {
            this.cloudStorageOptions = Objects.requireNonNull(cloudStorageOptions);
            return this;
        }
        public Builder datastoreOptions(GooglePrivacyDlpV2DatastoreOptionsResponse datastoreOptions) {
            this.datastoreOptions = Objects.requireNonNull(datastoreOptions);
            return this;
        }
        public Builder hybridOptions(GooglePrivacyDlpV2HybridOptionsResponse hybridOptions) {
            this.hybridOptions = Objects.requireNonNull(hybridOptions);
            return this;
        }
        public Builder timespanConfig(GooglePrivacyDlpV2TimespanConfigResponse timespanConfig) {
            this.timespanConfig = Objects.requireNonNull(timespanConfig);
            return this;
        }        public GooglePrivacyDlpV2StorageConfigResponse build() {
            return new GooglePrivacyDlpV2StorageConfigResponse(bigQueryOptions, cloudStorageOptions, datastoreOptions, hybridOptions, timespanConfig);
        }
    }
}
