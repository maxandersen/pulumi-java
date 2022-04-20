// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.DockerBuildArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.DockerImageArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.InferenceContainerPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Environment specification version details.
 * &lt;see href=&#34;https://repo2docker.readthedocs.io/en/latest/specification.html&#34; /&gt;
 * 
 */
public final class EnvironmentSpecificationVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentSpecificationVersionArgs Empty = new EnvironmentSpecificationVersionArgs();

    /**
     * Standard configuration file used by Conda that lets you install any kind of package, including Python, R, and C/C++ packages.
     * &lt;see href=&#34;https://repo2docker.readthedocs.io/en/latest/config_files.html#environment-yml-install-a-conda-environment&#34; /&gt;
     * 
     */
    @Import(name="condaFile")
      private final @Nullable Output<String> condaFile;

    public Output<String> condaFile() {
        return this.condaFile == null ? Codegen.empty() : this.condaFile;
    }

    /**
     * The asset description text.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Configuration settings for Docker.
     * 
     */
    @Import(name="docker")
      private final @Nullable Output<Either<DockerBuildArgs,DockerImageArgs>> docker;

    public Output<Either<DockerBuildArgs,DockerImageArgs>> docker() {
        return this.docker == null ? Codegen.empty() : this.docker;
    }

    /**
     * Defines configuration specific to inference.
     * 
     */
    @Import(name="inferenceContainerProperties")
      private final @Nullable Output<InferenceContainerPropertiesArgs> inferenceContainerProperties;

    public Output<InferenceContainerPropertiesArgs> inferenceContainerProperties() {
        return this.inferenceContainerProperties == null ? Codegen.empty() : this.inferenceContainerProperties;
    }

    /**
     * If the name version are system generated (anonymous registration).
     * 
     */
    @Import(name="isAnonymous")
      private final @Nullable Output<Boolean> isAnonymous;

    public Output<Boolean> isAnonymous() {
        return this.isAnonymous == null ? Codegen.empty() : this.isAnonymous;
    }

    /**
     * The asset property dictionary.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public EnvironmentSpecificationVersionArgs(
        @Nullable Output<String> condaFile,
        @Nullable Output<String> description,
        @Nullable Output<Either<DockerBuildArgs,DockerImageArgs>> docker,
        @Nullable Output<InferenceContainerPropertiesArgs> inferenceContainerProperties,
        @Nullable Output<Boolean> isAnonymous,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<Map<String,String>> tags) {
        this.condaFile = condaFile;
        this.description = description;
        this.docker = docker;
        this.inferenceContainerProperties = inferenceContainerProperties;
        this.isAnonymous = isAnonymous;
        this.properties = properties;
        this.tags = tags;
    }

    private EnvironmentSpecificationVersionArgs() {
        this.condaFile = Codegen.empty();
        this.description = Codegen.empty();
        this.docker = Codegen.empty();
        this.inferenceContainerProperties = Codegen.empty();
        this.isAnonymous = Codegen.empty();
        this.properties = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentSpecificationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> condaFile;
        private @Nullable Output<String> description;
        private @Nullable Output<Either<DockerBuildArgs,DockerImageArgs>> docker;
        private @Nullable Output<InferenceContainerPropertiesArgs> inferenceContainerProperties;
        private @Nullable Output<Boolean> isAnonymous;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentSpecificationVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condaFile = defaults.condaFile;
    	      this.description = defaults.description;
    	      this.docker = defaults.docker;
    	      this.inferenceContainerProperties = defaults.inferenceContainerProperties;
    	      this.isAnonymous = defaults.isAnonymous;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder condaFile(@Nullable Output<String> condaFile) {
            this.condaFile = condaFile;
            return this;
        }
        public Builder condaFile(@Nullable String condaFile) {
            this.condaFile = Codegen.ofNullable(condaFile);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder docker(@Nullable Output<Either<DockerBuildArgs,DockerImageArgs>> docker) {
            this.docker = docker;
            return this;
        }
        public Builder docker(@Nullable Either<DockerBuildArgs,DockerImageArgs> docker) {
            this.docker = Codegen.ofNullable(docker);
            return this;
        }
        public Builder inferenceContainerProperties(@Nullable Output<InferenceContainerPropertiesArgs> inferenceContainerProperties) {
            this.inferenceContainerProperties = inferenceContainerProperties;
            return this;
        }
        public Builder inferenceContainerProperties(@Nullable InferenceContainerPropertiesArgs inferenceContainerProperties) {
            this.inferenceContainerProperties = Codegen.ofNullable(inferenceContainerProperties);
            return this;
        }
        public Builder isAnonymous(@Nullable Output<Boolean> isAnonymous) {
            this.isAnonymous = isAnonymous;
            return this;
        }
        public Builder isAnonymous(@Nullable Boolean isAnonymous) {
            this.isAnonymous = Codegen.ofNullable(isAnonymous);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public EnvironmentSpecificationVersionArgs build() {
            return new EnvironmentSpecificationVersionArgs(condaFile, description, docker, inferenceContainerProperties, isAnonymous, properties, tags);
        }
    }
}
