// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class TableRangePartitioningRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableRangePartitioningRangeArgs Empty = new TableRangePartitioningRangeArgs();

    /**
     * End of the range partitioning, exclusive.
     * 
     */
    @Import(name="end", required=true)
    private Output<Integer> end;

    public Output<Integer> end() {
        return this.end;
    }

    /**
     * The width of each range within the partition.
     * 
     */
    @Import(name="interval", required=true)
    private Output<Integer> interval;

    public Output<Integer> interval() {
        return this.interval;
    }

    /**
     * Start of the range partitioning, inclusive.
     * 
     */
    @Import(name="start", required=true)
    private Output<Integer> start;

    public Output<Integer> start() {
        return this.start;
    }

    private TableRangePartitioningRangeArgs() {}

    private TableRangePartitioningRangeArgs(TableRangePartitioningRangeArgs $) {
        this.end = $.end;
        this.interval = $.interval;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableRangePartitioningRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableRangePartitioningRangeArgs $;

        public Builder() {
            $ = new TableRangePartitioningRangeArgs();
        }

        public Builder(TableRangePartitioningRangeArgs defaults) {
            $ = new TableRangePartitioningRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder end(Output<Integer> end) {
            $.end = end;
            return this;
        }

        public Builder end(Integer end) {
            return end(Output.of(end));
        }

        public Builder interval(Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        public Builder start(Output<Integer> start) {
            $.start = start;
            return this;
        }

        public Builder start(Integer start) {
            return start(Output.of(start));
        }

        public TableRangePartitioningRangeArgs build() {
            $.end = Objects.requireNonNull($.end, "expected parameter 'end' to be non-null");
            $.interval = Objects.requireNonNull($.interval, "expected parameter 'interval' to be non-null");
            $.start = Objects.requireNonNull($.start, "expected parameter 'start' to be non-null");
            return $;
        }
    }

}
