// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentRolloutDisruptionBudgetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentRolloutDisruptionBudgetArgs Empty = new OsPolicyAssignmentRolloutDisruptionBudgetArgs();

    /**
     * Specifies a fixed value.
     * 
     */
    @Import(name="fixed")
    private @Nullable Output<Integer> fixed;

    public Optional<Output<Integer>> fixed() {
        return Optional.ofNullable(this.fixed);
    }

    /**
     * Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
     */
    @Import(name="percent")
    private @Nullable Output<Integer> percent;

    public Optional<Output<Integer>> percent() {
        return Optional.ofNullable(this.percent);
    }

    private OsPolicyAssignmentRolloutDisruptionBudgetArgs() {}

    private OsPolicyAssignmentRolloutDisruptionBudgetArgs(OsPolicyAssignmentRolloutDisruptionBudgetArgs $) {
        this.fixed = $.fixed;
        this.percent = $.percent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentRolloutDisruptionBudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentRolloutDisruptionBudgetArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentRolloutDisruptionBudgetArgs();
        }

        public Builder(OsPolicyAssignmentRolloutDisruptionBudgetArgs defaults) {
            $ = new OsPolicyAssignmentRolloutDisruptionBudgetArgs(Objects.requireNonNull(defaults));
        }

        public Builder fixed(@Nullable Output<Integer> fixed) {
            $.fixed = fixed;
            return this;
        }

        public Builder fixed(Integer fixed) {
            return fixed(Output.of(fixed));
        }

        public Builder percent(@Nullable Output<Integer> percent) {
            $.percent = percent;
            return this;
        }

        public Builder percent(Integer percent) {
            return percent(Output.of(percent));
        }

        public OsPolicyAssignmentRolloutDisruptionBudgetArgs build() {
            return $;
        }
    }

}
