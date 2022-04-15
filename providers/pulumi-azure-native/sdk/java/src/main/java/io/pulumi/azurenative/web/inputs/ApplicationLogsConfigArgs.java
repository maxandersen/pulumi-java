// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.AzureBlobStorageApplicationLogsConfigArgs;
import io.pulumi.azurenative.web.inputs.AzureTableStorageApplicationLogsConfigArgs;
import io.pulumi.azurenative.web.inputs.FileSystemApplicationLogsConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Application logs configuration.
 * 
 */
public final class ApplicationLogsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationLogsConfigArgs Empty = new ApplicationLogsConfigArgs();

    /**
     * Application logs to blob storage configuration.
     * 
     */
    @Import(name="azureBlobStorage")
      private final @Nullable Output<AzureBlobStorageApplicationLogsConfigArgs> azureBlobStorage;

    public Output<AzureBlobStorageApplicationLogsConfigArgs> azureBlobStorage() {
        return this.azureBlobStorage == null ? Codegen.empty() : this.azureBlobStorage;
    }

    /**
     * Application logs to azure table storage configuration.
     * 
     */
    @Import(name="azureTableStorage")
      private final @Nullable Output<AzureTableStorageApplicationLogsConfigArgs> azureTableStorage;

    public Output<AzureTableStorageApplicationLogsConfigArgs> azureTableStorage() {
        return this.azureTableStorage == null ? Codegen.empty() : this.azureTableStorage;
    }

    /**
     * Application logs to file system configuration.
     * 
     */
    @Import(name="fileSystem")
      private final @Nullable Output<FileSystemApplicationLogsConfigArgs> fileSystem;

    public Output<FileSystemApplicationLogsConfigArgs> fileSystem() {
        return this.fileSystem == null ? Codegen.empty() : this.fileSystem;
    }

    public ApplicationLogsConfigArgs(
        @Nullable Output<AzureBlobStorageApplicationLogsConfigArgs> azureBlobStorage,
        @Nullable Output<AzureTableStorageApplicationLogsConfigArgs> azureTableStorage,
        @Nullable Output<FileSystemApplicationLogsConfigArgs> fileSystem) {
        this.azureBlobStorage = azureBlobStorage;
        this.azureTableStorage = azureTableStorage;
        this.fileSystem = fileSystem;
    }

    private ApplicationLogsConfigArgs() {
        this.azureBlobStorage = Codegen.empty();
        this.azureTableStorage = Codegen.empty();
        this.fileSystem = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationLogsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AzureBlobStorageApplicationLogsConfigArgs> azureBlobStorage;
        private @Nullable Output<AzureTableStorageApplicationLogsConfigArgs> azureTableStorage;
        private @Nullable Output<FileSystemApplicationLogsConfigArgs> fileSystem;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationLogsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorage = defaults.azureBlobStorage;
    	      this.azureTableStorage = defaults.azureTableStorage;
    	      this.fileSystem = defaults.fileSystem;
        }

        public Builder azureBlobStorage(@Nullable Output<AzureBlobStorageApplicationLogsConfigArgs> azureBlobStorage) {
            this.azureBlobStorage = azureBlobStorage;
            return this;
        }
        public Builder azureBlobStorage(@Nullable AzureBlobStorageApplicationLogsConfigArgs azureBlobStorage) {
            this.azureBlobStorage = Codegen.ofNullable(azureBlobStorage);
            return this;
        }
        public Builder azureTableStorage(@Nullable Output<AzureTableStorageApplicationLogsConfigArgs> azureTableStorage) {
            this.azureTableStorage = azureTableStorage;
            return this;
        }
        public Builder azureTableStorage(@Nullable AzureTableStorageApplicationLogsConfigArgs azureTableStorage) {
            this.azureTableStorage = Codegen.ofNullable(azureTableStorage);
            return this;
        }
        public Builder fileSystem(@Nullable Output<FileSystemApplicationLogsConfigArgs> fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }
        public Builder fileSystem(@Nullable FileSystemApplicationLogsConfigArgs fileSystem) {
            this.fileSystem = Codegen.ofNullable(fileSystem);
            return this;
        }        public ApplicationLogsConfigArgs build() {
            return new ApplicationLogsConfigArgs(azureBlobStorage, azureTableStorage, fileSystem);
        }
    }
}
