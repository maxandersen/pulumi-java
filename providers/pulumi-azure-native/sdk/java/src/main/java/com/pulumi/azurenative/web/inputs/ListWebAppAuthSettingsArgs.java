// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class ListWebAppAuthSettingsArgs extends InvokeArgs {

    public static final ListWebAppAuthSettingsArgs Empty = new ListWebAppAuthSettingsArgs();

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

    private ListWebAppAuthSettingsArgs() {}

    private ListWebAppAuthSettingsArgs(ListWebAppAuthSettingsArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWebAppAuthSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWebAppAuthSettingsArgs $;

        public Builder() {
            $ = new ListWebAppAuthSettingsArgs();
        }

        public Builder(ListWebAppAuthSettingsArgs defaults) {
            $ = new ListWebAppAuthSettingsArgs(Objects.requireNonNull(defaults));
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

        public ListWebAppAuthSettingsArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
