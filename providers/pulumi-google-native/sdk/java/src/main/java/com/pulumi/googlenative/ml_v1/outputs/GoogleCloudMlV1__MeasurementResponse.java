// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1_Measurement_MetricResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1__MeasurementResponse {
    /**
     * Time that the trial has been running at the point of this measurement.
     * 
     */
    private final String elapsedTime;
    /**
     * Provides a list of metrics that act as inputs into the objective function.
     * 
     */
    private final List<GoogleCloudMlV1_Measurement_MetricResponse> metrics;
    /**
     * The number of steps a machine learning model has been trained for. Must be non-negative.
     * 
     */
    private final String stepCount;

    @CustomType.Constructor
    private GoogleCloudMlV1__MeasurementResponse(
        @CustomType.Parameter("elapsedTime") String elapsedTime,
        @CustomType.Parameter("metrics") List<GoogleCloudMlV1_Measurement_MetricResponse> metrics,
        @CustomType.Parameter("stepCount") String stepCount) {
        this.elapsedTime = elapsedTime;
        this.metrics = metrics;
        this.stepCount = stepCount;
    }

    /**
     * Time that the trial has been running at the point of this measurement.
     * 
    */
    public String elapsedTime() {
        return this.elapsedTime;
    }
    /**
     * Provides a list of metrics that act as inputs into the objective function.
     * 
    */
    public List<GoogleCloudMlV1_Measurement_MetricResponse> metrics() {
        return this.metrics;
    }
    /**
     * The number of steps a machine learning model has been trained for. Must be non-negative.
     * 
    */
    public String stepCount() {
        return this.stepCount;
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
