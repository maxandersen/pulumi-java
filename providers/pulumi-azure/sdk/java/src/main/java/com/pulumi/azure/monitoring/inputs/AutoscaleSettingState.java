// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs;
import com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoscaleSettingState extends com.pulumi.resources.ResourceArgs {

    public static final AutoscaleSettingState Empty = new AutoscaleSettingState();

    /**
     * Specifies whether automatic scaling is enabled for the target resource. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Specifies whether automatic scaling is enabled for the target resource. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies the supported Azure location where the AutoScale Setting should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the AutoScale Setting should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the AutoScale Setting. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the AutoScale Setting. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies a `notification` block as defined below.
     * 
     */
    @Import(name="notification")
    private @Nullable Output<AutoscaleSettingNotificationArgs> notification;

    /**
     * @return Specifies a `notification` block as defined below.
     * 
     */
    public Optional<Output<AutoscaleSettingNotificationArgs>> notification() {
        return Optional.ofNullable(this.notification);
    }

    /**
     * Specifies one or more (up to 20) `profile` blocks as defined below.
     * 
     */
    @Import(name="profiles")
    private @Nullable Output<List<AutoscaleSettingProfileArgs>> profiles;

    /**
     * @return Specifies one or more (up to 20) `profile` blocks as defined below.
     * 
     */
    public Optional<Output<List<AutoscaleSettingProfileArgs>>> profiles() {
        return Optional.ofNullable(this.profiles);
    }

    /**
     * The name of the Resource Group in the AutoScale Setting should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in the AutoScale Setting should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the resource ID of the resource that the autoscale setting should be added to.
     * 
     */
    @Import(name="targetResourceId")
    private @Nullable Output<String> targetResourceId;

    /**
     * @return Specifies the resource ID of the resource that the autoscale setting should be added to.
     * 
     */
    public Optional<Output<String>> targetResourceId() {
        return Optional.ofNullable(this.targetResourceId);
    }

    private AutoscaleSettingState() {}

    private AutoscaleSettingState(AutoscaleSettingState $) {
        this.enabled = $.enabled;
        this.location = $.location;
        this.name = $.name;
        this.notification = $.notification;
        this.profiles = $.profiles;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.targetResourceId = $.targetResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscaleSettingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscaleSettingState $;

        public Builder() {
            $ = new AutoscaleSettingState();
        }

        public Builder(AutoscaleSettingState defaults) {
            $ = new AutoscaleSettingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Specifies whether automatic scaling is enabled for the target resource. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether automatic scaling is enabled for the target resource. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param location Specifies the supported Azure location where the AutoScale Setting should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the AutoScale Setting should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the AutoScale Setting. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the AutoScale Setting. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notification Specifies a `notification` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder notification(@Nullable Output<AutoscaleSettingNotificationArgs> notification) {
            $.notification = notification;
            return this;
        }

        /**
         * @param notification Specifies a `notification` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder notification(AutoscaleSettingNotificationArgs notification) {
            return notification(Output.of(notification));
        }

        /**
         * @param profiles Specifies one or more (up to 20) `profile` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder profiles(@Nullable Output<List<AutoscaleSettingProfileArgs>> profiles) {
            $.profiles = profiles;
            return this;
        }

        /**
         * @param profiles Specifies one or more (up to 20) `profile` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder profiles(List<AutoscaleSettingProfileArgs> profiles) {
            return profiles(Output.of(profiles));
        }

        /**
         * @param profiles Specifies one or more (up to 20) `profile` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder profiles(AutoscaleSettingProfileArgs... profiles) {
            return profiles(List.of(profiles));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in the AutoScale Setting should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in the AutoScale Setting should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param targetResourceId Specifies the resource ID of the resource that the autoscale setting should be added to.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceId(@Nullable Output<String> targetResourceId) {
            $.targetResourceId = targetResourceId;
            return this;
        }

        /**
         * @param targetResourceId Specifies the resource ID of the resource that the autoscale setting should be added to.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceId(String targetResourceId) {
            return targetResourceId(Output.of(targetResourceId));
        }

        public AutoscaleSettingState build() {
            return $;
        }
    }

}
