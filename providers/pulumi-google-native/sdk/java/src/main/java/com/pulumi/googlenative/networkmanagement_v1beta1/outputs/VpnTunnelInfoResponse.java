// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VpnTunnelInfoResponse {
    /**
     * Name of a VPN tunnel.
     * 
     */
    private final String displayName;
    /**
     * URI of a Compute Engine network where the VPN tunnel is configured.
     * 
     */
    private final String networkUri;
    /**
     * Name of a Google Cloud region where this VPN tunnel is configured.
     * 
     */
    private final String region;
    /**
     * URI of a VPN gateway at remote end of the tunnel.
     * 
     */
    private final String remoteGateway;
    /**
     * Remote VPN gateway's IP address.
     * 
     */
    private final String remoteGatewayIp;
    /**
     * Type of the routing policy.
     * 
     */
    private final String routingType;
    /**
     * URI of the VPN gateway at local end of the tunnel.
     * 
     */
    private final String sourceGateway;
    /**
     * Local VPN gateway's IP address.
     * 
     */
    private final String sourceGatewayIp;
    /**
     * URI of a VPN tunnel.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private VpnTunnelInfoResponse(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("networkUri") String networkUri,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("remoteGateway") String remoteGateway,
        @CustomType.Parameter("remoteGatewayIp") String remoteGatewayIp,
        @CustomType.Parameter("routingType") String routingType,
        @CustomType.Parameter("sourceGateway") String sourceGateway,
        @CustomType.Parameter("sourceGatewayIp") String sourceGatewayIp,
        @CustomType.Parameter("uri") String uri) {
        this.displayName = displayName;
        this.networkUri = networkUri;
        this.region = region;
        this.remoteGateway = remoteGateway;
        this.remoteGatewayIp = remoteGatewayIp;
        this.routingType = routingType;
        this.sourceGateway = sourceGateway;
        this.sourceGatewayIp = sourceGatewayIp;
        this.uri = uri;
    }

    /**
     * Name of a VPN tunnel.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * URI of a Compute Engine network where the VPN tunnel is configured.
     * 
    */
    public String networkUri() {
        return this.networkUri;
    }
    /**
     * Name of a Google Cloud region where this VPN tunnel is configured.
     * 
    */
    public String region() {
        return this.region;
    }
    /**
     * URI of a VPN gateway at remote end of the tunnel.
     * 
    */
    public String remoteGateway() {
        return this.remoteGateway;
    }
    /**
     * Remote VPN gateway's IP address.
     * 
    */
    public String remoteGatewayIp() {
        return this.remoteGatewayIp;
    }
    /**
     * Type of the routing policy.
     * 
    */
    public String routingType() {
        return this.routingType;
    }
    /**
     * URI of the VPN gateway at local end of the tunnel.
     * 
    */
    public String sourceGateway() {
        return this.sourceGateway;
    }
    /**
     * Local VPN gateway's IP address.
     * 
    */
    public String sourceGatewayIp() {
        return this.sourceGatewayIp;
    }
    /**
     * URI of a VPN tunnel.
     * 
    */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnTunnelInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String networkUri;
        private String region;
        private String remoteGateway;
        private String remoteGatewayIp;
        private String routingType;
        private String sourceGateway;
        private String sourceGatewayIp;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnTunnelInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.networkUri = defaults.networkUri;
    	      this.region = defaults.region;
    	      this.remoteGateway = defaults.remoteGateway;
    	      this.remoteGatewayIp = defaults.remoteGatewayIp;
    	      this.routingType = defaults.routingType;
    	      this.sourceGateway = defaults.sourceGateway;
    	      this.sourceGatewayIp = defaults.sourceGatewayIp;
    	      this.uri = defaults.uri;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder remoteGateway(String remoteGateway) {
            this.remoteGateway = Objects.requireNonNull(remoteGateway);
            return this;
        }
        public Builder remoteGatewayIp(String remoteGatewayIp) {
            this.remoteGatewayIp = Objects.requireNonNull(remoteGatewayIp);
            return this;
        }
        public Builder routingType(String routingType) {
            this.routingType = Objects.requireNonNull(routingType);
            return this;
        }
        public Builder sourceGateway(String sourceGateway) {
            this.sourceGateway = Objects.requireNonNull(sourceGateway);
            return this;
        }
        public Builder sourceGatewayIp(String sourceGatewayIp) {
            this.sourceGatewayIp = Objects.requireNonNull(sourceGatewayIp);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public VpnTunnelInfoResponse build() {
            return new VpnTunnelInfoResponse(displayName, networkUri, region, remoteGateway, remoteGatewayIp, routingType, sourceGateway, sourceGatewayIp, uri);
        }
    }
}
