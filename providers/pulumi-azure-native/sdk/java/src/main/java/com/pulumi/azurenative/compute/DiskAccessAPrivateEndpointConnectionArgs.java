// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.compute.inputs.PrivateLinkServiceConnectionStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskAccessAPrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskAccessAPrivateEndpointConnectionArgs Empty = new DiskAccessAPrivateEndpointConnectionArgs();

    /**
     * The name of the disk access resource that is being created. The name can&#39;t be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * 
     */
    @Import(name="diskAccessName", required=true)
    private Output<String> diskAccessName;

    public Output<String> diskAccessName() {
        return this.diskAccessName;
    }

    /**
     * The name of the private endpoint connection
     * 
     */
    @Import(name="privateEndpointConnectionName")
    private @Nullable Output<String> privateEndpointConnectionName;

    public Optional<Output<String>> privateEndpointConnectionName() {
        return Optional.ofNullable(this.privateEndpointConnectionName);
    }

    /**
     * A collection of information about the state of the connection between DiskAccess and Virtual Network.
     * 
     */
    @Import(name="privateLinkServiceConnectionState", required=true)
    private Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private DiskAccessAPrivateEndpointConnectionArgs() {}

    private DiskAccessAPrivateEndpointConnectionArgs(DiskAccessAPrivateEndpointConnectionArgs $) {
        this.diskAccessName = $.diskAccessName;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskAccessAPrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskAccessAPrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new DiskAccessAPrivateEndpointConnectionArgs();
        }

        public Builder(DiskAccessAPrivateEndpointConnectionArgs defaults) {
            $ = new DiskAccessAPrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder diskAccessName(Output<String> diskAccessName) {
            $.diskAccessName = diskAccessName;
            return this;
        }

        public Builder diskAccessName(String diskAccessName) {
            return diskAccessName(Output.of(diskAccessName));
        }

        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            return privateEndpointConnectionName(Output.of(privateEndpointConnectionName));
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

        public DiskAccessAPrivateEndpointConnectionArgs build() {
            $.diskAccessName = Objects.requireNonNull($.diskAccessName, "expected parameter 'diskAccessName' to be non-null");
            $.privateLinkServiceConnectionState = Objects.requireNonNull($.privateLinkServiceConnectionState, "expected parameter 'privateLinkServiceConnectionState' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
