// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetASCDataConnectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetASCDataConnectorArgs Empty = new GetASCDataConnectorArgs();

    /**
     * Connector ID
     * 
     */
    @Import(name="dataConnectorId", required=true)
      private final String dataConnectorId;

    public String dataConnectorId() {
        return this.dataConnectorId;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    public GetASCDataConnectorArgs(
        String dataConnectorId,
        String resourceGroupName,
        String workspaceName) {
        this.dataConnectorId = Objects.requireNonNull(dataConnectorId, "expected parameter 'dataConnectorId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetASCDataConnectorArgs() {
        this.dataConnectorId = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetASCDataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataConnectorId;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetASCDataConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataConnectorId = defaults.dataConnectorId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder dataConnectorId(String dataConnectorId) {
            this.dataConnectorId = Objects.requireNonNull(dataConnectorId);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }        public GetASCDataConnectorArgs build() {
            return new GetASCDataConnectorArgs(dataConnectorId, resourceGroupName, workspaceName);
        }
    }
}
