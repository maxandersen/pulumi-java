// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lookoutmetrics.inputs;

import com.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorMetricSetMetricSetFrequency;
import com.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorMetric;
import com.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorMetricSource;
import com.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorTimestampColumn;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnomalyDetectorMetricSet extends com.pulumi.resources.InvokeArgs {

    public static final AnomalyDetectorMetricSet Empty = new AnomalyDetectorMetricSet();

    /**
     * Dimensions for this MetricSet.
     * 
     */
    @Import(name="dimensionList")
    private @Nullable List<String> dimensionList;

    public Optional<List<String>> dimensionList() {
        return Optional.ofNullable(this.dimensionList);
    }

    /**
     * Metrics captured by this MetricSet.
     * 
     */
    @Import(name="metricList", required=true)
    private List<AnomalyDetectorMetric> metricList;

    public List<AnomalyDetectorMetric> metricList() {
        return this.metricList;
    }

    /**
     * A description for the MetricSet.
     * 
     */
    @Import(name="metricSetDescription")
    private @Nullable String metricSetDescription;

    public Optional<String> metricSetDescription() {
        return Optional.ofNullable(this.metricSetDescription);
    }

    /**
     * A frequency period to aggregate the data
     * 
     */
    @Import(name="metricSetFrequency")
    private @Nullable AnomalyDetectorMetricSetMetricSetFrequency metricSetFrequency;

    public Optional<AnomalyDetectorMetricSetMetricSetFrequency> metricSetFrequency() {
        return Optional.ofNullable(this.metricSetFrequency);
    }

    /**
     * The name of the MetricSet.
     * 
     */
    @Import(name="metricSetName", required=true)
    private String metricSetName;

    public String metricSetName() {
        return this.metricSetName;
    }

    @Import(name="metricSource", required=true)
    private AnomalyDetectorMetricSource metricSource;

    public AnomalyDetectorMetricSource metricSource() {
        return this.metricSource;
    }

    /**
     * Offset, in seconds, between the frequency interval and the time at which the metrics are available.
     * 
     */
    @Import(name="offset")
    private @Nullable Integer offset;

    public Optional<Integer> offset() {
        return Optional.ofNullable(this.offset);
    }

    @Import(name="timestampColumn")
    private @Nullable AnomalyDetectorTimestampColumn timestampColumn;

    public Optional<AnomalyDetectorTimestampColumn> timestampColumn() {
        return Optional.ofNullable(this.timestampColumn);
    }

    @Import(name="timezone")
    private @Nullable String timezone;

    public Optional<String> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    private AnomalyDetectorMetricSet() {}

    private AnomalyDetectorMetricSet(AnomalyDetectorMetricSet $) {
        this.dimensionList = $.dimensionList;
        this.metricList = $.metricList;
        this.metricSetDescription = $.metricSetDescription;
        this.metricSetFrequency = $.metricSetFrequency;
        this.metricSetName = $.metricSetName;
        this.metricSource = $.metricSource;
        this.offset = $.offset;
        this.timestampColumn = $.timestampColumn;
        this.timezone = $.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnomalyDetectorMetricSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnomalyDetectorMetricSet $;

        public Builder() {
            $ = new AnomalyDetectorMetricSet();
        }

        public Builder(AnomalyDetectorMetricSet defaults) {
            $ = new AnomalyDetectorMetricSet(Objects.requireNonNull(defaults));
        }

        public Builder dimensionList(@Nullable List<String> dimensionList) {
            $.dimensionList = dimensionList;
            return this;
        }

        public Builder dimensionList(String... dimensionList) {
            return dimensionList(List.of(dimensionList));
        }

        public Builder metricList(List<AnomalyDetectorMetric> metricList) {
            $.metricList = metricList;
            return this;
        }

        public Builder metricList(AnomalyDetectorMetric... metricList) {
            return metricList(List.of(metricList));
        }

        public Builder metricSetDescription(@Nullable String metricSetDescription) {
            $.metricSetDescription = metricSetDescription;
            return this;
        }

        public Builder metricSetFrequency(@Nullable AnomalyDetectorMetricSetMetricSetFrequency metricSetFrequency) {
            $.metricSetFrequency = metricSetFrequency;
            return this;
        }

        public Builder metricSetName(String metricSetName) {
            $.metricSetName = metricSetName;
            return this;
        }

        public Builder metricSource(AnomalyDetectorMetricSource metricSource) {
            $.metricSource = metricSource;
            return this;
        }

        public Builder offset(@Nullable Integer offset) {
            $.offset = offset;
            return this;
        }

        public Builder timestampColumn(@Nullable AnomalyDetectorTimestampColumn timestampColumn) {
            $.timestampColumn = timestampColumn;
            return this;
        }

        public Builder timezone(@Nullable String timezone) {
            $.timezone = timezone;
            return this;
        }

        public AnomalyDetectorMetricSet build() {
            $.metricList = Objects.requireNonNull($.metricList, "expected parameter 'metricList' to be non-null");
            $.metricSetName = Objects.requireNonNull($.metricSetName, "expected parameter 'metricSetName' to be non-null");
            $.metricSource = Objects.requireNonNull($.metricSource, "expected parameter 'metricSource' to be non-null");
            return $;
        }
    }

}
