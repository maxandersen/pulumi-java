// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp;

import com.pulumi.azurenative.netapp.inputs.VolumeBackupsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPolicyArgs extends ResourceArgs {

    public static final BackupPolicyArgs Empty = new BackupPolicyArgs();

    /**
     * The name of the NetApp account
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the NetApp account
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Backup policy Name which uniquely identify backup policy.
     * 
     */
    @Import(name="backupPolicyName")
    private @Nullable Output<String> backupPolicyName;

    /**
     * @return Backup policy Name which uniquely identify backup policy.
     * 
     */
    public Optional<Output<String>> backupPolicyName() {
        return Optional.ofNullable(this.backupPolicyName);
    }

    /**
     * Daily backups count to keep
     * 
     */
    @Import(name="dailyBackupsToKeep")
    private @Nullable Output<Integer> dailyBackupsToKeep;

    /**
     * @return Daily backups count to keep
     * 
     */
    public Optional<Output<Integer>> dailyBackupsToKeep() {
        return Optional.ofNullable(this.dailyBackupsToKeep);
    }

    /**
     * The property to decide policy is enabled or not
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return The property to decide policy is enabled or not
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Monthly backups count to keep
     * 
     */
    @Import(name="monthlyBackupsToKeep")
    private @Nullable Output<Integer> monthlyBackupsToKeep;

    /**
     * @return Monthly backups count to keep
     * 
     */
    public Optional<Output<Integer>> monthlyBackupsToKeep() {
        return Optional.ofNullable(this.monthlyBackupsToKeep);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A list of volumes assigned to this policy
     * 
     */
    @Import(name="volumeBackups")
    private @Nullable Output<List<VolumeBackupsArgs>> volumeBackups;

    /**
     * @return A list of volumes assigned to this policy
     * 
     */
    public Optional<Output<List<VolumeBackupsArgs>>> volumeBackups() {
        return Optional.ofNullable(this.volumeBackups);
    }

    /**
     * Volumes using current backup policy
     * 
     */
    @Import(name="volumesAssigned")
    private @Nullable Output<Integer> volumesAssigned;

    /**
     * @return Volumes using current backup policy
     * 
     */
    public Optional<Output<Integer>> volumesAssigned() {
        return Optional.ofNullable(this.volumesAssigned);
    }

    /**
     * Weekly backups count to keep
     * 
     */
    @Import(name="weeklyBackupsToKeep")
    private @Nullable Output<Integer> weeklyBackupsToKeep;

    /**
     * @return Weekly backups count to keep
     * 
     */
    public Optional<Output<Integer>> weeklyBackupsToKeep() {
        return Optional.ofNullable(this.weeklyBackupsToKeep);
    }

    /**
     * Yearly backups count to keep
     * 
     */
    @Import(name="yearlyBackupsToKeep")
    private @Nullable Output<Integer> yearlyBackupsToKeep;

    /**
     * @return Yearly backups count to keep
     * 
     */
    public Optional<Output<Integer>> yearlyBackupsToKeep() {
        return Optional.ofNullable(this.yearlyBackupsToKeep);
    }

    private BackupPolicyArgs() {}

    private BackupPolicyArgs(BackupPolicyArgs $) {
        this.accountName = $.accountName;
        this.backupPolicyName = $.backupPolicyName;
        this.dailyBackupsToKeep = $.dailyBackupsToKeep;
        this.enabled = $.enabled;
        this.location = $.location;
        this.monthlyBackupsToKeep = $.monthlyBackupsToKeep;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.volumeBackups = $.volumeBackups;
        this.volumesAssigned = $.volumesAssigned;
        this.weeklyBackupsToKeep = $.weeklyBackupsToKeep;
        this.yearlyBackupsToKeep = $.yearlyBackupsToKeep;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyArgs $;

        public Builder() {
            $ = new BackupPolicyArgs();
        }

        public Builder(BackupPolicyArgs defaults) {
            $ = new BackupPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the NetApp account
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the NetApp account
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param backupPolicyName Backup policy Name which uniquely identify backup policy.
         * 
         * @return builder
         * 
         */
        public Builder backupPolicyName(@Nullable Output<String> backupPolicyName) {
            $.backupPolicyName = backupPolicyName;
            return this;
        }

        /**
         * @param backupPolicyName Backup policy Name which uniquely identify backup policy.
         * 
         * @return builder
         * 
         */
        public Builder backupPolicyName(String backupPolicyName) {
            return backupPolicyName(Output.of(backupPolicyName));
        }

        /**
         * @param dailyBackupsToKeep Daily backups count to keep
         * 
         * @return builder
         * 
         */
        public Builder dailyBackupsToKeep(@Nullable Output<Integer> dailyBackupsToKeep) {
            $.dailyBackupsToKeep = dailyBackupsToKeep;
            return this;
        }

        /**
         * @param dailyBackupsToKeep Daily backups count to keep
         * 
         * @return builder
         * 
         */
        public Builder dailyBackupsToKeep(Integer dailyBackupsToKeep) {
            return dailyBackupsToKeep(Output.of(dailyBackupsToKeep));
        }

        /**
         * @param enabled The property to decide policy is enabled or not
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The property to decide policy is enabled or not
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param monthlyBackupsToKeep Monthly backups count to keep
         * 
         * @return builder
         * 
         */
        public Builder monthlyBackupsToKeep(@Nullable Output<Integer> monthlyBackupsToKeep) {
            $.monthlyBackupsToKeep = monthlyBackupsToKeep;
            return this;
        }

        /**
         * @param monthlyBackupsToKeep Monthly backups count to keep
         * 
         * @return builder
         * 
         */
        public Builder monthlyBackupsToKeep(Integer monthlyBackupsToKeep) {
            return monthlyBackupsToKeep(Output.of(monthlyBackupsToKeep));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param volumeBackups A list of volumes assigned to this policy
         * 
         * @return builder
         * 
         */
        public Builder volumeBackups(@Nullable Output<List<VolumeBackupsArgs>> volumeBackups) {
            $.volumeBackups = volumeBackups;
            return this;
        }

        /**
         * @param volumeBackups A list of volumes assigned to this policy
         * 
         * @return builder
         * 
         */
        public Builder volumeBackups(List<VolumeBackupsArgs> volumeBackups) {
            return volumeBackups(Output.of(volumeBackups));
        }

        /**
         * @param volumeBackups A list of volumes assigned to this policy
         * 
         * @return builder
         * 
         */
        public Builder volumeBackups(VolumeBackupsArgs... volumeBackups) {
            return volumeBackups(List.of(volumeBackups));
        }

        /**
         * @param volumesAssigned Volumes using current backup policy
         * 
         * @return builder
         * 
         */
        public Builder volumesAssigned(@Nullable Output<Integer> volumesAssigned) {
            $.volumesAssigned = volumesAssigned;
            return this;
        }

        /**
         * @param volumesAssigned Volumes using current backup policy
         * 
         * @return builder
         * 
         */
        public Builder volumesAssigned(Integer volumesAssigned) {
            return volumesAssigned(Output.of(volumesAssigned));
        }

        /**
         * @param weeklyBackupsToKeep Weekly backups count to keep
         * 
         * @return builder
         * 
         */
        public Builder weeklyBackupsToKeep(@Nullable Output<Integer> weeklyBackupsToKeep) {
            $.weeklyBackupsToKeep = weeklyBackupsToKeep;
            return this;
        }

        /**
         * @param weeklyBackupsToKeep Weekly backups count to keep
         * 
         * @return builder
         * 
         */
        public Builder weeklyBackupsToKeep(Integer weeklyBackupsToKeep) {
            return weeklyBackupsToKeep(Output.of(weeklyBackupsToKeep));
        }

        /**
         * @param yearlyBackupsToKeep Yearly backups count to keep
         * 
         * @return builder
         * 
         */
        public Builder yearlyBackupsToKeep(@Nullable Output<Integer> yearlyBackupsToKeep) {
            $.yearlyBackupsToKeep = yearlyBackupsToKeep;
            return this;
        }

        /**
         * @param yearlyBackupsToKeep Yearly backups count to keep
         * 
         * @return builder
         * 
         */
        public Builder yearlyBackupsToKeep(Integer yearlyBackupsToKeep) {
            return yearlyBackupsToKeep(Output.of(yearlyBackupsToKeep));
        }

        public BackupPolicyArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
