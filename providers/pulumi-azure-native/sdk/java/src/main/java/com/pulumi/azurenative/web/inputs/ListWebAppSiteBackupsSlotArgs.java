// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class ListWebAppSiteBackupsSlotArgs extends InvokeArgs {

    public static final ListWebAppSiteBackupsSlotArgs Empty = new ListWebAppSiteBackupsSlotArgs();

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
     * Name of the deployment slot. If a slot is not specified, the API will get backups of the production slot.
     * 
     */
    @Import(name="slot", required=true)
    private String slot;

    /**
     * @return Name of the deployment slot. If a slot is not specified, the API will get backups of the production slot.
     * 
     */
    public String slot() {
        return this.slot;
    }

    private ListWebAppSiteBackupsSlotArgs() {}

    private ListWebAppSiteBackupsSlotArgs(ListWebAppSiteBackupsSlotArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.slot = $.slot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWebAppSiteBackupsSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWebAppSiteBackupsSlotArgs $;

        public Builder() {
            $ = new ListWebAppSiteBackupsSlotArgs();
        }

        public Builder(ListWebAppSiteBackupsSlotArgs defaults) {
            $ = new ListWebAppSiteBackupsSlotArgs(Objects.requireNonNull(defaults));
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
         * @param slot Name of the deployment slot. If a slot is not specified, the API will get backups of the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(String slot) {
            $.slot = slot;
            return this;
        }

        public ListWebAppSiteBackupsSlotArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            return $;
        }
    }

}
