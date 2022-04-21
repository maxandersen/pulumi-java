// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.gamelift.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An allowed instance type for your game server group.
 * 
 */
public final class GameServerGroupInstanceDefinition extends com.pulumi.resources.InvokeArgs {

    public static final GameServerGroupInstanceDefinition Empty = new GameServerGroupInstanceDefinition();

    @Import(name="instanceType", required=true)
    private String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    @Import(name="weightedCapacity")
    private @Nullable String weightedCapacity;

    public Optional<String> weightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    private GameServerGroupInstanceDefinition() {}

    private GameServerGroupInstanceDefinition(GameServerGroupInstanceDefinition $) {
        this.instanceType = $.instanceType;
        this.weightedCapacity = $.weightedCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GameServerGroupInstanceDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GameServerGroupInstanceDefinition $;

        public Builder() {
            $ = new GameServerGroupInstanceDefinition();
        }

        public Builder(GameServerGroupInstanceDefinition defaults) {
            $ = new GameServerGroupInstanceDefinition(Objects.requireNonNull(defaults));
        }

        public Builder instanceType(String instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder weightedCapacity(@Nullable String weightedCapacity) {
            $.weightedCapacity = weightedCapacity;
            return this;
        }

        public GameServerGroupInstanceDefinition build() {
            $.instanceType = Objects.requireNonNull($.instanceType, "expected parameter 'instanceType' to be non-null");
            return $;
        }
    }

}
