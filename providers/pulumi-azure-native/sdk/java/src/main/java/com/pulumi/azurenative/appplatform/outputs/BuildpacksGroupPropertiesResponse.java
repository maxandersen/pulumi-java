// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.azurenative.appplatform.outputs.BuildpackPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BuildpacksGroupPropertiesResponse {
    /**
     * Buildpacks in the buildpack group
     * 
     */
    private final @Nullable List<BuildpackPropertiesResponse> buildpacks;
    /**
     * Buildpack group name
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private BuildpacksGroupPropertiesResponse(
        @CustomType.Parameter("buildpacks") @Nullable List<BuildpackPropertiesResponse> buildpacks,
        @CustomType.Parameter("name") @Nullable String name) {
        this.buildpacks = buildpacks;
        this.name = name;
    }

    /**
     * Buildpacks in the buildpack group
     * 
    */
    public List<BuildpackPropertiesResponse> buildpacks() {
        return this.buildpacks == null ? List.of() : this.buildpacks;
    }
    /**
     * Buildpack group name
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildpacksGroupPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BuildpackPropertiesResponse> buildpacks;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildpacksGroupPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildpacks = defaults.buildpacks;
    	      this.name = defaults.name;
        }

        public Builder buildpacks(@Nullable List<BuildpackPropertiesResponse> buildpacks) {
            this.buildpacks = buildpacks;
            return this;
        }
        public Builder buildpacks(BuildpackPropertiesResponse... buildpacks) {
            return buildpacks(List.of(buildpacks));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public BuildpacksGroupPropertiesResponse build() {
            return new BuildpacksGroupPropertiesResponse(buildpacks, name);
        }
    }
}
