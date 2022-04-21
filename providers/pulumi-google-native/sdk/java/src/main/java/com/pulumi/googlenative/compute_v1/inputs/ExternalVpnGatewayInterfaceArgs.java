// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The interface for the external VPN gateway.
 * 
 */
public final class ExternalVpnGatewayInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalVpnGatewayInterfaceArgs Empty = new ExternalVpnGatewayInterfaceArgs();

    /**
     * The numeric ID of this interface. The allowed input values for this id for different redundancy types of external VPN gateway: - SINGLE_IP_INTERNALLY_REDUNDANT - 0 - TWO_IPS_REDUNDANCY - 0, 1 - FOUR_IPS_REDUNDANCY - 0, 1, 2, 3
     * 
     */
    @Import(name="id")
    private @Nullable Output<Integer> id;

    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * IP address of the interface in the external VPN gateway. Only IPv4 is supported. This IP address can be either from your on-premise gateway or another Cloud provider&#39;s VPN gateway, it cannot be an IP address from Google Compute Engine.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    private ExternalVpnGatewayInterfaceArgs() {}

    private ExternalVpnGatewayInterfaceArgs(ExternalVpnGatewayInterfaceArgs $) {
        this.id = $.id;
        this.ipAddress = $.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalVpnGatewayInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalVpnGatewayInterfaceArgs $;

        public Builder() {
            $ = new ExternalVpnGatewayInterfaceArgs();
        }

        public Builder(ExternalVpnGatewayInterfaceArgs defaults) {
            $ = new ExternalVpnGatewayInterfaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public ExternalVpnGatewayInterfaceArgs build() {
            return $;
        }
    }

}
