// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_beta.enums.GlobalAddressAddressType;
import com.pulumi.googlenative.compute_beta.enums.GlobalAddressIpVersion;
import com.pulumi.googlenative.compute_beta.enums.GlobalAddressNetworkTier;
import com.pulumi.googlenative.compute_beta.enums.GlobalAddressPurpose;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalAddressArgs Empty = new GlobalAddressArgs();

    /**
     * The static IP address represented by this resource.
     * 
     */
    @Import(name="address")
      private final @Nullable Output<String> address;

    public Output<String> address() {
        return this.address == null ? Codegen.empty() : this.address;
    }

    /**
     * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to EXTERNAL.
     * 
     */
    @Import(name="addressType")
      private final @Nullable Output<GlobalAddressAddressType> addressType;

    public Output<GlobalAddressAddressType> addressType() {
        return this.addressType == null ? Codegen.empty() : this.addressType;
    }

    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only be specified for a global address.
     * 
     */
    @Import(name="ipVersion")
      private final @Nullable Output<GlobalAddressIpVersion> ipVersion;

    public Output<GlobalAddressIpVersion> ipVersion() {
        return this.ipVersion == null ? Codegen.empty() : this.ipVersion;
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The URL of the network in which to reserve the address. This field can only be used with INTERNAL type with the VPC_PEERING purpose.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * This signifies the networking tier used for configuring this address and can only take the following values: PREMIUM or STANDARD. Internal IP addresses are always Premium Tier; global external IP addresses are always Premium Tier; regional external IP addresses can be either Standard or Premium Tier. If this field is not specified, it is assumed to be PREMIUM.
     * 
     */
    @Import(name="networkTier")
      private final @Nullable Output<GlobalAddressNetworkTier> networkTier;

    public Output<GlobalAddressNetworkTier> networkTier() {
        return this.networkTier == null ? Codegen.empty() : this.networkTier;
    }

    /**
     * The prefix length if the resource represents an IP range.
     * 
     */
    @Import(name="prefixLength")
      private final @Nullable Output<Integer> prefixLength;

    public Output<Integer> prefixLength() {
        return this.prefixLength == null ? Codegen.empty() : this.prefixLength;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The purpose of this resource, which can be one of the following values: - GCE_ENDPOINT for addresses that are used by VM instances, alias IP ranges, load balancers, and similar resources. - DNS_RESOLVER for a DNS resolver address in a subnetwork for a Cloud DNS inbound forwarder IP addresses (regional internal IP address in a subnet of a VPC network) - VPC_PEERING for global internal IP addresses used for private services access allocated ranges. - NAT_AUTO for the regional external IP addresses used by Cloud NAT when allocating addresses using automatic NAT IP address allocation. - IPSEC_INTERCONNECT for addresses created from a private IP range that are reserved for a VLAN attachment in an *IPsec-encrypted Cloud Interconnect* configuration. These addresses are regional resources. Not currently available publicly. - `SHARED_LOADBALANCER_VIP` for an internal IP address that is assigned to multiple internal forwarding rules. - `PRIVATE_SERVICE_CONNECT` for a private network address that is used to configure Private Service Connect. Only global internal addresses can use this purpose.
     * 
     */
    @Import(name="purpose")
      private final @Nullable Output<GlobalAddressPurpose> purpose;

    public Output<GlobalAddressPurpose> purpose() {
        return this.purpose == null ? Codegen.empty() : this.purpose;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it must be within the subnetwork&#39;s IP range. This field can only be used with INTERNAL type with a GCE_ENDPOINT or DNS_RESOLVER purpose.
     * 
     */
    @Import(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> subnetwork() {
        return this.subnetwork == null ? Codegen.empty() : this.subnetwork;
    }

    public GlobalAddressArgs(
        @Nullable Output<String> address,
        @Nullable Output<GlobalAddressAddressType> addressType,
        @Nullable Output<String> description,
        @Nullable Output<GlobalAddressIpVersion> ipVersion,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<GlobalAddressNetworkTier> networkTier,
        @Nullable Output<Integer> prefixLength,
        @Nullable Output<String> project,
        @Nullable Output<GlobalAddressPurpose> purpose,
        @Nullable Output<String> requestId,
        @Nullable Output<String> subnetwork) {
        this.address = address;
        this.addressType = addressType;
        this.description = description;
        this.ipVersion = ipVersion;
        this.labels = labels;
        this.name = name;
        this.network = network;
        this.networkTier = networkTier;
        this.prefixLength = prefixLength;
        this.project = project;
        this.purpose = purpose;
        this.requestId = requestId;
        this.subnetwork = subnetwork;
    }

    private GlobalAddressArgs() {
        this.address = Codegen.empty();
        this.addressType = Codegen.empty();
        this.description = Codegen.empty();
        this.ipVersion = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.networkTier = Codegen.empty();
        this.prefixLength = Codegen.empty();
        this.project = Codegen.empty();
        this.purpose = Codegen.empty();
        this.requestId = Codegen.empty();
        this.subnetwork = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> address;
        private @Nullable Output<GlobalAddressAddressType> addressType;
        private @Nullable Output<String> description;
        private @Nullable Output<GlobalAddressIpVersion> ipVersion;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<GlobalAddressNetworkTier> networkTier;
        private @Nullable Output<Integer> prefixLength;
        private @Nullable Output<String> project;
        private @Nullable Output<GlobalAddressPurpose> purpose;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressType = defaults.addressType;
    	      this.description = defaults.description;
    	      this.ipVersion = defaults.ipVersion;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkTier = defaults.networkTier;
    	      this.prefixLength = defaults.prefixLength;
    	      this.project = defaults.project;
    	      this.purpose = defaults.purpose;
    	      this.requestId = defaults.requestId;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder address(@Nullable Output<String> address) {
            this.address = address;
            return this;
        }
        public Builder address(@Nullable String address) {
            this.address = Codegen.ofNullable(address);
            return this;
        }
        public Builder addressType(@Nullable Output<GlobalAddressAddressType> addressType) {
            this.addressType = addressType;
            return this;
        }
        public Builder addressType(@Nullable GlobalAddressAddressType addressType) {
            this.addressType = Codegen.ofNullable(addressType);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder ipVersion(@Nullable Output<GlobalAddressIpVersion> ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Builder ipVersion(@Nullable GlobalAddressIpVersion ipVersion) {
            this.ipVersion = Codegen.ofNullable(ipVersion);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder networkTier(@Nullable Output<GlobalAddressNetworkTier> networkTier) {
            this.networkTier = networkTier;
            return this;
        }
        public Builder networkTier(@Nullable GlobalAddressNetworkTier networkTier) {
            this.networkTier = Codegen.ofNullable(networkTier);
            return this;
        }
        public Builder prefixLength(@Nullable Output<Integer> prefixLength) {
            this.prefixLength = prefixLength;
            return this;
        }
        public Builder prefixLength(@Nullable Integer prefixLength) {
            this.prefixLength = Codegen.ofNullable(prefixLength);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder purpose(@Nullable Output<GlobalAddressPurpose> purpose) {
            this.purpose = purpose;
            return this;
        }
        public Builder purpose(@Nullable GlobalAddressPurpose purpose) {
            this.purpose = Codegen.ofNullable(purpose);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Codegen.ofNullable(subnetwork);
            return this;
        }        public GlobalAddressArgs build() {
            return new GlobalAddressArgs(address, addressType, description, ipVersion, labels, name, network, networkTier, prefixLength, project, purpose, requestId, subnetwork);
        }
    }
}
