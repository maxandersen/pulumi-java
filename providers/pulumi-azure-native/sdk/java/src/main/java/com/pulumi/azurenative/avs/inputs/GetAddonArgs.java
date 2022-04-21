// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAddonArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAddonArgs Empty = new GetAddonArgs();

    /**
     * Name of the addon for the private cloud
     * 
     */
    @Import(name="addonName", required=true)
    private String addonName;

    public String addonName() {
        return this.addonName;
    }

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
    private String privateCloudName;

    public String privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAddonArgs() {}

    private GetAddonArgs(GetAddonArgs $) {
        this.addonName = $.addonName;
        this.privateCloudName = $.privateCloudName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAddonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAddonArgs $;

        public Builder() {
            $ = new GetAddonArgs();
        }

        public Builder(GetAddonArgs defaults) {
            $ = new GetAddonArgs(Objects.requireNonNull(defaults));
        }

        public Builder addonName(String addonName) {
            $.addonName = addonName;
            return this;
        }

        public Builder privateCloudName(String privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetAddonArgs build() {
            $.addonName = Objects.requireNonNull($.addonName, "expected parameter 'addonName' to be non-null");
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
