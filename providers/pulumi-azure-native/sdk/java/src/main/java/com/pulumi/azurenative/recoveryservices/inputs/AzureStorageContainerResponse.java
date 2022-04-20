// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Storage Account workload-specific container.
 * 
 */
public final class AzureStorageContainerResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureStorageContainerResponse Empty = new AzureStorageContainerResponse();

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
     * Expected value is &#39;StorageContainer&#39;.
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
     * Number of items backed up in this container.
     * 
     */
    @Import(name="protectedItemCount")
      private final @Nullable Double protectedItemCount;

    public Optional<Double> protectedItemCount() {
        return this.protectedItemCount == null ? Optional.empty() : Optional.ofNullable(this.protectedItemCount);
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
     * Fully qualified ARM url.
     * 
     */
    @Import(name="sourceResourceId")
      private final @Nullable String sourceResourceId;

    public Optional<String> sourceResourceId() {
        return this.sourceResourceId == null ? Optional.empty() : Optional.ofNullable(this.sourceResourceId);
    }

    /**
     * Storage account version.
     * 
     */
    @Import(name="storageAccountVersion")
      private final @Nullable String storageAccountVersion;

    public Optional<String> storageAccountVersion() {
        return this.storageAccountVersion == null ? Optional.empty() : Optional.ofNullable(this.storageAccountVersion);
    }

    public AzureStorageContainerResponse(
        @Nullable String backupManagementType,
        String containerType,
        @Nullable String friendlyName,
        @Nullable String healthStatus,
        @Nullable Double protectedItemCount,
        @Nullable String registrationStatus,
        @Nullable String resourceGroup,
        @Nullable String sourceResourceId,
        @Nullable String storageAccountVersion) {
        this.backupManagementType = backupManagementType;
        this.containerType = Codegen.stringProp("containerType").arg(containerType).require();
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.protectedItemCount = protectedItemCount;
        this.registrationStatus = registrationStatus;
        this.resourceGroup = resourceGroup;
        this.sourceResourceId = sourceResourceId;
        this.storageAccountVersion = storageAccountVersion;
    }

    private AzureStorageContainerResponse() {
        this.backupManagementType = null;
        this.containerType = null;
        this.friendlyName = null;
        this.healthStatus = null;
        this.protectedItemCount = null;
        this.registrationStatus = null;
        this.resourceGroup = null;
        this.sourceResourceId = null;
        this.storageAccountVersion = null;
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
