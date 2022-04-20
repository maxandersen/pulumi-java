// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultNetworkAclIngressGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefaultNetworkAclIngressGetArgs Empty = new DefaultNetworkAclIngressGetArgs();

    /**
     * The action to take.
     * 
     */
    @Import(name="action", required=true)
      private final Output<String> action;

    public Output<String> action() {
        return this.action;
    }

    /**
     * The CIDR block to match. This must be a valid network mask.
     * 
     */
    @Import(name="cidrBlock")
      private final @Nullable Output<String> cidrBlock;

    public Output<String> cidrBlock() {
        return this.cidrBlock == null ? Codegen.empty() : this.cidrBlock;
    }

    /**
     * The from port to match.
     * 
     */
    @Import(name="fromPort", required=true)
      private final Output<Integer> fromPort;

    public Output<Integer> fromPort() {
        return this.fromPort;
    }

    /**
     * The ICMP type code to be used. Default 0.
     * 
     */
    @Import(name="icmpCode")
      private final @Nullable Output<Integer> icmpCode;

    public Output<Integer> icmpCode() {
        return this.icmpCode == null ? Codegen.empty() : this.icmpCode;
    }

    /**
     * The ICMP type to be used. Default 0.
     * 
     */
    @Import(name="icmpType")
      private final @Nullable Output<Integer> icmpType;

    public Output<Integer> icmpType() {
        return this.icmpType == null ? Codegen.empty() : this.icmpType;
    }

    /**
     * The IPv6 CIDR block.
     * 
     */
    @Import(name="ipv6CidrBlock")
      private final @Nullable Output<String> ipv6CidrBlock;

    public Output<String> ipv6CidrBlock() {
        return this.ipv6CidrBlock == null ? Codegen.empty() : this.ipv6CidrBlock;
    }

    /**
     * The protocol to match. If using the -1 &#39;all&#39; protocol, you must specify a from and to port of 0.
     * 
     */
    @Import(name="protocol", required=true)
      private final Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * The rule number. Used for ordering.
     * 
     */
    @Import(name="ruleNo", required=true)
      private final Output<Integer> ruleNo;

    public Output<Integer> ruleNo() {
        return this.ruleNo;
    }

    /**
     * The to port to match.
     * 
     */
    @Import(name="toPort", required=true)
      private final Output<Integer> toPort;

    public Output<Integer> toPort() {
        return this.toPort;
    }

    public DefaultNetworkAclIngressGetArgs(
        Output<String> action,
        @Nullable Output<String> cidrBlock,
        Output<Integer> fromPort,
        @Nullable Output<Integer> icmpCode,
        @Nullable Output<Integer> icmpType,
        @Nullable Output<String> ipv6CidrBlock,
        Output<String> protocol,
        Output<Integer> ruleNo,
        Output<Integer> toPort) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.cidrBlock = cidrBlock;
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.icmpCode = icmpCode;
        this.icmpType = icmpType;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.ruleNo = Objects.requireNonNull(ruleNo, "expected parameter 'ruleNo' to be non-null");
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
    }

    private DefaultNetworkAclIngressGetArgs() {
        this.action = Codegen.empty();
        this.cidrBlock = Codegen.empty();
        this.fromPort = Codegen.empty();
        this.icmpCode = Codegen.empty();
        this.icmpType = Codegen.empty();
        this.ipv6CidrBlock = Codegen.empty();
        this.protocol = Codegen.empty();
        this.ruleNo = Codegen.empty();
        this.toPort = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultNetworkAclIngressGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> action;
        private @Nullable Output<String> cidrBlock;
        private Output<Integer> fromPort;
        private @Nullable Output<Integer> icmpCode;
        private @Nullable Output<Integer> icmpType;
        private @Nullable Output<String> ipv6CidrBlock;
        private Output<String> protocol;
        private Output<Integer> ruleNo;
        private Output<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultNetworkAclIngressGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.fromPort = defaults.fromPort;
    	      this.icmpCode = defaults.icmpCode;
    	      this.icmpType = defaults.icmpType;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.protocol = defaults.protocol;
    	      this.ruleNo = defaults.ruleNo;
    	      this.toPort = defaults.toPort;
        }

        public Builder action(Output<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(String action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Codegen.ofNullable(cidrBlock);
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
        public Builder icmpCode(@Nullable Output<Integer> icmpCode) {
            this.icmpCode = icmpCode;
            return this;
        }
        public Builder icmpCode(@Nullable Integer icmpCode) {
            this.icmpCode = Codegen.ofNullable(icmpCode);
            return this;
        }
        public Builder icmpType(@Nullable Output<Integer> icmpType) {
            this.icmpType = icmpType;
            return this;
        }
        public Builder icmpType(@Nullable Integer icmpType) {
            this.icmpType = Codegen.ofNullable(icmpType);
            return this;
        }
        public Builder ipv6CidrBlock(@Nullable Output<String> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public Builder ipv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = Codegen.ofNullable(ipv6CidrBlock);
            return this;
        }
        public Builder protocol(Output<String> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Output.of(Objects.requireNonNull(protocol));
            return this;
        }
        public Builder ruleNo(Output<Integer> ruleNo) {
            this.ruleNo = Objects.requireNonNull(ruleNo);
            return this;
        }
        public Builder ruleNo(Integer ruleNo) {
            this.ruleNo = Output.of(Objects.requireNonNull(ruleNo));
            return this;
        }
        public Builder toPort(Output<Integer> toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }
        public Builder toPort(Integer toPort) {
            this.toPort = Output.of(Objects.requireNonNull(toPort));
            return this;
        }        public DefaultNetworkAclIngressGetArgs build() {
            return new DefaultNetworkAclIngressGetArgs(action, cidrBlock, fromPort, icmpCode, icmpType, ipv6CidrBlock, protocol, ruleNo, toPort);
        }
    }
}
