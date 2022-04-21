// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionGetArgs;
import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteMatchGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class GatewayRouteSpecGrpcRouteGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecGrpcRouteGetArgs Empty = new GatewayRouteSpecGrpcRouteGetArgs();

    /**
     * The action to take if a match is determined.
     * 
     */
    @Import(name="action", required=true)
    private Output<GatewayRouteSpecGrpcRouteActionGetArgs> action;

    public Output<GatewayRouteSpecGrpcRouteActionGetArgs> action() {
        return this.action;
    }

    /**
     * The criteria for determining a request match.
     * 
     */
    @Import(name="match", required=true)
    private Output<GatewayRouteSpecGrpcRouteMatchGetArgs> match;

    public Output<GatewayRouteSpecGrpcRouteMatchGetArgs> match() {
        return this.match;
    }

    private GatewayRouteSpecGrpcRouteGetArgs() {}

    private GatewayRouteSpecGrpcRouteGetArgs(GatewayRouteSpecGrpcRouteGetArgs $) {
        this.action = $.action;
        this.match = $.match;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRouteSpecGrpcRouteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecGrpcRouteGetArgs $;

        public Builder() {
            $ = new GatewayRouteSpecGrpcRouteGetArgs();
        }

        public Builder(GatewayRouteSpecGrpcRouteGetArgs defaults) {
            $ = new GatewayRouteSpecGrpcRouteGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(Output<GatewayRouteSpecGrpcRouteActionGetArgs> action) {
            $.action = action;
            return this;
        }

        public Builder action(GatewayRouteSpecGrpcRouteActionGetArgs action) {
            return action(Output.of(action));
        }

        public Builder match(Output<GatewayRouteSpecGrpcRouteMatchGetArgs> match) {
            $.match = match;
            return this;
        }

        public Builder match(GatewayRouteSpecGrpcRouteMatchGetArgs match) {
            return match(Output.of(match));
        }

        public GatewayRouteSpecGrpcRouteGetArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.match = Objects.requireNonNull($.match, "expected parameter 'match' to be non-null");
            return $;
        }
    }

}
