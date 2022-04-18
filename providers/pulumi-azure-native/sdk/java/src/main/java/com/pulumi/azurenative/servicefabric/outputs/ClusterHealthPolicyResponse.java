// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.outputs;

import com.pulumi.azurenative.servicefabric.outputs.ApplicationHealthPolicyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterHealthPolicyResponse {
    /**
     * Defines the application health policy map used to evaluate the health of an application or one of its children entities.
     * 
     */
    private final @Nullable Map<String,ApplicationHealthPolicyResponse> applicationHealthPolicies;
    /**
     * The maximum allowed percentage of unhealthy applications before reporting an error. For example, to allow 10% of applications to be unhealthy, this value would be 10.
     * 
     * The percentage represents the maximum tolerated percentage of applications that can be unhealthy before the cluster is considered in error.
     * If the percentage is respected but there is at least one unhealthy application, the health is evaluated as Warning.
     * This is calculated by dividing the number of unhealthy applications over the total number of application instances in the cluster, excluding applications of application types that are included in the ApplicationTypeHealthPolicyMap.
     * The computation rounds up to tolerate one failure on small numbers of applications. Default percentage is zero.
     * 
     */
    private final @Nullable Integer maxPercentUnhealthyApplications;
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
    private final @Nullable Integer maxPercentUnhealthyNodes;

    @CustomType.Constructor
    private ClusterHealthPolicyResponse(
        @CustomType.Parameter("applicationHealthPolicies") @Nullable Map<String,ApplicationHealthPolicyResponse> applicationHealthPolicies,
        @CustomType.Parameter("maxPercentUnhealthyApplications") @Nullable Integer maxPercentUnhealthyApplications,
        @CustomType.Parameter("maxPercentUnhealthyNodes") @Nullable Integer maxPercentUnhealthyNodes) {
        this.applicationHealthPolicies = applicationHealthPolicies;
        this.maxPercentUnhealthyApplications = maxPercentUnhealthyApplications;
        this.maxPercentUnhealthyNodes = maxPercentUnhealthyNodes;
    }

    /**
     * Defines the application health policy map used to evaluate the health of an application or one of its children entities.
     * 
    */
    public Map<String,ApplicationHealthPolicyResponse> applicationHealthPolicies() {
        return this.applicationHealthPolicies == null ? Map.of() : this.applicationHealthPolicies;
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
    public Optional<Integer> maxPercentUnhealthyApplications() {
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
    public Optional<Integer> maxPercentUnhealthyNodes() {
        return Optional.ofNullable(this.maxPercentUnhealthyNodes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,ApplicationHealthPolicyResponse> applicationHealthPolicies;
        private @Nullable Integer maxPercentUnhealthyApplications;
        private @Nullable Integer maxPercentUnhealthyNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterHealthPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationHealthPolicies = defaults.applicationHealthPolicies;
    	      this.maxPercentUnhealthyApplications = defaults.maxPercentUnhealthyApplications;
    	      this.maxPercentUnhealthyNodes = defaults.maxPercentUnhealthyNodes;
        }

        public Builder applicationHealthPolicies(@Nullable Map<String,ApplicationHealthPolicyResponse> applicationHealthPolicies) {
            this.applicationHealthPolicies = applicationHealthPolicies;
            return this;
        }
        public Builder maxPercentUnhealthyApplications(@Nullable Integer maxPercentUnhealthyApplications) {
            this.maxPercentUnhealthyApplications = maxPercentUnhealthyApplications;
            return this;
        }
        public Builder maxPercentUnhealthyNodes(@Nullable Integer maxPercentUnhealthyNodes) {
            this.maxPercentUnhealthyNodes = maxPercentUnhealthyNodes;
            return this;
        }        public ClusterHealthPolicyResponse build() {
            return new ClusterHealthPolicyResponse(applicationHealthPolicies, maxPercentUnhealthyApplications, maxPercentUnhealthyNodes);
        }
    }
}
