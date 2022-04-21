// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketObjectLockConfigurationRuleDefaultRetentionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketObjectLockConfigurationRuleDefaultRetentionGetArgs Empty = new BucketObjectLockConfigurationRuleDefaultRetentionGetArgs();

    /**
     * The number of days that you want to specify for the default retention period.
     * 
     */
    @Import(name="days")
    private @Nullable Output<Integer> days;

    public Optional<Output<Integer>> days() {
        return Optional.ofNullable(this.days);
    }

    /**
     * The default Object Lock retention mode you want to apply to new objects placed in this bucket. Valid values are `GOVERNANCE` and `COMPLIANCE`.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    public Output<String> mode() {
        return this.mode;
    }

    /**
     * The number of years that you want to specify for the default retention period.
     * 
     */
    @Import(name="years")
    private @Nullable Output<Integer> years;

    public Optional<Output<Integer>> years() {
        return Optional.ofNullable(this.years);
    }

    private BucketObjectLockConfigurationRuleDefaultRetentionGetArgs() {}

    private BucketObjectLockConfigurationRuleDefaultRetentionGetArgs(BucketObjectLockConfigurationRuleDefaultRetentionGetArgs $) {
        this.days = $.days;
        this.mode = $.mode;
        this.years = $.years;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketObjectLockConfigurationRuleDefaultRetentionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketObjectLockConfigurationRuleDefaultRetentionGetArgs $;

        public Builder() {
            $ = new BucketObjectLockConfigurationRuleDefaultRetentionGetArgs();
        }

        public Builder(BucketObjectLockConfigurationRuleDefaultRetentionGetArgs defaults) {
            $ = new BucketObjectLockConfigurationRuleDefaultRetentionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder days(@Nullable Output<Integer> days) {
            $.days = days;
            return this;
        }

        public Builder days(Integer days) {
            return days(Output.of(days));
        }

        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public Builder years(@Nullable Output<Integer> years) {
            $.years = years;
            return this;
        }

        public Builder years(Integer years) {
            return years(Output.of(years));
        }

        public BucketObjectLockConfigurationRuleDefaultRetentionGetArgs build() {
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            return $;
        }
    }

}
