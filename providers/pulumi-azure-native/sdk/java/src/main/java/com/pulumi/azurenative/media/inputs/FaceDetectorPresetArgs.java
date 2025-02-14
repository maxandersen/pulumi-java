// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.AnalysisResolution;
import com.pulumi.azurenative.media.enums.BlurType;
import com.pulumi.azurenative.media.enums.FaceRedactorMode;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes all the settings to be used when analyzing a video in order to detect (and optionally redact) all the faces present.
 * 
 */
public final class FaceDetectorPresetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FaceDetectorPresetArgs Empty = new FaceDetectorPresetArgs();

    /**
     * Blur type
     * 
     */
    @Import(name="blurType")
    private @Nullable Output<Either<String,BlurType>> blurType;

    /**
     * @return Blur type
     * 
     */
    public Optional<Output<Either<String,BlurType>>> blurType() {
        return Optional.ofNullable(this.blurType);
    }

    /**
     * Dictionary containing key value pairs for parameters not exposed in the preset itself
     * 
     */
    @Import(name="experimentalOptions")
    private @Nullable Output<Map<String,String>> experimentalOptions;

    /**
     * @return Dictionary containing key value pairs for parameters not exposed in the preset itself
     * 
     */
    public Optional<Output<Map<String,String>>> experimentalOptions() {
        return Optional.ofNullable(this.experimentalOptions);
    }

    /**
     * This mode provides the ability to choose between the following settings: 1) Analyze - For detection only.This mode generates a metadata JSON file marking appearances of faces throughout the video.Where possible, appearances of the same person are assigned the same ID. 2) Combined - Additionally redacts(blurs) detected faces. 3) Redact - This enables a 2-pass process, allowing for selective redaction of a subset of detected faces.It takes in the metadata file from a prior analyze pass, along with the source video, and a user-selected subset of IDs that require redaction.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<Either<String,FaceRedactorMode>> mode;

    /**
     * @return This mode provides the ability to choose between the following settings: 1) Analyze - For detection only.This mode generates a metadata JSON file marking appearances of faces throughout the video.Where possible, appearances of the same person are assigned the same ID. 2) Combined - Additionally redacts(blurs) detected faces. 3) Redact - This enables a 2-pass process, allowing for selective redaction of a subset of detected faces.It takes in the metadata file from a prior analyze pass, along with the source video, and a user-selected subset of IDs that require redaction.
     * 
     */
    public Optional<Output<Either<String,FaceRedactorMode>>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.FaceDetectorPreset&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.FaceDetectorPreset&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * Specifies the maximum resolution at which your video is analyzed. The default behavior is &#34;SourceResolution,&#34; which will keep the input video at its original resolution when analyzed. Using &#34;StandardDefinition&#34; will resize input videos to standard definition while preserving the appropriate aspect ratio. It will only resize if the video is of higher resolution. For example, a 1920x1080 input would be scaled to 640x360 before processing. Switching to &#34;StandardDefinition&#34; will reduce the time it takes to process high resolution video. It may also reduce the cost of using this component (see https://azure.microsoft.com/en-us/pricing/details/media-services/#analytics for details). However, faces that end up being too small in the resized video may not be detected.
     * 
     */
    @Import(name="resolution")
    private @Nullable Output<Either<String,AnalysisResolution>> resolution;

    /**
     * @return Specifies the maximum resolution at which your video is analyzed. The default behavior is &#34;SourceResolution,&#34; which will keep the input video at its original resolution when analyzed. Using &#34;StandardDefinition&#34; will resize input videos to standard definition while preserving the appropriate aspect ratio. It will only resize if the video is of higher resolution. For example, a 1920x1080 input would be scaled to 640x360 before processing. Switching to &#34;StandardDefinition&#34; will reduce the time it takes to process high resolution video. It may also reduce the cost of using this component (see https://azure.microsoft.com/en-us/pricing/details/media-services/#analytics for details). However, faces that end up being too small in the resized video may not be detected.
     * 
     */
    public Optional<Output<Either<String,AnalysisResolution>>> resolution() {
        return Optional.ofNullable(this.resolution);
    }

    private FaceDetectorPresetArgs() {}

    private FaceDetectorPresetArgs(FaceDetectorPresetArgs $) {
        this.blurType = $.blurType;
        this.experimentalOptions = $.experimentalOptions;
        this.mode = $.mode;
        this.odataType = $.odataType;
        this.resolution = $.resolution;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FaceDetectorPresetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FaceDetectorPresetArgs $;

        public Builder() {
            $ = new FaceDetectorPresetArgs();
        }

        public Builder(FaceDetectorPresetArgs defaults) {
            $ = new FaceDetectorPresetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blurType Blur type
         * 
         * @return builder
         * 
         */
        public Builder blurType(@Nullable Output<Either<String,BlurType>> blurType) {
            $.blurType = blurType;
            return this;
        }

        /**
         * @param blurType Blur type
         * 
         * @return builder
         * 
         */
        public Builder blurType(Either<String,BlurType> blurType) {
            return blurType(Output.of(blurType));
        }

        /**
         * @param blurType Blur type
         * 
         * @return builder
         * 
         */
        public Builder blurType(String blurType) {
            return blurType(Either.ofLeft(blurType));
        }

        /**
         * @param blurType Blur type
         * 
         * @return builder
         * 
         */
        public Builder blurType(BlurType blurType) {
            return blurType(Either.ofRight(blurType));
        }

        /**
         * @param experimentalOptions Dictionary containing key value pairs for parameters not exposed in the preset itself
         * 
         * @return builder
         * 
         */
        public Builder experimentalOptions(@Nullable Output<Map<String,String>> experimentalOptions) {
            $.experimentalOptions = experimentalOptions;
            return this;
        }

        /**
         * @param experimentalOptions Dictionary containing key value pairs for parameters not exposed in the preset itself
         * 
         * @return builder
         * 
         */
        public Builder experimentalOptions(Map<String,String> experimentalOptions) {
            return experimentalOptions(Output.of(experimentalOptions));
        }

        /**
         * @param mode This mode provides the ability to choose between the following settings: 1) Analyze - For detection only.This mode generates a metadata JSON file marking appearances of faces throughout the video.Where possible, appearances of the same person are assigned the same ID. 2) Combined - Additionally redacts(blurs) detected faces. 3) Redact - This enables a 2-pass process, allowing for selective redaction of a subset of detected faces.It takes in the metadata file from a prior analyze pass, along with the source video, and a user-selected subset of IDs that require redaction.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<Either<String,FaceRedactorMode>> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode This mode provides the ability to choose between the following settings: 1) Analyze - For detection only.This mode generates a metadata JSON file marking appearances of faces throughout the video.Where possible, appearances of the same person are assigned the same ID. 2) Combined - Additionally redacts(blurs) detected faces. 3) Redact - This enables a 2-pass process, allowing for selective redaction of a subset of detected faces.It takes in the metadata file from a prior analyze pass, along with the source video, and a user-selected subset of IDs that require redaction.
         * 
         * @return builder
         * 
         */
        public Builder mode(Either<String,FaceRedactorMode> mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param mode This mode provides the ability to choose between the following settings: 1) Analyze - For detection only.This mode generates a metadata JSON file marking appearances of faces throughout the video.Where possible, appearances of the same person are assigned the same ID. 2) Combined - Additionally redacts(blurs) detected faces. 3) Redact - This enables a 2-pass process, allowing for selective redaction of a subset of detected faces.It takes in the metadata file from a prior analyze pass, along with the source video, and a user-selected subset of IDs that require redaction.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Either.ofLeft(mode));
        }

        /**
         * @param mode This mode provides the ability to choose between the following settings: 1) Analyze - For detection only.This mode generates a metadata JSON file marking appearances of faces throughout the video.Where possible, appearances of the same person are assigned the same ID. 2) Combined - Additionally redacts(blurs) detected faces. 3) Redact - This enables a 2-pass process, allowing for selective redaction of a subset of detected faces.It takes in the metadata file from a prior analyze pass, along with the source video, and a user-selected subset of IDs that require redaction.
         * 
         * @return builder
         * 
         */
        public Builder mode(FaceRedactorMode mode) {
            return mode(Either.ofRight(mode));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.FaceDetectorPreset&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.FaceDetectorPreset&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        /**
         * @param resolution Specifies the maximum resolution at which your video is analyzed. The default behavior is &#34;SourceResolution,&#34; which will keep the input video at its original resolution when analyzed. Using &#34;StandardDefinition&#34; will resize input videos to standard definition while preserving the appropriate aspect ratio. It will only resize if the video is of higher resolution. For example, a 1920x1080 input would be scaled to 640x360 before processing. Switching to &#34;StandardDefinition&#34; will reduce the time it takes to process high resolution video. It may also reduce the cost of using this component (see https://azure.microsoft.com/en-us/pricing/details/media-services/#analytics for details). However, faces that end up being too small in the resized video may not be detected.
         * 
         * @return builder
         * 
         */
        public Builder resolution(@Nullable Output<Either<String,AnalysisResolution>> resolution) {
            $.resolution = resolution;
            return this;
        }

        /**
         * @param resolution Specifies the maximum resolution at which your video is analyzed. The default behavior is &#34;SourceResolution,&#34; which will keep the input video at its original resolution when analyzed. Using &#34;StandardDefinition&#34; will resize input videos to standard definition while preserving the appropriate aspect ratio. It will only resize if the video is of higher resolution. For example, a 1920x1080 input would be scaled to 640x360 before processing. Switching to &#34;StandardDefinition&#34; will reduce the time it takes to process high resolution video. It may also reduce the cost of using this component (see https://azure.microsoft.com/en-us/pricing/details/media-services/#analytics for details). However, faces that end up being too small in the resized video may not be detected.
         * 
         * @return builder
         * 
         */
        public Builder resolution(Either<String,AnalysisResolution> resolution) {
            return resolution(Output.of(resolution));
        }

        /**
         * @param resolution Specifies the maximum resolution at which your video is analyzed. The default behavior is &#34;SourceResolution,&#34; which will keep the input video at its original resolution when analyzed. Using &#34;StandardDefinition&#34; will resize input videos to standard definition while preserving the appropriate aspect ratio. It will only resize if the video is of higher resolution. For example, a 1920x1080 input would be scaled to 640x360 before processing. Switching to &#34;StandardDefinition&#34; will reduce the time it takes to process high resolution video. It may also reduce the cost of using this component (see https://azure.microsoft.com/en-us/pricing/details/media-services/#analytics for details). However, faces that end up being too small in the resized video may not be detected.
         * 
         * @return builder
         * 
         */
        public Builder resolution(String resolution) {
            return resolution(Either.ofLeft(resolution));
        }

        /**
         * @param resolution Specifies the maximum resolution at which your video is analyzed. The default behavior is &#34;SourceResolution,&#34; which will keep the input video at its original resolution when analyzed. Using &#34;StandardDefinition&#34; will resize input videos to standard definition while preserving the appropriate aspect ratio. It will only resize if the video is of higher resolution. For example, a 1920x1080 input would be scaled to 640x360 before processing. Switching to &#34;StandardDefinition&#34; will reduce the time it takes to process high resolution video. It may also reduce the cost of using this component (see https://azure.microsoft.com/en-us/pricing/details/media-services/#analytics for details). However, faces that end up being too small in the resized video may not be detected.
         * 
         * @return builder
         * 
         */
        public Builder resolution(AnalysisResolution resolution) {
            return resolution(Either.ofRight(resolution));
        }

        public FaceDetectorPresetArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
