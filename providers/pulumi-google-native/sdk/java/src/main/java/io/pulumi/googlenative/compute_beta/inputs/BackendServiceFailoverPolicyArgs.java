// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). On failover or failback, this field indicates whether connection draining will be honored. Google Cloud has a fixed connection draining timeout of 10 minutes. A setting of true terminates existing TCP connections to the active pool during failover and failback, immediately draining traffic. A setting of false allows existing TCP connections to persist, even on VMs no longer in the active pool, for up to the duration of the connection draining timeout (10 minutes).
 * 
 */
public final class BackendServiceFailoverPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceFailoverPolicyArgs Empty = new BackendServiceFailoverPolicyArgs();

    /**
     * This can be set to true only if the protocol is TCP. The default is false.
     * 
     */
    @Import(name="disableConnectionDrainOnFailover")
      private final @Nullable Output<Boolean> disableConnectionDrainOnFailover;

    public Output<Boolean> disableConnectionDrainOnFailover() {
        return this.disableConnectionDrainOnFailover == null ? Codegen.empty() : this.disableConnectionDrainOnFailover;
    }

    /**
     * If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
     * 
     */
    @Import(name="dropTrafficIfUnhealthy")
      private final @Nullable Output<Boolean> dropTrafficIfUnhealthy;

    public Output<Boolean> dropTrafficIfUnhealthy() {
        return this.dropTrafficIfUnhealthy == null ? Codegen.empty() : this.dropTrafficIfUnhealthy;
    }

    /**
     * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
     * 
     */
    @Import(name="failoverRatio")
      private final @Nullable Output<Double> failoverRatio;

    public Output<Double> failoverRatio() {
        return this.failoverRatio == null ? Codegen.empty() : this.failoverRatio;
    }

    public BackendServiceFailoverPolicyArgs(
        @Nullable Output<Boolean> disableConnectionDrainOnFailover,
        @Nullable Output<Boolean> dropTrafficIfUnhealthy,
        @Nullable Output<Double> failoverRatio) {
        this.disableConnectionDrainOnFailover = disableConnectionDrainOnFailover;
        this.dropTrafficIfUnhealthy = dropTrafficIfUnhealthy;
        this.failoverRatio = failoverRatio;
    }

    private BackendServiceFailoverPolicyArgs() {
        this.disableConnectionDrainOnFailover = Codegen.empty();
        this.dropTrafficIfUnhealthy = Codegen.empty();
        this.failoverRatio = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceFailoverPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disableConnectionDrainOnFailover;
        private @Nullable Output<Boolean> dropTrafficIfUnhealthy;
        private @Nullable Output<Double> failoverRatio;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceFailoverPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableConnectionDrainOnFailover = defaults.disableConnectionDrainOnFailover;
    	      this.dropTrafficIfUnhealthy = defaults.dropTrafficIfUnhealthy;
    	      this.failoverRatio = defaults.failoverRatio;
        }

        public Builder disableConnectionDrainOnFailover(@Nullable Output<Boolean> disableConnectionDrainOnFailover) {
            this.disableConnectionDrainOnFailover = disableConnectionDrainOnFailover;
            return this;
        }
        public Builder disableConnectionDrainOnFailover(@Nullable Boolean disableConnectionDrainOnFailover) {
            this.disableConnectionDrainOnFailover = Codegen.ofNullable(disableConnectionDrainOnFailover);
            return this;
        }
        public Builder dropTrafficIfUnhealthy(@Nullable Output<Boolean> dropTrafficIfUnhealthy) {
            this.dropTrafficIfUnhealthy = dropTrafficIfUnhealthy;
            return this;
        }
        public Builder dropTrafficIfUnhealthy(@Nullable Boolean dropTrafficIfUnhealthy) {
            this.dropTrafficIfUnhealthy = Codegen.ofNullable(dropTrafficIfUnhealthy);
            return this;
        }
        public Builder failoverRatio(@Nullable Output<Double> failoverRatio) {
            this.failoverRatio = failoverRatio;
            return this;
        }
        public Builder failoverRatio(@Nullable Double failoverRatio) {
            this.failoverRatio = Codegen.ofNullable(failoverRatio);
            return this;
        }        public BackendServiceFailoverPolicyArgs build() {
            return new BackendServiceFailoverPolicyArgs(disableConnectionDrainOnFailover, dropTrafficIfUnhealthy, failoverRatio);
        }
    }
}
