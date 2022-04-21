// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.azurenative.servicefabric.inputs.ApplicationDeltaHealthPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the delta health policies for the cluster upgrade.
 * 
 */
public final class ClusterUpgradeDeltaHealthPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterUpgradeDeltaHealthPolicyArgs Empty = new ClusterUpgradeDeltaHealthPolicyArgs();

    /**
     * Defines the application delta health policy map used to evaluate the health of an application or one of its child entities when upgrading the cluster.
     * 
     */
    @Import(name="applicationDeltaHealthPolicies")
    private @Nullable Output<Map<String,ApplicationDeltaHealthPolicyArgs>> applicationDeltaHealthPolicies;

    public Optional<Output<Map<String,ApplicationDeltaHealthPolicyArgs>>> applicationDeltaHealthPolicies() {
        return Optional.ofNullable(this.applicationDeltaHealthPolicies);
    }

    /**
     * The maximum allowed percentage of applications health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the applications at the beginning of upgrade and the state of the applications at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits. System services are not included in this.
     * 
     */
    @Import(name="maxPercentDeltaUnhealthyApplications", required=true)
    private Output<Integer> maxPercentDeltaUnhealthyApplications;

    public Output<Integer> maxPercentDeltaUnhealthyApplications() {
        return this.maxPercentDeltaUnhealthyApplications;
    }

    /**
     * The maximum allowed percentage of nodes health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the nodes at the beginning of upgrade and the state of the nodes at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits.
     * 
     */
    @Import(name="maxPercentDeltaUnhealthyNodes", required=true)
    private Output<Integer> maxPercentDeltaUnhealthyNodes;

    public Output<Integer> maxPercentDeltaUnhealthyNodes() {
        return this.maxPercentDeltaUnhealthyNodes;
    }

    /**
     * The maximum allowed percentage of upgrade domain nodes health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the upgrade domain nodes at the beginning of upgrade and the state of the upgrade domain nodes at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion for all completed upgrade domains to make sure the state of the upgrade domains is within tolerated limits.
     * 
     */
    @Import(name="maxPercentUpgradeDomainDeltaUnhealthyNodes", required=true)
    private Output<Integer> maxPercentUpgradeDomainDeltaUnhealthyNodes;

    public Output<Integer> maxPercentUpgradeDomainDeltaUnhealthyNodes() {
        return this.maxPercentUpgradeDomainDeltaUnhealthyNodes;
    }

    private ClusterUpgradeDeltaHealthPolicyArgs() {}

    private ClusterUpgradeDeltaHealthPolicyArgs(ClusterUpgradeDeltaHealthPolicyArgs $) {
        this.applicationDeltaHealthPolicies = $.applicationDeltaHealthPolicies;
        this.maxPercentDeltaUnhealthyApplications = $.maxPercentDeltaUnhealthyApplications;
        this.maxPercentDeltaUnhealthyNodes = $.maxPercentDeltaUnhealthyNodes;
        this.maxPercentUpgradeDomainDeltaUnhealthyNodes = $.maxPercentUpgradeDomainDeltaUnhealthyNodes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterUpgradeDeltaHealthPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterUpgradeDeltaHealthPolicyArgs $;

        public Builder() {
            $ = new ClusterUpgradeDeltaHealthPolicyArgs();
        }

        public Builder(ClusterUpgradeDeltaHealthPolicyArgs defaults) {
            $ = new ClusterUpgradeDeltaHealthPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationDeltaHealthPolicies(@Nullable Output<Map<String,ApplicationDeltaHealthPolicyArgs>> applicationDeltaHealthPolicies) {
            $.applicationDeltaHealthPolicies = applicationDeltaHealthPolicies;
            return this;
        }

        public Builder applicationDeltaHealthPolicies(Map<String,ApplicationDeltaHealthPolicyArgs> applicationDeltaHealthPolicies) {
            return applicationDeltaHealthPolicies(Output.of(applicationDeltaHealthPolicies));
        }

        public Builder maxPercentDeltaUnhealthyApplications(Output<Integer> maxPercentDeltaUnhealthyApplications) {
            $.maxPercentDeltaUnhealthyApplications = maxPercentDeltaUnhealthyApplications;
            return this;
        }

        public Builder maxPercentDeltaUnhealthyApplications(Integer maxPercentDeltaUnhealthyApplications) {
            return maxPercentDeltaUnhealthyApplications(Output.of(maxPercentDeltaUnhealthyApplications));
        }

        public Builder maxPercentDeltaUnhealthyNodes(Output<Integer> maxPercentDeltaUnhealthyNodes) {
            $.maxPercentDeltaUnhealthyNodes = maxPercentDeltaUnhealthyNodes;
            return this;
        }

        public Builder maxPercentDeltaUnhealthyNodes(Integer maxPercentDeltaUnhealthyNodes) {
            return maxPercentDeltaUnhealthyNodes(Output.of(maxPercentDeltaUnhealthyNodes));
        }

        public Builder maxPercentUpgradeDomainDeltaUnhealthyNodes(Output<Integer> maxPercentUpgradeDomainDeltaUnhealthyNodes) {
            $.maxPercentUpgradeDomainDeltaUnhealthyNodes = maxPercentUpgradeDomainDeltaUnhealthyNodes;
            return this;
        }

        public Builder maxPercentUpgradeDomainDeltaUnhealthyNodes(Integer maxPercentUpgradeDomainDeltaUnhealthyNodes) {
            return maxPercentUpgradeDomainDeltaUnhealthyNodes(Output.of(maxPercentUpgradeDomainDeltaUnhealthyNodes));
        }

        public ClusterUpgradeDeltaHealthPolicyArgs build() {
            $.maxPercentDeltaUnhealthyApplications = Objects.requireNonNull($.maxPercentDeltaUnhealthyApplications, "expected parameter 'maxPercentDeltaUnhealthyApplications' to be non-null");
            $.maxPercentDeltaUnhealthyNodes = Objects.requireNonNull($.maxPercentDeltaUnhealthyNodes, "expected parameter 'maxPercentDeltaUnhealthyNodes' to be non-null");
            $.maxPercentUpgradeDomainDeltaUnhealthyNodes = Objects.requireNonNull($.maxPercentUpgradeDomainDeltaUnhealthyNodes, "expected parameter 'maxPercentUpgradeDomainDeltaUnhealthyNodes' to be non-null");
            return $;
        }
    }

}
