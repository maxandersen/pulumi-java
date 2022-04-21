// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InstanceNetworkPerformanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkPerformanceConfigArgs Empty = new InstanceNetworkPerformanceConfigArgs();

    /**
     * The egress bandwidth tier to enable.
     * Possible values: TIER_1, DEFAULT
     * 
     */
    @Import(name="totalEgressBandwidthTier", required=true)
    private Output<String> totalEgressBandwidthTier;

    public Output<String> totalEgressBandwidthTier() {
        return this.totalEgressBandwidthTier;
    }

    private InstanceNetworkPerformanceConfigArgs() {}

    private InstanceNetworkPerformanceConfigArgs(InstanceNetworkPerformanceConfigArgs $) {
        this.totalEgressBandwidthTier = $.totalEgressBandwidthTier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceNetworkPerformanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceNetworkPerformanceConfigArgs $;

        public Builder() {
            $ = new InstanceNetworkPerformanceConfigArgs();
        }

        public Builder(InstanceNetworkPerformanceConfigArgs defaults) {
            $ = new InstanceNetworkPerformanceConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder totalEgressBandwidthTier(Output<String> totalEgressBandwidthTier) {
            $.totalEgressBandwidthTier = totalEgressBandwidthTier;
            return this;
        }

        public Builder totalEgressBandwidthTier(String totalEgressBandwidthTier) {
            return totalEgressBandwidthTier(Output.of(totalEgressBandwidthTier));
        }

        public InstanceNetworkPerformanceConfigArgs build() {
            $.totalEgressBandwidthTier = Objects.requireNonNull($.totalEgressBandwidthTier, "expected parameter 'totalEgressBandwidthTier' to be non-null");
            return $;
        }
    }

}
