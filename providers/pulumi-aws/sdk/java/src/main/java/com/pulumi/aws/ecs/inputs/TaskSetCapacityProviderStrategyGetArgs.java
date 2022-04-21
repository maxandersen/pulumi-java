// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskSetCapacityProviderStrategyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskSetCapacityProviderStrategyGetArgs Empty = new TaskSetCapacityProviderStrategyGetArgs();

    /**
     * The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
     * 
     */
    @Import(name="base")
    private @Nullable Output<Integer> base;

    public Optional<Output<Integer>> base() {
        return Optional.ofNullable(this.base);
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the capacity provider.
     * 
     */
    @Import(name="capacityProvider", required=true)
    private Output<String> capacityProvider;

    public Output<String> capacityProvider() {
        return this.capacityProvider;
    }

    /**
     * The relative percentage of the total number of launched tasks that should use the specified capacity provider.
     * 
     */
    @Import(name="weight", required=true)
    private Output<Integer> weight;

    public Output<Integer> weight() {
        return this.weight;
    }

    private TaskSetCapacityProviderStrategyGetArgs() {}

    private TaskSetCapacityProviderStrategyGetArgs(TaskSetCapacityProviderStrategyGetArgs $) {
        this.base = $.base;
        this.capacityProvider = $.capacityProvider;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskSetCapacityProviderStrategyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskSetCapacityProviderStrategyGetArgs $;

        public Builder() {
            $ = new TaskSetCapacityProviderStrategyGetArgs();
        }

        public Builder(TaskSetCapacityProviderStrategyGetArgs defaults) {
            $ = new TaskSetCapacityProviderStrategyGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder base(@Nullable Output<Integer> base) {
            $.base = base;
            return this;
        }

        public Builder base(Integer base) {
            return base(Output.of(base));
        }

        public Builder capacityProvider(Output<String> capacityProvider) {
            $.capacityProvider = capacityProvider;
            return this;
        }

        public Builder capacityProvider(String capacityProvider) {
            return capacityProvider(Output.of(capacityProvider));
        }

        public Builder weight(Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public TaskSetCapacityProviderStrategyGetArgs build() {
            $.capacityProvider = Objects.requireNonNull($.capacityProvider, "expected parameter 'capacityProvider' to be non-null");
            $.weight = Objects.requireNonNull($.weight, "expected parameter 'weight' to be non-null");
            return $;
        }
    }

}
