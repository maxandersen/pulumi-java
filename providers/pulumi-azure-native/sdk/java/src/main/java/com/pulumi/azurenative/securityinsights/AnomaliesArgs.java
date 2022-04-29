// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnomaliesArgs extends ResourceArgs {

    public static final AnomaliesArgs Empty = new AnomaliesArgs();

    /**
     * The kind of the setting
     * Expected value is &#39;Anomalies&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return The kind of the setting
     * Expected value is &#39;Anomalies&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
    private Output<String> operationalInsightsResourceProvider;

    /**
     * @return The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    public Output<String> operationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba
     * 
     */
    @Import(name="settingsName")
    private @Nullable Output<String> settingsName;

    /**
     * @return The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba
     * 
     */
    public Optional<Output<String>> settingsName() {
        return Optional.ofNullable(this.settingsName);
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private AnomaliesArgs() {}

    private AnomaliesArgs(AnomaliesArgs $) {
        this.kind = $.kind;
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.resourceGroupName = $.resourceGroupName;
        this.settingsName = $.settingsName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnomaliesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnomaliesArgs $;

        public Builder() {
            $ = new AnomaliesArgs();
        }

        public Builder(AnomaliesArgs defaults) {
            $ = new AnomaliesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kind The kind of the setting
         * Expected value is &#39;Anomalies&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of the setting
         * Expected value is &#39;Anomalies&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param operationalInsightsResourceProvider The namespace of workspaces resource provider- Microsoft.OperationalInsights.
         * 
         * @return builder
         * 
         */
        public Builder operationalInsightsResourceProvider(Output<String> operationalInsightsResourceProvider) {
            $.operationalInsightsResourceProvider = operationalInsightsResourceProvider;
            return this;
        }

        /**
         * @param operationalInsightsResourceProvider The namespace of workspaces resource provider- Microsoft.OperationalInsights.
         * 
         * @return builder
         * 
         */
        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            return operationalInsightsResourceProvider(Output.of(operationalInsightsResourceProvider));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param settingsName The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba
         * 
         * @return builder
         * 
         */
        public Builder settingsName(@Nullable Output<String> settingsName) {
            $.settingsName = settingsName;
            return this;
        }

        /**
         * @param settingsName The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba
         * 
         * @return builder
         * 
         */
        public Builder settingsName(String settingsName) {
            return settingsName(Output.of(settingsName));
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public AnomaliesArgs build() {
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
