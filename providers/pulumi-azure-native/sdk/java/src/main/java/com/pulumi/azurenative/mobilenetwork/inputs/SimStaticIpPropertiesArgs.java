// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork.inputs;

import com.pulumi.azurenative.mobilenetwork.inputs.AttachedDataNetworkResourceIdArgs;
import com.pulumi.azurenative.mobilenetwork.inputs.SimStaticIpPropertiesStaticIpArgs;
import com.pulumi.azurenative.mobilenetwork.inputs.SliceResourceIdArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Static IP configuration for a sim, scoped to a particular attached data network and slice.
 * 
 */
public final class SimStaticIpPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SimStaticIpPropertiesArgs Empty = new SimStaticIpPropertiesArgs();

    /**
     * The attached data network on which the static IP address will be used. The combination of attachedDataNetwork and slice defines the network scope of the IP address.
     * 
     */
    @Import(name="attachedDataNetwork")
    private @Nullable Output<AttachedDataNetworkResourceIdArgs> attachedDataNetwork;

    /**
     * @return The attached data network on which the static IP address will be used. The combination of attachedDataNetwork and slice defines the network scope of the IP address.
     * 
     */
    public Optional<Output<AttachedDataNetworkResourceIdArgs>> attachedDataNetwork() {
        return Optional.ofNullable(this.attachedDataNetwork);
    }

    /**
     * The network slice on which the static IP address will be used. The combination of attachedDataNetwork and slice defines the network scope of the IP address.
     * 
     */
    @Import(name="slice")
    private @Nullable Output<SliceResourceIdArgs> slice;

    /**
     * @return The network slice on which the static IP address will be used. The combination of attachedDataNetwork and slice defines the network scope of the IP address.
     * 
     */
    public Optional<Output<SliceResourceIdArgs>> slice() {
        return Optional.ofNullable(this.slice);
    }

    /**
     * The static IP configuration for the sim to use at the defined network scope.
     * 
     */
    @Import(name="staticIp")
    private @Nullable Output<SimStaticIpPropertiesStaticIpArgs> staticIp;

    /**
     * @return The static IP configuration for the sim to use at the defined network scope.
     * 
     */
    public Optional<Output<SimStaticIpPropertiesStaticIpArgs>> staticIp() {
        return Optional.ofNullable(this.staticIp);
    }

    private SimStaticIpPropertiesArgs() {}

    private SimStaticIpPropertiesArgs(SimStaticIpPropertiesArgs $) {
        this.attachedDataNetwork = $.attachedDataNetwork;
        this.slice = $.slice;
        this.staticIp = $.staticIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SimStaticIpPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SimStaticIpPropertiesArgs $;

        public Builder() {
            $ = new SimStaticIpPropertiesArgs();
        }

        public Builder(SimStaticIpPropertiesArgs defaults) {
            $ = new SimStaticIpPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attachedDataNetwork The attached data network on which the static IP address will be used. The combination of attachedDataNetwork and slice defines the network scope of the IP address.
         * 
         * @return builder
         * 
         */
        public Builder attachedDataNetwork(@Nullable Output<AttachedDataNetworkResourceIdArgs> attachedDataNetwork) {
            $.attachedDataNetwork = attachedDataNetwork;
            return this;
        }

        /**
         * @param attachedDataNetwork The attached data network on which the static IP address will be used. The combination of attachedDataNetwork and slice defines the network scope of the IP address.
         * 
         * @return builder
         * 
         */
        public Builder attachedDataNetwork(AttachedDataNetworkResourceIdArgs attachedDataNetwork) {
            return attachedDataNetwork(Output.of(attachedDataNetwork));
        }

        /**
         * @param slice The network slice on which the static IP address will be used. The combination of attachedDataNetwork and slice defines the network scope of the IP address.
         * 
         * @return builder
         * 
         */
        public Builder slice(@Nullable Output<SliceResourceIdArgs> slice) {
            $.slice = slice;
            return this;
        }

        /**
         * @param slice The network slice on which the static IP address will be used. The combination of attachedDataNetwork and slice defines the network scope of the IP address.
         * 
         * @return builder
         * 
         */
        public Builder slice(SliceResourceIdArgs slice) {
            return slice(Output.of(slice));
        }

        /**
         * @param staticIp The static IP configuration for the sim to use at the defined network scope.
         * 
         * @return builder
         * 
         */
        public Builder staticIp(@Nullable Output<SimStaticIpPropertiesStaticIpArgs> staticIp) {
            $.staticIp = staticIp;
            return this;
        }

        /**
         * @param staticIp The static IP configuration for the sim to use at the defined network scope.
         * 
         * @return builder
         * 
         */
        public Builder staticIp(SimStaticIpPropertiesStaticIpArgs staticIp) {
            return staticIp(Output.of(staticIp));
        }

        public SimStaticIpPropertiesArgs build() {
            return $;
        }
    }

}
