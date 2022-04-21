// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer;

import com.pulumi.azurenative.videoanalyzer.inputs.PrivateLinkServiceConnectionStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * The Video Analyzer account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Private endpoint connection name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Import(name="privateLinkServiceConnectionState", required=true)
    private Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private PrivateEndpointConnectionArgs() {}

    private PrivateEndpointConnectionArgs(PrivateEndpointConnectionArgs $) {
        this.accountName = $.accountName;
        this.name = $.name;
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

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder privateLinkServiceConnectionState(Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            return privateLinkServiceConnectionState(Output.of(privateLinkServiceConnectionState));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

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
