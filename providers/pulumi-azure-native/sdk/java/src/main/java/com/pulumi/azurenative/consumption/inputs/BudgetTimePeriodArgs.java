// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.consumption.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The start and end date for a budget.
 * 
 */
public final class BudgetTimePeriodArgs extends ResourceArgs {

    public static final BudgetTimePeriodArgs Empty = new BudgetTimePeriodArgs();

    /**
     * The end date for the budget. If not provided, we default this to 10 years from the start date.
     * 
     */
    @Import(name="endDate")
    private @Nullable Output<String> endDate;

    /**
     * @return The end date for the budget. If not provided, we default this to 10 years from the start date.
     * 
     */
    public Optional<Output<String>> endDate() {
        return Optional.ofNullable(this.endDate);
    }

    /**
     * The start date for the budget.
     * 
     */
    @Import(name="startDate", required=true)
    private Output<String> startDate;

    /**
     * @return The start date for the budget.
     * 
     */
    public Output<String> startDate() {
        return this.startDate;
    }

    private BudgetTimePeriodArgs() {}

    private BudgetTimePeriodArgs(BudgetTimePeriodArgs $) {
        this.endDate = $.endDate;
        this.startDate = $.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetTimePeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetTimePeriodArgs $;

        public Builder() {
            $ = new BudgetTimePeriodArgs();
        }

        public Builder(BudgetTimePeriodArgs defaults) {
            $ = new BudgetTimePeriodArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endDate The end date for the budget. If not provided, we default this to 10 years from the start date.
         * 
         * @return builder
         * 
         */
        public Builder endDate(@Nullable Output<String> endDate) {
            $.endDate = endDate;
            return this;
        }

        /**
         * @param endDate The end date for the budget. If not provided, we default this to 10 years from the start date.
         * 
         * @return builder
         * 
         */
        public Builder endDate(String endDate) {
            return endDate(Output.of(endDate));
        }

        /**
         * @param startDate The start date for the budget.
         * 
         * @return builder
         * 
         */
        public Builder startDate(Output<String> startDate) {
            $.startDate = startDate;
            return this;
        }

        /**
         * @param startDate The start date for the budget.
         * 
         * @return builder
         * 
         */
        public Builder startDate(String startDate) {
            return startDate(Output.of(startDate));
        }

        public BudgetTimePeriodArgs build() {
            $.startDate = Objects.requireNonNull($.startDate, "expected parameter 'startDate' to be non-null");
            return $;
        }
    }

}
