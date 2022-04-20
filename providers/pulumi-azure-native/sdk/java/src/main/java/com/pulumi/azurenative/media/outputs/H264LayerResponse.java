// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class H264LayerResponse {
    /**
     * Whether or not adaptive B-frames are to be used when encoding this layer. If not specified, the encoder will turn it on whenever the video profile permits its use.
     * 
     */
    private final @Nullable Boolean adaptiveBFrame;
    /**
     * The number of B-frames to be used when encoding this layer.  If not specified, the encoder chooses an appropriate number based on the video profile and level.
     * 
     */
    private final @Nullable Integer bFrames;
    /**
     * The average bitrate in bits per second at which to encode the input video when generating this layer. This is a required field.
     * 
     */
    private final Integer bitrate;
    /**
     * The VBV buffer window length. The value should be in ISO 8601 format. The value should be in the range [0.1-100] seconds. The default is 5 seconds (for example, PT5S).
     * 
     */
    private final @Nullable String bufferWindow;
    /**
     * The entropy mode to be used for this layer. If not specified, the encoder chooses the mode that is appropriate for the profile and level.
     * 
     */
    private final @Nullable String entropyMode;
    /**
     * The frame rate (in frames per second) at which to encode this layer. The value can be in the form of M/N where M and N are integers (For example, 30000/1001), or in the form of a number (For example, 30, or 29.97). The encoder enforces constraints on allowed frame rates based on the profile and level. If it is not specified, the encoder will use the same frame rate as the input video.
     * 
     */
    private final @Nullable String frameRate;
    /**
     * The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
     * 
     */
    private final @Nullable String height;
    /**
     * The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
     * 
     */
    private final @Nullable String label;
    /**
     * We currently support Level up to 6.2. The value can be Auto, or a number that matches the H.264 profile. If not specified, the default is Auto, which lets the encoder choose the Level that is appropriate for this layer.
     * 
     */
    private final @Nullable String level;
    /**
     * The maximum bitrate (in bits per second), at which the VBV buffer should be assumed to refill. If not specified, defaults to the same value as bitrate.
     * 
     */
    private final @Nullable Integer maxBitrate;
    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.H264Layer&#39;.
     * 
     */
    private final String odataType;
    /**
     * We currently support Baseline, Main, High, High422, High444. Default is Auto.
     * 
     */
    private final @Nullable String profile;
    /**
     * The number of reference frames to be used when encoding this layer. If not specified, the encoder determines an appropriate number based on the encoder complexity setting.
     * 
     */
    private final @Nullable Integer referenceFrames;
    /**
     * The number of slices to be used when encoding this layer. If not specified, default is zero, which means that encoder will use a single slice for each frame.
     * 
     */
    private final @Nullable Integer slices;
    /**
     * The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
     * 
     */
    private final @Nullable String width;

    @CustomType.Constructor
    private H264LayerResponse(
        @CustomType.Parameter("adaptiveBFrame") @Nullable Boolean adaptiveBFrame,
        @CustomType.Parameter("bFrames") @Nullable Integer bFrames,
        @CustomType.Parameter("bitrate") Integer bitrate,
        @CustomType.Parameter("bufferWindow") @Nullable String bufferWindow,
        @CustomType.Parameter("entropyMode") @Nullable String entropyMode,
        @CustomType.Parameter("frameRate") @Nullable String frameRate,
        @CustomType.Parameter("height") @Nullable String height,
        @CustomType.Parameter("label") @Nullable String label,
        @CustomType.Parameter("level") @Nullable String level,
        @CustomType.Parameter("maxBitrate") @Nullable Integer maxBitrate,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("profile") @Nullable String profile,
        @CustomType.Parameter("referenceFrames") @Nullable Integer referenceFrames,
        @CustomType.Parameter("slices") @Nullable Integer slices,
        @CustomType.Parameter("width") @Nullable String width) {
        this.adaptiveBFrame = adaptiveBFrame;
        this.bFrames = bFrames;
        this.bitrate = bitrate;
        this.bufferWindow = bufferWindow;
        this.entropyMode = entropyMode;
        this.frameRate = frameRate;
        this.height = height;
        this.label = label;
        this.level = level;
        this.maxBitrate = maxBitrate;
        this.odataType = odataType;
        this.profile = profile;
        this.referenceFrames = referenceFrames;
        this.slices = slices;
        this.width = width;
    }

    /**
     * Whether or not adaptive B-frames are to be used when encoding this layer. If not specified, the encoder will turn it on whenever the video profile permits its use.
     * 
    */
    public Optional<Boolean> adaptiveBFrame() {
        return Optional.ofNullable(this.adaptiveBFrame);
    }
    /**
     * The number of B-frames to be used when encoding this layer.  If not specified, the encoder chooses an appropriate number based on the video profile and level.
     * 
    */
    public Optional<Integer> bFrames() {
        return Optional.ofNullable(this.bFrames);
    }
    /**
     * The average bitrate in bits per second at which to encode the input video when generating this layer. This is a required field.
     * 
    */
    public Integer bitrate() {
        return this.bitrate;
    }
    /**
     * The VBV buffer window length. The value should be in ISO 8601 format. The value should be in the range [0.1-100] seconds. The default is 5 seconds (for example, PT5S).
     * 
    */
    public Optional<String> bufferWindow() {
        return Optional.ofNullable(this.bufferWindow);
    }
    /**
     * The entropy mode to be used for this layer. If not specified, the encoder chooses the mode that is appropriate for the profile and level.
     * 
    */
    public Optional<String> entropyMode() {
        return Optional.ofNullable(this.entropyMode);
    }
    /**
     * The frame rate (in frames per second) at which to encode this layer. The value can be in the form of M/N where M and N are integers (For example, 30000/1001), or in the form of a number (For example, 30, or 29.97). The encoder enforces constraints on allowed frame rates based on the profile and level. If it is not specified, the encoder will use the same frame rate as the input video.
     * 
    */
    public Optional<String> frameRate() {
        return Optional.ofNullable(this.frameRate);
    }
    /**
     * The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
     * 
    */
    public Optional<String> height() {
        return Optional.ofNullable(this.height);
    }
    /**
     * The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
     * 
    */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * We currently support Level up to 6.2. The value can be Auto, or a number that matches the H.264 profile. If not specified, the default is Auto, which lets the encoder choose the Level that is appropriate for this layer.
     * 
    */
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
    }
    /**
     * The maximum bitrate (in bits per second), at which the VBV buffer should be assumed to refill. If not specified, defaults to the same value as bitrate.
     * 
    */
    public Optional<Integer> maxBitrate() {
        return Optional.ofNullable(this.maxBitrate);
    }
    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.H264Layer&#39;.
     * 
    */
    public String odataType() {
        return this.odataType;
    }
    /**
     * We currently support Baseline, Main, High, High422, High444. Default is Auto.
     * 
    */
    public Optional<String> profile() {
        return Optional.ofNullable(this.profile);
    }
    /**
     * The number of reference frames to be used when encoding this layer. If not specified, the encoder determines an appropriate number based on the encoder complexity setting.
     * 
    */
    public Optional<Integer> referenceFrames() {
        return Optional.ofNullable(this.referenceFrames);
    }
    /**
     * The number of slices to be used when encoding this layer. If not specified, default is zero, which means that encoder will use a single slice for each frame.
     * 
    */
    public Optional<Integer> slices() {
        return Optional.ofNullable(this.slices);
    }
    /**
     * The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
     * 
    */
    public Optional<String> width() {
        return Optional.ofNullable(this.width);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(H264LayerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean adaptiveBFrame;
        private @Nullable Integer bFrames;
        private Integer bitrate;
        private @Nullable String bufferWindow;
        private @Nullable String entropyMode;
        private @Nullable String frameRate;
        private @Nullable String height;
        private @Nullable String label;
        private @Nullable String level;
        private @Nullable Integer maxBitrate;
        private String odataType;
        private @Nullable String profile;
        private @Nullable Integer referenceFrames;
        private @Nullable Integer slices;
        private @Nullable String width;

        public Builder() {
    	      // Empty
        }

        public Builder(H264LayerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adaptiveBFrame = defaults.adaptiveBFrame;
    	      this.bFrames = defaults.bFrames;
    	      this.bitrate = defaults.bitrate;
    	      this.bufferWindow = defaults.bufferWindow;
    	      this.entropyMode = defaults.entropyMode;
    	      this.frameRate = defaults.frameRate;
    	      this.height = defaults.height;
    	      this.label = defaults.label;
    	      this.level = defaults.level;
    	      this.maxBitrate = defaults.maxBitrate;
    	      this.odataType = defaults.odataType;
    	      this.profile = defaults.profile;
    	      this.referenceFrames = defaults.referenceFrames;
    	      this.slices = defaults.slices;
    	      this.width = defaults.width;
        }

        public Builder adaptiveBFrame(@Nullable Boolean adaptiveBFrame) {
            this.adaptiveBFrame = adaptiveBFrame;
            return this;
        }
        public Builder bFrames(@Nullable Integer bFrames) {
            this.bFrames = bFrames;
            return this;
        }
        public Builder bitrate(Integer bitrate) {
            this.bitrate = Objects.requireNonNull(bitrate);
            return this;
        }
        public Builder bufferWindow(@Nullable String bufferWindow) {
            this.bufferWindow = bufferWindow;
            return this;
        }
        public Builder entropyMode(@Nullable String entropyMode) {
            this.entropyMode = entropyMode;
            return this;
        }
        public Builder frameRate(@Nullable String frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Builder height(@Nullable String height) {
            this.height = height;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder level(@Nullable String level) {
            this.level = level;
            return this;
        }
        public Builder maxBitrate(@Nullable Integer maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder profile(@Nullable String profile) {
            this.profile = profile;
            return this;
        }
        public Builder referenceFrames(@Nullable Integer referenceFrames) {
            this.referenceFrames = referenceFrames;
            return this;
        }
        public Builder slices(@Nullable Integer slices) {
            this.slices = slices;
            return this;
        }
        public Builder width(@Nullable String width) {
            this.width = width;
            return this;
        }        public H264LayerResponse build() {
            return new H264LayerResponse(adaptiveBFrame, bFrames, bitrate, bufferWindow, entropyMode, frameRate, height, label, level, maxBitrate, odataType, profile, referenceFrames, slices, width);
        }
    }
}
