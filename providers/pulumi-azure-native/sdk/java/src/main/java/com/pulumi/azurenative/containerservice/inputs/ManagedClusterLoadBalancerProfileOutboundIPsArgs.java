// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.azurenative.containerservice.inputs.ResourceReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Desired outbound IP resources for the cluster load balancer.
 * 
 */
public final class ManagedClusterLoadBalancerProfileOutboundIPsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedClusterLoadBalancerProfileOutboundIPsArgs Empty = new ManagedClusterLoadBalancerProfileOutboundIPsArgs();

    /**
     * A list of public IP resources.
     * 
     */
    @Import(name="publicIPs")
    private @Nullable Output<List<ResourceReferenceArgs>> publicIPs;

    public Optional<Output<List<ResourceReferenceArgs>>> publicIPs() {
        return Optional.ofNullable(this.publicIPs);
    }

    private ManagedClusterLoadBalancerProfileOutboundIPsArgs() {}

    private ManagedClusterLoadBalancerProfileOutboundIPsArgs(ManagedClusterLoadBalancerProfileOutboundIPsArgs $) {
        this.publicIPs = $.publicIPs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedClusterLoadBalancerProfileOutboundIPsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterLoadBalancerProfileOutboundIPsArgs $;

        public Builder() {
            $ = new ManagedClusterLoadBalancerProfileOutboundIPsArgs();
        }

        public Builder(ManagedClusterLoadBalancerProfileOutboundIPsArgs defaults) {
            $ = new ManagedClusterLoadBalancerProfileOutboundIPsArgs(Objects.requireNonNull(defaults));
        }

        public Builder publicIPs(@Nullable Output<List<ResourceReferenceArgs>> publicIPs) {
            $.publicIPs = publicIPs;
            return this;
        }

        public Builder publicIPs(List<ResourceReferenceArgs> publicIPs) {
            return publicIPs(Output.of(publicIPs));
        }

        public Builder publicIPs(ResourceReferenceArgs... publicIPs) {
            return publicIPs(List.of(publicIPs));
        }

        public ManagedClusterLoadBalancerProfileOutboundIPsArgs build() {
            return $;
        }
    }

}
