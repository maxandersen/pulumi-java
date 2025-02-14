// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.azurenative.databoxedge.inputs.MetricCounterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * The metric counter set
 * 
 */
public final class MetricCounterSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricCounterSetArgs Empty = new MetricCounterSetArgs();

    /**
     * The counters that should be collected in this set.
     * 
     */
    @Import(name="counters", required=true)
    private Output<List<MetricCounterArgs>> counters;

    /**
     * @return The counters that should be collected in this set.
     * 
     */
    public Output<List<MetricCounterArgs>> counters() {
        return this.counters;
    }

    private MetricCounterSetArgs() {}

    private MetricCounterSetArgs(MetricCounterSetArgs $) {
        this.counters = $.counters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricCounterSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricCounterSetArgs $;

        public Builder() {
            $ = new MetricCounterSetArgs();
        }

        public Builder(MetricCounterSetArgs defaults) {
            $ = new MetricCounterSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param counters The counters that should be collected in this set.
         * 
         * @return builder
         * 
         */
        public Builder counters(Output<List<MetricCounterArgs>> counters) {
            $.counters = counters;
            return this;
        }

        /**
         * @param counters The counters that should be collected in this set.
         * 
         * @return builder
         * 
         */
        public Builder counters(List<MetricCounterArgs> counters) {
            return counters(Output.of(counters));
        }

        /**
         * @param counters The counters that should be collected in this set.
         * 
         * @return builder
         * 
         */
        public Builder counters(MetricCounterArgs... counters) {
            return counters(List.of(counters));
        }

        public MetricCounterSetArgs build() {
            $.counters = Objects.requireNonNull($.counters, "expected parameter 'counters' to be non-null");
            return $;
        }
    }

}
