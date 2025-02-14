// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigtableadmin_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Limits for the number of nodes a Cluster can autoscale up/down to.
 * 
 */
public final class AutoscalingLimitsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscalingLimitsArgs Empty = new AutoscalingLimitsArgs();

    /**
     * Maximum number of nodes to scale up to.
     * 
     */
    @Import(name="maxServeNodes", required=true)
    private Output<Integer> maxServeNodes;

    /**
     * @return Maximum number of nodes to scale up to.
     * 
     */
    public Output<Integer> maxServeNodes() {
        return this.maxServeNodes;
    }

    /**
     * Minimum number of nodes to scale down to.
     * 
     */
    @Import(name="minServeNodes", required=true)
    private Output<Integer> minServeNodes;

    /**
     * @return Minimum number of nodes to scale down to.
     * 
     */
    public Output<Integer> minServeNodes() {
        return this.minServeNodes;
    }

    private AutoscalingLimitsArgs() {}

    private AutoscalingLimitsArgs(AutoscalingLimitsArgs $) {
        this.maxServeNodes = $.maxServeNodes;
        this.minServeNodes = $.minServeNodes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalingLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingLimitsArgs $;

        public Builder() {
            $ = new AutoscalingLimitsArgs();
        }

        public Builder(AutoscalingLimitsArgs defaults) {
            $ = new AutoscalingLimitsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxServeNodes Maximum number of nodes to scale up to.
         * 
         * @return builder
         * 
         */
        public Builder maxServeNodes(Output<Integer> maxServeNodes) {
            $.maxServeNodes = maxServeNodes;
            return this;
        }

        /**
         * @param maxServeNodes Maximum number of nodes to scale up to.
         * 
         * @return builder
         * 
         */
        public Builder maxServeNodes(Integer maxServeNodes) {
            return maxServeNodes(Output.of(maxServeNodes));
        }

        /**
         * @param minServeNodes Minimum number of nodes to scale down to.
         * 
         * @return builder
         * 
         */
        public Builder minServeNodes(Output<Integer> minServeNodes) {
            $.minServeNodes = minServeNodes;
            return this;
        }

        /**
         * @param minServeNodes Minimum number of nodes to scale down to.
         * 
         * @return builder
         * 
         */
        public Builder minServeNodes(Integer minServeNodes) {
            return minServeNodes(Output.of(minServeNodes));
        }

        public AutoscalingLimitsArgs build() {
            $.maxServeNodes = Objects.requireNonNull($.maxServeNodes, "expected parameter 'maxServeNodes' to be non-null");
            $.minServeNodes = Objects.requireNonNull($.minServeNodes, "expected parameter 'minServeNodes' to be non-null");
            return $;
        }
    }

}
