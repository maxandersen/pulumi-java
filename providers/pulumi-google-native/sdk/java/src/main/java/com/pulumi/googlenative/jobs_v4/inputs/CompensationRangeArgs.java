// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.jobs_v4.inputs.MoneyArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Compensation range.
 * 
 */
public final class CompensationRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final CompensationRangeArgs Empty = new CompensationRangeArgs();

    /**
     * The maximum amount of compensation. If left empty, the value is set to a maximal compensation value and the currency code is set to match the currency code of min_compensation.
     * 
     */
    @Import(name="maxCompensation")
    private @Nullable Output<MoneyArgs> maxCompensation;

    public Optional<Output<MoneyArgs>> maxCompensation() {
        return Optional.ofNullable(this.maxCompensation);
    }

    /**
     * The minimum amount of compensation. If left empty, the value is set to zero and the currency code is set to match the currency code of max_compensation.
     * 
     */
    @Import(name="minCompensation")
    private @Nullable Output<MoneyArgs> minCompensation;

    public Optional<Output<MoneyArgs>> minCompensation() {
        return Optional.ofNullable(this.minCompensation);
    }

    private CompensationRangeArgs() {}

    private CompensationRangeArgs(CompensationRangeArgs $) {
        this.maxCompensation = $.maxCompensation;
        this.minCompensation = $.minCompensation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CompensationRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CompensationRangeArgs $;

        public Builder() {
            $ = new CompensationRangeArgs();
        }

        public Builder(CompensationRangeArgs defaults) {
            $ = new CompensationRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxCompensation(@Nullable Output<MoneyArgs> maxCompensation) {
            $.maxCompensation = maxCompensation;
            return this;
        }

        public Builder maxCompensation(MoneyArgs maxCompensation) {
            return maxCompensation(Output.of(maxCompensation));
        }

        public Builder minCompensation(@Nullable Output<MoneyArgs> minCompensation) {
            $.minCompensation = minCompensation;
            return this;
        }

        public Builder minCompensation(MoneyArgs minCompensation) {
            return minCompensation(Output.of(minCompensation));
        }

        public CompensationRangeArgs build() {
            return $;
        }
    }

}
