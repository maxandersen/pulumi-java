// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerSubnetMappingGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerSubnetMappingGetArgs Empty = new LoadBalancerSubnetMappingGetArgs();

    /**
     * The allocation ID of the Elastic IP address.
     * 
     */
    @Import(name="allocationId")
      private final @Nullable Output<String> allocationId;

    public Output<String> allocationId() {
        return this.allocationId == null ? Codegen.empty() : this.allocationId;
    }

    /**
     * An ipv6 address within the subnet to assign to the internet-facing load balancer.
     * 
     */
    @Import(name="ipv6Address")
      private final @Nullable Output<String> ipv6Address;

    public Output<String> ipv6Address() {
        return this.ipv6Address == null ? Codegen.empty() : this.ipv6Address;
    }

    @Import(name="outpostId")
      private final @Nullable Output<String> outpostId;

    public Output<String> outpostId() {
        return this.outpostId == null ? Codegen.empty() : this.outpostId;
    }

    /**
     * A private ipv4 address within the subnet to assign to the internal-facing load balancer.
     * 
     */
    @Import(name="privateIpv4Address")
      private final @Nullable Output<String> privateIpv4Address;

    public Output<String> privateIpv4Address() {
        return this.privateIpv4Address == null ? Codegen.empty() : this.privateIpv4Address;
    }

    /**
     * The id of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
     * 
     */
    @Import(name="subnetId", required=true)
      private final Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId;
    }

    public LoadBalancerSubnetMappingGetArgs(
        @Nullable Output<String> allocationId,
        @Nullable Output<String> ipv6Address,
        @Nullable Output<String> outpostId,
        @Nullable Output<String> privateIpv4Address,
        Output<String> subnetId) {
        this.allocationId = allocationId;
        this.ipv6Address = ipv6Address;
        this.outpostId = outpostId;
        this.privateIpv4Address = privateIpv4Address;
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private LoadBalancerSubnetMappingGetArgs() {
        this.allocationId = Codegen.empty();
        this.ipv6Address = Codegen.empty();
        this.outpostId = Codegen.empty();
        this.privateIpv4Address = Codegen.empty();
        this.subnetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerSubnetMappingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allocationId;
        private @Nullable Output<String> ipv6Address;
        private @Nullable Output<String> outpostId;
        private @Nullable Output<String> privateIpv4Address;
        private Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerSubnetMappingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.outpostId = defaults.outpostId;
    	      this.privateIpv4Address = defaults.privateIpv4Address;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder allocationId(@Nullable Output<String> allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public Builder allocationId(@Nullable String allocationId) {
            this.allocationId = Codegen.ofNullable(allocationId);
            return this;
        }
        public Builder ipv6Address(@Nullable Output<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public Builder ipv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = Codegen.ofNullable(ipv6Address);
            return this;
        }
        public Builder outpostId(@Nullable Output<String> outpostId) {
            this.outpostId = outpostId;
            return this;
        }
        public Builder outpostId(@Nullable String outpostId) {
            this.outpostId = Codegen.ofNullable(outpostId);
            return this;
        }
        public Builder privateIpv4Address(@Nullable Output<String> privateIpv4Address) {
            this.privateIpv4Address = privateIpv4Address;
            return this;
        }
        public Builder privateIpv4Address(@Nullable String privateIpv4Address) {
            this.privateIpv4Address = Codegen.ofNullable(privateIpv4Address);
            return this;
        }
        public Builder subnetId(Output<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Output.of(Objects.requireNonNull(subnetId));
            return this;
        }        public LoadBalancerSubnetMappingGetArgs build() {
            return new LoadBalancerSubnetMappingGetArgs(allocationId, ipv6Address, outpostId, privateIpv4Address, subnetId);
        }
    }
}
