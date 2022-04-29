// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.SecurityRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkSecurityGroupArgs extends ResourceArgs {

    public static final NetworkSecurityGroupArgs Empty = new NetworkSecurityGroupArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the network security group.
     * 
     */
    @Import(name="networkSecurityGroupName")
    private @Nullable Output<String> networkSecurityGroupName;

    /**
     * @return The name of the network security group.
     * 
     */
    public Optional<Output<String>> networkSecurityGroupName() {
        return Optional.ofNullable(this.networkSecurityGroupName);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A collection of security rules of the network security group.
     * 
     */
    @Import(name="securityRules")
    private @Nullable Output<List<SecurityRuleArgs>> securityRules;

    /**
     * @return A collection of security rules of the network security group.
     * 
     */
    public Optional<Output<List<SecurityRuleArgs>>> securityRules() {
        return Optional.ofNullable(this.securityRules);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NetworkSecurityGroupArgs() {}

    private NetworkSecurityGroupArgs(NetworkSecurityGroupArgs $) {
        this.id = $.id;
        this.location = $.location;
        this.networkSecurityGroupName = $.networkSecurityGroupName;
        this.resourceGroupName = $.resourceGroupName;
        this.securityRules = $.securityRules;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkSecurityGroupArgs $;

        public Builder() {
            $ = new NetworkSecurityGroupArgs();
        }

        public Builder(NetworkSecurityGroupArgs defaults) {
            $ = new NetworkSecurityGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param networkSecurityGroupName The name of the network security group.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupName(@Nullable Output<String> networkSecurityGroupName) {
            $.networkSecurityGroupName = networkSecurityGroupName;
            return this;
        }

        /**
         * @param networkSecurityGroupName The name of the network security group.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupName(String networkSecurityGroupName) {
            return networkSecurityGroupName(Output.of(networkSecurityGroupName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param securityRules A collection of security rules of the network security group.
         * 
         * @return builder
         * 
         */
        public Builder securityRules(@Nullable Output<List<SecurityRuleArgs>> securityRules) {
            $.securityRules = securityRules;
            return this;
        }

        /**
         * @param securityRules A collection of security rules of the network security group.
         * 
         * @return builder
         * 
         */
        public Builder securityRules(List<SecurityRuleArgs> securityRules) {
            return securityRules(Output.of(securityRules));
        }

        /**
         * @param securityRules A collection of security rules of the network security group.
         * 
         * @return builder
         * 
         */
        public Builder securityRules(SecurityRuleArgs... securityRules) {
            return securityRules(List.of(securityRules));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public NetworkSecurityGroupArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
