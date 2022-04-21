// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v3.inputs.DistributionCutArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.TimeSeriesRatioArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Service Level Indicators for which atomic units of service are counted directly.
 * 
 */
public final class RequestBasedSliArgs extends com.pulumi.resources.ResourceArgs {

    public static final RequestBasedSliArgs Empty = new RequestBasedSliArgs();

    /**
     * distribution_cut is used when good_service is a count of values aggregated in a Distribution that fall into a good range. The total_service is the total count of all values aggregated in the Distribution.
     * 
     */
    @Import(name="distributionCut")
    private @Nullable Output<DistributionCutArgs> distributionCut;

    public Optional<Output<DistributionCutArgs>> distributionCut() {
        return Optional.ofNullable(this.distributionCut);
    }

    /**
     * good_total_ratio is used when the ratio of good_service to total_service is computed from two TimeSeries.
     * 
     */
    @Import(name="goodTotalRatio")
    private @Nullable Output<TimeSeriesRatioArgs> goodTotalRatio;

    public Optional<Output<TimeSeriesRatioArgs>> goodTotalRatio() {
        return Optional.ofNullable(this.goodTotalRatio);
    }

    private RequestBasedSliArgs() {}

    private RequestBasedSliArgs(RequestBasedSliArgs $) {
        this.distributionCut = $.distributionCut;
        this.goodTotalRatio = $.goodTotalRatio;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RequestBasedSliArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RequestBasedSliArgs $;

        public Builder() {
            $ = new RequestBasedSliArgs();
        }

        public Builder(RequestBasedSliArgs defaults) {
            $ = new RequestBasedSliArgs(Objects.requireNonNull(defaults));
        }

        public Builder distributionCut(@Nullable Output<DistributionCutArgs> distributionCut) {
            $.distributionCut = distributionCut;
            return this;
        }

        public Builder distributionCut(DistributionCutArgs distributionCut) {
            return distributionCut(Output.of(distributionCut));
        }

        public Builder goodTotalRatio(@Nullable Output<TimeSeriesRatioArgs> goodTotalRatio) {
            $.goodTotalRatio = goodTotalRatio;
            return this;
        }

        public Builder goodTotalRatio(TimeSeriesRatioArgs goodTotalRatio) {
            return goodTotalRatio(Output.of(goodTotalRatio));
        }

        public RequestBasedSliArgs build() {
            return $;
        }
    }

}
