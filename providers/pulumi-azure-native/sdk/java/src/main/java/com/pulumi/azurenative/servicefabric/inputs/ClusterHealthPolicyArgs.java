// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.azurenative.servicefabric.inputs.ApplicationHealthPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a health policy used to evaluate the health of the cluster or of a cluster node.
 * 
 */
public final class ClusterHealthPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterHealthPolicyArgs Empty = new ClusterHealthPolicyArgs();

    /**
     * Defines the application health policy map used to evaluate the health of an application or one of its children entities.
     * 
     */
    @Import(name="applicationHealthPolicies")
    private @Nullable Output<Map<String,ApplicationHealthPolicyArgs>> applicationHealthPolicies;

    public Optional<Output<Map<String,ApplicationHealthPolicyArgs>>> applicationHealthPolicies() {
        return Optional.ofNullable(this.applicationHealthPolicies);
    }

    /**
     * The maximum allowed percentage of unhealthy applications before reporting an error. For example, to allow 10% of applications to be unhealthy, this value would be 10.
     * 
     * The percentage represents the maximum tolerated percentage of applications that can be unhealthy before the cluster is considered in error.
     * If the percentage is respected but there is at least one unhealthy application, the health is evaluated as Warning.
     * This is calculated by dividing the number of unhealthy applications over the total number of application instances in the cluster, excluding applications of application types that are included in the ApplicationTypeHealthPolicyMap.
     * The computation rounds up to tolerate one failure on small numbers of applications. Default percentage is zero.
     * 
     */
    @Import(name="maxPercentUnhealthyApplications")
    private @Nullable Output<Integer> maxPercentUnhealthyApplications;

    public Optional<Output<Integer>> maxPercentUnhealthyApplications() {
        return Optional.ofNullable(this.maxPercentUnhealthyApplications);
    }

    /**
     * The maximum allowed percentage of unhealthy nodes before reporting an error. For example, to allow 10% of nodes to be unhealthy, this value would be 10.
     * 
     * The percentage represents the maximum tolerated percentage of nodes that can be unhealthy before the cluster is considered in error.
     * If the percentage is respected but there is at least one unhealthy node, the health is evaluated as Warning.
     * The percentage is calculated by dividing the number of unhealthy nodes over the total number of nodes in the cluster.
     * The computation rounds up to tolerate one failure on small numbers of nodes. Default percentage is zero.
     * 
     * In large clusters, some nodes will always be down or out for repairs, so this percentage should be configured to tolerate that.
     * 
     */
    @Import(name="maxPercentUnhealthyNodes")
    private @Nullable Output<Integer> maxPercentUnhealthyNodes;

    public Optional<Output<Integer>> maxPercentUnhealthyNodes() {
        return Optional.ofNullable(this.maxPercentUnhealthyNodes);
    }

    private ClusterHealthPolicyArgs() {}

    private ClusterHealthPolicyArgs(ClusterHealthPolicyArgs $) {
        this.applicationHealthPolicies = $.applicationHealthPolicies;
        this.maxPercentUnhealthyApplications = $.maxPercentUnhealthyApplications;
        this.maxPercentUnhealthyNodes = $.maxPercentUnhealthyNodes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterHealthPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterHealthPolicyArgs $;

        public Builder() {
            $ = new ClusterHealthPolicyArgs();
        }

        public Builder(ClusterHealthPolicyArgs defaults) {
            $ = new ClusterHealthPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationHealthPolicies(@Nullable Output<Map<String,ApplicationHealthPolicyArgs>> applicationHealthPolicies) {
            $.applicationHealthPolicies = applicationHealthPolicies;
            return this;
        }

        public Builder applicationHealthPolicies(Map<String,ApplicationHealthPolicyArgs> applicationHealthPolicies) {
            return applicationHealthPolicies(Output.of(applicationHealthPolicies));
        }

        public Builder maxPercentUnhealthyApplications(@Nullable Output<Integer> maxPercentUnhealthyApplications) {
            $.maxPercentUnhealthyApplications = maxPercentUnhealthyApplications;
            return this;
        }

        public Builder maxPercentUnhealthyApplications(Integer maxPercentUnhealthyApplications) {
            return maxPercentUnhealthyApplications(Output.of(maxPercentUnhealthyApplications));
        }

        public Builder maxPercentUnhealthyNodes(@Nullable Output<Integer> maxPercentUnhealthyNodes) {
            $.maxPercentUnhealthyNodes = maxPercentUnhealthyNodes;
            return this;
        }

        public Builder maxPercentUnhealthyNodes(Integer maxPercentUnhealthyNodes) {
            return maxPercentUnhealthyNodes(Output.of(maxPercentUnhealthyNodes));
        }

        public ClusterHealthPolicyArgs build() {
            $.maxPercentUnhealthyApplications = Codegen.integerProp("maxPercentUnhealthyApplications").output().arg($.maxPercentUnhealthyApplications).def(0).getNullable();
            $.maxPercentUnhealthyNodes = Codegen.integerProp("maxPercentUnhealthyNodes").output().arg($.maxPercentUnhealthyNodes).def(0).getNullable();
            return $;
        }
    }

}
