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


public final class ClusterCapacityProvidersDefaultCapacityProviderStrategyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCapacityProvidersDefaultCapacityProviderStrategyGetArgs Empty = new ClusterCapacityProvidersDefaultCapacityProviderStrategyGetArgs();

    /**
     * The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined. Defaults to `0`.
     * 
     */
    @Import(name="base")
    private @Nullable Output<Integer> base;

    public Optional<Output<Integer>> base() {
        return Optional.ofNullable(this.base);
    }

    /**
     * Name of the capacity provider.
     * 
     */
    @Import(name="capacityProvider", required=true)
    private Output<String> capacityProvider;

    public Output<String> capacityProvider() {
        return this.capacityProvider;
    }

    /**
     * The relative percentage of the total number of launched tasks that should use the specified capacity provider. The `weight` value is taken into consideration after the `base` count of tasks has been satisfied. Defaults to `0`.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private ClusterCapacityProvidersDefaultCapacityProviderStrategyGetArgs() {}

    private ClusterCapacityProvidersDefaultCapacityProviderStrategyGetArgs(ClusterCapacityProvidersDefaultCapacityProviderStrategyGetArgs $) {
        this.base = $.base;
        this.capacityProvider = $.capacityProvider;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCapacityProvidersDefaultCapacityProviderStrategyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCapacityProvidersDefaultCapacityProviderStrategyGetArgs $;

        public Builder() {
            $ = new ClusterCapacityProvidersDefaultCapacityProviderStrategyGetArgs();
        }

        public Builder(ClusterCapacityProvidersDefaultCapacityProviderStrategyGetArgs defaults) {
            $ = new ClusterCapacityProvidersDefaultCapacityProviderStrategyGetArgs(Objects.requireNonNull(defaults));
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

        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public ClusterCapacityProvidersDefaultCapacityProviderStrategyGetArgs build() {
            $.capacityProvider = Objects.requireNonNull($.capacityProvider, "expected parameter 'capacityProvider' to be non-null");
            return $;
        }
    }

}
