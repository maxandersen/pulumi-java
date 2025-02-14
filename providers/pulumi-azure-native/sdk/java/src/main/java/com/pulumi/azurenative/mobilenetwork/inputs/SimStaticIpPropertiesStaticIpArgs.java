// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The static IP configuration for the sim to use at the defined network scope.
 * 
 */
public final class SimStaticIpPropertiesStaticIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final SimStaticIpPropertiesStaticIpArgs Empty = new SimStaticIpPropertiesStaticIpArgs();

    /**
     * The IPv4 address assigned to the sim at this network scope. This address must be in the userEquipmentStaticAddressPoolPrefix defined in the attachedDataNetwork.
     * 
     */
    @Import(name="ipv4Address")
    private @Nullable Output<String> ipv4Address;

    /**
     * @return The IPv4 address assigned to the sim at this network scope. This address must be in the userEquipmentStaticAddressPoolPrefix defined in the attachedDataNetwork.
     * 
     */
    public Optional<Output<String>> ipv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }

    private SimStaticIpPropertiesStaticIpArgs() {}

    private SimStaticIpPropertiesStaticIpArgs(SimStaticIpPropertiesStaticIpArgs $) {
        this.ipv4Address = $.ipv4Address;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SimStaticIpPropertiesStaticIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SimStaticIpPropertiesStaticIpArgs $;

        public Builder() {
            $ = new SimStaticIpPropertiesStaticIpArgs();
        }

        public Builder(SimStaticIpPropertiesStaticIpArgs defaults) {
            $ = new SimStaticIpPropertiesStaticIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipv4Address The IPv4 address assigned to the sim at this network scope. This address must be in the userEquipmentStaticAddressPoolPrefix defined in the attachedDataNetwork.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(@Nullable Output<String> ipv4Address) {
            $.ipv4Address = ipv4Address;
            return this;
        }

        /**
         * @param ipv4Address The IPv4 address assigned to the sim at this network scope. This address must be in the userEquipmentStaticAddressPoolPrefix defined in the attachedDataNetwork.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(String ipv4Address) {
            return ipv4Address(Output.of(ipv4Address));
        }

        public SimStaticIpPropertiesStaticIpArgs build() {
            return $;
        }
    }

}
