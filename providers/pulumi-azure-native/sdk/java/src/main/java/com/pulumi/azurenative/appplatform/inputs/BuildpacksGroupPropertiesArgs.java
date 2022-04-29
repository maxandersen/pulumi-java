// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.azurenative.appplatform.inputs.BuildpackPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Buildpack group properties of the Builder
 * 
 */
public final class BuildpacksGroupPropertiesArgs extends ResourceArgs {

    public static final BuildpacksGroupPropertiesArgs Empty = new BuildpacksGroupPropertiesArgs();

    /**
     * Buildpacks in the buildpack group
     * 
     */
    @Import(name="buildpacks")
    private @Nullable Output<List<BuildpackPropertiesArgs>> buildpacks;

    /**
     * @return Buildpacks in the buildpack group
     * 
     */
    public Optional<Output<List<BuildpackPropertiesArgs>>> buildpacks() {
        return Optional.ofNullable(this.buildpacks);
    }

    /**
     * Buildpack group name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Buildpack group name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private BuildpacksGroupPropertiesArgs() {}

    private BuildpacksGroupPropertiesArgs(BuildpacksGroupPropertiesArgs $) {
        this.buildpacks = $.buildpacks;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildpacksGroupPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildpacksGroupPropertiesArgs $;

        public Builder() {
            $ = new BuildpacksGroupPropertiesArgs();
        }

        public Builder(BuildpacksGroupPropertiesArgs defaults) {
            $ = new BuildpacksGroupPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buildpacks Buildpacks in the buildpack group
         * 
         * @return builder
         * 
         */
        public Builder buildpacks(@Nullable Output<List<BuildpackPropertiesArgs>> buildpacks) {
            $.buildpacks = buildpacks;
            return this;
        }

        /**
         * @param buildpacks Buildpacks in the buildpack group
         * 
         * @return builder
         * 
         */
        public Builder buildpacks(List<BuildpackPropertiesArgs> buildpacks) {
            return buildpacks(Output.of(buildpacks));
        }

        /**
         * @param buildpacks Buildpacks in the buildpack group
         * 
         * @return builder
         * 
         */
        public Builder buildpacks(BuildpackPropertiesArgs... buildpacks) {
            return buildpacks(List.of(buildpacks));
        }

        /**
         * @param name Buildpack group name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Buildpack group name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public BuildpacksGroupPropertiesArgs build() {
            return $;
        }
    }

}
