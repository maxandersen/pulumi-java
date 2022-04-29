// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.confluent;

import com.pulumi.azurenative.confluent.inputs.OrganizationResourcePropertiesOfferDetailArgs;
import com.pulumi.azurenative.confluent.inputs.OrganizationResourcePropertiesUserDetailArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationArgs extends ResourceArgs {

    public static final OrganizationArgs Empty = new OrganizationArgs();

    /**
     * Location of Organization resource
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location of Organization resource
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Confluent offer detail
     * 
     */
    @Import(name="offerDetail")
    private @Nullable Output<OrganizationResourcePropertiesOfferDetailArgs> offerDetail;

    /**
     * @return Confluent offer detail
     * 
     */
    public Optional<Output<OrganizationResourcePropertiesOfferDetailArgs>> offerDetail() {
        return Optional.ofNullable(this.offerDetail);
    }

    /**
     * Organization resource name
     * 
     */
    @Import(name="organizationName")
    private @Nullable Output<String> organizationName;

    /**
     * @return Organization resource name
     * 
     */
    public Optional<Output<String>> organizationName() {
        return Optional.ofNullable(this.organizationName);
    }

    /**
     * Resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Resource group name
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Organization resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Organization resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Subscriber detail
     * 
     */
    @Import(name="userDetail")
    private @Nullable Output<OrganizationResourcePropertiesUserDetailArgs> userDetail;

    /**
     * @return Subscriber detail
     * 
     */
    public Optional<Output<OrganizationResourcePropertiesUserDetailArgs>> userDetail() {
        return Optional.ofNullable(this.userDetail);
    }

    private OrganizationArgs() {}

    private OrganizationArgs(OrganizationArgs $) {
        this.location = $.location;
        this.offerDetail = $.offerDetail;
        this.organizationName = $.organizationName;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.userDetail = $.userDetail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationArgs $;

        public Builder() {
            $ = new OrganizationArgs();
        }

        public Builder(OrganizationArgs defaults) {
            $ = new OrganizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Location of Organization resource
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of Organization resource
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param offerDetail Confluent offer detail
         * 
         * @return builder
         * 
         */
        public Builder offerDetail(@Nullable Output<OrganizationResourcePropertiesOfferDetailArgs> offerDetail) {
            $.offerDetail = offerDetail;
            return this;
        }

        /**
         * @param offerDetail Confluent offer detail
         * 
         * @return builder
         * 
         */
        public Builder offerDetail(OrganizationResourcePropertiesOfferDetailArgs offerDetail) {
            return offerDetail(Output.of(offerDetail));
        }

        /**
         * @param organizationName Organization resource name
         * 
         * @return builder
         * 
         */
        public Builder organizationName(@Nullable Output<String> organizationName) {
            $.organizationName = organizationName;
            return this;
        }

        /**
         * @param organizationName Organization resource name
         * 
         * @return builder
         * 
         */
        public Builder organizationName(String organizationName) {
            return organizationName(Output.of(organizationName));
        }

        /**
         * @param resourceGroupName Resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Organization resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Organization resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param userDetail Subscriber detail
         * 
         * @return builder
         * 
         */
        public Builder userDetail(@Nullable Output<OrganizationResourcePropertiesUserDetailArgs> userDetail) {
            $.userDetail = userDetail;
            return this;
        }

        /**
         * @param userDetail Subscriber detail
         * 
         * @return builder
         * 
         */
        public Builder userDetail(OrganizationResourcePropertiesUserDetailArgs userDetail) {
            return userDetail(Output.of(userDetail));
        }

        public OrganizationArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
