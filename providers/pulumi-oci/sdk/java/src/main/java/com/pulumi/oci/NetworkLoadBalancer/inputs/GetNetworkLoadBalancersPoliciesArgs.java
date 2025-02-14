// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.NetworkLoadBalancer.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.NetworkLoadBalancer.inputs.GetNetworkLoadBalancersPoliciesFilter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkLoadBalancersPoliciesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkLoadBalancersPoliciesArgs Empty = new GetNetworkLoadBalancersPoliciesArgs();

    @Import(name="filters")
    private @Nullable List<GetNetworkLoadBalancersPoliciesFilter> filters;

    public Optional<List<GetNetworkLoadBalancersPoliciesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetNetworkLoadBalancersPoliciesArgs() {}

    private GetNetworkLoadBalancersPoliciesArgs(GetNetworkLoadBalancersPoliciesArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkLoadBalancersPoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkLoadBalancersPoliciesArgs $;

        public Builder() {
            $ = new GetNetworkLoadBalancersPoliciesArgs();
        }

        public Builder(GetNetworkLoadBalancersPoliciesArgs defaults) {
            $ = new GetNetworkLoadBalancersPoliciesArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetNetworkLoadBalancersPoliciesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetNetworkLoadBalancersPoliciesFilter... filters) {
            return filters(List.of(filters));
        }

        public GetNetworkLoadBalancersPoliciesArgs build() {
            return $;
        }
    }

}
