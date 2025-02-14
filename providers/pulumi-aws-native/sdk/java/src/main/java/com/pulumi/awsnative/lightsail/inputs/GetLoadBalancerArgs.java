// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLoadBalancerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerArgs Empty = new GetLoadBalancerArgs();

    /**
     * The name of your load balancer.
     * 
     */
    @Import(name="loadBalancerName", required=true)
    private String loadBalancerName;

    /**
     * @return The name of your load balancer.
     * 
     */
    public String loadBalancerName() {
        return this.loadBalancerName;
    }

    private GetLoadBalancerArgs() {}

    private GetLoadBalancerArgs(GetLoadBalancerArgs $) {
        this.loadBalancerName = $.loadBalancerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerArgs $;

        public Builder() {
            $ = new GetLoadBalancerArgs();
        }

        public Builder(GetLoadBalancerArgs defaults) {
            $ = new GetLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param loadBalancerName The name of your load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(String loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        public GetLoadBalancerArgs build() {
            $.loadBalancerName = Objects.requireNonNull($.loadBalancerName, "expected parameter 'loadBalancerName' to be non-null");
            return $;
        }
    }

}
