// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__MetricSpecResponse;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1__AutoScalingResponse {
    /**
     * The maximum number of nodes to scale this model under load. The actual value will depend on resource quota and availability.
     * 
     */
    private final Integer maxNodes;
    /**
     * MetricSpec contains the specifications to use to calculate the desired nodes count.
     * 
     */
    private final List<GoogleCloudMlV1__MetricSpecResponse> metrics;
    /**
     * Optional. The minimum number of nodes to allocate for this model. These nodes are always up, starting from the time the model is deployed. Therefore, the cost of operating this model will be at least `rate` * `min_nodes` * number of hours since last billing cycle, where `rate` is the cost per node-hour as documented in the [pricing guide](/ml-engine/docs/pricing), even if no predictions are performed. There is additional cost for each prediction performed. Unlike manual scaling, if the load gets too heavy for the nodes that are up, the service will automatically add nodes to handle the increased load as well as scale back as traffic drops, always maintaining at least `min_nodes`. You will be charged for the time in which additional nodes are used. If `min_nodes` is not specified and AutoScaling is used with a [legacy (MLS1) machine type](/ml-engine/docs/machine-types-online-prediction), `min_nodes` defaults to 0, in which case, when traffic to a model stops (and after a cool-down period), nodes will be shut down and no charges will be incurred until traffic to the model resumes. If `min_nodes` is not specified and AutoScaling is used with a [Compute Engine (N1) machine type](/ml-engine/docs/machine-types-online-prediction), `min_nodes` defaults to 1. `min_nodes` must be at least 1 for use with a Compute Engine machine type. You can set `min_nodes` when creating the model version, and you can also update `min_nodes` for an existing version: update_body.json: { 'autoScaling': { 'minNodes': 5 } } HTTP request: PATCH https://ml.googleapis.com/v1/{name=projects/*{@literal /}models/*{@literal /}versions/*}?update_mask=autoScaling.minNodes -d @./update_body.json
     * 
     */
    private final Integer minNodes;

    @CustomType.Constructor
    private GoogleCloudMlV1__AutoScalingResponse(
        @CustomType.Parameter("maxNodes") Integer maxNodes,
        @CustomType.Parameter("metrics") List<GoogleCloudMlV1__MetricSpecResponse> metrics,
        @CustomType.Parameter("minNodes") Integer minNodes) {
        this.maxNodes = maxNodes;
        this.metrics = metrics;
        this.minNodes = minNodes;
    }

    /**
     * The maximum number of nodes to scale this model under load. The actual value will depend on resource quota and availability.
     * 
    */
    public Integer maxNodes() {
        return this.maxNodes;
    }
    /**
     * MetricSpec contains the specifications to use to calculate the desired nodes count.
     * 
    */
    public List<GoogleCloudMlV1__MetricSpecResponse> metrics() {
        return this.metrics;
    }
    /**
     * Optional. The minimum number of nodes to allocate for this model. These nodes are always up, starting from the time the model is deployed. Therefore, the cost of operating this model will be at least `rate` * `min_nodes` * number of hours since last billing cycle, where `rate` is the cost per node-hour as documented in the [pricing guide](/ml-engine/docs/pricing), even if no predictions are performed. There is additional cost for each prediction performed. Unlike manual scaling, if the load gets too heavy for the nodes that are up, the service will automatically add nodes to handle the increased load as well as scale back as traffic drops, always maintaining at least `min_nodes`. You will be charged for the time in which additional nodes are used. If `min_nodes` is not specified and AutoScaling is used with a [legacy (MLS1) machine type](/ml-engine/docs/machine-types-online-prediction), `min_nodes` defaults to 0, in which case, when traffic to a model stops (and after a cool-down period), nodes will be shut down and no charges will be incurred until traffic to the model resumes. If `min_nodes` is not specified and AutoScaling is used with a [Compute Engine (N1) machine type](/ml-engine/docs/machine-types-online-prediction), `min_nodes` defaults to 1. `min_nodes` must be at least 1 for use with a Compute Engine machine type. You can set `min_nodes` when creating the model version, and you can also update `min_nodes` for an existing version: update_body.json: { 'autoScaling': { 'minNodes': 5 } } HTTP request: PATCH https://ml.googleapis.com/v1/{name=projects/*{@literal /}models/*{@literal /}versions/*}?update_mask=autoScaling.minNodes -d @./update_body.json
     * 
    */
    public Integer minNodes() {
        return this.minNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__AutoScalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxNodes;
        private List<GoogleCloudMlV1__MetricSpecResponse> metrics;
        private Integer minNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__AutoScalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodes = defaults.maxNodes;
    	      this.metrics = defaults.metrics;
    	      this.minNodes = defaults.minNodes;
        }

        public Builder maxNodes(Integer maxNodes) {
            this.maxNodes = Objects.requireNonNull(maxNodes);
            return this;
        }
        public Builder metrics(List<GoogleCloudMlV1__MetricSpecResponse> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }
        public Builder metrics(GoogleCloudMlV1__MetricSpecResponse... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder minNodes(Integer minNodes) {
            this.minNodes = Objects.requireNonNull(minNodes);
            return this;
        }        public GoogleCloudMlV1__AutoScalingResponse build() {
            return new GoogleCloudMlV1__AutoScalingResponse(maxNodes, metrics, minNodes);
        }
    }
}
