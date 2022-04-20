// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.compute.inputs.SubnetworkLogConfigArgs;
import com.pulumi.gcp.compute.inputs.SubnetworkSecondaryIpRangeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubnetworkArgs Empty = new SubnetworkArgs();

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource. This field can be set only at resource
     * creation time.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The range of IP addresses belonging to this subnetwork secondary
     * range. Provide this property when you create the subnetwork.
     * Ranges must be unique and non-overlapping with all primary and
     * secondary IP ranges within a network. Only IPv4 is supported.
     * 
     */
    @Import(name="ipCidrRange", required=true)
      private final Output<String> ipCidrRange;

    public Output<String> ipCidrRange() {
        return this.ipCidrRange;
    }

    /**
     * The access type of IPv6 address this subnet holds. It&#39;s immutable and can only be specified during creation
     * or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet
     * cannot enable direct path.
     * Possible values are `EXTERNAL`.
     * 
     */
    @Import(name="ipv6AccessType")
      private final @Nullable Output<String> ipv6AccessType;

    public Output<String> ipv6AccessType() {
        return this.ipv6AccessType == null ? Codegen.empty() : this.ipv6AccessType;
    }

    /**
     * Denotes the logging options for the subnetwork flow logs. If logging is enabled
     * logs will be exported to Stackdriver. This field cannot be set if the `purpose` of this
     * subnetwork is `INTERNAL_HTTPS_LOAD_BALANCER`
     * Structure is documented below.
     * 
     */
    @Import(name="logConfig")
      private final @Nullable Output<SubnetworkLogConfigArgs> logConfig;

    public Output<SubnetworkLogConfigArgs> logConfig() {
        return this.logConfig == null ? Codegen.empty() : this.logConfig;
    }

    /**
     * The name of the resource, provided by the client when initially
     * creating the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which
     * means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The network this subnet belongs to.
     * Only networks that are in the distributed mode can have subnetworks.
     * 
     */
    @Import(name="network", required=true)
      private final Output<String> network;

    public Output<String> network() {
        return this.network;
    }

    /**
     * When enabled, VMs in this subnetwork without external IP addresses can
     * access Google APIs and services by using Private Google Access.
     * 
     */
    @Import(name="privateIpGoogleAccess")
      private final @Nullable Output<Boolean> privateIpGoogleAccess;

    public Output<Boolean> privateIpGoogleAccess() {
        return this.privateIpGoogleAccess == null ? Codegen.empty() : this.privateIpGoogleAccess;
    }

    /**
     * The private IPv6 google access type for the VMs in this subnet.
     * 
     */
    @Import(name="privateIpv6GoogleAccess")
      private final @Nullable Output<String> privateIpv6GoogleAccess;

    public Output<String> privateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess == null ? Codegen.empty() : this.privateIpv6GoogleAccess;
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
     * The purpose of the resource. A subnetwork with purpose set to
     * INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is
     * reserved for Internal HTTP(S) Load Balancing.
     * If set to INTERNAL_HTTPS_LOAD_BALANCER you must also set the `role` field.
     * 
     */
    @Import(name="purpose")
      private final @Nullable Output<String> purpose;

    public Output<String> purpose() {
        return this.purpose == null ? Codegen.empty() : this.purpose;
    }

    /**
     * The GCP region for this subnetwork.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * The role of subnetwork. Currently, this field is only used when
     * purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE
     * or BACKUP. An ACTIVE subnetwork is one that is currently being used
     * for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that
     * is ready to be promoted to ACTIVE or is currently draining.
     * Possible values are `ACTIVE` and `BACKUP`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    /**
     * An array of configurations for secondary IP ranges for VM instances
     * contained in this subnetwork. The primary IP of such VM must belong
     * to the primary ipCidrRange of the subnetwork. The alias IPs may belong
     * to either primary or secondary ranges.
     * Structure is documented below.
     * 
     */
    @Import(name="secondaryIpRanges")
      private final @Nullable Output<List<SubnetworkSecondaryIpRangeArgs>> secondaryIpRanges;

    public Output<List<SubnetworkSecondaryIpRangeArgs>> secondaryIpRanges() {
        return this.secondaryIpRanges == null ? Codegen.empty() : this.secondaryIpRanges;
    }

    /**
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not.
     * If not specified IPV4_ONLY will be used.
     * Possible values are `IPV4_ONLY` and `IPV4_IPV6`.
     * 
     */
    @Import(name="stackType")
      private final @Nullable Output<String> stackType;

    public Output<String> stackType() {
        return this.stackType == null ? Codegen.empty() : this.stackType;
    }

    public SubnetworkArgs(
        @Nullable Output<String> description,
        Output<String> ipCidrRange,
        @Nullable Output<String> ipv6AccessType,
        @Nullable Output<SubnetworkLogConfigArgs> logConfig,
        @Nullable Output<String> name,
        Output<String> network,
        @Nullable Output<Boolean> privateIpGoogleAccess,
        @Nullable Output<String> privateIpv6GoogleAccess,
        @Nullable Output<String> project,
        @Nullable Output<String> purpose,
        @Nullable Output<String> region,
        @Nullable Output<String> role,
        @Nullable Output<List<SubnetworkSecondaryIpRangeArgs>> secondaryIpRanges,
        @Nullable Output<String> stackType) {
        this.description = description;
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange, "expected parameter 'ipCidrRange' to be non-null");
        this.ipv6AccessType = ipv6AccessType;
        this.logConfig = logConfig;
        this.name = name;
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.privateIpGoogleAccess = privateIpGoogleAccess;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.project = project;
        this.purpose = purpose;
        this.region = region;
        this.role = role;
        this.secondaryIpRanges = secondaryIpRanges;
        this.stackType = stackType;
    }

    private SubnetworkArgs() {
        this.description = Codegen.empty();
        this.ipCidrRange = Codegen.empty();
        this.ipv6AccessType = Codegen.empty();
        this.logConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.privateIpGoogleAccess = Codegen.empty();
        this.privateIpv6GoogleAccess = Codegen.empty();
        this.project = Codegen.empty();
        this.purpose = Codegen.empty();
        this.region = Codegen.empty();
        this.role = Codegen.empty();
        this.secondaryIpRanges = Codegen.empty();
        this.stackType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> ipCidrRange;
        private @Nullable Output<String> ipv6AccessType;
        private @Nullable Output<SubnetworkLogConfigArgs> logConfig;
        private @Nullable Output<String> name;
        private Output<String> network;
        private @Nullable Output<Boolean> privateIpGoogleAccess;
        private @Nullable Output<String> privateIpv6GoogleAccess;
        private @Nullable Output<String> project;
        private @Nullable Output<String> purpose;
        private @Nullable Output<String> region;
        private @Nullable Output<String> role;
        private @Nullable Output<List<SubnetworkSecondaryIpRangeArgs>> secondaryIpRanges;
        private @Nullable Output<String> stackType;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.privateIpGoogleAccess = defaults.privateIpGoogleAccess;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.project = defaults.project;
    	      this.purpose = defaults.purpose;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
    	      this.secondaryIpRanges = defaults.secondaryIpRanges;
    	      this.stackType = defaults.stackType;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder ipCidrRange(Output<String> ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }
        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Output.of(Objects.requireNonNull(ipCidrRange));
            return this;
        }
        public Builder ipv6AccessType(@Nullable Output<String> ipv6AccessType) {
            this.ipv6AccessType = ipv6AccessType;
            return this;
        }
        public Builder ipv6AccessType(@Nullable String ipv6AccessType) {
            this.ipv6AccessType = Codegen.ofNullable(ipv6AccessType);
            return this;
        }
        public Builder logConfig(@Nullable Output<SubnetworkLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public Builder logConfig(@Nullable SubnetworkLogConfigArgs logConfig) {
            this.logConfig = Codegen.ofNullable(logConfig);
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
        public Builder network(Output<String> network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder network(String network) {
            this.network = Output.of(Objects.requireNonNull(network));
            return this;
        }
        public Builder privateIpGoogleAccess(@Nullable Output<Boolean> privateIpGoogleAccess) {
            this.privateIpGoogleAccess = privateIpGoogleAccess;
            return this;
        }
        public Builder privateIpGoogleAccess(@Nullable Boolean privateIpGoogleAccess) {
            this.privateIpGoogleAccess = Codegen.ofNullable(privateIpGoogleAccess);
            return this;
        }
        public Builder privateIpv6GoogleAccess(@Nullable Output<String> privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }
        public Builder privateIpv6GoogleAccess(@Nullable String privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Codegen.ofNullable(privateIpv6GoogleAccess);
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
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }
        public Builder secondaryIpRanges(@Nullable Output<List<SubnetworkSecondaryIpRangeArgs>> secondaryIpRanges) {
            this.secondaryIpRanges = secondaryIpRanges;
            return this;
        }
        public Builder secondaryIpRanges(@Nullable List<SubnetworkSecondaryIpRangeArgs> secondaryIpRanges) {
            this.secondaryIpRanges = Codegen.ofNullable(secondaryIpRanges);
            return this;
        }
        public Builder secondaryIpRanges(SubnetworkSecondaryIpRangeArgs... secondaryIpRanges) {
            return secondaryIpRanges(List.of(secondaryIpRanges));
        }
        public Builder stackType(@Nullable Output<String> stackType) {
            this.stackType = stackType;
            return this;
        }
        public Builder stackType(@Nullable String stackType) {
            this.stackType = Codegen.ofNullable(stackType);
            return this;
        }        public SubnetworkArgs build() {
            return new SubnetworkArgs(description, ipCidrRange, ipv6AccessType, logConfig, name, network, privateIpGoogleAccess, privateIpv6GoogleAccess, project, purpose, region, role, secondaryIpRanges, stackType);
        }
    }
}
