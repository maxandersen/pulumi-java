// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.NodeGroupAutoscalingPolicyMode;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeGroupAutoscalingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeGroupAutoscalingPolicyArgs Empty = new NodeGroupAutoscalingPolicyArgs();

    /**
     * The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100.
     * 
     */
    @Import(name="maxNodes")
    private @Nullable Output<Integer> maxNodes;

    public Optional<Output<Integer>> maxNodes() {
        return Optional.ofNullable(this.maxNodes);
    }

    /**
     * The minimum number of nodes that the group should have.
     * 
     */
    @Import(name="minNodes")
    private @Nullable Output<Integer> minNodes;

    public Optional<Output<Integer>> minNodes() {
        return Optional.ofNullable(this.minNodes);
    }

    /**
     * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<NodeGroupAutoscalingPolicyMode> mode;

    public Optional<Output<NodeGroupAutoscalingPolicyMode>> mode() {
        return Optional.ofNullable(this.mode);
    }

    private NodeGroupAutoscalingPolicyArgs() {}

    private NodeGroupAutoscalingPolicyArgs(NodeGroupAutoscalingPolicyArgs $) {
        this.maxNodes = $.maxNodes;
        this.minNodes = $.minNodes;
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeGroupAutoscalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeGroupAutoscalingPolicyArgs $;

        public Builder() {
            $ = new NodeGroupAutoscalingPolicyArgs();
        }

        public Builder(NodeGroupAutoscalingPolicyArgs defaults) {
            $ = new NodeGroupAutoscalingPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxNodes(@Nullable Output<Integer> maxNodes) {
            $.maxNodes = maxNodes;
            return this;
        }

        public Builder maxNodes(Integer maxNodes) {
            return maxNodes(Output.of(maxNodes));
        }

        public Builder minNodes(@Nullable Output<Integer> minNodes) {
            $.minNodes = minNodes;
            return this;
        }

        public Builder minNodes(Integer minNodes) {
            return minNodes(Output.of(minNodes));
        }

        public Builder mode(@Nullable Output<NodeGroupAutoscalingPolicyMode> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(NodeGroupAutoscalingPolicyMode mode) {
            return mode(Output.of(mode));
        }

        public NodeGroupAutoscalingPolicyArgs build() {
            return $;
        }
    }

}
