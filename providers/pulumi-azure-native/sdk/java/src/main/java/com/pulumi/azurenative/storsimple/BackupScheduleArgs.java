// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple;

import com.pulumi.azurenative.storsimple.enums.BackupType;
import com.pulumi.azurenative.storsimple.enums.Kind;
import com.pulumi.azurenative.storsimple.enums.ScheduleStatus;
import com.pulumi.azurenative.storsimple.inputs.ScheduleRecurrenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupScheduleArgs Empty = new BackupScheduleArgs();

    /**
     * The backup policy name.
     * 
     */
    @Import(name="backupPolicyName", required=true)
    private Output<String> backupPolicyName;

    /**
     * @return The backup policy name.
     * 
     */
    public Output<String> backupPolicyName() {
        return this.backupPolicyName;
    }

    /**
     * The backup schedule name.
     * 
     */
    @Import(name="backupScheduleName")
    private @Nullable Output<String> backupScheduleName;

    /**
     * @return The backup schedule name.
     * 
     */
    public Optional<Output<String>> backupScheduleName() {
        return Optional.ofNullable(this.backupScheduleName);
    }

    /**
     * The type of backup which needs to be taken.
     * 
     */
    @Import(name="backupType", required=true)
    private Output<BackupType> backupType;

    /**
     * @return The type of backup which needs to be taken.
     * 
     */
    public Output<BackupType> backupType() {
        return this.backupType;
    }

    /**
     * The device name
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    /**
     * @return The device name
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    @Import(name="kind")
    private @Nullable Output<Kind> kind;

    /**
     * @return The Kind of the object. Currently only Series8000 is supported
     * 
     */
    public Optional<Output<Kind>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The manager name
     * 
     */
    @Import(name="managerName", required=true)
    private Output<String> managerName;

    /**
     * @return The manager name
     * 
     */
    public Output<String> managerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The number of backups to be retained.
     * 
     */
    @Import(name="retentionCount", required=true)
    private Output<Double> retentionCount;

    /**
     * @return The number of backups to be retained.
     * 
     */
    public Output<Double> retentionCount() {
        return this.retentionCount;
    }

    /**
     * The schedule recurrence.
     * 
     */
    @Import(name="scheduleRecurrence", required=true)
    private Output<ScheduleRecurrenceArgs> scheduleRecurrence;

    /**
     * @return The schedule recurrence.
     * 
     */
    public Output<ScheduleRecurrenceArgs> scheduleRecurrence() {
        return this.scheduleRecurrence;
    }

    /**
     * The schedule status.
     * 
     */
    @Import(name="scheduleStatus", required=true)
    private Output<ScheduleStatus> scheduleStatus;

    /**
     * @return The schedule status.
     * 
     */
    public Output<ScheduleStatus> scheduleStatus() {
        return this.scheduleStatus;
    }

    /**
     * The start time of the schedule.
     * 
     */
    @Import(name="startTime", required=true)
    private Output<String> startTime;

    /**
     * @return The start time of the schedule.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }

    private BackupScheduleArgs() {}

    private BackupScheduleArgs(BackupScheduleArgs $) {
        this.backupPolicyName = $.backupPolicyName;
        this.backupScheduleName = $.backupScheduleName;
        this.backupType = $.backupType;
        this.deviceName = $.deviceName;
        this.kind = $.kind;
        this.managerName = $.managerName;
        this.resourceGroupName = $.resourceGroupName;
        this.retentionCount = $.retentionCount;
        this.scheduleRecurrence = $.scheduleRecurrence;
        this.scheduleStatus = $.scheduleStatus;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupScheduleArgs $;

        public Builder() {
            $ = new BackupScheduleArgs();
        }

        public Builder(BackupScheduleArgs defaults) {
            $ = new BackupScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupPolicyName The backup policy name.
         * 
         * @return builder
         * 
         */
        public Builder backupPolicyName(Output<String> backupPolicyName) {
            $.backupPolicyName = backupPolicyName;
            return this;
        }

        /**
         * @param backupPolicyName The backup policy name.
         * 
         * @return builder
         * 
         */
        public Builder backupPolicyName(String backupPolicyName) {
            return backupPolicyName(Output.of(backupPolicyName));
        }

        /**
         * @param backupScheduleName The backup schedule name.
         * 
         * @return builder
         * 
         */
        public Builder backupScheduleName(@Nullable Output<String> backupScheduleName) {
            $.backupScheduleName = backupScheduleName;
            return this;
        }

        /**
         * @param backupScheduleName The backup schedule name.
         * 
         * @return builder
         * 
         */
        public Builder backupScheduleName(String backupScheduleName) {
            return backupScheduleName(Output.of(backupScheduleName));
        }

        /**
         * @param backupType The type of backup which needs to be taken.
         * 
         * @return builder
         * 
         */
        public Builder backupType(Output<BackupType> backupType) {
            $.backupType = backupType;
            return this;
        }

        /**
         * @param backupType The type of backup which needs to be taken.
         * 
         * @return builder
         * 
         */
        public Builder backupType(BackupType backupType) {
            return backupType(Output.of(backupType));
        }

        /**
         * @param deviceName The device name
         * 
         * @return builder
         * 
         */
        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName The device name
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param kind The Kind of the object. Currently only Series8000 is supported
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<Kind> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The Kind of the object. Currently only Series8000 is supported
         * 
         * @return builder
         * 
         */
        public Builder kind(Kind kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param managerName The manager name
         * 
         * @return builder
         * 
         */
        public Builder managerName(Output<String> managerName) {
            $.managerName = managerName;
            return this;
        }

        /**
         * @param managerName The manager name
         * 
         * @return builder
         * 
         */
        public Builder managerName(String managerName) {
            return managerName(Output.of(managerName));
        }

        /**
         * @param resourceGroupName The resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param retentionCount The number of backups to be retained.
         * 
         * @return builder
         * 
         */
        public Builder retentionCount(Output<Double> retentionCount) {
            $.retentionCount = retentionCount;
            return this;
        }

        /**
         * @param retentionCount The number of backups to be retained.
         * 
         * @return builder
         * 
         */
        public Builder retentionCount(Double retentionCount) {
            return retentionCount(Output.of(retentionCount));
        }

        /**
         * @param scheduleRecurrence The schedule recurrence.
         * 
         * @return builder
         * 
         */
        public Builder scheduleRecurrence(Output<ScheduleRecurrenceArgs> scheduleRecurrence) {
            $.scheduleRecurrence = scheduleRecurrence;
            return this;
        }

        /**
         * @param scheduleRecurrence The schedule recurrence.
         * 
         * @return builder
         * 
         */
        public Builder scheduleRecurrence(ScheduleRecurrenceArgs scheduleRecurrence) {
            return scheduleRecurrence(Output.of(scheduleRecurrence));
        }

        /**
         * @param scheduleStatus The schedule status.
         * 
         * @return builder
         * 
         */
        public Builder scheduleStatus(Output<ScheduleStatus> scheduleStatus) {
            $.scheduleStatus = scheduleStatus;
            return this;
        }

        /**
         * @param scheduleStatus The schedule status.
         * 
         * @return builder
         * 
         */
        public Builder scheduleStatus(ScheduleStatus scheduleStatus) {
            return scheduleStatus(Output.of(scheduleStatus));
        }

        /**
         * @param startTime The start time of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder startTime(Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The start time of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public BackupScheduleArgs build() {
            $.backupPolicyName = Objects.requireNonNull($.backupPolicyName, "expected parameter 'backupPolicyName' to be non-null");
            $.backupType = Objects.requireNonNull($.backupType, "expected parameter 'backupType' to be non-null");
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.managerName = Objects.requireNonNull($.managerName, "expected parameter 'managerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.retentionCount = Objects.requireNonNull($.retentionCount, "expected parameter 'retentionCount' to be non-null");
            $.scheduleRecurrence = Objects.requireNonNull($.scheduleRecurrence, "expected parameter 'scheduleRecurrence' to be non-null");
            $.scheduleStatus = Objects.requireNonNull($.scheduleStatus, "expected parameter 'scheduleStatus' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}
