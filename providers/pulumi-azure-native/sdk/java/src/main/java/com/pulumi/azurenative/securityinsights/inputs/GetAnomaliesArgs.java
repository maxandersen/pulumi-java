// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetAnomaliesArgs extends InvokeArgs {

    public static final GetAnomaliesArgs Empty = new GetAnomaliesArgs();

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
     * The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba
     * 
     */
    @Import(name="settingsName", required=true)
    private String settingsName;

    /**
     * @return The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba
     * 
     */
    public String settingsName() {
        return this.settingsName;
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

    private GetAnomaliesArgs() {}

    private GetAnomaliesArgs(GetAnomaliesArgs $) {
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.resourceGroupName = $.resourceGroupName;
        this.settingsName = $.settingsName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAnomaliesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAnomaliesArgs $;

        public Builder() {
            $ = new GetAnomaliesArgs();
        }

        public Builder(GetAnomaliesArgs defaults) {
            $ = new GetAnomaliesArgs(Objects.requireNonNull(defaults));
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
         * @param settingsName The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba
         * 
         * @return builder
         * 
         */
        public Builder settingsName(String settingsName) {
            $.settingsName = settingsName;
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

        public GetAnomaliesArgs build() {
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.settingsName = Objects.requireNonNull($.settingsName, "expected parameter 'settingsName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
