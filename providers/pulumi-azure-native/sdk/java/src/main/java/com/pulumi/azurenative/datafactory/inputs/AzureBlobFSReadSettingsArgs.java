// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure blobFS read settings.
 * 
 */
public final class AzureBlobFSReadSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureBlobFSReadSettingsArgs Empty = new AzureBlobFSReadSettingsArgs();

    /**
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="deleteFilesAfterCompletion")
      private final @Nullable Output<Object> deleteFilesAfterCompletion;

    public Output<Object> deleteFilesAfterCompletion() {
        return this.deleteFilesAfterCompletion == null ? Codegen.empty() : this.deleteFilesAfterCompletion;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> disableMetricsCollection() {
        return this.disableMetricsCollection == null ? Codegen.empty() : this.disableMetricsCollection;
    }

    /**
     * Indicates whether to enable partition discovery.
     * 
     */
    @Import(name="enablePartitionDiscovery")
      private final @Nullable Output<Boolean> enablePartitionDiscovery;

    public Output<Boolean> enablePartitionDiscovery() {
        return this.enablePartitionDiscovery == null ? Codegen.empty() : this.enablePartitionDiscovery;
    }

    /**
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileListPath")
      private final @Nullable Output<Object> fileListPath;

    public Output<Object> fileListPath() {
        return this.fileListPath == null ? Codegen.empty() : this.fileListPath;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Codegen.empty() : this.maxConcurrentConnections;
    }

    /**
     * The end of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeEnd")
      private final @Nullable Output<Object> modifiedDatetimeEnd;

    public Output<Object> modifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd == null ? Codegen.empty() : this.modifiedDatetimeEnd;
    }

    /**
     * The start of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeStart")
      private final @Nullable Output<Object> modifiedDatetimeStart;

    public Output<Object> modifiedDatetimeStart() {
        return this.modifiedDatetimeStart == null ? Codegen.empty() : this.modifiedDatetimeStart;
    }

    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="partitionRootPath")
      private final @Nullable Output<Object> partitionRootPath;

    public Output<Object> partitionRootPath() {
        return this.partitionRootPath == null ? Codegen.empty() : this.partitionRootPath;
    }

    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="recursive")
      private final @Nullable Output<Object> recursive;

    public Output<Object> recursive() {
        return this.recursive == null ? Codegen.empty() : this.recursive;
    }

    /**
     * The read setting type.
     * Expected value is &#39;AzureBlobFSReadSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Azure blobFS wildcardFileName. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="wildcardFileName")
      private final @Nullable Output<Object> wildcardFileName;

    public Output<Object> wildcardFileName() {
        return this.wildcardFileName == null ? Codegen.empty() : this.wildcardFileName;
    }

    /**
     * Azure blobFS wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="wildcardFolderPath")
      private final @Nullable Output<Object> wildcardFolderPath;

    public Output<Object> wildcardFolderPath() {
        return this.wildcardFolderPath == null ? Codegen.empty() : this.wildcardFolderPath;
    }

    public AzureBlobFSReadSettingsArgs(
        @Nullable Output<Object> deleteFilesAfterCompletion,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Boolean> enablePartitionDiscovery,
        @Nullable Output<Object> fileListPath,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> modifiedDatetimeEnd,
        @Nullable Output<Object> modifiedDatetimeStart,
        @Nullable Output<Object> partitionRootPath,
        @Nullable Output<Object> recursive,
        Output<String> type,
        @Nullable Output<Object> wildcardFileName,
        @Nullable Output<Object> wildcardFolderPath) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        this.disableMetricsCollection = disableMetricsCollection;
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        this.fileListPath = fileListPath;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        this.partitionRootPath = partitionRootPath;
        this.recursive = recursive;
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.wildcardFileName = wildcardFileName;
        this.wildcardFolderPath = wildcardFolderPath;
    }

    private AzureBlobFSReadSettingsArgs() {
        this.deleteFilesAfterCompletion = Codegen.empty();
        this.disableMetricsCollection = Codegen.empty();
        this.enablePartitionDiscovery = Codegen.empty();
        this.fileListPath = Codegen.empty();
        this.maxConcurrentConnections = Codegen.empty();
        this.modifiedDatetimeEnd = Codegen.empty();
        this.modifiedDatetimeStart = Codegen.empty();
        this.partitionRootPath = Codegen.empty();
        this.recursive = Codegen.empty();
        this.type = Codegen.empty();
        this.wildcardFileName = Codegen.empty();
        this.wildcardFolderPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobFSReadSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> deleteFilesAfterCompletion;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Boolean> enablePartitionDiscovery;
        private @Nullable Output<Object> fileListPath;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> modifiedDatetimeEnd;
        private @Nullable Output<Object> modifiedDatetimeStart;
        private @Nullable Output<Object> partitionRootPath;
        private @Nullable Output<Object> recursive;
        private Output<String> type;
        private @Nullable Output<Object> wildcardFileName;
        private @Nullable Output<Object> wildcardFolderPath;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobFSReadSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteFilesAfterCompletion = defaults.deleteFilesAfterCompletion;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.enablePartitionDiscovery = defaults.enablePartitionDiscovery;
    	      this.fileListPath = defaults.fileListPath;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.modifiedDatetimeEnd = defaults.modifiedDatetimeEnd;
    	      this.modifiedDatetimeStart = defaults.modifiedDatetimeStart;
    	      this.partitionRootPath = defaults.partitionRootPath;
    	      this.recursive = defaults.recursive;
    	      this.type = defaults.type;
    	      this.wildcardFileName = defaults.wildcardFileName;
    	      this.wildcardFolderPath = defaults.wildcardFolderPath;
        }

        public Builder deleteFilesAfterCompletion(@Nullable Output<Object> deleteFilesAfterCompletion) {
            this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
            return this;
        }
        public Builder deleteFilesAfterCompletion(@Nullable Object deleteFilesAfterCompletion) {
            this.deleteFilesAfterCompletion = Codegen.ofNullable(deleteFilesAfterCompletion);
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Codegen.ofNullable(disableMetricsCollection);
            return this;
        }
        public Builder enablePartitionDiscovery(@Nullable Output<Boolean> enablePartitionDiscovery) {
            this.enablePartitionDiscovery = enablePartitionDiscovery;
            return this;
        }
        public Builder enablePartitionDiscovery(@Nullable Boolean enablePartitionDiscovery) {
            this.enablePartitionDiscovery = Codegen.ofNullable(enablePartitionDiscovery);
            return this;
        }
        public Builder fileListPath(@Nullable Output<Object> fileListPath) {
            this.fileListPath = fileListPath;
            return this;
        }
        public Builder fileListPath(@Nullable Object fileListPath) {
            this.fileListPath = Codegen.ofNullable(fileListPath);
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Codegen.ofNullable(maxConcurrentConnections);
            return this;
        }
        public Builder modifiedDatetimeEnd(@Nullable Output<Object> modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }
        public Builder modifiedDatetimeEnd(@Nullable Object modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = Codegen.ofNullable(modifiedDatetimeEnd);
            return this;
        }
        public Builder modifiedDatetimeStart(@Nullable Output<Object> modifiedDatetimeStart) {
            this.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }
        public Builder modifiedDatetimeStart(@Nullable Object modifiedDatetimeStart) {
            this.modifiedDatetimeStart = Codegen.ofNullable(modifiedDatetimeStart);
            return this;
        }
        public Builder partitionRootPath(@Nullable Output<Object> partitionRootPath) {
            this.partitionRootPath = partitionRootPath;
            return this;
        }
        public Builder partitionRootPath(@Nullable Object partitionRootPath) {
            this.partitionRootPath = Codegen.ofNullable(partitionRootPath);
            return this;
        }
        public Builder recursive(@Nullable Output<Object> recursive) {
            this.recursive = recursive;
            return this;
        }
        public Builder recursive(@Nullable Object recursive) {
            this.recursive = Codegen.ofNullable(recursive);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder wildcardFileName(@Nullable Output<Object> wildcardFileName) {
            this.wildcardFileName = wildcardFileName;
            return this;
        }
        public Builder wildcardFileName(@Nullable Object wildcardFileName) {
            this.wildcardFileName = Codegen.ofNullable(wildcardFileName);
            return this;
        }
        public Builder wildcardFolderPath(@Nullable Output<Object> wildcardFolderPath) {
            this.wildcardFolderPath = wildcardFolderPath;
            return this;
        }
        public Builder wildcardFolderPath(@Nullable Object wildcardFolderPath) {
            this.wildcardFolderPath = Codegen.ofNullable(wildcardFolderPath);
            return this;
        }        public AzureBlobFSReadSettingsArgs build() {
            return new AzureBlobFSReadSettingsArgs(deleteFilesAfterCompletion, disableMetricsCollection, enablePartitionDiscovery, fileListPath, maxConcurrentConnections, modifiedDatetimeEnd, modifiedDatetimeStart, partitionRootPath, recursive, type, wildcardFileName, wildcardFolderPath);
        }
    }
}
