// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PerInstanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PerInstanceConfigArgs Empty = new PerInstanceConfigArgs();

    /**
     * The instance group manager this instance config is part of.
     * 
     */
    @Import(name="instanceGroupManager", required=true)
    private Output<String> instanceGroupManager;

    public Output<String> instanceGroupManager() {
        return this.instanceGroupManager;
    }

    /**
     * The minimal action to perform on the instance during an update.
     * Default is `NONE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    @Import(name="minimalAction")
    private @Nullable Output<String> minimalAction;

    public Optional<Output<String>> minimalAction() {
        return Optional.ofNullable(this.minimalAction);
    }

    /**
     * The most disruptive action to perform on the instance during an update.
     * Default is `REPLACE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    @Import(name="mostDisruptiveAllowedAction")
    private @Nullable Output<String> mostDisruptiveAllowedAction;

    public Optional<Output<String>> mostDisruptiveAllowedAction() {
        return Optional.ofNullable(this.mostDisruptiveAllowedAction);
    }

    /**
     * The name for this per-instance config and its corresponding instance.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The preserved state for this instance.
     * Structure is documented below.
     * 
     */
    @Import(name="preservedState")
    private @Nullable Output<PerInstanceConfigPreservedStateArgs> preservedState;

    public Optional<Output<PerInstanceConfigPreservedStateArgs>> preservedState() {
        return Optional.ofNullable(this.preservedState);
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

    /**
     * When true, deleting this config will immediately remove any specified state from the underlying instance.
     * When false, deleting this config will *not* immediately remove any state from the underlying instance.
     * State will be removed on the next instance recreation or update.
     * 
     */
    @Import(name="removeInstanceStateOnDestroy")
    private @Nullable Output<Boolean> removeInstanceStateOnDestroy;

    public Optional<Output<Boolean>> removeInstanceStateOnDestroy() {
        return Optional.ofNullable(this.removeInstanceStateOnDestroy);
    }

    /**
     * Zone where the containing instance group manager is located
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private PerInstanceConfigArgs() {}

    private PerInstanceConfigArgs(PerInstanceConfigArgs $) {
        this.instanceGroupManager = $.instanceGroupManager;
        this.minimalAction = $.minimalAction;
        this.mostDisruptiveAllowedAction = $.mostDisruptiveAllowedAction;
        this.name = $.name;
        this.preservedState = $.preservedState;
        this.project = $.project;
        this.removeInstanceStateOnDestroy = $.removeInstanceStateOnDestroy;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PerInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PerInstanceConfigArgs $;

        public Builder() {
            $ = new PerInstanceConfigArgs();
        }

        public Builder(PerInstanceConfigArgs defaults) {
            $ = new PerInstanceConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceGroupManager(Output<String> instanceGroupManager) {
            $.instanceGroupManager = instanceGroupManager;
            return this;
        }

        public Builder instanceGroupManager(String instanceGroupManager) {
            return instanceGroupManager(Output.of(instanceGroupManager));
        }

        public Builder minimalAction(@Nullable Output<String> minimalAction) {
            $.minimalAction = minimalAction;
            return this;
        }

        public Builder minimalAction(String minimalAction) {
            return minimalAction(Output.of(minimalAction));
        }

        public Builder mostDisruptiveAllowedAction(@Nullable Output<String> mostDisruptiveAllowedAction) {
            $.mostDisruptiveAllowedAction = mostDisruptiveAllowedAction;
            return this;
        }

        public Builder mostDisruptiveAllowedAction(String mostDisruptiveAllowedAction) {
            return mostDisruptiveAllowedAction(Output.of(mostDisruptiveAllowedAction));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder preservedState(@Nullable Output<PerInstanceConfigPreservedStateArgs> preservedState) {
            $.preservedState = preservedState;
            return this;
        }

        public Builder preservedState(PerInstanceConfigPreservedStateArgs preservedState) {
            return preservedState(Output.of(preservedState));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder removeInstanceStateOnDestroy(@Nullable Output<Boolean> removeInstanceStateOnDestroy) {
            $.removeInstanceStateOnDestroy = removeInstanceStateOnDestroy;
            return this;
        }

        public Builder removeInstanceStateOnDestroy(Boolean removeInstanceStateOnDestroy) {
            return removeInstanceStateOnDestroy(Output.of(removeInstanceStateOnDestroy));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public PerInstanceConfigArgs build() {
            $.instanceGroupManager = Objects.requireNonNull($.instanceGroupManager, "expected parameter 'instanceGroupManager' to be non-null");
            return $;
        }
    }

}
