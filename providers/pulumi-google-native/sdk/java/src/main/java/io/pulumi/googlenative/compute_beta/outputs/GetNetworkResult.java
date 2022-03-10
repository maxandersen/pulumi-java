// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.NetworkPeeringResponse;
import io.pulumi.googlenative.compute_beta.outputs.NetworkRoutingConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetNetworkResult {
    /**
     * Must be set to create a VPC network. If not set, a legacy network is created. When set to true, the VPC network is created in auto mode. When set to false, the VPC network is created in custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC networks, you can add subnets using the subnetworks insert method.
     * 
     */
    private final Boolean autoCreateSubnetworks;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    private final String description;
    /**
     * The gateway address for default routing out of the network, selected by GCP.
     * 
     */
    private final String gatewayIPv4;
    /**
     * Type of the resource. Always compute#network for networks.
     * 
     */
    private final String kind;
    /**
     * Maximum Transmission Unit in bytes. The minimum value for this field is 1460 and the maximum value is 1500 bytes. If unspecified, defaults to 1460.
     * 
     */
    private final Integer mtu;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    private final String name;
    /**
     * A list of network peerings for the resource.
     * 
     */
    private final List<NetworkPeeringResponse> peerings;
    /**
     * The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
     * 
     */
    private final NetworkRoutingConfigResponse routingConfig;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined fully-qualified URLs for all subnetworks in this VPC network.
     * 
     */
    private final List<String> subnetworks;

    @OutputCustomType.Constructor
    private GetNetworkResult(
        @OutputCustomType.Parameter("autoCreateSubnetworks") Boolean autoCreateSubnetworks,
        @OutputCustomType.Parameter("creationTimestamp") String creationTimestamp,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("gatewayIPv4") String gatewayIPv4,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("mtu") Integer mtu,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("peerings") List<NetworkPeeringResponse> peerings,
        @OutputCustomType.Parameter("routingConfig") NetworkRoutingConfigResponse routingConfig,
        @OutputCustomType.Parameter("selfLink") String selfLink,
        @OutputCustomType.Parameter("subnetworks") List<String> subnetworks) {
        this.autoCreateSubnetworks = autoCreateSubnetworks;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.gatewayIPv4 = gatewayIPv4;
        this.kind = kind;
        this.mtu = mtu;
        this.name = name;
        this.peerings = peerings;
        this.routingConfig = routingConfig;
        this.selfLink = selfLink;
        this.subnetworks = subnetworks;
    }

    /**
     * Must be set to create a VPC network. If not set, a legacy network is created. When set to true, the VPC network is created in auto mode. When set to false, the VPC network is created in custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC networks, you can add subnets using the subnetworks insert method.
     * 
    */
    public Boolean getAutoCreateSubnetworks() {
        return this.autoCreateSubnetworks;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The gateway address for default routing out of the network, selected by GCP.
     * 
    */
    public String getGatewayIPv4() {
        return this.gatewayIPv4;
    }
    /**
     * Type of the resource. Always compute#network for networks.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Maximum Transmission Unit in bytes. The minimum value for this field is 1460 and the maximum value is 1500 bytes. If unspecified, defaults to 1460.
     * 
    */
    public Integer getMtu() {
        return this.mtu;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A list of network peerings for the resource.
     * 
    */
    public List<NetworkPeeringResponse> getPeerings() {
        return this.peerings;
    }
    /**
     * The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
     * 
    */
    public NetworkRoutingConfigResponse getRoutingConfig() {
        return this.routingConfig;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined fully-qualified URLs for all subnetworks in this VPC network.
     * 
    */
    public List<String> getSubnetworks() {
        return this.subnetworks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoCreateSubnetworks;
        private String creationTimestamp;
        private String description;
        private String gatewayIPv4;
        private String kind;
        private Integer mtu;
        private String name;
        private List<NetworkPeeringResponse> peerings;
        private NetworkRoutingConfigResponse routingConfig;
        private String selfLink;
        private List<String> subnetworks;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateSubnetworks = defaults.autoCreateSubnetworks;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.gatewayIPv4 = defaults.gatewayIPv4;
    	      this.kind = defaults.kind;
    	      this.mtu = defaults.mtu;
    	      this.name = defaults.name;
    	      this.peerings = defaults.peerings;
    	      this.routingConfig = defaults.routingConfig;
    	      this.selfLink = defaults.selfLink;
    	      this.subnetworks = defaults.subnetworks;
        }

        public Builder setAutoCreateSubnetworks(Boolean autoCreateSubnetworks) {
            this.autoCreateSubnetworks = Objects.requireNonNull(autoCreateSubnetworks);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setGatewayIPv4(String gatewayIPv4) {
            this.gatewayIPv4 = Objects.requireNonNull(gatewayIPv4);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMtu(Integer mtu) {
            this.mtu = Objects.requireNonNull(mtu);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPeerings(List<NetworkPeeringResponse> peerings) {
            this.peerings = Objects.requireNonNull(peerings);
            return this;
        }

        public Builder setRoutingConfig(NetworkRoutingConfigResponse routingConfig) {
            this.routingConfig = Objects.requireNonNull(routingConfig);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSubnetworks(List<String> subnetworks) {
            this.subnetworks = Objects.requireNonNull(subnetworks);
            return this;
        }
        public GetNetworkResult build() {
            return new GetNetworkResult(autoCreateSubnetworks, creationTimestamp, description, gatewayIPv4, kind, mtu, name, peerings, routingConfig, selfLink, subnetworks);
        }
    }
}
