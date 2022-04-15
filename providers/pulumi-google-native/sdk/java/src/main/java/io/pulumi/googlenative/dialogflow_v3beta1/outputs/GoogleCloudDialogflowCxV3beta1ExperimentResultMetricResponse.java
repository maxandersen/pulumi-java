// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse {
    /**
     * The probability that the treatment is better than all other treatments in the experiment
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalResponse confidenceInterval;
    /**
     * Count value of a metric.
     * 
     */
    private final Double count;
    /**
     * Count-based metric type. Only one of type or count_type is specified in each Metric.
     * 
     */
    private final String countType;
    /**
     * Ratio value of a metric.
     * 
     */
    private final Double ratio;
    /**
     * Ratio-based metric type. Only one of type or count_type is specified in each Metric.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse(
        @CustomType.Parameter("confidenceInterval") GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalResponse confidenceInterval,
        @CustomType.Parameter("count") Double count,
        @CustomType.Parameter("countType") String countType,
        @CustomType.Parameter("ratio") Double ratio,
        @CustomType.Parameter("type") String type) {
        this.confidenceInterval = confidenceInterval;
        this.count = count;
        this.countType = countType;
        this.ratio = ratio;
        this.type = type;
    }

    /**
     * The probability that the treatment is better than all other treatments in the experiment
     * 
    */
    public GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalResponse confidenceInterval() {
        return this.confidenceInterval;
    }
    /**
     * Count value of a metric.
     * 
    */
    public Double count() {
        return this.count;
    }
    /**
     * Count-based metric type. Only one of type or count_type is specified in each Metric.
     * 
    */
    public String countType() {
        return this.countType;
    }
    /**
     * Ratio value of a metric.
     * 
    */
    public Double ratio() {
        return this.ratio;
    }
    /**
     * Ratio-based metric type. Only one of type or count_type is specified in each Metric.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalResponse confidenceInterval;
        private Double count;
        private String countType;
        private Double ratio;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceInterval = defaults.confidenceInterval;
    	      this.count = defaults.count;
    	      this.countType = defaults.countType;
    	      this.ratio = defaults.ratio;
    	      this.type = defaults.type;
        }

        public Builder confidenceInterval(GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalResponse confidenceInterval) {
            this.confidenceInterval = Objects.requireNonNull(confidenceInterval);
            return this;
        }
        public Builder count(Double count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder countType(String countType) {
            this.countType = Objects.requireNonNull(countType);
            return this;
        }
        public Builder ratio(Double ratio) {
            this.ratio = Objects.requireNonNull(ratio);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse(confidenceInterval, count, countType, ratio, type);
        }
    }
}
