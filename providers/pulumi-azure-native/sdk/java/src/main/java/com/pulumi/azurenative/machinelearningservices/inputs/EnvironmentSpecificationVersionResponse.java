// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.DockerBuildResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.DockerImageResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.InferenceContainerPropertiesResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Environment specification version details.
 * <see href="https://repo2docker.readthedocs.io/en/latest/specification.html" />
 * 
 */
public final class EnvironmentSpecificationVersionResponse extends com.pulumi.resources.InvokeArgs {

    public static final EnvironmentSpecificationVersionResponse Empty = new EnvironmentSpecificationVersionResponse();

    /**
     * Standard configuration file used by Conda that lets you install any kind of package, including Python, R, and C/C++ packages.
     * <see href="https://repo2docker.readthedocs.io/en/latest/config_files.html#environment-yml-install-a-conda-environment" />
     * 
     */
    @Import(name="condaFile")
      private final @Nullable String condaFile;

    public Optional<String> condaFile() {
        return this.condaFile == null ? Optional.empty() : Optional.ofNullable(this.condaFile);
    }

    /**
     * The asset description text.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Configuration settings for Docker.
     * 
     */
    @Import(name="docker")
      private final @Nullable Either<DockerBuildResponse,DockerImageResponse> docker;

    public Either<DockerBuildResponse,DockerImageResponse> docker() {
        return this.docker == null ? null : this.docker;
    }

    /**
     * Environment specification is either user managed or curated by the Azure ML service
     * <see href="https://docs.microsoft.com/en-us/azure/machine-learning/resource-curated-environments" />
     * 
     */
    @Import(name="environmentSpecificationType", required=true)
      private final String environmentSpecificationType;

    public String environmentSpecificationType() {
        return this.environmentSpecificationType;
    }

    /**
     * Defines configuration specific to inference.
     * 
     */
    @Import(name="inferenceContainerProperties")
      private final @Nullable InferenceContainerPropertiesResponse inferenceContainerProperties;

    public Optional<InferenceContainerPropertiesResponse> inferenceContainerProperties() {
        return this.inferenceContainerProperties == null ? Optional.empty() : Optional.ofNullable(this.inferenceContainerProperties);
    }

    /**
     * If the name version are system generated (anonymous registration).
     * 
     */
    @Import(name="isAnonymous")
      private final @Nullable Boolean isAnonymous;

    public Optional<Boolean> isAnonymous() {
        return this.isAnonymous == null ? Optional.empty() : Optional.ofNullable(this.isAnonymous);
    }

    /**
     * The asset property dictionary.
     * 
     */
    @Import(name="properties")
      private final @Nullable Map<String,String> properties;

    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public EnvironmentSpecificationVersionResponse(
        @Nullable String condaFile,
        @Nullable String description,
        @Nullable Either<DockerBuildResponse,DockerImageResponse> docker,
        String environmentSpecificationType,
        @Nullable InferenceContainerPropertiesResponse inferenceContainerProperties,
        @Nullable Boolean isAnonymous,
        @Nullable Map<String,String> properties,
        @Nullable Map<String,String> tags) {
        this.condaFile = condaFile;
        this.description = description;
        this.docker = docker;
        this.environmentSpecificationType = Objects.requireNonNull(environmentSpecificationType, "expected parameter 'environmentSpecificationType' to be non-null");
        this.inferenceContainerProperties = inferenceContainerProperties;
        this.isAnonymous = isAnonymous;
        this.properties = properties;
        this.tags = tags;
    }

    private EnvironmentSpecificationVersionResponse() {
        this.condaFile = null;
        this.description = null;
        this.docker = null;
        this.environmentSpecificationType = null;
        this.inferenceContainerProperties = null;
        this.isAnonymous = null;
        this.properties = Map.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentSpecificationVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condaFile;
        private @Nullable String description;
        private @Nullable Either<DockerBuildResponse,DockerImageResponse> docker;
        private String environmentSpecificationType;
        private @Nullable InferenceContainerPropertiesResponse inferenceContainerProperties;
        private @Nullable Boolean isAnonymous;
        private @Nullable Map<String,String> properties;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentSpecificationVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condaFile = defaults.condaFile;
    	      this.description = defaults.description;
    	      this.docker = defaults.docker;
    	      this.environmentSpecificationType = defaults.environmentSpecificationType;
    	      this.inferenceContainerProperties = defaults.inferenceContainerProperties;
    	      this.isAnonymous = defaults.isAnonymous;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder condaFile(@Nullable String condaFile) {
            this.condaFile = condaFile;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder docker(@Nullable Either<DockerBuildResponse,DockerImageResponse> docker) {
            this.docker = docker;
            return this;
        }
        public Builder environmentSpecificationType(String environmentSpecificationType) {
            this.environmentSpecificationType = Objects.requireNonNull(environmentSpecificationType);
            return this;
        }
        public Builder inferenceContainerProperties(@Nullable InferenceContainerPropertiesResponse inferenceContainerProperties) {
            this.inferenceContainerProperties = inferenceContainerProperties;
            return this;
        }
        public Builder isAnonymous(@Nullable Boolean isAnonymous) {
            this.isAnonymous = isAnonymous;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public EnvironmentSpecificationVersionResponse build() {
            return new EnvironmentSpecificationVersionResponse(condaFile, description, docker, environmentSpecificationType, inferenceContainerProperties, isAnonymous, properties, tags);
        }
    }
}
