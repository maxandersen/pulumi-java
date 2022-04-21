// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BigQueryOptionsArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CloudStorageOptionsArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2DatastoreOptionsArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2HybridOptionsArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TimespanConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Shared message indicating Cloud storage type.
 * 
 */
public final class GooglePrivacyDlpV2StorageConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2StorageConfigArgs Empty = new GooglePrivacyDlpV2StorageConfigArgs();

    /**
     * BigQuery options.
     * 
     */
    @Import(name="bigQueryOptions")
    private @Nullable Output<GooglePrivacyDlpV2BigQueryOptionsArgs> bigQueryOptions;

    public Optional<Output<GooglePrivacyDlpV2BigQueryOptionsArgs>> bigQueryOptions() {
        return Optional.ofNullable(this.bigQueryOptions);
    }

    /**
     * Google Cloud Storage options.
     * 
     */
    @Import(name="cloudStorageOptions")
    private @Nullable Output<GooglePrivacyDlpV2CloudStorageOptionsArgs> cloudStorageOptions;

    public Optional<Output<GooglePrivacyDlpV2CloudStorageOptionsArgs>> cloudStorageOptions() {
        return Optional.ofNullable(this.cloudStorageOptions);
    }

    /**
     * Google Cloud Datastore options.
     * 
     */
    @Import(name="datastoreOptions")
    private @Nullable Output<GooglePrivacyDlpV2DatastoreOptionsArgs> datastoreOptions;

    public Optional<Output<GooglePrivacyDlpV2DatastoreOptionsArgs>> datastoreOptions() {
        return Optional.ofNullable(this.datastoreOptions);
    }

    /**
     * Hybrid inspection options.
     * 
     */
    @Import(name="hybridOptions")
    private @Nullable Output<GooglePrivacyDlpV2HybridOptionsArgs> hybridOptions;

    public Optional<Output<GooglePrivacyDlpV2HybridOptionsArgs>> hybridOptions() {
        return Optional.ofNullable(this.hybridOptions);
    }

    @Import(name="timespanConfig")
    private @Nullable Output<GooglePrivacyDlpV2TimespanConfigArgs> timespanConfig;

    public Optional<Output<GooglePrivacyDlpV2TimespanConfigArgs>> timespanConfig() {
        return Optional.ofNullable(this.timespanConfig);
    }

    private GooglePrivacyDlpV2StorageConfigArgs() {}

    private GooglePrivacyDlpV2StorageConfigArgs(GooglePrivacyDlpV2StorageConfigArgs $) {
        this.bigQueryOptions = $.bigQueryOptions;
        this.cloudStorageOptions = $.cloudStorageOptions;
        this.datastoreOptions = $.datastoreOptions;
        this.hybridOptions = $.hybridOptions;
        this.timespanConfig = $.timespanConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2StorageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2StorageConfigArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2StorageConfigArgs();
        }

        public Builder(GooglePrivacyDlpV2StorageConfigArgs defaults) {
            $ = new GooglePrivacyDlpV2StorageConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder bigQueryOptions(@Nullable Output<GooglePrivacyDlpV2BigQueryOptionsArgs> bigQueryOptions) {
            $.bigQueryOptions = bigQueryOptions;
            return this;
        }

        public Builder bigQueryOptions(GooglePrivacyDlpV2BigQueryOptionsArgs bigQueryOptions) {
            return bigQueryOptions(Output.of(bigQueryOptions));
        }

        public Builder cloudStorageOptions(@Nullable Output<GooglePrivacyDlpV2CloudStorageOptionsArgs> cloudStorageOptions) {
            $.cloudStorageOptions = cloudStorageOptions;
            return this;
        }

        public Builder cloudStorageOptions(GooglePrivacyDlpV2CloudStorageOptionsArgs cloudStorageOptions) {
            return cloudStorageOptions(Output.of(cloudStorageOptions));
        }

        public Builder datastoreOptions(@Nullable Output<GooglePrivacyDlpV2DatastoreOptionsArgs> datastoreOptions) {
            $.datastoreOptions = datastoreOptions;
            return this;
        }

        public Builder datastoreOptions(GooglePrivacyDlpV2DatastoreOptionsArgs datastoreOptions) {
            return datastoreOptions(Output.of(datastoreOptions));
        }

        public Builder hybridOptions(@Nullable Output<GooglePrivacyDlpV2HybridOptionsArgs> hybridOptions) {
            $.hybridOptions = hybridOptions;
            return this;
        }

        public Builder hybridOptions(GooglePrivacyDlpV2HybridOptionsArgs hybridOptions) {
            return hybridOptions(Output.of(hybridOptions));
        }

        public Builder timespanConfig(@Nullable Output<GooglePrivacyDlpV2TimespanConfigArgs> timespanConfig) {
            $.timespanConfig = timespanConfig;
            return this;
        }

        public Builder timespanConfig(GooglePrivacyDlpV2TimespanConfigArgs timespanConfig) {
            return timespanConfig(Output.of(timespanConfig));
        }

        public GooglePrivacyDlpV2StorageConfigArgs build() {
            return $;
        }
    }

}
