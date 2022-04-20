// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GoogleCloudStorageReadSettingsResponse {
    /**
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object deleteFilesAfterCompletion;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * Indicates whether to enable partition discovery.
     * 
     */
    private final @Nullable Boolean enablePartitionDiscovery;
    /**
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileListPath;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * The end of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object modifiedDatetimeEnd;
    /**
     * The start of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object modifiedDatetimeStart;
    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object partitionRootPath;
    /**
     * The prefix filter for the Google Cloud Storage object name. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object prefix;
    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object recursive;
    /**
     * The read setting type.
     * Expected value is &#39;GoogleCloudStorageReadSettings&#39;.
     * 
     */
    private final String type;
    /**
     * Google Cloud Storage wildcardFileName. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object wildcardFileName;
    /**
     * Google Cloud Storage wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object wildcardFolderPath;

    @CustomType.Constructor
    private GoogleCloudStorageReadSettingsResponse(
        @CustomType.Parameter("deleteFilesAfterCompletion") @Nullable Object deleteFilesAfterCompletion,
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("enablePartitionDiscovery") @Nullable Boolean enablePartitionDiscovery,
        @CustomType.Parameter("fileListPath") @Nullable Object fileListPath,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("modifiedDatetimeEnd") @Nullable Object modifiedDatetimeEnd,
        @CustomType.Parameter("modifiedDatetimeStart") @Nullable Object modifiedDatetimeStart,
        @CustomType.Parameter("partitionRootPath") @Nullable Object partitionRootPath,
        @CustomType.Parameter("prefix") @Nullable Object prefix,
        @CustomType.Parameter("recursive") @Nullable Object recursive,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("wildcardFileName") @Nullable Object wildcardFileName,
        @CustomType.Parameter("wildcardFolderPath") @Nullable Object wildcardFolderPath) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        this.disableMetricsCollection = disableMetricsCollection;
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        this.fileListPath = fileListPath;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        this.partitionRootPath = partitionRootPath;
        this.prefix = prefix;
        this.recursive = recursive;
        this.type = type;
        this.wildcardFileName = wildcardFileName;
        this.wildcardFolderPath = wildcardFolderPath;
    }

    /**
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> deleteFilesAfterCompletion() {
        return Optional.ofNullable(this.deleteFilesAfterCompletion);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * Indicates whether to enable partition discovery.
     * 
    */
    public Optional<Boolean> enablePartitionDiscovery() {
        return Optional.ofNullable(this.enablePartitionDiscovery);
    }
    /**
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> fileListPath() {
        return Optional.ofNullable(this.fileListPath);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * The end of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> modifiedDatetimeEnd() {
        return Optional.ofNullable(this.modifiedDatetimeEnd);
    }
    /**
     * The start of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> modifiedDatetimeStart() {
        return Optional.ofNullable(this.modifiedDatetimeStart);
    }
    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> partitionRootPath() {
        return Optional.ofNullable(this.partitionRootPath);
    }
    /**
     * The prefix filter for the Google Cloud Storage object name. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> recursive() {
        return Optional.ofNullable(this.recursive);
    }
    /**
     * The read setting type.
     * Expected value is &#39;GoogleCloudStorageReadSettings&#39;.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Google Cloud Storage wildcardFileName. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> wildcardFileName() {
        return Optional.ofNullable(this.wildcardFileName);
    }
    /**
     * Google Cloud Storage wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> wildcardFolderPath() {
        return Optional.ofNullable(this.wildcardFolderPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudStorageReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object deleteFilesAfterCompletion;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Boolean enablePartitionDiscovery;
        private @Nullable Object fileListPath;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object modifiedDatetimeEnd;
        private @Nullable Object modifiedDatetimeStart;
        private @Nullable Object partitionRootPath;
        private @Nullable Object prefix;
        private @Nullable Object recursive;
        private String type;
        private @Nullable Object wildcardFileName;
        private @Nullable Object wildcardFolderPath;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudStorageReadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteFilesAfterCompletion = defaults.deleteFilesAfterCompletion;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.enablePartitionDiscovery = defaults.enablePartitionDiscovery;
    	      this.fileListPath = defaults.fileListPath;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.modifiedDatetimeEnd = defaults.modifiedDatetimeEnd;
    	      this.modifiedDatetimeStart = defaults.modifiedDatetimeStart;
    	      this.partitionRootPath = defaults.partitionRootPath;
    	      this.prefix = defaults.prefix;
    	      this.recursive = defaults.recursive;
    	      this.type = defaults.type;
    	      this.wildcardFileName = defaults.wildcardFileName;
    	      this.wildcardFolderPath = defaults.wildcardFolderPath;
        }

        public Builder deleteFilesAfterCompletion(@Nullable Object deleteFilesAfterCompletion) {
            this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder enablePartitionDiscovery(@Nullable Boolean enablePartitionDiscovery) {
            this.enablePartitionDiscovery = enablePartitionDiscovery;
            return this;
        }
        public Builder fileListPath(@Nullable Object fileListPath) {
            this.fileListPath = fileListPath;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder modifiedDatetimeEnd(@Nullable Object modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }
        public Builder modifiedDatetimeStart(@Nullable Object modifiedDatetimeStart) {
            this.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }
        public Builder partitionRootPath(@Nullable Object partitionRootPath) {
            this.partitionRootPath = partitionRootPath;
            return this;
        }
        public Builder prefix(@Nullable Object prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder recursive(@Nullable Object recursive) {
            this.recursive = recursive;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder wildcardFileName(@Nullable Object wildcardFileName) {
            this.wildcardFileName = wildcardFileName;
            return this;
        }
        public Builder wildcardFolderPath(@Nullable Object wildcardFolderPath) {
            this.wildcardFolderPath = wildcardFolderPath;
            return this;
        }        public GoogleCloudStorageReadSettingsResponse build() {
            return new GoogleCloudStorageReadSettingsResponse(deleteFilesAfterCompletion, disableMetricsCollection, enablePartitionDiscovery, fileListPath, maxConcurrentConnections, modifiedDatetimeEnd, modifiedDatetimeStart, partitionRootPath, prefix, recursive, type, wildcardFileName, wildcardFolderPath);
        }
    }
}
