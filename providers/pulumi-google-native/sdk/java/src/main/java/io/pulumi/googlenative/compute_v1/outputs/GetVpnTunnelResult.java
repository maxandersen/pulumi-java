// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetVpnTunnelResult {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Detailed status message for the VPN tunnel.
     * 
     */
    private final String detailedStatus;
    /**
     * IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
     * 
     */
    private final Integer ikeVersion;
    /**
     * Type of resource. Always compute#vpnTunnel for VPN tunnels.
     * 
     */
    private final String kind;
    /**
     * Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
     * 
     */
    private final List<String> localTrafficSelector;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
     * 
     */
    private final String peerExternalGateway;
    /**
     * The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created.
     * 
     */
    private final Integer peerExternalGatewayInterface;
    /**
     * URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer GCP VPN gateway.
     * 
     */
    private final String peerGcpGateway;
    /**
     * IP address of the peer VPN gateway. Only IPv4 is supported.
     * 
     */
    private final String peerIp;
    /**
     * URL of the region where the VPN tunnel resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
     * 
     */
    private final List<String> remoteTrafficSelector;
    /**
     * URL of the router resource to be used for dynamic routing.
     * 
     */
    private final String router;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
     * 
     */
    private final String sharedSecret;
    /**
     * Hash of the shared secret.
     * 
     */
    private final String sharedSecretHash;
    /**
     * The status of the VPN tunnel, which can be one of the following: - PROVISIONING: Resource is being allocated for the VPN tunnel. - WAITING_FOR_FULL_CONFIG: Waiting to receive all VPN-related configs from the user. Network, TargetVpnGateway, VpnTunnel, ForwardingRule, and Route resources are needed to setup the VPN tunnel. - FIRST_HANDSHAKE: Successful first handshake with the peer VPN. - ESTABLISHED: Secure session is successfully established with the peer VPN. - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS - AUTHORIZATION_ERROR: Auth error (for example, bad shared secret). - NEGOTIATION_FAILURE: Handshake failed. - DEPROVISIONING: Resources are being deallocated for the VPN tunnel. - FAILED: Tunnel creation has failed and the tunnel is not ready to be used. - NO_INCOMING_PACKETS: No incoming packets from peer. - REJECTED: Tunnel configuration was rejected, can be result of being denied access. - ALLOCATING_RESOURCES: Cloud VPN is in the process of allocating all required resources. - STOPPED: Tunnel is stopped due to its Forwarding Rules being deleted for Classic VPN tunnels or the project is in frozen state. - PEER_IDENTITY_MISMATCH: Peer identity does not match peer IP, probably behind NAT. - TS_NARROWING_NOT_ALLOWED: Traffic selector narrowing not allowed for an HA-VPN tunnel.
     * 
     */
    private final String status;
    /**
     * URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
     * 
     */
    private final String targetVpnGateway;
    /**
     * URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
     * 
     */
    private final String vpnGateway;
    /**
     * The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
     */
    private final Integer vpnGatewayInterface;

    @OutputCustomType.Constructor
    private GetVpnTunnelResult(
        @OutputCustomType.Parameter("creationTimestamp") String creationTimestamp,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("detailedStatus") String detailedStatus,
        @OutputCustomType.Parameter("ikeVersion") Integer ikeVersion,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("localTrafficSelector") List<String> localTrafficSelector,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("peerExternalGateway") String peerExternalGateway,
        @OutputCustomType.Parameter("peerExternalGatewayInterface") Integer peerExternalGatewayInterface,
        @OutputCustomType.Parameter("peerGcpGateway") String peerGcpGateway,
        @OutputCustomType.Parameter("peerIp") String peerIp,
        @OutputCustomType.Parameter("region") String region,
        @OutputCustomType.Parameter("remoteTrafficSelector") List<String> remoteTrafficSelector,
        @OutputCustomType.Parameter("router") String router,
        @OutputCustomType.Parameter("selfLink") String selfLink,
        @OutputCustomType.Parameter("sharedSecret") String sharedSecret,
        @OutputCustomType.Parameter("sharedSecretHash") String sharedSecretHash,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("targetVpnGateway") String targetVpnGateway,
        @OutputCustomType.Parameter("vpnGateway") String vpnGateway,
        @OutputCustomType.Parameter("vpnGatewayInterface") Integer vpnGatewayInterface) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.detailedStatus = detailedStatus;
        this.ikeVersion = ikeVersion;
        this.kind = kind;
        this.localTrafficSelector = localTrafficSelector;
        this.name = name;
        this.peerExternalGateway = peerExternalGateway;
        this.peerExternalGatewayInterface = peerExternalGatewayInterface;
        this.peerGcpGateway = peerGcpGateway;
        this.peerIp = peerIp;
        this.region = region;
        this.remoteTrafficSelector = remoteTrafficSelector;
        this.router = router;
        this.selfLink = selfLink;
        this.sharedSecret = sharedSecret;
        this.sharedSecretHash = sharedSecretHash;
        this.status = status;
        this.targetVpnGateway = targetVpnGateway;
        this.vpnGateway = vpnGateway;
        this.vpnGatewayInterface = vpnGatewayInterface;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Detailed status message for the VPN tunnel.
     * 
    */
    public String getDetailedStatus() {
        return this.detailedStatus;
    }
    /**
     * IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
     * 
    */
    public Integer getIkeVersion() {
        return this.ikeVersion;
    }
    /**
     * Type of resource. Always compute#vpnTunnel for VPN tunnels.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
     * 
    */
    public List<String> getLocalTrafficSelector() {
        return this.localTrafficSelector;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
     * 
    */
    public String getPeerExternalGateway() {
        return this.peerExternalGateway;
    }
    /**
     * The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created.
     * 
    */
    public Integer getPeerExternalGatewayInterface() {
        return this.peerExternalGatewayInterface;
    }
    /**
     * URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer GCP VPN gateway.
     * 
    */
    public String getPeerGcpGateway() {
        return this.peerGcpGateway;
    }
    /**
     * IP address of the peer VPN gateway. Only IPv4 is supported.
     * 
    */
    public String getPeerIp() {
        return this.peerIp;
    }
    /**
     * URL of the region where the VPN tunnel resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
     * 
    */
    public List<String> getRemoteTrafficSelector() {
        return this.remoteTrafficSelector;
    }
    /**
     * URL of the router resource to be used for dynamic routing.
     * 
    */
    public String getRouter() {
        return this.router;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
     * 
    */
    public String getSharedSecret() {
        return this.sharedSecret;
    }
    /**
     * Hash of the shared secret.
     * 
    */
    public String getSharedSecretHash() {
        return this.sharedSecretHash;
    }
    /**
     * The status of the VPN tunnel, which can be one of the following: - PROVISIONING: Resource is being allocated for the VPN tunnel. - WAITING_FOR_FULL_CONFIG: Waiting to receive all VPN-related configs from the user. Network, TargetVpnGateway, VpnTunnel, ForwardingRule, and Route resources are needed to setup the VPN tunnel. - FIRST_HANDSHAKE: Successful first handshake with the peer VPN. - ESTABLISHED: Secure session is successfully established with the peer VPN. - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS - AUTHORIZATION_ERROR: Auth error (for example, bad shared secret). - NEGOTIATION_FAILURE: Handshake failed. - DEPROVISIONING: Resources are being deallocated for the VPN tunnel. - FAILED: Tunnel creation has failed and the tunnel is not ready to be used. - NO_INCOMING_PACKETS: No incoming packets from peer. - REJECTED: Tunnel configuration was rejected, can be result of being denied access. - ALLOCATING_RESOURCES: Cloud VPN is in the process of allocating all required resources. - STOPPED: Tunnel is stopped due to its Forwarding Rules being deleted for Classic VPN tunnels or the project is in frozen state. - PEER_IDENTITY_MISMATCH: Peer identity does not match peer IP, probably behind NAT. - TS_NARROWING_NOT_ALLOWED: Traffic selector narrowing not allowed for an HA-VPN tunnel.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
     * 
    */
    public String getTargetVpnGateway() {
        return this.targetVpnGateway;
    }
    /**
     * URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
     * 
    */
    public String getVpnGateway() {
        return this.vpnGateway;
    }
    /**
     * The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
    */
    public Integer getVpnGatewayInterface() {
        return this.vpnGatewayInterface;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnTunnelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private String detailedStatus;
        private Integer ikeVersion;
        private String kind;
        private List<String> localTrafficSelector;
        private String name;
        private String peerExternalGateway;
        private Integer peerExternalGatewayInterface;
        private String peerGcpGateway;
        private String peerIp;
        private String region;
        private List<String> remoteTrafficSelector;
        private String router;
        private String selfLink;
        private String sharedSecret;
        private String sharedSecretHash;
        private String status;
        private String targetVpnGateway;
        private String vpnGateway;
        private Integer vpnGatewayInterface;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnTunnelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.detailedStatus = defaults.detailedStatus;
    	      this.ikeVersion = defaults.ikeVersion;
    	      this.kind = defaults.kind;
    	      this.localTrafficSelector = defaults.localTrafficSelector;
    	      this.name = defaults.name;
    	      this.peerExternalGateway = defaults.peerExternalGateway;
    	      this.peerExternalGatewayInterface = defaults.peerExternalGatewayInterface;
    	      this.peerGcpGateway = defaults.peerGcpGateway;
    	      this.peerIp = defaults.peerIp;
    	      this.region = defaults.region;
    	      this.remoteTrafficSelector = defaults.remoteTrafficSelector;
    	      this.router = defaults.router;
    	      this.selfLink = defaults.selfLink;
    	      this.sharedSecret = defaults.sharedSecret;
    	      this.sharedSecretHash = defaults.sharedSecretHash;
    	      this.status = defaults.status;
    	      this.targetVpnGateway = defaults.targetVpnGateway;
    	      this.vpnGateway = defaults.vpnGateway;
    	      this.vpnGatewayInterface = defaults.vpnGatewayInterface;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDetailedStatus(String detailedStatus) {
            this.detailedStatus = Objects.requireNonNull(detailedStatus);
            return this;
        }

        public Builder setIkeVersion(Integer ikeVersion) {
            this.ikeVersion = Objects.requireNonNull(ikeVersion);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLocalTrafficSelector(List<String> localTrafficSelector) {
            this.localTrafficSelector = Objects.requireNonNull(localTrafficSelector);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPeerExternalGateway(String peerExternalGateway) {
            this.peerExternalGateway = Objects.requireNonNull(peerExternalGateway);
            return this;
        }

        public Builder setPeerExternalGatewayInterface(Integer peerExternalGatewayInterface) {
            this.peerExternalGatewayInterface = Objects.requireNonNull(peerExternalGatewayInterface);
            return this;
        }

        public Builder setPeerGcpGateway(String peerGcpGateway) {
            this.peerGcpGateway = Objects.requireNonNull(peerGcpGateway);
            return this;
        }

        public Builder setPeerIp(String peerIp) {
            this.peerIp = Objects.requireNonNull(peerIp);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRemoteTrafficSelector(List<String> remoteTrafficSelector) {
            this.remoteTrafficSelector = Objects.requireNonNull(remoteTrafficSelector);
            return this;
        }

        public Builder setRouter(String router) {
            this.router = Objects.requireNonNull(router);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSharedSecret(String sharedSecret) {
            this.sharedSecret = Objects.requireNonNull(sharedSecret);
            return this;
        }

        public Builder setSharedSecretHash(String sharedSecretHash) {
            this.sharedSecretHash = Objects.requireNonNull(sharedSecretHash);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTargetVpnGateway(String targetVpnGateway) {
            this.targetVpnGateway = Objects.requireNonNull(targetVpnGateway);
            return this;
        }

        public Builder setVpnGateway(String vpnGateway) {
            this.vpnGateway = Objects.requireNonNull(vpnGateway);
            return this;
        }

        public Builder setVpnGatewayInterface(Integer vpnGatewayInterface) {
            this.vpnGatewayInterface = Objects.requireNonNull(vpnGatewayInterface);
            return this;
        }
        public GetVpnTunnelResult build() {
            return new GetVpnTunnelResult(creationTimestamp, description, detailedStatus, ikeVersion, kind, localTrafficSelector, name, peerExternalGateway, peerExternalGatewayInterface, peerGcpGateway, peerIp, region, remoteTrafficSelector, router, selfLink, sharedSecret, sharedSecretHash, status, targetVpnGateway, vpnGateway, vpnGatewayInterface);
        }
    }
}
