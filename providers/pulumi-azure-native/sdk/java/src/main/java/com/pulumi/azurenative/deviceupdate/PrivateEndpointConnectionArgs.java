// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deviceupdate;

import com.pulumi.azurenative.deviceupdate.inputs.PrivateLinkServiceConnectionStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * Account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return Account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Array of group IDs.
     * 
     */
    @Import(name="groupIds")
    private @Nullable Output<List<String>> groupIds;

    /**
     * @return Array of group IDs.
     * 
     */
    public Optional<Output<List<String>>> groupIds() {
        return Optional.ofNullable(this.groupIds);
    }

    /**
     * The name of the private endpoint connection associated with the Azure resource
     * 
     */
    @Import(name="privateEndpointConnectionName")
    private @Nullable Output<String> privateEndpointConnectionName;

    /**
     * @return The name of the private endpoint connection associated with the Azure resource
     * 
     */
    public Optional<Output<String>> privateEndpointConnectionName() {
        return Optional.ofNullable(this.privateEndpointConnectionName);
    }

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Import(name="privateLinkServiceConnectionState", required=true)
    private Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    /**
     * @return A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    public Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private PrivateEndpointConnectionArgs() {}

    private PrivateEndpointConnectionArgs(PrivateEndpointConnectionArgs $) {
        this.accountName = $.accountName;
        this.groupIds = $.groupIds;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new PrivateEndpointConnectionArgs();
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
            $ = new PrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param groupIds Array of group IDs.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(@Nullable Output<List<String>> groupIds) {
            $.groupIds = groupIds;
            return this;
        }

        /**
         * @param groupIds Array of group IDs.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(List<String> groupIds) {
            return groupIds(Output.of(groupIds));
        }

        /**
         * @param groupIds Array of group IDs.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }

        /**
         * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure resource
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        /**
         * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure resource
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            return privateEndpointConnectionName(Output.of(privateEndpointConnectionName));
        }

        /**
         * @param privateLinkServiceConnectionState A collection of information about the state of the connection between service consumer and provider.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState A collection of information about the state of the connection between service consumer and provider.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            return privateLinkServiceConnectionState(Output.of(privateLinkServiceConnectionState));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public PrivateEndpointConnectionArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.privateLinkServiceConnectionState = Objects.requireNonNull($.privateLinkServiceConnectionState, "expected parameter 'privateLinkServiceConnectionState' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
