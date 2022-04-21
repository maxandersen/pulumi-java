// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


public final class DatasetRetentionPeriodArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetRetentionPeriodArgs Empty = new DatasetRetentionPeriodArgs();

    @Import(name="numberOfDays", required=true)
    private Output<Integer> numberOfDays;

    public Output<Integer> numberOfDays() {
        return this.numberOfDays;
    }

    @Import(name="unlimited", required=true)
    private Output<Boolean> unlimited;

    public Output<Boolean> unlimited() {
        return this.unlimited;
    }

    private DatasetRetentionPeriodArgs() {}

    private DatasetRetentionPeriodArgs(DatasetRetentionPeriodArgs $) {
        this.numberOfDays = $.numberOfDays;
        this.unlimited = $.unlimited;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetRetentionPeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetRetentionPeriodArgs $;

        public Builder() {
            $ = new DatasetRetentionPeriodArgs();
        }

        public Builder(DatasetRetentionPeriodArgs defaults) {
            $ = new DatasetRetentionPeriodArgs(Objects.requireNonNull(defaults));
        }

        public Builder numberOfDays(Output<Integer> numberOfDays) {
            $.numberOfDays = numberOfDays;
            return this;
        }

        public Builder numberOfDays(Integer numberOfDays) {
            return numberOfDays(Output.of(numberOfDays));
        }

        public Builder unlimited(Output<Boolean> unlimited) {
            $.unlimited = unlimited;
            return this;
        }

        public Builder unlimited(Boolean unlimited) {
            return unlimited(Output.of(unlimited));
        }

        public DatasetRetentionPeriodArgs build() {
            $.numberOfDays = Objects.requireNonNull($.numberOfDays, "expected parameter 'numberOfDays' to be non-null");
            $.unlimited = Objects.requireNonNull($.unlimited, "expected parameter 'unlimited' to be non-null");
            return $;
        }
    }

}
