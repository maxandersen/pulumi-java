// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.inputs.BucketObjectLockRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketObjectLockConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketObjectLockConfigurationArgs Empty = new BucketObjectLockConfigurationArgs();

    @Import(name="objectLockEnabled")
      private final @Nullable Output<String> objectLockEnabled;

    public Output<String> objectLockEnabled() {
        return this.objectLockEnabled == null ? Codegen.empty() : this.objectLockEnabled;
    }

    @Import(name="rule")
      private final @Nullable Output<BucketObjectLockRuleArgs> rule;

    public Output<BucketObjectLockRuleArgs> rule() {
        return this.rule == null ? Codegen.empty() : this.rule;
    }

    public BucketObjectLockConfigurationArgs(
        @Nullable Output<String> objectLockEnabled,
        @Nullable Output<BucketObjectLockRuleArgs> rule) {
        this.objectLockEnabled = objectLockEnabled;
        this.rule = rule;
    }

    private BucketObjectLockConfigurationArgs() {
        this.objectLockEnabled = Codegen.empty();
        this.rule = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectLockConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> objectLockEnabled;
        private @Nullable Output<BucketObjectLockRuleArgs> rule;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectLockConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectLockEnabled = defaults.objectLockEnabled;
    	      this.rule = defaults.rule;
        }

        public Builder objectLockEnabled(@Nullable Output<String> objectLockEnabled) {
            this.objectLockEnabled = objectLockEnabled;
            return this;
        }
        public Builder objectLockEnabled(@Nullable String objectLockEnabled) {
            this.objectLockEnabled = Codegen.ofNullable(objectLockEnabled);
            return this;
        }
        public Builder rule(@Nullable Output<BucketObjectLockRuleArgs> rule) {
            this.rule = rule;
            return this;
        }
        public Builder rule(@Nullable BucketObjectLockRuleArgs rule) {
            this.rule = Codegen.ofNullable(rule);
            return this;
        }        public BucketObjectLockConfigurationArgs build() {
            return new BucketObjectLockConfigurationArgs(objectLockEnabled, rule);
        }
    }
}
