// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImageArgs Empty = new GetImageArgs();

    /**
     * The sha256 digest of the image manifest. At least one of `image_digest` or `image_tag` must be specified.
     * 
     */
    @Import(name="imageDigest")
    private @Nullable String imageDigest;

    /**
     * @return The sha256 digest of the image manifest. At least one of `image_digest` or `image_tag` must be specified.
     * 
     */
    public Optional<String> imageDigest() {
        return Optional.ofNullable(this.imageDigest);
    }

    /**
     * The tag associated with this image. At least one of `image_digest` or `image_tag` must be specified.
     * 
     */
    @Import(name="imageTag")
    private @Nullable String imageTag;

    /**
     * @return The tag associated with this image. At least one of `image_digest` or `image_tag` must be specified.
     * 
     */
    public Optional<String> imageTag() {
        return Optional.ofNullable(this.imageTag);
    }

    /**
     * The ID of the Registry where the repository resides.
     * 
     */
    @Import(name="registryId")
    private @Nullable String registryId;

    /**
     * @return The ID of the Registry where the repository resides.
     * 
     */
    public Optional<String> registryId() {
        return Optional.ofNullable(this.registryId);
    }

    /**
     * The name of the ECR Repository.
     * 
     */
    @Import(name="repositoryName", required=true)
    private String repositoryName;

    /**
     * @return The name of the ECR Repository.
     * 
     */
    public String repositoryName() {
        return this.repositoryName;
    }

    private GetImageArgs() {}

    private GetImageArgs(GetImageArgs $) {
        this.imageDigest = $.imageDigest;
        this.imageTag = $.imageTag;
        this.registryId = $.registryId;
        this.repositoryName = $.repositoryName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageArgs $;

        public Builder() {
            $ = new GetImageArgs();
        }

        public Builder(GetImageArgs defaults) {
            $ = new GetImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageDigest The sha256 digest of the image manifest. At least one of `image_digest` or `image_tag` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder imageDigest(@Nullable String imageDigest) {
            $.imageDigest = imageDigest;
            return this;
        }

        /**
         * @param imageTag The tag associated with this image. At least one of `image_digest` or `image_tag` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder imageTag(@Nullable String imageTag) {
            $.imageTag = imageTag;
            return this;
        }

        /**
         * @param registryId The ID of the Registry where the repository resides.
         * 
         * @return builder
         * 
         */
        public Builder registryId(@Nullable String registryId) {
            $.registryId = registryId;
            return this;
        }

        /**
         * @param repositoryName The name of the ECR Repository.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(String repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        public GetImageArgs build() {
            $.repositoryName = Objects.requireNonNull($.repositoryName, "expected parameter 'repositoryName' to be non-null");
            return $;
        }
    }

}
