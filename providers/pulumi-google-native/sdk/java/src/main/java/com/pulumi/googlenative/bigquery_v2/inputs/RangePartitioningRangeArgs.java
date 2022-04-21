// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * [TrustedTester] [Required] Defines the ranges for range partitioning.
 * 
 */
public final class RangePartitioningRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final RangePartitioningRangeArgs Empty = new RangePartitioningRangeArgs();

    /**
     * [TrustedTester] [Required] The end of range partitioning, exclusive.
     * 
     */
    @Import(name="end")
    private @Nullable Output<String> end;

    public Optional<Output<String>> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * [TrustedTester] [Required] The width of each interval.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<String> interval;

    public Optional<Output<String>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * [TrustedTester] [Required] The start of range partitioning, inclusive.
     * 
     */
    @Import(name="start")
    private @Nullable Output<String> start;

    public Optional<Output<String>> start() {
        return Optional.ofNullable(this.start);
    }

    private RangePartitioningRangeArgs() {}

    private RangePartitioningRangeArgs(RangePartitioningRangeArgs $) {
        this.end = $.end;
        this.interval = $.interval;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RangePartitioningRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RangePartitioningRangeArgs $;

        public Builder() {
            $ = new RangePartitioningRangeArgs();
        }

        public Builder(RangePartitioningRangeArgs defaults) {
            $ = new RangePartitioningRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder end(@Nullable Output<String> end) {
            $.end = end;
            return this;
        }

        public Builder end(String end) {
            return end(Output.of(end));
        }

        public Builder interval(@Nullable Output<String> interval) {
            $.interval = interval;
            return this;
        }

        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        public Builder start(@Nullable Output<String> start) {
            $.start = start;
            return this;
        }

        public Builder start(String start) {
            return start(Output.of(start));
        }

        public RangePartitioningRangeArgs build() {
            return $;
        }
    }

}
