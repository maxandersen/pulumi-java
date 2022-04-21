// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultSecurityGroupIngressGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefaultSecurityGroupIngressGetArgs Empty = new DefaultSecurityGroupIngressGetArgs();

    /**
     * List of CIDR blocks.
     * 
     */
    @Import(name="cidrBlocks")
    private @Nullable Output<List<String>> cidrBlocks;

    public Optional<Output<List<String>>> cidrBlocks() {
        return Optional.ofNullable(this.cidrBlocks);
    }

    /**
     * Description of this rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Start port (or ICMP type number if protocol is `icmp`)
     * 
     */
    @Import(name="fromPort", required=true)
    private Output<Integer> fromPort;

    public Output<Integer> fromPort() {
        return this.fromPort;
    }

    /**
     * List of IPv6 CIDR blocks.
     * 
     */
    @Import(name="ipv6CidrBlocks")
    private @Nullable Output<List<String>> ipv6CidrBlocks;

    public Optional<Output<List<String>>> ipv6CidrBlocks() {
        return Optional.ofNullable(this.ipv6CidrBlocks);
    }

    /**
     * List of prefix list IDs (for allowing access to VPC endpoints)
     * 
     */
    @Import(name="prefixListIds")
    private @Nullable Output<List<String>> prefixListIds;

    public Optional<Output<List<String>>> prefixListIds() {
        return Optional.ofNullable(this.prefixListIds);
    }

    /**
     * Protocol. If you select a protocol of &#34;-1&#34; (semantically equivalent to `all`, which is not a valid value here), you must specify a `from_port` and `to_port` equal to `0`. If not `icmp`, `tcp`, `udp`, or `-1` use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * Whether the security group itself will be added as a source to this egress rule.
     * 
     */
    @Import(name="self")
    private @Nullable Output<Boolean> self;

    public Optional<Output<Boolean>> self() {
        return Optional.ofNullable(this.self);
    }

    /**
     * End range port (or ICMP code if protocol is `icmp`).
     * 
     */
    @Import(name="toPort", required=true)
    private Output<Integer> toPort;

    public Output<Integer> toPort() {
        return this.toPort;
    }

    private DefaultSecurityGroupIngressGetArgs() {}

    private DefaultSecurityGroupIngressGetArgs(DefaultSecurityGroupIngressGetArgs $) {
        this.cidrBlocks = $.cidrBlocks;
        this.description = $.description;
        this.fromPort = $.fromPort;
        this.ipv6CidrBlocks = $.ipv6CidrBlocks;
        this.prefixListIds = $.prefixListIds;
        this.protocol = $.protocol;
        this.securityGroups = $.securityGroups;
        this.self = $.self;
        this.toPort = $.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultSecurityGroupIngressGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultSecurityGroupIngressGetArgs $;

        public Builder() {
            $ = new DefaultSecurityGroupIngressGetArgs();
        }

        public Builder(DefaultSecurityGroupIngressGetArgs defaults) {
            $ = new DefaultSecurityGroupIngressGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder cidrBlocks(@Nullable Output<List<String>> cidrBlocks) {
            $.cidrBlocks = cidrBlocks;
            return this;
        }

        public Builder cidrBlocks(List<String> cidrBlocks) {
            return cidrBlocks(Output.of(cidrBlocks));
        }

        public Builder cidrBlocks(String... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder fromPort(Output<Integer> fromPort) {
            $.fromPort = fromPort;
            return this;
        }

        public Builder fromPort(Integer fromPort) {
            return fromPort(Output.of(fromPort));
        }

        public Builder ipv6CidrBlocks(@Nullable Output<List<String>> ipv6CidrBlocks) {
            $.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }

        public Builder ipv6CidrBlocks(List<String> ipv6CidrBlocks) {
            return ipv6CidrBlocks(Output.of(ipv6CidrBlocks));
        }

        public Builder ipv6CidrBlocks(String... ipv6CidrBlocks) {
            return ipv6CidrBlocks(List.of(ipv6CidrBlocks));
        }

        public Builder prefixListIds(@Nullable Output<List<String>> prefixListIds) {
            $.prefixListIds = prefixListIds;
            return this;
        }

        public Builder prefixListIds(List<String> prefixListIds) {
            return prefixListIds(Output.of(prefixListIds));
        }

        public Builder prefixListIds(String... prefixListIds) {
            return prefixListIds(List.of(prefixListIds));
        }

        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        public Builder self(@Nullable Output<Boolean> self) {
            $.self = self;
            return this;
        }

        public Builder self(Boolean self) {
            return self(Output.of(self));
        }

        public Builder toPort(Output<Integer> toPort) {
            $.toPort = toPort;
            return this;
        }

        public Builder toPort(Integer toPort) {
            return toPort(Output.of(toPort));
        }

        public DefaultSecurityGroupIngressGetArgs build() {
            $.fromPort = Objects.requireNonNull($.fromPort, "expected parameter 'fromPort' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.toPort = Objects.requireNonNull($.toPort, "expected parameter 'toPort' to be non-null");
            return $;
        }
    }

}
