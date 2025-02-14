// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSentinelOnboardingStateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSentinelOnboardingStateArgs Empty = new GetSentinelOnboardingStateArgs();

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
    private String operationalInsightsResourceProvider;

    /**
     * @return The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    public String operationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Sentinel onboarding state name. Supports - default
     * 
     */
    @Import(name="sentinelOnboardingStateName", required=true)
    private String sentinelOnboardingStateName;

    /**
     * @return The Sentinel onboarding state name. Supports - default
     * 
     */
    public String sentinelOnboardingStateName() {
        return this.sentinelOnboardingStateName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetSentinelOnboardingStateArgs() {}

    private GetSentinelOnboardingStateArgs(GetSentinelOnboardingStateArgs $) {
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.resourceGroupName = $.resourceGroupName;
        this.sentinelOnboardingStateName = $.sentinelOnboardingStateName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSentinelOnboardingStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSentinelOnboardingStateArgs $;

        public Builder() {
            $ = new GetSentinelOnboardingStateArgs();
        }

        public Builder(GetSentinelOnboardingStateArgs defaults) {
            $ = new GetSentinelOnboardingStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operationalInsightsResourceProvider The namespace of workspaces resource provider- Microsoft.OperationalInsights.
         * 
         * @return builder
         * 
         */
        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            $.operationalInsightsResourceProvider = operationalInsightsResourceProvider;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param sentinelOnboardingStateName The Sentinel onboarding state name. Supports - default
         * 
         * @return builder
         * 
         */
        public Builder sentinelOnboardingStateName(String sentinelOnboardingStateName) {
            $.sentinelOnboardingStateName = sentinelOnboardingStateName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetSentinelOnboardingStateArgs build() {
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sentinelOnboardingStateName = Objects.requireNonNull($.sentinelOnboardingStateName, "expected parameter 'sentinelOnboardingStateName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
