// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureStorageContainerResponse {
    /**
     * Type of backup management for the container.
     * 
     */
    private final @Nullable String backupManagementType;
    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is &#39;StorageContainer&#39;.
     * 
     */
    private final String containerType;
    /**
     * Friendly name of the container.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * Status of health of the container.
     * 
     */
    private final @Nullable String healthStatus;
    /**
     * Number of items backed up in this container.
     * 
     */
    private final @Nullable Double protectedItemCount;
    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    private final @Nullable String registrationStatus;
    /**
     * Resource group name of Recovery Services Vault.
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     * Fully qualified ARM url.
     * 
     */
    private final @Nullable String sourceResourceId;
    /**
     * Storage account version.
     * 
     */
    private final @Nullable String storageAccountVersion;

    @CustomType.Constructor
    private AzureStorageContainerResponse(
        @CustomType.Parameter("backupManagementType") @Nullable String backupManagementType,
        @CustomType.Parameter("containerType") String containerType,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("healthStatus") @Nullable String healthStatus,
        @CustomType.Parameter("protectedItemCount") @Nullable Double protectedItemCount,
        @CustomType.Parameter("registrationStatus") @Nullable String registrationStatus,
        @CustomType.Parameter("resourceGroup") @Nullable String resourceGroup,
        @CustomType.Parameter("sourceResourceId") @Nullable String sourceResourceId,
        @CustomType.Parameter("storageAccountVersion") @Nullable String storageAccountVersion) {
        this.backupManagementType = backupManagementType;
        this.containerType = containerType;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.protectedItemCount = protectedItemCount;
        this.registrationStatus = registrationStatus;
        this.resourceGroup = resourceGroup;
        this.sourceResourceId = sourceResourceId;
        this.storageAccountVersion = storageAccountVersion;
    }

    /**
     * Type of backup management for the container.
     * 
    */
    public Optional<String> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is &#39;StorageContainer&#39;.
     * 
    */
    public String containerType() {
        return this.containerType;
    }
    /**
     * Friendly name of the container.
     * 
    */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * Status of health of the container.
     * 
    */
    public Optional<String> healthStatus() {
        return Optional.ofNullable(this.healthStatus);
    }
    /**
     * Number of items backed up in this container.
     * 
    */
    public Optional<Double> protectedItemCount() {
        return Optional.ofNullable(this.protectedItemCount);
    }
    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
    */
    public Optional<String> registrationStatus() {
        return Optional.ofNullable(this.registrationStatus);
    }
    /**
     * Resource group name of Recovery Services Vault.
     * 
    */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * Fully qualified ARM url.
     * 
    */
    public Optional<String> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }
    /**
     * Storage account version.
     * 
    */
    public Optional<String> storageAccountVersion() {
        return Optional.ofNullable(this.storageAccountVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureStorageContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private String containerType;
        private @Nullable String friendlyName;
        private @Nullable String healthStatus;
        private @Nullable Double protectedItemCount;
        private @Nullable String registrationStatus;
        private @Nullable String resourceGroup;
        private @Nullable String sourceResourceId;
        private @Nullable String storageAccountVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureStorageContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.containerType = defaults.containerType;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.protectedItemCount = defaults.protectedItemCount;
    	      this.registrationStatus = defaults.registrationStatus;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.storageAccountVersion = defaults.storageAccountVersion;
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
        public Builder protectedItemCount(@Nullable Double protectedItemCount) {
            this.protectedItemCount = protectedItemCount;
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
        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }
        public Builder storageAccountVersion(@Nullable String storageAccountVersion) {
            this.storageAccountVersion = storageAccountVersion;
            return this;
        }        public AzureStorageContainerResponse build() {
            return new AzureStorageContainerResponse(backupManagementType, containerType, friendlyName, healthStatus, protectedItemCount, registrationStatus, resourceGroup, sourceResourceId, storageAccountVersion);
        }
    }
}
