// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetDscpConfigurationArgs extends InvokeArgs {

    public static final GetDscpConfigurationArgs Empty = new GetDscpConfigurationArgs();

    /**
     * The name of the resource.
     * 
     */
    @Import(name="dscpConfigurationName", required=true)
    private String dscpConfigurationName;

    /**
     * @return The name of the resource.
     * 
     */
    public String dscpConfigurationName() {
        return this.dscpConfigurationName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDscpConfigurationArgs() {}

    private GetDscpConfigurationArgs(GetDscpConfigurationArgs $) {
        this.dscpConfigurationName = $.dscpConfigurationName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDscpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDscpConfigurationArgs $;

        public Builder() {
            $ = new GetDscpConfigurationArgs();
        }

        public Builder(GetDscpConfigurationArgs defaults) {
            $ = new GetDscpConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dscpConfigurationName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder dscpConfigurationName(String dscpConfigurationName) {
            $.dscpConfigurationName = dscpConfigurationName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDscpConfigurationArgs build() {
            $.dscpConfigurationName = Objects.requireNonNull($.dscpConfigurationName, "expected parameter 'dscpConfigurationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
