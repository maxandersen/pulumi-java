// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ContainerResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
 * 
 */
public final class ContainerResourceMetricSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerResourceMetricSourceArgs Empty = new ContainerResourceMetricSourceArgs();

    /**
     * container is the name of the container in the pods of the scaling target
     * 
     */
    @InputImport(name="container", required=true)
    private final Input<String> container;

    public Input<String> getContainer() {
        return this.container;
    }

    /**
     * name is the name of the resource in question.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     * 
     */
    @InputImport(name="targetAverageUtilization")
    private final @Nullable Input<Integer> targetAverageUtilization;

    public Input<Integer> getTargetAverageUtilization() {
        return this.targetAverageUtilization == null ? Input.empty() : this.targetAverageUtilization;
    }

    /**
     * targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the "pods" metric source type.
     * 
     */
    @InputImport(name="targetAverageValue")
    private final @Nullable Input<String> targetAverageValue;

    public Input<String> getTargetAverageValue() {
        return this.targetAverageValue == null ? Input.empty() : this.targetAverageValue;
    }

    public ContainerResourceMetricSourceArgs(
        Input<String> container,
        Input<String> name,
        @Nullable Input<Integer> targetAverageUtilization,
        @Nullable Input<String> targetAverageValue) {
        this.container = Objects.requireNonNull(container, "expected parameter 'container' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.targetAverageUtilization = targetAverageUtilization;
        this.targetAverageValue = targetAverageValue;
    }

    private ContainerResourceMetricSourceArgs() {
        this.container = Input.empty();
        this.name = Input.empty();
        this.targetAverageUtilization = Input.empty();
        this.targetAverageValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> container;
        private Input<String> name;
        private @Nullable Input<Integer> targetAverageUtilization;
        private @Nullable Input<String> targetAverageValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourceMetricSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.name = defaults.name;
    	      this.targetAverageUtilization = defaults.targetAverageUtilization;
    	      this.targetAverageValue = defaults.targetAverageValue;
        }

        public Builder setContainer(Input<String> container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder setContainer(String container) {
            this.container = Input.of(Objects.requireNonNull(container));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setTargetAverageUtilization(@Nullable Input<Integer> targetAverageUtilization) {
            this.targetAverageUtilization = targetAverageUtilization;
            return this;
        }

        public Builder setTargetAverageUtilization(@Nullable Integer targetAverageUtilization) {
            this.targetAverageUtilization = Input.ofNullable(targetAverageUtilization);
            return this;
        }

        public Builder setTargetAverageValue(@Nullable Input<String> targetAverageValue) {
            this.targetAverageValue = targetAverageValue;
            return this;
        }

        public Builder setTargetAverageValue(@Nullable String targetAverageValue) {
            this.targetAverageValue = Input.ofNullable(targetAverageValue);
            return this;
        }

        public ContainerResourceMetricSourceArgs build() {
            return new ContainerResourceMetricSourceArgs(container, name, targetAverageUtilization, targetAverageValue);
        }
    }
}
