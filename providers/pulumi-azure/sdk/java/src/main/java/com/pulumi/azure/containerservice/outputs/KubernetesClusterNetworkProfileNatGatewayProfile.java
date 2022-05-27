// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterNetworkProfileNatGatewayProfile {
    /**
     * @return The outcome (resource IDs) of the specified arguments.
     * 
     */
    private final @Nullable List<String> effectiveOutboundIps;
    /**
     * @return Desired outbound flow idle timeout in minutes for the cluster load balancer. Must be between `4` and `120` inclusive. Defaults to `4`.
     * 
     */
    private final @Nullable Integer idleTimeoutInMinutes;
    /**
     * @return Count of desired managed outbound IPs for the cluster load balancer. Must be between `1` and `100` inclusive.
     * 
     */
    private final @Nullable Integer managedOutboundIpCount;

    @CustomType.Constructor
    private KubernetesClusterNetworkProfileNatGatewayProfile(
        @CustomType.Parameter("effectiveOutboundIps") @Nullable List<String> effectiveOutboundIps,
        @CustomType.Parameter("idleTimeoutInMinutes") @Nullable Integer idleTimeoutInMinutes,
        @CustomType.Parameter("managedOutboundIpCount") @Nullable Integer managedOutboundIpCount) {
        this.effectiveOutboundIps = effectiveOutboundIps;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.managedOutboundIpCount = managedOutboundIpCount;
    }

    /**
     * @return The outcome (resource IDs) of the specified arguments.
     * 
     */
    public List<String> effectiveOutboundIps() {
        return this.effectiveOutboundIps == null ? List.of() : this.effectiveOutboundIps;
    }
    /**
     * @return Desired outbound flow idle timeout in minutes for the cluster load balancer. Must be between `4` and `120` inclusive. Defaults to `4`.
     * 
     */
    public Optional<Integer> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }
    /**
     * @return Count of desired managed outbound IPs for the cluster load balancer. Must be between `1` and `100` inclusive.
     * 
     */
    public Optional<Integer> managedOutboundIpCount() {
        return Optional.ofNullable(this.managedOutboundIpCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterNetworkProfileNatGatewayProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> effectiveOutboundIps;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable Integer managedOutboundIpCount;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterNetworkProfileNatGatewayProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effectiveOutboundIps = defaults.effectiveOutboundIps;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.managedOutboundIpCount = defaults.managedOutboundIpCount;
        }

        public Builder effectiveOutboundIps(@Nullable List<String> effectiveOutboundIps) {
            this.effectiveOutboundIps = effectiveOutboundIps;
            return this;
        }
        public Builder effectiveOutboundIps(String... effectiveOutboundIps) {
            return effectiveOutboundIps(List.of(effectiveOutboundIps));
        }
        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }
        public Builder managedOutboundIpCount(@Nullable Integer managedOutboundIpCount) {
            this.managedOutboundIpCount = managedOutboundIpCount;
            return this;
        }        public KubernetesClusterNetworkProfileNatGatewayProfile build() {
            return new KubernetesClusterNetworkProfileNatGatewayProfile(effectiveOutboundIps, idleTimeoutInMinutes, managedOutboundIpCount);
        }
    }
}
