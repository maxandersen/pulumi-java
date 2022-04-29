// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.RectangleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties of a video overlay.
 * 
 */
public final class VideoOverlayArgs extends ResourceArgs {

    public static final VideoOverlayArgs Empty = new VideoOverlayArgs();

    /**
     * The gain level of audio in the overlay. The value should be in the range [0, 1.0]. The default is 1.0.
     * 
     */
    @Import(name="audioGainLevel")
    private @Nullable Output<Double> audioGainLevel;

    /**
     * @return The gain level of audio in the overlay. The value should be in the range [0, 1.0]. The default is 1.0.
     * 
     */
    public Optional<Output<Double>> audioGainLevel() {
        return Optional.ofNullable(this.audioGainLevel);
    }

    /**
     * An optional rectangular window used to crop the overlay image or video.
     * 
     */
    @Import(name="cropRectangle")
    private @Nullable Output<RectangleArgs> cropRectangle;

    /**
     * @return An optional rectangular window used to crop the overlay image or video.
     * 
     */
    public Optional<Output<RectangleArgs>> cropRectangle() {
        return Optional.ofNullable(this.cropRectangle);
    }

    /**
     * The end position, with reference to the input video, at which the overlay ends. The value should be in ISO 8601 format. For example, PT30S to end the overlay at 30 seconds into the input video. If not specified or the value is greater than the input video duration, the overlay will be applied until the end of the input video if the overlay media duration is greater than the input video duration, else the overlay will last as long as the overlay media duration.
     * 
     */
    @Import(name="end")
    private @Nullable Output<String> end;

    /**
     * @return The end position, with reference to the input video, at which the overlay ends. The value should be in ISO 8601 format. For example, PT30S to end the overlay at 30 seconds into the input video. If not specified or the value is greater than the input video duration, the overlay will be applied until the end of the input video if the overlay media duration is greater than the input video duration, else the overlay will last as long as the overlay media duration.
     * 
     */
    public Optional<Output<String>> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * The duration over which the overlay fades in onto the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade in (same as PT0S).
     * 
     */
    @Import(name="fadeInDuration")
    private @Nullable Output<String> fadeInDuration;

    /**
     * @return The duration over which the overlay fades in onto the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade in (same as PT0S).
     * 
     */
    public Optional<Output<String>> fadeInDuration() {
        return Optional.ofNullable(this.fadeInDuration);
    }

    /**
     * The duration over which the overlay fades out of the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade out (same as PT0S).
     * 
     */
    @Import(name="fadeOutDuration")
    private @Nullable Output<String> fadeOutDuration;

    /**
     * @return The duration over which the overlay fades out of the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade out (same as PT0S).
     * 
     */
    public Optional<Output<String>> fadeOutDuration() {
        return Optional.ofNullable(this.fadeOutDuration);
    }

    /**
     * The label of the job input which is to be used as an overlay. The Input must specify exactly one file. You can specify an image file in JPG, PNG, GIF or BMP format, or an audio file (such as a WAV, MP3, WMA or M4A file), or a video file. See https://aka.ms/mesformats for the complete list of supported audio and video file formats.
     * 
     */
    @Import(name="inputLabel", required=true)
    private Output<String> inputLabel;

