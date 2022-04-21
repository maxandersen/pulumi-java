// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lookoutmetrics;

import com.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorConfigArgs;
import com.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorMetricSetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnomalyDetectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorArgs Empty = new AnomalyDetectorArgs();

    /**
     * Configuration options for the AnomalyDetector
     * 
     */
    @Import(name="anomalyDetectorConfig", required=true)
    private Output<AnomalyDetectorConfigArgs> anomalyDetectorConfig;

    public Output<AnomalyDetectorConfigArgs> anomalyDetectorConfig() {
        return this.anomalyDetectorConfig;
    }

    /**
     * A description for the AnomalyDetector.
     * 
     */
    @Import(name="anomalyDetectorDescription")
    private @Nullable Output<String> anomalyDetectorDescription;

    public Optional<Output<String>> anomalyDetectorDescription() {
        return Optional.ofNullable(this.anomalyDetectorDescription);
    }

    /**
     * Name for the Amazon Lookout for Metrics Anomaly Detector
     * 
     */
    @Import(name="anomalyDetectorName")
    private @Nullable Output<String> anomalyDetectorName;

    public Optional<Output<String>> anomalyDetectorName() {
        return Optional.ofNullable(this.anomalyDetectorName);
    }

    /**
     * KMS key used to encrypt the AnomalyDetector data
     * 
     */
    @Import(name="kmsKeyArn")
    private @Nullable Output<String> kmsKeyArn;

    public Optional<Output<String>> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    /**
     * List of metric sets for anomaly detection
     * 
     */
    @Import(name="metricSetList", required=true)
    private Output<List<AnomalyDetectorMetricSetArgs>> metricSetList;

    public Output<List<AnomalyDetectorMetricSetArgs>> metricSetList() {
        return this.metricSetList;
    }

    private AnomalyDetectorArgs() {}

    private AnomalyDetectorArgs(AnomalyDetectorArgs $) {
        this.anomalyDetectorConfig = $.anomalyDetectorConfig;
        this.anomalyDetectorDescription = $.anomalyDetectorDescription;
        this.anomalyDetectorName = $.anomalyDetectorName;
        this.kmsKeyArn = $.kmsKeyArn;
        this.metricSetList = $.metricSetList;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnomalyDetectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnomalyDetectorArgs $;

        public Builder() {
            $ = new AnomalyDetectorArgs();
        }

        public Builder(AnomalyDetectorArgs defaults) {
            $ = new AnomalyDetectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder anomalyDetectorConfig(Output<AnomalyDetectorConfigArgs> anomalyDetectorConfig) {
            $.anomalyDetectorConfig = anomalyDetectorConfig;
            return this;
        }

        public Builder anomalyDetectorConfig(AnomalyDetectorConfigArgs anomalyDetectorConfig) {
            return anomalyDetectorConfig(Output.of(anomalyDetectorConfig));
        }

        public Builder anomalyDetectorDescription(@Nullable Output<String> anomalyDetectorDescription) {
            $.anomalyDetectorDescription = anomalyDetectorDescription;
            return this;
        }

        public Builder anomalyDetectorDescription(String anomalyDetectorDescription) {
            return anomalyDetectorDescription(Output.of(anomalyDetectorDescription));
        }

        public Builder anomalyDetectorName(@Nullable Output<String> anomalyDetectorName) {
            $.anomalyDetectorName = anomalyDetectorName;
            return this;
        }

        public Builder anomalyDetectorName(String anomalyDetectorName) {
            return anomalyDetectorName(Output.of(anomalyDetectorName));
        }

        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder kmsKeyArn(String kmsKeyArn) {
            return kmsKeyArn(Output.of(kmsKeyArn));
        }

        public Builder metricSetList(Output<List<AnomalyDetectorMetricSetArgs>> metricSetList) {
            $.metricSetList = metricSetList;
            return this;
        }

        public Builder metricSetList(List<AnomalyDetectorMetricSetArgs> metricSetList) {
            return metricSetList(Output.of(metricSetList));
        }

        public Builder metricSetList(AnomalyDetectorMetricSetArgs... metricSetList) {
            return metricSetList(List.of(metricSetList));
        }

        public AnomalyDetectorArgs build() {
            $.anomalyDetectorConfig = Objects.requireNonNull($.anomalyDetectorConfig, "expected parameter 'anomalyDetectorConfig' to be non-null");
            $.metricSetList = Objects.requireNonNull($.metricSetList, "expected parameter 'metricSetList' to be non-null");
            return $;
        }
    }

}
