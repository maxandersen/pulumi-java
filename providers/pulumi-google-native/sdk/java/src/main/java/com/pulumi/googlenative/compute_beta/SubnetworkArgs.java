// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.SubnetworkIpv6AccessType;
import com.pulumi.googlenative.compute_beta.enums.SubnetworkPrivateIpv6GoogleAccess;
import com.pulumi.googlenative.compute_beta.enums.SubnetworkPurpose;
import com.pulumi.googlenative.compute_beta.enums.SubnetworkRole;
import com.pulumi.googlenative.compute_beta.enums.SubnetworkStackType;
import com.pulumi.googlenative.compute_beta.inputs.SubnetworkLogConfigArgs;
import com.pulumi.googlenative.compute_beta.inputs.SubnetworkSecondaryRangeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubnetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubnetworkArgs Empty = new SubnetworkArgs();

    /**
     * Whether this subnetwork&#39;s ranges can conflict with existing static routes. Setting this to true allows this subnetwork&#39;s primary and secondary ranges to overlap with (and contain) static routes that have already been configured on the corresponding network. For example if a static route has range 10.1.0.0/16, a subnet range 10.0.0.0/8 could only be created if allow_conflicting_routes=true. Overlapping is only allowed on subnetwork operations; routes whose ranges conflict with this subnetwork&#39;s ranges won&#39;t be allowed unless route.allow_conflicting_subnetworks is set to true. Typically packets destined to IPs within the subnetwork (which may contain private/sensitive data) are prevented from leaving the virtual network. Setting this field to true will disable this feature. The default value is false and applies to all existing subnetworks and automatically created subnetworks. This field cannot be set to true at resource creation time.
     * 
     */
    @Import(name="allowSubnetCidrRoutesOverlap")
    private @Nullable Output<Boolean> allowSubnetCidrRoutesOverlap;

    public Optional<Output<Boolean>> allowSubnetCidrRoutesOverlap() {
        return Optional.ofNullable(this.allowSubnetCidrRoutesOverlap);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource. This field can be set only at resource creation time.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled. This field isn&#39;t supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    @Import(name="enableFlowLogs")
    private @Nullable Output<Boolean> enableFlowLogs;

    public Optional<Output<Boolean>> enableFlowLogs() {
        return Optional.ofNullable(this.enableFlowLogs);
    }

    /**
     * The range of internal addresses that are owned by this subnetwork. Provide this property when you create the subnetwork. For example, 10.0.0.0/8 or 100.64.0.0/10. Ranges must be unique and non-overlapping within a network. Only IPv4 is supported. This field is set at resource creation time. The range can be any range listed in the Valid ranges list. The range can be expanded after creation using expandIpCidrRange.
     * 
     */
    @Import(name="ipCidrRange")
    private @Nullable Output<String> ipCidrRange;

    public Optional<Output<String>> ipCidrRange() {
        return Optional.ofNullable(this.ipCidrRange);
    }

    /**
     * The access type of IPv6 address this subnet holds. It&#39;s immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet cannot enable direct path.
     * 
     */
    @Import(name="ipv6AccessType")
    private @Nullable Output<SubnetworkIpv6AccessType> ipv6AccessType;

    public Optional<Output<SubnetworkIpv6AccessType>> ipv6AccessType() {
        return Optional.ofNullable(this.ipv6AccessType);
    }

    /**
     * This field denotes the VPC flow logging options for this subnetwork. If logging is enabled, logs are exported to Cloud Logging.
     * 
     */
    @Import(name="logConfig")
    private @Nullable Output<SubnetworkLogConfigArgs> logConfig;

    public Optional<Output<SubnetworkLogConfigArgs>> logConfig() {
        return Optional.ofNullable(this.logConfig);
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URL of the network to which this subnetwork belongs, provided by the client when initially creating the subnetwork. This field can be set only at resource creation time.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Whether the VMs in this subnet can access Google services without assigned external IP addresses. This field can be both set at resource creation time and updated using setPrivateIpGoogleAccess.
     * 
     */
    @Import(name="privateIpGoogleAccess")
    private @Nullable Output<Boolean> privateIpGoogleAccess;

    public Optional<Output<Boolean>> privateIpGoogleAccess() {
        return Optional.ofNullable(this.privateIpGoogleAccess);
    }

    /**
     * The private IPv6 google access type for the VMs in this subnet. This is an expanded field of enablePrivateV6Access. If both fields are set, privateIpv6GoogleAccess will take priority. This field can be both set at resource creation time and updated using patch.
     * 
     */
    @Import(name="privateIpv6GoogleAccess")
    private @Nullable Output<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess;

    public Optional<Output<SubnetworkPrivateIpv6GoogleAccess>> privateIpv6GoogleAccess() {
        return Optional.ofNullable(this.privateIpv6GoogleAccess);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose defaults to PRIVATE_RFC_1918. The enableFlowLogs field isn&#39;t supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    @Import(name="purpose")
    private @Nullable Output<SubnetworkPurpose> purpose;

    public Optional<Output<SubnetworkPurpose>> purpose() {
        return Optional.ofNullable(this.purpose);
    }

    /**
     * URL of the region where the Subnetwork resides. This field can be set only at resource creation time.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * The role of subnetwork. Currently, this field is only used when purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
     * 
     */
    @Import(name="role")
    private @Nullable Output<SubnetworkRole> role;

    public Optional<Output<SubnetworkRole>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * An array of configurations for secondary IP ranges for VM instances contained in this subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork. The alias IPs may belong to either primary or secondary ranges. This field can be updated with a patch request.
     * 
     */
    @Import(name="secondaryIpRanges")
    private @Nullable Output<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges;

    public Optional<Output<List<SubnetworkSecondaryRangeArgs>>> secondaryIpRanges() {
        return Optional.ofNullable(this.secondaryIpRanges);
    }

    /**
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not. If not specified IPV4_ONLY will be used. This field can be both set at resource creation time and updated using patch.
     * 
     */
    @Import(name="stackType")
    private @Nullable Output<SubnetworkStackType> stackType;

    public Optional<Output<SubnetworkStackType>> stackType() {
        return Optional.ofNullable(this.stackType);
    }

    private SubnetworkArgs() {}

    private SubnetworkArgs(SubnetworkArgs $) {
        this.allowSubnetCidrRoutesOverlap = $.allowSubnetCidrRoutesOverlap;
        this.description = $.description;
        this.enableFlowLogs = $.enableFlowLogs;
        this.ipCidrRange = $.ipCidrRange;
        this.ipv6AccessType = $.ipv6AccessType;
        this.logConfig = $.logConfig;
        this.name = $.name;
        this.network = $.network;
        this.privateIpGoogleAccess = $.privateIpGoogleAccess;
        this.privateIpv6GoogleAccess = $.privateIpv6GoogleAccess;
        this.project = $.project;
        this.purpose = $.purpose;
        this.region = $.region;
        this.requestId = $.requestId;
        this.role = $.role;
        this.secondaryIpRanges = $.secondaryIpRanges;
        this.stackType = $.stackType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetworkArgs $;

        public Builder() {
            $ = new SubnetworkArgs();
        }

        public Builder(SubnetworkArgs defaults) {
            $ = new SubnetworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowSubnetCidrRoutesOverlap(@Nullable Output<Boolean> allowSubnetCidrRoutesOverlap) {
            $.allowSubnetCidrRoutesOverlap = allowSubnetCidrRoutesOverlap;
            return this;
        }

        public Builder allowSubnetCidrRoutesOverlap(Boolean allowSubnetCidrRoutesOverlap) {
            return allowSubnetCidrRoutesOverlap(Output.of(allowSubnetCidrRoutesOverlap));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder enableFlowLogs(@Nullable Output<Boolean> enableFlowLogs) {
            $.enableFlowLogs = enableFlowLogs;
            return this;
        }

        public Builder enableFlowLogs(Boolean enableFlowLogs) {
            return enableFlowLogs(Output.of(enableFlowLogs));
        }

        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            $.ipCidrRange = ipCidrRange;
            return this;
        }

        public Builder ipCidrRange(String ipCidrRange) {
            return ipCidrRange(Output.of(ipCidrRange));
        }

        public Builder ipv6AccessType(@Nullable Output<SubnetworkIpv6AccessType> ipv6AccessType) {
            $.ipv6AccessType = ipv6AccessType;
            return this;
        }

        public Builder ipv6AccessType(SubnetworkIpv6AccessType ipv6AccessType) {
            return ipv6AccessType(Output.of(ipv6AccessType));
        }

        public Builder logConfig(@Nullable Output<SubnetworkLogConfigArgs> logConfig) {
            $.logConfig = logConfig;
            return this;
        }

        public Builder logConfig(SubnetworkLogConfigArgs logConfig) {
            return logConfig(Output.of(logConfig));
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

        public Builder privateIpGoogleAccess(@Nullable Output<Boolean> privateIpGoogleAccess) {
            $.privateIpGoogleAccess = privateIpGoogleAccess;
            return this;
        }

        public Builder privateIpGoogleAccess(Boolean privateIpGoogleAccess) {
            return privateIpGoogleAccess(Output.of(privateIpGoogleAccess));
        }

        public Builder privateIpv6GoogleAccess(@Nullable Output<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess) {
            $.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }

        public Builder privateIpv6GoogleAccess(SubnetworkPrivateIpv6GoogleAccess privateIpv6GoogleAccess) {
            return privateIpv6GoogleAccess(Output.of(privateIpv6GoogleAccess));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder purpose(@Nullable Output<SubnetworkPurpose> purpose) {
            $.purpose = purpose;
            return this;
        }

        public Builder purpose(SubnetworkPurpose purpose) {
            return purpose(Output.of(purpose));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder role(@Nullable Output<SubnetworkRole> role) {
            $.role = role;
            return this;
        }

        public Builder role(SubnetworkRole role) {
            return role(Output.of(role));
        }

        public Builder secondaryIpRanges(@Nullable Output<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges) {
            $.secondaryIpRanges = secondaryIpRanges;
            return this;
        }

        public Builder secondaryIpRanges(List<SubnetworkSecondaryRangeArgs> secondaryIpRanges) {
            return secondaryIpRanges(Output.of(secondaryIpRanges));
        }

        public Builder secondaryIpRanges(SubnetworkSecondaryRangeArgs... secondaryIpRanges) {
            return secondaryIpRanges(List.of(secondaryIpRanges));
        }

        public Builder stackType(@Nullable Output<SubnetworkStackType> stackType) {
            $.stackType = stackType;
            return this;
        }

        public Builder stackType(SubnetworkStackType stackType) {
            return stackType(Output.of(stackType));
        }

        public SubnetworkArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
