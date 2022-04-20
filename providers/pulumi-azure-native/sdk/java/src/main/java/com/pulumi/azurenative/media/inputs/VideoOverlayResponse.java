// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.RectangleResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties of a video overlay.
 * 
 */
public final class VideoOverlayResponse extends com.pulumi.resources.InvokeArgs {

    public static final VideoOverlayResponse Empty = new VideoOverlayResponse();

    /**
     * The gain level of audio in the overlay. The value should be in the range [0, 1.0]. The default is 1.0.
     * 
     */
    @Import(name="audioGainLevel")
      private final @Nullable Double audioGainLevel;

    public Optional<Double> audioGainLevel() {
        return this.audioGainLevel == null ? Optional.empty() : Optional.ofNullable(this.audioGainLevel);
    }

    /**
     * An optional rectangular window used to crop the overlay image or video.
     * 
     */
    @Import(name="cropRectangle")
      private final @Nullable RectangleResponse cropRectangle;

    public Optional<RectangleResponse> cropRectangle() {
        return this.cropRectangle == null ? Optional.empty() : Optional.ofNullable(this.cropRectangle);
    }

    /**
     * The end position, with reference to the input video, at which the overlay ends. The value should be in ISO 8601 format. For example, PT30S to end the overlay at 30 seconds into the input video. If not specified or the value is greater than the input video duration, the overlay will be applied until the end of the input video if the overlay media duration is greater than the input video duration, else the overlay will last as long as the overlay media duration.
     * 
     */
    @Import(name="end")
      private final @Nullable String end;

    public Optional<String> end() {
        return this.end == null ? Optional.empty() : Optional.ofNullable(this.end);
    }

    /**
     * The duration over which the overlay fades in onto the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade in (same as PT0S).
     * 
     */
    @Import(name="fadeInDuration")
      private final @Nullable String fadeInDuration;

    public Optional<String> fadeInDuration() {
        return this.fadeInDuration == null ? Optional.empty() : Optional.ofNullable(this.fadeInDuration);
    }

    /**
     * The duration over which the overlay fades out of the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade out (same as PT0S).
     * 
     */
    @Import(name="fadeOutDuration")
      private final @Nullable String fadeOutDuration;

    public Optional<String> fadeOutDuration() {
        return this.fadeOutDuration == null ? Optional.empty() : Optional.ofNullable(this.fadeOutDuration);
    }

    /**
     * The label of the job input which is to be used as an overlay. The Input must specify exactly one file. You can specify an image file in JPG, PNG, GIF or BMP format, or an audio file (such as a WAV, MP3, WMA or M4A file), or a video file. See https://aka.ms/mesformats for the complete list of supported audio and video file formats.
     * 
     */
    @Import(name="inputLabel", required=true)
      private final String inputLabel;

    public String inputLabel() {
        return this.inputLabel;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.VideoOverlay&#39;.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * The opacity of the overlay. This is a value in the range [0 - 1.0]. Default is 1.0 which mean the overlay is opaque.
     * 
     */
    @Import(name="opacity")
      private final @Nullable Double opacity;

    public Optional<Double> opacity() {
        return this.opacity == null ? Optional.empty() : Optional.ofNullable(this.opacity);
    }

    /**
     * The location in the input video where the overlay is applied.
     * 
     */
    @Import(name="position")
      private final @Nullable RectangleResponse position;

    public Optional<RectangleResponse> position() {
        return this.position == null ? Optional.empty() : Optional.ofNullable(this.position);
    }

    /**
     * The start position, with reference to the input video, at which the overlay starts. The value should be in ISO 8601 format. For example, PT05S to start the overlay at 5 seconds into the input video. If not specified the overlay starts from the beginning of the input video.
     * 
     */
    @Import(name="start")
      private final @Nullable String start;

    public Optional<String> start() {
        return this.start == null ? Optional.empty() : Optional.ofNullable(this.start);
    }

    public VideoOverlayResponse(
        @Nullable Double audioGainLevel,
        @Nullable RectangleResponse cropRectangle,
        @Nullable String end,
        @Nullable String fadeInDuration,
        @Nullable String fadeOutDuration,
        String inputLabel,
        String odataType,
        @Nullable Double opacity,
        @Nullable RectangleResponse position,
        @Nullable String start) {
        this.audioGainLevel = audioGainLevel;
        this.cropRectangle = cropRectangle;
        this.end = end;
        this.fadeInDuration = fadeInDuration;
        this.fadeOutDuration = fadeOutDuration;
        this.inputLabel = Objects.requireNonNull(inputLabel, "expected parameter 'inputLabel' to be non-null");
        this.odataType = Codegen.stringProp("odataType").arg(odataType).require();
        this.opacity = opacity;
        this.position = position;
        this.start = start;
    }

    private VideoOverlayResponse() {
        this.audioGainLevel = null;
        this.cropRectangle = null;
        this.end = null;
        this.fadeInDuration = null;
        this.fadeOutDuration = null;
        this.inputLabel = null;
        this.odataType = null;
        this.opacity = null;
        this.position = null;
        this.start = null;
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
