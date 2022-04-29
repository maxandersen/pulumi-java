// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class ListStaticSiteAppSettingsArgs extends InvokeArgs {

    public static final ListStaticSiteAppSettingsArgs Empty = new ListStaticSiteAppSettingsArgs();

    /**
     * Name of the static site.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the static site.
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

    private ListStaticSiteAppSettingsArgs() {}

    private ListStaticSiteAppSettingsArgs(ListStaticSiteAppSettingsArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListStaticSiteAppSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListStaticSiteAppSettingsArgs $;

        public Builder() {
            $ = new ListStaticSiteAppSettingsArgs();
        }

        public Builder(ListStaticSiteAppSettingsArgs defaults) {
            $ = new ListStaticSiteAppSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the static site.
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

        public ListStaticSiteAppSettingsArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
