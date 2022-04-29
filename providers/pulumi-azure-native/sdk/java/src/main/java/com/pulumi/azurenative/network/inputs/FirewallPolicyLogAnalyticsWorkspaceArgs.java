// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Log Analytics Workspace for Firewall Policy Insights.
 * 
 */
public final class FirewallPolicyLogAnalyticsWorkspaceArgs extends ResourceArgs {

    public static final FirewallPolicyLogAnalyticsWorkspaceArgs Empty = new FirewallPolicyLogAnalyticsWorkspaceArgs();

    /**
     * Region to configure the Workspace.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Region to configure the Workspace.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The workspace Id for Firewall Policy Insights.
     * 
     */
    @Import(name="workspaceId")
    private @Nullable Output<SubResourceArgs> workspaceId;

    /**
     * @return The workspace Id for Firewall Policy Insights.
     * 
     */
    public Optional<Output<SubResourceArgs>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    private FirewallPolicyLogAnalyticsWorkspaceArgs() {}

    private FirewallPolicyLogAnalyticsWorkspaceArgs(FirewallPolicyLogAnalyticsWorkspaceArgs $) {
        this.region = $.region;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyLogAnalyticsWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyLogAnalyticsWorkspaceArgs $;

        public Builder() {
            $ = new FirewallPolicyLogAnalyticsWorkspaceArgs();
        }

        public Builder(FirewallPolicyLogAnalyticsWorkspaceArgs defaults) {
            $ = new FirewallPolicyLogAnalyticsWorkspaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param region Region to configure the Workspace.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region to configure the Workspace.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param workspaceId The workspace Id for Firewall Policy Insights.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(@Nullable Output<SubResourceArgs> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The workspace Id for Firewall Policy Insights.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(SubResourceArgs workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public FirewallPolicyLogAnalyticsWorkspaceArgs build() {
            return $;
        }
    }

}
