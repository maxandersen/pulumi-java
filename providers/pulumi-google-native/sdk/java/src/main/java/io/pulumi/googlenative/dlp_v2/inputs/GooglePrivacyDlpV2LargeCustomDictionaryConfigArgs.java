// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BigQueryFieldArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CloudStorageFileSetArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CloudStoragePathArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a custom dictionary created from a data source of any size up to the maximum size defined in the [limits](https://cloud.google.com/dlp/limits) page. The artifacts of dictionary creation are stored in the specified Google Cloud Storage location. Consider using `CustomInfoType.Dictionary` for smaller dictionaries that satisfy the size requirements.
 * 
 */
public final class GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs Empty = new GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs();

    /**
     * Field in a BigQuery table where each cell represents a dictionary phrase.
     * 
     */
    @Import(name="bigQueryField")
      private final @Nullable Output<GooglePrivacyDlpV2BigQueryFieldArgs> bigQueryField;

    public Output<GooglePrivacyDlpV2BigQueryFieldArgs> bigQueryField() {
        return this.bigQueryField == null ? Codegen.empty() : this.bigQueryField;
    }

    /**
     * Set of files containing newline-delimited lists of dictionary phrases.
     * 
     */
    @Import(name="cloudStorageFileSet")
      private final @Nullable Output<GooglePrivacyDlpV2CloudStorageFileSetArgs> cloudStorageFileSet;

    public Output<GooglePrivacyDlpV2CloudStorageFileSetArgs> cloudStorageFileSet() {
        return this.cloudStorageFileSet == null ? Codegen.empty() : this.cloudStorageFileSet;
    }

    /**
     * Location to store dictionary artifacts in Google Cloud Storage. These files will only be accessible by project owners and the DLP API. If any of these artifacts are modified, the dictionary is considered invalid and can no longer be used.
     * 
     */
    @Import(name="outputPath")
      private final @Nullable Output<GooglePrivacyDlpV2CloudStoragePathArgs> outputPath;

    public Output<GooglePrivacyDlpV2CloudStoragePathArgs> outputPath() {
        return this.outputPath == null ? Codegen.empty() : this.outputPath;
    }

    public GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs(
        @Nullable Output<GooglePrivacyDlpV2BigQueryFieldArgs> bigQueryField,
        @Nullable Output<GooglePrivacyDlpV2CloudStorageFileSetArgs> cloudStorageFileSet,
        @Nullable Output<GooglePrivacyDlpV2CloudStoragePathArgs> outputPath) {
        this.bigQueryField = bigQueryField;
        this.cloudStorageFileSet = cloudStorageFileSet;
        this.outputPath = outputPath;
    }

    private GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs() {
        this.bigQueryField = Codegen.empty();
        this.cloudStorageFileSet = Codegen.empty();
        this.outputPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GooglePrivacyDlpV2BigQueryFieldArgs> bigQueryField;
        private @Nullable Output<GooglePrivacyDlpV2CloudStorageFileSetArgs> cloudStorageFileSet;
        private @Nullable Output<GooglePrivacyDlpV2CloudStoragePathArgs> outputPath;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigQueryField = defaults.bigQueryField;
    	      this.cloudStorageFileSet = defaults.cloudStorageFileSet;
    	      this.outputPath = defaults.outputPath;
        }

        public Builder bigQueryField(@Nullable Output<GooglePrivacyDlpV2BigQueryFieldArgs> bigQueryField) {
            this.bigQueryField = bigQueryField;
            return this;
        }
        public Builder bigQueryField(@Nullable GooglePrivacyDlpV2BigQueryFieldArgs bigQueryField) {
            this.bigQueryField = Codegen.ofNullable(bigQueryField);
            return this;
        }
        public Builder cloudStorageFileSet(@Nullable Output<GooglePrivacyDlpV2CloudStorageFileSetArgs> cloudStorageFileSet) {
            this.cloudStorageFileSet = cloudStorageFileSet;
            return this;
        }
        public Builder cloudStorageFileSet(@Nullable GooglePrivacyDlpV2CloudStorageFileSetArgs cloudStorageFileSet) {
            this.cloudStorageFileSet = Codegen.ofNullable(cloudStorageFileSet);
            return this;
        }
        public Builder outputPath(@Nullable Output<GooglePrivacyDlpV2CloudStoragePathArgs> outputPath) {
            this.outputPath = outputPath;
            return this;
        }
        public Builder outputPath(@Nullable GooglePrivacyDlpV2CloudStoragePathArgs outputPath) {
            this.outputPath = Codegen.ofNullable(outputPath);
            return this;
        }        public GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs build() {
            return new GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs(bigQueryField, cloudStorageFileSet, outputPath);
        }
    }
}
