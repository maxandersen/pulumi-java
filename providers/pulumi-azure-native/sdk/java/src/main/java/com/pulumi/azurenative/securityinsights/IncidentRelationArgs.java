// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IncidentRelationArgs extends ResourceArgs {

    public static final IncidentRelationArgs Empty = new IncidentRelationArgs();

    /**
     * Incident ID
     * 
     */
    @Import(name="incidentId", required=true)
    private Output<String> incidentId;

    /**
     * @return Incident ID
     * 
     */
    public Output<String> incidentId() {
        return this.incidentId;
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
     * The resource ID of the related resource
     * 
     */
    @Import(name="relatedResourceId", required=true)
    private Output<String> relatedResourceId;

    /**
     * @return The resource ID of the related resource
     * 
     */
    public Output<String> relatedResourceId() {
        return this.relatedResourceId;
    }

    /**
     * Relation Name
     * 
     */
    @Import(name="relationName")
    private @Nullable Output<String> relationName;

    /**
     * @return Relation Name
     * 
     */
    public Optional<Output<String>> relationName() {
        return Optional.ofNullable(this.relationName);
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

    private IncidentRelationArgs() {}

    private IncidentRelationArgs(IncidentRelationArgs $) {
        this.incidentId = $.incidentId;
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.relatedResourceId = $.relatedResourceId;
        this.relationName = $.relationName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IncidentRelationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IncidentRelationArgs $;

        public Builder() {
            $ = new IncidentRelationArgs();
        }

        public Builder(IncidentRelationArgs defaults) {
            $ = new IncidentRelationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param incidentId Incident ID
         * 
         * @return builder
         * 
         */
        public Builder incidentId(Output<String> incidentId) {
            $.incidentId = incidentId;
            return this;
        }

        /**
         * @param incidentId Incident ID
         * 
         * @return builder
         * 
         */
        public Builder incidentId(String incidentId) {
            return incidentId(Output.of(incidentId));
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
         * @param relatedResourceId The resource ID of the related resource
         * 
         * @return builder
         * 
         */
        public Builder relatedResourceId(Output<String> relatedResourceId) {
            $.relatedResourceId = relatedResourceId;
            return this;
        }

        /**
         * @param relatedResourceId The resource ID of the related resource
         * 
         * @return builder
         * 
         */
        public Builder relatedResourceId(String relatedResourceId) {
            return relatedResourceId(Output.of(relatedResourceId));
        }

        /**
         * @param relationName Relation Name
         * 
         * @return builder
         * 
         */
        public Builder relationName(@Nullable Output<String> relationName) {
            $.relationName = relationName;
            return this;
        }

        /**
         * @param relationName Relation Name
         * 
         * @return builder
         * 
         */
        public Builder relationName(String relationName) {
            return relationName(Output.of(relationName));
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

        public IncidentRelationArgs build() {
            $.incidentId = Objects.requireNonNull($.incidentId, "expected parameter 'incidentId' to be non-null");
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.relatedResourceId = Objects.requireNonNull($.relatedResourceId, "expected parameter 'relatedResourceId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
