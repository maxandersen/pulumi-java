// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.billingbudgets_v1.inputs.GoogleTypeDateArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * All date times begin at 12 AM US and Canadian Pacific Time (UTC-8).
 * 
 */
public final class GoogleCloudBillingBudgetsV1CustomPeriodArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudBillingBudgetsV1CustomPeriodArgs Empty = new GoogleCloudBillingBudgetsV1CustomPeriodArgs();

    /**
     * Optional. The end date of the time period. Budgets with elapsed end date won&#39;t be processed. If unset, specifies to track all usage incurred since the start_date.
     * 
     */
    @Import(name="endDate")
      private final @Nullable Output<GoogleTypeDateArgs> endDate;

    public Output<GoogleTypeDateArgs> endDate() {
        return this.endDate == null ? Codegen.empty() : this.endDate;
    }

    /**
     * The start date must be after January 1, 2017.
     * 
     */
    @Import(name="startDate", required=true)
      private final Output<GoogleTypeDateArgs> startDate;

    public Output<GoogleTypeDateArgs> startDate() {
        return this.startDate;
    }

    public GoogleCloudBillingBudgetsV1CustomPeriodArgs(
        @Nullable Output<GoogleTypeDateArgs> endDate,
        Output<GoogleTypeDateArgs> startDate) {
        this.endDate = endDate;
        this.startDate = Objects.requireNonNull(startDate, "expected parameter 'startDate' to be non-null");
    }

    private GoogleCloudBillingBudgetsV1CustomPeriodArgs() {
        this.endDate = Codegen.empty();
        this.startDate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1CustomPeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleTypeDateArgs> endDate;
        private Output<GoogleTypeDateArgs> startDate;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1CustomPeriodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
        }

        public Builder endDate(@Nullable Output<GoogleTypeDateArgs> endDate) {
            this.endDate = endDate;
            return this;
        }
        public Builder endDate(@Nullable GoogleTypeDateArgs endDate) {
            this.endDate = Codegen.ofNullable(endDate);
            return this;
        }
        public Builder startDate(Output<GoogleTypeDateArgs> startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }
        public Builder startDate(GoogleTypeDateArgs startDate) {
            this.startDate = Output.of(Objects.requireNonNull(startDate));
            return this;
        }        public GoogleCloudBillingBudgetsV1CustomPeriodArgs build() {
            return new GoogleCloudBillingBudgetsV1CustomPeriodArgs(endDate, startDate);
        }
    }
}
