// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import com.pulumi.azurenative.recoveryservices.enums.CreateMode;
import com.pulumi.azurenative.recoveryservices.enums.DataSourceType;
import com.pulumi.azurenative.recoveryservices.enums.LastBackupStatus;
import com.pulumi.azurenative.recoveryservices.enums.ProtectedItemHealthStatus;
import com.pulumi.azurenative.recoveryservices.enums.ProtectionState;
import com.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadProtectedItemExtendedInfoArgs;
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
 * Azure VM workload-specific protected item.
 * 
 */
public final class AzureVmWorkloadProtectedItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureVmWorkloadProtectedItemArgs Empty = new AzureVmWorkloadProtectedItemArgs();

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
      private final @Nullable Output<AzureVmWorkloadProtectedItemExtendedInfoArgs> extendedInfo;

    public Output<AzureVmWorkloadProtectedItemExtendedInfoArgs> extendedInfo() {
        return this.extendedInfo == null ? Codegen.empty() : this.extendedInfo;
    }

    /**
     * Friendly name of the DB represented by this backup item.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> friendlyName() {
        return this.friendlyName == null ? Codegen.empty() : this.friendlyName;
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
     * Last backup operation status. Possible values: Healthy, Unhealthy.
     * 
     */
    @Import(name="lastBackupStatus")
      private final @Nullable Output<Either<String,LastBackupStatus>> lastBackupStatus;

    public Output<Either<String,LastBackupStatus>> lastBackupStatus() {
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
     * Parent name of the DB such as Instance or Availability Group.
     * 
     */
    @Import(name="parentName")
      private final @Nullable Output<String> parentName;

    public Output<String> parentName() {
        return this.parentName == null ? Codegen.empty() : this.parentName;
    }

    /**
     * Parent type of protected item, example: for a DB, standalone server or distributed
     * 
     */
    @Import(name="parentType")
      private final @Nullable Output<String> parentType;

    public Output<String> parentType() {
        return this.parentType == null ? Codegen.empty() : this.parentType;
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
    @Import(name="protectedItemDataSourceId")
      private final @Nullable Output<String> protectedItemDataSourceId;

    public Output<String> protectedItemDataSourceId() {
        return this.protectedItemDataSourceId == null ? Codegen.empty() : this.protectedItemDataSourceId;
    }

    /**
     * Health status of the backup item, evaluated based on last heartbeat received
     * 
     */
    @Import(name="protectedItemHealthStatus")
      private final @Nullable Output<Either<String,ProtectedItemHealthStatus>> protectedItemHealthStatus;

    public Output<Either<String,ProtectedItemHealthStatus>> protectedItemHealthStatus() {
        return this.protectedItemHealthStatus == null ? Codegen.empty() : this.protectedItemHealthStatus;
    }

    /**
     * backup item type.
     * Expected value is &#39;AzureVmWorkloadProtectedItem&#39;.
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
     * Host/Cluster Name for instance or AG
     * 
     */
    @Import(name="serverName")
      private final @Nullable Output<String> serverName;

    public Output<String> serverName() {
        return this.serverName == null ? Codegen.empty() : this.serverName;
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
     * Type of workload this item represents.
     * 
     */
    @Import(name="workloadType")
      private final @Nullable Output<Either<String,DataSourceType>> workloadType;

    public Output<Either<String,DataSourceType>> workloadType() {
        return this.workloadType == null ? Codegen.empty() : this.workloadType;
    }

    public AzureVmWorkloadProtectedItemArgs(
        @Nullable Output<Either<String,BackupManagementType>> backupManagementType,
        @Nullable Output<String> backupSetName,
        @Nullable Output<String> containerName,
        @Nullable Output<Either<String,CreateMode>> createMode,
        @Nullable Output<String> deferredDeleteTimeInUTC,
        @Nullable Output<String> deferredDeleteTimeRemaining,
        @Nullable Output<AzureVmWorkloadProtectedItemExtendedInfoArgs> extendedInfo,
        @Nullable Output<String> friendlyName,
        @Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming,
        @Nullable Output<Boolean> isRehydrate,
        @Nullable Output<Boolean> isScheduledForDeferredDelete,
        @Nullable Output<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths,
        @Nullable Output<Either<String,LastBackupStatus>> lastBackupStatus,
        @Nullable Output<String> lastBackupTime,
        @Nullable Output<String> lastRecoveryPoint,
        @Nullable Output<String> parentName,
        @Nullable Output<String> parentType,
        @Nullable Output<String> policyId,
        @Nullable Output<String> protectedItemDataSourceId,
        @Nullable Output<Either<String,ProtectedItemHealthStatus>> protectedItemHealthStatus,
        Output<String> protectedItemType,
        @Nullable Output<Either<String,ProtectionState>> protectionState,
        @Nullable Output<String> protectionStatus,
        @Nullable Output<String> serverName,
        @Nullable Output<String> sourceResourceId,
        @Nullable Output<Either<String,DataSourceType>> workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.kpisHealths = kpisHealths;
        this.lastBackupStatus = lastBackupStatus;
        this.lastBackupTime = lastBackupTime;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.parentName = parentName;
        this.parentType = parentType;
        this.policyId = policyId;
        this.protectedItemDataSourceId = protectedItemDataSourceId;
        this.protectedItemHealthStatus = protectedItemHealthStatus;
        this.protectedItemType = Codegen.stringProp("protectedItemType").output().arg(protectedItemType).require();
        this.protectionState = protectionState;
        this.protectionStatus = protectionStatus;
        this.serverName = serverName;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    private AzureVmWorkloadProtectedItemArgs() {
        this.backupManagementType = Codegen.empty();
        this.backupSetName = Codegen.empty();
        this.containerName = Codegen.empty();
        this.createMode = Codegen.empty();
        this.deferredDeleteTimeInUTC = Codegen.empty();
        this.deferredDeleteTimeRemaining = Codegen.empty();
        this.extendedInfo = Codegen.empty();
        this.friendlyName = Codegen.empty();
        this.isDeferredDeleteScheduleUpcoming = Codegen.empty();
        this.isRehydrate = Codegen.empty();
        this.isScheduledForDeferredDelete = Codegen.empty();
        this.kpisHealths = Codegen.empty();
        this.lastBackupStatus = Codegen.empty();
        this.lastBackupTime = Codegen.empty();
        this.lastRecoveryPoint = Codegen.empty();
        this.parentName = Codegen.empty();
        this.parentType = Codegen.empty();
        this.policyId = Codegen.empty();
        this.protectedItemDataSourceId = Codegen.empty();
        this.protectedItemHealthStatus = Codegen.empty();
        this.protectedItemType = Codegen.empty();
        this.protectionState = Codegen.empty();
        this.protectionStatus = Codegen.empty();
        this.serverName = Codegen.empty();
        this.sourceResourceId = Codegen.empty();
        this.workloadType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureVmWorkloadProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;
        private @Nullable Output<String> backupSetName;
        private @Nullable Output<String> containerName;
        private @Nullable Output<Either<String,CreateMode>> createMode;
        private @Nullable Output<String> deferredDeleteTimeInUTC;
        private @Nullable Output<String> deferredDeleteTimeRemaining;
        private @Nullable Output<AzureVmWorkloadProtectedItemExtendedInfoArgs> extendedInfo;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming;
        private @Nullable Output<Boolean> isRehydrate;
        private @Nullable Output<Boolean> isScheduledForDeferredDelete;
        private @Nullable Output<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths;
        private @Nullable Output<Either<String,LastBackupStatus>> lastBackupStatus;
        private @Nullable Output<String> lastBackupTime;
        private @Nullable Output<String> lastRecoveryPoint;
        private @Nullable Output<String> parentName;
        private @Nullable Output<String> parentType;
        private @Nullable Output<String> policyId;
        private @Nullable Output<String> protectedItemDataSourceId;
        private @Nullable Output<Either<String,ProtectedItemHealthStatus>> protectedItemHealthStatus;
        private Output<String> protectedItemType;
        private @Nullable Output<Either<String,ProtectionState>> protectionState;
        private @Nullable Output<String> protectionStatus;
        private @Nullable Output<String> serverName;
        private @Nullable Output<String> sourceResourceId;
        private @Nullable Output<Either<String,DataSourceType>> workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureVmWorkloadProtectedItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.kpisHealths = defaults.kpisHealths;
    	      this.lastBackupStatus = defaults.lastBackupStatus;
    	      this.lastBackupTime = defaults.lastBackupTime;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.parentName = defaults.parentName;
    	      this.parentType = defaults.parentType;
    	      this.policyId = defaults.policyId;
    	      this.protectedItemDataSourceId = defaults.protectedItemDataSourceId;
    	      this.protectedItemHealthStatus = defaults.protectedItemHealthStatus;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.protectionStatus = defaults.protectionStatus;
    	      this.serverName = defaults.serverName;
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
        public Builder extendedInfo(@Nullable Output<AzureVmWorkloadProtectedItemExtendedInfoArgs> extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }
        public Builder extendedInfo(@Nullable AzureVmWorkloadProtectedItemExtendedInfoArgs extendedInfo) {
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
        public Builder lastBackupStatus(@Nullable Output<Either<String,LastBackupStatus>> lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }
        public Builder lastBackupStatus(@Nullable Either<String,LastBackupStatus> lastBackupStatus) {
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
        public Builder parentName(@Nullable Output<String> parentName) {
            this.parentName = parentName;
            return this;
        }
        public Builder parentName(@Nullable String parentName) {
            this.parentName = Codegen.ofNullable(parentName);
            return this;
        }
        public Builder parentType(@Nullable Output<String> parentType) {
            this.parentType = parentType;
            return this;
        }
        public Builder parentType(@Nullable String parentType) {
            this.parentType = Codegen.ofNullable(parentType);
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
        public Builder protectedItemDataSourceId(@Nullable Output<String> protectedItemDataSourceId) {
            this.protectedItemDataSourceId = protectedItemDataSourceId;
            return this;
        }
        public Builder protectedItemDataSourceId(@Nullable String protectedItemDataSourceId) {
            this.protectedItemDataSourceId = Codegen.ofNullable(protectedItemDataSourceId);
            return this;
        }
        public Builder protectedItemHealthStatus(@Nullable Output<Either<String,ProtectedItemHealthStatus>> protectedItemHealthStatus) {
            this.protectedItemHealthStatus = protectedItemHealthStatus;
            return this;
        }
        public Builder protectedItemHealthStatus(@Nullable Either<String,ProtectedItemHealthStatus> protectedItemHealthStatus) {
            this.protectedItemHealthStatus = Codegen.ofNullable(protectedItemHealthStatus);
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
        public Builder serverName(@Nullable Output<String> serverName) {
            this.serverName = serverName;
            return this;
        }
        public Builder serverName(@Nullable String serverName) {
            this.serverName = Codegen.ofNullable(serverName);
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
        public Builder workloadType(@Nullable Output<Either<String,DataSourceType>> workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public Builder workloadType(@Nullable Either<String,DataSourceType> workloadType) {
            this.workloadType = Codegen.ofNullable(workloadType);
            return this;
        }        public AzureVmWorkloadProtectedItemArgs build() {
            return new AzureVmWorkloadProtectedItemArgs(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, friendlyName, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, kpisHealths, lastBackupStatus, lastBackupTime, lastRecoveryPoint, parentName, parentType, policyId, protectedItemDataSourceId, protectedItemHealthStatus, protectedItemType, protectionState, protectionStatus, serverName, sourceResourceId, workloadType);
        }
    }
}
