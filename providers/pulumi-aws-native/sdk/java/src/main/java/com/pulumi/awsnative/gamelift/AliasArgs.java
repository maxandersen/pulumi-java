// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.gamelift;

import com.pulumi.awsnative.gamelift.inputs.AliasRoutingStrategyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AliasArgs extends com.pulumi.resources.ResourceArgs {

    public static final AliasArgs Empty = new AliasArgs();

    /**
     * A human-readable description of the alias.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A descriptive label that is associated with an alias. Alias names do not need to be unique.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A routing configuration that specifies where traffic is directed for this alias, such as to a fleet or to a message.
     * 
     */
    @Import(name="routingStrategy", required=true)
    private Output<AliasRoutingStrategyArgs> routingStrategy;

    public Output<AliasRoutingStrategyArgs> routingStrategy() {
        return this.routingStrategy;
    }

    private AliasArgs() {}

    private AliasArgs(AliasArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.routingStrategy = $.routingStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasArgs $;

        public Builder() {
            $ = new AliasArgs();
        }

        public Builder(AliasArgs defaults) {
            $ = new AliasArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder routingStrategy(Output<AliasRoutingStrategyArgs> routingStrategy) {
            $.routingStrategy = routingStrategy;
            return this;
        }

        public Builder routingStrategy(AliasRoutingStrategyArgs routingStrategy) {
            return routingStrategy(Output.of(routingStrategy));
        }

        public AliasArgs build() {
            $.routingStrategy = Objects.requireNonNull($.routingStrategy, "expected parameter 'routingStrategy' to be non-null");
            return $;
        }
    }

}
