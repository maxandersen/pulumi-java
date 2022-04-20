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


public final class VpcIpv4CidrBlockAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final VpcIpv4CidrBlockAssociationState Empty = new VpcIpv4CidrBlockAssociationState();

    /**
     * The IPv4 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv4_netmask_length`.
     * 
     */
    @Import(name="cidrBlock")
      private final @Nullable Output<String> cidrBlock;

    public Output<String> cidrBlock() {
        return this.cidrBlock == null ? Codegen.empty() : this.cidrBlock;
    }

    /**
     * The ID of an IPv4 IPAM pool you want to use for allocating this VPC&#39;s CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts. Using IPAM you can monitor IP address usage throughout your AWS Organization.
     * 
     */
    @Import(name="ipv4IpamPoolId")
      private final @Nullable Output<String> ipv4IpamPoolId;

    public Output<String> ipv4IpamPoolId() {
        return this.ipv4IpamPoolId == null ? Codegen.empty() : this.ipv4IpamPoolId;
    }

    /**
     * The netmask length of the IPv4 CIDR you want to allocate to this VPC. Requires specifying a `ipv4_ipam_pool_id`.
     * 
     */
    @Import(name="ipv4NetmaskLength")
      private final @Nullable Output<Integer> ipv4NetmaskLength;

    public Output<Integer> ipv4NetmaskLength() {
        return this.ipv4NetmaskLength == null ? Codegen.empty() : this.ipv4NetmaskLength;
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

    public VpcIpv4CidrBlockAssociationState(
        @Nullable Output<String> cidrBlock,
        @Nullable Output<String> ipv4IpamPoolId,
        @Nullable Output<Integer> ipv4NetmaskLength,
        @Nullable Output<String> vpcId) {
        this.cidrBlock = cidrBlock;
        this.ipv4IpamPoolId = ipv4IpamPoolId;
        this.ipv4NetmaskLength = ipv4NetmaskLength;
        this.vpcId = vpcId;
    }

    private VpcIpv4CidrBlockAssociationState() {
        this.cidrBlock = Codegen.empty();
        this.ipv4IpamPoolId = Codegen.empty();
        this.ipv4NetmaskLength = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpv4CidrBlockAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cidrBlock;
        private @Nullable Output<String> ipv4IpamPoolId;
        private @Nullable Output<Integer> ipv4NetmaskLength;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpv4CidrBlockAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.ipv4IpamPoolId = defaults.ipv4IpamPoolId;
    	      this.ipv4NetmaskLength = defaults.ipv4NetmaskLength;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Codegen.ofNullable(cidrBlock);
            return this;
        }
        public Builder ipv4IpamPoolId(@Nullable Output<String> ipv4IpamPoolId) {
            this.ipv4IpamPoolId = ipv4IpamPoolId;
            return this;
        }
        public Builder ipv4IpamPoolId(@Nullable String ipv4IpamPoolId) {
            this.ipv4IpamPoolId = Codegen.ofNullable(ipv4IpamPoolId);
            return this;
        }
        public Builder ipv4NetmaskLength(@Nullable Output<Integer> ipv4NetmaskLength) {
            this.ipv4NetmaskLength = ipv4NetmaskLength;
            return this;
        }
        public Builder ipv4NetmaskLength(@Nullable Integer ipv4NetmaskLength) {
            this.ipv4NetmaskLength = Codegen.ofNullable(ipv4NetmaskLength);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public VpcIpv4CidrBlockAssociationState build() {
            return new VpcIpv4CidrBlockAssociationState(cidrBlock, ipv4IpamPoolId, ipv4NetmaskLength, vpcId);
        }
    }
}
