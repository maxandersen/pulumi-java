// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkspaceConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkspaceConnectionArgs Empty = new GetWorkspaceConnectionArgs();

    /**
     * Friendly name of the workspace connection
     * 
     */
    @Import(name="connectionName", required=true)
    private String connectionName;

    public String connectionName() {
        return this.connectionName;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    private GetWorkspaceConnectionArgs() {}

    private GetWorkspaceConnectionArgs(GetWorkspaceConnectionArgs $) {
        this.connectionName = $.connectionName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkspaceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkspaceConnectionArgs $;

        public Builder() {
            $ = new GetWorkspaceConnectionArgs();
        }

        public Builder(GetWorkspaceConnectionArgs defaults) {
            $ = new GetWorkspaceConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectionName(String connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetWorkspaceConnectionArgs build() {
            $.connectionName = Objects.requireNonNull($.connectionName, "expected parameter 'connectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
