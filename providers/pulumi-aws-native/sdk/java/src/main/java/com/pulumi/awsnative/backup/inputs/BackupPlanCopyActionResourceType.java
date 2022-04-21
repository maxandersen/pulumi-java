// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup.inputs;

import com.pulumi.awsnative.backup.inputs.BackupPlanLifecycleResourceType;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPlanCopyActionResourceType extends com.pulumi.resources.InvokeArgs {

    public static final BackupPlanCopyActionResourceType Empty = new BackupPlanCopyActionResourceType();

    @Import(name="destinationBackupVaultArn", required=true)
    private String destinationBackupVaultArn;

    public String destinationBackupVaultArn() {
        return this.destinationBackupVaultArn;
    }

    @Import(name="lifecycle")
    private @Nullable BackupPlanLifecycleResourceType lifecycle;

    public Optional<BackupPlanLifecycleResourceType> lifecycle() {
        return Optional.ofNullable(this.lifecycle);
    }

    private BackupPlanCopyActionResourceType() {}

    private BackupPlanCopyActionResourceType(BackupPlanCopyActionResourceType $) {
        this.destinationBackupVaultArn = $.destinationBackupVaultArn;
        this.lifecycle = $.lifecycle;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPlanCopyActionResourceType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPlanCopyActionResourceType $;

        public Builder() {
            $ = new BackupPlanCopyActionResourceType();
        }

        public Builder(BackupPlanCopyActionResourceType defaults) {
            $ = new BackupPlanCopyActionResourceType(Objects.requireNonNull(defaults));
        }

        public Builder destinationBackupVaultArn(String destinationBackupVaultArn) {
            $.destinationBackupVaultArn = destinationBackupVaultArn;
            return this;
        }

        public Builder lifecycle(@Nullable BackupPlanLifecycleResourceType lifecycle) {
            $.lifecycle = lifecycle;
            return this;
        }

        public BackupPlanCopyActionResourceType build() {
            $.destinationBackupVaultArn = Objects.requireNonNull($.destinationBackupVaultArn, "expected parameter 'destinationBackupVaultArn' to be non-null");
            return $;
        }
    }

}
