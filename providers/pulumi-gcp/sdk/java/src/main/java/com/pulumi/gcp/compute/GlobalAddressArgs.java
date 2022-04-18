// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalAddressArgs Empty = new GlobalAddressArgs();

    /**
     * The IP address or beginning of the address range represented by this
     * resource. This can be supplied as an input to reserve a specific
     * address or omitted to allow GCP to choose a valid one for you.
     * 
     */
    @Import(name="address")
      private final @Nullable Output<String> address;

    public Output<String> address() {
        return this.address == null ? Codegen.empty() : this.address;
    }

    /**
     * The type of the address to reserve.
     * * EXTERNAL indicates public/external single IP address.
     * * INTERNAL indicates internal IP ranges belonging to some network.
     *   Default value is `EXTERNAL`.
     *   Possible values are `EXTERNAL` and `INTERNAL`.
     * 
     */
    @Import(name="addressType")
      private final @Nullable Output<String> addressType;

    public Output<String> addressType() {
        return this.addressType == null ? Codegen.empty() : this.addressType;
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
     * The IP Version that will be used by this address. The default value is `IPV4`.
     * Possible values are `IPV4` and `IPV6`.
     * 
     */
    @Import(name="ipVersion")
      private final @Nullable Output<String> ipVersion;

    public Output<String> ipVersion() {
        return this.ipVersion == null ? Codegen.empty() : this.ipVersion;
    }

    /**
     * Labels to apply to this address.  A list of key->value pairs.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The URL of the network in which to reserve the IP range. The IP range
     * must be in RFC1918 space. The network cannot be deleted if there are
     * any reserved IP ranges referring to it.
     * This should only be set when using an Internal address.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * The prefix length of the IP range. If not present, it means the
     * address field is a single IP address.
     * This field is not applicable to addresses with addressType=EXTERNAL,
     * or addressType=INTERNAL when purpose=PRIVATE_SERVICE_CONNECT
     * 
     */
    @Import(name="prefixLength")
      private final @Nullable Output<Integer> prefixLength;

    public Output<Integer> prefixLength() {
        return this.prefixLength == null ? Codegen.empty() : this.prefixLength;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The purpose of the resource. Possible values include:
     * * VPC_PEERING - for peer networks
     * * PRIVATE_SERVICE_CONNECT - for Private Service Connect networks
     * 
     */
    @Import(name="purpose")
      private final @Nullable Output<String> purpose;

    public Output<String> purpose() {
        return this.purpose == null ? Codegen.empty() : this.purpose;
    }

    public GlobalAddressArgs(
        @Nullable Output<String> address,
        @Nullable Output<String> addressType,
        @Nullable Output<String> description,
        @Nullable Output<String> ipVersion,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<Integer> prefixLength,
        @Nullable Output<String> project,
        @Nullable Output<String> purpose) {
        this.address = address;
        this.addressType = addressType;
        this.description = description;
        this.ipVersion = ipVersion;
        this.labels = labels;
        this.name = name;
        this.network = network;
        this.prefixLength = prefixLength;
        this.project = project;
        this.purpose = purpose;
    }

    private GlobalAddressArgs() {
        this.address = Codegen.empty();
        this.addressType = Codegen.empty();
        this.description = Codegen.empty();
        this.ipVersion = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.prefixLength = Codegen.empty();
        this.project = Codegen.empty();
        this.purpose = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> address;
        private @Nullable Output<String> addressType;
        private @Nullable Output<String> description;
        private @Nullable Output<String> ipVersion;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<Integer> prefixLength;
        private @Nullable Output<String> project;
        private @Nullable Output<String> purpose;

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
    	      this.prefixLength = defaults.prefixLength;
    	      this.project = defaults.project;
    	      this.purpose = defaults.purpose;
        }

        public Builder address(@Nullable Output<String> address) {
            this.address = address;
            return this;
        }
        public Builder address(@Nullable String address) {
            this.address = Codegen.ofNullable(address);
            return this;
        }
        public Builder addressType(@Nullable Output<String> addressType) {
            this.addressType = addressType;
            return this;
        }
        public Builder addressType(@Nullable String addressType) {
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
        public Builder ipVersion(@Nullable Output<String> ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Builder ipVersion(@Nullable String ipVersion) {
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
        public Builder purpose(@Nullable Output<String> purpose) {
            this.purpose = purpose;
            return this;
        }
        public Builder purpose(@Nullable String purpose) {
            this.purpose = Codegen.ofNullable(purpose);
            return this;
        }        public GlobalAddressArgs build() {
            return new GlobalAddressArgs(address, addressType, description, ipVersion, labels, name, network, prefixLength, project, purpose);
        }
    }
}
