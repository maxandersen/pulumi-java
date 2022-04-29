// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.m365securityandcompliance.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetprivateLinkServicesForMIPPolicySyncArgs extends InvokeArgs {

    public static final GetprivateLinkServicesForMIPPolicySyncArgs Empty = new GetprivateLinkServicesForMIPPolicySyncArgs();

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the service instance.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service instance.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the service instance.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetprivateLinkServicesForMIPPolicySyncArgs() {}

    private GetprivateLinkServicesForMIPPolicySyncArgs(GetprivateLinkServicesForMIPPolicySyncArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetprivateLinkServicesForMIPPolicySyncArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetprivateLinkServicesForMIPPolicySyncArgs $;

        public Builder() {
            $ = new GetprivateLinkServicesForMIPPolicySyncArgs();
        }

        public Builder(GetprivateLinkServicesForMIPPolicySyncArgs defaults) {
            $ = new GetprivateLinkServicesForMIPPolicySyncArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName The name of the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetprivateLinkServicesForMIPPolicySyncArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
