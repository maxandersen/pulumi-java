// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SlotVirtualNetworkSwiftConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SlotVirtualNetworkSwiftConnectionArgs Empty = new SlotVirtualNetworkSwiftConnectionArgs();

    /**
     * The ID of the App Service or Function App to associate to the VNet. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="appServiceId", required=true)
    private Output<String> appServiceId;

    /**
     * @return The ID of the App Service or Function App to associate to the VNet. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> appServiceId() {
        return this.appServiceId;
    }

    /**
     * The name of the App Service Slot or Function App Slot. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="slotName", required=true)
    private Output<String> slotName;

    /**
     * @return The name of the App Service Slot or Function App Slot. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> slotName() {
        return this.slotName;
    }

    /**
     * The ID of the subnet the app service will be associated to (the subnet must have a `service_delegation` configured for `Microsoft.Web/serverFarms`).
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet the app service will be associated to (the subnet must have a `service_delegation` configured for `Microsoft.Web/serverFarms`).
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    private SlotVirtualNetworkSwiftConnectionArgs() {}

    private SlotVirtualNetworkSwiftConnectionArgs(SlotVirtualNetworkSwiftConnectionArgs $) {
        this.appServiceId = $.appServiceId;
        this.slotName = $.slotName;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlotVirtualNetworkSwiftConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlotVirtualNetworkSwiftConnectionArgs $;

        public Builder() {
            $ = new SlotVirtualNetworkSwiftConnectionArgs();
        }

        public Builder(SlotVirtualNetworkSwiftConnectionArgs defaults) {
            $ = new SlotVirtualNetworkSwiftConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appServiceId The ID of the App Service or Function App to associate to the VNet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServiceId(Output<String> appServiceId) {
            $.appServiceId = appServiceId;
            return this;
        }

        /**
         * @param appServiceId The ID of the App Service or Function App to associate to the VNet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServiceId(String appServiceId) {
            return appServiceId(Output.of(appServiceId));
        }

        /**
         * @param slotName The name of the App Service Slot or Function App Slot. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder slotName(Output<String> slotName) {
            $.slotName = slotName;
            return this;
        }

        /**
         * @param slotName The name of the App Service Slot or Function App Slot. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder slotName(String slotName) {
            return slotName(Output.of(slotName));
        }

        /**
         * @param subnetId The ID of the subnet the app service will be associated to (the subnet must have a `service_delegation` configured for `Microsoft.Web/serverFarms`).
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the subnet the app service will be associated to (the subnet must have a `service_delegation` configured for `Microsoft.Web/serverFarms`).
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public SlotVirtualNetworkSwiftConnectionArgs build() {
            $.appServiceId = Objects.requireNonNull($.appServiceId, "expected parameter 'appServiceId' to be non-null");
            $.slotName = Objects.requireNonNull($.slotName, "expected parameter 'slotName' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}
