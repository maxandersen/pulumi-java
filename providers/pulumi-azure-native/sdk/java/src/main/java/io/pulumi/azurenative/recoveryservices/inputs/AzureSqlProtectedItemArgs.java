// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.azurenative.recoveryservices.enums.CreateMode;
import io.pulumi.azurenative.recoveryservices.enums.DataSourceType;
import io.pulumi.azurenative.recoveryservices.enums.ProtectedItemState;
import io.pulumi.azurenative.recoveryservices.inputs.AzureSqlProtectedItemExtendedInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure SQL workload-specific backup item.
 * 
 */
public final class AzureSqlProtectedItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureSqlProtectedItemArgs Empty = new AzureSqlProtectedItemArgs();

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
      private final @Nullable Output<AzureSqlProtectedItemExtendedInfoArgs> extendedInfo;

    public Output<AzureSqlProtectedItemExtendedInfoArgs> extendedInfo() {
        return this.extendedInfo == null ? Codegen.empty() : this.extendedInfo;
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
     * Internal ID of a backup item. Used by Azure SQL Backup engine to contact Recovery Services.
     * 
     */
    @Import(name="protectedItemDataId")
      private final @Nullable Output<String> protectedItemDataId;

    public Output<String> protectedItemDataId() {
        return this.protectedItemDataId == null ? Codegen.empty() : this.protectedItemDataId;
    }

    /**
     * backup item type.
     * Expected value is 'Microsoft.Sql/servers/databases'.
     * 
     */
    @Import(name="protectedItemType", required=true)
      private final Output<String> protectedItemType;

    public Output<String> protectedItemType() {
        return this.protectedItemType;
    }

    /**
     * Backup state of the backed up item.
     * 
     */
    @Import(name="protectionState")
      private final @Nullable Output<Either<String,ProtectedItemState>> protectionState;

    public Output<Either<String,ProtectedItemState>> protectionState() {
        return this.protectionState == null ? Codegen.empty() : this.protectionState;
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

    public AzureSqlProtectedItemArgs(
        @Nullable Output<Either<String,BackupManagementType>> backupManagementType,
        @Nullable Output<String> backupSetName,
        @Nullable Output<String> containerName,
        @Nullable Output<Either<String,CreateMode>> createMode,
        @Nullable Output<String> deferredDeleteTimeInUTC,
        @Nullable Output<String> deferredDeleteTimeRemaining,
        @Nullable Output<AzureSqlProtectedItemExtendedInfoArgs> extendedInfo,
        @Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming,
        @Nullable Output<Boolean> isRehydrate,
        @Nullable Output<Boolean> isScheduledForDeferredDelete,
        @Nullable Output<String> lastRecoveryPoint,
        @Nullable Output<String> policyId,
        @Nullable Output<String> protectedItemDataId,
        Output<String> protectedItemType,
        @Nullable Output<Either<String,ProtectedItemState>> protectionState,
        @Nullable Output<String> sourceResourceId,
        @Nullable Output<Either<String,DataSourceType>> workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.policyId = policyId;
        this.protectedItemDataId = protectedItemDataId;
        this.protectedItemType = Objects.requireNonNull(protectedItemType, "expected parameter 'protectedItemType' to be non-null");
        this.protectionState = protectionState;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    private AzureSqlProtectedItemArgs() {
        this.backupManagementType = Codegen.empty();
        this.backupSetName = Codegen.empty();
        this.containerName = Codegen.empty();
        this.createMode = Codegen.empty();
        this.deferredDeleteTimeInUTC = Codegen.empty();
        this.deferredDeleteTimeRemaining = Codegen.empty();
        this.extendedInfo = Codegen.empty();
        this.isDeferredDeleteScheduleUpcoming = Codegen.empty();
        this.isRehydrate = Codegen.empty();
        this.isScheduledForDeferredDelete = Codegen.empty();
        this.lastRecoveryPoint = Codegen.empty();
        this.policyId = Codegen.empty();
        this.protectedItemDataId = Codegen.empty();
        this.protectedItemType = Codegen.empty();
        this.protectionState = Codegen.empty();
        this.sourceResourceId = Codegen.empty();
        this.workloadType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;
        private @Nullable Output<String> backupSetName;
        private @Nullable Output<String> containerName;
        private @Nullable Output<Either<String,CreateMode>> createMode;
        private @Nullable Output<String> deferredDeleteTimeInUTC;
        private @Nullable Output<String> deferredDeleteTimeRemaining;
        private @Nullable Output<AzureSqlProtectedItemExtendedInfoArgs> extendedInfo;
        private @Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming;
        private @Nullable Output<Boolean> isRehydrate;
        private @Nullable Output<Boolean> isScheduledForDeferredDelete;
        private @Nullable Output<String> lastRecoveryPoint;
        private @Nullable Output<String> policyId;
        private @Nullable Output<String> protectedItemDataId;
        private Output<String> protectedItemType;
        private @Nullable Output<Either<String,ProtectedItemState>> protectionState;
        private @Nullable Output<String> sourceResourceId;
        private @Nullable Output<Either<String,DataSourceType>> workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlProtectedItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.policyId = defaults.policyId;
    	      this.protectedItemDataId = defaults.protectedItemDataId;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
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
        public Builder extendedInfo(@Nullable Output<AzureSqlProtectedItemExtendedInfoArgs> extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }
        public Builder extendedInfo(@Nullable AzureSqlProtectedItemExtendedInfoArgs extendedInfo) {
            this.extendedInfo = Codegen.ofNullable(extendedInfo);
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
        public Builder protectionState(@Nullable Output<Either<String,ProtectedItemState>> protectionState) {
            this.protectionState = protectionState;
            return this;
        }
        public Builder protectionState(@Nullable Either<String,ProtectedItemState> protectionState) {
            this.protectionState = Codegen.ofNullable(protectionState);
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
        }        public AzureSqlProtectedItemArgs build() {
            return new AzureSqlProtectedItemArgs(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, lastRecoveryPoint, policyId, protectedItemDataId, protectedItemType, protectionState, sourceResourceId, workloadType);
        }
    }
}
