// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.inputs.BackupScheduleArgs;
import com.pulumi.azurenative.web.inputs.DatabaseBackupSettingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppBackupConfigurationSlotArgs extends ResourceArgs {

    public static final WebAppBackupConfigurationSlotArgs Empty = new WebAppBackupConfigurationSlotArgs();

    /**
     * Name of the backup.
     * 
     */
    @Import(name="backupName")
    private @Nullable Output<String> backupName;

    /**
     * @return Name of the backup.
     * 
     */
    public Optional<Output<String>> backupName() {
        return Optional.ofNullable(this.backupName);
    }

    /**
     * Schedule for the backup if it is executed periodically.
     * 
     */
    @Import(name="backupSchedule")
    private @Nullable Output<BackupScheduleArgs> backupSchedule;

    /**
     * @return Schedule for the backup if it is executed periodically.
     * 
     */
    public Optional<Output<BackupScheduleArgs>> backupSchedule() {
        return Optional.ofNullable(this.backupSchedule);
    }

    /**
     * Databases included in the backup.
     * 
     */
    @Import(name="databases")
    private @Nullable Output<List<DatabaseBackupSettingArgs>> databases;

    /**
     * @return Databases included in the backup.
     * 
     */
    public Optional<Output<List<DatabaseBackupSettingArgs>>> databases() {
        return Optional.ofNullable(this.databases);
    }

    /**
     * True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will update the backup configuration for the production slot.
     * 
     */
    @Import(name="slot", required=true)
    private Output<String> slot;

    /**
     * @return Name of the deployment slot. If a slot is not specified, the API will update the backup configuration for the production slot.
     * 
     */
    public Output<String> slot() {
        return this.slot;
    }

    /**
     * SAS URL to the container.
     * 
     */
    @Import(name="storageAccountUrl", required=true)
    private Output<String> storageAccountUrl;

    /**
     * @return SAS URL to the container.
     * 
     */
    public Output<String> storageAccountUrl() {
        return this.storageAccountUrl;
    }

    private WebAppBackupConfigurationSlotArgs() {}

    private WebAppBackupConfigurationSlotArgs(WebAppBackupConfigurationSlotArgs $) {
        this.backupName = $.backupName;
        this.backupSchedule = $.backupSchedule;
        this.databases = $.databases;
        this.enabled = $.enabled;
        this.kind = $.kind;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.slot = $.slot;
        this.storageAccountUrl = $.storageAccountUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppBackupConfigurationSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppBackupConfigurationSlotArgs $;

        public Builder() {
            $ = new WebAppBackupConfigurationSlotArgs();
        }

        public Builder(WebAppBackupConfigurationSlotArgs defaults) {
            $ = new WebAppBackupConfigurationSlotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupName Name of the backup.
         * 
         * @return builder
         * 
         */
        public Builder backupName(@Nullable Output<String> backupName) {
            $.backupName = backupName;
            return this;
        }

        /**
         * @param backupName Name of the backup.
         * 
         * @return builder
         * 
         */
        public Builder backupName(String backupName) {
            return backupName(Output.of(backupName));
        }

        /**
         * @param backupSchedule Schedule for the backup if it is executed periodically.
         * 
         * @return builder
         * 
         */
        public Builder backupSchedule(@Nullable Output<BackupScheduleArgs> backupSchedule) {
            $.backupSchedule = backupSchedule;
            return this;
        }

        /**
         * @param backupSchedule Schedule for the backup if it is executed periodically.
         * 
         * @return builder
         * 
         */
        public Builder backupSchedule(BackupScheduleArgs backupSchedule) {
            return backupSchedule(Output.of(backupSchedule));
        }

        /**
         * @param databases Databases included in the backup.
         * 
         * @return builder
         * 
         */
        public Builder databases(@Nullable Output<List<DatabaseBackupSettingArgs>> databases) {
            $.databases = databases;
            return this;
        }

        /**
         * @param databases Databases included in the backup.
         * 
         * @return builder
         * 
         */
        public Builder databases(List<DatabaseBackupSettingArgs> databases) {
            return databases(Output.of(databases));
        }

        /**
         * @param databases Databases included in the backup.
         * 
         * @return builder
         * 
         */
        public Builder databases(DatabaseBackupSettingArgs... databases) {
            return databases(List.of(databases));
        }

        /**
         * @param enabled True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param slot Name of the deployment slot. If a slot is not specified, the API will update the backup configuration for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(Output<String> slot) {
            $.slot = slot;
            return this;
        }

        /**
         * @param slot Name of the deployment slot. If a slot is not specified, the API will update the backup configuration for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(String slot) {
            return slot(Output.of(slot));
        }

        /**
         * @param storageAccountUrl SAS URL to the container.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountUrl(Output<String> storageAccountUrl) {
            $.storageAccountUrl = storageAccountUrl;
            return this;
        }

        /**
         * @param storageAccountUrl SAS URL to the container.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountUrl(String storageAccountUrl) {
            return storageAccountUrl(Output.of(storageAccountUrl));
        }

        public WebAppBackupConfigurationSlotArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            $.storageAccountUrl = Objects.requireNonNull($.storageAccountUrl, "expected parameter 'storageAccountUrl' to be non-null");
            return $;
        }
    }

}
