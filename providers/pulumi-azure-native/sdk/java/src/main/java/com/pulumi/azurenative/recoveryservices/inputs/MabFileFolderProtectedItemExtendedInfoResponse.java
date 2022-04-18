// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional information on the backed up item.
 * 
 */
public final class MabFileFolderProtectedItemExtendedInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final MabFileFolderProtectedItemExtendedInfoResponse Empty = new MabFileFolderProtectedItemExtendedInfoResponse();

    /**
     * Last time when the agent data synced to service.
     * 
     */
    @Import(name="lastRefreshedAt")
      private final @Nullable String lastRefreshedAt;

    public Optional<String> lastRefreshedAt() {
        return this.lastRefreshedAt == null ? Optional.empty() : Optional.ofNullable(this.lastRefreshedAt);
    }

    /**
     * The oldest backup copy available.
     * 
     */
    @Import(name="oldestRecoveryPoint")
      private final @Nullable String oldestRecoveryPoint;

    public Optional<String> oldestRecoveryPoint() {
        return this.oldestRecoveryPoint == null ? Optional.empty() : Optional.ofNullable(this.oldestRecoveryPoint);
    }

    /**
     * Number of backup copies associated with the backup item.
     * 
     */
    @Import(name="recoveryPointCount")
      private final @Nullable Integer recoveryPointCount;

    public Optional<Integer> recoveryPointCount() {
        return this.recoveryPointCount == null ? Optional.empty() : Optional.ofNullable(this.recoveryPointCount);
    }

    public MabFileFolderProtectedItemExtendedInfoResponse(
        @Nullable String lastRefreshedAt,
        @Nullable String oldestRecoveryPoint,
        @Nullable Integer recoveryPointCount) {
        this.lastRefreshedAt = lastRefreshedAt;
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.recoveryPointCount = recoveryPointCount;
    }

    private MabFileFolderProtectedItemExtendedInfoResponse() {
        this.lastRefreshedAt = null;
        this.oldestRecoveryPoint = null;
        this.recoveryPointCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MabFileFolderProtectedItemExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastRefreshedAt;
        private @Nullable String oldestRecoveryPoint;
        private @Nullable Integer recoveryPointCount;

        public Builder() {
    	      // Empty
        }

        public Builder(MabFileFolderProtectedItemExtendedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastRefreshedAt = defaults.lastRefreshedAt;
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
        }

        public Builder lastRefreshedAt(@Nullable String lastRefreshedAt) {
            this.lastRefreshedAt = lastRefreshedAt;
            return this;
        }
        public Builder oldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }
        public Builder recoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }        public MabFileFolderProtectedItemExtendedInfoResponse build() {
            return new MabFileFolderProtectedItemExtendedInfoResponse(lastRefreshedAt, oldestRecoveryPoint, recoveryPointCount);
        }
    }
}
