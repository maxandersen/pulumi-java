// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


/**
 * A floating point interval.
 * 
 */
public final class GoogleCloudRetailV2IntervalResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2IntervalResponse Empty = new GoogleCloudRetailV2IntervalResponse();

    /**
     * Exclusive upper bound.
     * 
     */
    @Import(name="exclusiveMaximum", required=true)
      private final Double exclusiveMaximum;

    public Double exclusiveMaximum() {
        return this.exclusiveMaximum;
    }

    /**
     * Exclusive lower bound.
     * 
     */
    @Import(name="exclusiveMinimum", required=true)
      private final Double exclusiveMinimum;

    public Double exclusiveMinimum() {
        return this.exclusiveMinimum;
    }

    /**
     * Inclusive upper bound.
     * 
     */
    @Import(name="maximum", required=true)
      private final Double maximum;

    public Double maximum() {
        return this.maximum;
    }

    /**
     * Inclusive lower bound.
     * 
     */
    @Import(name="minimum", required=true)
      private final Double minimum;

    public Double minimum() {
        return this.minimum;
    }

    public GoogleCloudRetailV2IntervalResponse(
        Double exclusiveMaximum,
        Double exclusiveMinimum,
        Double maximum,
        Double minimum) {
        this.exclusiveMaximum = Objects.requireNonNull(exclusiveMaximum, "expected parameter 'exclusiveMaximum' to be non-null");
        this.exclusiveMinimum = Objects.requireNonNull(exclusiveMinimum, "expected parameter 'exclusiveMinimum' to be non-null");
        this.maximum = Objects.requireNonNull(maximum, "expected parameter 'maximum' to be non-null");
        this.minimum = Objects.requireNonNull(minimum, "expected parameter 'minimum' to be non-null");
    }

    private GoogleCloudRetailV2IntervalResponse() {
        this.exclusiveMaximum = null;
        this.exclusiveMinimum = null;
        this.maximum = null;
        this.minimum = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2IntervalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double exclusiveMaximum;
        private Double exclusiveMinimum;
        private Double maximum;
        private Double minimum;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2IntervalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusiveMaximum = defaults.exclusiveMaximum;
    	      this.exclusiveMinimum = defaults.exclusiveMinimum;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
        }

        public Builder exclusiveMaximum(Double exclusiveMaximum) {
            this.exclusiveMaximum = Objects.requireNonNull(exclusiveMaximum);
            return this;
        }
        public Builder exclusiveMinimum(Double exclusiveMinimum) {
            this.exclusiveMinimum = Objects.requireNonNull(exclusiveMinimum);
            return this;
        }
        public Builder maximum(Double maximum) {
            this.maximum = Objects.requireNonNull(maximum);
            return this;
        }
        public Builder minimum(Double minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }        public GoogleCloudRetailV2IntervalResponse build() {
            return new GoogleCloudRetailV2IntervalResponse(exclusiveMaximum, exclusiveMinimum, maximum, minimum);
        }
    }
}
