// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A2A specific policy details.
 * 
 */
public final class A2APolicyDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final A2APolicyDetailsResponse Empty = new A2APolicyDetailsResponse();

    /**
     * The app consistent snapshot frequency in minutes.
     * 
     */
    @Import(name="appConsistentFrequencyInMinutes")
    private @Nullable Integer appConsistentFrequencyInMinutes;

    public Optional<Integer> appConsistentFrequencyInMinutes() {
        return Optional.ofNullable(this.appConsistentFrequencyInMinutes);
    }

    /**
     * The crash consistent snapshot frequency in minutes.
     * 
     */
    @Import(name="crashConsistentFrequencyInMinutes")
    private @Nullable Integer crashConsistentFrequencyInMinutes;

    public Optional<Integer> crashConsistentFrequencyInMinutes() {
        return Optional.ofNullable(this.crashConsistentFrequencyInMinutes);
    }

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is &#39;A2A&#39;.
     * 
     */
    @Import(name="instanceType", required=true)
    private String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    /**
     * A value indicating whether multi-VM sync has to be enabled.
     * 
     */
    @Import(name="multiVmSyncStatus")
    private @Nullable String multiVmSyncStatus;

    public Optional<String> multiVmSyncStatus() {
        return Optional.ofNullable(this.multiVmSyncStatus);
    }

    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
     */
    @Import(name="recoveryPointHistory")
    private @Nullable Integer recoveryPointHistory;

    public Optional<Integer> recoveryPointHistory() {
        return Optional.ofNullable(this.recoveryPointHistory);
    }

    /**
     * The recovery point threshold in minutes.
     * 
     */
    @Import(name="recoveryPointThresholdInMinutes")
    private @Nullable Integer recoveryPointThresholdInMinutes;

    public Optional<Integer> recoveryPointThresholdInMinutes() {
        return Optional.ofNullable(this.recoveryPointThresholdInMinutes);
    }

    private A2APolicyDetailsResponse() {}

    private A2APolicyDetailsResponse(A2APolicyDetailsResponse $) {
        this.appConsistentFrequencyInMinutes = $.appConsistentFrequencyInMinutes;
        this.crashConsistentFrequencyInMinutes = $.crashConsistentFrequencyInMinutes;
        this.instanceType = $.instanceType;
        this.multiVmSyncStatus = $.multiVmSyncStatus;
        this.recoveryPointHistory = $.recoveryPointHistory;
        this.recoveryPointThresholdInMinutes = $.recoveryPointThresholdInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(A2APolicyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private A2APolicyDetailsResponse $;

        public Builder() {
            $ = new A2APolicyDetailsResponse();
        }

        public Builder(A2APolicyDetailsResponse defaults) {
            $ = new A2APolicyDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder appConsistentFrequencyInMinutes(@Nullable Integer appConsistentFrequencyInMinutes) {
            $.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
            return this;
        }

        public Builder crashConsistentFrequencyInMinutes(@Nullable Integer crashConsistentFrequencyInMinutes) {
            $.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
            return this;
        }

        public Builder instanceType(String instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder multiVmSyncStatus(@Nullable String multiVmSyncStatus) {
            $.multiVmSyncStatus = multiVmSyncStatus;
            return this;
        }

        public Builder recoveryPointHistory(@Nullable Integer recoveryPointHistory) {
            $.recoveryPointHistory = recoveryPointHistory;
            return this;
        }

        public Builder recoveryPointThresholdInMinutes(@Nullable Integer recoveryPointThresholdInMinutes) {
            $.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
            return this;
        }

        public A2APolicyDetailsResponse build() {
            $.instanceType = Codegen.stringProp("instanceType").arg($.instanceType).require();
            return $;
        }
    }

}