    /**
     * @return The label of the job input which is to be used as an overlay. The Input must specify exactly one file. You can specify an image file in JPG, PNG, GIF or BMP format, or an audio file (such as a WAV, MP3, WMA or M4A file), or a video file. See https://aka.ms/mesformats for the complete list of supported audio and video file formats.
     * 
     */
    public Output<String> inputLabel() {
        return this.inputLabel;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.VideoOverlay&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.VideoOverlay&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * The opacity of the overlay. This is a value in the range [0 - 1.0]. Default is 1.0 which mean the overlay is opaque.
     * 
     */
    @Import(name="opacity")
    private @Nullable Output<Double> opacity;

    /**
     * @return The opacity of the overlay. This is a value in the range [0 - 1.0]. Default is 1.0 which mean the overlay is opaque.
     * 
     */
    public Optional<Output<Double>> opacity() {
        return Optional.ofNullable(this.opacity);
    }

    /**
     * The location in the input video where the overlay is applied.
     * 
     */
    @Import(name="position")
    private @Nullable Output<RectangleArgs> position;

    /**
     * @return The location in the input video where the overlay is applied.
     * 
     */
    public Optional<Output<RectangleArgs>> position() {
        return Optional.ofNullable(this.position);
    }

    /**
     * The start position, with reference to the input video, at which the overlay starts. The value should be in ISO 8601 format. For example, PT05S to start the overlay at 5 seconds into the input video. If not specified the overlay starts from the beginning of the input video.
     * 
     */
    @Import(name="start")
    private @Nullable Output<String> start;

    /**
     * @return The start position, with reference to the input video, at which the overlay starts. The value should be in ISO 8601 format. For example, PT05S to start the overlay at 5 seconds into the input video. If not specified the overlay starts from the beginning of the input video.
     * 
     */
    public Optional<Output<String>> start() {
        return Optional.ofNullable(this.start);
    }

    private VideoOverlayArgs() {}

    private VideoOverlayArgs(VideoOverlayArgs $) {
        this.audioGainLevel = $.audioGainLevel;
        this.cropRectangle = $.cropRectangle;
        this.end = $.end;
        this.fadeInDuration = $.fadeInDuration;
        this.fadeOutDuration = $.fadeOutDuration;
        this.inputLabel = $.inputLabel;
        this.odataType = $.odataType;
        this.opacity = $.opacity;
        this.position = $.position;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VideoOverlayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VideoOverlayArgs $;

        public Builder() {
            $ = new VideoOverlayArgs();
        }

        public Builder(VideoOverlayArgs defaults) {
            $ = new VideoOverlayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audioGainLevel The gain level of audio in the overlay. The value should be in the range [0, 1.0]. The default is 1.0.
         * 
         * @return builder
         * 
         */
        public Builder audioGainLevel(@Nullable Output<Double> audioGainLevel) {
            $.audioGainLevel = audioGainLevel;
            return this;
        }

        /**
         * @param audioGainLevel The gain level of audio in the overlay. The value should be in the range [0, 1.0]. The default is 1.0.
         * 
         * @return builder
         * 
         */
        public Builder audioGainLevel(Double audioGainLevel) {
            return audioGainLevel(Output.of(audioGainLevel));
        }

        /**
         * @param cropRectangle An optional rectangular window used to crop the overlay image or video.
         * 
         * @return builder
         * 
         */
        public Builder cropRectangle(@Nullable Output<RectangleArgs> cropRectangle) {
            $.cropRectangle = cropRectangle;
            return this;
        }

        /**
         * @param cropRectangle An optional rectangular window used to crop the overlay image or video.
         * 
         * @return builder
         * 
         */
        public Builder cropRectangle(RectangleArgs cropRectangle) {
            return cropRectangle(Output.of(cropRectangle));
        }

        /**
         * @param end The end position, with reference to the input video, at which the overlay ends. The value should be in ISO 8601 format. For example, PT30S to end the overlay at 30 seconds into the input video. If not specified or the value is greater than the input video duration, the overlay will be applied until the end of the input video if the overlay media duration is greater than the input video duration, else the overlay will last as long as the overlay media duration.
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable Output<String> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end The end position, with reference to the input video, at which the overlay ends. The value should be in ISO 8601 format. For example, PT30S to end the overlay at 30 seconds into the input video. If not specified or the value is greater than the input video duration, the overlay will be applied until the end of the input video if the overlay media duration is greater than the input video duration, else the overlay will last as long as the overlay media duration.
         * 
         * @return builder
         * 
         */
        public Builder end(String end) {
            return end(Output.of(end));
        }

        /**
         * @param fadeInDuration The duration over which the overlay fades in onto the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade in (same as PT0S).
         * 
         * @return builder
         * 
         */
        public Builder fadeInDuration(@Nullable Output<String> fadeInDuration) {
            $.fadeInDuration = fadeInDuration;
            return this;
        }

        /**
         * @param fadeInDuration The duration over which the overlay fades in onto the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade in (same as PT0S).
         * 
         * @return builder
         * 
         */
        public Builder fadeInDuration(String fadeInDuration) {
            return fadeInDuration(Output.of(fadeInDuration));
        }

        /**
         * @param fadeOutDuration The duration over which the overlay fades out of the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade out (same as PT0S).
         * 
         * @return builder
         * 
         */
        public Builder fadeOutDuration(@Nullable Output<String> fadeOutDuration) {
            $.fadeOutDuration = fadeOutDuration;
            return this;
        }

        /**
         * @param fadeOutDuration The duration over which the overlay fades out of the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade out (same as PT0S).
         * 
         * @return builder
         * 
         */
        public Builder fadeOutDuration(String fadeOutDuration) {
            return fadeOutDuration(Output.of(fadeOutDuration));
        }

        /**
         * @param inputLabel The label of the job input which is to be used as an overlay. The Input must specify exactly one file. You can specify an image file in JPG, PNG, GIF or BMP format, or an audio file (such as a WAV, MP3, WMA or M4A file), or a video file. See https://aka.ms/mesformats for the complete list of supported audio and video file formats.
         * 
         * @return builder
         * 
         */
        public Builder inputLabel(Output<String> inputLabel) {
            $.inputLabel = inputLabel;
            return this;
        }

        /**
         * @param inputLabel The label of the job input which is to be used as an overlay. The Input must specify exactly one file. You can specify an image file in JPG, PNG, GIF or BMP format, or an audio file (such as a WAV, MP3, WMA or M4A file), or a video file. See https://aka.ms/mesformats for the complete list of supported audio and video file formats.
         * 
         * @return builder
         * 
         */
        public Builder inputLabel(String inputLabel) {
            return inputLabel(Output.of(inputLabel));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.VideoOverlay&#39;.
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
         * Expected value is &#39;#Microsoft.Media.VideoOverlay&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        /**
         * @param opacity The opacity of the overlay. This is a value in the range [0 - 1.0]. Default is 1.0 which mean the overlay is opaque.
         * 
         * @return builder
         * 
         */
        public Builder opacity(@Nullable Output<Double> opacity) {
            $.opacity = opacity;
            return this;
        }

        /**
         * @param opacity The opacity of the overlay. This is a value in the range [0 - 1.0]. Default is 1.0 which mean the overlay is opaque.
         * 
         * @return builder
         * 
         */
        public Builder opacity(Double opacity) {
            return opacity(Output.of(opacity));
        }

        /**
         * @param position The location in the input video where the overlay is applied.
         * 
         * @return builder
         * 
         */
        public Builder position(@Nullable Output<RectangleArgs> position) {
            $.position = position;
            return this;
        }

        /**
         * @param position The location in the input video where the overlay is applied.
         * 
         * @return builder
         * 
         */
        public Builder position(RectangleArgs position) {
            return position(Output.of(position));
        }

        /**
         * @param start The start position, with reference to the input video, at which the overlay starts. The value should be in ISO 8601 format. For example, PT05S to start the overlay at 5 seconds into the input video. If not specified the overlay starts from the beginning of the input video.
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Output<String> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start The start position, with reference to the input video, at which the overlay starts. The value should be in ISO 8601 format. For example, PT05S to start the overlay at 5 seconds into the input video. If not specified the overlay starts from the beginning of the input video.
         * 
         * @return builder
         * 
         */
        public Builder start(String start) {
            return start(Output.of(start));
        }

        public VideoOverlayArgs build() {
            $.inputLabel = Objects.requireNonNull($.inputLabel, "expected parameter 'inputLabel' to be non-null");
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
