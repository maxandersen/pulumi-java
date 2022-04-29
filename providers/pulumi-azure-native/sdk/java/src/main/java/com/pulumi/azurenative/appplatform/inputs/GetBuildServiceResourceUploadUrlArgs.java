// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetBuildServiceResourceUploadUrlArgs extends InvokeArgs {

    public static final GetBuildServiceResourceUploadUrlArgs Empty = new GetBuildServiceResourceUploadUrlArgs();

    /**
     * The name of the build service resource.
     * 
     */
    @Import(name="buildServiceName", required=true)
    private String buildServiceName;

    /**
     * @return The name of the build service resource.
     * 
     */
    public String buildServiceName() {
        return this.buildServiceName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name of the Service resource.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private GetBuildServiceResourceUploadUrlArgs() {}

    private GetBuildServiceResourceUploadUrlArgs(GetBuildServiceResourceUploadUrlArgs $) {
        this.buildServiceName = $.buildServiceName;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBuildServiceResourceUploadUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBuildServiceResourceUploadUrlArgs $;

        public Builder() {
            $ = new GetBuildServiceResourceUploadUrlArgs();
        }

        public Builder(GetBuildServiceResourceUploadUrlArgs defaults) {
            $ = new GetBuildServiceResourceUploadUrlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buildServiceName The name of the build service resource.
         * 
         * @return builder
         * 
         */
        public Builder buildServiceName(String buildServiceName) {
            $.buildServiceName = buildServiceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serviceName The name of the Service resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetBuildServiceResourceUploadUrlArgs build() {
            $.buildServiceName = Objects.requireNonNull($.buildServiceName, "expected parameter 'buildServiceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
