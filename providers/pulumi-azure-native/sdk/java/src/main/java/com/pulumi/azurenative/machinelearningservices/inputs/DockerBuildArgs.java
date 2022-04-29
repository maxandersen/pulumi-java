// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.DockerImagePlatformArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to represent configuration settings for Docker Build
 * 
 */
public final class DockerBuildArgs extends ResourceArgs {

    public static final DockerBuildArgs Empty = new DockerBuildArgs();

    /**
     * Path to a snapshot of the Docker Context. This property is only valid if Dockerfile is specified.
     * The path is relative to the asset path which must contain a single Blob URI value.
     * &lt;seealso href=&#34;https://docs.docker.com/engine/context/working-with-contexts/&#34; /&gt;
     * 
     */
    @Import(name="context")
    private @Nullable Output<String> context;

    /**
     * @return Path to a snapshot of the Docker Context. This property is only valid if Dockerfile is specified.
     * The path is relative to the asset path which must contain a single Blob URI value.
     * &lt;seealso href=&#34;https://docs.docker.com/engine/context/working-with-contexts/&#34; /&gt;
     * 
     */
    public Optional<Output<String>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * Enum to determine docker specification type. Must be either Build or Image.
     * Expected value is &#39;Build&#39;.
     * 
     */
    @Import(name="dockerSpecificationType", required=true)
    private Output<String> dockerSpecificationType;

    /**
     * @return Enum to determine docker specification type. Must be either Build or Image.
     * Expected value is &#39;Build&#39;.
     * 
     */
    public Output<String> dockerSpecificationType() {
        return this.dockerSpecificationType;
    }

    /**
     * Docker command line instructions to assemble an image.
     * &lt;seealso href=&#34;https://repo2docker.readthedocs.io/en/latest/config_files.html#dockerfile-advanced-environments&#34; /&gt;
     * 
     */
    @Import(name="dockerfile", required=true)
    private Output<String> dockerfile;

    /**
     * @return Docker command line instructions to assemble an image.
     * &lt;seealso href=&#34;https://repo2docker.readthedocs.io/en/latest/config_files.html#dockerfile-advanced-environments&#34; /&gt;
     * 
     */
    public Output<String> dockerfile() {
        return this.dockerfile;
    }

    /**
     * The platform information of the docker image.
     * 
     */
    @Import(name="platform")
    private @Nullable Output<DockerImagePlatformArgs> platform;

    /**
     * @return The platform information of the docker image.
     * 
     */
    public Optional<Output<DockerImagePlatformArgs>> platform() {
        return Optional.ofNullable(this.platform);
    }

    private DockerBuildArgs() {}

    private DockerBuildArgs(DockerBuildArgs $) {
        this.context = $.context;
        this.dockerSpecificationType = $.dockerSpecificationType;
        this.dockerfile = $.dockerfile;
        this.platform = $.platform;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DockerBuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DockerBuildArgs $;

        public Builder() {
            $ = new DockerBuildArgs();
        }

        public Builder(DockerBuildArgs defaults) {
            $ = new DockerBuildArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param context Path to a snapshot of the Docker Context. This property is only valid if Dockerfile is specified.
         * The path is relative to the asset path which must contain a single Blob URI value.
         * &lt;seealso href=&#34;https://docs.docker.com/engine/context/working-with-contexts/&#34; /&gt;
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<String> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context Path to a snapshot of the Docker Context. This property is only valid if Dockerfile is specified.
         * The path is relative to the asset path which must contain a single Blob URI value.
         * &lt;seealso href=&#34;https://docs.docker.com/engine/context/working-with-contexts/&#34; /&gt;
         * 
         * @return builder
         * 
         */
        public Builder context(String context) {
            return context(Output.of(context));
        }

        /**
         * @param dockerSpecificationType Enum to determine docker specification type. Must be either Build or Image.
         * Expected value is &#39;Build&#39;.
         * 
         * @return builder
         * 
         */
        public Builder dockerSpecificationType(Output<String> dockerSpecificationType) {
            $.dockerSpecificationType = dockerSpecificationType;
            return this;
        }

        /**
         * @param dockerSpecificationType Enum to determine docker specification type. Must be either Build or Image.
         * Expected value is &#39;Build&#39;.
         * 
         * @return builder
         * 
         */
        public Builder dockerSpecificationType(String dockerSpecificationType) {
            return dockerSpecificationType(Output.of(dockerSpecificationType));
        }

        /**
         * @param dockerfile Docker command line instructions to assemble an image.
         * &lt;seealso href=&#34;https://repo2docker.readthedocs.io/en/latest/config_files.html#dockerfile-advanced-environments&#34; /&gt;
         * 
         * @return builder
         * 
         */
        public Builder dockerfile(Output<String> dockerfile) {
            $.dockerfile = dockerfile;
            return this;
        }

        /**
         * @param dockerfile Docker command line instructions to assemble an image.
         * &lt;seealso href=&#34;https://repo2docker.readthedocs.io/en/latest/config_files.html#dockerfile-advanced-environments&#34; /&gt;
         * 
         * @return builder
         * 
         */
        public Builder dockerfile(String dockerfile) {
            return dockerfile(Output.of(dockerfile));
        }

        /**
         * @param platform The platform information of the docker image.
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<DockerImagePlatformArgs> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform The platform information of the docker image.
         * 
         * @return builder
         * 
         */
        public Builder platform(DockerImagePlatformArgs platform) {
            return platform(Output.of(platform));
        }

        public DockerBuildArgs build() {
            $.dockerSpecificationType = Codegen.stringProp("dockerSpecificationType").output().arg($.dockerSpecificationType).require();
            $.dockerfile = Objects.requireNonNull($.dockerfile, "expected parameter 'dockerfile' to be non-null");
            return $;
        }
    }

}
