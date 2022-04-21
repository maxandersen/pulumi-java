// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lookoutmetrics.inputs;

import com.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorMetricAggregationFunction;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnomalyDetectorMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorMetricArgs Empty = new AnomalyDetectorMetricArgs();

    /**
     * Operator used to aggregate metric values
     * 
     */
    @Import(name="aggregationFunction", required=true)
    private Output<AnomalyDetectorMetricAggregationFunction> aggregationFunction;

    public Output<AnomalyDetectorMetricAggregationFunction> aggregationFunction() {
        return this.aggregationFunction;
    }

    @Import(name="metricName", required=true)
    private Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName;
    }

    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private AnomalyDetectorMetricArgs() {}

    private AnomalyDetectorMetricArgs(AnomalyDetectorMetricArgs $) {
        this.aggregationFunction = $.aggregationFunction;
        this.metricName = $.metricName;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnomalyDetectorMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnomalyDetectorMetricArgs $;

        public Builder() {
            $ = new AnomalyDetectorMetricArgs();
        }

        public Builder(AnomalyDetectorMetricArgs defaults) {
            $ = new AnomalyDetectorMetricArgs(Objects.requireNonNull(defaults));
        }

        public Builder aggregationFunction(Output<AnomalyDetectorMetricAggregationFunction> aggregationFunction) {
            $.aggregationFunction = aggregationFunction;
            return this;
        }

        public Builder aggregationFunction(AnomalyDetectorMetricAggregationFunction aggregationFunction) {
            return aggregationFunction(Output.of(aggregationFunction));
        }

        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public AnomalyDetectorMetricArgs build() {
            $.aggregationFunction = Objects.requireNonNull($.aggregationFunction, "expected parameter 'aggregationFunction' to be non-null");
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            return $;
        }
    }

}
