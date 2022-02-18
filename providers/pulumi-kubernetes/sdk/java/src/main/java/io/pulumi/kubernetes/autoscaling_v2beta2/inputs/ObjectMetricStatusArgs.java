// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.CrossVersionObjectReferenceArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricIdentifierArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricValueStatusArgs;
import java.util.Objects;


/**
 * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 * 
 */
public final class ObjectMetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectMetricStatusArgs Empty = new ObjectMetricStatusArgs();

    /**
     * current contains the current value for the given metric
     * 
     */
    @InputImport(name="current", required=true)
    private final Input<MetricValueStatusArgs> current;

    public Input<MetricValueStatusArgs> getCurrent() {
        return this.current;
    }

    @InputImport(name="describedObject", required=true)
    private final Input<CrossVersionObjectReferenceArgs> describedObject;

    public Input<CrossVersionObjectReferenceArgs> getDescribedObject() {
        return this.describedObject;
    }

    /**
     * metric identifies the target metric by name and selector
     * 
     */
    @InputImport(name="metric", required=true)
    private final Input<MetricIdentifierArgs> metric;

    public Input<MetricIdentifierArgs> getMetric() {
        return this.metric;
    }

    public ObjectMetricStatusArgs(
        Input<MetricValueStatusArgs> current,
        Input<CrossVersionObjectReferenceArgs> describedObject,
        Input<MetricIdentifierArgs> metric) {
        this.current = Objects.requireNonNull(current, "expected parameter 'current' to be non-null");
        this.describedObject = Objects.requireNonNull(describedObject, "expected parameter 'describedObject' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
    }

    private ObjectMetricStatusArgs() {
        this.current = Input.empty();
        this.describedObject = Input.empty();
        this.metric = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<MetricValueStatusArgs> current;
        private Input<CrossVersionObjectReferenceArgs> describedObject;
        private Input<MetricIdentifierArgs> metric;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectMetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.current = defaults.current;
    	      this.describedObject = defaults.describedObject;
    	      this.metric = defaults.metric;
        }

        public Builder setCurrent(Input<MetricValueStatusArgs> current) {
            this.current = Objects.requireNonNull(current);
            return this;
        }

        public Builder setCurrent(MetricValueStatusArgs current) {
            this.current = Input.of(Objects.requireNonNull(current));
            return this;
        }

        public Builder setDescribedObject(Input<CrossVersionObjectReferenceArgs> describedObject) {
            this.describedObject = Objects.requireNonNull(describedObject);
            return this;
        }

        public Builder setDescribedObject(CrossVersionObjectReferenceArgs describedObject) {
            this.describedObject = Input.of(Objects.requireNonNull(describedObject));
            return this;
        }

        public Builder setMetric(Input<MetricIdentifierArgs> metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setMetric(MetricIdentifierArgs metric) {
            this.metric = Input.of(Objects.requireNonNull(metric));
            return this;
        }

        public ObjectMetricStatusArgs build() {
            return new ObjectMetricStatusArgs(current, describedObject, metric);
        }
    }
}
