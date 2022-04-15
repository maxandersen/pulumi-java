// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IaaS VM workload-specific backup item representing an Azure Resource Manager virtual machine.
 * 
 */
public final class AzureIaaSComputeVMContainerResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureIaaSComputeVMContainerResponse Empty = new AzureIaaSComputeVMContainerResponse();

    /**
     * Type of backup management for the container.
     * 
     */
    @Import(name="backupManagementType")
      private final @Nullable String backupManagementType;

    public Optional<String> backupManagementType() {
        return this.backupManagementType == null ? Optional.empty() : Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'Microsoft.Compute/virtualMachines'.
     * 
     */
    @Import(name="containerType", required=true)
      private final String containerType;

    public String containerType() {
        return this.containerType;
    }

    /**
     * Friendly name of the container.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable String friendlyName;

    public Optional<String> friendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * Status of health of the container.
     * 
     */
    @Import(name="healthStatus")
      private final @Nullable String healthStatus;

    public Optional<String> healthStatus() {
        return this.healthStatus == null ? Optional.empty() : Optional.ofNullable(this.healthStatus);
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @Import(name="registrationStatus")
      private final @Nullable String registrationStatus;

    public Optional<String> registrationStatus() {
        return this.registrationStatus == null ? Optional.empty() : Optional.ofNullable(this.registrationStatus);
    }

    /**
     * Resource group name of Recovery Services Vault.
     * 
     */
    @Import(name="resourceGroup")
      private final @Nullable String resourceGroup;

    public Optional<String> resourceGroup() {
        return this.resourceGroup == null ? Optional.empty() : Optional.ofNullable(this.resourceGroup);
    }

    /**
     * Fully qualified ARM url of the virtual machine represented by this Azure IaaS VM container.
     * 
     */
    @Import(name="virtualMachineId")
      private final @Nullable String virtualMachineId;

    public Optional<String> virtualMachineId() {
        return this.virtualMachineId == null ? Optional.empty() : Optional.ofNullable(this.virtualMachineId);
    }

    /**
     * Specifies whether the container represents a Classic or an Azure Resource Manager VM.
     * 
     */
    @Import(name="virtualMachineVersion")
      private final @Nullable String virtualMachineVersion;

    public Optional<String> virtualMachineVersion() {
        return this.virtualMachineVersion == null ? Optional.empty() : Optional.ofNullable(this.virtualMachineVersion);
    }

    public AzureIaaSComputeVMContainerResponse(
        @Nullable String backupManagementType,
        String containerType,
        @Nullable String friendlyName,
        @Nullable String healthStatus,
        @Nullable String registrationStatus,
        @Nullable String resourceGroup,
        @Nullable String virtualMachineId,
        @Nullable String virtualMachineVersion) {
        this.backupManagementType = backupManagementType;
        this.containerType = Objects.requireNonNull(containerType, "expected parameter 'containerType' to be non-null");
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.registrationStatus = registrationStatus;
        this.resourceGroup = resourceGroup;
        this.virtualMachineId = virtualMachineId;
        this.virtualMachineVersion = virtualMachineVersion;
    }

    private AzureIaaSComputeVMContainerResponse() {
        this.backupManagementType = null;
        this.containerType = null;
        this.friendlyName = null;
        this.healthStatus = null;
        this.registrationStatus = null;
        this.resourceGroup = null;
        this.virtualMachineId = null;
        this.virtualMachineVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSComputeVMContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private String containerType;
        private @Nullable String friendlyName;
        private @Nullable String healthStatus;
        private @Nullable String registrationStatus;
        private @Nullable String resourceGroup;
        private @Nullable String virtualMachineId;
        private @Nullable String virtualMachineVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSComputeVMContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.containerType = defaults.containerType;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.registrationStatus = defaults.registrationStatus;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.virtualMachineId = defaults.virtualMachineId;
    	      this.virtualMachineVersion = defaults.virtualMachineVersion;
        }

        public Builder backupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }
        public Builder containerType(String containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder healthStatus(@Nullable String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public Builder registrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder virtualMachineId(@Nullable String virtualMachineId) {
            this.virtualMachineId = virtualMachineId;
            return this;
        }
        public Builder virtualMachineVersion(@Nullable String virtualMachineVersion) {
            this.virtualMachineVersion = virtualMachineVersion;
            return this;
        }        public AzureIaaSComputeVMContainerResponse build() {
            return new AzureIaaSComputeVMContainerResponse(backupManagementType, containerType, friendlyName, healthStatus, registrationStatus, resourceGroup, virtualMachineId, virtualMachineVersion);
        }
    }
}
