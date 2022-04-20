// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder;

import com.pulumi.awsnative.imagebuilder.enums.ContainerRecipeContainerType;
import com.pulumi.awsnative.imagebuilder.enums.ContainerRecipePlatformOverride;
import com.pulumi.awsnative.imagebuilder.inputs.ContainerRecipeComponentConfigurationArgs;
import com.pulumi.awsnative.imagebuilder.inputs.ContainerRecipeInstanceConfigurationArgs;
import com.pulumi.awsnative.imagebuilder.inputs.ContainerRecipeTargetContainerRepositoryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerRecipeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerRecipeArgs Empty = new ContainerRecipeArgs();

    /**
     * Components for build and test that are included in the container recipe.
     * 
     */
    @Import(name="components")
      private final @Nullable Output<List<ContainerRecipeComponentConfigurationArgs>> components;

    public Output<List<ContainerRecipeComponentConfigurationArgs>> components() {
        return this.components == null ? Codegen.empty() : this.components;
    }

    /**
     * Specifies the type of container, such as Docker.
     * 
     */
    @Import(name="containerType")
      private final @Nullable Output<ContainerRecipeContainerType> containerType;

    public Output<ContainerRecipeContainerType> containerType() {
        return this.containerType == null ? Codegen.empty() : this.containerType;
    }

    /**
     * The description of the container recipe.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Dockerfiles are text documents that are used to build Docker containers, and ensure that they contain all of the elements required by the application running inside. The template data consists of contextual variables where Image Builder places build information or scripts, based on your container image recipe.
     * 
     */
    @Import(name="dockerfileTemplateData")
      private final @Nullable Output<String> dockerfileTemplateData;

    public Output<String> dockerfileTemplateData() {
        return this.dockerfileTemplateData == null ? Codegen.empty() : this.dockerfileTemplateData;
    }

    /**
     * The S3 URI for the Dockerfile that will be used to build your container image.
     * 
     */
    @Import(name="dockerfileTemplateUri")
      private final @Nullable Output<String> dockerfileTemplateUri;

    public Output<String> dockerfileTemplateUri() {
        return this.dockerfileTemplateUri == null ? Codegen.empty() : this.dockerfileTemplateUri;
    }

    /**
     * Specifies the operating system version for the source image.
     * 
     */
    @Import(name="imageOsVersionOverride")
      private final @Nullable Output<String> imageOsVersionOverride;

    public Output<String> imageOsVersionOverride() {
        return this.imageOsVersionOverride == null ? Codegen.empty() : this.imageOsVersionOverride;
    }

    /**
     * A group of options that can be used to configure an instance for building and testing container images.
     * 
     */
    @Import(name="instanceConfiguration")
      private final @Nullable Output<ContainerRecipeInstanceConfigurationArgs> instanceConfiguration;

    public Output<ContainerRecipeInstanceConfigurationArgs> instanceConfiguration() {
        return this.instanceConfiguration == null ? Codegen.empty() : this.instanceConfiguration;
    }

    /**
     * Identifies which KMS key is used to encrypt the container image.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> kmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    /**
     * The name of the container recipe.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The source image for the container recipe.
     * 
     */
    @Import(name="parentImage")
      private final @Nullable Output<String> parentImage;

    public Output<String> parentImage() {
        return this.parentImage == null ? Codegen.empty() : this.parentImage;
    }

    /**
     * Specifies the operating system platform when you use a custom source image.
     * 
     */
    @Import(name="platformOverride")
      private final @Nullable Output<ContainerRecipePlatformOverride> platformOverride;

    public Output<ContainerRecipePlatformOverride> platformOverride() {
        return this.platformOverride == null ? Codegen.empty() : this.platformOverride;
    }

    /**
     * Tags that are attached to the container recipe.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Object> tags;

    public Output<Object> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The destination repository for the container image.
     * 
     */
    @Import(name="targetRepository")
      private final @Nullable Output<ContainerRecipeTargetContainerRepositoryArgs> targetRepository;

    public Output<ContainerRecipeTargetContainerRepositoryArgs> targetRepository() {
        return this.targetRepository == null ? Codegen.empty() : this.targetRepository;
    }

    /**
     * The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    /**
     * The working directory to be used during build and test workflows.
     * 
     */
    @Import(name="workingDirectory")
      private final @Nullable Output<String> workingDirectory;

    public Output<String> workingDirectory() {
        return this.workingDirectory == null ? Codegen.empty() : this.workingDirectory;
    }

    public ContainerRecipeArgs(
        @Nullable Output<List<ContainerRecipeComponentConfigurationArgs>> components,
        @Nullable Output<ContainerRecipeContainerType> containerType,
        @Nullable Output<String> description,
        @Nullable Output<String> dockerfileTemplateData,
        @Nullable Output<String> dockerfileTemplateUri,
        @Nullable Output<String> imageOsVersionOverride,
        @Nullable Output<ContainerRecipeInstanceConfigurationArgs> instanceConfiguration,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> name,
        @Nullable Output<String> parentImage,
        @Nullable Output<ContainerRecipePlatformOverride> platformOverride,
        @Nullable Output<Object> tags,
        @Nullable Output<ContainerRecipeTargetContainerRepositoryArgs> targetRepository,
        @Nullable Output<String> version,
        @Nullable Output<String> workingDirectory) {
        this.components = components;
        this.containerType = containerType;
        this.description = description;
        this.dockerfileTemplateData = dockerfileTemplateData;
        this.dockerfileTemplateUri = dockerfileTemplateUri;
        this.imageOsVersionOverride = imageOsVersionOverride;
        this.instanceConfiguration = instanceConfiguration;
        this.kmsKeyId = kmsKeyId;
        this.name = name;
        this.parentImage = parentImage;
        this.platformOverride = platformOverride;
        this.tags = tags;
        this.targetRepository = targetRepository;
        this.version = version;
        this.workingDirectory = workingDirectory;
    }

    private ContainerRecipeArgs() {
        this.components = Codegen.empty();
        this.containerType = Codegen.empty();
        this.description = Codegen.empty();
        this.dockerfileTemplateData = Codegen.empty();
        this.dockerfileTemplateUri = Codegen.empty();
        this.imageOsVersionOverride = Codegen.empty();
        this.instanceConfiguration = Codegen.empty();
        this.kmsKeyId = Codegen.empty();
        this.name = Codegen.empty();
        this.parentImage = Codegen.empty();
        this.platformOverride = Codegen.empty();
        this.tags = Codegen.empty();
        this.targetRepository = Codegen.empty();
        this.version = Codegen.empty();
        this.workingDirectory = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ContainerRecipeComponentConfigurationArgs>> components;
        private @Nullable Output<ContainerRecipeContainerType> containerType;
        private @Nullable Output<String> description;
        private @Nullable Output<String> dockerfileTemplateData;
        private @Nullable Output<String> dockerfileTemplateUri;
        private @Nullable Output<String> imageOsVersionOverride;
        private @Nullable Output<ContainerRecipeInstanceConfigurationArgs> instanceConfiguration;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parentImage;
        private @Nullable Output<ContainerRecipePlatformOverride> platformOverride;
        private @Nullable Output<Object> tags;
        private @Nullable Output<ContainerRecipeTargetContainerRepositoryArgs> targetRepository;
        private @Nullable Output<String> version;
        private @Nullable Output<String> workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.components = defaults.components;
    	      this.containerType = defaults.containerType;
    	      this.description = defaults.description;
    	      this.dockerfileTemplateData = defaults.dockerfileTemplateData;
    	      this.dockerfileTemplateUri = defaults.dockerfileTemplateUri;
    	      this.imageOsVersionOverride = defaults.imageOsVersionOverride;
    	      this.instanceConfiguration = defaults.instanceConfiguration;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.name = defaults.name;
    	      this.parentImage = defaults.parentImage;
    	      this.platformOverride = defaults.platformOverride;
    	      this.tags = defaults.tags;
    	      this.targetRepository = defaults.targetRepository;
    	      this.version = defaults.version;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder components(@Nullable Output<List<ContainerRecipeComponentConfigurationArgs>> components) {
            this.components = components;
            return this;
        }
        public Builder components(@Nullable List<ContainerRecipeComponentConfigurationArgs> components) {
            this.components = Codegen.ofNullable(components);
            return this;
        }
        public Builder components(ContainerRecipeComponentConfigurationArgs... components) {
            return components(List.of(components));
        }
        public Builder containerType(@Nullable Output<ContainerRecipeContainerType> containerType) {
            this.containerType = containerType;
            return this;
        }
        public Builder containerType(@Nullable ContainerRecipeContainerType containerType) {
            this.containerType = Codegen.ofNullable(containerType);
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
        public Builder dockerfileTemplateData(@Nullable Output<String> dockerfileTemplateData) {
            this.dockerfileTemplateData = dockerfileTemplateData;
            return this;
        }
        public Builder dockerfileTemplateData(@Nullable String dockerfileTemplateData) {
            this.dockerfileTemplateData = Codegen.ofNullable(dockerfileTemplateData);
            return this;
        }
        public Builder dockerfileTemplateUri(@Nullable Output<String> dockerfileTemplateUri) {
            this.dockerfileTemplateUri = dockerfileTemplateUri;
            return this;
        }
        public Builder dockerfileTemplateUri(@Nullable String dockerfileTemplateUri) {
            this.dockerfileTemplateUri = Codegen.ofNullable(dockerfileTemplateUri);
            return this;
        }
        public Builder imageOsVersionOverride(@Nullable Output<String> imageOsVersionOverride) {
            this.imageOsVersionOverride = imageOsVersionOverride;
            return this;
        }
        public Builder imageOsVersionOverride(@Nullable String imageOsVersionOverride) {
            this.imageOsVersionOverride = Codegen.ofNullable(imageOsVersionOverride);
            return this;
        }
        public Builder instanceConfiguration(@Nullable Output<ContainerRecipeInstanceConfigurationArgs> instanceConfiguration) {
            this.instanceConfiguration = instanceConfiguration;
            return this;
        }
        public Builder instanceConfiguration(@Nullable ContainerRecipeInstanceConfigurationArgs instanceConfiguration) {
            this.instanceConfiguration = Codegen.ofNullable(instanceConfiguration);
            return this;
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder parentImage(@Nullable Output<String> parentImage) {
            this.parentImage = parentImage;
            return this;
        }
        public Builder parentImage(@Nullable String parentImage) {
            this.parentImage = Codegen.ofNullable(parentImage);
            return this;
        }
        public Builder platformOverride(@Nullable Output<ContainerRecipePlatformOverride> platformOverride) {
            this.platformOverride = platformOverride;
            return this;
        }
        public Builder platformOverride(@Nullable ContainerRecipePlatformOverride platformOverride) {
            this.platformOverride = Codegen.ofNullable(platformOverride);
            return this;
        }
        public Builder tags(@Nullable Output<Object> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Object tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder targetRepository(@Nullable Output<ContainerRecipeTargetContainerRepositoryArgs> targetRepository) {
            this.targetRepository = targetRepository;
            return this;
        }
        public Builder targetRepository(@Nullable ContainerRecipeTargetContainerRepositoryArgs targetRepository) {
            this.targetRepository = Codegen.ofNullable(targetRepository);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }
        public Builder workingDirectory(@Nullable Output<String> workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }
        public Builder workingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = Codegen.ofNullable(workingDirectory);
            return this;
        }        public ContainerRecipeArgs build() {
            return new ContainerRecipeArgs(components, containerType, description, dockerfileTemplateData, dockerfileTemplateUri, imageOsVersionOverride, instanceConfiguration, kmsKeyId, name, parentImage, platformOverride, tags, targetRepository, version, workingDirectory);
        }
    }
}
