// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualMachineAutoBackupManualSchedule {
    /**
     * @return Frequency of full backups. Valid values include `Daily` or `Weekly`. Required when `backup_schedule_automated` is false.
     * 
     */
    private final String fullBackupFrequency;
    /**
     * @return Start hour of a given day during which full backups can take place. Valid values are from `0` to `23`. Required when `backup_schedule_automated` is false.
     * 
     */
    private final Integer fullBackupStartHour;
    /**
     * @return Duration of the time window of a given day during which full backups can take place, in hours. Valid values are between `1` and `23`. Required when `backup_schedule_automated` is false.
     * 
     */
    private final Integer fullBackupWindowInHours;
    /**
     * @return Frequency of log backups, in minutes. Valid values are from `5` to `60`. Required when `backup_schedule_automated` is false.
     * 
     */
    private final Integer logBackupFrequencyInMinutes;

    @CustomType.Constructor
    private VirtualMachineAutoBackupManualSchedule(
        @CustomType.Parameter("fullBackupFrequency") String fullBackupFrequency,
        @CustomType.Parameter("fullBackupStartHour") Integer fullBackupStartHour,
        @CustomType.Parameter("fullBackupWindowInHours") Integer fullBackupWindowInHours,
        @CustomType.Parameter("logBackupFrequencyInMinutes") Integer logBackupFrequencyInMinutes) {
        this.fullBackupFrequency = fullBackupFrequency;
        this.fullBackupStartHour = fullBackupStartHour;
        this.fullBackupWindowInHours = fullBackupWindowInHours;
        this.logBackupFrequencyInMinutes = logBackupFrequencyInMinutes;
    }

    /**
     * @return Frequency of full backups. Valid values include `Daily` or `Weekly`. Required when `backup_schedule_automated` is false.
     * 
     */
    public String fullBackupFrequency() {
        return this.fullBackupFrequency;
    }
    /**
     * @return Start hour of a given day during which full backups can take place. Valid values are from `0` to `23`. Required when `backup_schedule_automated` is false.
     * 
     */
    public Integer fullBackupStartHour() {
        return this.fullBackupStartHour;
    }
    /**
     * @return Duration of the time window of a given day during which full backups can take place, in hours. Valid values are between `1` and `23`. Required when `backup_schedule_automated` is false.
     * 
     */
    public Integer fullBackupWindowInHours() {
        return this.fullBackupWindowInHours;
    }
    /**
     * @return Frequency of log backups, in minutes. Valid values are from `5` to `60`. Required when `backup_schedule_automated` is false.
     * 
     */
    public Integer logBackupFrequencyInMinutes() {
        return this.logBackupFrequencyInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineAutoBackupManualSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fullBackupFrequency;
        private Integer fullBackupStartHour;
        private Integer fullBackupWindowInHours;
        private Integer logBackupFrequencyInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineAutoBackupManualSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullBackupFrequency = defaults.fullBackupFrequency;
    	      this.fullBackupStartHour = defaults.fullBackupStartHour;
    	      this.fullBackupWindowInHours = defaults.fullBackupWindowInHours;
    	      this.logBackupFrequencyInMinutes = defaults.logBackupFrequencyInMinutes;
        }

        public Builder fullBackupFrequency(String fullBackupFrequency) {
            this.fullBackupFrequency = Objects.requireNonNull(fullBackupFrequency);
            return this;
        }
        public Builder fullBackupStartHour(Integer fullBackupStartHour) {
            this.fullBackupStartHour = Objects.requireNonNull(fullBackupStartHour);
            return this;
        }
        public Builder fullBackupWindowInHours(Integer fullBackupWindowInHours) {
            this.fullBackupWindowInHours = Objects.requireNonNull(fullBackupWindowInHours);
            return this;
        }
        public Builder logBackupFrequencyInMinutes(Integer logBackupFrequencyInMinutes) {
            this.logBackupFrequencyInMinutes = Objects.requireNonNull(logBackupFrequencyInMinutes);
            return this;
        }        public VirtualMachineAutoBackupManualSchedule build() {
            return new VirtualMachineAutoBackupManualSchedule(fullBackupFrequency, fullBackupStartHour, fullBackupWindowInHours, logBackupFrequencyInMinutes);
        }
    }
}
