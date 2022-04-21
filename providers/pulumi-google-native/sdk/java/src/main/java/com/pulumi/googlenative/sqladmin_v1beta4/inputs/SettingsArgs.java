// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.sqladmin_v1beta4.enums.SettingsActivationPolicy;
import com.pulumi.googlenative.sqladmin_v1beta4.enums.SettingsAvailabilityType;
import com.pulumi.googlenative.sqladmin_v1beta4.enums.SettingsDataDiskType;
import com.pulumi.googlenative.sqladmin_v1beta4.enums.SettingsPricingPlan;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.BackupConfigurationArgs;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.DatabaseFlagsArgs;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.DenyMaintenancePeriodArgs;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.InsightsConfigArgs;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.IpConfigurationArgs;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.LocationPreferenceArgs;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.MaintenanceWindowArgs;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.PasswordValidationPolicyArgs;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.SqlActiveDirectoryConfigArgs;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.SqlServerAuditConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Database instance settings.
 * 
 */
public final class SettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingsArgs Empty = new SettingsArgs();

    /**
     * The activation policy specifies when the instance is activated; it is applicable only when the instance state is RUNNABLE. Valid values: * `ALWAYS`: The instance is on, and remains so even in the absence of connection requests. * `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    @Import(name="activationPolicy")
    private @Nullable Output<SettingsActivationPolicy> activationPolicy;

    public Optional<Output<SettingsActivationPolicy>> activationPolicy() {
        return Optional.ofNullable(this.activationPolicy);
    }

    /**
     * Active Directory configuration, relevant only for Cloud SQL for SQL Server.
     * 
     */
    @Import(name="activeDirectoryConfig")
    private @Nullable Output<SqlActiveDirectoryConfigArgs> activeDirectoryConfig;

    public Optional<Output<SqlActiveDirectoryConfigArgs>> activeDirectoryConfig() {
        return Optional.ofNullable(this.activeDirectoryConfig);
    }

    /**
     * Availability type. Potential values: * `ZONAL`: The instance serves data from only one zone. Outages in that zone affect data accessibility. * `REGIONAL`: The instance can serve data from more than one zone in a region (it is highly available)./ For more information, see [Overview of the High Availability Configuration](https://cloud.google.com/sql/docs/mysql/high-availability).
     * 
     */
    @Import(name="availabilityType")
    private @Nullable Output<SettingsAvailabilityType> availabilityType;

    public Optional<Output<SettingsAvailabilityType>> availabilityType() {
        return Optional.ofNullable(this.availabilityType);
    }

    /**
     * The daily backup configuration for the instance.
     * 
     */
    @Import(name="backupConfiguration")
    private @Nullable Output<BackupConfigurationArgs> backupConfiguration;

    public Optional<Output<BackupConfigurationArgs>> backupConfiguration() {
        return Optional.ofNullable(this.backupConfiguration);
    }

    /**
     * The name of server Instance collation.
     * 
     */
    @Import(name="collation")
    private @Nullable Output<String> collation;

    public Optional<Output<String>> collation() {
        return Optional.ofNullable(this.collation);
    }

    /**
     * Configuration specific to read replica instances. Indicates whether database flags for crash-safe replication are enabled. This property was only applicable to First Generation instances.
     * 
     */
    @Import(name="crashSafeReplicationEnabled")
    private @Nullable Output<Boolean> crashSafeReplicationEnabled;

    public Optional<Output<Boolean>> crashSafeReplicationEnabled() {
        return Optional.ofNullable(this.crashSafeReplicationEnabled);
    }

    /**
     * The size of data disk, in GB. The data disk size minimum is 10GB.
     * 
     */
    @Import(name="dataDiskSizeGb")
    private @Nullable Output<String> dataDiskSizeGb;

    public Optional<Output<String>> dataDiskSizeGb() {
        return Optional.ofNullable(this.dataDiskSizeGb);
    }

    /**
     * The type of data disk: `PD_SSD` (default) or `PD_HDD`. Not used for First Generation instances.
     * 
     */
    @Import(name="dataDiskType")
    private @Nullable Output<SettingsDataDiskType> dataDiskType;

    public Optional<Output<SettingsDataDiskType>> dataDiskType() {
        return Optional.ofNullable(this.dataDiskType);
    }

    /**
     * The database flags passed to the instance at startup.
     * 
     */
    @Import(name="databaseFlags")
    private @Nullable Output<List<DatabaseFlagsArgs>> databaseFlags;

    public Optional<Output<List<DatabaseFlagsArgs>>> databaseFlags() {
        return Optional.ofNullable(this.databaseFlags);
    }

    /**
     * Configuration specific to read replica instances. Indicates whether replication is enabled or not. WARNING: Changing this restarts the instance.
     * 
     */
    @Import(name="databaseReplicationEnabled")
    private @Nullable Output<Boolean> databaseReplicationEnabled;

    public Optional<Output<Boolean>> databaseReplicationEnabled() {
        return Optional.ofNullable(this.databaseReplicationEnabled);
    }

    /**
     * Deny maintenance periods
     * 
     */
    @Import(name="denyMaintenancePeriods")
    private @Nullable Output<List<DenyMaintenancePeriodArgs>> denyMaintenancePeriods;

    public Optional<Output<List<DenyMaintenancePeriodArgs>>> denyMaintenancePeriods() {
        return Optional.ofNullable(this.denyMaintenancePeriods);
    }

    /**
     * Insights configuration, for now relevant only for Postgres.
     * 
     */
    @Import(name="insightsConfig")
    private @Nullable Output<InsightsConfigArgs> insightsConfig;

    public Optional<Output<InsightsConfigArgs>> insightsConfig() {
        return Optional.ofNullable(this.insightsConfig);
    }

    /**
     * The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled for Second Generation instances.
     * 
     */
    @Import(name="ipConfiguration")
    private @Nullable Output<IpConfigurationArgs> ipConfiguration;

    public Optional<Output<IpConfigurationArgs>> ipConfiguration() {
        return Optional.ofNullable(this.ipConfiguration);
    }

    /**
     * This is always `sql#settings`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The location preference settings. This allows the instance to be located as near as possible to either an App Engine app or Compute Engine zone for better performance. App Engine co-location was only applicable to First Generation instances.
     * 
     */
    @Import(name="locationPreference")
    private @Nullable Output<LocationPreferenceArgs> locationPreference;

    public Optional<Output<LocationPreferenceArgs>> locationPreference() {
        return Optional.ofNullable(this.locationPreference);
    }

    /**
     * The maintenance window for this instance. This specifies when the instance can be restarted for maintenance purposes.
     * 
     */
    @Import(name="maintenanceWindow")
    private @Nullable Output<MaintenanceWindowArgs> maintenanceWindow;

    public Optional<Output<MaintenanceWindowArgs>> maintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }

    /**
     * The local user password validation policy of the instance.
     * 
     */
    @Import(name="passwordValidationPolicy")
    private @Nullable Output<PasswordValidationPolicyArgs> passwordValidationPolicy;

    public Optional<Output<PasswordValidationPolicyArgs>> passwordValidationPolicy() {
        return Optional.ofNullable(this.passwordValidationPolicy);
    }

    /**
     * The pricing plan for this instance. This can be either `PER_USE` or `PACKAGE`. Only `PER_USE` is supported for Second Generation instances.
     * 
     */
    @Import(name="pricingPlan")
    private @Nullable Output<SettingsPricingPlan> pricingPlan;

    public Optional<Output<SettingsPricingPlan>> pricingPlan() {
        return Optional.ofNullable(this.pricingPlan);
    }

    /**
     * The version of instance settings. This is a required field for update method to make sure concurrent updates are handled properly. During update, use the most recent settingsVersion value for this instance and do not try to update this value.
     * 
     */
    @Import(name="settingsVersion")
    private @Nullable Output<String> settingsVersion;

    public Optional<Output<String>> settingsVersion() {
        return Optional.ofNullable(this.settingsVersion);
    }

    /**
     * SQL Server specific audit configuration.
     * 
     */
    @Import(name="sqlServerAuditConfig")
    private @Nullable Output<SqlServerAuditConfigArgs> sqlServerAuditConfig;

    public Optional<Output<SqlServerAuditConfigArgs>> sqlServerAuditConfig() {
        return Optional.ofNullable(this.sqlServerAuditConfig);
    }

    /**
     * Configuration to increase storage size automatically. The default value is true.
     * 
     */
    @Import(name="storageAutoResize")
    private @Nullable Output<Boolean> storageAutoResize;

    public Optional<Output<Boolean>> storageAutoResize() {
        return Optional.ofNullable(this.storageAutoResize);
    }

    /**
     * The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
     * 
     */
    @Import(name="storageAutoResizeLimit")
    private @Nullable Output<String> storageAutoResizeLimit;

    public Optional<Output<String>> storageAutoResizeLimit() {
        return Optional.ofNullable(this.storageAutoResizeLimit);
    }

    /**
     * The tier (or machine type) for this instance, for example `db-custom-1-3840`. WARNING: Changing this restarts the instance.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    /**
     * User-provided labels, represented as a dictionary where each label is a single key value pair.
     * 
     */
    @Import(name="userLabels")
    private @Nullable Output<Map<String,String>> userLabels;

    public Optional<Output<Map<String,String>>> userLabels() {
        return Optional.ofNullable(this.userLabels);
    }

    private SettingsArgs() {}

    private SettingsArgs(SettingsArgs $) {
        this.activationPolicy = $.activationPolicy;
        this.activeDirectoryConfig = $.activeDirectoryConfig;
        this.availabilityType = $.availabilityType;
        this.backupConfiguration = $.backupConfiguration;
        this.collation = $.collation;
        this.crashSafeReplicationEnabled = $.crashSafeReplicationEnabled;
        this.dataDiskSizeGb = $.dataDiskSizeGb;
        this.dataDiskType = $.dataDiskType;
        this.databaseFlags = $.databaseFlags;
        this.databaseReplicationEnabled = $.databaseReplicationEnabled;
        this.denyMaintenancePeriods = $.denyMaintenancePeriods;
        this.insightsConfig = $.insightsConfig;
        this.ipConfiguration = $.ipConfiguration;
        this.kind = $.kind;
        this.locationPreference = $.locationPreference;
        this.maintenanceWindow = $.maintenanceWindow;
        this.passwordValidationPolicy = $.passwordValidationPolicy;
        this.pricingPlan = $.pricingPlan;
        this.settingsVersion = $.settingsVersion;
        this.sqlServerAuditConfig = $.sqlServerAuditConfig;
        this.storageAutoResize = $.storageAutoResize;
        this.storageAutoResizeLimit = $.storageAutoResizeLimit;
        this.tier = $.tier;
        this.userLabels = $.userLabels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingsArgs $;

        public Builder() {
            $ = new SettingsArgs();
        }

        public Builder(SettingsArgs defaults) {
            $ = new SettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder activationPolicy(@Nullable Output<SettingsActivationPolicy> activationPolicy) {
            $.activationPolicy = activationPolicy;
            return this;
        }

        public Builder activationPolicy(SettingsActivationPolicy activationPolicy) {
            return activationPolicy(Output.of(activationPolicy));
        }

        public Builder activeDirectoryConfig(@Nullable Output<SqlActiveDirectoryConfigArgs> activeDirectoryConfig) {
            $.activeDirectoryConfig = activeDirectoryConfig;
            return this;
        }

        public Builder activeDirectoryConfig(SqlActiveDirectoryConfigArgs activeDirectoryConfig) {
            return activeDirectoryConfig(Output.of(activeDirectoryConfig));
        }

        public Builder availabilityType(@Nullable Output<SettingsAvailabilityType> availabilityType) {
            $.availabilityType = availabilityType;
            return this;
        }

        public Builder availabilityType(SettingsAvailabilityType availabilityType) {
            return availabilityType(Output.of(availabilityType));
        }

        public Builder backupConfiguration(@Nullable Output<BackupConfigurationArgs> backupConfiguration) {
            $.backupConfiguration = backupConfiguration;
            return this;
        }

        public Builder backupConfiguration(BackupConfigurationArgs backupConfiguration) {
            return backupConfiguration(Output.of(backupConfiguration));
        }

        public Builder collation(@Nullable Output<String> collation) {
            $.collation = collation;
            return this;
        }

        public Builder collation(String collation) {
            return collation(Output.of(collation));
        }

        public Builder crashSafeReplicationEnabled(@Nullable Output<Boolean> crashSafeReplicationEnabled) {
            $.crashSafeReplicationEnabled = crashSafeReplicationEnabled;
            return this;
        }

        public Builder crashSafeReplicationEnabled(Boolean crashSafeReplicationEnabled) {
            return crashSafeReplicationEnabled(Output.of(crashSafeReplicationEnabled));
        }

        public Builder dataDiskSizeGb(@Nullable Output<String> dataDiskSizeGb) {
            $.dataDiskSizeGb = dataDiskSizeGb;
            return this;
        }

        public Builder dataDiskSizeGb(String dataDiskSizeGb) {
            return dataDiskSizeGb(Output.of(dataDiskSizeGb));
        }

        public Builder dataDiskType(@Nullable Output<SettingsDataDiskType> dataDiskType) {
            $.dataDiskType = dataDiskType;
            return this;
        }

        public Builder dataDiskType(SettingsDataDiskType dataDiskType) {
            return dataDiskType(Output.of(dataDiskType));
        }

        public Builder databaseFlags(@Nullable Output<List<DatabaseFlagsArgs>> databaseFlags) {
            $.databaseFlags = databaseFlags;
            return this;
        }

        public Builder databaseFlags(List<DatabaseFlagsArgs> databaseFlags) {
            return databaseFlags(Output.of(databaseFlags));
        }

        public Builder databaseFlags(DatabaseFlagsArgs... databaseFlags) {
            return databaseFlags(List.of(databaseFlags));
        }

        public Builder databaseReplicationEnabled(@Nullable Output<Boolean> databaseReplicationEnabled) {
            $.databaseReplicationEnabled = databaseReplicationEnabled;
            return this;
        }

        public Builder databaseReplicationEnabled(Boolean databaseReplicationEnabled) {
            return databaseReplicationEnabled(Output.of(databaseReplicationEnabled));
        }

        public Builder denyMaintenancePeriods(@Nullable Output<List<DenyMaintenancePeriodArgs>> denyMaintenancePeriods) {
            $.denyMaintenancePeriods = denyMaintenancePeriods;
            return this;
        }

        public Builder denyMaintenancePeriods(List<DenyMaintenancePeriodArgs> denyMaintenancePeriods) {
            return denyMaintenancePeriods(Output.of(denyMaintenancePeriods));
        }

        public Builder denyMaintenancePeriods(DenyMaintenancePeriodArgs... denyMaintenancePeriods) {
            return denyMaintenancePeriods(List.of(denyMaintenancePeriods));
        }

        public Builder insightsConfig(@Nullable Output<InsightsConfigArgs> insightsConfig) {
            $.insightsConfig = insightsConfig;
            return this;
        }

        public Builder insightsConfig(InsightsConfigArgs insightsConfig) {
            return insightsConfig(Output.of(insightsConfig));
        }

        public Builder ipConfiguration(@Nullable Output<IpConfigurationArgs> ipConfiguration) {
            $.ipConfiguration = ipConfiguration;
            return this;
        }

        public Builder ipConfiguration(IpConfigurationArgs ipConfiguration) {
            return ipConfiguration(Output.of(ipConfiguration));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder locationPreference(@Nullable Output<LocationPreferenceArgs> locationPreference) {
            $.locationPreference = locationPreference;
            return this;
        }

        public Builder locationPreference(LocationPreferenceArgs locationPreference) {
            return locationPreference(Output.of(locationPreference));
        }

        public Builder maintenanceWindow(@Nullable Output<MaintenanceWindowArgs> maintenanceWindow) {
            $.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder maintenanceWindow(MaintenanceWindowArgs maintenanceWindow) {
            return maintenanceWindow(Output.of(maintenanceWindow));
        }

        public Builder passwordValidationPolicy(@Nullable Output<PasswordValidationPolicyArgs> passwordValidationPolicy) {
            $.passwordValidationPolicy = passwordValidationPolicy;
            return this;
        }

        public Builder passwordValidationPolicy(PasswordValidationPolicyArgs passwordValidationPolicy) {
            return passwordValidationPolicy(Output.of(passwordValidationPolicy));
        }

        public Builder pricingPlan(@Nullable Output<SettingsPricingPlan> pricingPlan) {
            $.pricingPlan = pricingPlan;
            return this;
        }

        public Builder pricingPlan(SettingsPricingPlan pricingPlan) {
            return pricingPlan(Output.of(pricingPlan));
        }

        public Builder settingsVersion(@Nullable Output<String> settingsVersion) {
            $.settingsVersion = settingsVersion;
            return this;
        }

        public Builder settingsVersion(String settingsVersion) {
            return settingsVersion(Output.of(settingsVersion));
        }

        public Builder sqlServerAuditConfig(@Nullable Output<SqlServerAuditConfigArgs> sqlServerAuditConfig) {
            $.sqlServerAuditConfig = sqlServerAuditConfig;
            return this;
        }

        public Builder sqlServerAuditConfig(SqlServerAuditConfigArgs sqlServerAuditConfig) {
            return sqlServerAuditConfig(Output.of(sqlServerAuditConfig));
        }

        public Builder storageAutoResize(@Nullable Output<Boolean> storageAutoResize) {
            $.storageAutoResize = storageAutoResize;
            return this;
        }

        public Builder storageAutoResize(Boolean storageAutoResize) {
            return storageAutoResize(Output.of(storageAutoResize));
        }

        public Builder storageAutoResizeLimit(@Nullable Output<String> storageAutoResizeLimit) {
            $.storageAutoResizeLimit = storageAutoResizeLimit;
            return this;
        }

        public Builder storageAutoResizeLimit(String storageAutoResizeLimit) {
            return storageAutoResizeLimit(Output.of(storageAutoResizeLimit));
        }

        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public Builder userLabels(@Nullable Output<Map<String,String>> userLabels) {
            $.userLabels = userLabels;
            return this;
        }

        public Builder userLabels(Map<String,String> userLabels) {
            return userLabels(Output.of(userLabels));
        }

        public SettingsArgs build() {
            return $;
        }
    }

}
