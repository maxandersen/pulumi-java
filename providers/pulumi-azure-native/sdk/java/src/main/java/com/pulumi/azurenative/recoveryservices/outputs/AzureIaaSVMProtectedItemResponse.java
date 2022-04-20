// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.AzureIaaSVMHealthDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.AzureIaaSVMProtectedItemExtendedInfoResponse;
import com.pulumi.azurenative.recoveryservices.outputs.ExtendedPropertiesResponse;
import com.pulumi.azurenative.recoveryservices.outputs.KPIResourceHealthDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureIaaSVMProtectedItemResponse {
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
    private final @Nullable AzureIaaSVMProtectedItemExtendedInfoResponse extendedInfo;
    /**
     * Extended Properties for Azure IaasVM Backup.
     * 
     */
    private final @Nullable ExtendedPropertiesResponse extendedProperties;
    /**
     * Friendly name of the VM represented by this backup item.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * Health details on this backup item.
     * 
     */
    private final @Nullable List<AzureIaaSVMHealthDetailsResponse> healthDetails;
    /**
     * Health status of protected item.
     * 
     */
    private final @Nullable String healthStatus;
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
     * Last backup operation status.
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
     * ID of the backup policy with which this item is backed up.
     * 
     */
    private final @Nullable String policyId;
    /**
     * Data ID of the protected item.
     * 
     */
    private final @Nullable String protectedItemDataId;
    /**
     * backup item type.
     * Expected value is &#39;AzureIaaSVMProtectedItem&#39;.
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
     * ARM ID of the resource to be backed up.
     * 
     */
    private final @Nullable String sourceResourceId;
    /**
     * Fully qualified ARM ID of the virtual machine represented by this item.
     * 
     */
    private final @Nullable String virtualMachineId;
    /**
     * Type of workload this item represents.
     * 
     */
    private final @Nullable String workloadType;

    @CustomType.Constructor
    private AzureIaaSVMProtectedItemResponse(
        @CustomType.Parameter("backupManagementType") @Nullable String backupManagementType,
        @CustomType.Parameter("backupSetName") @Nullable String backupSetName,
        @CustomType.Parameter("containerName") @Nullable String containerName,
        @CustomType.Parameter("createMode") @Nullable String createMode,
        @CustomType.Parameter("deferredDeleteTimeInUTC") @Nullable String deferredDeleteTimeInUTC,
        @CustomType.Parameter("deferredDeleteTimeRemaining") @Nullable String deferredDeleteTimeRemaining,
        @CustomType.Parameter("extendedInfo") @Nullable AzureIaaSVMProtectedItemExtendedInfoResponse extendedInfo,
        @CustomType.Parameter("extendedProperties") @Nullable ExtendedPropertiesResponse extendedProperties,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("healthDetails") @Nullable List<AzureIaaSVMHealthDetailsResponse> healthDetails,
        @CustomType.Parameter("healthStatus") @Nullable String healthStatus,
        @CustomType.Parameter("isDeferredDeleteScheduleUpcoming") @Nullable Boolean isDeferredDeleteScheduleUpcoming,
        @CustomType.Parameter("isRehydrate") @Nullable Boolean isRehydrate,
        @CustomType.Parameter("isScheduledForDeferredDelete") @Nullable Boolean isScheduledForDeferredDelete,
        @CustomType.Parameter("kpisHealths") @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths,
        @CustomType.Parameter("lastBackupStatus") @Nullable String lastBackupStatus,
        @CustomType.Parameter("lastBackupTime") @Nullable String lastBackupTime,
        @CustomType.Parameter("lastRecoveryPoint") @Nullable String lastRecoveryPoint,
        @CustomType.Parameter("policyId") @Nullable String policyId,
        @CustomType.Parameter("protectedItemDataId") @Nullable String protectedItemDataId,
        @CustomType.Parameter("protectedItemType") String protectedItemType,
        @CustomType.Parameter("protectionState") @Nullable String protectionState,
        @CustomType.Parameter("protectionStatus") @Nullable String protectionStatus,
        @CustomType.Parameter("sourceResourceId") @Nullable String sourceResourceId,
        @CustomType.Parameter("virtualMachineId") @Nullable String virtualMachineId,
        @CustomType.Parameter("workloadType") @Nullable String workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.extendedProperties = extendedProperties;
        this.friendlyName = friendlyName;
        this.healthDetails = healthDetails;
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
        this.protectedItemType = protectedItemType;
        this.protectionState = protectionState;
        this.protectionStatus = protectionStatus;
        this.sourceResourceId = sourceResourceId;
        this.virtualMachineId = virtualMachineId;
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
    public Optional<AzureIaaSVMProtectedItemExtendedInfoResponse> extendedInfo() {
        return Optional.ofNullable(this.extendedInfo);
    }
    /**
     * Extended Properties for Azure IaasVM Backup.
     * 
    */
    public Optional<ExtendedPropertiesResponse> extendedProperties() {
        return Optional.ofNullable(this.extendedProperties);
    }
    /**
     * Friendly name of the VM represented by this backup item.
     * 
    */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * Health details on this backup item.
     * 
    */
    public List<AzureIaaSVMHealthDetailsResponse> healthDetails() {
        return this.healthDetails == null ? List.of() : this.healthDetails;
    }
    /**
     * Health status of protected item.
     * 
    */
    public Optional<String> healthStatus() {
        return Optional.ofNullable(this.healthStatus);
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
     * Last backup operation status.
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
    public Optional<String> protectedItemDataId() {
        return Optional.ofNullable(this.protectedItemDataId);
    }
    /**
     * backup item type.
     * Expected value is &#39;AzureIaaSVMProtectedItem&#39;.
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
     * ARM ID of the resource to be backed up.
     * 
    */
    public Optional<String> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }
    /**
     * Fully qualified ARM ID of the virtual machine represented by this item.
     * 
    */
    public Optional<String> virtualMachineId() {
        return Optional.ofNullable(this.virtualMachineId);
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

    public static Builder builder(AzureIaaSVMProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String backupSetName;
        private @Nullable String containerName;
        private @Nullable String createMode;
        private @Nullable String deferredDeleteTimeInUTC;
        private @Nullable String deferredDeleteTimeRemaining;
        private @Nullable AzureIaaSVMProtectedItemExtendedInfoResponse extendedInfo;
        private @Nullable ExtendedPropertiesResponse extendedProperties;
        private @Nullable String friendlyName;
        private @Nullable List<AzureIaaSVMHealthDetailsResponse> healthDetails;
        private @Nullable String healthStatus;
        private @Nullable Boolean isDeferredDeleteScheduleUpcoming;
        private @Nullable Boolean isRehydrate;
        private @Nullable Boolean isScheduledForDeferredDelete;
        private @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths;
        private @Nullable String lastBackupStatus;
        private @Nullable String lastBackupTime;
        private @Nullable String lastRecoveryPoint;
        private @Nullable String policyId;
        private @Nullable String protectedItemDataId;
        private String protectedItemType;
        private @Nullable String protectionState;
        private @Nullable String protectionStatus;
        private @Nullable String sourceResourceId;
        private @Nullable String virtualMachineId;
        private @Nullable String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSVMProtectedItemResponse defaults) {
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
    	      this.healthDetails = defaults.healthDetails;
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
        public Builder extendedInfo(@Nullable AzureIaaSVMProtectedItemExtendedInfoResponse extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }
        public Builder extendedProperties(@Nullable ExtendedPropertiesResponse extendedProperties) {
            this.extendedProperties = extendedProperties;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder healthDetails(@Nullable List<AzureIaaSVMHealthDetailsResponse> healthDetails) {
            this.healthDetails = healthDetails;
            return this;
        }
        public Builder healthDetails(AzureIaaSVMHealthDetailsResponse... healthDetails) {
            return healthDetails(List.of(healthDetails));
        }
        public Builder healthStatus(@Nullable String healthStatus) {
            this.healthStatus = healthStatus;
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
        public Builder policyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }
        public Builder protectedItemDataId(@Nullable String protectedItemDataId) {
            this.protectedItemDataId = protectedItemDataId;
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
        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }
        public Builder virtualMachineId(@Nullable String virtualMachineId) {
            this.virtualMachineId = virtualMachineId;
            return this;
        }
        public Builder workloadType(@Nullable String workloadType) {
            this.workloadType = workloadType;
            return this;
        }        public AzureIaaSVMProtectedItemResponse build() {
            return new AzureIaaSVMProtectedItemResponse(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, extendedProperties, friendlyName, healthDetails, healthStatus, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, kpisHealths, lastBackupStatus, lastBackupTime, lastRecoveryPoint, policyId, protectedItemDataId, protectedItemType, protectionState, protectionStatus, sourceResourceId, virtualMachineId, workloadType);
        }
    }
}
