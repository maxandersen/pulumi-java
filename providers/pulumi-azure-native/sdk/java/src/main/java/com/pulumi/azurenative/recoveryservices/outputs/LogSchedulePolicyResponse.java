// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogSchedulePolicyResponse {
    /**
     * Frequency of the log schedule operation of this policy in minutes.
     * 
     */
    private final @Nullable Integer scheduleFrequencyInMins;
    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'LogSchedulePolicy'.
     * 
     */
    private final String schedulePolicyType;

    @CustomType.Constructor
    private LogSchedulePolicyResponse(
        @CustomType.Parameter("scheduleFrequencyInMins") @Nullable Integer scheduleFrequencyInMins,
        @CustomType.Parameter("schedulePolicyType") String schedulePolicyType) {
        this.scheduleFrequencyInMins = scheduleFrequencyInMins;
        this.schedulePolicyType = schedulePolicyType;
    }

    /**
     * Frequency of the log schedule operation of this policy in minutes.
     * 
    */
    public Optional<Integer> scheduleFrequencyInMins() {
        return Optional.ofNullable(this.scheduleFrequencyInMins);
    }
    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'LogSchedulePolicy'.
     * 
    */
    public String schedulePolicyType() {
        return this.schedulePolicyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSchedulePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer scheduleFrequencyInMins;
        private String schedulePolicyType;

        public Builder() {
    	      // Empty
        }

        public Builder(LogSchedulePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleFrequencyInMins = defaults.scheduleFrequencyInMins;
    	      this.schedulePolicyType = defaults.schedulePolicyType;
        }

        public Builder scheduleFrequencyInMins(@Nullable Integer scheduleFrequencyInMins) {
            this.scheduleFrequencyInMins = scheduleFrequencyInMins;
            return this;
        }
        public Builder schedulePolicyType(String schedulePolicyType) {
            this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType);
            return this;
        }        public LogSchedulePolicyResponse build() {
            return new LogSchedulePolicyResponse(scheduleFrequencyInMins, schedulePolicyType);
        }
    }
}
