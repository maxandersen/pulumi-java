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
 * &lt;see href=&#34;https://repo2docker.readthedocs.io/en/latest/specification.html&#34; /&gt;
 * 
 */
public final class EnvironmentSpecificationVersionResponse extends com.pulumi.resources.InvokeArgs {

    public static final EnvironmentSpecificationVersionResponse Empty = new EnvironmentSpecificationVersionResponse();

    /**
     * Standard configuration file used by Conda that lets you install any kind of package, including Python, R, and C/C++ packages.
     * &lt;see href=&#34;https://repo2docker.readthedocs.io/en/latest/config_files.html#environment-yml-install-a-conda-environment&#34; /&gt;
     * 
     */
    @Import(name="condaFile")
    private @Nullable String condaFile;

    public Optional<String> condaFile() {
        return Optional.ofNullable(this.condaFile);
    }

    /**
     * The asset description text.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Configuration settings for Docker.
     * 
     */
    @Import(name="docker")
    private @Nullable Either<DockerBuildResponse,DockerImageResponse> docker;

    public Optional<Either<DockerBuildResponse,DockerImageResponse>> docker() {
        return Optional.ofNullable(this.docker);
    }

    /**
     * Environment specification is either user managed or curated by the Azure ML service
     * &lt;see href=&#34;https://docs.microsoft.com/en-us/azure/machine-learning/resource-curated-environments&#34; /&gt;
     * 
     */
    @Import(name="environmentSpecificationType", required=true)
    private String environmentSpecificationType;

    public String environmentSpecificationType() {
        return this.environmentSpecificationType;
    }

    /**
     * Defines configuration specific to inference.
     * 
     */
    @Import(name="inferenceContainerProperties")
    private @Nullable InferenceContainerPropertiesResponse inferenceContainerProperties;

    public Optional<InferenceContainerPropertiesResponse> inferenceContainerProperties() {
        return Optional.ofNullable(this.inferenceContainerProperties);
    }

    /**
     * If the name version are system generated (anonymous registration).
     * 
     */
    @Import(name="isAnonymous")
    private @Nullable Boolean isAnonymous;

    public Optional<Boolean> isAnonymous() {
        return Optional.ofNullable(this.isAnonymous);
    }

    /**
     * The asset property dictionary.
     * 
     */
    @Import(name="properties")
    private @Nullable Map<String,String> properties;

    public Optional<Map<String,String>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private EnvironmentSpecificationVersionResponse() {}

    private EnvironmentSpecificationVersionResponse(EnvironmentSpecificationVersionResponse $) {
        this.condaFile = $.condaFile;
        this.description = $.description;
        this.docker = $.docker;
        this.environmentSpecificationType = $.environmentSpecificationType;
        this.inferenceContainerProperties = $.inferenceContainerProperties;
        this.isAnonymous = $.isAnonymous;
        this.properties = $.properties;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentSpecificationVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentSpecificationVersionResponse $;

        public Builder() {
            $ = new EnvironmentSpecificationVersionResponse();
        }

        public Builder(EnvironmentSpecificationVersionResponse defaults) {
            $ = new EnvironmentSpecificationVersionResponse(Objects.requireNonNull(defaults));
        }

        public Builder condaFile(@Nullable String condaFile) {
            $.condaFile = condaFile;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder docker(@Nullable Either<DockerBuildResponse,DockerImageResponse> docker) {
            $.docker = docker;
            return this;
        }

        public Builder environmentSpecificationType(String environmentSpecificationType) {
            $.environmentSpecificationType = environmentSpecificationType;
            return this;
        }

        public Builder inferenceContainerProperties(@Nullable InferenceContainerPropertiesResponse inferenceContainerProperties) {
            $.inferenceContainerProperties = inferenceContainerProperties;
            return this;
        }

        public Builder isAnonymous(@Nullable Boolean isAnonymous) {
            $.isAnonymous = isAnonymous;
            return this;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            $.properties = properties;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public EnvironmentSpecificationVersionResponse build() {
            $.environmentSpecificationType = Objects.requireNonNull($.environmentSpecificationType, "expected parameter 'environmentSpecificationType' to be non-null");
            return $;
        }
    }

}
