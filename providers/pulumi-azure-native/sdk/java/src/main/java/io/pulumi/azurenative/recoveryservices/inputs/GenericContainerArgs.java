// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.azurenative.recoveryservices.inputs.GenericContainerExtendedInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Base class for generic container of backup items
 * 
 */
public final class GenericContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final GenericContainerArgs Empty = new GenericContainerArgs();

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
     * Expected value is 'GenericContainer'.
     * 
     */
    @Import(name="containerType", required=true)
      private final Output<String> containerType;

    public Output<String> containerType() {
        return this.containerType;
    }

    /**
     * Extended information (not returned in List container API calls)
     * 
     */
    @Import(name="extendedInformation")
      private final @Nullable Output<GenericContainerExtendedInfoArgs> extendedInformation;

    public Output<GenericContainerExtendedInfoArgs> extendedInformation() {
        return this.extendedInformation == null ? Codegen.empty() : this.extendedInformation;
    }

    /**
     * Name of the container's fabric
     * 
     */
    @Import(name="fabricName")
      private final @Nullable Output<String> fabricName;

    public Output<String> fabricName() {
        return this.fabricName == null ? Codegen.empty() : this.fabricName;
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
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @Import(name="registrationStatus")
      private final @Nullable Output<String> registrationStatus;

    public Output<String> registrationStatus() {
        return this.registrationStatus == null ? Codegen.empty() : this.registrationStatus;
    }

    public GenericContainerArgs(
        @Nullable Output<Either<String,BackupManagementType>> backupManagementType,
        Output<String> containerType,
        @Nullable Output<GenericContainerExtendedInfoArgs> extendedInformation,
        @Nullable Output<String> fabricName,
        @Nullable Output<String> friendlyName,
        @Nullable Output<String> healthStatus,
        @Nullable Output<String> registrationStatus) {
        this.backupManagementType = backupManagementType;
        this.containerType = Objects.requireNonNull(containerType, "expected parameter 'containerType' to be non-null");
        this.extendedInformation = extendedInformation;
        this.fabricName = fabricName;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.registrationStatus = registrationStatus;
    }

    private GenericContainerArgs() {
        this.backupManagementType = Codegen.empty();
        this.containerType = Codegen.empty();
        this.extendedInformation = Codegen.empty();
        this.fabricName = Codegen.empty();
        this.friendlyName = Codegen.empty();
        this.healthStatus = Codegen.empty();
        this.registrationStatus = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;
        private Output<String> containerType;
        private @Nullable Output<GenericContainerExtendedInfoArgs> extendedInformation;
        private @Nullable Output<String> fabricName;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<String> healthStatus;
        private @Nullable Output<String> registrationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GenericContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.containerType = defaults.containerType;
    	      this.extendedInformation = defaults.extendedInformation;
    	      this.fabricName = defaults.fabricName;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.registrationStatus = defaults.registrationStatus;
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
        public Builder extendedInformation(@Nullable Output<GenericContainerExtendedInfoArgs> extendedInformation) {
            this.extendedInformation = extendedInformation;
            return this;
        }
        public Builder extendedInformation(@Nullable GenericContainerExtendedInfoArgs extendedInformation) {
            this.extendedInformation = Codegen.ofNullable(extendedInformation);
            return this;
        }
        public Builder fabricName(@Nullable Output<String> fabricName) {
            this.fabricName = fabricName;
            return this;
        }
        public Builder fabricName(@Nullable String fabricName) {
            this.fabricName = Codegen.ofNullable(fabricName);
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
        public Builder registrationStatus(@Nullable Output<String> registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }
        public Builder registrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = Codegen.ofNullable(registrationStatus);
            return this;
        }        public GenericContainerArgs build() {
            return new GenericContainerArgs(backupManagementType, containerType, extendedInformation, fabricName, friendlyName, healthStatus, registrationStatus);
        }
    }
}
