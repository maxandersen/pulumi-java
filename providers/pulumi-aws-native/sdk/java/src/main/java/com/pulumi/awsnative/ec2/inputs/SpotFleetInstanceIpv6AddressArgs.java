// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SpotFleetInstanceIpv6AddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotFleetInstanceIpv6AddressArgs Empty = new SpotFleetInstanceIpv6AddressArgs();

    @Import(name="ipv6Address", required=true)
    private Output<String> ipv6Address;

    public Output<String> ipv6Address() {
        return this.ipv6Address;
    }

    private SpotFleetInstanceIpv6AddressArgs() {}

    private SpotFleetInstanceIpv6AddressArgs(SpotFleetInstanceIpv6AddressArgs $) {
        this.ipv6Address = $.ipv6Address;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetInstanceIpv6AddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetInstanceIpv6AddressArgs $;

        public Builder() {
            $ = new SpotFleetInstanceIpv6AddressArgs();
        }

        public Builder(SpotFleetInstanceIpv6AddressArgs defaults) {
            $ = new SpotFleetInstanceIpv6AddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipv6Address(Output<String> ipv6Address) {
            $.ipv6Address = ipv6Address;
            return this;
        }

        public Builder ipv6Address(String ipv6Address) {
            return ipv6Address(Output.of(ipv6Address));
        }

        public SpotFleetInstanceIpv6AddressArgs build() {
            $.ipv6Address = Objects.requireNonNull($.ipv6Address, "expected parameter 'ipv6Address' to be non-null");
            return $;
        }
    }

}
