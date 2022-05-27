// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityPartnerProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPartnerProviderArgs Empty = new SecurityPartnerProviderArgs();

    /**
     * The Azure Region where the Security Partner Provider should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Security Partner Provider should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name which should be used for this Security Partner Provider. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Security Partner Provider. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Security Partner Provider should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Security Partner Provider should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The security provider name. Possible values are `ZScaler`, `IBoss` and `Checkpoint` is allowed. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="securityProviderName", required=true)
    private Output<String> securityProviderName;

    /**
     * @return The security provider name. Possible values are `ZScaler`, `IBoss` and `Checkpoint` is allowed. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> securityProviderName() {
        return this.securityProviderName;
    }

    /**
     * A mapping of tags which should be assigned to the Security Partner Provider.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Security Partner Provider.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the Virtual Hub within which this Security Partner Provider should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="virtualHubId")
    private @Nullable Output<String> virtualHubId;

    /**
     * @return The ID of the Virtual Hub within which this Security Partner Provider should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> virtualHubId() {
        return Optional.ofNullable(this.virtualHubId);
    }

    private SecurityPartnerProviderArgs() {}

    private SecurityPartnerProviderArgs(SecurityPartnerProviderArgs $) {
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.securityProviderName = $.securityProviderName;
        this.tags = $.tags;
        this.virtualHubId = $.virtualHubId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPartnerProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPartnerProviderArgs $;

        public Builder() {
            $ = new SecurityPartnerProviderArgs();
        }

        public Builder(SecurityPartnerProviderArgs defaults) {
            $ = new SecurityPartnerProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Azure Region where the Security Partner Provider should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Security Partner Provider should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name which should be used for this Security Partner Provider. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Security Partner Provider. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Security Partner Provider should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Security Partner Provider should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param securityProviderName The security provider name. Possible values are `ZScaler`, `IBoss` and `Checkpoint` is allowed. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder securityProviderName(Output<String> securityProviderName) {
            $.securityProviderName = securityProviderName;
            return this;
        }

        /**
         * @param securityProviderName The security provider name. Possible values are `ZScaler`, `IBoss` and `Checkpoint` is allowed. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder securityProviderName(String securityProviderName) {
            return securityProviderName(Output.of(securityProviderName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Security Partner Provider.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Security Partner Provider.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param virtualHubId The ID of the Virtual Hub within which this Security Partner Provider should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubId(@Nullable Output<String> virtualHubId) {
            $.virtualHubId = virtualHubId;
            return this;
        }

        /**
         * @param virtualHubId The ID of the Virtual Hub within which this Security Partner Provider should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubId(String virtualHubId) {
            return virtualHubId(Output.of(virtualHubId));
        }

        public SecurityPartnerProviderArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.securityProviderName = Objects.requireNonNull($.securityProviderName, "expected parameter 'securityProviderName' to be non-null");
            return $;
        }
    }

}
