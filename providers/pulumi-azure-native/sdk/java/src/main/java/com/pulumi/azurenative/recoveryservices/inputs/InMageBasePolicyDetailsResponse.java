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
 * Base class for the policies of providers using InMage replication.
 * 
 */
public final class InMageBasePolicyDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final InMageBasePolicyDetailsResponse Empty = new InMageBasePolicyDetailsResponse();

    /**
     * The app consistent snapshot frequency in minutes.
     * 
     */
    @Import(name="appConsistentFrequencyInMinutes")
      private final @Nullable Integer appConsistentFrequencyInMinutes;

    public Optional<Integer> appConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes == null ? Optional.empty() : Optional.ofNullable(this.appConsistentFrequencyInMinutes);
    }

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'InMageBasePolicyDetails'.
     * 
     */
    @Import(name="instanceType", required=true)
      private final String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    /**
     * A value indicating whether multi-VM sync has to be enabled.
     * 
     */
    @Import(name="multiVmSyncStatus")
      private final @Nullable String multiVmSyncStatus;

    public Optional<String> multiVmSyncStatus() {
        return this.multiVmSyncStatus == null ? Optional.empty() : Optional.ofNullable(this.multiVmSyncStatus);
    }

    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
     */
    @Import(name="recoveryPointHistory")
      private final @Nullable Integer recoveryPointHistory;

    public Optional<Integer> recoveryPointHistory() {
        return this.recoveryPointHistory == null ? Optional.empty() : Optional.ofNullable(this.recoveryPointHistory);
    }

    /**
     * The recovery point threshold in minutes.
     * 
     */
    @Import(name="recoveryPointThresholdInMinutes")
      private final @Nullable Integer recoveryPointThresholdInMinutes;

    public Optional<Integer> recoveryPointThresholdInMinutes() {
        return this.recoveryPointThresholdInMinutes == null ? Optional.empty() : Optional.ofNullable(this.recoveryPointThresholdInMinutes);
    }

    public InMageBasePolicyDetailsResponse(
        @Nullable Integer appConsistentFrequencyInMinutes,
        String instanceType,
        @Nullable String multiVmSyncStatus,
        @Nullable Integer recoveryPointHistory,
        @Nullable Integer recoveryPointThresholdInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.multiVmSyncStatus = multiVmSyncStatus;
        this.recoveryPointHistory = recoveryPointHistory;
        this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
    }

    private InMageBasePolicyDetailsResponse() {
        this.appConsistentFrequencyInMinutes = null;
        this.instanceType = null;
        this.multiVmSyncStatus = null;
        this.recoveryPointHistory = null;
        this.recoveryPointThresholdInMinutes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageBasePolicyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer appConsistentFrequencyInMinutes;
        private String instanceType;
        private @Nullable String multiVmSyncStatus;
        private @Nullable Integer recoveryPointHistory;
        private @Nullable Integer recoveryPointThresholdInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageBasePolicyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appConsistentFrequencyInMinutes = defaults.appConsistentFrequencyInMinutes;
    	      this.instanceType = defaults.instanceType;
    	      this.multiVmSyncStatus = defaults.multiVmSyncStatus;
    	      this.recoveryPointHistory = defaults.recoveryPointHistory;
    	      this.recoveryPointThresholdInMinutes = defaults.recoveryPointThresholdInMinutes;
        }

        public Builder appConsistentFrequencyInMinutes(@Nullable Integer appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder multiVmSyncStatus(@Nullable String multiVmSyncStatus) {
            this.multiVmSyncStatus = multiVmSyncStatus;
            return this;
        }
        public Builder recoveryPointHistory(@Nullable Integer recoveryPointHistory) {
            this.recoveryPointHistory = recoveryPointHistory;
            return this;
        }
        public Builder recoveryPointThresholdInMinutes(@Nullable Integer recoveryPointThresholdInMinutes) {
            this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
            return this;
        }        public InMageBasePolicyDetailsResponse build() {
            return new InMageBasePolicyDetailsResponse(appConsistentFrequencyInMinutes, instanceType, multiVmSyncStatus, recoveryPointHistory, recoveryPointThresholdInMinutes);
        }
    }
}
