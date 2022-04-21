// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hanaonazure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the IP address of the network interface.
 * 
 */
public final class IpAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpAddressArgs Empty = new IpAddressArgs();

    /**
     * Specifies the IP address of the network interface.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    private IpAddressArgs() {}

    private IpAddressArgs(IpAddressArgs $) {
        this.ipAddress = $.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpAddressArgs $;

        public Builder() {
            $ = new IpAddressArgs();
        }

        public Builder(IpAddressArgs defaults) {
            $ = new IpAddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public IpAddressArgs build() {
            return $;
        }
    }

}
