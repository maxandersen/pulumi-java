// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * For display only. Metadata associated with a Compute Engine VPN gateway.
 * 
 */
public final class VpnGatewayInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final VpnGatewayInfoResponse Empty = new VpnGatewayInfoResponse();

    /**
     * Name of a VPN gateway.
     * 
     */
    @Import(name="displayName", required=true)
    private String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * IP address of the VPN gateway.
     * 
     */
    @Import(name="ipAddress", required=true)
    private String ipAddress;

    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * URI of a Compute Engine network where the VPN gateway is configured.
     * 
     */
    @Import(name="networkUri", required=true)
    private String networkUri;

    public String networkUri() {
        return this.networkUri;
    }

    /**
     * Name of a Google Cloud region where this VPN gateway is configured.
     * 
     */
    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    /**
     * URI of a VPN gateway.
     * 
     */
    @Import(name="uri", required=true)
    private String uri;

    public String uri() {
        return this.uri;
    }

    /**
     * A VPN tunnel that is associated with this VPN gateway. There may be multiple VPN tunnels configured on a VPN gateway, and only the one relevant to the test is displayed.
     * 
     */
    @Import(name="vpnTunnelUri", required=true)
    private String vpnTunnelUri;

    public String vpnTunnelUri() {
        return this.vpnTunnelUri;
    }

    private VpnGatewayInfoResponse() {}

    private VpnGatewayInfoResponse(VpnGatewayInfoResponse $) {
        this.displayName = $.displayName;
        this.ipAddress = $.ipAddress;
        this.networkUri = $.networkUri;
        this.region = $.region;
        this.uri = $.uri;
        this.vpnTunnelUri = $.vpnTunnelUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnGatewayInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnGatewayInfoResponse $;

        public Builder() {
            $ = new VpnGatewayInfoResponse();
        }

        public Builder(VpnGatewayInfoResponse defaults) {
            $ = new VpnGatewayInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder displayName(String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder networkUri(String networkUri) {
            $.networkUri = networkUri;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public Builder uri(String uri) {
            $.uri = uri;
            return this;
        }

        public Builder vpnTunnelUri(String vpnTunnelUri) {
            $.vpnTunnelUri = vpnTunnelUri;
            return this;
        }

        public VpnGatewayInfoResponse build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.ipAddress = Objects.requireNonNull($.ipAddress, "expected parameter 'ipAddress' to be non-null");
            $.networkUri = Objects.requireNonNull($.networkUri, "expected parameter 'networkUri' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            $.vpnTunnelUri = Objects.requireNonNull($.vpnTunnelUri, "expected parameter 'vpnTunnelUri' to be non-null");
            return $;
        }
    }

}
