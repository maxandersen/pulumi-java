// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.AzureVmWorkloadProtectedItemExtendedInfoResponse;
import io.pulumi.azurenative.recoveryservices.outputs.ErrorDetailResponse;
import io.pulumi.azurenative.recoveryservices.outputs.KPIResourceHealthDetailsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureVmWorkloadSQLDatabaseProtectedItemResponse {
    /**
     * Type of backup management for the backed up item.
     * 
     */
    private final @Nullable String backupManagementType;
    /**
     * Name of the backup set the backup item belongs to
     * 
     */
    private final @Nullable String backupSetName;
    /**
     * Unique name of container
     * 
     */
    private final @Nullable String containerName;
    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    private final @Nullable String createMode;
    /**
     * Time for deferred deletion in UTC
     * 
     */
    private final @Nullable String deferredDeleteTimeInUTC;
    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    private final @Nullable String deferredDeleteTimeRemaining;
    /**
     * Additional information for this backup item.
     * 
     */
    private final @Nullable AzureVmWorkloadProtectedItemExtendedInfoResponse extendedInfo;
    /**
     * Friendly name of the DB represented by this backup item.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    private final @Nullable Boolean isDeferredDeleteScheduleUpcoming;
    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    private final @Nullable Boolean isRehydrate;
    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    private final @Nullable Boolean isScheduledForDeferredDelete;
    /**
     * Health details of different KPIs
     * 
     */
    private final @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths;
    /**
     * Error details in last backup
     * 
     */
    private final @Nullable ErrorDetailResponse lastBackupErrorDetail;
    /**
     * Last backup operation status. Possible values: Healthy, Unhealthy.
     * 
     */
    private final @Nullable String lastBackupStatus;
    /**
     * Timestamp of the last backup operation on this backup item.
     * 
     */
    private final @Nullable String lastBackupTime;
    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    private final @Nullable String lastRecoveryPoint;
    /**
     * Parent name of the DB such as Instance or Availability Group.
     * 
     */
    private final @Nullable String parentName;
    /**
     * Parent type of protected item, example: for a DB, standalone server or distributed
     * 
     */
    private final @Nullable String parentType;
    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    private final @Nullable String policyId;
    /**
     * Data ID of the protected item.
     * 
     */
    private final @Nullable String protectedItemDataSourceId;
    /**
     * Health status of the backup item, evaluated based on last heartbeat received
     * 
     */
    private final @Nullable String protectedItemHealthStatus;
    /**
     * backup item type.
     * Expected value is 'AzureVmWorkloadSQLDatabase'.
     * 
     */
    private final String protectedItemType;
    /**
     * Backup state of this backup item.
     * 
     */
    private final @Nullable String protectionState;
    /**
     * Backup status of this backup item.
     * 
     */
    private final @Nullable String protectionStatus;
    /**
     * Host/Cluster Name for instance or AG
     * 
     */
    private final @Nullable String serverName;
    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    private final @Nullable String sourceResourceId;
    /**
     * Type of workload this item represents.
     * 
     */
    private final @Nullable String workloadType;

    @CustomType.Constructor
    private AzureVmWorkloadSQLDatabaseProtectedItemResponse(
        @CustomType.Parameter("backupManagementType") @Nullable String backupManagementType,
        @CustomType.Parameter("backupSetName") @Nullable String backupSetName,
        @CustomType.Parameter("containerName") @Nullable String containerName,
        @CustomType.Parameter("createMode") @Nullable String createMode,
        @CustomType.Parameter("deferredDeleteTimeInUTC") @Nullable String deferredDeleteTimeInUTC,
        @CustomType.Parameter("deferredDeleteTimeRemaining") @Nullable String deferredDeleteTimeRemaining,
        @CustomType.Parameter("extendedInfo") @Nullable AzureVmWorkloadProtectedItemExtendedInfoResponse extendedInfo,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("isDeferredDeleteScheduleUpcoming") @Nullable Boolean isDeferredDeleteScheduleUpcoming,
        @CustomType.Parameter("isRehydrate") @Nullable Boolean isRehydrate,
        @CustomType.Parameter("isScheduledForDeferredDelete") @Nullable Boolean isScheduledForDeferredDelete,
        @CustomType.Parameter("kpisHealths") @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths,
        @CustomType.Parameter("lastBackupErrorDetail") @Nullable ErrorDetailResponse lastBackupErrorDetail,
        @CustomType.Parameter("lastBackupStatus") @Nullable String lastBackupStatus,
        @CustomType.Parameter("lastBackupTime") @Nullable String lastBackupTime,
        @CustomType.Parameter("lastRecoveryPoint") @Nullable String lastRecoveryPoint,
        @CustomType.Parameter("parentName") @Nullable String parentName,
        @CustomType.Parameter("parentType") @Nullable String parentType,
        @CustomType.Parameter("policyId") @Nullable String policyId,
        @CustomType.Parameter("protectedItemDataSourceId") @Nullable String protectedItemDataSourceId,
        @CustomType.Parameter("protectedItemHealthStatus") @Nullable String protectedItemHealthStatus,
        @CustomType.Parameter("protectedItemType") String protectedItemType,
        @CustomType.Parameter("protectionState") @Nullable String protectionState,
        @CustomType.Parameter("protectionStatus") @Nullable String protectionStatus,
        @CustomType.Parameter("serverName") @Nullable String serverName,
        @CustomType.Parameter("sourceResourceId") @Nullable String sourceResourceId,
        @CustomType.Parameter("workloadType") @Nullable String workloadType) {
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
        this.lastBackupErrorDetail = lastBackupErrorDetail;
        this.lastBackupStatus = lastBackupStatus;
        this.lastBackupTime = lastBackupTime;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.parentName = parentName;
        this.parentType = parentType;
        this.policyId = policyId;
        this.protectedItemDataSourceId = protectedItemDataSourceId;
        this.protectedItemHealthStatus = protectedItemHealthStatus;
        this.protectedItemType = protectedItemType;
        this.protectionState = protectionState;
        this.protectionStatus = protectionStatus;
        this.serverName = serverName;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    /**
     * Type of backup management for the backed up item.
     * 
    */
    public Optional<String> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    /**
     * Name of the backup set the backup item belongs to
     * 
    */
    public Optional<String> backupSetName() {
        return Optional.ofNullable(this.backupSetName);
    }
    /**
     * Unique name of container
     * 
    */
    public Optional<String> containerName() {
        return Optional.ofNullable(this.containerName);
    }
    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
    */
    public Optional<String> createMode() {
        return Optional.ofNullable(this.createMode);
    }
    /**
     * Time for deferred deletion in UTC
     * 
    */
    public Optional<String> deferredDeleteTimeInUTC() {
        return Optional.ofNullable(this.deferredDeleteTimeInUTC);
    }
    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
    */
    public Optional<String> deferredDeleteTimeRemaining() {
        return Optional.ofNullable(this.deferredDeleteTimeRemaining);
    }
    /**
     * Additional information for this backup item.
     * 
    */
    public Optional<AzureVmWorkloadProtectedItemExtendedInfoResponse> extendedInfo() {
        return Optional.ofNullable(this.extendedInfo);
    }
    /**
     * Friendly name of the DB represented by this backup item.
     * 
    */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
    */
    public Optional<Boolean> isDeferredDeleteScheduleUpcoming() {
        return Optional.ofNullable(this.isDeferredDeleteScheduleUpcoming);
    }
    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
    */
    public Optional<Boolean> isRehydrate() {
        return Optional.ofNullable(this.isRehydrate);
    }
    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
    */
    public Optional<Boolean> isScheduledForDeferredDelete() {
        return Optional.ofNullable(this.isScheduledForDeferredDelete);
    }
    /**
     * Health details of different KPIs
     * 
    */
    public Map<String,KPIResourceHealthDetailsResponse> kpisHealths() {
        return this.kpisHealths == null ? Map.of() : this.kpisHealths;
    }
    /**
     * Error details in last backup
     * 
    */
    public Optional<ErrorDetailResponse> lastBackupErrorDetail() {
        return Optional.ofNullable(this.lastBackupErrorDetail);
    }
    /**
     * Last backup operation status. Possible values: Healthy, Unhealthy.
     * 
    */
    public Optional<String> lastBackupStatus() {
        return Optional.ofNullable(this.lastBackupStatus);
    }
    /**
     * Timestamp of the last backup operation on this backup item.
     * 
    */
    public Optional<String> lastBackupTime() {
        return Optional.ofNullable(this.lastBackupTime);
    }
    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
    */
    public Optional<String> lastRecoveryPoint() {
        return Optional.ofNullable(this.lastRecoveryPoint);
    }
    /**
     * Parent name of the DB such as Instance or Availability Group.
     * 
    */
    public Optional<String> parentName() {
        return Optional.ofNullable(this.parentName);
    }
    /**
     * Parent type of protected item, example: for a DB, standalone server or distributed
     * 
    */
    public Optional<String> parentType() {
        return Optional.ofNullable(this.parentType);
    }
    /**
     * ID of the backup policy with which this item is backed up.
     * 
    */
    public Optional<String> policyId() {
        return Optional.ofNullable(this.policyId);
    }
    /**
     * Data ID of the protected item.
     * 
    */
    public Optional<String> protectedItemDataSourceId() {
        return Optional.ofNullable(this.protectedItemDataSourceId);
    }
    /**
     * Health status of the backup item, evaluated based on last heartbeat received
     * 
    */
    public Optional<String> protectedItemHealthStatus() {
        return Optional.ofNullable(this.protectedItemHealthStatus);
    }
    /**
     * backup item type.
     * Expected value is 'AzureVmWorkloadSQLDatabase'.
     * 
    */
    public String protectedItemType() {
        return this.protectedItemType;
    }
    /**
     * Backup state of this backup item.
     * 
    */
    public Optional<String> protectionState() {
        return Optional.ofNullable(this.protectionState);
    }
    /**
     * Backup status of this backup item.
     * 
    */
    public Optional<String> protectionStatus() {
        return Optional.ofNullable(this.protectionStatus);
    }
    /**
     * Host/Cluster Name for instance or AG
     * 
    */
    public Optional<String> serverName() {
        return Optional.ofNullable(this.serverName);
    }
    /**
     * ARM ID of the resource to be backed up.
     * 
    */
    public Optional<String> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }
    /**
     * Type of workload this item represents.
     * 
    */
    public Optional<String> workloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureVmWorkloadSQLDatabaseProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String backupSetName;
        private @Nullable String containerName;
        private @Nullable String createMode;
        private @Nullable String deferredDeleteTimeInUTC;
        private @Nullable String deferredDeleteTimeRemaining;
        private @Nullable AzureVmWorkloadProtectedItemExtendedInfoResponse extendedInfo;
        private @Nullable String friendlyName;
        private @Nullable Boolean isDeferredDeleteScheduleUpcoming;
        private @Nullable Boolean isRehydrate;
        private @Nullable Boolean isScheduledForDeferredDelete;
        private @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths;
        private @Nullable ErrorDetailResponse lastBackupErrorDetail;
        private @Nullable String lastBackupStatus;
        private @Nullable String lastBackupTime;
        private @Nullable String lastRecoveryPoint;
        private @Nullable String parentName;
        private @Nullable String parentType;
        private @Nullable String policyId;
        private @Nullable String protectedItemDataSourceId;
        private @Nullable String protectedItemHealthStatus;
        private String protectedItemType;
        private @Nullable String protectionState;
        private @Nullable String protectionStatus;
        private @Nullable String serverName;
        private @Nullable String sourceResourceId;
        private @Nullable String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureVmWorkloadSQLDatabaseProtectedItemResponse defaults) {
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
    	      this.lastBackupErrorDetail = defaults.lastBackupErrorDetail;
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

        public Builder backupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }
        public Builder backupSetName(@Nullable String backupSetName) {
            this.backupSetName = backupSetName;
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder createMode(@Nullable String createMode) {
            this.createMode = createMode;
            return this;
        }
        public Builder deferredDeleteTimeInUTC(@Nullable String deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
            return this;
        }
        public Builder deferredDeleteTimeRemaining(@Nullable String deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
            return this;
        }
        public Builder extendedInfo(@Nullable AzureVmWorkloadProtectedItemExtendedInfoResponse extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder isDeferredDeleteScheduleUpcoming(@Nullable Boolean isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
            return this;
        }
        public Builder isRehydrate(@Nullable Boolean isRehydrate) {
            this.isRehydrate = isRehydrate;
            return this;
        }
        public Builder isScheduledForDeferredDelete(@Nullable Boolean isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
            return this;
        }
        public Builder kpisHealths(@Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths) {
            this.kpisHealths = kpisHealths;
            return this;
        }
        public Builder lastBackupErrorDetail(@Nullable ErrorDetailResponse lastBackupErrorDetail) {
            this.lastBackupErrorDetail = lastBackupErrorDetail;
            return this;
        }
        public Builder lastBackupStatus(@Nullable String lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }
        public Builder lastBackupTime(@Nullable String lastBackupTime) {
            this.lastBackupTime = lastBackupTime;
            return this;
        }
        public Builder lastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            this.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }
        public Builder parentName(@Nullable String parentName) {
            this.parentName = parentName;
            return this;
        }
        public Builder parentType(@Nullable String parentType) {
            this.parentType = parentType;
            return this;
        }
        public Builder policyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }
        public Builder protectedItemDataSourceId(@Nullable String protectedItemDataSourceId) {
            this.protectedItemDataSourceId = protectedItemDataSourceId;
            return this;
        }
        public Builder protectedItemHealthStatus(@Nullable String protectedItemHealthStatus) {
            this.protectedItemHealthStatus = protectedItemHealthStatus;
            return this;
        }
        public Builder protectedItemType(String protectedItemType) {
            this.protectedItemType = Objects.requireNonNull(protectedItemType);
            return this;
        }
        public Builder protectionState(@Nullable String protectionState) {
            this.protectionState = protectionState;
            return this;
        }
        public Builder protectionStatus(@Nullable String protectionStatus) {
            this.protectionStatus = protectionStatus;
            return this;
        }
        public Builder serverName(@Nullable String serverName) {
            this.serverName = serverName;
            return this;
        }
        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }
        public Builder workloadType(@Nullable String workloadType) {
            this.workloadType = workloadType;
            return this;
        }        public AzureVmWorkloadSQLDatabaseProtectedItemResponse build() {
            return new AzureVmWorkloadSQLDatabaseProtectedItemResponse(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, friendlyName, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, kpisHealths, lastBackupErrorDetail, lastBackupStatus, lastBackupTime, lastRecoveryPoint, parentName, parentType, policyId, protectedItemDataSourceId, protectedItemHealthStatus, protectedItemType, protectionState, protectionStatus, serverName, sourceResourceId, workloadType);
        }
    }
}
