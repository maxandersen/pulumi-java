// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The node this Taint is attached to has the &#34;effect&#34; on any pod that does not tolerate the Taint.
 * 
 */
public final class TaintArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaintArgs Empty = new TaintArgs();

    /**
     * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     * Possible enum values:
     *  - `&#34;NoExecute&#34;` Evict any already-running pods that do not tolerate the taint. Currently enforced by NodeController.
     *  - `&#34;NoSchedule&#34;` Do not allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods submitted to Kubelet without going through the scheduler to start, and allow all already-running pods to continue running. Enforced by the scheduler.
     *  - `&#34;PreferNoSchedule&#34;` Like TaintEffectNoSchedule, but the scheduler tries not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto the node entirely. Enforced by the scheduler.
     * 
     */
    @Import(name="effect", required=true)
      private final Output<String> effect;

    public Output<String> effect() {
        return this.effect;
    }

    /**
     * Required. The taint key to be applied to a node.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints.
     * 
     */
    @Import(name="timeAdded")
      private final @Nullable Output<String> timeAdded;

    public Output<String> timeAdded() {
        return this.timeAdded == null ? Codegen.empty() : this.timeAdded;
    }

    /**
     * The taint value corresponding to the taint key.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public TaintArgs(
        Output<String> effect,
        Output<String> key,
        @Nullable Output<String> timeAdded,
        @Nullable Output<String> value) {
        this.effect = Objects.requireNonNull(effect, "expected parameter 'effect' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.timeAdded = timeAdded;
        this.value = value;
    }

    private TaintArgs() {
        this.effect = Codegen.empty();
        this.key = Codegen.empty();
        this.timeAdded = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> effect;
        private Output<String> key;
        private @Nullable Output<String> timeAdded;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.timeAdded = defaults.timeAdded;
    	      this.value = defaults.value;
        }

        public Builder effect(Output<String> effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }
        public Builder effect(String effect) {
            this.effect = Output.of(Objects.requireNonNull(effect));
            return this;
        }
        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder timeAdded(@Nullable Output<String> timeAdded) {
            this.timeAdded = timeAdded;
            return this;
        }
        public Builder timeAdded(@Nullable String timeAdded) {
            this.timeAdded = Codegen.ofNullable(timeAdded);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public TaintArgs build() {
            return new TaintArgs(effect, key, timeAdded, value);
        }
    }
}
