// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class NetworkConfigResponse {
    /**
     * The network connect mode of the Filestore instance. If not provided, the connect mode defaults to DIRECT_PEERING.
     * 
     */
    private final String connectMode;
    /**
     * IPv4 addresses in the format `{octet1}.{octet2}.{octet3}.{octet4}` or IPv6 addresses in the format `{block1}:{block2}:{block3}:{block4}:{block5}:{block6}:{block7}:{block8}`.
     * 
     */
    private final List<String> ipAddresses;
    /**
     * Internet protocol versions for which the instance has IP addresses assigned. For this version, only MODE_IPV4 is supported.
     * 
     */
    private final List<String> modes;
    /**
     * The name of the Google Compute Engine [VPC network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected.
     * 
     */
    private final String network;
    /**
     * Optional, reserved_ip_range can have one of the following two types of values. * CIDR range value when using DIRECT_PEERING connect mode. * [Allocated IP address range](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-internal-ip-address) when using PRIVATE_SERVICE_ACCESS connect mode. When the name of an allocated IP address range is specified, it must be one of the ranges associated with the private service access connection. When specified as a direct CIDR value, it must be a /29 CIDR block for Basic tier or a /24 CIDR block for High Scale or Enterprise tier in one of the [internal IP address ranges](https://www.arin.net/reference/research/statistics/address_filters/) that identifies the range of IP addresses reserved for this instance. For example, 10.0.0.0/29 or 192.168.0.0/24. The range you specify can't overlap with either existing subnets or assigned IP address ranges for other Cloud Filestore instances in the selected VPC network.
     * 
     */
    private final String reservedIpRange;

    @OutputCustomType.Constructor
    private NetworkConfigResponse(
        @OutputCustomType.Parameter("connectMode") String connectMode,
        @OutputCustomType.Parameter("ipAddresses") List<String> ipAddresses,
        @OutputCustomType.Parameter("modes") List<String> modes,
        @OutputCustomType.Parameter("network") String network,
        @OutputCustomType.Parameter("reservedIpRange") String reservedIpRange) {
        this.connectMode = connectMode;
        this.ipAddresses = ipAddresses;
        this.modes = modes;
        this.network = network;
        this.reservedIpRange = reservedIpRange;
    }

    /**
     * The network connect mode of the Filestore instance. If not provided, the connect mode defaults to DIRECT_PEERING.
     * 
    */
    public String getConnectMode() {
        return this.connectMode;
    }
    /**
     * IPv4 addresses in the format `{octet1}.{octet2}.{octet3}.{octet4}` or IPv6 addresses in the format `{block1}:{block2}:{block3}:{block4}:{block5}:{block6}:{block7}:{block8}`.
     * 
    */
    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }
    /**
     * Internet protocol versions for which the instance has IP addresses assigned. For this version, only MODE_IPV4 is supported.
     * 
    */
    public List<String> getModes() {
        return this.modes;
    }
    /**
     * The name of the Google Compute Engine [VPC network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * Optional, reserved_ip_range can have one of the following two types of values. * CIDR range value when using DIRECT_PEERING connect mode. * [Allocated IP address range](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-internal-ip-address) when using PRIVATE_SERVICE_ACCESS connect mode. When the name of an allocated IP address range is specified, it must be one of the ranges associated with the private service access connection. When specified as a direct CIDR value, it must be a /29 CIDR block for Basic tier or a /24 CIDR block for High Scale or Enterprise tier in one of the [internal IP address ranges](https://www.arin.net/reference/research/statistics/address_filters/) that identifies the range of IP addresses reserved for this instance. For example, 10.0.0.0/29 or 192.168.0.0/24. The range you specify can't overlap with either existing subnets or assigned IP address ranges for other Cloud Filestore instances in the selected VPC network.
     * 
    */
    public String getReservedIpRange() {
        return this.reservedIpRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectMode;
        private List<String> ipAddresses;
        private List<String> modes;
        private String network;
        private String reservedIpRange;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectMode = defaults.connectMode;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.modes = defaults.modes;
    	      this.network = defaults.network;
    	      this.reservedIpRange = defaults.reservedIpRange;
        }

        public Builder setConnectMode(String connectMode) {
            this.connectMode = Objects.requireNonNull(connectMode);
            return this;
        }

        public Builder setIpAddresses(List<String> ipAddresses) {
            this.ipAddresses = Objects.requireNonNull(ipAddresses);
            return this;
        }

        public Builder setModes(List<String> modes) {
            this.modes = Objects.requireNonNull(modes);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setReservedIpRange(String reservedIpRange) {
            this.reservedIpRange = Objects.requireNonNull(reservedIpRange);
            return this;
        }
        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(connectMode, ipAddresses, modes, network, reservedIpRange);
        }
    }
}
