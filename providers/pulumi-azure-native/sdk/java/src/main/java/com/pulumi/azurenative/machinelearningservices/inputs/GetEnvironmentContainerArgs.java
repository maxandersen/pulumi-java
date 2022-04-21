// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEnvironmentContainerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentContainerArgs Empty = new GetEnvironmentContainerArgs();

    /**
     * Container name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
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
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    private GetEnvironmentContainerArgs() {}

    private GetEnvironmentContainerArgs(GetEnvironmentContainerArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentContainerArgs $;

        public Builder() {
            $ = new GetEnvironmentContainerArgs();
        }

        public Builder(GetEnvironmentContainerArgs defaults) {
            $ = new GetEnvironmentContainerArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
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

        public GetEnvironmentContainerArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
