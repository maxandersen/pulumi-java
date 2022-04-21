// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gameservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gameservices.inputs.GameServerDeploymentRolloutGameServerConfigOverrideGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GameServerDeploymentRolloutState extends com.pulumi.resources.ResourceArgs {

    public static final GameServerDeploymentRolloutState Empty = new GameServerDeploymentRolloutState();

    /**
     * This field points to the game server config that is
     * applied by default to all realms and clusters. For example,
     * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    @Import(name="defaultGameServerConfig")
    private @Nullable Output<String> defaultGameServerConfig;

    public Optional<Output<String>> defaultGameServerConfig() {
        return Optional.ofNullable(this.defaultGameServerConfig);
    }

    /**
     * The deployment to rollout the new config to. Only 1 rollout must be associated with each deployment.
     * 
     */
    @Import(name="deploymentId")
    private @Nullable Output<String> deploymentId;

    public Optional<Output<String>> deploymentId() {
        return Optional.ofNullable(this.deploymentId);
    }

    /**
     * The game_server_config_overrides contains the per game server config
     * overrides. The overrides are processed in the order they are listed. As
     * soon as a match is found for a cluster, the rest of the list is not
     * processed.
     * Structure is documented below.
     * 
     */
    @Import(name="gameServerConfigOverrides")
    private @Nullable Output<List<GameServerDeploymentRolloutGameServerConfigOverrideGetArgs>> gameServerConfigOverrides;

    public Optional<Output<List<GameServerDeploymentRolloutGameServerConfigOverrideGetArgs>>> gameServerConfigOverrides() {
        return Optional.ofNullable(this.gameServerConfigOverrides);
    }

    /**
     * The resource id of the game server deployment eg:
     * &#39;projects/my-project/locations/global/gameServerDeployments/my-deployment/rollout&#39;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GameServerDeploymentRolloutState() {}

    private GameServerDeploymentRolloutState(GameServerDeploymentRolloutState $) {
        this.defaultGameServerConfig = $.defaultGameServerConfig;
        this.deploymentId = $.deploymentId;
        this.gameServerConfigOverrides = $.gameServerConfigOverrides;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GameServerDeploymentRolloutState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GameServerDeploymentRolloutState $;

        public Builder() {
            $ = new GameServerDeploymentRolloutState();
        }

        public Builder(GameServerDeploymentRolloutState defaults) {
            $ = new GameServerDeploymentRolloutState(Objects.requireNonNull(defaults));
        }

        public Builder defaultGameServerConfig(@Nullable Output<String> defaultGameServerConfig) {
            $.defaultGameServerConfig = defaultGameServerConfig;
            return this;
        }

        public Builder defaultGameServerConfig(String defaultGameServerConfig) {
            return defaultGameServerConfig(Output.of(defaultGameServerConfig));
        }

        public Builder deploymentId(@Nullable Output<String> deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        public Builder deploymentId(String deploymentId) {
            return deploymentId(Output.of(deploymentId));
        }

        public Builder gameServerConfigOverrides(@Nullable Output<List<GameServerDeploymentRolloutGameServerConfigOverrideGetArgs>> gameServerConfigOverrides) {
            $.gameServerConfigOverrides = gameServerConfigOverrides;
            return this;
        }

        public Builder gameServerConfigOverrides(List<GameServerDeploymentRolloutGameServerConfigOverrideGetArgs> gameServerConfigOverrides) {
            return gameServerConfigOverrides(Output.of(gameServerConfigOverrides));
        }

        public Builder gameServerConfigOverrides(GameServerDeploymentRolloutGameServerConfigOverrideGetArgs... gameServerConfigOverrides) {
            return gameServerConfigOverrides(List.of(gameServerConfigOverrides));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GameServerDeploymentRolloutState build() {
            return $;
        }
    }

}
