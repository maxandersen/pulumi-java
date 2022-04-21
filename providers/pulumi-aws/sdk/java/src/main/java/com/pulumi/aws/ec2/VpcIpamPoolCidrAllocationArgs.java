// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcIpamPoolCidrAllocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcIpamPoolCidrAllocationArgs Empty = new VpcIpamPoolCidrAllocationArgs();

    /**
     * The CIDR you want to assign to the pool.
     * 
     */
    @Import(name="cidr")
    private @Nullable Output<String> cidr;

    public Optional<Output<String>> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * The description for the allocation.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Exclude a particular CIDR range from being returned by the pool.
     * 
     */
    @Import(name="disallowedCidrs")
    private @Nullable Output<List<String>> disallowedCidrs;

    public Optional<Output<List<String>>> disallowedCidrs() {
        return Optional.ofNullable(this.disallowedCidrs);
    }

    /**
     * The ID of the pool to which you want to assign a CIDR.
     * 
     */
    @Import(name="ipamPoolId", required=true)
    private Output<String> ipamPoolId;

    public Output<String> ipamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * The netmask length of the CIDR you would like to allocate to the IPAM pool. Valid Values: `0-32`.
     * 
     */
    @Import(name="netmaskLength")
    private @Nullable Output<Integer> netmaskLength;

    public Optional<Output<Integer>> netmaskLength() {
        return Optional.ofNullable(this.netmaskLength);
    }

    private VpcIpamPoolCidrAllocationArgs() {}

    private VpcIpamPoolCidrAllocationArgs(VpcIpamPoolCidrAllocationArgs $) {
        this.cidr = $.cidr;
        this.description = $.description;
        this.disallowedCidrs = $.disallowedCidrs;
        this.ipamPoolId = $.ipamPoolId;
        this.netmaskLength = $.netmaskLength;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcIpamPoolCidrAllocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcIpamPoolCidrAllocationArgs $;

        public Builder() {
            $ = new VpcIpamPoolCidrAllocationArgs();
        }

        public Builder(VpcIpamPoolCidrAllocationArgs defaults) {
            $ = new VpcIpamPoolCidrAllocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder cidr(@Nullable Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder disallowedCidrs(@Nullable Output<List<String>> disallowedCidrs) {
            $.disallowedCidrs = disallowedCidrs;
            return this;
        }

        public Builder disallowedCidrs(List<String> disallowedCidrs) {
            return disallowedCidrs(Output.of(disallowedCidrs));
        }

        public Builder disallowedCidrs(String... disallowedCidrs) {
            return disallowedCidrs(List.of(disallowedCidrs));
        }

        public Builder ipamPoolId(Output<String> ipamPoolId) {
            $.ipamPoolId = ipamPoolId;
            return this;
        }

        public Builder ipamPoolId(String ipamPoolId) {
            return ipamPoolId(Output.of(ipamPoolId));
        }

        public Builder netmaskLength(@Nullable Output<Integer> netmaskLength) {
            $.netmaskLength = netmaskLength;
            return this;
        }

        public Builder netmaskLength(Integer netmaskLength) {
            return netmaskLength(Output.of(netmaskLength));
        }

        public VpcIpamPoolCidrAllocationArgs build() {
            $.ipamPoolId = Objects.requireNonNull($.ipamPoolId, "expected parameter 'ipamPoolId' to be non-null");
            return $;
        }
    }

}
