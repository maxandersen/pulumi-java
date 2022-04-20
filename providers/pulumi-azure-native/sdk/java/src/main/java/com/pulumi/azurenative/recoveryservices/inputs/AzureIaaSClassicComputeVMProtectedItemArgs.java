// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import com.pulumi.azurenative.recoveryservices.enums.CreateMode;
import com.pulumi.azurenative.recoveryservices.enums.DataSourceType;
import com.pulumi.azurenative.recoveryservices.enums.HealthStatus;
import com.pulumi.azurenative.recoveryservices.enums.ProtectionState;
import com.pulumi.azurenative.recoveryservices.inputs.AzureIaaSVMProtectedItemExtendedInfoArgs;
import com.pulumi.azurenative.recoveryservices.inputs.ExtendedPropertiesArgs;
import com.pulumi.azurenative.recoveryservices.inputs.KPIResourceHealthDetailsArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IaaS VM workload-specific backup item representing the Classic Compute VM.
 * 
 */
public final class AzureIaaSClassicComputeVMProtectedItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureIaaSClassicComputeVMProtectedItemArgs Empty = new AzureIaaSClassicComputeVMProtectedItemArgs();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @Import(name="backupManagementType")
      private final @Nullable Output<Either<String,BackupManagementType>> backupManagementType;

    public Output<Either<String,BackupManagementType>> backupManagementType() {
        return this.backupManagementType == null ? Codegen.empty() : this.backupManagementType;
    }

    /**
     * Name of the backup set the backup item belongs to
     * 
     */
    @Import(name="backupSetName")
      private final @Nullable Output<String> backupSetName;

    public Output<String> backupSetName() {
        return this.backupSetName == null ? Codegen.empty() : this.backupSetName;
    }

    /**
     * Unique name of container
     * 
     */
    @Import(name="containerName")
      private final @Nullable Output<String> containerName;

    public Output<String> containerName() {
        return this.containerName == null ? Codegen.empty() : this.containerName;
    }

    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    @Import(name="createMode")
      private final @Nullable Output<Either<String,CreateMode>> createMode;

    public Output<Either<String,CreateMode>> createMode() {
        return this.createMode == null ? Codegen.empty() : this.createMode;
    }

    /**
     * Time for deferred deletion in UTC
     * 
     */
    @Import(name="deferredDeleteTimeInUTC")
      private final @Nullable Output<String> deferredDeleteTimeInUTC;

    public Output<String> deferredDeleteTimeInUTC() {
        return this.deferredDeleteTimeInUTC == null ? Codegen.empty() : this.deferredDeleteTimeInUTC;
    }

    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    @Import(name="deferredDeleteTimeRemaining")
      private final @Nullable Output<String> deferredDeleteTimeRemaining;

    public Output<String> deferredDeleteTimeRemaining() {
        return this.deferredDeleteTimeRemaining == null ? Codegen.empty() : this.deferredDeleteTimeRemaining;
    }

    /**
     * Additional information for this backup item.
     * 
     */
    @Import(name="extendedInfo")
      private final @Nullable Output<AzureIaaSVMProtectedItemExtendedInfoArgs> extendedInfo;

    public Output<AzureIaaSVMProtectedItemExtendedInfoArgs> extendedInfo() {
        return this.extendedInfo == null ? Codegen.empty() : this.extendedInfo;
    }

    /**
     * Extended Properties for Azure IaasVM Backup.
     * 
     */
    @Import(name="extendedProperties")
      private final @Nullable Output<ExtendedPropertiesArgs> extendedProperties;

    public Output<ExtendedPropertiesArgs> extendedProperties() {
        return this.extendedProperties == null ? Codegen.empty() : this.extendedProperties;
    }

    /**
     * Friendly name of the VM represented by this backup item.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> friendlyName() {
        return this.friendlyName == null ? Codegen.empty() : this.friendlyName;
    }

    /**
     * Health status of protected item.
     * 
     */
    @Import(name="healthStatus")
      private final @Nullable Output<Either<String,HealthStatus>> healthStatus;

    public Output<Either<String,HealthStatus>> healthStatus() {
        return this.healthStatus == null ? Codegen.empty() : this.healthStatus;
    }

    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    @Import(name="isDeferredDeleteScheduleUpcoming")
      private final @Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming;

    public Output<Boolean> isDeferredDeleteScheduleUpcoming() {
        return this.isDeferredDeleteScheduleUpcoming == null ? Codegen.empty() : this.isDeferredDeleteScheduleUpcoming;
    }

    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    @Import(name="isRehydrate")
      private final @Nullable Output<Boolean> isRehydrate;

    public Output<Boolean> isRehydrate() {
        return this.isRehydrate == null ? Codegen.empty() : this.isRehydrate;
    }

    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    @Import(name="isScheduledForDeferredDelete")
      private final @Nullable Output<Boolean> isScheduledForDeferredDelete;

    public Output<Boolean> isScheduledForDeferredDelete() {
        return this.isScheduledForDeferredDelete == null ? Codegen.empty() : this.isScheduledForDeferredDelete;
    }

    /**
     * Health details of different KPIs
     * 
     */
    @Import(name="kpisHealths")
      private final @Nullable Output<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths;

    public Output<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths() {
        return this.kpisHealths == null ? Codegen.empty() : this.kpisHealths;
    }

    /**
     * Last backup operation status.
     * 
     */
    @Import(name="lastBackupStatus")
      private final @Nullable Output<String> lastBackupStatus;

    public Output<String> lastBackupStatus() {
        return this.lastBackupStatus == null ? Codegen.empty() : this.lastBackupStatus;
    }

    /**
     * Timestamp of the last backup operation on this backup item.
     * 
     */
    @Import(name="lastBackupTime")
      private final @Nullable Output<String> lastBackupTime;

    public Output<String> lastBackupTime() {
        return this.lastBackupTime == null ? Codegen.empty() : this.lastBackupTime;
    }

    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    @Import(name="lastRecoveryPoint")
      private final @Nullable Output<String> lastRecoveryPoint;

    public Output<String> lastRecoveryPoint() {
        return this.lastRecoveryPoint == null ? Codegen.empty() : this.lastRecoveryPoint;
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @Import(name="policyId")
      private final @Nullable Output<String> policyId;

    public Output<String> policyId() {
        return this.policyId == null ? Codegen.empty() : this.policyId;
    }

    /**
     * Data ID of the protected item.
     * 
     */
    @Import(name="protectedItemDataId")
      private final @Nullable Output<String> protectedItemDataId;

    public Output<String> protectedItemDataId() {
        return this.protectedItemDataId == null ? Codegen.empty() : this.protectedItemDataId;
    }

    /**
     * backup item type.
     * Expected value is &#39;Microsoft.ClassicCompute/virtualMachines&#39;.
     * 
     */
    @Import(name="protectedItemType", required=true)
      private final Output<String> protectedItemType;

    public Output<String> protectedItemType() {
        return this.protectedItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @Import(name="protectionState")
      private final @Nullable Output<Either<String,ProtectionState>> protectionState;

    public Output<Either<String,ProtectionState>> protectionState() {
        return this.protectionState == null ? Codegen.empty() : this.protectionState;
    }

    /**
     * Backup status of this backup item.
     * 
     */
    @Import(name="protectionStatus")
      private final @Nullable Output<String> protectionStatus;

    public Output<String> protectionStatus() {
        return this.protectionStatus == null ? Codegen.empty() : this.protectionStatus;
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @Import(name="sourceResourceId")
      private final @Nullable Output<String> sourceResourceId;

    public Output<String> sourceResourceId() {
        return this.sourceResourceId == null ? Codegen.empty() : this.sourceResourceId;
    }

    /**
     * Fully qualified ARM ID of the virtual machine represented by this item.
     * 
     */
    @Import(name="virtualMachineId")
      private final @Nullable Output<String> virtualMachineId;

    public Output<String> virtualMachineId() {
        return this.virtualMachineId == null ? Codegen.empty() : this.virtualMachineId;
    }

    /**
     * Type of workload this item represents.
     * 
     */
    @Import(name="workloadType")
      private final @Nullable Output<Either<String,DataSourceType>> workloadType;

    public Output<Either<String,DataSourceType>> workloadType() {
        return this.workloadType == null ? Codegen.empty() : this.workloadType;
    }

    public AzureIaaSClassicComputeVMProtectedItemArgs(
        @Nullable Output<Either<String,BackupManagementType>> backupManagementType,
        @Nullable Output<String> backupSetName,
        @Nullable Output<String> containerName,
        @Nullable Output<Either<String,CreateMode>> createMode,
        @Nullable Output<String> deferredDeleteTimeInUTC,
        @Nullable Output<String> deferredDeleteTimeRemaining,
        @Nullable Output<AzureIaaSVMProtectedItemExtendedInfoArgs> extendedInfo,
        @Nullable Output<ExtendedPropertiesArgs> extendedProperties,
        @Nullable Output<String> friendlyName,
        @Nullable Output<Either<String,HealthStatus>> healthStatus,
        @Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming,
        @Nullable Output<Boolean> isRehydrate,
        @Nullable Output<Boolean> isScheduledForDeferredDelete,
        @Nullable Output<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths,
        @Nullable Output<String> lastBackupStatus,
        @Nullable Output<String> lastBackupTime,
        @Nullable Output<String> lastRecoveryPoint,
        @Nullable Output<String> policyId,
        @Nullable Output<String> protectedItemDataId,
        Output<String> protectedItemType,
        @Nullable Output<Either<String,ProtectionState>> protectionState,
        @Nullable Output<String> protectionStatus,
        @Nullable Output<String> sourceResourceId,
        @Nullable Output<String> virtualMachineId,
        @Nullable Output<Either<String,DataSourceType>> workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.extendedProperties = extendedProperties;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.kpisHealths = kpisHealths;
        this.lastBackupStatus = lastBackupStatus;
        this.lastBackupTime = lastBackupTime;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.policyId = policyId;
        this.protectedItemDataId = protectedItemDataId;
        this.protectedItemType = Codegen.stringProp("protectedItemType").output().arg(protectedItemType).require();
        this.protectionState = protectionState;
        this.protectionStatus = protectionStatus;
        this.sourceResourceId = sourceResourceId;
        this.virtualMachineId = virtualMachineId;
        this.workloadType = workloadType;
    }

    private AzureIaaSClassicComputeVMProtectedItemArgs() {
        this.backupManagementType = Codegen.empty();
        this.backupSetName = Codegen.empty();
        this.containerName = Codegen.empty();
        this.createMode = Codegen.empty();
        this.deferredDeleteTimeInUTC = Codegen.empty();
        this.deferredDeleteTimeRemaining = Codegen.empty();
        this.extendedInfo = Codegen.empty();
        this.extendedProperties = Codegen.empty();
        this.friendlyName = Codegen.empty();
        this.healthStatus = Codegen.empty();
        this.isDeferredDeleteScheduleUpcoming = Codegen.empty();
        this.isRehydrate = Codegen.empty();
        this.isScheduledForDeferredDelete = Codegen.empty();
        this.kpisHealths = Codegen.empty();
        this.lastBackupStatus = Codegen.empty();
        this.lastBackupTime = Codegen.empty();
        this.lastRecoveryPoint = Codegen.empty();
        this.policyId = Codegen.empty();
        this.protectedItemDataId = Codegen.empty();
        this.protectedItemType = Codegen.empty();
        this.protectionState = Codegen.empty();
        this.protectionStatus = Codegen.empty();
        this.sourceResourceId = Codegen.empty();
        this.virtualMachineId = Codegen.empty();
        this.workloadType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSClassicComputeVMProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;
        private @Nullable Output<String> backupSetName;
        private @Nullable Output<String> containerName;
        private @Nullable Output<Either<String,CreateMode>> createMode;
        private @Nullable Output<String> deferredDeleteTimeInUTC;
        private @Nullable Output<String> deferredDeleteTimeRemaining;
        private @Nullable Output<AzureIaaSVMProtectedItemExtendedInfoArgs> extendedInfo;
        private @Nullable Output<ExtendedPropertiesArgs> extendedProperties;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<Either<String,HealthStatus>> healthStatus;
        private @Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming;
        private @Nullable Output<Boolean> isRehydrate;
        private @Nullable Output<Boolean> isScheduledForDeferredDelete;
        private @Nullable Output<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths;
        private @Nullable Output<String> lastBackupStatus;
        private @Nullable Output<String> lastBackupTime;
        private @Nullable Output<String> lastRecoveryPoint;
        private @Nullable Output<String> policyId;
        private @Nullable Output<String> protectedItemDataId;
        private Output<String> protectedItemType;
        private @Nullable Output<Either<String,ProtectionState>> protectionState;
        private @Nullable Output<String> protectionStatus;
        private @Nullable Output<String> sourceResourceId;
        private @Nullable Output<String> virtualMachineId;
        private @Nullable Output<Either<String,DataSourceType>> workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSClassicComputeVMProtectedItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.extendedProperties = defaults.extendedProperties;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.kpisHealths = defaults.kpisHealths;
    	      this.lastBackupStatus = defaults.lastBackupStatus;
    	      this.lastBackupTime = defaults.lastBackupTime;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.policyId = defaults.policyId;
    	      this.protectedItemDataId = defaults.protectedItemDataId;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.protectionStatus = defaults.protectionStatus;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.virtualMachineId = defaults.virtualMachineId;
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
        public Builder backupSetName(@Nullable Output<String> backupSetName) {
            this.backupSetName = backupSetName;
            return this;
        }
        public Builder backupSetName(@Nullable String backupSetName) {
            this.backupSetName = Codegen.ofNullable(backupSetName);
            return this;
        }
        public Builder containerName(@Nullable Output<String> containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = Codegen.ofNullable(containerName);
            return this;
        }
        public Builder createMode(@Nullable Output<Either<String,CreateMode>> createMode) {
            this.createMode = createMode;
            return this;
        }
        public Builder createMode(@Nullable Either<String,CreateMode> createMode) {
            this.createMode = Codegen.ofNullable(createMode);
            return this;
        }
        public Builder deferredDeleteTimeInUTC(@Nullable Output<String> deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
            return this;
        }
        public Builder deferredDeleteTimeInUTC(@Nullable String deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = Codegen.ofNullable(deferredDeleteTimeInUTC);
            return this;
        }
        public Builder deferredDeleteTimeRemaining(@Nullable Output<String> deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
            return this;
        }
        public Builder deferredDeleteTimeRemaining(@Nullable String deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = Codegen.ofNullable(deferredDeleteTimeRemaining);
            return this;
        }
        public Builder extendedInfo(@Nullable Output<AzureIaaSVMProtectedItemExtendedInfoArgs> extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }
        public Builder extendedInfo(@Nullable AzureIaaSVMProtectedItemExtendedInfoArgs extendedInfo) {
            this.extendedInfo = Codegen.ofNullable(extendedInfo);
            return this;
        }
        public Builder extendedProperties(@Nullable Output<ExtendedPropertiesArgs> extendedProperties) {
            this.extendedProperties = extendedProperties;
            return this;
        }
        public Builder extendedProperties(@Nullable ExtendedPropertiesArgs extendedProperties) {
            this.extendedProperties = Codegen.ofNullable(extendedProperties);
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
        public Builder healthStatus(@Nullable Output<Either<String,HealthStatus>> healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public Builder healthStatus(@Nullable Either<String,HealthStatus> healthStatus) {
            this.healthStatus = Codegen.ofNullable(healthStatus);
            return this;
        }
        public Builder isDeferredDeleteScheduleUpcoming(@Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
            return this;
        }
        public Builder isDeferredDeleteScheduleUpcoming(@Nullable Boolean isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = Codegen.ofNullable(isDeferredDeleteScheduleUpcoming);
            return this;
        }
        public Builder isRehydrate(@Nullable Output<Boolean> isRehydrate) {
            this.isRehydrate = isRehydrate;
            return this;
        }
        public Builder isRehydrate(@Nullable Boolean isRehydrate) {
            this.isRehydrate = Codegen.ofNullable(isRehydrate);
            return this;
        }
        public Builder isScheduledForDeferredDelete(@Nullable Output<Boolean> isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
            return this;
        }
        public Builder isScheduledForDeferredDelete(@Nullable Boolean isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = Codegen.ofNullable(isScheduledForDeferredDelete);
            return this;
        }
        public Builder kpisHealths(@Nullable Output<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths) {
            this.kpisHealths = kpisHealths;
            return this;
        }
        public Builder kpisHealths(@Nullable Map<String,KPIResourceHealthDetailsArgs> kpisHealths) {
            this.kpisHealths = Codegen.ofNullable(kpisHealths);
            return this;
        }
        public Builder lastBackupStatus(@Nullable Output<String> lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }
        public Builder lastBackupStatus(@Nullable String lastBackupStatus) {
            this.lastBackupStatus = Codegen.ofNullable(lastBackupStatus);
            return this;
        }
        public Builder lastBackupTime(@Nullable Output<String> lastBackupTime) {
            this.lastBackupTime = lastBackupTime;
            return this;
        }
        public Builder lastBackupTime(@Nullable String lastBackupTime) {
            this.lastBackupTime = Codegen.ofNullable(lastBackupTime);
            return this;
        }
        public Builder lastRecoveryPoint(@Nullable Output<String> lastRecoveryPoint) {
            this.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }
        public Builder lastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            this.lastRecoveryPoint = Codegen.ofNullable(lastRecoveryPoint);
            return this;
        }
        public Builder policyId(@Nullable Output<String> policyId) {
            this.policyId = policyId;
            return this;
        }
        public Builder policyId(@Nullable String policyId) {
            this.policyId = Codegen.ofNullable(policyId);
            return this;
        }
        public Builder protectedItemDataId(@Nullable Output<String> protectedItemDataId) {
            this.protectedItemDataId = protectedItemDataId;
            return this;
        }
        public Builder protectedItemDataId(@Nullable String protectedItemDataId) {
            this.protectedItemDataId = Codegen.ofNullable(protectedItemDataId);
            return this;
        }
        public Builder protectedItemType(Output<String> protectedItemType) {
            this.protectedItemType = Objects.requireNonNull(protectedItemType);
            return this;
        }
        public Builder protectedItemType(String protectedItemType) {
            this.protectedItemType = Output.of(Objects.requireNonNull(protectedItemType));
            return this;
        }
        public Builder protectionState(@Nullable Output<Either<String,ProtectionState>> protectionState) {
            this.protectionState = protectionState;
            return this;
        }
        public Builder protectionState(@Nullable Either<String,ProtectionState> protectionState) {
            this.protectionState = Codegen.ofNullable(protectionState);
            return this;
        }
        public Builder protectionStatus(@Nullable Output<String> protectionStatus) {
            this.protectionStatus = protectionStatus;
            return this;
        }
        public Builder protectionStatus(@Nullable String protectionStatus) {
            this.protectionStatus = Codegen.ofNullable(protectionStatus);
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
        public Builder virtualMachineId(@Nullable Output<String> virtualMachineId) {
            this.virtualMachineId = virtualMachineId;
            return this;
        }
        public Builder virtualMachineId(@Nullable String virtualMachineId) {
            this.virtualMachineId = Codegen.ofNullable(virtualMachineId);
            return this;
        }
        public Builder workloadType(@Nullable Output<Either<String,DataSourceType>> workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public Builder workloadType(@Nullable Either<String,DataSourceType> workloadType) {
            this.workloadType = Codegen.ofNullable(workloadType);
            return this;
        }        public AzureIaaSClassicComputeVMProtectedItemArgs build() {
            return new AzureIaaSClassicComputeVMProtectedItemArgs(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, extendedProperties, friendlyName, healthStatus, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, kpisHealths, lastBackupStatus, lastBackupTime, lastRecoveryPoint, policyId, protectedItemDataId, protectedItemType, protectionState, protectionStatus, sourceResourceId, virtualMachineId, workloadType);
        }
    }
}
