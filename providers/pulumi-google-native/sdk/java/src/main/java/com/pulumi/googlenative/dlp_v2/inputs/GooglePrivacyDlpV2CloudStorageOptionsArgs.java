// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2CloudStorageOptionsFileTypesItem;
import com.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2CloudStorageOptionsSampleMethod;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FileSetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options defining a file or a set of files within a Google Cloud Storage bucket.
 * 
 */
public final class GooglePrivacyDlpV2CloudStorageOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2CloudStorageOptionsArgs Empty = new GooglePrivacyDlpV2CloudStorageOptionsArgs();

    /**
     * Max number of bytes to scan from a file. If a scanned file&#39;s size is bigger than this value then the rest of the bytes are omitted. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
     * 
     */
    @Import(name="bytesLimitPerFile")
      private final @Nullable Output<String> bytesLimitPerFile;

    public Output<String> bytesLimitPerFile() {
        return this.bytesLimitPerFile == null ? Codegen.empty() : this.bytesLimitPerFile;
    }

    /**
     * Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
     * 
     */
    @Import(name="bytesLimitPerFilePercent")
      private final @Nullable Output<Integer> bytesLimitPerFilePercent;

    public Output<Integer> bytesLimitPerFilePercent() {
        return this.bytesLimitPerFilePercent == null ? Codegen.empty() : this.bytesLimitPerFilePercent;
    }

    /**
     * The set of one or more files to scan.
     * 
     */
    @Import(name="fileSet")
      private final @Nullable Output<GooglePrivacyDlpV2FileSetArgs> fileSet;

    public Output<GooglePrivacyDlpV2FileSetArgs> fileSet() {
        return this.fileSet == null ? Codegen.empty() : this.fileSet;
    }

    /**
     * List of file type groups to include in the scan. If empty, all files are scanned and available data format processors are applied. In addition, the binary content of the selected files is always scanned as well. Images are scanned only as binary if the specified region does not support image inspection and no file_types were specified. Image inspection is restricted to &#39;global&#39;, &#39;us&#39;, &#39;asia&#39;, and &#39;europe&#39;.
     * 
     */
    @Import(name="fileTypes")
      private final @Nullable Output<List<GooglePrivacyDlpV2CloudStorageOptionsFileTypesItem>> fileTypes;

    public Output<List<GooglePrivacyDlpV2CloudStorageOptionsFileTypesItem>> fileTypes() {
        return this.fileTypes == null ? Codegen.empty() : this.fileTypes;
    }

    /**
     * Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
     * 
     */
    @Import(name="filesLimitPercent")
      private final @Nullable Output<Integer> filesLimitPercent;

    public Output<Integer> filesLimitPercent() {
        return this.filesLimitPercent == null ? Codegen.empty() : this.filesLimitPercent;
    }

    @Import(name="sampleMethod")
      private final @Nullable Output<GooglePrivacyDlpV2CloudStorageOptionsSampleMethod> sampleMethod;

    public Output<GooglePrivacyDlpV2CloudStorageOptionsSampleMethod> sampleMethod() {
        return this.sampleMethod == null ? Codegen.empty() : this.sampleMethod;
    }

    public GooglePrivacyDlpV2CloudStorageOptionsArgs(
        @Nullable Output<String> bytesLimitPerFile,
        @Nullable Output<Integer> bytesLimitPerFilePercent,
        @Nullable Output<GooglePrivacyDlpV2FileSetArgs> fileSet,
        @Nullable Output<List<GooglePrivacyDlpV2CloudStorageOptionsFileTypesItem>> fileTypes,
        @Nullable Output<Integer> filesLimitPercent,
        @Nullable Output<GooglePrivacyDlpV2CloudStorageOptionsSampleMethod> sampleMethod) {
        this.bytesLimitPerFile = bytesLimitPerFile;
        this.bytesLimitPerFilePercent = bytesLimitPerFilePercent;
        this.fileSet = fileSet;
        this.fileTypes = fileTypes;
        this.filesLimitPercent = filesLimitPercent;
        this.sampleMethod = sampleMethod;
    }

    private GooglePrivacyDlpV2CloudStorageOptionsArgs() {
        this.bytesLimitPerFile = Codegen.empty();
        this.bytesLimitPerFilePercent = Codegen.empty();
        this.fileSet = Codegen.empty();
        this.fileTypes = Codegen.empty();
        this.filesLimitPercent = Codegen.empty();
        this.sampleMethod = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CloudStorageOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bytesLimitPerFile;
        private @Nullable Output<Integer> bytesLimitPerFilePercent;
        private @Nullable Output<GooglePrivacyDlpV2FileSetArgs> fileSet;
        private @Nullable Output<List<GooglePrivacyDlpV2CloudStorageOptionsFileTypesItem>> fileTypes;
        private @Nullable Output<Integer> filesLimitPercent;
        private @Nullable Output<GooglePrivacyDlpV2CloudStorageOptionsSampleMethod> sampleMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CloudStorageOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytesLimitPerFile = defaults.bytesLimitPerFile;
    	      this.bytesLimitPerFilePercent = defaults.bytesLimitPerFilePercent;
    	      this.fileSet = defaults.fileSet;
    	      this.fileTypes = defaults.fileTypes;
    	      this.filesLimitPercent = defaults.filesLimitPercent;
    	      this.sampleMethod = defaults.sampleMethod;
        }

        public Builder bytesLimitPerFile(@Nullable Output<String> bytesLimitPerFile) {
            this.bytesLimitPerFile = bytesLimitPerFile;
            return this;
        }
        public Builder bytesLimitPerFile(@Nullable String bytesLimitPerFile) {
            this.bytesLimitPerFile = Codegen.ofNullable(bytesLimitPerFile);
            return this;
        }
        public Builder bytesLimitPerFilePercent(@Nullable Output<Integer> bytesLimitPerFilePercent) {
            this.bytesLimitPerFilePercent = bytesLimitPerFilePercent;
            return this;
        }
        public Builder bytesLimitPerFilePercent(@Nullable Integer bytesLimitPerFilePercent) {
            this.bytesLimitPerFilePercent = Codegen.ofNullable(bytesLimitPerFilePercent);
            return this;
        }
        public Builder fileSet(@Nullable Output<GooglePrivacyDlpV2FileSetArgs> fileSet) {
            this.fileSet = fileSet;
            return this;
        }
        public Builder fileSet(@Nullable GooglePrivacyDlpV2FileSetArgs fileSet) {
            this.fileSet = Codegen.ofNullable(fileSet);
            return this;
        }
        public Builder fileTypes(@Nullable Output<List<GooglePrivacyDlpV2CloudStorageOptionsFileTypesItem>> fileTypes) {
            this.fileTypes = fileTypes;
            return this;
        }
        public Builder fileTypes(@Nullable List<GooglePrivacyDlpV2CloudStorageOptionsFileTypesItem> fileTypes) {
            this.fileTypes = Codegen.ofNullable(fileTypes);
            return this;
        }
        public Builder fileTypes(GooglePrivacyDlpV2CloudStorageOptionsFileTypesItem... fileTypes) {
            return fileTypes(List.of(fileTypes));
        }
        public Builder filesLimitPercent(@Nullable Output<Integer> filesLimitPercent) {
            this.filesLimitPercent = filesLimitPercent;
            return this;
        }
        public Builder filesLimitPercent(@Nullable Integer filesLimitPercent) {
            this.filesLimitPercent = Codegen.ofNullable(filesLimitPercent);
            return this;
        }
        public Builder sampleMethod(@Nullable Output<GooglePrivacyDlpV2CloudStorageOptionsSampleMethod> sampleMethod) {
            this.sampleMethod = sampleMethod;
            return this;
        }
        public Builder sampleMethod(@Nullable GooglePrivacyDlpV2CloudStorageOptionsSampleMethod sampleMethod) {
            this.sampleMethod = Codegen.ofNullable(sampleMethod);
            return this;
        }        public GooglePrivacyDlpV2CloudStorageOptionsArgs build() {
            return new GooglePrivacyDlpV2CloudStorageOptionsArgs(bytesLimitPerFile, bytesLimitPerFilePercent, fileSet, fileTypes, filesLimitPercent, sampleMethod);
        }
    }
}
