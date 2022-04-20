// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings {
    /**
     * Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit
     * is &#39;COUNT&#39;, we will retain this many backups.
     * 
     */
    private final Integer retainedBackups;
    /**
     * The unit that &#39;retained_backups&#39; represents. Defaults to `COUNT`.
     * 
     */
    private final @Nullable String retentionUnit;

    @CustomType.Constructor
    private DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings(
        @CustomType.Parameter("retainedBackups") Integer retainedBackups,
        @CustomType.Parameter("retentionUnit") @Nullable String retentionUnit) {
        this.retainedBackups = retainedBackups;
        this.retentionUnit = retentionUnit;
    }

    /**
     * Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit
     * is &#39;COUNT&#39;, we will retain this many backups.
     * 
    */
    public Integer retainedBackups() {
        return this.retainedBackups;
    }
    /**
     * The unit that &#39;retained_backups&#39; represents. Defaults to `COUNT`.
     * 
    */
    public Optional<String> retentionUnit() {
        return Optional.ofNullable(this.retentionUnit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer retainedBackups;
        private @Nullable String retentionUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retainedBackups = defaults.retainedBackups;
    	      this.retentionUnit = defaults.retentionUnit;
        }

        public Builder retainedBackups(Integer retainedBackups) {
            this.retainedBackups = Objects.requireNonNull(retainedBackups);
            return this;
        }
        public Builder retentionUnit(@Nullable String retentionUnit) {
            this.retentionUnit = retentionUnit;
            return this;
        }        public DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings build() {
            return new DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings(retainedBackups, retentionUnit);
        }
    }
}
