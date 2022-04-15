// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.PrivateEndpointConnectionVaultPropertiesResponse;
import io.pulumi.azurenative.recoveryservices.outputs.UpgradeDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VaultPropertiesResponseEncryption;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VaultPropertiesResponse {
    /**
     * Customer Managed Key details of the resource.
     * 
     */
    private final @Nullable VaultPropertiesResponseEncryption encryption;
    /**
     * List of private endpoint connection.
     * 
     */
    private final List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections;
    /**
     * Private endpoint state for backup.
     * 
     */
    private final String privateEndpointStateForBackup;
    /**
     * Private endpoint state for site recovery.
     * 
     */
    private final String privateEndpointStateForSiteRecovery;
    /**
     * Provisioning State.
     * 
     */
    private final String provisioningState;
    /**
     * Details for upgrading vault.
     * 
     */
    private final @Nullable UpgradeDetailsResponse upgradeDetails;

    @CustomType.Constructor
    private VaultPropertiesResponse(
        @CustomType.Parameter("encryption") @Nullable VaultPropertiesResponseEncryption encryption,
        @CustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections,
        @CustomType.Parameter("privateEndpointStateForBackup") String privateEndpointStateForBackup,
        @CustomType.Parameter("privateEndpointStateForSiteRecovery") String privateEndpointStateForSiteRecovery,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("upgradeDetails") @Nullable UpgradeDetailsResponse upgradeDetails) {
        this.encryption = encryption;
        this.privateEndpointConnections = privateEndpointConnections;
        this.privateEndpointStateForBackup = privateEndpointStateForBackup;
        this.privateEndpointStateForSiteRecovery = privateEndpointStateForSiteRecovery;
        this.provisioningState = provisioningState;
        this.upgradeDetails = upgradeDetails;
    }

    /**
     * Customer Managed Key details of the resource.
     * 
    */
    public Optional<VaultPropertiesResponseEncryption> encryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * List of private endpoint connection.
     * 
    */
    public List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Private endpoint state for backup.
     * 
    */
    public String privateEndpointStateForBackup() {
        return this.privateEndpointStateForBackup;
    }
    /**
     * Private endpoint state for site recovery.
     * 
    */
    public String privateEndpointStateForSiteRecovery() {
        return this.privateEndpointStateForSiteRecovery;
    }
    /**
     * Provisioning State.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Details for upgrading vault.
     * 
    */
    public Optional<UpgradeDetailsResponse> upgradeDetails() {
        return Optional.ofNullable(this.upgradeDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VaultPropertiesResponseEncryption encryption;
        private List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections;
        private String privateEndpointStateForBackup;
        private String privateEndpointStateForSiteRecovery;
        private String provisioningState;
        private @Nullable UpgradeDetailsResponse upgradeDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.privateEndpointStateForBackup = defaults.privateEndpointStateForBackup;
    	      this.privateEndpointStateForSiteRecovery = defaults.privateEndpointStateForSiteRecovery;
    	      this.provisioningState = defaults.provisioningState;
    	      this.upgradeDetails = defaults.upgradeDetails;
        }

        public Builder encryption(@Nullable VaultPropertiesResponseEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder privateEndpointConnections(List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionVaultPropertiesResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder privateEndpointStateForBackup(String privateEndpointStateForBackup) {
            this.privateEndpointStateForBackup = Objects.requireNonNull(privateEndpointStateForBackup);
            return this;
        }
        public Builder privateEndpointStateForSiteRecovery(String privateEndpointStateForSiteRecovery) {
            this.privateEndpointStateForSiteRecovery = Objects.requireNonNull(privateEndpointStateForSiteRecovery);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder upgradeDetails(@Nullable UpgradeDetailsResponse upgradeDetails) {
            this.upgradeDetails = upgradeDetails;
            return this;
        }        public VaultPropertiesResponse build() {
            return new VaultPropertiesResponse(encryption, privateEndpointConnections, privateEndpointStateForBackup, privateEndpointStateForSiteRecovery, provisioningState, upgradeDetails);
        }
    }
}
