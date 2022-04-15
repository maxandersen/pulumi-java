// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.monitoring_v3.inputs.GoogleMonitoringV3RangeResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A DistributionCut defines a TimeSeries and thresholds used for measuring good service and total service. The TimeSeries must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind = CUMULATIVE. The computed good_service will be the estimated count of values in the Distribution that fall within the specified min and max.
 * 
 */
public final class DistributionCutResponse extends io.pulumi.resources.InvokeArgs {

    public static final DistributionCutResponse Empty = new DistributionCutResponse();

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="distributionFilter", required=true)
      private final String distributionFilter;

    public String distributionFilter() {
        return this.distributionFilter;
    }

    /**
     * Range of values considered "good." For a one-sided range, set one bound to an infinite value.
     * 
     */
    @Import(name="range", required=true)
      private final GoogleMonitoringV3RangeResponse range;

    public GoogleMonitoringV3RangeResponse range() {
        return this.range;
    }

    public DistributionCutResponse(
        String distributionFilter,
        GoogleMonitoringV3RangeResponse range) {
        this.distributionFilter = Objects.requireNonNull(distributionFilter, "expected parameter 'distributionFilter' to be non-null");
        this.range = Objects.requireNonNull(range, "expected parameter 'range' to be non-null");
    }

    private DistributionCutResponse() {
        this.distributionFilter = null;
        this.range = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionCutResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String distributionFilter;
        private GoogleMonitoringV3RangeResponse range;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionCutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionFilter = defaults.distributionFilter;
    	      this.range = defaults.range;
        }

        public Builder distributionFilter(String distributionFilter) {
            this.distributionFilter = Objects.requireNonNull(distributionFilter);
            return this;
        }
        public Builder range(GoogleMonitoringV3RangeResponse range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }        public DistributionCutResponse build() {
            return new DistributionCutResponse(distributionFilter, range);
        }
    }
}
