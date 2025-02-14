// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridcompute;

import com.pulumi.azurenative.hybridcompute.inputs.LocationDataArgs;
import com.pulumi.azurenative.hybridcompute.inputs.MachineIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MachineArgs extends com.pulumi.resources.ResourceArgs {

    public static final MachineArgs Empty = new MachineArgs();

    /**
     * Public Key that the client provides to be used during initial resource onboarding
     * 
     */
    @Import(name="clientPublicKey")
    private @Nullable Output<String> clientPublicKey;

    /**
     * @return Public Key that the client provides to be used during initial resource onboarding
     * 
     */
    public Optional<Output<String>> clientPublicKey() {
        return Optional.ofNullable(this.clientPublicKey);
    }

    @Import(name="identity")
    private @Nullable Output<MachineIdentityArgs> identity;

    public Optional<Output<MachineIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Metadata pertaining to the geographic location of the resource.
     * 
     */
    @Import(name="locationData")
    private @Nullable Output<LocationDataArgs> locationData;

    /**
     * @return Metadata pertaining to the geographic location of the resource.
     * 
     */
    public Optional<Output<LocationDataArgs>> locationData() {
        return Optional.ofNullable(this.locationData);
    }

    /**
     * The name of the hybrid machine.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the hybrid machine.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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

    /**
     * Specifies the hybrid machine unique ID.
     * 
     */
    @Import(name="vmId")
    private @Nullable Output<String> vmId;

    /**
     * @return Specifies the hybrid machine unique ID.
     * 
     */
    public Optional<Output<String>> vmId() {
        return Optional.ofNullable(this.vmId);
    }

    private MachineArgs() {}

    private MachineArgs(MachineArgs $) {
        this.clientPublicKey = $.clientPublicKey;
        this.identity = $.identity;
        this.location = $.location;
        this.locationData = $.locationData;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.vmId = $.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MachineArgs $;

        public Builder() {
            $ = new MachineArgs();
        }

        public Builder(MachineArgs defaults) {
            $ = new MachineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientPublicKey Public Key that the client provides to be used during initial resource onboarding
         * 
         * @return builder
         * 
         */
        public Builder clientPublicKey(@Nullable Output<String> clientPublicKey) {
            $.clientPublicKey = clientPublicKey;
            return this;
        }

        /**
         * @param clientPublicKey Public Key that the client provides to be used during initial resource onboarding
         * 
         * @return builder
         * 
         */
        public Builder clientPublicKey(String clientPublicKey) {
            return clientPublicKey(Output.of(clientPublicKey));
        }

        public Builder identity(@Nullable Output<MachineIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(MachineIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param locationData Metadata pertaining to the geographic location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder locationData(@Nullable Output<LocationDataArgs> locationData) {
            $.locationData = locationData;
            return this;
        }

        /**
         * @param locationData Metadata pertaining to the geographic location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder locationData(LocationDataArgs locationData) {
            return locationData(Output.of(locationData));
        }

        /**
         * @param name The name of the hybrid machine.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the hybrid machine.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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

        /**
         * @param vmId Specifies the hybrid machine unique ID.
         * 
         * @return builder
         * 
         */
        public Builder vmId(@Nullable Output<String> vmId) {
            $.vmId = vmId;
            return this;
        }

        /**
         * @param vmId Specifies the hybrid machine unique ID.
         * 
         * @return builder
         * 
         */
        public Builder vmId(String vmId) {
            return vmId(Output.of(vmId));
        }

        public MachineArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
