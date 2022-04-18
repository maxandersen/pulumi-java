// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.sqladmin_v1beta4.enums.BackupRetentionSettingsRetentionUnit;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * We currently only support backup retention by specifying the number of backups we will retain.
 * 
 */
public final class BackupRetentionSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupRetentionSettingsArgs Empty = new BackupRetentionSettingsArgs();

    /**
     * Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit is 'COUNT', we will retain this many backups.
     * 
     */
    @Import(name="retainedBackups")
      private final @Nullable Output<Integer> retainedBackups;

    public Output<Integer> retainedBackups() {
        return this.retainedBackups == null ? Codegen.empty() : this.retainedBackups;
    }

    /**
     * The unit that 'retained_backups' represents.
     * 
     */
    @Import(name="retentionUnit")
      private final @Nullable Output<BackupRetentionSettingsRetentionUnit> retentionUnit;

    public Output<BackupRetentionSettingsRetentionUnit> retentionUnit() {
        return this.retentionUnit == null ? Codegen.empty() : this.retentionUnit;
    }

    public BackupRetentionSettingsArgs(
        @Nullable Output<Integer> retainedBackups,
        @Nullable Output<BackupRetentionSettingsRetentionUnit> retentionUnit) {
        this.retainedBackups = retainedBackups;
        this.retentionUnit = retentionUnit;
    }

    private BackupRetentionSettingsArgs() {
        this.retainedBackups = Codegen.empty();
        this.retentionUnit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupRetentionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> retainedBackups;
        private @Nullable Output<BackupRetentionSettingsRetentionUnit> retentionUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupRetentionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retainedBackups = defaults.retainedBackups;
    	      this.retentionUnit = defaults.retentionUnit;
        }

        public Builder retainedBackups(@Nullable Output<Integer> retainedBackups) {
            this.retainedBackups = retainedBackups;
            return this;
        }
        public Builder retainedBackups(@Nullable Integer retainedBackups) {
            this.retainedBackups = Codegen.ofNullable(retainedBackups);
            return this;
        }
        public Builder retentionUnit(@Nullable Output<BackupRetentionSettingsRetentionUnit> retentionUnit) {
            this.retentionUnit = retentionUnit;
            return this;
        }
        public Builder retentionUnit(@Nullable BackupRetentionSettingsRetentionUnit retentionUnit) {
            this.retentionUnit = Codegen.ofNullable(retentionUnit);
            return this;
        }        public BackupRetentionSettingsArgs build() {
            return new BackupRetentionSettingsArgs(retainedBackups, retentionUnit);
        }
    }
}
