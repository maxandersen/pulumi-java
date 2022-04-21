// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.IpsecPolicyResponse;
import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VpnSiteLinkConnection Resource.
 * 
 */
public final class VpnSiteLinkConnectionResponse extends com.pulumi.resources.InvokeArgs {

    public static final VpnSiteLinkConnectionResponse Empty = new VpnSiteLinkConnectionResponse();

    /**
     * Expected bandwidth in MBPS.
     * 
     */
    @Import(name="connectionBandwidth")
    private @Nullable Integer connectionBandwidth;

    public Optional<Integer> connectionBandwidth() {
        return Optional.ofNullable(this.connectionBandwidth);
    }

    /**
     * The connection status.
     * 
     */
    @Import(name="connectionStatus", required=true)
    private String connectionStatus;

    public String connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Egress bytes transferred.
     * 
     */
    @Import(name="egressBytesTransferred", required=true)
    private Double egressBytesTransferred;

    public Double egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * List of egress NatRules.
     * 
     */
    @Import(name="egressNatRules")
    private @Nullable List<SubResourceResponse> egressNatRules;

    public Optional<List<SubResourceResponse>> egressNatRules() {
        return Optional.ofNullable(this.egressNatRules);
    }

    /**
     * EnableBgp flag.
     * 
     */
    @Import(name="enableBgp")
    private @Nullable Boolean enableBgp;

    public Optional<Boolean> enableBgp() {
        return Optional.ofNullable(this.enableBgp);
    }

    /**
     * EnableBgp flag.
     * 
     */
    @Import(name="enableRateLimiting")
    private @Nullable Boolean enableRateLimiting;

