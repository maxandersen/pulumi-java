// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterKubernetesNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterKubernetesNetworkConfigArgs Empty = new ClusterKubernetesNetworkConfigArgs();

    /**
     * The IP family used to assign Kubernetes pod and service addresses. Valid values are `ipv4` (default) and `ipv6`. You can only specify an IP family when you create a cluster, changing this value will force a new cluster to be created.
     * 
     */
    @Import(name="ipFamily")
      private final @Nullable Output<String> ipFamily;

    public Output<String> ipFamily() {
        return this.ipFamily == null ? Codegen.empty() : this.ipFamily;
    }

    /**
     * The CIDR block to assign Kubernetes service IP addresses from. If you don&#39;t specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC. You can only specify a custom CIDR block when you create a cluster, changing this value will force a new cluster to be created. The block must meet the following requirements:
     * 
     */
    @Import(name="serviceIpv4Cidr")
      private final @Nullable Output<String> serviceIpv4Cidr;

    public Output<String> serviceIpv4Cidr() {
        return this.serviceIpv4Cidr == null ? Codegen.empty() : this.serviceIpv4Cidr;
    }

    public ClusterKubernetesNetworkConfigArgs(
        @Nullable Output<String> ipFamily,
        @Nullable Output<String> serviceIpv4Cidr) {
        this.ipFamily = ipFamily;
        this.serviceIpv4Cidr = serviceIpv4Cidr;
    }

    private ClusterKubernetesNetworkConfigArgs() {
        this.ipFamily = Codegen.empty();
        this.serviceIpv4Cidr = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterKubernetesNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipFamily;
        private @Nullable Output<String> serviceIpv4Cidr;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterKubernetesNetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipFamily = defaults.ipFamily;
    	      this.serviceIpv4Cidr = defaults.serviceIpv4Cidr;
        }

        public Builder ipFamily(@Nullable Output<String> ipFamily) {
            this.ipFamily = ipFamily;
            return this;
        }
        public Builder ipFamily(@Nullable String ipFamily) {
            this.ipFamily = Codegen.ofNullable(ipFamily);
            return this;
        }
        public Builder serviceIpv4Cidr(@Nullable Output<String> serviceIpv4Cidr) {
            this.serviceIpv4Cidr = serviceIpv4Cidr;
            return this;
        }
        public Builder serviceIpv4Cidr(@Nullable String serviceIpv4Cidr) {
            this.serviceIpv4Cidr = Codegen.ofNullable(serviceIpv4Cidr);
            return this;
        }        public ClusterKubernetesNetworkConfigArgs build() {
            return new ClusterKubernetesNetworkConfigArgs(ipFamily, serviceIpv4Cidr);
        }
    }
}
