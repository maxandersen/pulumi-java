// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class FixedOrPercentResponse {
    /**
     * Absolute value of VM instances calculated based on the specific mode. - If the value is fixed, then the calculated value is equal to the fixed value. - If the value is a percent, then the calculated value is percent/100 * targetSize. For example, the calculated value of a 80% of a managed instance group with 150 instances would be (80/100 * 150) = 120 VM instances. If there is a remainder, the number is rounded.
     * 
     */
    private final Integer calculated;
    /**
     * Specifies a fixed number of VM instances. This must be a positive integer.
     * 
     */
    private final Integer fixed;
    /**
     * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
     * 
     */
    private final Integer percent;

    @CustomType.Constructor
    private FixedOrPercentResponse(
        @CustomType.Parameter("calculated") Integer calculated,
        @CustomType.Parameter("fixed") Integer fixed,
        @CustomType.Parameter("percent") Integer percent) {
        this.calculated = calculated;
        this.fixed = fixed;
        this.percent = percent;
    }

    /**
     * Absolute value of VM instances calculated based on the specific mode. - If the value is fixed, then the calculated value is equal to the fixed value. - If the value is a percent, then the calculated value is percent/100 * targetSize. For example, the calculated value of a 80% of a managed instance group with 150 instances would be (80/100 * 150) = 120 VM instances. If there is a remainder, the number is rounded.
     * 
    */
    public Integer calculated() {
        return this.calculated;
    }
    /**
     * Specifies a fixed number of VM instances. This must be a positive integer.
     * 
    */
    public Integer fixed() {
        return this.fixed;
    }
    /**
     * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
     * 
    */
    public Integer percent() {
        return this.percent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FixedOrPercentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer calculated;
        private Integer fixed;
        private Integer percent;

        public Builder() {
    	      // Empty
        }

        public Builder(FixedOrPercentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.calculated = defaults.calculated;
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder calculated(Integer calculated) {
            this.calculated = Objects.requireNonNull(calculated);
            return this;
        }
        public Builder fixed(Integer fixed) {
            this.fixed = Objects.requireNonNull(fixed);
            return this;
        }
        public Builder percent(Integer percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }        public FixedOrPercentResponse build() {
            return new FixedOrPercentResponse(calculated, fixed, percent);
        }
    }
}
