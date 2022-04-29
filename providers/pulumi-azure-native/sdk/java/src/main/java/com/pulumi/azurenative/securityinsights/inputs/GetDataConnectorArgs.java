// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetDataConnectorArgs extends InvokeArgs {

    public static final GetDataConnectorArgs Empty = new GetDataConnectorArgs();

    /**
     * Connector ID
     * 
     */
    @Import(name="dataConnectorId", required=true)
    private String dataConnectorId;

    /**
     * @return Connector ID
     * 
     */
    public String dataConnectorId() {
        return this.dataConnectorId;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
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

    private GetDataConnectorArgs() {}

    private GetDataConnectorArgs(GetDataConnectorArgs $) {
        this.dataConnectorId = $.dataConnectorId;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataConnectorArgs $;

        public Builder() {
            $ = new GetDataConnectorArgs();
        }

        public Builder(GetDataConnectorArgs defaults) {
            $ = new GetDataConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataConnectorId Connector ID
         * 
         * @return builder
         * 
         */
        public Builder dataConnectorId(String dataConnectorId) {
            $.dataConnectorId = dataConnectorId;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
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

        public GetDataConnectorArgs build() {
            $.dataConnectorId = Objects.requireNonNull($.dataConnectorId, "expected parameter 'dataConnectorId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
