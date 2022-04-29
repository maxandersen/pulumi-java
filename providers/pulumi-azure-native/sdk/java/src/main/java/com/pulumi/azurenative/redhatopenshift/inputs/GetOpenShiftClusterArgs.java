// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.redhatopenshift.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetOpenShiftClusterArgs extends InvokeArgs {

    public static final GetOpenShiftClusterArgs Empty = new GetOpenShiftClusterArgs();

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
     * The name of the OpenShift cluster resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the OpenShift cluster resource.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetOpenShiftClusterArgs() {}

    private GetOpenShiftClusterArgs(GetOpenShiftClusterArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOpenShiftClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOpenShiftClusterArgs $;

        public Builder() {
            $ = new GetOpenShiftClusterArgs();
        }

        public Builder(GetOpenShiftClusterArgs defaults) {
            $ = new GetOpenShiftClusterArgs(Objects.requireNonNull(defaults));
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
         * @param resourceName The name of the OpenShift cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetOpenShiftClusterArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
