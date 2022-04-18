// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.LoadBalancerStatus;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressStatus {
    /**
     * LoadBalancer contains the current status of the load-balancer.
     * 
     */
    private final @Nullable LoadBalancerStatus loadBalancer;

    @CustomType.Constructor
    private IngressStatus(@CustomType.Parameter("loadBalancer") @Nullable LoadBalancerStatus loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    /**
     * LoadBalancer contains the current status of the load-balancer.
     * 
    */
    public Optional<LoadBalancerStatus> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LoadBalancerStatus loadBalancer;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancer = defaults.loadBalancer;
        }

        public Builder loadBalancer(@Nullable LoadBalancerStatus loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }        public IngressStatus build() {
            return new IngressStatus(loadBalancer);
        }
    }
}
