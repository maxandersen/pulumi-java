// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.aws.securityhub.inputs.InsightFiltersLastObservedAtDateRangeGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InsightFiltersLastObservedAtGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InsightFiltersLastObservedAtGetArgs Empty = new InsightFiltersLastObservedAtGetArgs();

    /**
     * A configuration block of the date range for the date filter. See date_range below for more details.
     * 
     */
    @Import(name="dateRange")
    private @Nullable Output<InsightFiltersLastObservedAtDateRangeGetArgs> dateRange;

    public Optional<Output<InsightFiltersLastObservedAtDateRangeGetArgs>> dateRange() {
        return Optional.ofNullable(this.dateRange);
    }

    /**
     * An end date for the date filter. Required with `start` if `date_range` is not specified.
     * 
     */
    @Import(name="end")
    private @Nullable Output<String> end;

    public Optional<Output<String>> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * A start date for the date filter. Required with `end` if `date_range` is not specified.
     * 
     */
    @Import(name="start")
    private @Nullable Output<String> start;

    public Optional<Output<String>> start() {
        return Optional.ofNullable(this.start);
    }

    private InsightFiltersLastObservedAtGetArgs() {}

    private InsightFiltersLastObservedAtGetArgs(InsightFiltersLastObservedAtGetArgs $) {
        this.dateRange = $.dateRange;
        this.end = $.end;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightFiltersLastObservedAtGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightFiltersLastObservedAtGetArgs $;

        public Builder() {
            $ = new InsightFiltersLastObservedAtGetArgs();
        }

        public Builder(InsightFiltersLastObservedAtGetArgs defaults) {
            $ = new InsightFiltersLastObservedAtGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder dateRange(@Nullable Output<InsightFiltersLastObservedAtDateRangeGetArgs> dateRange) {
            $.dateRange = dateRange;
            return this;
        }

        public Builder dateRange(InsightFiltersLastObservedAtDateRangeGetArgs dateRange) {
            return dateRange(Output.of(dateRange));
        }

        public Builder end(@Nullable Output<String> end) {
            $.end = end;
            return this;
        }

        public Builder end(String end) {
            return end(Output.of(end));
        }

        public Builder start(@Nullable Output<String> start) {
            $.start = start;
            return this;
        }

        public Builder start(String start) {
            return start(Output.of(start));
        }

        public InsightFiltersLastObservedAtGetArgs build() {
            return $;
        }
    }

}
