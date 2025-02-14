// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.outputs;

import com.pulumi.azurenative.databoxedge.outputs.MetricCounterResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MetricCounterSetResponse {
    /**
     * @return The counters that should be collected in this set.
     * 
     */
    private final List<MetricCounterResponse> counters;

    @CustomType.Constructor
    private MetricCounterSetResponse(@CustomType.Parameter("counters") List<MetricCounterResponse> counters) {
        this.counters = counters;
    }

    /**
     * @return The counters that should be collected in this set.
     * 
     */
    public List<MetricCounterResponse> counters() {
        return this.counters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricCounterSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MetricCounterResponse> counters;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricCounterSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.counters = defaults.counters;
        }

        public Builder counters(List<MetricCounterResponse> counters) {
            this.counters = Objects.requireNonNull(counters);
            return this;
        }
        public Builder counters(MetricCounterResponse... counters) {
            return counters(List.of(counters));
        }        public MetricCounterSetResponse build() {
            return new MetricCounterSetResponse(counters);
        }
    }
}
