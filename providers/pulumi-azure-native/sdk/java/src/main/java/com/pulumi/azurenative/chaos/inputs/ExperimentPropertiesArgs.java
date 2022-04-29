// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.chaos.inputs;

import com.pulumi.azurenative.chaos.inputs.SelectorArgs;
import com.pulumi.azurenative.chaos.inputs.StepArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Model that represents the Experiment properties model.
 * 
 */
public final class ExperimentPropertiesArgs extends ResourceArgs {

    public static final ExperimentPropertiesArgs Empty = new ExperimentPropertiesArgs();

    /**
     * List of selectors.
     * 
     */
    @Import(name="selectors", required=true)
    private Output<List<SelectorArgs>> selectors;

    /**
     * @return List of selectors.
     * 
     */
    public Output<List<SelectorArgs>> selectors() {
        return this.selectors;
    }

    /**
     * A boolean value that indicates if experiment should be started on creation or not.
     * 
     */
    @Import(name="startOnCreation")
    private @Nullable Output<Boolean> startOnCreation;

    /**
     * @return A boolean value that indicates if experiment should be started on creation or not.
     * 
     */
    public Optional<Output<Boolean>> startOnCreation() {
        return Optional.ofNullable(this.startOnCreation);
    }

    /**
     * List of steps.
     * 
     */
    @Import(name="steps", required=true)
    private Output<List<StepArgs>> steps;

    /**
     * @return List of steps.
     * 
     */
    public Output<List<StepArgs>> steps() {
        return this.steps;
    }

    private ExperimentPropertiesArgs() {}

    private ExperimentPropertiesArgs(ExperimentPropertiesArgs $) {
        this.selectors = $.selectors;
        this.startOnCreation = $.startOnCreation;
        this.steps = $.steps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExperimentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExperimentPropertiesArgs $;

        public Builder() {
            $ = new ExperimentPropertiesArgs();
        }

        public Builder(ExperimentPropertiesArgs defaults) {
            $ = new ExperimentPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param selectors List of selectors.
         * 
         * @return builder
         * 
         */
        public Builder selectors(Output<List<SelectorArgs>> selectors) {
            $.selectors = selectors;
            return this;
        }

        /**
         * @param selectors List of selectors.
         * 
         * @return builder
         * 
         */
        public Builder selectors(List<SelectorArgs> selectors) {
            return selectors(Output.of(selectors));
        }

        /**
         * @param selectors List of selectors.
         * 
         * @return builder
         * 
         */
        public Builder selectors(SelectorArgs... selectors) {
            return selectors(List.of(selectors));
        }

        /**
         * @param startOnCreation A boolean value that indicates if experiment should be started on creation or not.
         * 
         * @return builder
         * 
         */
        public Builder startOnCreation(@Nullable Output<Boolean> startOnCreation) {
            $.startOnCreation = startOnCreation;
            return this;
        }

        /**
         * @param startOnCreation A boolean value that indicates if experiment should be started on creation or not.
         * 
         * @return builder
         * 
         */
        public Builder startOnCreation(Boolean startOnCreation) {
            return startOnCreation(Output.of(startOnCreation));
        }

        /**
         * @param steps List of steps.
         * 
         * @return builder
         * 
         */
        public Builder steps(Output<List<StepArgs>> steps) {
            $.steps = steps;
            return this;
        }

        /**
         * @param steps List of steps.
         * 
         * @return builder
         * 
         */
        public Builder steps(List<StepArgs> steps) {
            return steps(Output.of(steps));
        }

        /**
         * @param steps List of steps.
         * 
         * @return builder
         * 
         */
        public Builder steps(StepArgs... steps) {
            return steps(List.of(steps));
        }

        public ExperimentPropertiesArgs build() {
            $.selectors = Objects.requireNonNull($.selectors, "expected parameter 'selectors' to be non-null");
            $.steps = Objects.requireNonNull($.steps, "expected parameter 'steps' to be non-null");
            return $;
        }
    }

}
