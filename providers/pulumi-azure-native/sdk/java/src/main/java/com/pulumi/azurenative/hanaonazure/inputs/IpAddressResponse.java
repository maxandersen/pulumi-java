// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hanaonazure.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the IP address of the network interface.
 * 
 */
public final class IpAddressResponse extends com.pulumi.resources.InvokeArgs {

    public static final IpAddressResponse Empty = new IpAddressResponse();

    /**
     * Specifies the IP address of the network interface.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable String ipAddress;

    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    private IpAddressResponse() {}

    private IpAddressResponse(IpAddressResponse $) {
        this.ipAddress = $.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpAddressResponse $;

        public Builder() {
            $ = new IpAddressResponse();
        }

        public Builder(IpAddressResponse defaults) {
            $ = new IpAddressResponse(Objects.requireNonNull(defaults));
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public IpAddressResponse build() {
            return $;
        }
    }

}
