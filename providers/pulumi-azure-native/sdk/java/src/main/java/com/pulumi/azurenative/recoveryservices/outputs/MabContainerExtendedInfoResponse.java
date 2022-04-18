// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MabContainerExtendedInfoResponse {
    /**
     * Type of backup items associated with this container.
     * 
     */
    private final @Nullable String backupItemType;
    /**
     * List of backup items associated with this container.
     * 
     */
    private final @Nullable List<String> backupItems;
    /**
     * Latest backup status of this container.
     * 
     */
    private final @Nullable String lastBackupStatus;
    /**
     * Time stamp when this container was refreshed.
     * 
     */
    private final @Nullable String lastRefreshedAt;
    /**
     * Backup policy associated with this container.
     * 
     */
    private final @Nullable String policyName;

    @CustomType.Constructor
    private MabContainerExtendedInfoResponse(
        @CustomType.Parameter("backupItemType") @Nullable String backupItemType,
        @CustomType.Parameter("backupItems") @Nullable List<String> backupItems,
        @CustomType.Parameter("lastBackupStatus") @Nullable String lastBackupStatus,
        @CustomType.Parameter("lastRefreshedAt") @Nullable String lastRefreshedAt,
        @CustomType.Parameter("policyName") @Nullable String policyName) {
        this.backupItemType = backupItemType;
        this.backupItems = backupItems;
        this.lastBackupStatus = lastBackupStatus;
        this.lastRefreshedAt = lastRefreshedAt;
        this.policyName = policyName;
    }

    /**
     * Type of backup items associated with this container.
     * 
    */
    public Optional<String> backupItemType() {
        return Optional.ofNullable(this.backupItemType);
    }
    /**
     * List of backup items associated with this container.
     * 
    */
    public List<String> backupItems() {
        return this.backupItems == null ? List.of() : this.backupItems;
    }
    /**
     * Latest backup status of this container.
     * 
    */
    public Optional<String> lastBackupStatus() {
        return Optional.ofNullable(this.lastBackupStatus);
    }
    /**
     * Time stamp when this container was refreshed.
     * 
    */
    public Optional<String> lastRefreshedAt() {
        return Optional.ofNullable(this.lastRefreshedAt);
    }
    /**
     * Backup policy associated with this container.
     * 
    */
    public Optional<String> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MabContainerExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupItemType;
        private @Nullable List<String> backupItems;
        private @Nullable String lastBackupStatus;
        private @Nullable String lastRefreshedAt;
        private @Nullable String policyName;

        public Builder() {
    	      // Empty
        }

        public Builder(MabContainerExtendedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupItemType = defaults.backupItemType;
    	      this.backupItems = defaults.backupItems;
    	      this.lastBackupStatus = defaults.lastBackupStatus;
    	      this.lastRefreshedAt = defaults.lastRefreshedAt;
    	      this.policyName = defaults.policyName;
        }

        public Builder backupItemType(@Nullable String backupItemType) {
            this.backupItemType = backupItemType;
            return this;
        }
        public Builder backupItems(@Nullable List<String> backupItems) {
            this.backupItems = backupItems;
            return this;
        }
        public Builder backupItems(String... backupItems) {
            return backupItems(List.of(backupItems));
        }
        public Builder lastBackupStatus(@Nullable String lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }
        public Builder lastRefreshedAt(@Nullable String lastRefreshedAt) {
            this.lastRefreshedAt = lastRefreshedAt;
            return this;
        }
        public Builder policyName(@Nullable String policyName) {
            this.policyName = policyName;
            return this;
        }        public MabContainerExtendedInfoResponse build() {
            return new MabContainerExtendedInfoResponse(backupItemType, backupItems, lastBackupStatus, lastRefreshedAt, policyName);
        }
    }
}
