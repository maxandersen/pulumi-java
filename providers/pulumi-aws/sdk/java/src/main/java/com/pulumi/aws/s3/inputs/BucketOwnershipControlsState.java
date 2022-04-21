// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketOwnershipControlsRuleGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketOwnershipControlsState extends com.pulumi.resources.ResourceArgs {

    public static final BucketOwnershipControlsState Empty = new BucketOwnershipControlsState();

    /**
     * The name of the bucket that you want to associate this access point with.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Configuration block(s) with Ownership Controls rules. Detailed below.
     * 
     */
    @Import(name="rule")
    private @Nullable Output<BucketOwnershipControlsRuleGetArgs> rule;

    public Optional<Output<BucketOwnershipControlsRuleGetArgs>> rule() {
        return Optional.ofNullable(this.rule);
    }

    private BucketOwnershipControlsState() {}

    private BucketOwnershipControlsState(BucketOwnershipControlsState $) {
        this.bucket = $.bucket;
        this.rule = $.rule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketOwnershipControlsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketOwnershipControlsState $;

        public Builder() {
            $ = new BucketOwnershipControlsState();
        }

        public Builder(BucketOwnershipControlsState defaults) {
            $ = new BucketOwnershipControlsState(Objects.requireNonNull(defaults));
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder rule(@Nullable Output<BucketOwnershipControlsRuleGetArgs> rule) {
            $.rule = rule;
            return this;
        }

        public Builder rule(BucketOwnershipControlsRuleGetArgs rule) {
            return rule(Output.of(rule));
        }

        public BucketOwnershipControlsState build() {
            return $;
        }
    }

}
