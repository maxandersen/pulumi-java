// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.FirewallPolicyLogAnalyticsWorkspaceArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Log Analytics Resources for Firewall Policy Insights.
 * 
 */
public final class FirewallPolicyLogAnalyticsResourcesArgs extends ResourceArgs {

    public static final FirewallPolicyLogAnalyticsResourcesArgs Empty = new FirewallPolicyLogAnalyticsResourcesArgs();

    /**
     * The default workspace Id for Firewall Policy Insights.
     * 
     */
    @Import(name="defaultWorkspaceId")
    private @Nullable Output<SubResourceArgs> defaultWorkspaceId;

    /**
     * @return The default workspace Id for Firewall Policy Insights.
     * 
     */
    public Optional<Output<SubResourceArgs>> defaultWorkspaceId() {
        return Optional.ofNullable(this.defaultWorkspaceId);
    }

    /**
     * List of workspaces for Firewall Policy Insights.
     * 
     */
    @Import(name="workspaces")
    private @Nullable Output<List<FirewallPolicyLogAnalyticsWorkspaceArgs>> workspaces;

    /**
     * @return List of workspaces for Firewall Policy Insights.
     * 
     */
    public Optional<Output<List<FirewallPolicyLogAnalyticsWorkspaceArgs>>> workspaces() {
        return Optional.ofNullable(this.workspaces);
    }

    private FirewallPolicyLogAnalyticsResourcesArgs() {}

    private FirewallPolicyLogAnalyticsResourcesArgs(FirewallPolicyLogAnalyticsResourcesArgs $) {
        this.defaultWorkspaceId = $.defaultWorkspaceId;
        this.workspaces = $.workspaces;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyLogAnalyticsResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyLogAnalyticsResourcesArgs $;

        public Builder() {
            $ = new FirewallPolicyLogAnalyticsResourcesArgs();
        }

        public Builder(FirewallPolicyLogAnalyticsResourcesArgs defaults) {
            $ = new FirewallPolicyLogAnalyticsResourcesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultWorkspaceId The default workspace Id for Firewall Policy Insights.
         * 
         * @return builder
         * 
         */
        public Builder defaultWorkspaceId(@Nullable Output<SubResourceArgs> defaultWorkspaceId) {
            $.defaultWorkspaceId = defaultWorkspaceId;
            return this;
        }

        /**
         * @param defaultWorkspaceId The default workspace Id for Firewall Policy Insights.
         * 
         * @return builder
         * 
         */
        public Builder defaultWorkspaceId(SubResourceArgs defaultWorkspaceId) {
            return defaultWorkspaceId(Output.of(defaultWorkspaceId));
        }

        /**
         * @param workspaces List of workspaces for Firewall Policy Insights.
         * 
         * @return builder
         * 
         */
        public Builder workspaces(@Nullable Output<List<FirewallPolicyLogAnalyticsWorkspaceArgs>> workspaces) {
            $.workspaces = workspaces;
            return this;
        }

        /**
         * @param workspaces List of workspaces for Firewall Policy Insights.
         * 
         * @return builder
         * 
         */
        public Builder workspaces(List<FirewallPolicyLogAnalyticsWorkspaceArgs> workspaces) {
            return workspaces(Output.of(workspaces));
        }

        /**
         * @param workspaces List of workspaces for Firewall Policy Insights.
         * 
         * @return builder
         * 
         */
        public Builder workspaces(FirewallPolicyLogAnalyticsWorkspaceArgs... workspaces) {
            return workspaces(List.of(workspaces));
        }

        public FirewallPolicyLogAnalyticsResourcesArgs build() {
            return $;
        }
    }

}
