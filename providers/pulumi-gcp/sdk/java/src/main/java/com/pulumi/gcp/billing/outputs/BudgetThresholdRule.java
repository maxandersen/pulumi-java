// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.billing.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetThresholdRule {
    /**
     * The type of basis used to determine if spend has passed
     * the threshold.
     * Default value is `CURRENT_SPEND`.
     * Possible values are `CURRENT_SPEND` and `FORECASTED_SPEND`.
     * 
     */
    private final @Nullable String spendBasis;
    /**
     * Send an alert when this threshold is exceeded. This is a
     * 1.0-based percentage, so 0.5 = 50%. Must be &gt;= 0.
     * 
     */
    private final Double thresholdPercent;

    @CustomType.Constructor
    private BudgetThresholdRule(
        @CustomType.Parameter("spendBasis") @Nullable String spendBasis,
        @CustomType.Parameter("thresholdPercent") Double thresholdPercent) {
        this.spendBasis = spendBasis;
        this.thresholdPercent = thresholdPercent;
    }

    /**
     * The type of basis used to determine if spend has passed
     * the threshold.
     * Default value is `CURRENT_SPEND`.
     * Possible values are `CURRENT_SPEND` and `FORECASTED_SPEND`.
     * 
    */
    public Optional<String> spendBasis() {
        return Optional.ofNullable(this.spendBasis);
    }
    /**
     * Send an alert when this threshold is exceeded. This is a
     * 1.0-based percentage, so 0.5 = 50%. Must be &gt;= 0.
     * 
    */
    public Double thresholdPercent() {
        return this.thresholdPercent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetThresholdRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String spendBasis;
        private Double thresholdPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetThresholdRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spendBasis = defaults.spendBasis;
    	      this.thresholdPercent = defaults.thresholdPercent;
        }

        public Builder spendBasis(@Nullable String spendBasis) {
            this.spendBasis = spendBasis;
            return this;
        }
        public Builder thresholdPercent(Double thresholdPercent) {
            this.thresholdPercent = Objects.requireNonNull(thresholdPercent);
            return this;
        }        public BudgetThresholdRule build() {
            return new BudgetThresholdRule(spendBasis, thresholdPercent);
        }
    }
}
