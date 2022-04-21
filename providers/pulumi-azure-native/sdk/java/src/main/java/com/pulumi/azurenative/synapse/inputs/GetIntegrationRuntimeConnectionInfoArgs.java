// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationRuntimeConnectionInfoArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIntegrationRuntimeConnectionInfoArgs Empty = new GetIntegrationRuntimeConnectionInfoArgs();

    /**
     * Integration runtime name
     * 
     */
    @Import(name="integrationRuntimeName", required=true)
    private String integrationRuntimeName;

    public String integrationRuntimeName() {
        return this.integrationRuntimeName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    private GetIntegrationRuntimeConnectionInfoArgs() {}

    private GetIntegrationRuntimeConnectionInfoArgs(GetIntegrationRuntimeConnectionInfoArgs $) {
        this.integrationRuntimeName = $.integrationRuntimeName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIntegrationRuntimeConnectionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIntegrationRuntimeConnectionInfoArgs $;

        public Builder() {
            $ = new GetIntegrationRuntimeConnectionInfoArgs();
        }

        public Builder(GetIntegrationRuntimeConnectionInfoArgs defaults) {
            $ = new GetIntegrationRuntimeConnectionInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder integrationRuntimeName(String integrationRuntimeName) {
            $.integrationRuntimeName = integrationRuntimeName;
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

        public GetIntegrationRuntimeConnectionInfoArgs build() {
            $.integrationRuntimeName = Objects.requireNonNull($.integrationRuntimeName, "expected parameter 'integrationRuntimeName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
