// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Desired managed outbound IPs for the cluster load balancer.
 * 
 */
public final class ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs Empty = new ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs();

    /**
     * Desired number of outbound IP created/managed by Azure for the cluster load balancer. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
     * 
     */
    @Import(name="count")
      private final @Nullable Output<Integer> count;

    public Output<Integer> count() {
        return this.count == null ? Codegen.empty() : this.count;
    }

    public ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs(@Nullable Output<Integer> count) {
        this.count = count == null ? Codegen.ofNullable(1) : count;
    }

    private ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs() {
        this.count = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> count;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        public Builder count(@Nullable Output<Integer> count) {
            this.count = count;
            return this;
        }
        public Builder count(@Nullable Integer count) {
            this.count = Codegen.ofNullable(count);
            return this;
        }        public ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs build() {
            return new ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs(count);
        }
    }
}
