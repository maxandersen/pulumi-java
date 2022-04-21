// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.NodeSelectorArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
 * 
 */
public final class VolumeNodeAffinityArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeNodeAffinityArgs Empty = new VolumeNodeAffinityArgs();

    /**
     * Required specifies hard node constraints that must be met.
     * 
     */
    @Import(name="required")
    private @Nullable Output<NodeSelectorArgs> required;

    public Optional<Output<NodeSelectorArgs>> required() {
        return Optional.ofNullable(this.required);
    }

    private VolumeNodeAffinityArgs() {}

    private VolumeNodeAffinityArgs(VolumeNodeAffinityArgs $) {
        this.required = $.required;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeNodeAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeNodeAffinityArgs $;

        public Builder() {
            $ = new VolumeNodeAffinityArgs();
        }

        public Builder(VolumeNodeAffinityArgs defaults) {
            $ = new VolumeNodeAffinityArgs(Objects.requireNonNull(defaults));
        }

        public Builder required(@Nullable Output<NodeSelectorArgs> required) {
            $.required = required;
            return this;
        }

        public Builder required(NodeSelectorArgs required) {
            return required(Output.of(required));
        }

        public VolumeNodeAffinityArgs build() {
            return $;
        }
    }

}
