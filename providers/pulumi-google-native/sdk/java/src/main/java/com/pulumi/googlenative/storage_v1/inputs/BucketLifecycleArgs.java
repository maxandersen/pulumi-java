// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.storage_v1.inputs.BucketLifecycleRuleItemArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The bucket&#39;s lifecycle configuration. See lifecycle management for more information.
 * 
 */
public final class BucketLifecycleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleArgs Empty = new BucketLifecycleArgs();

    /**
     * A lifecycle management rule, which is made of an action to take and the condition(s) under which the action will be taken.
     * 
     */
    @Import(name="rule")
      private final @Nullable Output<List<BucketLifecycleRuleItemArgs>> rule;

    public Output<List<BucketLifecycleRuleItemArgs>> rule() {
        return this.rule == null ? Codegen.empty() : this.rule;
    }

    public BucketLifecycleArgs(@Nullable Output<List<BucketLifecycleRuleItemArgs>> rule) {
        this.rule = rule;
    }

    private BucketLifecycleArgs() {
        this.rule = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<BucketLifecycleRuleItemArgs>> rule;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rule = defaults.rule;
        }

        public Builder rule(@Nullable Output<List<BucketLifecycleRuleItemArgs>> rule) {
            this.rule = rule;
            return this;
        }
        public Builder rule(@Nullable List<BucketLifecycleRuleItemArgs> rule) {
            this.rule = Codegen.ofNullable(rule);
            return this;
        }
        public Builder rule(BucketLifecycleRuleItemArgs... rule) {
            return rule(List.of(rule));
        }        public BucketLifecycleArgs build() {
            return new BucketLifecycleArgs(rule);
        }
    }
}
