// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Metric and corresponding confidence intervals.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse Empty = new GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse();

    /**
     * The probability that the treatment is better than all other treatments in the experiment
     * 
     */
    @Import(name="confidenceInterval", required=true)
    private GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalResponse confidenceInterval;

    public GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalResponse confidenceInterval() {
        return this.confidenceInterval;
    }

    /**
     * Count value of a metric.
     * 
     */
    @Import(name="count", required=true)
    private Double count;

    public Double count() {
        return this.count;
    }

    /**
     * Count-based metric type. Only one of type or count_type is specified in each Metric.
     * 
     */
    @Import(name="countType", required=true)
    private String countType;

    public String countType() {
        return this.countType;
    }

    /**
     * Ratio value of a metric.
     * 
     */
    @Import(name="ratio", required=true)
    private Double ratio;

    public Double ratio() {
        return this.ratio;
    }

    /**
     * Ratio-based metric type. Only one of type or count_type is specified in each Metric.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse() {}

    private GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse(GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse $) {
        this.confidenceInterval = $.confidenceInterval;
        this.count = $.count;
        this.countType = $.countType;
        this.ratio = $.ratio;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse(Objects.requireNonNull(defaults));
        }

        public Builder confidenceInterval(GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalResponse confidenceInterval) {
            $.confidenceInterval = confidenceInterval;
            return this;
        }

        public Builder count(Double count) {
            $.count = count;
            return this;
        }

        public Builder countType(String countType) {
            $.countType = countType;
            return this;
        }

        public Builder ratio(Double ratio) {
            $.ratio = ratio;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1ExperimentResultMetricResponse build() {
            $.confidenceInterval = Objects.requireNonNull($.confidenceInterval, "expected parameter 'confidenceInterval' to be non-null");
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.countType = Objects.requireNonNull($.countType, "expected parameter 'countType' to be non-null");
            $.ratio = Objects.requireNonNull($.ratio, "expected parameter 'ratio' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
