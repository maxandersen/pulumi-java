// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * NodePoolAutoscaling contains information required by cluster autoscaler to adjust the size of the node pool to the current cluster usage.
 * 
 */
public final class NodePoolAutoscalingResponse extends io.pulumi.resources.InvokeArgs {

    public static final NodePoolAutoscalingResponse Empty = new NodePoolAutoscalingResponse();

    /**
     * Can this node pool be deleted automatically.
     * 
     */
    @Import(name="autoprovisioned", required=true)
      private final Boolean autoprovisioned;

    public Boolean autoprovisioned() {
        return this.autoprovisioned;
    }

    /**
     * Is autoscaling enabled for this node pool.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Maximum number of nodes for one location in the NodePool. Must be >= min_node_count. There has to be enough quota to scale up the cluster.
     * 
     */
    @Import(name="maxNodeCount", required=true)
      private final Integer maxNodeCount;

    public Integer maxNodeCount() {
        return this.maxNodeCount;
    }

    /**
     * Minimum number of nodes for one location in the NodePool. Must be >= 1 and <= max_node_count.
     * 
     */
    @Import(name="minNodeCount", required=true)
      private final Integer minNodeCount;

    public Integer minNodeCount() {
        return this.minNodeCount;
    }

    public NodePoolAutoscalingResponse(
        Boolean autoprovisioned,
        Boolean enabled,
        Integer maxNodeCount,
        Integer minNodeCount) {
        this.autoprovisioned = Objects.requireNonNull(autoprovisioned, "expected parameter 'autoprovisioned' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.maxNodeCount = Objects.requireNonNull(maxNodeCount, "expected parameter 'maxNodeCount' to be non-null");
        this.minNodeCount = Objects.requireNonNull(minNodeCount, "expected parameter 'minNodeCount' to be non-null");
    }

    private NodePoolAutoscalingResponse() {
        this.autoprovisioned = null;
        this.enabled = null;
        this.maxNodeCount = null;
        this.minNodeCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolAutoscalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoprovisioned;
        private Boolean enabled;
        private Integer maxNodeCount;
        private Integer minNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolAutoscalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoprovisioned = defaults.autoprovisioned;
    	      this.enabled = defaults.enabled;
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        public Builder autoprovisioned(Boolean autoprovisioned) {
            this.autoprovisioned = Objects.requireNonNull(autoprovisioned);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder maxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = Objects.requireNonNull(maxNodeCount);
            return this;
        }
        public Builder minNodeCount(Integer minNodeCount) {
            this.minNodeCount = Objects.requireNonNull(minNodeCount);
            return this;
        }        public NodePoolAutoscalingResponse build() {
            return new NodePoolAutoscalingResponse(autoprovisioned, enabled, maxNodeCount, minNodeCount);
        }
    }
}
