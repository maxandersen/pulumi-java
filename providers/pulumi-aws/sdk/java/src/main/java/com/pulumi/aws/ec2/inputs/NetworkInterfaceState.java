// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.NetworkInterfaceAttachmentGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInterfaceState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceState Empty = new NetworkInterfaceState();

    /**
     * ARN of the network interface.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Configuration block to define the attachment of the ENI. See below.
     * 
     */
    @Import(name="attachments")
      private final @Nullable Output<List<NetworkInterfaceAttachmentGetArgs>> attachments;

    public Output<List<NetworkInterfaceAttachmentGetArgs>> attachments() {
        return this.attachments == null ? Codegen.empty() : this.attachments;
    }

    /**
     * Description for the network interface.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Type of network interface to create. Set to `efa` for Elastic Fabric Adapter. Changing `interface_type` will cause the resource to be destroyed and re-created.
     * 
     */
    @Import(name="interfaceType")
      private final @Nullable Output<String> interfaceType;

    public Output<String> interfaceType() {
        return this.interfaceType == null ? Codegen.empty() : this.interfaceType;
    }

    /**
     * Number of IPv4 prefixes that AWS automatically assigns to the network interface.
     * 
     */
    @Import(name="ipv4PrefixCount")
      private final @Nullable Output<Integer> ipv4PrefixCount;

    public Output<Integer> ipv4PrefixCount() {
        return this.ipv4PrefixCount == null ? Codegen.empty() : this.ipv4PrefixCount;
    }

    /**
     * One or more IPv4 prefixes assigned to the network interface.
     * 
     */
    @Import(name="ipv4Prefixes")
      private final @Nullable Output<List<String>> ipv4Prefixes;

    public Output<List<String>> ipv4Prefixes() {
        return this.ipv4Prefixes == null ? Codegen.empty() : this.ipv4Prefixes;
    }

    /**
     * Number of IPv6 addresses to assign to a network interface. You can&#39;t use this option if specifying specific `ipv6_addresses`. If your subnet has the AssignIpv6AddressOnCreation attribute set to `true`, you can specify `0` to override this setting.
     * 
     */
    @Import(name="ipv6AddressCount")
      private final @Nullable Output<Integer> ipv6AddressCount;

    public Output<Integer> ipv6AddressCount() {
        return this.ipv6AddressCount == null ? Codegen.empty() : this.ipv6AddressCount;
    }

    @Import(name="ipv6AddressListEnabled")
      private final @Nullable Output<Boolean> ipv6AddressListEnabled;

    public Output<Boolean> ipv6AddressListEnabled() {
        return this.ipv6AddressListEnabled == null ? Codegen.empty() : this.ipv6AddressListEnabled;
    }

    /**
     * List of private IPs to assign to the ENI in sequential order.
     * 
     */
    @Import(name="ipv6AddressLists")
      private final @Nullable Output<List<String>> ipv6AddressLists;

    public Output<List<String>> ipv6AddressLists() {
        return this.ipv6AddressLists == null ? Codegen.empty() : this.ipv6AddressLists;
    }

    /**
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. Addresses are assigned without regard to order. You can&#39;t use this option if you&#39;re specifying `ipv6_address_count`.
     * 
     */
    @Import(name="ipv6Addresses")
      private final @Nullable Output<List<String>> ipv6Addresses;

    public Output<List<String>> ipv6Addresses() {
        return this.ipv6Addresses == null ? Codegen.empty() : this.ipv6Addresses;
    }

    /**
     * Number of IPv6 prefixes that AWS automatically assigns to the network interface.
     * 
     */
    @Import(name="ipv6PrefixCount")
      private final @Nullable Output<Integer> ipv6PrefixCount;

    public Output<Integer> ipv6PrefixCount() {
        return this.ipv6PrefixCount == null ? Codegen.empty() : this.ipv6PrefixCount;
    }

    /**
     * One or more IPv6 prefixes assigned to the network interface.
     * 
     */
    @Import(name="ipv6Prefixes")
      private final @Nullable Output<List<String>> ipv6Prefixes;

    public Output<List<String>> ipv6Prefixes() {
        return this.ipv6Prefixes == null ? Codegen.empty() : this.ipv6Prefixes;
    }

    /**
     * MAC address of the network interface.
     * 
     */
    @Import(name="macAddress")
      private final @Nullable Output<String> macAddress;

    public Output<String> macAddress() {
        return this.macAddress == null ? Codegen.empty() : this.macAddress;
    }

    @Import(name="outpostArn")
      private final @Nullable Output<String> outpostArn;

    public Output<String> outpostArn() {
        return this.outpostArn == null ? Codegen.empty() : this.outpostArn;
    }

    /**
     * AWS account ID of the owner of the network interface.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> ownerId() {
        return this.ownerId == null ? Codegen.empty() : this.ownerId;
    }

    /**
     * Private DNS name of the network interface (IPv4).
     * 
     */
    @Import(name="privateDnsName")
      private final @Nullable Output<String> privateDnsName;

    public Output<String> privateDnsName() {
        return this.privateDnsName == null ? Codegen.empty() : this.privateDnsName;
    }

    @Import(name="privateIp")
      private final @Nullable Output<String> privateIp;

    public Output<String> privateIp() {
        return this.privateIp == null ? Codegen.empty() : this.privateIp;
    }

    @Import(name="privateIpListEnabled")
      private final @Nullable Output<Boolean> privateIpListEnabled;

    public Output<Boolean> privateIpListEnabled() {
        return this.privateIpListEnabled == null ? Codegen.empty() : this.privateIpListEnabled;
    }

    /**
     * List of private IPs to assign to the ENI in sequential order. Requires setting `private_ip_list_enable` to `true`.
     * 
     */
    @Import(name="privateIpLists")
      private final @Nullable Output<List<String>> privateIpLists;

    public Output<List<String>> privateIpLists() {
        return this.privateIpLists == null ? Codegen.empty() : this.privateIpLists;
    }

    /**
     * List of private IPs to assign to the ENI without regard to order.
     * 
     */
    @Import(name="privateIps")
      private final @Nullable Output<List<String>> privateIps;

    public Output<List<String>> privateIps() {
        return this.privateIps == null ? Codegen.empty() : this.privateIps;
    }

    /**
     * Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + `private_ips_count`, as a primary private IP will be assiged to an ENI by default.
     * 
     */
    @Import(name="privateIpsCount")
      private final @Nullable Output<Integer> privateIpsCount;

    public Output<Integer> privateIpsCount() {
        return this.privateIpsCount == null ? Codegen.empty() : this.privateIpsCount;
    }

    /**
     * List of security group IDs to assign to the ENI.
     * 
     */
    @Import(name="securityGroups")
      private final @Nullable Output<List<String>> securityGroups;

    public Output<List<String>> securityGroups() {
        return this.securityGroups == null ? Codegen.empty() : this.securityGroups;
    }

    /**
     * Whether to enable source destination checking for the ENI. Default true.
     * 
     */
    @Import(name="sourceDestCheck")
      private final @Nullable Output<Boolean> sourceDestCheck;

    public Output<Boolean> sourceDestCheck() {
        return this.sourceDestCheck == null ? Codegen.empty() : this.sourceDestCheck;
    }

    /**
     * Subnet ID to create the ENI in.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId == null ? Codegen.empty() : this.subnetId;
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public NetworkInterfaceState(
        @Nullable Output<String> arn,
        @Nullable Output<List<NetworkInterfaceAttachmentGetArgs>> attachments,
        @Nullable Output<String> description,
        @Nullable Output<String> interfaceType,
        @Nullable Output<Integer> ipv4PrefixCount,
        @Nullable Output<List<String>> ipv4Prefixes,
        @Nullable Output<Integer> ipv6AddressCount,
        @Nullable Output<Boolean> ipv6AddressListEnabled,
        @Nullable Output<List<String>> ipv6AddressLists,
        @Nullable Output<List<String>> ipv6Addresses,
        @Nullable Output<Integer> ipv6PrefixCount,
        @Nullable Output<List<String>> ipv6Prefixes,
        @Nullable Output<String> macAddress,
        @Nullable Output<String> outpostArn,
        @Nullable Output<String> ownerId,
        @Nullable Output<String> privateDnsName,
        @Nullable Output<String> privateIp,
        @Nullable Output<Boolean> privateIpListEnabled,
        @Nullable Output<List<String>> privateIpLists,
        @Nullable Output<List<String>> privateIps,
        @Nullable Output<Integer> privateIpsCount,
        @Nullable Output<List<String>> securityGroups,
        @Nullable Output<Boolean> sourceDestCheck,
        @Nullable Output<String> subnetId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.attachments = attachments;
        this.description = description;
        this.interfaceType = interfaceType;
        this.ipv4PrefixCount = ipv4PrefixCount;
        this.ipv4Prefixes = ipv4Prefixes;
        this.ipv6AddressCount = ipv6AddressCount;
        this.ipv6AddressListEnabled = ipv6AddressListEnabled;
        this.ipv6AddressLists = ipv6AddressLists;
        this.ipv6Addresses = ipv6Addresses;
        this.ipv6PrefixCount = ipv6PrefixCount;
        this.ipv6Prefixes = ipv6Prefixes;
        this.macAddress = macAddress;
        this.outpostArn = outpostArn;
        this.ownerId = ownerId;
        this.privateDnsName = privateDnsName;
        this.privateIp = privateIp;
        this.privateIpListEnabled = privateIpListEnabled;
        this.privateIpLists = privateIpLists;
        this.privateIps = privateIps;
        this.privateIpsCount = privateIpsCount;
        this.securityGroups = securityGroups;
        this.sourceDestCheck = sourceDestCheck;
        this.subnetId = subnetId;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private NetworkInterfaceState() {
        this.arn = Codegen.empty();
        this.attachments = Codegen.empty();
        this.description = Codegen.empty();
        this.interfaceType = Codegen.empty();
        this.ipv4PrefixCount = Codegen.empty();
        this.ipv4Prefixes = Codegen.empty();
        this.ipv6AddressCount = Codegen.empty();
        this.ipv6AddressListEnabled = Codegen.empty();
        this.ipv6AddressLists = Codegen.empty();
        this.ipv6Addresses = Codegen.empty();
        this.ipv6PrefixCount = Codegen.empty();
        this.ipv6Prefixes = Codegen.empty();
        this.macAddress = Codegen.empty();
        this.outpostArn = Codegen.empty();
        this.ownerId = Codegen.empty();
        this.privateDnsName = Codegen.empty();
        this.privateIp = Codegen.empty();
        this.privateIpListEnabled = Codegen.empty();
        this.privateIpLists = Codegen.empty();
        this.privateIps = Codegen.empty();
        this.privateIpsCount = Codegen.empty();
        this.securityGroups = Codegen.empty();
        this.sourceDestCheck = Codegen.empty();
        this.subnetId = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<NetworkInterfaceAttachmentGetArgs>> attachments;
        private @Nullable Output<String> description;
        private @Nullable Output<String> interfaceType;
        private @Nullable Output<Integer> ipv4PrefixCount;
        private @Nullable Output<List<String>> ipv4Prefixes;
        private @Nullable Output<Integer> ipv6AddressCount;
        private @Nullable Output<Boolean> ipv6AddressListEnabled;
        private @Nullable Output<List<String>> ipv6AddressLists;
        private @Nullable Output<List<String>> ipv6Addresses;
        private @Nullable Output<Integer> ipv6PrefixCount;
        private @Nullable Output<List<String>> ipv6Prefixes;
        private @Nullable Output<String> macAddress;
        private @Nullable Output<String> outpostArn;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<String> privateDnsName;
        private @Nullable Output<String> privateIp;
        private @Nullable Output<Boolean> privateIpListEnabled;
        private @Nullable Output<List<String>> privateIpLists;
        private @Nullable Output<List<String>> privateIps;
        private @Nullable Output<Integer> privateIpsCount;
        private @Nullable Output<List<String>> securityGroups;
        private @Nullable Output<Boolean> sourceDestCheck;
        private @Nullable Output<String> subnetId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.attachments = defaults.attachments;
    	      this.description = defaults.description;
    	      this.interfaceType = defaults.interfaceType;
    	      this.ipv4PrefixCount = defaults.ipv4PrefixCount;
    	      this.ipv4Prefixes = defaults.ipv4Prefixes;
    	      this.ipv6AddressCount = defaults.ipv6AddressCount;
    	      this.ipv6AddressListEnabled = defaults.ipv6AddressListEnabled;
    	      this.ipv6AddressLists = defaults.ipv6AddressLists;
    	      this.ipv6Addresses = defaults.ipv6Addresses;
    	      this.ipv6PrefixCount = defaults.ipv6PrefixCount;
    	      this.ipv6Prefixes = defaults.ipv6Prefixes;
    	      this.macAddress = defaults.macAddress;
    	      this.outpostArn = defaults.outpostArn;
    	      this.ownerId = defaults.ownerId;
    	      this.privateDnsName = defaults.privateDnsName;
    	      this.privateIp = defaults.privateIp;
    	      this.privateIpListEnabled = defaults.privateIpListEnabled;
    	      this.privateIpLists = defaults.privateIpLists;
    	      this.privateIps = defaults.privateIps;
    	      this.privateIpsCount = defaults.privateIpsCount;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sourceDestCheck = defaults.sourceDestCheck;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder attachments(@Nullable Output<List<NetworkInterfaceAttachmentGetArgs>> attachments) {
            this.attachments = attachments;
            return this;
        }
        public Builder attachments(@Nullable List<NetworkInterfaceAttachmentGetArgs> attachments) {
            this.attachments = Codegen.ofNullable(attachments);
            return this;
        }
        public Builder attachments(NetworkInterfaceAttachmentGetArgs... attachments) {
            return attachments(List.of(attachments));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder interfaceType(@Nullable Output<String> interfaceType) {
            this.interfaceType = interfaceType;
            return this;
        }
        public Builder interfaceType(@Nullable String interfaceType) {
            this.interfaceType = Codegen.ofNullable(interfaceType);
            return this;
        }
        public Builder ipv4PrefixCount(@Nullable Output<Integer> ipv4PrefixCount) {
            this.ipv4PrefixCount = ipv4PrefixCount;
            return this;
        }
        public Builder ipv4PrefixCount(@Nullable Integer ipv4PrefixCount) {
            this.ipv4PrefixCount = Codegen.ofNullable(ipv4PrefixCount);
            return this;
        }
        public Builder ipv4Prefixes(@Nullable Output<List<String>> ipv4Prefixes) {
            this.ipv4Prefixes = ipv4Prefixes;
            return this;
        }
        public Builder ipv4Prefixes(@Nullable List<String> ipv4Prefixes) {
            this.ipv4Prefixes = Codegen.ofNullable(ipv4Prefixes);
            return this;
        }
        public Builder ipv4Prefixes(String... ipv4Prefixes) {
            return ipv4Prefixes(List.of(ipv4Prefixes));
        }
        public Builder ipv6AddressCount(@Nullable Output<Integer> ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Builder ipv6AddressCount(@Nullable Integer ipv6AddressCount) {
            this.ipv6AddressCount = Codegen.ofNullable(ipv6AddressCount);
            return this;
        }
        public Builder ipv6AddressListEnabled(@Nullable Output<Boolean> ipv6AddressListEnabled) {
            this.ipv6AddressListEnabled = ipv6AddressListEnabled;
            return this;
        }
        public Builder ipv6AddressListEnabled(@Nullable Boolean ipv6AddressListEnabled) {
            this.ipv6AddressListEnabled = Codegen.ofNullable(ipv6AddressListEnabled);
            return this;
        }
        public Builder ipv6AddressLists(@Nullable Output<List<String>> ipv6AddressLists) {
            this.ipv6AddressLists = ipv6AddressLists;
            return this;
        }
        public Builder ipv6AddressLists(@Nullable List<String> ipv6AddressLists) {
            this.ipv6AddressLists = Codegen.ofNullable(ipv6AddressLists);
            return this;
        }
        public Builder ipv6AddressLists(String... ipv6AddressLists) {
            return ipv6AddressLists(List.of(ipv6AddressLists));
        }
        public Builder ipv6Addresses(@Nullable Output<List<String>> ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }
        public Builder ipv6Addresses(@Nullable List<String> ipv6Addresses) {
            this.ipv6Addresses = Codegen.ofNullable(ipv6Addresses);
            return this;
        }
        public Builder ipv6Addresses(String... ipv6Addresses) {
            return ipv6Addresses(List.of(ipv6Addresses));
        }
        public Builder ipv6PrefixCount(@Nullable Output<Integer> ipv6PrefixCount) {
            this.ipv6PrefixCount = ipv6PrefixCount;
            return this;
        }
        public Builder ipv6PrefixCount(@Nullable Integer ipv6PrefixCount) {
            this.ipv6PrefixCount = Codegen.ofNullable(ipv6PrefixCount);
            return this;
        }
        public Builder ipv6Prefixes(@Nullable Output<List<String>> ipv6Prefixes) {
            this.ipv6Prefixes = ipv6Prefixes;
            return this;
        }
        public Builder ipv6Prefixes(@Nullable List<String> ipv6Prefixes) {
            this.ipv6Prefixes = Codegen.ofNullable(ipv6Prefixes);
            return this;
        }
        public Builder ipv6Prefixes(String... ipv6Prefixes) {
            return ipv6Prefixes(List.of(ipv6Prefixes));
        }
        public Builder macAddress(@Nullable Output<String> macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public Builder macAddress(@Nullable String macAddress) {
            this.macAddress = Codegen.ofNullable(macAddress);
            return this;
        }
        public Builder outpostArn(@Nullable Output<String> outpostArn) {
            this.outpostArn = outpostArn;
            return this;
        }
        public Builder outpostArn(@Nullable String outpostArn) {
            this.outpostArn = Codegen.ofNullable(outpostArn);
            return this;
        }
        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Codegen.ofNullable(ownerId);
            return this;
        }
        public Builder privateDnsName(@Nullable Output<String> privateDnsName) {
            this.privateDnsName = privateDnsName;
            return this;
        }
        public Builder privateDnsName(@Nullable String privateDnsName) {
            this.privateDnsName = Codegen.ofNullable(privateDnsName);
            return this;
        }
        public Builder privateIp(@Nullable Output<String> privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public Builder privateIp(@Nullable String privateIp) {
            this.privateIp = Codegen.ofNullable(privateIp);
            return this;
        }
        public Builder privateIpListEnabled(@Nullable Output<Boolean> privateIpListEnabled) {
            this.privateIpListEnabled = privateIpListEnabled;
            return this;
        }
        public Builder privateIpListEnabled(@Nullable Boolean privateIpListEnabled) {
            this.privateIpListEnabled = Codegen.ofNullable(privateIpListEnabled);
            return this;
        }
        public Builder privateIpLists(@Nullable Output<List<String>> privateIpLists) {
            this.privateIpLists = privateIpLists;
            return this;
        }
        public Builder privateIpLists(@Nullable List<String> privateIpLists) {
            this.privateIpLists = Codegen.ofNullable(privateIpLists);
            return this;
        }
        public Builder privateIpLists(String... privateIpLists) {
            return privateIpLists(List.of(privateIpLists));
        }
        public Builder privateIps(@Nullable Output<List<String>> privateIps) {
            this.privateIps = privateIps;
            return this;
        }
        public Builder privateIps(@Nullable List<String> privateIps) {
            this.privateIps = Codegen.ofNullable(privateIps);
            return this;
        }
        public Builder privateIps(String... privateIps) {
            return privateIps(List.of(privateIps));
        }
        public Builder privateIpsCount(@Nullable Output<Integer> privateIpsCount) {
            this.privateIpsCount = privateIpsCount;
            return this;
        }
        public Builder privateIpsCount(@Nullable Integer privateIpsCount) {
            this.privateIpsCount = Codegen.ofNullable(privateIpsCount);
            return this;
        }
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Codegen.ofNullable(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder sourceDestCheck(@Nullable Output<Boolean> sourceDestCheck) {
            this.sourceDestCheck = sourceDestCheck;
            return this;
        }
        public Builder sourceDestCheck(@Nullable Boolean sourceDestCheck) {
            this.sourceDestCheck = Codegen.ofNullable(sourceDestCheck);
            return this;
        }
        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Codegen.ofNullable(subnetId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public NetworkInterfaceState build() {
            return new NetworkInterfaceState(arn, attachments, description, interfaceType, ipv4PrefixCount, ipv4Prefixes, ipv6AddressCount, ipv6AddressListEnabled, ipv6AddressLists, ipv6Addresses, ipv6PrefixCount, ipv6Prefixes, macAddress, outpostArn, ownerId, privateDnsName, privateIp, privateIpListEnabled, privateIpLists, privateIps, privateIpsCount, securityGroups, sourceDestCheck, subnetId, tags, tagsAll);
        }
    }
}
