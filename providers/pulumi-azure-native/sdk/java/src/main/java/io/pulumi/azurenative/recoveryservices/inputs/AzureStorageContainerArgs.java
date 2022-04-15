// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure Storage Account workload-specific container.
 * 
 */
public final class AzureStorageContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureStorageContainerArgs Empty = new AzureStorageContainerArgs();

    /**
     * Type of backup management for the container.
     * 
     */
    @Import(name="backupManagementType")
      private final @Nullable Output<Either<String,BackupManagementType>> backupManagementType;

    public Output<Either<String,BackupManagementType>> backupManagementType() {
        return this.backupManagementType == null ? Codegen.empty() : this.backupManagementType;
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'StorageContainer'.
     * 
     */
    @Import(name="containerType", required=true)
      private final Output<String> containerType;

    public Output<String> containerType() {
        return this.containerType;
    }

    /**
     * Friendly name of the container.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> friendlyName() {
        return this.friendlyName == null ? Codegen.empty() : this.friendlyName;
    }

    /**
     * Status of health of the container.
     * 
     */
    @Import(name="healthStatus")
      private final @Nullable Output<String> healthStatus;

    public Output<String> healthStatus() {
        return this.healthStatus == null ? Codegen.empty() : this.healthStatus;
    }

    /**
     * Number of items backed up in this container.
     * 
     */
    @Import(name="protectedItemCount")
      private final @Nullable Output<Double> protectedItemCount;

    public Output<Double> protectedItemCount() {
        return this.protectedItemCount == null ? Codegen.empty() : this.protectedItemCount;
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @Import(name="registrationStatus")
      private final @Nullable Output<String> registrationStatus;

    public Output<String> registrationStatus() {
        return this.registrationStatus == null ? Codegen.empty() : this.registrationStatus;
    }

    /**
     * Resource group name of Recovery Services Vault.
     * 
     */
    @Import(name="resourceGroup")
      private final @Nullable Output<String> resourceGroup;

    public Output<String> resourceGroup() {
        return this.resourceGroup == null ? Codegen.empty() : this.resourceGroup;
    }

    /**
     * Fully qualified ARM url.
     * 
     */
    @Import(name="sourceResourceId")
      private final @Nullable Output<String> sourceResourceId;

    public Output<String> sourceResourceId() {
        return this.sourceResourceId == null ? Codegen.empty() : this.sourceResourceId;
    }

    /**
     * Storage account version.
     * 
     */
    @Import(name="storageAccountVersion")
      private final @Nullable Output<String> storageAccountVersion;

    public Output<String> storageAccountVersion() {
        return this.storageAccountVersion == null ? Codegen.empty() : this.storageAccountVersion;
    }

    public AzureStorageContainerArgs(
        @Nullable Output<Either<String,BackupManagementType>> backupManagementType,
        Output<String> containerType,
        @Nullable Output<String> friendlyName,
        @Nullable Output<String> healthStatus,
        @Nullable Output<Double> protectedItemCount,
        @Nullable Output<String> registrationStatus,
        @Nullable Output<String> resourceGroup,
        @Nullable Output<String> sourceResourceId,
        @Nullable Output<String> storageAccountVersion) {
        this.backupManagementType = backupManagementType;
        this.containerType = Objects.requireNonNull(containerType, "expected parameter 'containerType' to be non-null");
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.protectedItemCount = protectedItemCount;
        this.registrationStatus = registrationStatus;
        this.resourceGroup = resourceGroup;
        this.sourceResourceId = sourceResourceId;
        this.storageAccountVersion = storageAccountVersion;
    }

    private AzureStorageContainerArgs() {
        this.backupManagementType = Codegen.empty();
        this.containerType = Codegen.empty();
        this.friendlyName = Codegen.empty();
        this.healthStatus = Codegen.empty();
        this.protectedItemCount = Codegen.empty();
        this.registrationStatus = Codegen.empty();
        this.resourceGroup = Codegen.empty();
        this.sourceResourceId = Codegen.empty();
        this.storageAccountVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureStorageContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;
        private Output<String> containerType;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<String> healthStatus;
        private @Nullable Output<Double> protectedItemCount;
        private @Nullable Output<String> registrationStatus;
        private @Nullable Output<String> resourceGroup;
        private @Nullable Output<String> sourceResourceId;
        private @Nullable Output<String> storageAccountVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureStorageContainerArgs defaults) {
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

        public Builder backupManagementType(@Nullable Output<Either<String,BackupManagementType>> backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }
        public Builder backupManagementType(@Nullable Either<String,BackupManagementType> backupManagementType) {
            this.backupManagementType = Codegen.ofNullable(backupManagementType);
            return this;
        }
        public Builder containerType(Output<String> containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }
        public Builder containerType(String containerType) {
            this.containerType = Output.of(Objects.requireNonNull(containerType));
            return this;
        }
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Codegen.ofNullable(friendlyName);
            return this;
        }
        public Builder healthStatus(@Nullable Output<String> healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public Builder healthStatus(@Nullable String healthStatus) {
            this.healthStatus = Codegen.ofNullable(healthStatus);
            return this;
        }
        public Builder protectedItemCount(@Nullable Output<Double> protectedItemCount) {
            this.protectedItemCount = protectedItemCount;
            return this;
        }
        public Builder protectedItemCount(@Nullable Double protectedItemCount) {
            this.protectedItemCount = Codegen.ofNullable(protectedItemCount);
            return this;
        }
        public Builder registrationStatus(@Nullable Output<String> registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }
        public Builder registrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = Codegen.ofNullable(registrationStatus);
            return this;
        }
        public Builder resourceGroup(@Nullable Output<String> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = Codegen.ofNullable(resourceGroup);
            return this;
        }
        public Builder sourceResourceId(@Nullable Output<String> sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }
        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = Codegen.ofNullable(sourceResourceId);
            return this;
        }
        public Builder storageAccountVersion(@Nullable Output<String> storageAccountVersion) {
            this.storageAccountVersion = storageAccountVersion;
            return this;
        }
        public Builder storageAccountVersion(@Nullable String storageAccountVersion) {
            this.storageAccountVersion = Codegen.ofNullable(storageAccountVersion);
            return this;
        }        public AzureStorageContainerArgs build() {
            return new AzureStorageContainerArgs(backupManagementType, containerType, friendlyName, healthStatus, protectedItemCount, registrationStatus, resourceGroup, sourceResourceId, storageAccountVersion);
        }
    }
}
