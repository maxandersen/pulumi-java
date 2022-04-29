// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere;

import com.pulumi.azurenative.connectedvmwarevsphere.inputs.ExtendedLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkArgs extends ResourceArgs {

    public static final VirtualNetworkArgs Empty = new VirtualNetworkArgs();

    /**
     * Gets or sets the extended location.
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable Output<ExtendedLocationArgs> extendedLocation;

    /**
     * @return Gets or sets the extended location.
     * 
     */
    public Optional<Output<ExtendedLocationArgs>> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }

    /**
     * Gets or sets the inventory Item ID for the virtual network.
     * 
     */
    @Import(name="inventoryItemId")
    private @Nullable Output<String> inventoryItemId;

    /**
     * @return Gets or sets the inventory Item ID for the virtual network.
     * 
     */
    public Optional<Output<String>> inventoryItemId() {
        return Optional.ofNullable(this.inventoryItemId);
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Gets or sets the location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Gets or sets the location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual network.
     * 
     */
    @Import(name="moRefId")
    private @Nullable Output<String> moRefId;

    /**
     * @return Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual network.
     * 
     */
    public Optional<Output<String>> moRefId() {
        return Optional.ofNullable(this.moRefId);
    }

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Resource Group Name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Gets or sets the Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Gets or sets the ARM Id of the vCenter resource in which this template resides.
     * 
     */
    @Import(name="vCenterId")
    private @Nullable Output<String> vCenterId;

    /**
     * @return Gets or sets the ARM Id of the vCenter resource in which this template resides.
     * 
     */
    public Optional<Output<String>> vCenterId() {
        return Optional.ofNullable(this.vCenterId);
    }

    /**
     * Name of the virtual network resource.
     * 
     */
    @Import(name="virtualNetworkName")
    private @Nullable Output<String> virtualNetworkName;

    /**
     * @return Name of the virtual network resource.
     * 
     */
    public Optional<Output<String>> virtualNetworkName() {
        return Optional.ofNullable(this.virtualNetworkName);
    }

    private VirtualNetworkArgs() {}

    private VirtualNetworkArgs(VirtualNetworkArgs $) {
        this.extendedLocation = $.extendedLocation;
        this.inventoryItemId = $.inventoryItemId;
        this.kind = $.kind;
        this.location = $.location;
        this.moRefId = $.moRefId;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.vCenterId = $.vCenterId;
        this.virtualNetworkName = $.virtualNetworkName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkArgs $;

        public Builder() {
            $ = new VirtualNetworkArgs();
        }

        public Builder(VirtualNetworkArgs defaults) {
            $ = new VirtualNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param extendedLocation Gets or sets the extended location.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        /**
         * @param extendedLocation Gets or sets the extended location.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(ExtendedLocationArgs extendedLocation) {
            return extendedLocation(Output.of(extendedLocation));
        }

        /**
         * @param inventoryItemId Gets or sets the inventory Item ID for the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder inventoryItemId(@Nullable Output<String> inventoryItemId) {
            $.inventoryItemId = inventoryItemId;
            return this;
        }

        /**
         * @param inventoryItemId Gets or sets the inventory Item ID for the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder inventoryItemId(String inventoryItemId) {
            return inventoryItemId(Output.of(inventoryItemId));
        }

        /**
         * @param kind Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param location Gets or sets the location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Gets or sets the location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param moRefId Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder moRefId(@Nullable Output<String> moRefId) {
            $.moRefId = moRefId;
            return this;
        }

        /**
         * @param moRefId Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder moRefId(String moRefId) {
            return moRefId(Output.of(moRefId));
        }

        /**
         * @param resourceGroupName The Resource Group Name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Resource Group Name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Gets or sets the Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Gets or sets the Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vCenterId Gets or sets the ARM Id of the vCenter resource in which this template resides.
         * 
         * @return builder
         * 
         */
        public Builder vCenterId(@Nullable Output<String> vCenterId) {
            $.vCenterId = vCenterId;
            return this;
        }

        /**
         * @param vCenterId Gets or sets the ARM Id of the vCenter resource in which this template resides.
         * 
         * @return builder
         * 
         */
        public Builder vCenterId(String vCenterId) {
            return vCenterId(Output.of(vCenterId));
        }

        /**
         * @param virtualNetworkName Name of the virtual network resource.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkName(@Nullable Output<String> virtualNetworkName) {
            $.virtualNetworkName = virtualNetworkName;
            return this;
        }

        /**
         * @param virtualNetworkName Name of the virtual network resource.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkName(String virtualNetworkName) {
            return virtualNetworkName(Output.of(virtualNetworkName));
        }

        public VirtualNetworkArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
