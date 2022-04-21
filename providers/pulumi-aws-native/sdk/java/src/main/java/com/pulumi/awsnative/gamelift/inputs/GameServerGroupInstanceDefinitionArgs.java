// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.gamelift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An allowed instance type for your game server group.
 * 
 */
public final class GameServerGroupInstanceDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GameServerGroupInstanceDefinitionArgs Empty = new GameServerGroupInstanceDefinitionArgs();

    @Import(name="instanceType", required=true)
    private Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType;
    }

    @Import(name="weightedCapacity")
    private @Nullable Output<String> weightedCapacity;

    public Optional<Output<String>> weightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    private GameServerGroupInstanceDefinitionArgs() {}

    private GameServerGroupInstanceDefinitionArgs(GameServerGroupInstanceDefinitionArgs $) {
        this.instanceType = $.instanceType;
        this.weightedCapacity = $.weightedCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GameServerGroupInstanceDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GameServerGroupInstanceDefinitionArgs $;

        public Builder() {
            $ = new GameServerGroupInstanceDefinitionArgs();
        }

        public Builder(GameServerGroupInstanceDefinitionArgs defaults) {
            $ = new GameServerGroupInstanceDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceType(Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder weightedCapacity(@Nullable Output<String> weightedCapacity) {
            $.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder weightedCapacity(String weightedCapacity) {
            return weightedCapacity(Output.of(weightedCapacity));
        }

        public GameServerGroupInstanceDefinitionArgs build() {
            $.instanceType = Objects.requireNonNull($.instanceType, "expected parameter 'instanceType' to be non-null");
            return $;
        }
    }

}
