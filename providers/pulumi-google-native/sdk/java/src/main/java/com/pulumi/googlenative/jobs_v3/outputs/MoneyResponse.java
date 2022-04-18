// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MoneyResponse {
    /**
     * The three-letter currency code defined in ISO 4217.
     * 
     */
    private final String currencyCode;
    /**
     * Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units` is zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be negative or zero. For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
     * 
     */
    private final Integer nanos;
    /**
     * The whole units of the amount. For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
     * 
     */
    private final String units;

    @CustomType.Constructor
    private MoneyResponse(
        @CustomType.Parameter("currencyCode") String currencyCode,
        @CustomType.Parameter("nanos") Integer nanos,
        @CustomType.Parameter("units") String units) {
        this.currencyCode = currencyCode;
        this.nanos = nanos;
        this.units = units;
    }

    /**
     * The three-letter currency code defined in ISO 4217.
     * 
    */
    public String currencyCode() {
        return this.currencyCode;
    }
    /**
     * Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units` is zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be negative or zero. For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
     * 
    */
    public Integer nanos() {
        return this.nanos;
    }
    /**
     * The whole units of the amount. For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
     * 
    */
    public String units() {
        return this.units;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoneyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String currencyCode;
        private Integer nanos;
        private String units;

        public Builder() {
    	      // Empty
        }

        public Builder(MoneyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currencyCode = defaults.currencyCode;
    	      this.nanos = defaults.nanos;
    	      this.units = defaults.units;
        }

        public Builder currencyCode(String currencyCode) {
            this.currencyCode = Objects.requireNonNull(currencyCode);
            return this;
        }
        public Builder nanos(Integer nanos) {
            this.nanos = Objects.requireNonNull(nanos);
            return this;
        }
        public Builder units(String units) {
            this.units = Objects.requireNonNull(units);
            return this;
        }        public MoneyResponse build() {
            return new MoneyResponse(currencyCode, nanos, units);
        }
    }
}
