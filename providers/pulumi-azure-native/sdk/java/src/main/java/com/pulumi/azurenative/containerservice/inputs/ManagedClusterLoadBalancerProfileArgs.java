// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.azurenative.containerservice.inputs.ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs;
import com.pulumi.azurenative.containerservice.inputs.ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs;
import com.pulumi.azurenative.containerservice.inputs.ManagedClusterLoadBalancerProfileOutboundIPsArgs;
import com.pulumi.azurenative.containerservice.inputs.ResourceReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Profile of the managed cluster load balancer.
 * 
 */
public final class ManagedClusterLoadBalancerProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedClusterLoadBalancerProfileArgs Empty = new ManagedClusterLoadBalancerProfileArgs();

    /**
     * Desired number of allocated SNAT ports per VM. Allowed values must be in the range of 0 to 64000 (inclusive). The default value is 0 which results in Azure dynamically allocating ports.
     * 
     */
    @Import(name="allocatedOutboundPorts")
    private @Nullable Output<Integer> allocatedOutboundPorts;

    /**
     * @return Desired number of allocated SNAT ports per VM. Allowed values must be in the range of 0 to 64000 (inclusive). The default value is 0 which results in Azure dynamically allocating ports.
     * 
     */
    public Optional<Output<Integer>> allocatedOutboundPorts() {
        return Optional.ofNullable(this.allocatedOutboundPorts);
    }

    /**
     * The effective outbound IP resources of the cluster load balancer.
     * 
     */
    @Import(name="effectiveOutboundIPs")
    private @Nullable Output<List<ResourceReferenceArgs>> effectiveOutboundIPs;

    /**
     * @return The effective outbound IP resources of the cluster load balancer.
     * 
     */
    public Optional<Output<List<ResourceReferenceArgs>>> effectiveOutboundIPs() {
        return Optional.ofNullable(this.effectiveOutboundIPs);
    }

    /**
     * Desired outbound flow idle timeout in minutes. Allowed values must be in the range of 4 to 120 (inclusive). The default value is 30 minutes.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
    private @Nullable Output<Integer> idleTimeoutInMinutes;

    /**
     * @return Desired outbound flow idle timeout in minutes. Allowed values must be in the range of 4 to 120 (inclusive). The default value is 30 minutes.
     * 
     */
    public Optional<Output<Integer>> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * Desired managed outbound IPs for the cluster load balancer.
     * 
     */
    @Import(name="managedOutboundIPs")
    private @Nullable Output<ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs> managedOutboundIPs;

    /**
     * @return Desired managed outbound IPs for the cluster load balancer.
     * 
     */
    public Optional<Output<ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs>> managedOutboundIPs() {
        return Optional.ofNullable(this.managedOutboundIPs);
    }

    /**
     * Desired outbound IP Prefix resources for the cluster load balancer.
     * 
     */
    @Import(name="outboundIPPrefixes")
    private @Nullable Output<ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs> outboundIPPrefixes;

    /**
     * @return Desired outbound IP Prefix resources for the cluster load balancer.
     * 
     */
    public Optional<Output<ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs>> outboundIPPrefixes() {
        return Optional.ofNullable(this.outboundIPPrefixes);
    }

    /**
     * Desired outbound IP resources for the cluster load balancer.
     * 
     */
    @Import(name="outboundIPs")
    private @Nullable Output<ManagedClusterLoadBalancerProfileOutboundIPsArgs> outboundIPs;

    /**
     * @return Desired outbound IP resources for the cluster load balancer.
     * 
     */
    public Optional<Output<ManagedClusterLoadBalancerProfileOutboundIPsArgs>> outboundIPs() {
        return Optional.ofNullable(this.outboundIPs);
    }

    private ManagedClusterLoadBalancerProfileArgs() {}

    private ManagedClusterLoadBalancerProfileArgs(ManagedClusterLoadBalancerProfileArgs $) {
        this.allocatedOutboundPorts = $.allocatedOutboundPorts;
        this.effectiveOutboundIPs = $.effectiveOutboundIPs;
        this.idleTimeoutInMinutes = $.idleTimeoutInMinutes;
        this.managedOutboundIPs = $.managedOutboundIPs;
        this.outboundIPPrefixes = $.outboundIPPrefixes;
        this.outboundIPs = $.outboundIPs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedClusterLoadBalancerProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterLoadBalancerProfileArgs $;

        public Builder() {
            $ = new ManagedClusterLoadBalancerProfileArgs();
        }

        public Builder(ManagedClusterLoadBalancerProfileArgs defaults) {
            $ = new ManagedClusterLoadBalancerProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocatedOutboundPorts Desired number of allocated SNAT ports per VM. Allowed values must be in the range of 0 to 64000 (inclusive). The default value is 0 which results in Azure dynamically allocating ports.
         * 
         * @return builder
         * 
         */
        public Builder allocatedOutboundPorts(@Nullable Output<Integer> allocatedOutboundPorts) {
            $.allocatedOutboundPorts = allocatedOutboundPorts;
            return this;
        }

        /**
         * @param allocatedOutboundPorts Desired number of allocated SNAT ports per VM. Allowed values must be in the range of 0 to 64000 (inclusive). The default value is 0 which results in Azure dynamically allocating ports.
         * 
         * @return builder
         * 
         */
        public Builder allocatedOutboundPorts(Integer allocatedOutboundPorts) {
            return allocatedOutboundPorts(Output.of(allocatedOutboundPorts));
        }

        /**
         * @param effectiveOutboundIPs The effective outbound IP resources of the cluster load balancer.
         * 
         * @return builder
         * 
         */
        public Builder effectiveOutboundIPs(@Nullable Output<List<ResourceReferenceArgs>> effectiveOutboundIPs) {
            $.effectiveOutboundIPs = effectiveOutboundIPs;
            return this;
        }

        /**
         * @param effectiveOutboundIPs The effective outbound IP resources of the cluster load balancer.
         * 
         * @return builder
         * 
         */
        public Builder effectiveOutboundIPs(List<ResourceReferenceArgs> effectiveOutboundIPs) {
            return effectiveOutboundIPs(Output.of(effectiveOutboundIPs));
        }

        /**
         * @param effectiveOutboundIPs The effective outbound IP resources of the cluster load balancer.
         * 
         * @return builder
         * 
         */
        public Builder effectiveOutboundIPs(ResourceReferenceArgs... effectiveOutboundIPs) {
            return effectiveOutboundIPs(List.of(effectiveOutboundIPs));
        }

        /**
         * @param idleTimeoutInMinutes Desired outbound flow idle timeout in minutes. Allowed values must be in the range of 4 to 120 (inclusive). The default value is 30 minutes.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            $.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        /**
         * @param idleTimeoutInMinutes Desired outbound flow idle timeout in minutes. Allowed values must be in the range of 4 to 120 (inclusive). The default value is 30 minutes.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
            return idleTimeoutInMinutes(Output.of(idleTimeoutInMinutes));
        }

        /**
         * @param managedOutboundIPs Desired managed outbound IPs for the cluster load balancer.
         * 
         * @return builder
         * 
         */
        public Builder managedOutboundIPs(@Nullable Output<ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs> managedOutboundIPs) {
            $.managedOutboundIPs = managedOutboundIPs;
            return this;
        }

        /**
         * @param managedOutboundIPs Desired managed outbound IPs for the cluster load balancer.
         * 
         * @return builder
         * 
         */
        public Builder managedOutboundIPs(ManagedClusterLoadBalancerProfileManagedOutboundIPsArgs managedOutboundIPs) {
            return managedOutboundIPs(Output.of(managedOutboundIPs));
        }

        /**
         * @param outboundIPPrefixes Desired outbound IP Prefix resources for the cluster load balancer.
         * 
         * @return builder
         * 
         */
        public Builder outboundIPPrefixes(@Nullable Output<ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs> outboundIPPrefixes) {
            $.outboundIPPrefixes = outboundIPPrefixes;
            return this;
        }

        /**
         * @param outboundIPPrefixes Desired outbound IP Prefix resources for the cluster load balancer.
         * 
         * @return builder
         * 
         */
        public Builder outboundIPPrefixes(ManagedClusterLoadBalancerProfileOutboundIPPrefixesArgs outboundIPPrefixes) {
            return outboundIPPrefixes(Output.of(outboundIPPrefixes));
        }

        /**
         * @param outboundIPs Desired outbound IP resources for the cluster load balancer.
         * 
         * @return builder
         * 
         */
        public Builder outboundIPs(@Nullable Output<ManagedClusterLoadBalancerProfileOutboundIPsArgs> outboundIPs) {
            $.outboundIPs = outboundIPs;
            return this;
        }

        /**
         * @param outboundIPs Desired outbound IP resources for the cluster load balancer.
         * 
         * @return builder
         * 
         */
        public Builder outboundIPs(ManagedClusterLoadBalancerProfileOutboundIPsArgs outboundIPs) {
            return outboundIPs(Output.of(outboundIPs));
        }

        public ManagedClusterLoadBalancerProfileArgs build() {
            $.allocatedOutboundPorts = Codegen.integerProp("allocatedOutboundPorts").output().arg($.allocatedOutboundPorts).def(0).getNullable();
            $.idleTimeoutInMinutes = Codegen.integerProp("idleTimeoutInMinutes").output().arg($.idleTimeoutInMinutes).def(30).getNullable();
            return $;
        }
    }

}
