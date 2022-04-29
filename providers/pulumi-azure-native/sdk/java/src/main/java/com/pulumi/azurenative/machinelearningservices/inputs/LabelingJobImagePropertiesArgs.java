// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.enums.ImageAnnotationType;
import com.pulumi.azurenative.machinelearningservices.enums.MediaType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LabelingJobImagePropertiesArgs extends ResourceArgs {

    public static final LabelingJobImagePropertiesArgs Empty = new LabelingJobImagePropertiesArgs();

    /**
     * Annotation type of image labeling tasks.
     * 
     */
    @Import(name="annotationType")
    private @Nullable Output<Either<String,ImageAnnotationType>> annotationType;

    /**
     * @return Annotation type of image labeling tasks.
     * 
     */
    public Optional<Output<Either<String,ImageAnnotationType>>> annotationType() {
        return Optional.ofNullable(this.annotationType);
    }

    /**
     * Media type of data asset.
     * 
     */
    @Import(name="mediaType", required=true)
    private Output<Either<String,MediaType>> mediaType;

    /**
     * @return Media type of data asset.
     * 
     */
    public Output<Either<String,MediaType>> mediaType() {
        return this.mediaType;
    }

    private LabelingJobImagePropertiesArgs() {}

    private LabelingJobImagePropertiesArgs(LabelingJobImagePropertiesArgs $) {
        this.annotationType = $.annotationType;
        this.mediaType = $.mediaType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabelingJobImagePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabelingJobImagePropertiesArgs $;

        public Builder() {
            $ = new LabelingJobImagePropertiesArgs();
        }

        public Builder(LabelingJobImagePropertiesArgs defaults) {
            $ = new LabelingJobImagePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotationType Annotation type of image labeling tasks.
         * 
         * @return builder
         * 
         */
        public Builder annotationType(@Nullable Output<Either<String,ImageAnnotationType>> annotationType) {
            $.annotationType = annotationType;
            return this;
        }

        /**
         * @param annotationType Annotation type of image labeling tasks.
         * 
         * @return builder
         * 
         */
        public Builder annotationType(Either<String,ImageAnnotationType> annotationType) {
            return annotationType(Output.of(annotationType));
        }

        /**
         * @param annotationType Annotation type of image labeling tasks.
         * 
         * @return builder
         * 
         */
        public Builder annotationType(String annotationType) {
            return annotationType(Either.ofLeft(annotationType));
        }

        /**
         * @param annotationType Annotation type of image labeling tasks.
         * 
         * @return builder
         * 
         */
        public Builder annotationType(ImageAnnotationType annotationType) {
            return annotationType(Either.ofRight(annotationType));
        }

        /**
         * @param mediaType Media type of data asset.
         * 
         * @return builder
         * 
         */
        public Builder mediaType(Output<Either<String,MediaType>> mediaType) {
            $.mediaType = mediaType;
            return this;
        }

        /**
         * @param mediaType Media type of data asset.
         * 
         * @return builder
         * 
         */
        public Builder mediaType(Either<String,MediaType> mediaType) {
            return mediaType(Output.of(mediaType));
        }

        /**
         * @param mediaType Media type of data asset.
         * 
         * @return builder
         * 
         */
        public Builder mediaType(String mediaType) {
            return mediaType(Either.ofLeft(mediaType));
        }

        /**
         * @param mediaType Media type of data asset.
         * 
         * @return builder
         * 
         */
        public Builder mediaType(MediaType mediaType) {
            return mediaType(Either.ofRight(mediaType));
        }

        public LabelingJobImagePropertiesArgs build() {
            $.mediaType = Objects.requireNonNull($.mediaType, "expected parameter 'mediaType' to be non-null");
            return $;
        }
    }

}
