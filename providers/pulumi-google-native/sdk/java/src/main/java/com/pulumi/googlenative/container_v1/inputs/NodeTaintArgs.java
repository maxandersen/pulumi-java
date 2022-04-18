// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.container_v1.enums.NodeTaintEffect;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Kubernetes taint is comprised of three fields: key, value, and effect. Effect can only be one of three types: NoSchedule, PreferNoSchedule or NoExecute. See [here](https://kubernetes.io/docs/concepts/configuration/taint-and-toleration) for more information, including usage and the valid values.
 * 
 */
public final class NodeTaintArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeTaintArgs Empty = new NodeTaintArgs();

    /**
     * Effect for taint.
     * 
     */
    @Import(name="effect")
      private final @Nullable Output<NodeTaintEffect> effect;

    public Output<NodeTaintEffect> effect() {
        return this.effect == null ? Codegen.empty() : this.effect;
    }

    /**
     * Key for taint.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * Value for taint.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public NodeTaintArgs(
        @Nullable Output<NodeTaintEffect> effect,
        @Nullable Output<String> key,
        @Nullable Output<String> value) {
        this.effect = effect;
        this.key = key;
        this.value = value;
    }

    private NodeTaintArgs() {
        this.effect = Codegen.empty();
        this.key = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTaintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NodeTaintEffect> effect;
        private @Nullable Output<String> key;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTaintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder effect(@Nullable Output<NodeTaintEffect> effect) {
            this.effect = effect;
            return this;
        }
        public Builder effect(@Nullable NodeTaintEffect effect) {
            this.effect = Codegen.ofNullable(effect);
            return this;
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public NodeTaintArgs build() {
            return new NodeTaintArgs(effect, key, value);
        }
    }
}
