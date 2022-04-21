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


public final class BucketReplicationConfigurationRuleDestinationReplicationTimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationRuleDestinationReplicationTimeArgs Empty = new BucketReplicationConfigurationRuleDestinationReplicationTimeArgs();

    /**
     * Threshold within which objects are to be replicated. The only valid value is `15`.
     * 
     */
    @Import(name="minutes")
    private @Nullable Output<Integer> minutes;

    public Optional<Output<Integer>> minutes() {
        return Optional.ofNullable(this.minutes);
    }

    /**
     * The status of RTC. Either `Enabled` or `Disabled`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private BucketReplicationConfigurationRuleDestinationReplicationTimeArgs() {}

    private BucketReplicationConfigurationRuleDestinationReplicationTimeArgs(BucketReplicationConfigurationRuleDestinationReplicationTimeArgs $) {
        this.minutes = $.minutes;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationConfigurationRuleDestinationReplicationTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationConfigurationRuleDestinationReplicationTimeArgs $;

        public Builder() {
            $ = new BucketReplicationConfigurationRuleDestinationReplicationTimeArgs();
        }

        public Builder(BucketReplicationConfigurationRuleDestinationReplicationTimeArgs defaults) {
            $ = new BucketReplicationConfigurationRuleDestinationReplicationTimeArgs(Objects.requireNonNull(defaults));
        }

        public Builder minutes(@Nullable Output<Integer> minutes) {
            $.minutes = minutes;
            return this;
        }

        public Builder minutes(Integer minutes) {
            return minutes(Output.of(minutes));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public BucketReplicationConfigurationRuleDestinationReplicationTimeArgs build() {
            return $;
        }
    }

}
