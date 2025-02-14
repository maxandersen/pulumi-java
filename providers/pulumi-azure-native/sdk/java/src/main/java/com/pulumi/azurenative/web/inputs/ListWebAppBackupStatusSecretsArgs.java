// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.BackupSchedule;
import com.pulumi.azurenative.web.inputs.DatabaseBackupSetting;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListWebAppBackupStatusSecretsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListWebAppBackupStatusSecretsArgs Empty = new ListWebAppBackupStatusSecretsArgs();

    /**
     * ID of backup.
     * 
     */
    @Import(name="backupId", required=true)
    private String backupId;

    /**
     * @return ID of backup.
     * 
     */
    public String backupId() {
        return this.backupId;
    }

    /**
     * Name of the backup.
     * 
     */
    @Import(name="backupName")
    private @Nullable String backupName;

    /**
     * @return Name of the backup.
     * 
     */
    public Optional<String> backupName() {
        return Optional.ofNullable(this.backupName);
    }

    /**
     * Schedule for the backup if it is executed periodically.
     * 
     */
    @Import(name="backupSchedule")
    private @Nullable BackupSchedule backupSchedule;

    /**
     * @return Schedule for the backup if it is executed periodically.
     * 
     */
    public Optional<BackupSchedule> backupSchedule() {
        return Optional.ofNullable(this.backupSchedule);
    }

    /**
     * Databases included in the backup.
     * 
     */
    @Import(name="databases")
    private @Nullable List<DatabaseBackupSetting> databases;

    /**
     * @return Databases included in the backup.
     * 
     */
    public Optional<List<DatabaseBackupSetting>> databases() {
        return Optional.ofNullable(this.databases);
    }

    /**
     * True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    /**
     * @return True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable String kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of web app.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of web app.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * SAS URL to the container.
     * 
     */
    @Import(name="storageAccountUrl", required=true)
    private String storageAccountUrl;

    /**
     * @return SAS URL to the container.
     * 
     */
    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }

    private ListWebAppBackupStatusSecretsArgs() {}

    private ListWebAppBackupStatusSecretsArgs(ListWebAppBackupStatusSecretsArgs $) {
        this.backupId = $.backupId;
        this.backupName = $.backupName;
        this.backupSchedule = $.backupSchedule;
        this.databases = $.databases;
        this.enabled = $.enabled;
        this.kind = $.kind;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.storageAccountUrl = $.storageAccountUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWebAppBackupStatusSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWebAppBackupStatusSecretsArgs $;

        public Builder() {
            $ = new ListWebAppBackupStatusSecretsArgs();
        }

        public Builder(ListWebAppBackupStatusSecretsArgs defaults) {
            $ = new ListWebAppBackupStatusSecretsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupId ID of backup.
         * 
         * @return builder
         * 
         */
        public Builder backupId(String backupId) {
            $.backupId = backupId;
            return this;
        }

        /**
         * @param backupName Name of the backup.
         * 
         * @return builder
         * 
         */
        public Builder backupName(@Nullable String backupName) {
            $.backupName = backupName;
            return this;
        }

        /**
         * @param backupSchedule Schedule for the backup if it is executed periodically.
         * 
         * @return builder
         * 
         */
        public Builder backupSchedule(@Nullable BackupSchedule backupSchedule) {
            $.backupSchedule = backupSchedule;
            return this;
        }

        /**
         * @param databases Databases included in the backup.
         * 
         * @return builder
         * 
         */
        public Builder databases(@Nullable List<DatabaseBackupSetting> databases) {
            $.databases = databases;
            return this;
        }

        /**
         * @param databases Databases included in the backup.
         * 
         * @return builder
         * 
         */
        public Builder databases(DatabaseBackupSetting... databases) {
            return databases(List.of(databases));
        }

        /**
         * @param enabled True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param name Name of web app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param storageAccountUrl SAS URL to the container.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountUrl(String storageAccountUrl) {
            $.storageAccountUrl = storageAccountUrl;
            return this;
        }

        public ListWebAppBackupStatusSecretsArgs build() {
            $.backupId = Objects.requireNonNull($.backupId, "expected parameter 'backupId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.storageAccountUrl = Objects.requireNonNull($.storageAccountUrl, "expected parameter 'storageAccountUrl' to be non-null");
            return $;
        }
    }

}
