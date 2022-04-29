// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetAFDCustomDomainArgs extends InvokeArgs {

    public static final GetAFDCustomDomainArgs Empty = new GetAFDCustomDomainArgs();

    /**
     * Name of the domain under the profile which is unique globally.
     * 
     */
    @Import(name="customDomainName", required=true)
    private String customDomainName;

    /**
     * @return Name of the domain under the profile which is unique globally.
     * 
     */
    public String customDomainName() {
        return this.customDomainName;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
    private String profileName;

    /**
     * @return Name of the CDN profile which is unique within the resource group.
     * 
     */
    public String profileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAFDCustomDomainArgs() {}

    private GetAFDCustomDomainArgs(GetAFDCustomDomainArgs $) {
        this.customDomainName = $.customDomainName;
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAFDCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAFDCustomDomainArgs $;

        public Builder() {
            $ = new GetAFDCustomDomainArgs();
        }

        public Builder(GetAFDCustomDomainArgs defaults) {
            $ = new GetAFDCustomDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customDomainName Name of the domain under the profile which is unique globally.
         * 
         * @return builder
         * 
         */
        public Builder customDomainName(String customDomainName) {
            $.customDomainName = customDomainName;
            return this;
        }

        /**
         * @param profileName Name of the CDN profile which is unique within the resource group.
         * 
         * @return builder
         * 
         */
        public Builder profileName(String profileName) {
            $.profileName = profileName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetAFDCustomDomainArgs build() {
            $.customDomainName = Objects.requireNonNull($.customDomainName, "expected parameter 'customDomainName' to be non-null");
            $.profileName = Objects.requireNonNull($.profileName, "expected parameter 'profileName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
