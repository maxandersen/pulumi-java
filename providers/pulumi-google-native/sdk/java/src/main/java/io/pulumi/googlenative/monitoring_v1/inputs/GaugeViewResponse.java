// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


/**
 * A gauge chart shows where the current value sits within a pre-defined range. The upper and lower bounds should define the possible range of values for the scorecard's query (inclusive).
 * 
 */
public final class GaugeViewResponse extends io.pulumi.resources.InvokeArgs {

    public static final GaugeViewResponse Empty = new GaugeViewResponse();

    /**
     * The lower bound for this gauge chart. The value of the chart should always be greater than or equal to this.
     * 
     */
    @Import(name="lowerBound", required=true)
      private final Double lowerBound;

    public Double lowerBound() {
        return this.lowerBound;
    }

    /**
     * The upper bound for this gauge chart. The value of the chart should always be less than or equal to this.
     * 
     */
    @Import(name="upperBound", required=true)
      private final Double upperBound;

    public Double upperBound() {
        return this.upperBound;
    }

    public GaugeViewResponse(
        Double lowerBound,
        Double upperBound) {
        this.lowerBound = Objects.requireNonNull(lowerBound, "expected parameter 'lowerBound' to be non-null");
        this.upperBound = Objects.requireNonNull(upperBound, "expected parameter 'upperBound' to be non-null");
    }

    private GaugeViewResponse() {
        this.lowerBound = null;
        this.upperBound = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GaugeViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double lowerBound;
        private Double upperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(GaugeViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lowerBound = defaults.lowerBound;
    	      this.upperBound = defaults.upperBound;
        }

        public Builder lowerBound(Double lowerBound) {
            this.lowerBound = Objects.requireNonNull(lowerBound);
            return this;
        }
        public Builder upperBound(Double upperBound) {
            this.upperBound = Objects.requireNonNull(upperBound);
            return this;
        }        public GaugeViewResponse build() {
            return new GaugeViewResponse(lowerBound, upperBound);
        }
    }
}
