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


public final class VpcIpv6CidrBlockAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final VpcIpv6CidrBlockAssociationState Empty = new VpcIpv6CidrBlockAssociationState();

    /**
     * The IPv6 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv6_netmask_length`. This parameter is required if `ipv6_netmask_length` is not set and he IPAM pool does not have `allocation_default_netmask` set.
     * 
     */
    @Import(name="ipv6CidrBlock")
      private final @Nullable Output<String> ipv6CidrBlock;

    public Output<String> ipv6CidrBlock() {
        return this.ipv6CidrBlock == null ? Codegen.empty() : this.ipv6CidrBlock;
    }

    /**
     * The ID of an IPv6 IPAM pool you want to use for allocating this VPC&#39;s CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts.
     * 
     */
    @Import(name="ipv6IpamPoolId")
      private final @Nullable Output<String> ipv6IpamPoolId;

    public Output<String> ipv6IpamPoolId() {
        return this.ipv6IpamPoolId == null ? Codegen.empty() : this.ipv6IpamPoolId;
    }

    /**
     * The netmask length of the IPv6 CIDR you want to allocate to this VPC. Requires specifying a `ipv6_ipam_pool_id`. This parameter is optional if the IPAM pool has `allocation_default_netmask` set, otherwise it or `cidr_block` are required
     * 
     */
    @Import(name="ipv6NetmaskLength")
      private final @Nullable Output<Integer> ipv6NetmaskLength;

    public Output<Integer> ipv6NetmaskLength() {
        return this.ipv6NetmaskLength == null ? Codegen.empty() : this.ipv6NetmaskLength;
    }

    /**
     * The ID of the VPC to make the association with.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public VpcIpv6CidrBlockAssociationState(
        @Nullable Output<String> ipv6CidrBlock,
        @Nullable Output<String> ipv6IpamPoolId,
        @Nullable Output<Integer> ipv6NetmaskLength,
        @Nullable Output<String> vpcId) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.ipv6IpamPoolId = ipv6IpamPoolId;
        this.ipv6NetmaskLength = ipv6NetmaskLength;
        this.vpcId = vpcId;
    }

    private VpcIpv6CidrBlockAssociationState() {
        this.ipv6CidrBlock = Codegen.empty();
        this.ipv6IpamPoolId = Codegen.empty();
        this.ipv6NetmaskLength = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpv6CidrBlockAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipv6CidrBlock;
        private @Nullable Output<String> ipv6IpamPoolId;
        private @Nullable Output<Integer> ipv6NetmaskLength;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpv6CidrBlockAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.ipv6IpamPoolId = defaults.ipv6IpamPoolId;
    	      this.ipv6NetmaskLength = defaults.ipv6NetmaskLength;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder ipv6CidrBlock(@Nullable Output<String> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public Builder ipv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = Codegen.ofNullable(ipv6CidrBlock);
            return this;
        }
        public Builder ipv6IpamPoolId(@Nullable Output<String> ipv6IpamPoolId) {
            this.ipv6IpamPoolId = ipv6IpamPoolId;
            return this;
        }
        public Builder ipv6IpamPoolId(@Nullable String ipv6IpamPoolId) {
            this.ipv6IpamPoolId = Codegen.ofNullable(ipv6IpamPoolId);
            return this;
        }
        public Builder ipv6NetmaskLength(@Nullable Output<Integer> ipv6NetmaskLength) {
            this.ipv6NetmaskLength = ipv6NetmaskLength;
            return this;
        }
        public Builder ipv6NetmaskLength(@Nullable Integer ipv6NetmaskLength) {
            this.ipv6NetmaskLength = Codegen.ofNullable(ipv6NetmaskLength);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public VpcIpv6CidrBlockAssociationState build() {
            return new VpcIpv6CidrBlockAssociationState(ipv6CidrBlock, ipv6IpamPoolId, ipv6NetmaskLength, vpcId);
        }
    }
}
