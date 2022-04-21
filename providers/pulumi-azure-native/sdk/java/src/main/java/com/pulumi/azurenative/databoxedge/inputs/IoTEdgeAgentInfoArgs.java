// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.azurenative.databoxedge.inputs.ImageRepositoryCredentialArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IoT edge agent details is optional, this will be used for download system Agent module while bootstrapping IoT Role if specified.
 * 
 */
public final class IoTEdgeAgentInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final IoTEdgeAgentInfoArgs Empty = new IoTEdgeAgentInfoArgs();

    /**
     * Name of the IoT edge agent image.
     * 
     */
    @Import(name="imageName", required=true)
    private Output<String> imageName;

    public Output<String> imageName() {
        return this.imageName;
    }

    /**
     * Image repository details.
     * 
     */
    @Import(name="imageRepository")
    private @Nullable Output<ImageRepositoryCredentialArgs> imageRepository;

    public Optional<Output<ImageRepositoryCredentialArgs>> imageRepository() {
        return Optional.ofNullable(this.imageRepository);
    }

    /**
     * Image Tag.
     * 
     */
    @Import(name="tag", required=true)
    private Output<String> tag;

    public Output<String> tag() {
        return this.tag;
    }

    private IoTEdgeAgentInfoArgs() {}

    private IoTEdgeAgentInfoArgs(IoTEdgeAgentInfoArgs $) {
        this.imageName = $.imageName;
        this.imageRepository = $.imageRepository;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IoTEdgeAgentInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IoTEdgeAgentInfoArgs $;

        public Builder() {
            $ = new IoTEdgeAgentInfoArgs();
        }

        public Builder(IoTEdgeAgentInfoArgs defaults) {
            $ = new IoTEdgeAgentInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder imageName(Output<String> imageName) {
            $.imageName = imageName;
            return this;
        }

        public Builder imageName(String imageName) {
            return imageName(Output.of(imageName));
        }

        public Builder imageRepository(@Nullable Output<ImageRepositoryCredentialArgs> imageRepository) {
            $.imageRepository = imageRepository;
            return this;
        }

        public Builder imageRepository(ImageRepositoryCredentialArgs imageRepository) {
            return imageRepository(Output.of(imageRepository));
        }

        public Builder tag(Output<String> tag) {
            $.tag = tag;
            return this;
        }

        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        public IoTEdgeAgentInfoArgs build() {
            $.imageName = Objects.requireNonNull($.imageName, "expected parameter 'imageName' to be non-null");
            $.tag = Objects.requireNonNull($.tag, "expected parameter 'tag' to be non-null");
            return $;
        }
    }

}
