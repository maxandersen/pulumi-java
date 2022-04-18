// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StaticSiteBuildPropertiesResponse {
    /**
     * A custom command to run during deployment of the Azure Functions API application.
     * 
     */
    private final @Nullable String apiBuildCommand;
    /**
     * The path to the api code within the repository.
     * 
     */
    private final @Nullable String apiLocation;
    /**
     * Deprecated: The path of the app artifacts after building (deprecated in favor of OutputLocation)
     * 
     */
    private final @Nullable String appArtifactLocation;
    /**
     * A custom command to run during deployment of the static content application.
     * 
     */
    private final @Nullable String appBuildCommand;
    /**
     * The path to the app code within the repository.
     * 
     */
    private final @Nullable String appLocation;
    /**
     * Github Action secret name override.
     * 
     */
    private final @Nullable String githubActionSecretNameOverride;
    /**
     * The output path of the app after building.
     * 
     */
    private final @Nullable String outputLocation;
    /**
     * Skip Github Action workflow generation.
     * 
     */
    private final @Nullable Boolean skipGithubActionWorkflowGeneration;

    @CustomType.Constructor
    private StaticSiteBuildPropertiesResponse(
        @CustomType.Parameter("apiBuildCommand") @Nullable String apiBuildCommand,
        @CustomType.Parameter("apiLocation") @Nullable String apiLocation,
        @CustomType.Parameter("appArtifactLocation") @Nullable String appArtifactLocation,
        @CustomType.Parameter("appBuildCommand") @Nullable String appBuildCommand,
        @CustomType.Parameter("appLocation") @Nullable String appLocation,
        @CustomType.Parameter("githubActionSecretNameOverride") @Nullable String githubActionSecretNameOverride,
        @CustomType.Parameter("outputLocation") @Nullable String outputLocation,
        @CustomType.Parameter("skipGithubActionWorkflowGeneration") @Nullable Boolean skipGithubActionWorkflowGeneration) {
        this.apiBuildCommand = apiBuildCommand;
        this.apiLocation = apiLocation;
        this.appArtifactLocation = appArtifactLocation;
        this.appBuildCommand = appBuildCommand;
        this.appLocation = appLocation;
        this.githubActionSecretNameOverride = githubActionSecretNameOverride;
        this.outputLocation = outputLocation;
        this.skipGithubActionWorkflowGeneration = skipGithubActionWorkflowGeneration;
    }

    /**
     * A custom command to run during deployment of the Azure Functions API application.
     * 
    */
    public Optional<String> apiBuildCommand() {
        return Optional.ofNullable(this.apiBuildCommand);
    }
    /**
     * The path to the api code within the repository.
     * 
    */
    public Optional<String> apiLocation() {
        return Optional.ofNullable(this.apiLocation);
    }
    /**
     * Deprecated: The path of the app artifacts after building (deprecated in favor of OutputLocation)
     * 
    */
    public Optional<String> appArtifactLocation() {
        return Optional.ofNullable(this.appArtifactLocation);
    }
    /**
     * A custom command to run during deployment of the static content application.
     * 
    */
    public Optional<String> appBuildCommand() {
        return Optional.ofNullable(this.appBuildCommand);
    }
    /**
     * The path to the app code within the repository.
     * 
    */
    public Optional<String> appLocation() {
        return Optional.ofNullable(this.appLocation);
    }
    /**
     * Github Action secret name override.
     * 
    */
    public Optional<String> githubActionSecretNameOverride() {
        return Optional.ofNullable(this.githubActionSecretNameOverride);
    }
    /**
     * The output path of the app after building.
     * 
    */
    public Optional<String> outputLocation() {
        return Optional.ofNullable(this.outputLocation);
    }
    /**
     * Skip Github Action workflow generation.
     * 
    */
    public Optional<Boolean> skipGithubActionWorkflowGeneration() {
        return Optional.ofNullable(this.skipGithubActionWorkflowGeneration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticSiteBuildPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiBuildCommand;
        private @Nullable String apiLocation;
        private @Nullable String appArtifactLocation;
        private @Nullable String appBuildCommand;
        private @Nullable String appLocation;
        private @Nullable String githubActionSecretNameOverride;
        private @Nullable String outputLocation;
        private @Nullable Boolean skipGithubActionWorkflowGeneration;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticSiteBuildPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiBuildCommand = defaults.apiBuildCommand;
    	      this.apiLocation = defaults.apiLocation;
    	      this.appArtifactLocation = defaults.appArtifactLocation;
    	      this.appBuildCommand = defaults.appBuildCommand;
    	      this.appLocation = defaults.appLocation;
    	      this.githubActionSecretNameOverride = defaults.githubActionSecretNameOverride;
    	      this.outputLocation = defaults.outputLocation;
    	      this.skipGithubActionWorkflowGeneration = defaults.skipGithubActionWorkflowGeneration;
        }

        public Builder apiBuildCommand(@Nullable String apiBuildCommand) {
            this.apiBuildCommand = apiBuildCommand;
            return this;
        }
        public Builder apiLocation(@Nullable String apiLocation) {
            this.apiLocation = apiLocation;
            return this;
        }
        public Builder appArtifactLocation(@Nullable String appArtifactLocation) {
            this.appArtifactLocation = appArtifactLocation;
            return this;
        }
        public Builder appBuildCommand(@Nullable String appBuildCommand) {
            this.appBuildCommand = appBuildCommand;
            return this;
        }
        public Builder appLocation(@Nullable String appLocation) {
            this.appLocation = appLocation;
            return this;
        }
        public Builder githubActionSecretNameOverride(@Nullable String githubActionSecretNameOverride) {
            this.githubActionSecretNameOverride = githubActionSecretNameOverride;
            return this;
        }
        public Builder outputLocation(@Nullable String outputLocation) {
            this.outputLocation = outputLocation;
            return this;
        }
        public Builder skipGithubActionWorkflowGeneration(@Nullable Boolean skipGithubActionWorkflowGeneration) {
            this.skipGithubActionWorkflowGeneration = skipGithubActionWorkflowGeneration;
            return this;
        }        public StaticSiteBuildPropertiesResponse build() {
            return new StaticSiteBuildPropertiesResponse(apiBuildCommand, apiLocation, appArtifactLocation, appBuildCommand, appLocation, githubActionSecretNameOverride, outputLocation, skipGithubActionWorkflowGeneration);
        }
    }
}
