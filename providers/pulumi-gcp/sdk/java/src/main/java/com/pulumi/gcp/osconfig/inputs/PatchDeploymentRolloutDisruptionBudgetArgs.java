// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PatchDeploymentRolloutDisruptionBudgetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentRolloutDisruptionBudgetArgs Empty = new PatchDeploymentRolloutDisruptionBudgetArgs();

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
    @Import(name="percentage")
    private @Nullable Output<Integer> percentage;

    public Optional<Output<Integer>> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    private PatchDeploymentRolloutDisruptionBudgetArgs() {}

    private PatchDeploymentRolloutDisruptionBudgetArgs(PatchDeploymentRolloutDisruptionBudgetArgs $) {
        this.fixed = $.fixed;
        this.percentage = $.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchDeploymentRolloutDisruptionBudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchDeploymentRolloutDisruptionBudgetArgs $;

        public Builder() {
            $ = new PatchDeploymentRolloutDisruptionBudgetArgs();
        }

        public Builder(PatchDeploymentRolloutDisruptionBudgetArgs defaults) {
            $ = new PatchDeploymentRolloutDisruptionBudgetArgs(Objects.requireNonNull(defaults));
        }

        public Builder fixed(@Nullable Output<Integer> fixed) {
            $.fixed = fixed;
            return this;
        }

        public Builder fixed(Integer fixed) {
            return fixed(Output.of(fixed));
        }

        public Builder percentage(@Nullable Output<Integer> percentage) {
            $.percentage = percentage;
            return this;
        }

        public Builder percentage(Integer percentage) {
            return percentage(Output.of(percentage));
        }

        public PatchDeploymentRolloutDisruptionBudgetArgs build() {
            return $;
        }
    }

}
