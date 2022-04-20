// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.azurenative.media.outputs.RectangleResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VideoOverlayResponse {
    /**
     * The gain level of audio in the overlay. The value should be in the range [0, 1.0]. The default is 1.0.
     * 
     */
    private final @Nullable Double audioGainLevel;
    /**
     * An optional rectangular window used to crop the overlay image or video.
     * 
     */
    private final @Nullable RectangleResponse cropRectangle;
    /**
     * The end position, with reference to the input video, at which the overlay ends. The value should be in ISO 8601 format. For example, PT30S to end the overlay at 30 seconds into the input video. If not specified or the value is greater than the input video duration, the overlay will be applied until the end of the input video if the overlay media duration is greater than the input video duration, else the overlay will last as long as the overlay media duration.
     * 
     */
    private final @Nullable String end;
    /**
     * The duration over which the overlay fades in onto the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade in (same as PT0S).
     * 
     */
    private final @Nullable String fadeInDuration;
    /**
     * The duration over which the overlay fades out of the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade out (same as PT0S).
     * 
     */
    private final @Nullable String fadeOutDuration;
    /**
     * The label of the job input which is to be used as an overlay. The Input must specify exactly one file. You can specify an image file in JPG, PNG, GIF or BMP format, or an audio file (such as a WAV, MP3, WMA or M4A file), or a video file. See https://aka.ms/mesformats for the complete list of supported audio and video file formats.
     * 
     */
    private final String inputLabel;
    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.VideoOverlay&#39;.
     * 
     */
    private final String odataType;
    /**
     * The opacity of the overlay. This is a value in the range [0 - 1.0]. Default is 1.0 which mean the overlay is opaque.
     * 
     */
    private final @Nullable Double opacity;
    /**
     * The location in the input video where the overlay is applied.
     * 
     */
    private final @Nullable RectangleResponse position;
    /**
     * The start position, with reference to the input video, at which the overlay starts. The value should be in ISO 8601 format. For example, PT05S to start the overlay at 5 seconds into the input video. If not specified the overlay starts from the beginning of the input video.
     * 
     */
    private final @Nullable String start;

    @CustomType.Constructor
    private VideoOverlayResponse(
        @CustomType.Parameter("audioGainLevel") @Nullable Double audioGainLevel,
        @CustomType.Parameter("cropRectangle") @Nullable RectangleResponse cropRectangle,
        @CustomType.Parameter("end") @Nullable String end,
        @CustomType.Parameter("fadeInDuration") @Nullable String fadeInDuration,
        @CustomType.Parameter("fadeOutDuration") @Nullable String fadeOutDuration,
        @CustomType.Parameter("inputLabel") String inputLabel,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("opacity") @Nullable Double opacity,
        @CustomType.Parameter("position") @Nullable RectangleResponse position,
        @CustomType.Parameter("start") @Nullable String start) {
        this.audioGainLevel = audioGainLevel;
        this.cropRectangle = cropRectangle;
        this.end = end;
        this.fadeInDuration = fadeInDuration;
        this.fadeOutDuration = fadeOutDuration;
        this.inputLabel = inputLabel;
        this.odataType = odataType;
        this.opacity = opacity;
        this.position = position;
        this.start = start;
    }

    /**
     * The gain level of audio in the overlay. The value should be in the range [0, 1.0]. The default is 1.0.
     * 
    */
    public Optional<Double> audioGainLevel() {
        return Optional.ofNullable(this.audioGainLevel);
    }
    /**
     * An optional rectangular window used to crop the overlay image or video.
     * 
    */
    public Optional<RectangleResponse> cropRectangle() {
        return Optional.ofNullable(this.cropRectangle);
    }
    /**
     * The end position, with reference to the input video, at which the overlay ends. The value should be in ISO 8601 format. For example, PT30S to end the overlay at 30 seconds into the input video. If not specified or the value is greater than the input video duration, the overlay will be applied until the end of the input video if the overlay media duration is greater than the input video duration, else the overlay will last as long as the overlay media duration.
     * 
    */
    public Optional<String> end() {
        return Optional.ofNullable(this.end);
    }
    /**
     * The duration over which the overlay fades in onto the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade in (same as PT0S).
     * 
    */
    public Optional<String> fadeInDuration() {
        return Optional.ofNullable(this.fadeInDuration);
    }
    /**
     * The duration over which the overlay fades out of the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade out (same as PT0S).
     * 
    */
    public Optional<String> fadeOutDuration() {
        return Optional.ofNullable(this.fadeOutDuration);
    }
    /**
     * The label of the job input which is to be used as an overlay. The Input must specify exactly one file. You can specify an image file in JPG, PNG, GIF or BMP format, or an audio file (such as a WAV, MP3, WMA or M4A file), or a video file. See https://aka.ms/mesformats for the complete list of supported audio and video file formats.
     * 
    */
    public String inputLabel() {
        return this.inputLabel;
    }
    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.VideoOverlay&#39;.
     * 
    */
    public String odataType() {
        return this.odataType;
    }
    /**
     * The opacity of the overlay. This is a value in the range [0 - 1.0]. Default is 1.0 which mean the overlay is opaque.
     * 
    */
    public Optional<Double> opacity() {
        return Optional.ofNullable(this.opacity);
    }
    /**
     * The location in the input video where the overlay is applied.
     * 
    */
    public Optional<RectangleResponse> position() {
        return Optional.ofNullable(this.position);
    }
    /**
     * The start position, with reference to the input video, at which the overlay starts. The value should be in ISO 8601 format. For example, PT05S to start the overlay at 5 seconds into the input video. If not specified the overlay starts from the beginning of the input video.
     * 
    */
    public Optional<String> start() {
        return Optional.ofNullable(this.start);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoOverlayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double audioGainLevel;
        private @Nullable RectangleResponse cropRectangle;
        private @Nullable String end;
        private @Nullable String fadeInDuration;
        private @Nullable String fadeOutDuration;
        private String inputLabel;
        private String odataType;
        private @Nullable Double opacity;
        private @Nullable RectangleResponse position;
        private @Nullable String start;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoOverlayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioGainLevel = defaults.audioGainLevel;
    	      this.cropRectangle = defaults.cropRectangle;
    	      this.end = defaults.end;
    	      this.fadeInDuration = defaults.fadeInDuration;
    	      this.fadeOutDuration = defaults.fadeOutDuration;
    	      this.inputLabel = defaults.inputLabel;
    	      this.odataType = defaults.odataType;
    	      this.opacity = defaults.opacity;
    	      this.position = defaults.position;
    	      this.start = defaults.start;
        }

        public Builder audioGainLevel(@Nullable Double audioGainLevel) {
            this.audioGainLevel = audioGainLevel;
            return this;
        }
        public Builder cropRectangle(@Nullable RectangleResponse cropRectangle) {
            this.cropRectangle = cropRectangle;
            return this;
        }
        public Builder end(@Nullable String end) {
            this.end = end;
            return this;
        }
        public Builder fadeInDuration(@Nullable String fadeInDuration) {
            this.fadeInDuration = fadeInDuration;
            return this;
        }
        public Builder fadeOutDuration(@Nullable String fadeOutDuration) {
            this.fadeOutDuration = fadeOutDuration;
            return this;
        }
        public Builder inputLabel(String inputLabel) {
            this.inputLabel = Objects.requireNonNull(inputLabel);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder opacity(@Nullable Double opacity) {
            this.opacity = opacity;
            return this;
        }
        public Builder position(@Nullable RectangleResponse position) {
            this.position = position;
            return this;
        }
        public Builder start(@Nullable String start) {
            this.start = start;
            return this;
        }        public VideoOverlayResponse build() {
            return new VideoOverlayResponse(audioGainLevel, cropRectangle, end, fadeInDuration, fadeOutDuration, inputLabel, odataType, opacity, position, start);
        }
    }
}
