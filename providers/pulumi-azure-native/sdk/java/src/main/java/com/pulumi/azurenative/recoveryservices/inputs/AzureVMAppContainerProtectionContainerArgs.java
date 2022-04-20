// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import com.pulumi.azurenative.recoveryservices.enums.OperationType;
import com.pulumi.azurenative.recoveryservices.enums.WorkloadType;
import com.pulumi.azurenative.recoveryservices.inputs.AzureWorkloadContainerExtendedInfoArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container for SQL workloads under Azure Virtual Machines.
 * 
 */
public final class AzureVMAppContainerProtectionContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureVMAppContainerProtectionContainerArgs Empty = new AzureVMAppContainerProtectionContainerArgs();

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
     * Expected value is &#39;VMAppContainer&#39;.
     * 
     */
    @Import(name="containerType", required=true)
      private final Output<String> containerType;

    public Output<String> containerType() {
        return this.containerType;
    }

    /**
     * Additional details of a workload container.
     * 
     */
    @Import(name="extendedInfo")
      private final @Nullable Output<AzureWorkloadContainerExtendedInfoArgs> extendedInfo;

    public Output<AzureWorkloadContainerExtendedInfoArgs> extendedInfo() {
        return this.extendedInfo == null ? Codegen.empty() : this.extendedInfo;
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
     * Time stamp when this container was updated.
     * 
     */
    @Import(name="lastUpdatedTime")
      private final @Nullable Output<String> lastUpdatedTime;

    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime == null ? Codegen.empty() : this.lastUpdatedTime;
    }

    /**
     * Re-Do Operation
     * 
     */
    @Import(name="operationType")
      private final @Nullable Output<Either<String,OperationType>> operationType;

    public Output<Either<String,OperationType>> operationType() {
        return this.operationType == null ? Codegen.empty() : this.operationType;
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
     * ARM ID of the virtual machine represented by this Azure Workload Container
     * 
     */
    @Import(name="sourceResourceId")
      private final @Nullable Output<String> sourceResourceId;

    public Output<String> sourceResourceId() {
        return this.sourceResourceId == null ? Codegen.empty() : this.sourceResourceId;
    }

    /**
     * Workload type for which registration was sent.
     * 
     */
    @Import(name="workloadType")
      private final @Nullable Output<Either<String,WorkloadType>> workloadType;

    public Output<Either<String,WorkloadType>> workloadType() {
        return this.workloadType == null ? Codegen.empty() : this.workloadType;
    }

    public AzureVMAppContainerProtectionContainerArgs(
        @Nullable Output<Either<String,BackupManagementType>> backupManagementType,
        Output<String> containerType,
        @Nullable Output<AzureWorkloadContainerExtendedInfoArgs> extendedInfo,
        @Nullable Output<String> friendlyName,
        @Nullable Output<String> healthStatus,
        @Nullable Output<String> lastUpdatedTime,
        @Nullable Output<Either<String,OperationType>> operationType,
        @Nullable Output<String> registrationStatus,
        @Nullable Output<String> sourceResourceId,
        @Nullable Output<Either<String,WorkloadType>> workloadType) {
        this.backupManagementType = backupManagementType;
        this.containerType = Codegen.stringProp("containerType").output().arg(containerType).require();
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.lastUpdatedTime = lastUpdatedTime;
        this.operationType = operationType;
        this.registrationStatus = registrationStatus;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    private AzureVMAppContainerProtectionContainerArgs() {
        this.backupManagementType = Codegen.empty();
        this.containerType = Codegen.empty();
        this.extendedInfo = Codegen.empty();
        this.friendlyName = Codegen.empty();
        this.healthStatus = Codegen.empty();
        this.lastUpdatedTime = Codegen.empty();
        this.operationType = Codegen.empty();
        this.registrationStatus = Codegen.empty();
        this.sourceResourceId = Codegen.empty();
        this.workloadType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureVMAppContainerProtectionContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;
        private Output<String> containerType;
        private @Nullable Output<AzureWorkloadContainerExtendedInfoArgs> extendedInfo;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<String> healthStatus;
        private @Nullable Output<String> lastUpdatedTime;
        private @Nullable Output<Either<String,OperationType>> operationType;
        private @Nullable Output<String> registrationStatus;
        private @Nullable Output<String> sourceResourceId;
        private @Nullable Output<Either<String,WorkloadType>> workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureVMAppContainerProtectionContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.containerType = defaults.containerType;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.operationType = defaults.operationType;
    	      this.registrationStatus = defaults.registrationStatus;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.workloadType = defaults.workloadType;
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
        public Builder extendedInfo(@Nullable Output<AzureWorkloadContainerExtendedInfoArgs> extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }
        public Builder extendedInfo(@Nullable AzureWorkloadContainerExtendedInfoArgs extendedInfo) {
            this.extendedInfo = Codegen.ofNullable(extendedInfo);
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
        public Builder lastUpdatedTime(@Nullable Output<String> lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = Codegen.ofNullable(lastUpdatedTime);
            return this;
        }
        public Builder operationType(@Nullable Output<Either<String,OperationType>> operationType) {
            this.operationType = operationType;
            return this;
        }
        public Builder operationType(@Nullable Either<String,OperationType> operationType) {
            this.operationType = Codegen.ofNullable(operationType);
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
        public Builder sourceResourceId(@Nullable Output<String> sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }
        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = Codegen.ofNullable(sourceResourceId);
            return this;
        }
        public Builder workloadType(@Nullable Output<Either<String,WorkloadType>> workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public Builder workloadType(@Nullable Either<String,WorkloadType> workloadType) {
            this.workloadType = Codegen.ofNullable(workloadType);
            return this;
        }        public AzureVMAppContainerProtectionContainerArgs build() {
            return new AzureVMAppContainerProtectionContainerArgs(backupManagementType, containerType, extendedInfo, friendlyName, healthStatus, lastUpdatedTime, operationType, registrationStatus, sourceResourceId, workloadType);
        }
    }
}
