// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.coordination.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LeaseSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final LeaseSpecArgs Empty = new LeaseSpecArgs();

    @InputImport(name="acquireTime")
    private final @Nullable Input<String> acquireTime;

    public Input<String> getAcquireTime() {
        return this.acquireTime == null ? Input.empty() : this.acquireTime;
    }

    @InputImport(name="holderIdentity")
    private final @Nullable Input<String> holderIdentity;

    public Input<String> getHolderIdentity() {
        return this.holderIdentity == null ? Input.empty() : this.holderIdentity;
    }

    @InputImport(name="leaseDurationSeconds")
    private final @Nullable Input<Integer> leaseDurationSeconds;

    public Input<Integer> getLeaseDurationSeconds() {
        return this.leaseDurationSeconds == null ? Input.empty() : this.leaseDurationSeconds;
    }

    @InputImport(name="leaseTransitions")
    private final @Nullable Input<Integer> leaseTransitions;

    public Input<Integer> getLeaseTransitions() {
        return this.leaseTransitions == null ? Input.empty() : this.leaseTransitions;
    }

    @InputImport(name="renewTime")
    private final @Nullable Input<String> renewTime;

    public Input<String> getRenewTime() {
        return this.renewTime == null ? Input.empty() : this.renewTime;
    }

    public LeaseSpecArgs(
        @Nullable Input<String> acquireTime,
        @Nullable Input<String> holderIdentity,
        @Nullable Input<Integer> leaseDurationSeconds,
        @Nullable Input<Integer> leaseTransitions,
        @Nullable Input<String> renewTime) {
        this.acquireTime = acquireTime;
        this.holderIdentity = holderIdentity;
        this.leaseDurationSeconds = leaseDurationSeconds;
        this.leaseTransitions = leaseTransitions;
        this.renewTime = renewTime;
    }

    private LeaseSpecArgs() {
        this.acquireTime = Input.empty();
        this.holderIdentity = Input.empty();
        this.leaseDurationSeconds = Input.empty();
        this.leaseTransitions = Input.empty();
        this.renewTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LeaseSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> acquireTime;
        private @Nullable Input<String> holderIdentity;
        private @Nullable Input<Integer> leaseDurationSeconds;
        private @Nullable Input<Integer> leaseTransitions;
        private @Nullable Input<String> renewTime;

        public Builder() {
    	      // Empty
        }

        public Builder(LeaseSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acquireTime = defaults.acquireTime;
    	      this.holderIdentity = defaults.holderIdentity;
    	      this.leaseDurationSeconds = defaults.leaseDurationSeconds;
    	      this.leaseTransitions = defaults.leaseTransitions;
    	      this.renewTime = defaults.renewTime;
        }

        public Builder setAcquireTime(@Nullable Input<String> acquireTime) {
            this.acquireTime = acquireTime;
            return this;
        }

        public Builder setAcquireTime(@Nullable String acquireTime) {
            this.acquireTime = Input.ofNullable(acquireTime);
            return this;
        }

        public Builder setHolderIdentity(@Nullable Input<String> holderIdentity) {
            this.holderIdentity = holderIdentity;
            return this;
        }

        public Builder setHolderIdentity(@Nullable String holderIdentity) {
            this.holderIdentity = Input.ofNullable(holderIdentity);
            return this;
        }

        public Builder setLeaseDurationSeconds(@Nullable Input<Integer> leaseDurationSeconds) {
            this.leaseDurationSeconds = leaseDurationSeconds;
            return this;
        }

        public Builder setLeaseDurationSeconds(@Nullable Integer leaseDurationSeconds) {
            this.leaseDurationSeconds = Input.ofNullable(leaseDurationSeconds);
            return this;
        }

        public Builder setLeaseTransitions(@Nullable Input<Integer> leaseTransitions) {
            this.leaseTransitions = leaseTransitions;
            return this;
        }

        public Builder setLeaseTransitions(@Nullable Integer leaseTransitions) {
            this.leaseTransitions = Input.ofNullable(leaseTransitions);
            return this;
        }

        public Builder setRenewTime(@Nullable Input<String> renewTime) {
            this.renewTime = renewTime;
            return this;
        }

        public Builder setRenewTime(@Nullable String renewTime) {
            this.renewTime = Input.ofNullable(renewTime);
            return this;
        }

        public LeaseSpecArgs build() {
            return new LeaseSpecArgs(acquireTime, holderIdentity, leaseDurationSeconds, leaseTransitions, renewTime);
        }
    }
}
