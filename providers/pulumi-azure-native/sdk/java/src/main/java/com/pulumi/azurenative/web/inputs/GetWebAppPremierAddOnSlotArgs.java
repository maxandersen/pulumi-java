// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppPremierAddOnSlotArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebAppPremierAddOnSlotArgs Empty = new GetWebAppPremierAddOnSlotArgs();

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the app.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Add-on name.
     * 
     */
    @Import(name="premierAddOnName", required=true)
    private String premierAddOnName;

    /**
     * @return Add-on name.
     * 
     */
    public String premierAddOnName() {
        return this.premierAddOnName;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will get the named add-on for the production slot.
     * 
     */
    @Import(name="slot", required=true)
    private String slot;

    /**
     * @return Name of the deployment slot. If a slot is not specified, the API will get the named add-on for the production slot.
     * 
     */
    public String slot() {
        return this.slot;
    }

    private GetWebAppPremierAddOnSlotArgs() {}

    private GetWebAppPremierAddOnSlotArgs(GetWebAppPremierAddOnSlotArgs $) {
        this.name = $.name;
        this.premierAddOnName = $.premierAddOnName;
        this.resourceGroupName = $.resourceGroupName;
        this.slot = $.slot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAppPremierAddOnSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAppPremierAddOnSlotArgs $;

        public Builder() {
            $ = new GetWebAppPremierAddOnSlotArgs();
        }

        public Builder(GetWebAppPremierAddOnSlotArgs defaults) {
            $ = new GetWebAppPremierAddOnSlotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param premierAddOnName Add-on name.
         * 
         * @return builder
         * 
         */
        public Builder premierAddOnName(String premierAddOnName) {
            $.premierAddOnName = premierAddOnName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param slot Name of the deployment slot. If a slot is not specified, the API will get the named add-on for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(String slot) {
            $.slot = slot;
            return this;
        }

        public GetWebAppPremierAddOnSlotArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.premierAddOnName = Objects.requireNonNull($.premierAddOnName, "expected parameter 'premierAddOnName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            return $;
        }
    }

}
