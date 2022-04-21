// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.azurenative.containerservice.inputs.ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs;
import com.pulumi.azurenative.containerservice.inputs.ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes;
import com.pulumi.azurenative.containerservice.inputs.ManagedClusterLoadBalancerProfileResponseOutboundIPs;
import com.pulumi.azurenative.containerservice.inputs.ResourceReferenceResponse;
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
public final class ManagedClusterLoadBalancerProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedClusterLoadBalancerProfileResponse Empty = new ManagedClusterLoadBalancerProfileResponse();

    /**
     * Desired number of allocated SNAT ports per VM. Allowed values must be in the range of 0 to 64000 (inclusive). The default value is 0 which results in Azure dynamically allocating ports.
     * 
     */
    @Import(name="allocatedOutboundPorts")
    private @Nullable Integer allocatedOutboundPorts;

    public Optional<Integer> allocatedOutboundPorts() {
        return Optional.ofNullable(this.allocatedOutboundPorts);
    }

    /**
     * The effective outbound IP resources of the cluster load balancer.
     * 
     */
    @Import(name="effectiveOutboundIPs")
    private @Nullable List<ResourceReferenceResponse> effectiveOutboundIPs;

    public Optional<List<ResourceReferenceResponse>> effectiveOutboundIPs() {
        return Optional.ofNullable(this.effectiveOutboundIPs);
    }

    /**
     * Desired outbound flow idle timeout in minutes. Allowed values must be in the range of 4 to 120 (inclusive). The default value is 30 minutes.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
    private @Nullable Integer idleTimeoutInMinutes;

    public Optional<Integer> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * Desired managed outbound IPs for the cluster load balancer.
     * 
     */
    @Import(name="managedOutboundIPs")
    private @Nullable ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs managedOutboundIPs;

    public Optional<ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs> managedOutboundIPs() {
        return Optional.ofNullable(this.managedOutboundIPs);
    }

    /**
     * Desired outbound IP Prefix resources for the cluster load balancer.
     * 
     */
    @Import(name="outboundIPPrefixes")
    private @Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes outboundIPPrefixes;

    public Optional<ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes> outboundIPPrefixes() {
        return Optional.ofNullable(this.outboundIPPrefixes);
    }

    /**
     * Desired outbound IP resources for the cluster load balancer.
     * 
     */
    @Import(name="outboundIPs")
    private @Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPs outboundIPs;

    public Optional<ManagedClusterLoadBalancerProfileResponseOutboundIPs> outboundIPs() {
        return Optional.ofNullable(this.outboundIPs);
    }

    private ManagedClusterLoadBalancerProfileResponse() {}

    private ManagedClusterLoadBalancerProfileResponse(ManagedClusterLoadBalancerProfileResponse $) {
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
    public static Builder builder(ManagedClusterLoadBalancerProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterLoadBalancerProfileResponse $;

        public Builder() {
            $ = new ManagedClusterLoadBalancerProfileResponse();
        }

        public Builder(ManagedClusterLoadBalancerProfileResponse defaults) {
            $ = new ManagedClusterLoadBalancerProfileResponse(Objects.requireNonNull(defaults));
        }

        public Builder allocatedOutboundPorts(@Nullable Integer allocatedOutboundPorts) {
            $.allocatedOutboundPorts = allocatedOutboundPorts;
            return this;
        }

        public Builder effectiveOutboundIPs(@Nullable List<ResourceReferenceResponse> effectiveOutboundIPs) {
            $.effectiveOutboundIPs = effectiveOutboundIPs;
            return this;
        }

        public Builder effectiveOutboundIPs(ResourceReferenceResponse... effectiveOutboundIPs) {
            return effectiveOutboundIPs(List.of(effectiveOutboundIPs));
        }

        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            $.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder managedOutboundIPs(@Nullable ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs managedOutboundIPs) {
            $.managedOutboundIPs = managedOutboundIPs;
            return this;
        }

        public Builder outboundIPPrefixes(@Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes outboundIPPrefixes) {
            $.outboundIPPrefixes = outboundIPPrefixes;
            return this;
        }

        public Builder outboundIPs(@Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPs outboundIPs) {
            $.outboundIPs = outboundIPs;
            return this;
        }

        public ManagedClusterLoadBalancerProfileResponse build() {
            $.allocatedOutboundPorts = Codegen.integerProp("allocatedOutboundPorts").arg($.allocatedOutboundPorts).def(0).getNullable();
            $.idleTimeoutInMinutes = Codegen.integerProp("idleTimeoutInMinutes").arg($.idleTimeoutInMinutes).def(30).getNullable();
            return $;
        }
    }

}
