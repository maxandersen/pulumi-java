// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.ContainerResourceMetricStatusArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.ExternalMetricStatusArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.ObjectMetricStatusArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.PodsMetricStatusArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.ResourceMetricStatusArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MetricStatus describes the last-read state of a single metric.
 * 
 */
public final class MetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricStatusArgs Empty = new MetricStatusArgs();

    /**
     * container resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    @InputImport(name="containerResource")
    private final @Nullable Input<ContainerResourceMetricStatusArgs> containerResource;

    public Input<ContainerResourceMetricStatusArgs> getContainerResource() {
        return this.containerResource == null ? Input.empty() : this.containerResource;
    }

    /**
     * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    @InputImport(name="external")
    private final @Nullable Input<ExternalMetricStatusArgs> external;

    public Input<ExternalMetricStatusArgs> getExternal() {
        return this.external == null ? Input.empty() : this.external;
    }

    /**
     * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    @InputImport(name="object")
    private final @Nullable Input<ObjectMetricStatusArgs> object;

    public Input<ObjectMetricStatusArgs> getObject() {
        return this.object == null ? Input.empty() : this.object;
    }

    /**
     * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
     * 
     */
    @InputImport(name="pods")
    private final @Nullable Input<PodsMetricStatusArgs> pods;

    public Input<PodsMetricStatusArgs> getPods() {
        return this.pods == null ? Input.empty() : this.pods;
    }

    /**
     * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    @InputImport(name="resource")
    private final @Nullable Input<ResourceMetricStatusArgs> resource;

    public Input<ResourceMetricStatusArgs> getResource() {
        return this.resource == null ? Input.empty() : this.resource;
    }

    /**
     * type is the type of metric source.  It will be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each corresponds to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public MetricStatusArgs(
        @Nullable Input<ContainerResourceMetricStatusArgs> containerResource,
        @Nullable Input<ExternalMetricStatusArgs> external,
        @Nullable Input<ObjectMetricStatusArgs> object,
        @Nullable Input<PodsMetricStatusArgs> pods,
        @Nullable Input<ResourceMetricStatusArgs> resource,
        Input<String> type) {
        this.containerResource = containerResource;
        this.external = external;
        this.object = object;
        this.pods = pods;
        this.resource = resource;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MetricStatusArgs() {
        this.containerResource = Input.empty();
        this.external = Input.empty();
        this.object = Input.empty();
        this.pods = Input.empty();
        this.resource = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ContainerResourceMetricStatusArgs> containerResource;
        private @Nullable Input<ExternalMetricStatusArgs> external;
        private @Nullable Input<ObjectMetricStatusArgs> object;
        private @Nullable Input<PodsMetricStatusArgs> pods;
        private @Nullable Input<ResourceMetricStatusArgs> resource;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerResource = defaults.containerResource;
    	      this.external = defaults.external;
    	      this.object = defaults.object;
    	      this.pods = defaults.pods;
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
        }

        public Builder setContainerResource(@Nullable Input<ContainerResourceMetricStatusArgs> containerResource) {
            this.containerResource = containerResource;
            return this;
        }

        public Builder setContainerResource(@Nullable ContainerResourceMetricStatusArgs containerResource) {
            this.containerResource = Input.ofNullable(containerResource);
            return this;
        }

        public Builder setExternal(@Nullable Input<ExternalMetricStatusArgs> external) {
            this.external = external;
            return this;
        }

        public Builder setExternal(@Nullable ExternalMetricStatusArgs external) {
            this.external = Input.ofNullable(external);
            return this;
        }

        public Builder setObject(@Nullable Input<ObjectMetricStatusArgs> object) {
            this.object = object;
            return this;
        }

        public Builder setObject(@Nullable ObjectMetricStatusArgs object) {
            this.object = Input.ofNullable(object);
            return this;
        }

        public Builder setPods(@Nullable Input<PodsMetricStatusArgs> pods) {
            this.pods = pods;
            return this;
        }

        public Builder setPods(@Nullable PodsMetricStatusArgs pods) {
            this.pods = Input.ofNullable(pods);
            return this;
        }

        public Builder setResource(@Nullable Input<ResourceMetricStatusArgs> resource) {
            this.resource = resource;
            return this;
        }

        public Builder setResource(@Nullable ResourceMetricStatusArgs resource) {
            this.resource = Input.ofNullable(resource);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public MetricStatusArgs build() {
            return new MetricStatusArgs(containerResource, external, object, pods, resource, type);
        }
    }
}
