// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NetworkPerformanceConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkPerformanceConfigResponse Empty = new NetworkPerformanceConfigResponse();

    @Import(name="externalIpEgressBandwidthTier", required=true)
    private String externalIpEgressBandwidthTier;

    public String externalIpEgressBandwidthTier() {
        return this.externalIpEgressBandwidthTier;
    }

    @Import(name="totalEgressBandwidthTier", required=true)
    private String totalEgressBandwidthTier;

    public String totalEgressBandwidthTier() {
        return this.totalEgressBandwidthTier;
    }

    private NetworkPerformanceConfigResponse() {}

    private NetworkPerformanceConfigResponse(NetworkPerformanceConfigResponse $) {
        this.externalIpEgressBandwidthTier = $.externalIpEgressBandwidthTier;
        this.totalEgressBandwidthTier = $.totalEgressBandwidthTier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPerformanceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPerformanceConfigResponse $;

        public Builder() {
            $ = new NetworkPerformanceConfigResponse();
        }

        public Builder(NetworkPerformanceConfigResponse defaults) {
            $ = new NetworkPerformanceConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder externalIpEgressBandwidthTier(String externalIpEgressBandwidthTier) {
            $.externalIpEgressBandwidthTier = externalIpEgressBandwidthTier;
            return this;
        }

        public Builder totalEgressBandwidthTier(String totalEgressBandwidthTier) {
            $.totalEgressBandwidthTier = totalEgressBandwidthTier;
            return this;
        }

        public NetworkPerformanceConfigResponse build() {
            $.externalIpEgressBandwidthTier = Objects.requireNonNull($.externalIpEgressBandwidthTier, "expected parameter 'externalIpEgressBandwidthTier' to be non-null");
            $.totalEgressBandwidthTier = Objects.requireNonNull($.totalEgressBandwidthTier, "expected parameter 'totalEgressBandwidthTier' to be non-null");
            return $;
        }
    }

}
