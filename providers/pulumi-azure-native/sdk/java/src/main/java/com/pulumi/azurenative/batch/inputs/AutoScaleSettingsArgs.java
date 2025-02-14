// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoScaleSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoScaleSettingsArgs Empty = new AutoScaleSettingsArgs();

    /**
     * If omitted, the default value is 15 minutes (PT15M).
     * 
     */
    @Import(name="evaluationInterval")
    private @Nullable Output<String> evaluationInterval;

    /**
     * @return If omitted, the default value is 15 minutes (PT15M).
     * 
     */
    public Optional<Output<String>> evaluationInterval() {
        return Optional.ofNullable(this.evaluationInterval);
    }

    @Import(name="formula", required=true)
    private Output<String> formula;

    public Output<String> formula() {
        return this.formula;
    }

    private AutoScaleSettingsArgs() {}

    private AutoScaleSettingsArgs(AutoScaleSettingsArgs $) {
        this.evaluationInterval = $.evaluationInterval;
        this.formula = $.formula;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoScaleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoScaleSettingsArgs $;

        public Builder() {
            $ = new AutoScaleSettingsArgs();
        }

        public Builder(AutoScaleSettingsArgs defaults) {
            $ = new AutoScaleSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param evaluationInterval If omitted, the default value is 15 minutes (PT15M).
         * 
         * @return builder
         * 
         */
        public Builder evaluationInterval(@Nullable Output<String> evaluationInterval) {
            $.evaluationInterval = evaluationInterval;
            return this;
        }

        /**
         * @param evaluationInterval If omitted, the default value is 15 minutes (PT15M).
         * 
         * @return builder
         * 
         */
        public Builder evaluationInterval(String evaluationInterval) {
            return evaluationInterval(Output.of(evaluationInterval));
        }

        public Builder formula(Output<String> formula) {
            $.formula = formula;
            return this;
        }

        public Builder formula(String formula) {
            return formula(Output.of(formula));
        }

        public AutoScaleSettingsArgs build() {
            $.formula = Objects.requireNonNull($.formula, "expected parameter 'formula' to be non-null");
            return $;
        }
    }

}
