// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.BackupRetentionSettingsResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Database instance backup configuration.
 * 
 */
public final class BackupConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final BackupConfigurationResponse Empty = new BackupConfigurationResponse();

    /**
     * Backup retention settings.
     * 
     */
    @Import(name="backupRetentionSettings", required=true)
    private BackupRetentionSettingsResponse backupRetentionSettings;

    public BackupRetentionSettingsResponse backupRetentionSettings() {
        return this.backupRetentionSettings;
    }

    /**
     * (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must be disabled as well.
     * 
     */
    @Import(name="binaryLogEnabled", required=true)
    private Boolean binaryLogEnabled;

    public Boolean binaryLogEnabled() {
        return this.binaryLogEnabled;
    }

    /**
     * Whether this configuration is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * This is always `sql#backupConfiguration`.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * Location of the backup
     * 
     */
    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    /**
     * (Postgres only) Whether point in time recovery is enabled.
     * 
     */
    @Import(name="pointInTimeRecoveryEnabled", required=true)
    private Boolean pointInTimeRecoveryEnabled;

    public Boolean pointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled;
    }

    /**
     * Reserved for future use.
     * 
     */
    @Import(name="replicationLogArchivingEnabled", required=true)
    private Boolean replicationLogArchivingEnabled;

    public Boolean replicationLogArchivingEnabled() {
        return this.replicationLogArchivingEnabled;
    }

    /**
     * Start time for the daily backup configuration in UTC timezone in the 24 hour format - `HH:MM`.
     * 
     */
    @Import(name="startTime", required=true)
    private String startTime;

    public String startTime() {
        return this.startTime;
    }

    /**
     * The number of days of transaction logs we retain for point in time restore, from 1-7.
     * 
     */
    @Import(name="transactionLogRetentionDays", required=true)
    private Integer transactionLogRetentionDays;

    public Integer transactionLogRetentionDays() {
        return this.transactionLogRetentionDays;
    }

    private BackupConfigurationResponse() {}

    private BackupConfigurationResponse(BackupConfigurationResponse $) {
        this.backupRetentionSettings = $.backupRetentionSettings;
        this.binaryLogEnabled = $.binaryLogEnabled;
        this.enabled = $.enabled;
        this.kind = $.kind;
        this.location = $.location;
        this.pointInTimeRecoveryEnabled = $.pointInTimeRecoveryEnabled;
        this.replicationLogArchivingEnabled = $.replicationLogArchivingEnabled;
        this.startTime = $.startTime;
        this.transactionLogRetentionDays = $.transactionLogRetentionDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupConfigurationResponse $;

        public Builder() {
            $ = new BackupConfigurationResponse();
        }

        public Builder(BackupConfigurationResponse defaults) {
            $ = new BackupConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder backupRetentionSettings(BackupRetentionSettingsResponse backupRetentionSettings) {
            $.backupRetentionSettings = backupRetentionSettings;
            return this;
        }

        public Builder binaryLogEnabled(Boolean binaryLogEnabled) {
            $.binaryLogEnabled = binaryLogEnabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder pointInTimeRecoveryEnabled(Boolean pointInTimeRecoveryEnabled) {
            $.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
            return this;
        }

        public Builder replicationLogArchivingEnabled(Boolean replicationLogArchivingEnabled) {
            $.replicationLogArchivingEnabled = replicationLogArchivingEnabled;
            return this;
        }

        public Builder startTime(String startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder transactionLogRetentionDays(Integer transactionLogRetentionDays) {
            $.transactionLogRetentionDays = transactionLogRetentionDays;
            return this;
        }

        public BackupConfigurationResponse build() {
            $.backupRetentionSettings = Objects.requireNonNull($.backupRetentionSettings, "expected parameter 'backupRetentionSettings' to be non-null");
            $.binaryLogEnabled = Objects.requireNonNull($.binaryLogEnabled, "expected parameter 'binaryLogEnabled' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.pointInTimeRecoveryEnabled = Objects.requireNonNull($.pointInTimeRecoveryEnabled, "expected parameter 'pointInTimeRecoveryEnabled' to be non-null");
            $.replicationLogArchivingEnabled = Objects.requireNonNull($.replicationLogArchivingEnabled, "expected parameter 'replicationLogArchivingEnabled' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            $.transactionLogRetentionDays = Objects.requireNonNull($.transactionLogRetentionDays, "expected parameter 'transactionLogRetentionDays' to be non-null");
            return $;
        }
    }

}
