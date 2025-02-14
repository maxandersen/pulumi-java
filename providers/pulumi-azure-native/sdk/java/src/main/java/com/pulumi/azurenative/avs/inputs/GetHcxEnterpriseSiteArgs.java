// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHcxEnterpriseSiteArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHcxEnterpriseSiteArgs Empty = new GetHcxEnterpriseSiteArgs();

    /**
     * Name of the HCX Enterprise Site in the private cloud
     * 
     */
    @Import(name="hcxEnterpriseSiteName", required=true)
    private String hcxEnterpriseSiteName;

    /**
     * @return Name of the HCX Enterprise Site in the private cloud
     * 
     */
    public String hcxEnterpriseSiteName() {
        return this.hcxEnterpriseSiteName;
    }

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
    private String privateCloudName;

    /**
     * @return Name of the private cloud
     * 
     */
    public String privateCloudName() {
        return this.privateCloudName;
    }

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

    private GetHcxEnterpriseSiteArgs() {}

    private GetHcxEnterpriseSiteArgs(GetHcxEnterpriseSiteArgs $) {
        this.hcxEnterpriseSiteName = $.hcxEnterpriseSiteName;
        this.privateCloudName = $.privateCloudName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHcxEnterpriseSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHcxEnterpriseSiteArgs $;

        public Builder() {
            $ = new GetHcxEnterpriseSiteArgs();
        }

        public Builder(GetHcxEnterpriseSiteArgs defaults) {
            $ = new GetHcxEnterpriseSiteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
         * 
         * @return builder
         * 
         */
        public Builder hcxEnterpriseSiteName(String hcxEnterpriseSiteName) {
            $.hcxEnterpriseSiteName = hcxEnterpriseSiteName;
            return this;
        }

        /**
         * @param privateCloudName Name of the private cloud
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(String privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
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

        public GetHcxEnterpriseSiteArgs build() {
            $.hcxEnterpriseSiteName = Objects.requireNonNull($.hcxEnterpriseSiteName, "expected parameter 'hcxEnterpriseSiteName' to be non-null");
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
