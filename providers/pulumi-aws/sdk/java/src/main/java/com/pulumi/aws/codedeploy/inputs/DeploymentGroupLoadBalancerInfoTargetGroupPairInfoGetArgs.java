// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.inputs;

import com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteGetArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs Empty = new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs();

    /**
     * Configuration block for the production traffic route (documented below).
     * 
     */
    @Import(name="prodTrafficRoute", required=true)
    private Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteGetArgs> prodTrafficRoute;

    public Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteGetArgs> prodTrafficRoute() {
        return this.prodTrafficRoute;
    }

    /**
     * Configuration blocks for a target group within a target group pair (documented below).
     * 
     */
    @Import(name="targetGroups", required=true)
    private Output<List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs>> targetGroups;

    public Output<List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs>> targetGroups() {
        return this.targetGroups;
    }

    /**
     * Configuration block for the test traffic route (documented below).
     * 
     */
    @Import(name="testTrafficRoute")
    private @Nullable Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteGetArgs> testTrafficRoute;

    public Optional<Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteGetArgs>> testTrafficRoute() {
        return Optional.ofNullable(this.testTrafficRoute);
    }

    private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs() {}

    private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs $) {
        this.prodTrafficRoute = $.prodTrafficRoute;
        this.targetGroups = $.targetGroups;
        this.testTrafficRoute = $.testTrafficRoute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs $;

        public Builder() {
            $ = new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs();
        }

        public Builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs defaults) {
            $ = new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder prodTrafficRoute(Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteGetArgs> prodTrafficRoute) {
            $.prodTrafficRoute = prodTrafficRoute;
            return this;
        }

        public Builder prodTrafficRoute(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteGetArgs prodTrafficRoute) {
            return prodTrafficRoute(Output.of(prodTrafficRoute));
        }

        public Builder targetGroups(Output<List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs>> targetGroups) {
            $.targetGroups = targetGroups;
            return this;
        }

        public Builder targetGroups(List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs> targetGroups) {
            return targetGroups(Output.of(targetGroups));
        }

        public Builder targetGroups(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs... targetGroups) {
            return targetGroups(List.of(targetGroups));
        }

        public Builder testTrafficRoute(@Nullable Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteGetArgs> testTrafficRoute) {
            $.testTrafficRoute = testTrafficRoute;
            return this;
        }

        public Builder testTrafficRoute(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteGetArgs testTrafficRoute) {
            return testTrafficRoute(Output.of(testTrafficRoute));
        }

        public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs build() {
            $.prodTrafficRoute = Objects.requireNonNull($.prodTrafficRoute, "expected parameter 'prodTrafficRoute' to be non-null");
            $.targetGroups = Objects.requireNonNull($.targetGroups, "expected parameter 'targetGroups' to be non-null");
            return $;
        }
    }

}
