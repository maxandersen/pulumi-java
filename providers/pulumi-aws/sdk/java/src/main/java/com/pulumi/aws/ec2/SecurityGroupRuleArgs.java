// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.ec2.enums.ProtocolType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityGroupRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityGroupRuleArgs Empty = new SecurityGroupRuleArgs();

    /**
     * List of CIDR blocks. Cannot be specified with `source_security_group_id` or `self`.
     * 
     */
    @Import(name="cidrBlocks")
      private final @Nullable Output<List<String>> cidrBlocks;

    public Output<List<String>> cidrBlocks() {
        return this.cidrBlocks == null ? Codegen.empty() : this.cidrBlocks;
    }

    /**
     * Description of the rule.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Start port (or ICMP type number if protocol is &#34;icmp&#34; or &#34;icmpv6&#34;).
     * 
     */
    @Import(name="fromPort", required=true)
      private final Output<Integer> fromPort;

    public Output<Integer> fromPort() {
        return this.fromPort;
    }

    /**
     * List of IPv6 CIDR blocks. Cannot be specified with `source_security_group_id` or `self`.
     * 
     */
    @Import(name="ipv6CidrBlocks")
      private final @Nullable Output<List<String>> ipv6CidrBlocks;

    public Output<List<String>> ipv6CidrBlocks() {
        return this.ipv6CidrBlocks == null ? Codegen.empty() : this.ipv6CidrBlocks;
    }

    /**
     * List of Prefix List IDs.
     * 
     */
    @Import(name="prefixListIds")
      private final @Nullable Output<List<String>> prefixListIds;

    public Output<List<String>> prefixListIds() {
        return this.prefixListIds == null ? Codegen.empty() : this.prefixListIds;
    }

    /**
     * Protocol. If not icmp, icmpv6, tcp, udp, or all use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * 
     */
    @Import(name="protocol", required=true)
      private final Output<Either<String,ProtocolType>> protocol;

    public Output<Either<String,ProtocolType>> protocol() {
        return this.protocol;
    }

    /**
     * Security group to apply this rule to.
     * 
     */
    @Import(name="securityGroupId", required=true)
      private final Output<String> securityGroupId;

    public Output<String> securityGroupId() {
        return this.securityGroupId;
    }

    /**
     * Whether the security group itself will be added as a source to this ingress rule. Cannot be specified with `cidr_blocks`, `ipv6_cidr_blocks`, or `source_security_group_id`.
     * 
     */
    @Import(name="self")
      private final @Nullable Output<Boolean> self;

    public Output<Boolean> self() {
        return this.self == null ? Codegen.empty() : this.self;
    }

    /**
     * Security group id to allow access to/from, depending on the `type`. Cannot be specified with `cidr_blocks`, `ipv6_cidr_blocks`, or `self`.
     * 
     */
    @Import(name="sourceSecurityGroupId")
      private final @Nullable Output<String> sourceSecurityGroupId;

    public Output<String> sourceSecurityGroupId() {
        return this.sourceSecurityGroupId == null ? Codegen.empty() : this.sourceSecurityGroupId;
    }

    /**
     * End port (or ICMP code if protocol is &#34;icmp&#34;).
     * 
     */
    @Import(name="toPort", required=true)
      private final Output<Integer> toPort;

    public Output<Integer> toPort() {
        return this.toPort;
    }

    /**
     * Type of rule being created. Valid options are `ingress` (inbound)
     * or `egress` (outbound).
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public SecurityGroupRuleArgs(
        @Nullable Output<List<String>> cidrBlocks,
        @Nullable Output<String> description,
        Output<Integer> fromPort,
        @Nullable Output<List<String>> ipv6CidrBlocks,
        @Nullable Output<List<String>> prefixListIds,
        Output<Either<String,ProtocolType>> protocol,
        Output<String> securityGroupId,
        @Nullable Output<Boolean> self,
        @Nullable Output<String> sourceSecurityGroupId,
        Output<Integer> toPort,
        Output<String> type) {
        this.cidrBlocks = cidrBlocks;
        this.description = description;
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.ipv6CidrBlocks = ipv6CidrBlocks;
        this.prefixListIds = prefixListIds;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.securityGroupId = Objects.requireNonNull(securityGroupId, "expected parameter 'securityGroupId' to be non-null");
        this.self = self;
        this.sourceSecurityGroupId = sourceSecurityGroupId;
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SecurityGroupRuleArgs() {
        this.cidrBlocks = Codegen.empty();
        this.description = Codegen.empty();
        this.fromPort = Codegen.empty();
        this.ipv6CidrBlocks = Codegen.empty();
        this.prefixListIds = Codegen.empty();
        this.protocol = Codegen.empty();
        this.securityGroupId = Codegen.empty();
        this.self = Codegen.empty();
        this.sourceSecurityGroupId = Codegen.empty();
        this.toPort = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGroupRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> cidrBlocks;
        private @Nullable Output<String> description;
        private Output<Integer> fromPort;
        private @Nullable Output<List<String>> ipv6CidrBlocks;
        private @Nullable Output<List<String>> prefixListIds;
        private Output<Either<String,ProtocolType>> protocol;
        private Output<String> securityGroupId;
        private @Nullable Output<Boolean> self;
        private @Nullable Output<String> sourceSecurityGroupId;
        private Output<Integer> toPort;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityGroupRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.description = defaults.description;
    	      this.fromPort = defaults.fromPort;
    	      this.ipv6CidrBlocks = defaults.ipv6CidrBlocks;
    	      this.prefixListIds = defaults.prefixListIds;
    	      this.protocol = defaults.protocol;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.self = defaults.self;
    	      this.sourceSecurityGroupId = defaults.sourceSecurityGroupId;
    	      this.toPort = defaults.toPort;
    	      this.type = defaults.type;
        }

        public Builder cidrBlocks(@Nullable Output<List<String>> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }
        public Builder cidrBlocks(@Nullable List<String> cidrBlocks) {
            this.cidrBlocks = Codegen.ofNullable(cidrBlocks);
            return this;
        }
        public Builder cidrBlocks(String... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder fromPort(Output<Integer> fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }
        public Builder fromPort(Integer fromPort) {
            this.fromPort = Output.of(Objects.requireNonNull(fromPort));
            return this;
        }
        public Builder ipv6CidrBlocks(@Nullable Output<List<String>> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }
        public Builder ipv6CidrBlocks(@Nullable List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = Codegen.ofNullable(ipv6CidrBlocks);
            return this;
        }
        public Builder ipv6CidrBlocks(String... ipv6CidrBlocks) {
            return ipv6CidrBlocks(List.of(ipv6CidrBlocks));
        }
        public Builder prefixListIds(@Nullable Output<List<String>> prefixListIds) {
            this.prefixListIds = prefixListIds;
            return this;
        }
        public Builder prefixListIds(@Nullable List<String> prefixListIds) {
            this.prefixListIds = Codegen.ofNullable(prefixListIds);
            return this;
        }
        public Builder prefixListIds(String... prefixListIds) {
            return prefixListIds(List.of(prefixListIds));
        }
        public Builder protocol(Output<Either<String,ProtocolType>> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder protocol(Either<String,ProtocolType> protocol) {
            this.protocol = Output.of(Objects.requireNonNull(protocol));
            return this;
        }
        public Builder securityGroupId(Output<String> securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Output.of(Objects.requireNonNull(securityGroupId));
            return this;
        }
        public Builder self(@Nullable Output<Boolean> self) {
            this.self = self;
            return this;
        }
        public Builder self(@Nullable Boolean self) {
            this.self = Codegen.ofNullable(self);
            return this;
        }
        public Builder sourceSecurityGroupId(@Nullable Output<String> sourceSecurityGroupId) {
            this.sourceSecurityGroupId = sourceSecurityGroupId;
            return this;
        }
        public Builder sourceSecurityGroupId(@Nullable String sourceSecurityGroupId) {
            this.sourceSecurityGroupId = Codegen.ofNullable(sourceSecurityGroupId);
            return this;
        }
        public Builder toPort(Output<Integer> toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }
        public Builder toPort(Integer toPort) {
            this.toPort = Output.of(Objects.requireNonNull(toPort));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public SecurityGroupRuleArgs build() {
            return new SecurityGroupRuleArgs(cidrBlocks, description, fromPort, ipv6CidrBlocks, prefixListIds, protocol, securityGroupId, self, sourceSecurityGroupId, toPort, type);
        }
    }
}