    public Optional<Boolean> enableRateLimiting() {
        return Optional.ofNullable(this.enableRateLimiting);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Ingress bytes transferred.
     * 
     */
    @Import(name="ingressBytesTransferred", required=true)
    private Double ingressBytesTransferred;

    public Double ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * List of ingress NatRules.
     * 
     */
    @Import(name="ingressNatRules")
    private @Nullable List<SubResourceResponse> ingressNatRules;

    public Optional<List<SubResourceResponse>> ingressNatRules() {
        return Optional.ofNullable(this.ingressNatRules);
    }

    /**
     * The IPSec Policies to be considered by this connection.
     * 
     */
    @Import(name="ipsecPolicies")
    private @Nullable List<IpsecPolicyResponse> ipsecPolicies;

    public Optional<List<IpsecPolicyResponse>> ipsecPolicies() {
        return Optional.ofNullable(this.ipsecPolicies);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the VPN site link connection resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Routing weight for vpn connection.
     * 
     */
    @Import(name="routingWeight")
    private @Nullable Integer routingWeight;

    public Optional<Integer> routingWeight() {
        return Optional.ofNullable(this.routingWeight);
    }

    /**
     * SharedKey for the vpn connection.
     * 
     */
    @Import(name="sharedKey")
    private @Nullable String sharedKey;

    public Optional<String> sharedKey() {
        return Optional.ofNullable(this.sharedKey);
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Use local azure ip to initiate connection.
     * 
     */
    @Import(name="useLocalAzureIpAddress")
    private @Nullable Boolean useLocalAzureIpAddress;

    public Optional<Boolean> useLocalAzureIpAddress() {
        return Optional.ofNullable(this.useLocalAzureIpAddress);
    }

    /**
     * Enable policy-based traffic selectors.
     * 
     */
    @Import(name="usePolicyBasedTrafficSelectors")
    private @Nullable Boolean usePolicyBasedTrafficSelectors;

    public Optional<Boolean> usePolicyBasedTrafficSelectors() {
        return Optional.ofNullable(this.usePolicyBasedTrafficSelectors);
    }

    /**
     * Connection protocol used for this connection.
     * 
     */
    @Import(name="vpnConnectionProtocolType")
    private @Nullable String vpnConnectionProtocolType;

    public Optional<String> vpnConnectionProtocolType() {
        return Optional.ofNullable(this.vpnConnectionProtocolType);
    }

    /**
     * Vpn link connection mode.
     * 
     */
    @Import(name="vpnLinkConnectionMode")
    private @Nullable String vpnLinkConnectionMode;

    public Optional<String> vpnLinkConnectionMode() {
        return Optional.ofNullable(this.vpnLinkConnectionMode);
    }

    /**
     * Id of the connected vpn site link.
     * 
     */
    @Import(name="vpnSiteLink")
    private @Nullable SubResourceResponse vpnSiteLink;

    public Optional<SubResourceResponse> vpnSiteLink() {
        return Optional.ofNullable(this.vpnSiteLink);
    }

    private VpnSiteLinkConnectionResponse() {}

    private VpnSiteLinkConnectionResponse(VpnSiteLinkConnectionResponse $) {
        this.connectionBandwidth = $.connectionBandwidth;
        this.connectionStatus = $.connectionStatus;
        this.egressBytesTransferred = $.egressBytesTransferred;
        this.egressNatRules = $.egressNatRules;
        this.enableBgp = $.enableBgp;
        this.enableRateLimiting = $.enableRateLimiting;
        this.etag = $.etag;
        this.id = $.id;
        this.ingressBytesTransferred = $.ingressBytesTransferred;
        this.ingressNatRules = $.ingressNatRules;
        this.ipsecPolicies = $.ipsecPolicies;
        this.name = $.name;
        this.provisioningState = $.provisioningState;
        this.routingWeight = $.routingWeight;
        this.sharedKey = $.sharedKey;
        this.type = $.type;
        this.useLocalAzureIpAddress = $.useLocalAzureIpAddress;
        this.usePolicyBasedTrafficSelectors = $.usePolicyBasedTrafficSelectors;
        this.vpnConnectionProtocolType = $.vpnConnectionProtocolType;
        this.vpnLinkConnectionMode = $.vpnLinkConnectionMode;
        this.vpnSiteLink = $.vpnSiteLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnSiteLinkConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnSiteLinkConnectionResponse $;

        public Builder() {
            $ = new VpnSiteLinkConnectionResponse();
        }

        public Builder(VpnSiteLinkConnectionResponse defaults) {
            $ = new VpnSiteLinkConnectionResponse(Objects.requireNonNull(defaults));
        }

        public Builder connectionBandwidth(@Nullable Integer connectionBandwidth) {
            $.connectionBandwidth = connectionBandwidth;
            return this;
        }

        public Builder connectionStatus(String connectionStatus) {
            $.connectionStatus = connectionStatus;
            return this;
        }

        public Builder egressBytesTransferred(Double egressBytesTransferred) {
            $.egressBytesTransferred = egressBytesTransferred;
            return this;
        }

        public Builder egressNatRules(@Nullable List<SubResourceResponse> egressNatRules) {
            $.egressNatRules = egressNatRules;
            return this;
        }

        public Builder egressNatRules(SubResourceResponse... egressNatRules) {
            return egressNatRules(List.of(egressNatRules));
        }

        public Builder enableBgp(@Nullable Boolean enableBgp) {
            $.enableBgp = enableBgp;
            return this;
        }

        public Builder enableRateLimiting(@Nullable Boolean enableRateLimiting) {
            $.enableRateLimiting = enableRateLimiting;
            return this;
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder ingressBytesTransferred(Double ingressBytesTransferred) {
            $.ingressBytesTransferred = ingressBytesTransferred;
            return this;
        }

        public Builder ingressNatRules(@Nullable List<SubResourceResponse> ingressNatRules) {
            $.ingressNatRules = ingressNatRules;
            return this;
        }

        public Builder ingressNatRules(SubResourceResponse... ingressNatRules) {
            return ingressNatRules(List.of(ingressNatRules));
        }

        public Builder ipsecPolicies(@Nullable List<IpsecPolicyResponse> ipsecPolicies) {
            $.ipsecPolicies = ipsecPolicies;
            return this;
        }

        public Builder ipsecPolicies(IpsecPolicyResponse... ipsecPolicies) {
            return ipsecPolicies(List.of(ipsecPolicies));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder routingWeight(@Nullable Integer routingWeight) {
            $.routingWeight = routingWeight;
            return this;
        }

        public Builder sharedKey(@Nullable String sharedKey) {
            $.sharedKey = sharedKey;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder useLocalAzureIpAddress(@Nullable Boolean useLocalAzureIpAddress) {
            $.useLocalAzureIpAddress = useLocalAzureIpAddress;
            return this;
        }

        public Builder usePolicyBasedTrafficSelectors(@Nullable Boolean usePolicyBasedTrafficSelectors) {
            $.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
            return this;
        }

        public Builder vpnConnectionProtocolType(@Nullable String vpnConnectionProtocolType) {
            $.vpnConnectionProtocolType = vpnConnectionProtocolType;
            return this;
        }

        public Builder vpnLinkConnectionMode(@Nullable String vpnLinkConnectionMode) {
            $.vpnLinkConnectionMode = vpnLinkConnectionMode;
            return this;
        }

        public Builder vpnSiteLink(@Nullable SubResourceResponse vpnSiteLink) {
            $.vpnSiteLink = vpnSiteLink;
            return this;
        }

        public VpnSiteLinkConnectionResponse build() {
            $.connectionStatus = Objects.requireNonNull($.connectionStatus, "expected parameter 'connectionStatus' to be non-null");
            $.egressBytesTransferred = Objects.requireNonNull($.egressBytesTransferred, "expected parameter 'egressBytesTransferred' to be non-null");
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.ingressBytesTransferred = Objects.requireNonNull($.ingressBytesTransferred, "expected parameter 'ingressBytesTransferred' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
