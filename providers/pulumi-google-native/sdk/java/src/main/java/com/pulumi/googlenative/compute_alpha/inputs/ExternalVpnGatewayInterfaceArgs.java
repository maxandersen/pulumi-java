// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
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
      private final @Nullable Output<Integer> id;

    public Output<Integer> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * IP address of the interface in the external VPN gateway. Only IPv4 is supported. This IP address can be either from your on-premise gateway or another Cloud provider&#39;s VPN gateway, it cannot be an IP address from Google Compute Engine.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> ipAddress() {
        return this.ipAddress == null ? Codegen.empty() : this.ipAddress;
    }

    public ExternalVpnGatewayInterfaceArgs(
        @Nullable Output<Integer> id,
        @Nullable Output<String> ipAddress) {
        this.id = id;
        this.ipAddress = ipAddress;
    }

    private ExternalVpnGatewayInterfaceArgs() {
        this.id = Codegen.empty();
        this.ipAddress = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalVpnGatewayInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> id;
        private @Nullable Output<String> ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalVpnGatewayInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder id(@Nullable Output<Integer> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable Integer id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Codegen.ofNullable(ipAddress);
            return this;
        }        public ExternalVpnGatewayInterfaceArgs build() {
            return new ExternalVpnGatewayInterfaceArgs(id, ipAddress);
        }
    }
}
