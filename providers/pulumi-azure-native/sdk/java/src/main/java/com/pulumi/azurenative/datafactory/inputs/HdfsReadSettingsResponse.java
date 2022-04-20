// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.DistcpSettingsResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HDFS read settings.
 * 
 */
public final class HdfsReadSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final HdfsReadSettingsResponse Empty = new HdfsReadSettingsResponse();

    /**
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="deleteFilesAfterCompletion")
      private final @Nullable Object deleteFilesAfterCompletion;

    public Optional<Object> deleteFilesAfterCompletion() {
        return this.deleteFilesAfterCompletion == null ? Optional.empty() : Optional.ofNullable(this.deleteFilesAfterCompletion);
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
     * Specifies Distcp-related settings.
     * 
     */
    @Import(name="distcpSettings")
      private final @Nullable DistcpSettingsResponse distcpSettings;

    public Optional<DistcpSettingsResponse> distcpSettings() {
        return this.distcpSettings == null ? Optional.empty() : Optional.ofNullable(this.distcpSettings);
    }

    /**
     * Indicates whether to enable partition discovery.
     * 
     */
    @Import(name="enablePartitionDiscovery")
      private final @Nullable Boolean enablePartitionDiscovery;

    public Optional<Boolean> enablePartitionDiscovery() {
        return this.enablePartitionDiscovery == null ? Optional.empty() : Optional.ofNullable(this.enablePartitionDiscovery);
    }

    /**
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileListPath")
      private final @Nullable Object fileListPath;

    public Optional<Object> fileListPath() {
        return this.fileListPath == null ? Optional.empty() : Optional.ofNullable(this.fileListPath);
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
     * The end of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeEnd")
      private final @Nullable Object modifiedDatetimeEnd;

    public Optional<Object> modifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd == null ? Optional.empty() : Optional.ofNullable(this.modifiedDatetimeEnd);
    }

    /**
     * The start of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeStart")
      private final @Nullable Object modifiedDatetimeStart;

    public Optional<Object> modifiedDatetimeStart() {
        return this.modifiedDatetimeStart == null ? Optional.empty() : Optional.ofNullable(this.modifiedDatetimeStart);
    }

    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="partitionRootPath")
      private final @Nullable Object partitionRootPath;

    public Optional<Object> partitionRootPath() {
        return this.partitionRootPath == null ? Optional.empty() : Optional.ofNullable(this.partitionRootPath);
    }

    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="recursive")
      private final @Nullable Object recursive;

    public Optional<Object> recursive() {
        return this.recursive == null ? Optional.empty() : Optional.ofNullable(this.recursive);
    }

    /**
     * The read setting type.
     * Expected value is &#39;HdfsReadSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * HDFS wildcardFileName. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="wildcardFileName")
      private final @Nullable Object wildcardFileName;

    public Optional<Object> wildcardFileName() {
        return this.wildcardFileName == null ? Optional.empty() : Optional.ofNullable(this.wildcardFileName);
    }

    /**
     * HDFS wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="wildcardFolderPath")
      private final @Nullable Object wildcardFolderPath;

    public Optional<Object> wildcardFolderPath() {
        return this.wildcardFolderPath == null ? Optional.empty() : Optional.ofNullable(this.wildcardFolderPath);
    }

    public HdfsReadSettingsResponse(
        @Nullable Object deleteFilesAfterCompletion,
        @Nullable Object disableMetricsCollection,
        @Nullable DistcpSettingsResponse distcpSettings,
        @Nullable Boolean enablePartitionDiscovery,
        @Nullable Object fileListPath,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object modifiedDatetimeEnd,
        @Nullable Object modifiedDatetimeStart,
        @Nullable Object partitionRootPath,
        @Nullable Object recursive,
        String type,
        @Nullable Object wildcardFileName,
        @Nullable Object wildcardFolderPath) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        this.disableMetricsCollection = disableMetricsCollection;
        this.distcpSettings = distcpSettings;
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        this.fileListPath = fileListPath;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        this.partitionRootPath = partitionRootPath;
        this.recursive = recursive;
        this.type = Codegen.stringProp("type").arg(type).require();
        this.wildcardFileName = wildcardFileName;
        this.wildcardFolderPath = wildcardFolderPath;
    }

    private HdfsReadSettingsResponse() {
        this.deleteFilesAfterCompletion = null;
        this.disableMetricsCollection = null;
        this.distcpSettings = null;
        this.enablePartitionDiscovery = null;
        this.fileListPath = null;
        this.maxConcurrentConnections = null;
        this.modifiedDatetimeEnd = null;
        this.modifiedDatetimeStart = null;
        this.partitionRootPath = null;
        this.recursive = null;
        this.type = null;
        this.wildcardFileName = null;
        this.wildcardFolderPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HdfsReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object deleteFilesAfterCompletion;
        private @Nullable Object disableMetricsCollection;
        private @Nullable DistcpSettingsResponse distcpSettings;
        private @Nullable Boolean enablePartitionDiscovery;
        private @Nullable Object fileListPath;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object modifiedDatetimeEnd;
        private @Nullable Object modifiedDatetimeStart;
        private @Nullable Object partitionRootPath;
        private @Nullable Object recursive;
        private String type;
        private @Nullable Object wildcardFileName;
        private @Nullable Object wildcardFolderPath;

        public Builder() {
    	      // Empty
        }

        public Builder(HdfsReadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteFilesAfterCompletion = defaults.deleteFilesAfterCompletion;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.distcpSettings = defaults.distcpSettings;
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

        public Builder deleteFilesAfterCompletion(@Nullable Object deleteFilesAfterCompletion) {
            this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder distcpSettings(@Nullable DistcpSettingsResponse distcpSettings) {
            this.distcpSettings = distcpSettings;
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
        }        public HdfsReadSettingsResponse build() {
            return new HdfsReadSettingsResponse(deleteFilesAfterCompletion, disableMetricsCollection, distcpSettings, enablePartitionDiscovery, fileListPath, maxConcurrentConnections, modifiedDatetimeEnd, modifiedDatetimeStart, partitionRootPath, recursive, type, wildcardFileName, wildcardFolderPath);
        }
    }
}
