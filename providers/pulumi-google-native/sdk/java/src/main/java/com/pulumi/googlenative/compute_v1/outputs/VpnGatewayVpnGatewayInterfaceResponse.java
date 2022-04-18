// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VpnGatewayVpnGatewayInterfaceResponse {
    /**
     * URL of the VLAN attachment (interconnectAttachment) resource for this VPN gateway interface. When the value of this field is present, the VPN gateway is used for IPsec-encrypted Cloud Interconnect; all egress or ingress traffic for this VPN gateway interface goes through the specified VLAN attachment resource. Not currently available publicly.
     * 
     */
    private final String interconnectAttachment;
    /**
     * IP address for this VPN interface associated with the VPN gateway. The IP address could be either a regional external IP address or a regional internal IP address. The two IP addresses for a VPN gateway must be all regional external or regional internal IP addresses. There cannot be a mix of regional external IP addresses and regional internal IP addresses. For IPsec-encrypted Cloud Interconnect, the IP addresses for both interfaces could either be regional internal IP addresses or regional external IP addresses. For regular (non IPsec-encrypted Cloud Interconnect) HA VPN tunnels, the IP address must be a regional external IP address.
     * 
     */
    private final String ipAddress;

    @CustomType.Constructor
    private VpnGatewayVpnGatewayInterfaceResponse(
        @CustomType.Parameter("interconnectAttachment") String interconnectAttachment,
        @CustomType.Parameter("ipAddress") String ipAddress) {
        this.interconnectAttachment = interconnectAttachment;
        this.ipAddress = ipAddress;
    }

    /**
     * URL of the VLAN attachment (interconnectAttachment) resource for this VPN gateway interface. When the value of this field is present, the VPN gateway is used for IPsec-encrypted Cloud Interconnect; all egress or ingress traffic for this VPN gateway interface goes through the specified VLAN attachment resource. Not currently available publicly.
     * 
    */
    public String interconnectAttachment() {
        return this.interconnectAttachment;
    }
    /**
     * IP address for this VPN interface associated with the VPN gateway. The IP address could be either a regional external IP address or a regional internal IP address. The two IP addresses for a VPN gateway must be all regional external or regional internal IP addresses. There cannot be a mix of regional external IP addresses and regional internal IP addresses. For IPsec-encrypted Cloud Interconnect, the IP addresses for both interfaces could either be regional internal IP addresses or regional external IP addresses. For regular (non IPsec-encrypted Cloud Interconnect) HA VPN tunnels, the IP address must be a regional external IP address.
     * 
    */
    public String ipAddress() {
        return this.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayVpnGatewayInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String interconnectAttachment;
        private String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayVpnGatewayInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interconnectAttachment = defaults.interconnectAttachment;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder interconnectAttachment(String interconnectAttachment) {
            this.interconnectAttachment = Objects.requireNonNull(interconnectAttachment);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }        public VpnGatewayVpnGatewayInterfaceResponse build() {
            return new VpnGatewayVpnGatewayInterfaceResponse(interconnectAttachment, ipAddress);
        }
    }
}
