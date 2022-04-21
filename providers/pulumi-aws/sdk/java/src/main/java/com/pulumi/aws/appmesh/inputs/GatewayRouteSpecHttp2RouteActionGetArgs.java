// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionTargetGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class GatewayRouteSpecHttp2RouteActionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttp2RouteActionGetArgs Empty = new GatewayRouteSpecHttp2RouteActionGetArgs();

    /**
     * The target that traffic is routed to when a request matches the gateway route.
     * 
     */
    @Import(name="target", required=true)
    private Output<GatewayRouteSpecHttp2RouteActionTargetGetArgs> target;

    public Output<GatewayRouteSpecHttp2RouteActionTargetGetArgs> target() {
        return this.target;
    }

    private GatewayRouteSpecHttp2RouteActionGetArgs() {}

    private GatewayRouteSpecHttp2RouteActionGetArgs(GatewayRouteSpecHttp2RouteActionGetArgs $) {
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRouteSpecHttp2RouteActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecHttp2RouteActionGetArgs $;

        public Builder() {
            $ = new GatewayRouteSpecHttp2RouteActionGetArgs();
        }

        public Builder(GatewayRouteSpecHttp2RouteActionGetArgs defaults) {
            $ = new GatewayRouteSpecHttp2RouteActionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder target(Output<GatewayRouteSpecHttp2RouteActionTargetGetArgs> target) {
            $.target = target;
            return this;
        }

        public Builder target(GatewayRouteSpecHttp2RouteActionTargetGetArgs target) {
            return target(Output.of(target));
        }

        public GatewayRouteSpecHttp2RouteActionGetArgs build() {
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}
