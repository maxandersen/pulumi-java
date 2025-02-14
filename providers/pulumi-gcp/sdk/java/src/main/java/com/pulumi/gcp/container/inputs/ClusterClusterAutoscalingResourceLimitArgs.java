// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClusterAutoscalingResourceLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterAutoscalingResourceLimitArgs Empty = new ClusterClusterAutoscalingResourceLimitArgs();

    /**
     * Maximum amount of the resource in the cluster.
     * 
     */
    @Import(name="maximum")
    private @Nullable Output<Integer> maximum;

    /**
     * @return Maximum amount of the resource in the cluster.
     * 
     */
    public Optional<Output<Integer>> maximum() {
        return Optional.ofNullable(this.maximum);
    }

    /**
     * Minimum amount of the resource in the cluster.
     * 
     */
    @Import(name="minimum")
    private @Nullable Output<Integer> minimum;

    /**
     * @return Minimum amount of the resource in the cluster.
     * 
     */
    public Optional<Output<Integer>> minimum() {
        return Optional.ofNullable(this.minimum);
    }

    /**
     * The type of the resource. For example, `cpu` and
     * `memory`.  See the [guide to using Node Auto-Provisioning](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning)
     * for a list of types.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    /**
     * @return The type of the resource. For example, `cpu` and
     * `memory`.  See the [guide to using Node Auto-Provisioning](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning)
     * for a list of types.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }

    private ClusterClusterAutoscalingResourceLimitArgs() {}

    private ClusterClusterAutoscalingResourceLimitArgs(ClusterClusterAutoscalingResourceLimitArgs $) {
        this.maximum = $.maximum;
        this.minimum = $.minimum;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterAutoscalingResourceLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterAutoscalingResourceLimitArgs $;

        public Builder() {
            $ = new ClusterClusterAutoscalingResourceLimitArgs();
        }

        public Builder(ClusterClusterAutoscalingResourceLimitArgs defaults) {
            $ = new ClusterClusterAutoscalingResourceLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maximum Maximum amount of the resource in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder maximum(@Nullable Output<Integer> maximum) {
            $.maximum = maximum;
            return this;
        }

        /**
         * @param maximum Maximum amount of the resource in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder maximum(Integer maximum) {
            return maximum(Output.of(maximum));
        }

        /**
         * @param minimum Minimum amount of the resource in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder minimum(@Nullable Output<Integer> minimum) {
            $.minimum = minimum;
            return this;
        }

        /**
         * @param minimum Minimum amount of the resource in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder minimum(Integer minimum) {
            return minimum(Output.of(minimum));
        }

        /**
         * @param resourceType The type of the resource. For example, `cpu` and
         * `memory`.  See the [guide to using Node Auto-Provisioning](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning)
         * for a list of types.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The type of the resource. For example, `cpu` and
         * `memory`.  See the [guide to using Node Auto-Provisioning](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning)
         * for a list of types.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public ClusterClusterAutoscalingResourceLimitArgs build() {
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
