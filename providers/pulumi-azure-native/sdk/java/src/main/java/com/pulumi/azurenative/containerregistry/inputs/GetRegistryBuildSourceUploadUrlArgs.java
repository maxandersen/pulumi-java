// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetRegistryBuildSourceUploadUrlArgs extends InvokeArgs {

    public static final GetRegistryBuildSourceUploadUrlArgs Empty = new GetRegistryBuildSourceUploadUrlArgs();

    /**
     * The name of the container registry.
     * 
     */
    @Import(name="registryName", required=true)
    private String registryName;

    /**
     * @return The name of the container registry.
     * 
     */
    public String registryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group to which the container registry belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetRegistryBuildSourceUploadUrlArgs() {}

    private GetRegistryBuildSourceUploadUrlArgs(GetRegistryBuildSourceUploadUrlArgs $) {
        this.registryName = $.registryName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryBuildSourceUploadUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryBuildSourceUploadUrlArgs $;

        public Builder() {
            $ = new GetRegistryBuildSourceUploadUrlArgs();
        }

        public Builder(GetRegistryBuildSourceUploadUrlArgs defaults) {
            $ = new GetRegistryBuildSourceUploadUrlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param registryName The name of the container registry.
         * 
         * @return builder
         * 
         */
        public Builder registryName(String registryName) {
            $.registryName = registryName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to which the container registry belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetRegistryBuildSourceUploadUrlArgs build() {
            $.registryName = Objects.requireNonNull($.registryName, "expected parameter 'registryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
