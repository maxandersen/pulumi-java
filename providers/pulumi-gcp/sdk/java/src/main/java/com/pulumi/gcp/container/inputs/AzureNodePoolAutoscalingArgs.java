// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;


public final class AzureNodePoolAutoscalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureNodePoolAutoscalingArgs Empty = new AzureNodePoolAutoscalingArgs();

    /**
     * Required. Maximum number of nodes in the node pool. Must be &gt;= min_node_count.
     * 
     */
    @Import(name="maxNodeCount", required=true)
      private final Output<Integer> maxNodeCount;

    public Output<Integer> maxNodeCount() {
        return this.maxNodeCount;
    }

    /**
     * Required. Minimum number of nodes in the node pool. Must be &gt;= 1 and &lt;= max_node_count.
     * 
     */
    @Import(name="minNodeCount", required=true)
      private final Output<Integer> minNodeCount;

    public Output<Integer> minNodeCount() {
        return this.minNodeCount;
    }

    public AzureNodePoolAutoscalingArgs(
        Output<Integer> maxNodeCount,
        Output<Integer> minNodeCount) {
        this.maxNodeCount = Objects.requireNonNull(maxNodeCount, "expected parameter 'maxNodeCount' to be non-null");
        this.minNodeCount = Objects.requireNonNull(minNodeCount, "expected parameter 'minNodeCount' to be non-null");
    }

    private AzureNodePoolAutoscalingArgs() {
        this.maxNodeCount = Codegen.empty();
        this.minNodeCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolAutoscalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxNodeCount;
        private Output<Integer> minNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureNodePoolAutoscalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        public Builder maxNodeCount(Output<Integer> maxNodeCount) {
            this.maxNodeCount = Objects.requireNonNull(maxNodeCount);
            return this;
        }
        public Builder maxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = Output.of(Objects.requireNonNull(maxNodeCount));
            return this;
        }
        public Builder minNodeCount(Output<Integer> minNodeCount) {
            this.minNodeCount = Objects.requireNonNull(minNodeCount);
            return this;
        }
        public Builder minNodeCount(Integer minNodeCount) {
            this.minNodeCount = Output.of(Objects.requireNonNull(minNodeCount));
            return this;
        }        public AzureNodePoolAutoscalingArgs build() {
            return new AzureNodePoolAutoscalingArgs(maxNodeCount, minNodeCount);
        }
    }
}
