// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_beta.enums.InterconnectAttachmentBandwidth;
import com.pulumi.googlenative.compute_beta.enums.InterconnectAttachmentEdgeAvailabilityDomain;
import com.pulumi.googlenative.compute_beta.enums.InterconnectAttachmentEncryption;
import com.pulumi.googlenative.compute_beta.enums.InterconnectAttachmentStackType;
import com.pulumi.googlenative.compute_beta.enums.InterconnectAttachmentType;
import com.pulumi.googlenative.compute_beta.inputs.InterconnectAttachmentPartnerMetadataArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InterconnectAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterconnectAttachmentArgs Empty = new InterconnectAttachmentArgs();

    /**
     * Determines whether this Attachment will carry packets. Not present for PARTNER_PROVIDER.
     * 
     */
    @Import(name="adminEnabled")
      private final @Nullable Output<Boolean> adminEnabled;

    public Output<Boolean> adminEnabled() {
        return this.adminEnabled == null ? Codegen.empty() : this.adminEnabled;
    }

    /**
     * Provisioned bandwidth capacity for the interconnect attachment. For attachments of type DEDICATED, the user can set the bandwidth. For attachments of type PARTNER, the Google Partner that is operating the interconnect must set the bandwidth. Output only for PARTNER type, mutable for PARTNER_PROVIDER and DEDICATED, and can take one of the following values: - BPS_50M: 50 Mbit/s - BPS_100M: 100 Mbit/s - BPS_200M: 200 Mbit/s - BPS_300M: 300 Mbit/s - BPS_400M: 400 Mbit/s - BPS_500M: 500 Mbit/s - BPS_1G: 1 Gbit/s - BPS_2G: 2 Gbit/s - BPS_5G: 5 Gbit/s - BPS_10G: 10 Gbit/s - BPS_20G: 20 Gbit/s - BPS_50G: 50 Gbit/s
     * 
     */
    @Import(name="bandwidth")
      private final @Nullable Output<InterconnectAttachmentBandwidth> bandwidth;

    public Output<InterconnectAttachmentBandwidth> bandwidth() {
        return this.bandwidth == null ? Codegen.empty() : this.bandwidth;
    }

    /**
     * Up to 16 candidate prefixes that control the allocation of cloudRouterIpv6Address and customerRouterIpv6Address for this attachment. Each prefix must be in the Global Unique Address (GUA) space. It is highly recommended that it be in a range owned by the requestor. A GUA in a range owned by Google will cause the request to fail. Google will select an available prefix from the supplied candidates or fail the request. If not supplied, a /125 from a Google-owned GUA block will be selected.
     * 
     */
    @Import(name="candidateIpv6Subnets")
      private final @Nullable Output<List<String>> candidateIpv6Subnets;

    public Output<List<String>> candidateIpv6Subnets() {
        return this.candidateIpv6Subnets == null ? Codegen.empty() : this.candidateIpv6Subnets;
    }

    /**
     * Up to 16 candidate prefixes that can be used to restrict the allocation of cloudRouterIpAddress and customerRouterIpAddress for this attachment. All prefixes must be within link-local address space (169.254.0.0/16) and must be /29 or shorter (/28, /27, etc). Google will attempt to select an unused /29 from the supplied candidate prefix(es). The request will fail if all possible /29s are in use on Google&#39;s edge. If not supplied, Google will randomly select an unused /29 from all of link-local space.
     * 
     */
    @Import(name="candidateSubnets")
      private final @Nullable Output<List<String>> candidateSubnets;

    public Output<List<String>> candidateSubnets() {
        return this.candidateSubnets == null ? Codegen.empty() : this.candidateSubnets;
    }

    /**
     * If supplied, the interface id (index within the subnet) to be used for the cloud router address. The id must be in the range of 1 to 6. If a subnet mask is supplied, it must be /125, and the subnet should either be 0 or match the selected subnet.
     * 
     */
    @Import(name="cloudRouterIpv6InterfaceId")
      private final @Nullable Output<String> cloudRouterIpv6InterfaceId;

    public Output<String> cloudRouterIpv6InterfaceId() {
        return this.cloudRouterIpv6InterfaceId == null ? Codegen.empty() : this.cloudRouterIpv6InterfaceId;
    }

    /**
     * If supplied, the interface id (index within the subnet) to be used for the customer router address. The id must be in the range of 1 to 6. If a subnet mask is supplied, it must be /125, and the subnet should either be 0 or match the selected subnet.
     * 
     */
    @Import(name="customerRouterIpv6InterfaceId")
      private final @Nullable Output<String> customerRouterIpv6InterfaceId;

    public Output<String> customerRouterIpv6InterfaceId() {
        return this.customerRouterIpv6InterfaceId == null ? Codegen.empty() : this.customerRouterIpv6InterfaceId;
    }

    /**
     * [Output only for types PARTNER and DEDICATED. Not present for PARTNER_PROVIDER.] Dataplane version for this InterconnectAttachment. This field is only present for Dataplane version 2 and higher. Absence of this field in the API output indicates that the Dataplane is version 1.
     * 
     */
    @Import(name="dataplaneVersion")
      private final @Nullable Output<Integer> dataplaneVersion;

    public Output<Integer> dataplaneVersion() {
        return this.dataplaneVersion == null ? Codegen.empty() : this.dataplaneVersion;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Desired availability domain for the attachment. Only available for type PARTNER, at creation time, and can take one of the following values: - AVAILABILITY_DOMAIN_ANY - AVAILABILITY_DOMAIN_1 - AVAILABILITY_DOMAIN_2 For improved reliability, customers should configure a pair of attachments, one per availability domain. The selected availability domain will be provided to the Partner via the pairing key, so that the provisioned circuit will lie in the specified domain. If not specified, the value will default to AVAILABILITY_DOMAIN_ANY.
     * 
     */
    @Import(name="edgeAvailabilityDomain")
      private final @Nullable Output<InterconnectAttachmentEdgeAvailabilityDomain> edgeAvailabilityDomain;

    public Output<InterconnectAttachmentEdgeAvailabilityDomain> edgeAvailabilityDomain() {
        return this.edgeAvailabilityDomain == null ? Codegen.empty() : this.edgeAvailabilityDomain;
    }

    /**
     * Indicates the user-supplied encryption option of this VLAN attachment (interconnectAttachment). Can only be specified at attachment creation for PARTNER or DEDICATED attachments. Possible values are: - NONE - This is the default value, which means that the VLAN attachment carries unencrypted traffic. VMs are able to send traffic to, or receive traffic from, such a VLAN attachment. - IPSEC - The VLAN attachment carries only encrypted traffic that is encrypted by an IPsec device, such as an HA VPN gateway or third-party IPsec VPN. VMs cannot directly send traffic to, or receive traffic from, such a VLAN attachment. To use *IPsec-encrypted Cloud Interconnect*, the VLAN attachment must be created with this option. Not currently available publicly.
     * 
     */
    @Import(name="encryption")
      private final @Nullable Output<InterconnectAttachmentEncryption> encryption;

    public Output<InterconnectAttachmentEncryption> encryption() {
        return this.encryption == null ? Codegen.empty() : this.encryption;
    }

    /**
     * URL of the underlying Interconnect object that this attachment&#39;s traffic will traverse through.
     * 
     */
    @Import(name="interconnect")
      private final @Nullable Output<String> interconnect;

    public Output<String> interconnect() {
        return this.interconnect == null ? Codegen.empty() : this.interconnect;
    }

    /**
     * A list of URLs of addresses that have been reserved for the VLAN attachment. Used only for the VLAN attachment that has the encryption option as IPSEC. The addresses must be regional internal IP address ranges. When creating an HA VPN gateway over the VLAN attachment, if the attachment is configured to use a regional internal IP address, then the VPN gateway&#39;s IP address is allocated from the IP address range specified here. For example, if the HA VPN gateway&#39;s interface 0 is paired to this VLAN attachment, then a regional internal IP address for the VPN gateway interface 0 will be allocated from the IP address specified for this VLAN attachment. If this field is not specified when creating the VLAN attachment, then later on when creating an HA VPN gateway on this VLAN attachment, the HA VPN gateway&#39;s IP address is allocated from the regional external IP address pool. Not currently available publicly.
     * 
     */
    @Import(name="ipsecInternalAddresses")
      private final @Nullable Output<List<String>> ipsecInternalAddresses;

    public Output<List<String>> ipsecInternalAddresses() {
        return this.ipsecInternalAddresses == null ? Codegen.empty() : this.ipsecInternalAddresses;
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
     * Maximum Transmission Unit (MTU), in bytes, of packets passing through this interconnect attachment. Only 1440 and 1500 are allowed. If not specified, the value will default to 1440.
     * 
     */
    @Import(name="mtu")
      private final @Nullable Output<Integer> mtu;

    public Output<Integer> mtu() {
        return this.mtu == null ? Codegen.empty() : this.mtu;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * [Output only for type PARTNER. Input only for PARTNER_PROVIDER. Not present for DEDICATED]. The opaque identifier of an PARTNER attachment used to initiate provisioning with a selected partner. Of the form &#34;XXXXX/region/domain&#34;
     * 
     */
    @Import(name="pairingKey")
      private final @Nullable Output<String> pairingKey;

    public Output<String> pairingKey() {
        return this.pairingKey == null ? Codegen.empty() : this.pairingKey;
    }

    /**
     * Optional BGP ASN for the router supplied by a Layer 3 Partner if they configured BGP on behalf of the customer. Output only for PARTNER type, input only for PARTNER_PROVIDER, not available for DEDICATED.
     * 
     */
    @Import(name="partnerAsn")
      private final @Nullable Output<String> partnerAsn;

    public Output<String> partnerAsn() {
        return this.partnerAsn == null ? Codegen.empty() : this.partnerAsn;
    }

    /**
     * Informational metadata about Partner attachments from Partners to display to customers. Output only for for PARTNER type, mutable for PARTNER_PROVIDER, not available for DEDICATED.
     * 
     */
    @Import(name="partnerMetadata")
      private final @Nullable Output<InterconnectAttachmentPartnerMetadataArgs> partnerMetadata;

    public Output<InterconnectAttachmentPartnerMetadataArgs> partnerMetadata() {
        return this.partnerMetadata == null ? Codegen.empty() : this.partnerMetadata;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * URL of the Cloud Router to be used for dynamic routing. This router must be in the same region as this InterconnectAttachment. The InterconnectAttachment will automatically connect the Interconnect to the network &amp; region within which the Cloud Router is configured.
     * 
     */
    @Import(name="router")
      private final @Nullable Output<String> router;

    public Output<String> router() {
        return this.router == null ? Codegen.empty() : this.router;
    }

    /**
     * The stack type for this interconnect attachment to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at interconnect attachments creation and update interconnect attachment operations.
     * 
     */
    @Import(name="stackType")
      private final @Nullable Output<InterconnectAttachmentStackType> stackType;

    public Output<InterconnectAttachmentStackType> stackType() {
        return this.stackType == null ? Codegen.empty() : this.stackType;
    }

    /**
     * The type of interconnect attachment this is, which can take one of the following values: - DEDICATED: an attachment to a Dedicated Interconnect. - PARTNER: an attachment to a Partner Interconnect, created by the customer. - PARTNER_PROVIDER: an attachment to a Partner Interconnect, created by the partner.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<InterconnectAttachmentType> type;

    public Output<InterconnectAttachmentType> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    @Import(name="validateOnly")
      private final @Nullable Output<String> validateOnly;

    public Output<String> validateOnly() {
        return this.validateOnly == null ? Codegen.empty() : this.validateOnly;
    }

    /**
     * The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. Only specified at creation time.
     * 
     */
    @Import(name="vlanTag8021q")
      private final @Nullable Output<Integer> vlanTag8021q;

    public Output<Integer> vlanTag8021q() {
        return this.vlanTag8021q == null ? Codegen.empty() : this.vlanTag8021q;
    }

    public InterconnectAttachmentArgs(
        @Nullable Output<Boolean> adminEnabled,
        @Nullable Output<InterconnectAttachmentBandwidth> bandwidth,
        @Nullable Output<List<String>> candidateIpv6Subnets,
        @Nullable Output<List<String>> candidateSubnets,
        @Nullable Output<String> cloudRouterIpv6InterfaceId,
        @Nullable Output<String> customerRouterIpv6InterfaceId,
        @Nullable Output<Integer> dataplaneVersion,
        @Nullable Output<String> description,
        @Nullable Output<InterconnectAttachmentEdgeAvailabilityDomain> edgeAvailabilityDomain,
        @Nullable Output<InterconnectAttachmentEncryption> encryption,
        @Nullable Output<String> interconnect,
        @Nullable Output<List<String>> ipsecInternalAddresses,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<Integer> mtu,
        @Nullable Output<String> name,
        @Nullable Output<String> pairingKey,
        @Nullable Output<String> partnerAsn,
        @Nullable Output<InterconnectAttachmentPartnerMetadataArgs> partnerMetadata,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<String> router,
        @Nullable Output<InterconnectAttachmentStackType> stackType,
        @Nullable Output<InterconnectAttachmentType> type,
        @Nullable Output<String> validateOnly,
        @Nullable Output<Integer> vlanTag8021q) {
        this.adminEnabled = adminEnabled;
        this.bandwidth = bandwidth;
        this.candidateIpv6Subnets = candidateIpv6Subnets;
        this.candidateSubnets = candidateSubnets;
        this.cloudRouterIpv6InterfaceId = cloudRouterIpv6InterfaceId;
        this.customerRouterIpv6InterfaceId = customerRouterIpv6InterfaceId;
        this.dataplaneVersion = dataplaneVersion;
        this.description = description;
        this.edgeAvailabilityDomain = edgeAvailabilityDomain;
        this.encryption = encryption;
        this.interconnect = interconnect;
        this.ipsecInternalAddresses = ipsecInternalAddresses;
        this.labels = labels;
        this.mtu = mtu;
        this.name = name;
        this.pairingKey = pairingKey;
        this.partnerAsn = partnerAsn;
        this.partnerMetadata = partnerMetadata;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.router = router;
        this.stackType = stackType;
        this.type = type;
        this.validateOnly = validateOnly;
        this.vlanTag8021q = vlanTag8021q;
    }

    private InterconnectAttachmentArgs() {
        this.adminEnabled = Codegen.empty();
        this.bandwidth = Codegen.empty();
        this.candidateIpv6Subnets = Codegen.empty();
        this.candidateSubnets = Codegen.empty();
        this.cloudRouterIpv6InterfaceId = Codegen.empty();
        this.customerRouterIpv6InterfaceId = Codegen.empty();
        this.dataplaneVersion = Codegen.empty();
        this.description = Codegen.empty();
        this.edgeAvailabilityDomain = Codegen.empty();
        this.encryption = Codegen.empty();
        this.interconnect = Codegen.empty();
        this.ipsecInternalAddresses = Codegen.empty();
        this.labels = Codegen.empty();
        this.mtu = Codegen.empty();
        this.name = Codegen.empty();
        this.pairingKey = Codegen.empty();
        this.partnerAsn = Codegen.empty();
        this.partnerMetadata = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.requestId = Codegen.empty();
        this.router = Codegen.empty();
        this.stackType = Codegen.empty();
        this.type = Codegen.empty();
        this.validateOnly = Codegen.empty();
        this.vlanTag8021q = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> adminEnabled;
        private @Nullable Output<InterconnectAttachmentBandwidth> bandwidth;
        private @Nullable Output<List<String>> candidateIpv6Subnets;
        private @Nullable Output<List<String>> candidateSubnets;
        private @Nullable Output<String> cloudRouterIpv6InterfaceId;
        private @Nullable Output<String> customerRouterIpv6InterfaceId;
        private @Nullable Output<Integer> dataplaneVersion;
        private @Nullable Output<String> description;
        private @Nullable Output<InterconnectAttachmentEdgeAvailabilityDomain> edgeAvailabilityDomain;
        private @Nullable Output<InterconnectAttachmentEncryption> encryption;
        private @Nullable Output<String> interconnect;
        private @Nullable Output<List<String>> ipsecInternalAddresses;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<Integer> mtu;
        private @Nullable Output<String> name;
        private @Nullable Output<String> pairingKey;
        private @Nullable Output<String> partnerAsn;
        private @Nullable Output<InterconnectAttachmentPartnerMetadataArgs> partnerMetadata;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> router;
        private @Nullable Output<InterconnectAttachmentStackType> stackType;
        private @Nullable Output<InterconnectAttachmentType> type;
        private @Nullable Output<String> validateOnly;
        private @Nullable Output<Integer> vlanTag8021q;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminEnabled = defaults.adminEnabled;
    	      this.bandwidth = defaults.bandwidth;
    	      this.candidateIpv6Subnets = defaults.candidateIpv6Subnets;
    	      this.candidateSubnets = defaults.candidateSubnets;
    	      this.cloudRouterIpv6InterfaceId = defaults.cloudRouterIpv6InterfaceId;
    	      this.customerRouterIpv6InterfaceId = defaults.customerRouterIpv6InterfaceId;
    	      this.dataplaneVersion = defaults.dataplaneVersion;
    	      this.description = defaults.description;
    	      this.edgeAvailabilityDomain = defaults.edgeAvailabilityDomain;
    	      this.encryption = defaults.encryption;
    	      this.interconnect = defaults.interconnect;
    	      this.ipsecInternalAddresses = defaults.ipsecInternalAddresses;
    	      this.labels = defaults.labels;
    	      this.mtu = defaults.mtu;
    	      this.name = defaults.name;
    	      this.pairingKey = defaults.pairingKey;
    	      this.partnerAsn = defaults.partnerAsn;
    	      this.partnerMetadata = defaults.partnerMetadata;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.router = defaults.router;
    	      this.stackType = defaults.stackType;
    	      this.type = defaults.type;
    	      this.validateOnly = defaults.validateOnly;
    	      this.vlanTag8021q = defaults.vlanTag8021q;
        }

        public Builder adminEnabled(@Nullable Output<Boolean> adminEnabled) {
            this.adminEnabled = adminEnabled;
            return this;
        }
        public Builder adminEnabled(@Nullable Boolean adminEnabled) {
            this.adminEnabled = Codegen.ofNullable(adminEnabled);
            return this;
        }
        public Builder bandwidth(@Nullable Output<InterconnectAttachmentBandwidth> bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Builder bandwidth(@Nullable InterconnectAttachmentBandwidth bandwidth) {
            this.bandwidth = Codegen.ofNullable(bandwidth);
            return this;
        }
        public Builder candidateIpv6Subnets(@Nullable Output<List<String>> candidateIpv6Subnets) {
            this.candidateIpv6Subnets = candidateIpv6Subnets;
            return this;
        }
        public Builder candidateIpv6Subnets(@Nullable List<String> candidateIpv6Subnets) {
            this.candidateIpv6Subnets = Codegen.ofNullable(candidateIpv6Subnets);
            return this;
        }
        public Builder candidateIpv6Subnets(String... candidateIpv6Subnets) {
            return candidateIpv6Subnets(List.of(candidateIpv6Subnets));
        }
        public Builder candidateSubnets(@Nullable Output<List<String>> candidateSubnets) {
            this.candidateSubnets = candidateSubnets;
            return this;
        }
        public Builder candidateSubnets(@Nullable List<String> candidateSubnets) {
            this.candidateSubnets = Codegen.ofNullable(candidateSubnets);
            return this;
        }
        public Builder candidateSubnets(String... candidateSubnets) {
            return candidateSubnets(List.of(candidateSubnets));
        }
        public Builder cloudRouterIpv6InterfaceId(@Nullable Output<String> cloudRouterIpv6InterfaceId) {
            this.cloudRouterIpv6InterfaceId = cloudRouterIpv6InterfaceId;
            return this;
        }
        public Builder cloudRouterIpv6InterfaceId(@Nullable String cloudRouterIpv6InterfaceId) {
            this.cloudRouterIpv6InterfaceId = Codegen.ofNullable(cloudRouterIpv6InterfaceId);
            return this;
        }
        public Builder customerRouterIpv6InterfaceId(@Nullable Output<String> customerRouterIpv6InterfaceId) {
            this.customerRouterIpv6InterfaceId = customerRouterIpv6InterfaceId;
            return this;
        }
        public Builder customerRouterIpv6InterfaceId(@Nullable String customerRouterIpv6InterfaceId) {
            this.customerRouterIpv6InterfaceId = Codegen.ofNullable(customerRouterIpv6InterfaceId);
            return this;
        }
        public Builder dataplaneVersion(@Nullable Output<Integer> dataplaneVersion) {
            this.dataplaneVersion = dataplaneVersion;
            return this;
        }
        public Builder dataplaneVersion(@Nullable Integer dataplaneVersion) {
            this.dataplaneVersion = Codegen.ofNullable(dataplaneVersion);
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
        public Builder edgeAvailabilityDomain(@Nullable Output<InterconnectAttachmentEdgeAvailabilityDomain> edgeAvailabilityDomain) {
            this.edgeAvailabilityDomain = edgeAvailabilityDomain;
            return this;
        }
        public Builder edgeAvailabilityDomain(@Nullable InterconnectAttachmentEdgeAvailabilityDomain edgeAvailabilityDomain) {
            this.edgeAvailabilityDomain = Codegen.ofNullable(edgeAvailabilityDomain);
            return this;
        }
        public Builder encryption(@Nullable Output<InterconnectAttachmentEncryption> encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder encryption(@Nullable InterconnectAttachmentEncryption encryption) {
            this.encryption = Codegen.ofNullable(encryption);
            return this;
        }
        public Builder interconnect(@Nullable Output<String> interconnect) {
            this.interconnect = interconnect;
            return this;
        }
        public Builder interconnect(@Nullable String interconnect) {
            this.interconnect = Codegen.ofNullable(interconnect);
            return this;
        }
        public Builder ipsecInternalAddresses(@Nullable Output<List<String>> ipsecInternalAddresses) {
            this.ipsecInternalAddresses = ipsecInternalAddresses;
            return this;
        }
        public Builder ipsecInternalAddresses(@Nullable List<String> ipsecInternalAddresses) {
            this.ipsecInternalAddresses = Codegen.ofNullable(ipsecInternalAddresses);
            return this;
        }
        public Builder ipsecInternalAddresses(String... ipsecInternalAddresses) {
            return ipsecInternalAddresses(List.of(ipsecInternalAddresses));
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder mtu(@Nullable Output<Integer> mtu) {
            this.mtu = mtu;
            return this;
        }
        public Builder mtu(@Nullable Integer mtu) {
            this.mtu = Codegen.ofNullable(mtu);
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
        public Builder pairingKey(@Nullable Output<String> pairingKey) {
            this.pairingKey = pairingKey;
            return this;
        }
        public Builder pairingKey(@Nullable String pairingKey) {
            this.pairingKey = Codegen.ofNullable(pairingKey);
            return this;
        }
        public Builder partnerAsn(@Nullable Output<String> partnerAsn) {
            this.partnerAsn = partnerAsn;
            return this;
        }
        public Builder partnerAsn(@Nullable String partnerAsn) {
            this.partnerAsn = Codegen.ofNullable(partnerAsn);
            return this;
        }
        public Builder partnerMetadata(@Nullable Output<InterconnectAttachmentPartnerMetadataArgs> partnerMetadata) {
            this.partnerMetadata = partnerMetadata;
            return this;
        }
        public Builder partnerMetadata(@Nullable InterconnectAttachmentPartnerMetadataArgs partnerMetadata) {
            this.partnerMetadata = Codegen.ofNullable(partnerMetadata);
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
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
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
        public Builder router(@Nullable Output<String> router) {
            this.router = router;
            return this;
        }
        public Builder router(@Nullable String router) {
            this.router = Codegen.ofNullable(router);
            return this;
        }
        public Builder stackType(@Nullable Output<InterconnectAttachmentStackType> stackType) {
            this.stackType = stackType;
            return this;
        }
        public Builder stackType(@Nullable InterconnectAttachmentStackType stackType) {
            this.stackType = Codegen.ofNullable(stackType);
            return this;
        }
        public Builder type(@Nullable Output<InterconnectAttachmentType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable InterconnectAttachmentType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder validateOnly(@Nullable Output<String> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }
        public Builder validateOnly(@Nullable String validateOnly) {
            this.validateOnly = Codegen.ofNullable(validateOnly);
            return this;
        }
        public Builder vlanTag8021q(@Nullable Output<Integer> vlanTag8021q) {
            this.vlanTag8021q = vlanTag8021q;
            return this;
        }
        public Builder vlanTag8021q(@Nullable Integer vlanTag8021q) {
            this.vlanTag8021q = Codegen.ofNullable(vlanTag8021q);
            return this;
        }        public InterconnectAttachmentArgs build() {
            return new InterconnectAttachmentArgs(adminEnabled, bandwidth, candidateIpv6Subnets, candidateSubnets, cloudRouterIpv6InterfaceId, customerRouterIpv6InterfaceId, dataplaneVersion, description, edgeAvailabilityDomain, encryption, interconnect, ipsecInternalAddresses, labels, mtu, name, pairingKey, partnerAsn, partnerMetadata, project, region, requestId, router, stackType, type, validateOnly, vlanTag8021q);
        }
    }
}
