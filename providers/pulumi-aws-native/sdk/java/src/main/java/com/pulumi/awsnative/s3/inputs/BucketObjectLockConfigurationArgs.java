// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.inputs.BucketObjectLockRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketObjectLockConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketObjectLockConfigurationArgs Empty = new BucketObjectLockConfigurationArgs();

    @Import(name="objectLockEnabled")
    private @Nullable Output<String> objectLockEnabled;

    public Optional<Output<String>> objectLockEnabled() {
        return Optional.ofNullable(this.objectLockEnabled);
    }

    @Import(name="rule")
    private @Nullable Output<BucketObjectLockRuleArgs> rule;

    public Optional<Output<BucketObjectLockRuleArgs>> rule() {
        return Optional.ofNullable(this.rule);
    }

    private BucketObjectLockConfigurationArgs() {}

    private BucketObjectLockConfigurationArgs(BucketObjectLockConfigurationArgs $) {
        this.objectLockEnabled = $.objectLockEnabled;
        this.rule = $.rule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketObjectLockConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketObjectLockConfigurationArgs $;

        public Builder() {
            $ = new BucketObjectLockConfigurationArgs();
        }

        public Builder(BucketObjectLockConfigurationArgs defaults) {
            $ = new BucketObjectLockConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder objectLockEnabled(@Nullable Output<String> objectLockEnabled) {
            $.objectLockEnabled = objectLockEnabled;
            return this;
        }

        public Builder objectLockEnabled(String objectLockEnabled) {
            return objectLockEnabled(Output.of(objectLockEnabled));
        }

        public Builder rule(@Nullable Output<BucketObjectLockRuleArgs> rule) {
            $.rule = rule;
            return this;
        }

        public Builder rule(BucketObjectLockRuleArgs rule) {
            return rule(Output.of(rule));
        }

        public BucketObjectLockConfigurationArgs build() {
            return $;
        }
    }

}
