// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableTimePartitioningArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableTimePartitioningArgs Empty = new TableTimePartitioningArgs();

    /**
     * Number of milliseconds for which to keep the
     * storage for a partition.
     * 
     */
    @Import(name="expirationMs")
    private @Nullable Output<Integer> expirationMs;

    public Optional<Output<Integer>> expirationMs() {
        return Optional.ofNullable(this.expirationMs);
    }

    /**
     * The field used to determine how to create a range-based
     * partition.
     * 
     */
    @Import(name="field")
    private @Nullable Output<String> field;

    public Optional<Output<String>> field() {
        return Optional.ofNullable(this.field);
    }

    /**
     * If set to true, queries over this table
     * require a partition filter that can be used for partition elimination to be
     * specified.
     * 
     */
    @Import(name="requirePartitionFilter")
    private @Nullable Output<Boolean> requirePartitionFilter;

    public Optional<Output<Boolean>> requirePartitionFilter() {
        return Optional.ofNullable(this.requirePartitionFilter);
    }

    /**
     * The supported types are DAY, HOUR, MONTH, and YEAR,
     * which will generate one partition per day, hour, month, and year, respectively.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private TableTimePartitioningArgs() {}

    private TableTimePartitioningArgs(TableTimePartitioningArgs $) {
        this.expirationMs = $.expirationMs;
        this.field = $.field;
        this.requirePartitionFilter = $.requirePartitionFilter;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableTimePartitioningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableTimePartitioningArgs $;

        public Builder() {
            $ = new TableTimePartitioningArgs();
        }

        public Builder(TableTimePartitioningArgs defaults) {
            $ = new TableTimePartitioningArgs(Objects.requireNonNull(defaults));
        }

        public Builder expirationMs(@Nullable Output<Integer> expirationMs) {
            $.expirationMs = expirationMs;
            return this;
        }

        public Builder expirationMs(Integer expirationMs) {
            return expirationMs(Output.of(expirationMs));
        }

        public Builder field(@Nullable Output<String> field) {
            $.field = field;
            return this;
        }

        public Builder field(String field) {
            return field(Output.of(field));
        }

        public Builder requirePartitionFilter(@Nullable Output<Boolean> requirePartitionFilter) {
            $.requirePartitionFilter = requirePartitionFilter;
            return this;
        }

        public Builder requirePartitionFilter(Boolean requirePartitionFilter) {
            return requirePartitionFilter(Output.of(requirePartitionFilter));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TableTimePartitioningArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
