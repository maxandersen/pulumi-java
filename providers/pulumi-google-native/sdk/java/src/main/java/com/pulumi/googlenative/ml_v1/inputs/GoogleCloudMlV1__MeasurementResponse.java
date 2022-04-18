// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_Measurement_MetricResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A message representing a measurement.
 * 
 */
public final class GoogleCloudMlV1__MeasurementResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__MeasurementResponse Empty = new GoogleCloudMlV1__MeasurementResponse();

    /**
     * Time that the trial has been running at the point of this measurement.
     * 
     */
    @Import(name="elapsedTime", required=true)
      private final String elapsedTime;

    public String elapsedTime() {
        return this.elapsedTime;
    }

    /**
     * Provides a list of metrics that act as inputs into the objective function.
     * 
     */
    @Import(name="metrics", required=true)
      private final List<GoogleCloudMlV1_Measurement_MetricResponse> metrics;

    public List<GoogleCloudMlV1_Measurement_MetricResponse> metrics() {
        return this.metrics;
    }

    /**
     * The number of steps a machine learning model has been trained for. Must be non-negative.
     * 
     */
    @Import(name="stepCount", required=true)
      private final String stepCount;

    public String stepCount() {
        return this.stepCount;
    }

    public GoogleCloudMlV1__MeasurementResponse(
        String elapsedTime,
        List<GoogleCloudMlV1_Measurement_MetricResponse> metrics,
        String stepCount) {
        this.elapsedTime = Objects.requireNonNull(elapsedTime, "expected parameter 'elapsedTime' to be non-null");
        this.metrics = Objects.requireNonNull(metrics, "expected parameter 'metrics' to be non-null");
        this.stepCount = Objects.requireNonNull(stepCount, "expected parameter 'stepCount' to be non-null");
    }

    private GoogleCloudMlV1__MeasurementResponse() {
        this.elapsedTime = null;
        this.metrics = List.of();
        this.stepCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__MeasurementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String elapsedTime;
        private List<GoogleCloudMlV1_Measurement_MetricResponse> metrics;
        private String stepCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__MeasurementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elapsedTime = defaults.elapsedTime;
    	      this.metrics = defaults.metrics;
    	      this.stepCount = defaults.stepCount;
        }

        public Builder elapsedTime(String elapsedTime) {
            this.elapsedTime = Objects.requireNonNull(elapsedTime);
            return this;
        }
        public Builder metrics(List<GoogleCloudMlV1_Measurement_MetricResponse> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }
        public Builder metrics(GoogleCloudMlV1_Measurement_MetricResponse... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder stepCount(String stepCount) {
            this.stepCount = Objects.requireNonNull(stepCount);
            return this;
        }        public GoogleCloudMlV1__MeasurementResponse build() {
            return new GoogleCloudMlV1__MeasurementResponse(elapsedTime, metrics, stepCount);
        }
    }
}
