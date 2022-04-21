// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final AddressArgs Empty = new AddressArgs();

    /**
     * The static external IP address represented by this resource. Only
     * IPv4 is supported. An address may only be specified for INTERNAL
     * address types. The IP address must be inside the specified subnetwork,
     * if any.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The type of address to reserve.
     * Default value is `EXTERNAL`.
     * Possible values are `INTERNAL` and `EXTERNAL`.
     * 
     */
    @Import(name="addressType")
    private @Nullable Output<String> addressType;

    public Optional<Output<String>> addressType() {
        return Optional.ofNullable(this.addressType);
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Labels to apply to this address.  A list of key-&gt;value pairs.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URL of the network in which to reserve the address. This field
     * can only be used with INTERNAL type with the VPC_PEERING and
     * IPSEC_INTERCONNECT purposes.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The networking tier used for configuring this address. If this field is not
     * specified, it is assumed to be PREMIUM.
     * Possible values are `PREMIUM` and `STANDARD`.
     * 
     */
    @Import(name="networkTier")
    private @Nullable Output<String> networkTier;

    public Optional<Output<String>> networkTier() {
        return Optional.ofNullable(this.networkTier);
    }

    /**
     * The prefix length if the resource represents an IP range.
     * 
     */
    @Import(name="prefixLength")
    private @Nullable Output<Integer> prefixLength;

    public Optional<Output<Integer>> prefixLength() {
        return Optional.ofNullable(this.prefixLength);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The purpose of this resource, which can be one of the following values:
     * * GCE_ENDPOINT for addresses that are used by VM instances, alias IP
     *   ranges, internal load balancers, and similar resources.
     * * SHARED_LOADBALANCER_VIP for an address that can be used by multiple
     *   internal load balancers.
     * * VPC_PEERING for addresses that are reserved for VPC peer networks.
     * * IPSEC_INTERCONNECT for addresses created from a private IP range
     *   that are reserved for a VLAN attachment in an IPsec-encrypted Cloud
     *   Interconnect configuration. These addresses are regional resources.
     * * PRIVATE_SERVICE_CONNECT for a private network address that is used
     *   to configure Private Service Connect. Only global internal addresses
     *   can use this purpose.
     *   This should only be set when using an Internal address.
     * 
     */
    @Import(name="purpose")
    private @Nullable Output<String> purpose;

    public Optional<Output<String>> purpose() {
        return Optional.ofNullable(this.purpose);
    }

    /**
     * The Region in which the created address should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The URL of the subnetwork in which to reserve the address. If an IP
     * address is specified, it must be within the subnetwork&#39;s IP range.
     * This field can only be used with INTERNAL type with
     * GCE_ENDPOINT/DNS_RESOLVER purposes.
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    private AddressArgs() {}

    private AddressArgs(AddressArgs $) {
        this.address = $.address;
        this.addressType = $.addressType;
        this.description = $.description;
        this.labels = $.labels;
        this.name = $.name;
        this.network = $.network;
        this.networkTier = $.networkTier;
        this.prefixLength = $.prefixLength;
        this.project = $.project;
        this.purpose = $.purpose;
        this.region = $.region;
        this.subnetwork = $.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddressArgs $;

        public Builder() {
            $ = new AddressArgs();
        }

        public Builder(AddressArgs defaults) {
            $ = new AddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        public Builder address(String address) {
            return address(Output.of(address));
        }

        public Builder addressType(@Nullable Output<String> addressType) {
            $.addressType = addressType;
            return this;
        }

        public Builder addressType(String addressType) {
            return addressType(Output.of(addressType));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public Builder networkTier(@Nullable Output<String> networkTier) {
            $.networkTier = networkTier;
            return this;
        }

        public Builder networkTier(String networkTier) {
            return networkTier(Output.of(networkTier));
        }

        public Builder prefixLength(@Nullable Output<Integer> prefixLength) {
            $.prefixLength = prefixLength;
            return this;
        }

        public Builder prefixLength(Integer prefixLength) {
            return prefixLength(Output.of(prefixLength));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder purpose(@Nullable Output<String> purpose) {
            $.purpose = purpose;
            return this;
        }

        public Builder purpose(String purpose) {
            return purpose(Output.of(purpose));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        public AddressArgs build() {
            return $;
        }
    }

}
