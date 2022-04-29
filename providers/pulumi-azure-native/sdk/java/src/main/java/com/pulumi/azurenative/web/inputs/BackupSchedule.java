// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.enums.FrequencyUnit;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.InvokeArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a backup schedule. Describes how often should be the backup performed and what should be the retention policy.
 * 
 */
public final class BackupSchedule extends InvokeArgs {

    public static final BackupSchedule Empty = new BackupSchedule();

    /**
     * How often the backup should be executed (e.g. for weekly backup, this should be set to 7 and FrequencyUnit should be set to Day)
     * 
     */
    @Import(name="frequencyInterval", required=true)
    private Integer frequencyInterval;

    /**
     * @return How often the backup should be executed (e.g. for weekly backup, this should be set to 7 and FrequencyUnit should be set to Day)
     * 
     */
    public Integer frequencyInterval() {
        return this.frequencyInterval;
    }

    /**
     * The unit of time for how often the backup should be executed (e.g. for weekly backup, this should be set to Day and FrequencyInterval should be set to 7)
     * 
     */
    @Import(name="frequencyUnit", required=true)
    private FrequencyUnit frequencyUnit;

    /**
     * @return The unit of time for how often the backup should be executed (e.g. for weekly backup, this should be set to Day and FrequencyInterval should be set to 7)
     * 
     */
    public FrequencyUnit frequencyUnit() {
        return this.frequencyUnit;
    }

    /**
     * True if the retention policy should always keep at least one backup in the storage account, regardless how old it is; false otherwise.
     * 
     */
    @Import(name="keepAtLeastOneBackup", required=true)
    private Boolean keepAtLeastOneBackup;

    /**
     * @return True if the retention policy should always keep at least one backup in the storage account, regardless how old it is; false otherwise.
     * 
     */
    public Boolean keepAtLeastOneBackup() {
        return this.keepAtLeastOneBackup;
    }

    /**
     * After how many days backups should be deleted.
     * 
     */
    @Import(name="retentionPeriodInDays", required=true)
    private Integer retentionPeriodInDays;

    /**
     * @return After how many days backups should be deleted.
     * 
     */
    public Integer retentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    /**
     * When the schedule should start working.
     * 
     */
    @Import(name="startTime")
    private @Nullable String startTime;

    /**
     * @return When the schedule should start working.
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private BackupSchedule() {}

    private BackupSchedule(BackupSchedule $) {
        this.frequencyInterval = $.frequencyInterval;
        this.frequencyUnit = $.frequencyUnit;
        this.keepAtLeastOneBackup = $.keepAtLeastOneBackup;
        this.retentionPeriodInDays = $.retentionPeriodInDays;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupSchedule $;

        public Builder() {
            $ = new BackupSchedule();
        }

        public Builder(BackupSchedule defaults) {
            $ = new BackupSchedule(Objects.requireNonNull(defaults));
        }

        /**
         * @param frequencyInterval How often the backup should be executed (e.g. for weekly backup, this should be set to 7 and FrequencyUnit should be set to Day)
         * 
         * @return builder
         * 
         */
        public Builder frequencyInterval(Integer frequencyInterval) {
            $.frequencyInterval = frequencyInterval;
            return this;
        }

        /**
         * @param frequencyUnit The unit of time for how often the backup should be executed (e.g. for weekly backup, this should be set to Day and FrequencyInterval should be set to 7)
         * 
         * @return builder
         * 
         */
        public Builder frequencyUnit(FrequencyUnit frequencyUnit) {
            $.frequencyUnit = frequencyUnit;
            return this;
        }

        /**
         * @param keepAtLeastOneBackup True if the retention policy should always keep at least one backup in the storage account, regardless how old it is; false otherwise.
         * 
         * @return builder
         * 
         */
        public Builder keepAtLeastOneBackup(Boolean keepAtLeastOneBackup) {
            $.keepAtLeastOneBackup = keepAtLeastOneBackup;
            return this;
        }

        /**
         * @param retentionPeriodInDays After how many days backups should be deleted.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            $.retentionPeriodInDays = retentionPeriodInDays;
            return this;
        }

        /**
         * @param startTime When the schedule should start working.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable String startTime) {
            $.startTime = startTime;
            return this;
        }

        public BackupSchedule build() {
            $.frequencyInterval = Codegen.integerProp("frequencyInterval").arg($.frequencyInterval).def(7).require();
            $.frequencyUnit = Codegen.objectProp("frequencyUnit", FrequencyUnit.class).arg($.frequencyUnit).def(FrequencyUnit.Day).require();
            $.keepAtLeastOneBackup = Codegen.booleanProp("keepAtLeastOneBackup").arg($.keepAtLeastOneBackup).def(true).require();
            $.retentionPeriodInDays = Codegen.integerProp("retentionPeriodInDays").arg($.retentionPeriodInDays).def(30).require();
            return $;
        }
    }

}
