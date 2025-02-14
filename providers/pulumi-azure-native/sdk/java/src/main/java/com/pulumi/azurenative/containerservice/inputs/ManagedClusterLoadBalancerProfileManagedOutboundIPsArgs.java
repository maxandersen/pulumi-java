// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Desired managed outbound IPs for the cluster load balancer.
 * 
 */
public final class ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs Empty = new ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs();

    /**
     * Desired number of outbound IP created/managed by Azure for the cluster load balancer. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return Desired number of outbound IP created/managed by Azure for the cluster load balancer. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    private ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs() {}

    private ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs(ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs $) {
        this.count = $.count;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs $;

        public Builder() {
            $ = new ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs();
        }

        public Builder(ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs defaults) {
            $ = new ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count Desired number of outbound IP created/managed by Azure for the cluster load balancer. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count Desired number of outbound IP created/managed by Azure for the cluster load balancer. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs build() {
            $.count = Codegen.integerProp("count").output().arg($.count).def(1).getNullable();
            return $;
        }
    }

}
