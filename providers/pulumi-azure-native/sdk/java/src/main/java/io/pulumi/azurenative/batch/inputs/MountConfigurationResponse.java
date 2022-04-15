// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.AzureBlobFileSystemConfigurationResponse;
import io.pulumi.azurenative.batch.inputs.AzureFileShareConfigurationResponse;
import io.pulumi.azurenative.batch.inputs.CIFSMountConfigurationResponse;
import io.pulumi.azurenative.batch.inputs.NFSMountConfigurationResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MountConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final MountConfigurationResponse Empty = new MountConfigurationResponse();

    /**
     * This property is mutually exclusive with all other properties.
     * 
     */
    @Import(name="azureBlobFileSystemConfiguration")
      private final @Nullable AzureBlobFileSystemConfigurationResponse azureBlobFileSystemConfiguration;

    public Optional<AzureBlobFileSystemConfigurationResponse> azureBlobFileSystemConfiguration() {
        return this.azureBlobFileSystemConfiguration == null ? Optional.empty() : Optional.ofNullable(this.azureBlobFileSystemConfiguration);
    }

    /**
     * This property is mutually exclusive with all other properties.
     * 
     */
    @Import(name="azureFileShareConfiguration")
      private final @Nullable AzureFileShareConfigurationResponse azureFileShareConfiguration;

    public Optional<AzureFileShareConfigurationResponse> azureFileShareConfiguration() {
        return this.azureFileShareConfiguration == null ? Optional.empty() : Optional.ofNullable(this.azureFileShareConfiguration);
    }

    /**
     * This property is mutually exclusive with all other properties.
     * 
     */
    @Import(name="cifsMountConfiguration")
      private final @Nullable CIFSMountConfigurationResponse cifsMountConfiguration;

    public Optional<CIFSMountConfigurationResponse> cifsMountConfiguration() {
        return this.cifsMountConfiguration == null ? Optional.empty() : Optional.ofNullable(this.cifsMountConfiguration);
    }

    /**
     * This property is mutually exclusive with all other properties.
     * 
     */
    @Import(name="nfsMountConfiguration")
      private final @Nullable NFSMountConfigurationResponse nfsMountConfiguration;

    public Optional<NFSMountConfigurationResponse> nfsMountConfiguration() {
        return this.nfsMountConfiguration == null ? Optional.empty() : Optional.ofNullable(this.nfsMountConfiguration);
    }

    public MountConfigurationResponse(
        @Nullable AzureBlobFileSystemConfigurationResponse azureBlobFileSystemConfiguration,
        @Nullable AzureFileShareConfigurationResponse azureFileShareConfiguration,
        @Nullable CIFSMountConfigurationResponse cifsMountConfiguration,
        @Nullable NFSMountConfigurationResponse nfsMountConfiguration) {
        this.azureBlobFileSystemConfiguration = azureBlobFileSystemConfiguration;
        this.azureFileShareConfiguration = azureFileShareConfiguration;
        this.cifsMountConfiguration = cifsMountConfiguration;
        this.nfsMountConfiguration = nfsMountConfiguration;
    }

    private MountConfigurationResponse() {
        this.azureBlobFileSystemConfiguration = null;
        this.azureFileShareConfiguration = null;
        this.cifsMountConfiguration = null;
        this.nfsMountConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MountConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureBlobFileSystemConfigurationResponse azureBlobFileSystemConfiguration;
        private @Nullable AzureFileShareConfigurationResponse azureFileShareConfiguration;
        private @Nullable CIFSMountConfigurationResponse cifsMountConfiguration;
        private @Nullable NFSMountConfigurationResponse nfsMountConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(MountConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobFileSystemConfiguration = defaults.azureBlobFileSystemConfiguration;
    	      this.azureFileShareConfiguration = defaults.azureFileShareConfiguration;
    	      this.cifsMountConfiguration = defaults.cifsMountConfiguration;
    	      this.nfsMountConfiguration = defaults.nfsMountConfiguration;
        }

        public Builder azureBlobFileSystemConfiguration(@Nullable AzureBlobFileSystemConfigurationResponse azureBlobFileSystemConfiguration) {
            this.azureBlobFileSystemConfiguration = azureBlobFileSystemConfiguration;
            return this;
        }
        public Builder azureFileShareConfiguration(@Nullable AzureFileShareConfigurationResponse azureFileShareConfiguration) {
            this.azureFileShareConfiguration = azureFileShareConfiguration;
            return this;
        }
        public Builder cifsMountConfiguration(@Nullable CIFSMountConfigurationResponse cifsMountConfiguration) {
            this.cifsMountConfiguration = cifsMountConfiguration;
            return this;
        }
        public Builder nfsMountConfiguration(@Nullable NFSMountConfigurationResponse nfsMountConfiguration) {
            this.nfsMountConfiguration = nfsMountConfiguration;
            return this;
        }        public MountConfigurationResponse build() {
            return new MountConfigurationResponse(azureBlobFileSystemConfiguration, azureFileShareConfiguration, cifsMountConfiguration, nfsMountConfiguration);
        }
    }
}
