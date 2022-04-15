// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PlanDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final PlanDataArgs Empty = new PlanDataArgs();

    /**
     * different billing cycles like MONTHLY/WEEKLY. this could be enum
     * 
     */
    @Import(name="billingCycle")
      private final @Nullable Output<String> billingCycle;

    public Output<String> billingCycle() {
        return this.billingCycle == null ? Codegen.empty() : this.billingCycle;
    }

    /**
     * date when plan was applied
     * 
     */
    @Import(name="effectiveDate")
      private final @Nullable Output<String> effectiveDate;

    public Output<String> effectiveDate() {
        return this.effectiveDate == null ? Codegen.empty() : this.effectiveDate;
    }

    /**
     * plan id as published by Logz
     * 
     */
    @Import(name="planDetails")
      private final @Nullable Output<String> planDetails;

    public Output<String> planDetails() {
        return this.planDetails == null ? Codegen.empty() : this.planDetails;
    }

    /**
     * different usage type like PAYG/COMMITTED. this could be enum
     * 
     */
    @Import(name="usageType")
      private final @Nullable Output<String> usageType;

    public Output<String> usageType() {
        return this.usageType == null ? Codegen.empty() : this.usageType;
    }

    public PlanDataArgs(
        @Nullable Output<String> billingCycle,
        @Nullable Output<String> effectiveDate,
        @Nullable Output<String> planDetails,
        @Nullable Output<String> usageType) {
        this.billingCycle = billingCycle;
        this.effectiveDate = effectiveDate;
        this.planDetails = planDetails;
        this.usageType = usageType;
    }

    private PlanDataArgs() {
        this.billingCycle = Codegen.empty();
        this.effectiveDate = Codegen.empty();
        this.planDetails = Codegen.empty();
        this.usageType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> billingCycle;
        private @Nullable Output<String> effectiveDate;
        private @Nullable Output<String> planDetails;
        private @Nullable Output<String> usageType;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingCycle = defaults.billingCycle;
    	      this.effectiveDate = defaults.effectiveDate;
    	      this.planDetails = defaults.planDetails;
    	      this.usageType = defaults.usageType;
        }

        public Builder billingCycle(@Nullable Output<String> billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public Builder billingCycle(@Nullable String billingCycle) {
            this.billingCycle = Codegen.ofNullable(billingCycle);
            return this;
        }
        public Builder effectiveDate(@Nullable Output<String> effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }
        public Builder effectiveDate(@Nullable String effectiveDate) {
            this.effectiveDate = Codegen.ofNullable(effectiveDate);
            return this;
        }
        public Builder planDetails(@Nullable Output<String> planDetails) {
            this.planDetails = planDetails;
            return this;
        }
        public Builder planDetails(@Nullable String planDetails) {
            this.planDetails = Codegen.ofNullable(planDetails);
            return this;
        }
        public Builder usageType(@Nullable Output<String> usageType) {
            this.usageType = usageType;
            return this;
        }
        public Builder usageType(@Nullable String usageType) {
            this.usageType = Codegen.ofNullable(usageType);
            return this;
        }        public PlanDataArgs build() {
            return new PlanDataArgs(billingCycle, effectiveDate, planDetails, usageType);
        }
    }
}
