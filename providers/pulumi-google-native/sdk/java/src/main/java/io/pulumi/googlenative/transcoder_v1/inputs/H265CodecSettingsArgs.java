// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * H265 codec settings.
 * 
 */
public final class H265CodecSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final H265CodecSettingsArgs Empty = new H265CodecSettingsArgs();

    /**
     * Specifies whether an open Group of Pictures (GOP) structure should be allowed or not. The default is `false`.
     * 
     */
    @Import(name="allowOpenGop")
      private final @Nullable Output<Boolean> allowOpenGop;

    public Output<Boolean> allowOpenGop() {
        return this.allowOpenGop == null ? Codegen.empty() : this.allowOpenGop;
    }

    /**
     * Specify the intensity of the adaptive quantizer (AQ). Must be between 0 and 1, where 0 disables the quantizer and 1 maximizes the quantizer. A higher value equals a lower bitrate but smoother image. The default is 0.
     * 
     */
    @Import(name="aqStrength")
      private final @Nullable Output<Double> aqStrength;

    public Output<Double> aqStrength() {
        return this.aqStrength == null ? Codegen.empty() : this.aqStrength;
    }

    /**
     * The number of consecutive B-frames. Must be greater than or equal to zero. Must be less than `VideoStream.gop_frame_count` if set. The default is 0.
     * 
     */
    @Import(name="bFrameCount")
      private final @Nullable Output<Integer> bFrameCount;

    public Output<Integer> bFrameCount() {
        return this.bFrameCount == null ? Codegen.empty() : this.bFrameCount;
    }

    /**
     * Allow B-pyramid for reference frame selection. This may not be supported on all decoders. The default is `false`.
     * 
     */
    @Import(name="bPyramid")
      private final @Nullable Output<Boolean> bPyramid;

    public Output<Boolean> bPyramid() {
        return this.bPyramid == null ? Codegen.empty() : this.bPyramid;
    }

    /**
     * The video bitrate in bits per second. The minimum value is 1,000. The maximum value is 800,000,000.
     * 
     */
    @Import(name="bitrateBps", required=true)
      private final Output<Integer> bitrateBps;

    public Output<Integer> bitrateBps() {
        return this.bitrateBps;
    }

    /**
     * Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most efficient compression. The default is 21.
     * 
     */
    @Import(name="crfLevel")
      private final @Nullable Output<Integer> crfLevel;

    public Output<Integer> crfLevel() {
        return this.crfLevel == null ? Codegen.empty() : this.crfLevel;
    }

    /**
     * Use two-pass encoding strategy to achieve better video quality. `VideoStream.rate_control_mode` must be `vbr`. The default is `false`.
     * 
     */
    @Import(name="enableTwoPass")
      private final @Nullable Output<Boolean> enableTwoPass;

    public Output<Boolean> enableTwoPass() {
        return this.enableTwoPass == null ? Codegen.empty() : this.enableTwoPass;
    }

    /**
     * The target video frame rate in frames per second (FPS). Must be less than or equal to 120. Will default to the input frame rate if larger than the input frame rate. The API will generate an output FPS that is divisible by the input FPS, and smaller or equal to the target FPS. See [Calculating frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate) for more information.
     * 
     */
    @Import(name="frameRate", required=true)
      private final Output<Double> frameRate;

    public Output<Double> frameRate() {
        return this.frameRate;
    }

    /**
     * Select the GOP size based on the specified duration. The default is `3s`. Note that `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
     * 
     */
    @Import(name="gopDuration")
      private final @Nullable Output<String> gopDuration;

    public Output<String> gopDuration() {
        return this.gopDuration == null ? Codegen.empty() : this.gopDuration;
    }

    /**
     * Select the GOP size based on the specified frame count. Must be greater than zero.
     * 
     */
    @Import(name="gopFrameCount")
      private final @Nullable Output<Integer> gopFrameCount;

    public Output<Integer> gopFrameCount() {
        return this.gopFrameCount == null ? Codegen.empty() : this.gopFrameCount;
    }

    /**
     * The height of the video in pixels. Must be an even integer. When not specified, the height is adjusted to match the specified width and input aspect ratio. If both are omitted, the input height is used.
     * 
     */
    @Import(name="heightPixels")
      private final @Nullable Output<Integer> heightPixels;

    public Output<Integer> heightPixels() {
        return this.heightPixels == null ? Codegen.empty() : this.heightPixels;
    }

    /**
     * Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel format - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12` 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit HDR pixel format
     * 
     */
    @Import(name="pixelFormat")
      private final @Nullable Output<String> pixelFormat;

    public Output<String> pixelFormat() {
        return this.pixelFormat == null ? Codegen.empty() : this.pixelFormat;
    }

    /**
     * Enforces the specified codec preset. The default is `veryfast`. The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.265). Note that certain values for this field may cause the transcoder to override other fields you set in the `H265CodecSettings` message.
     * 
     */
    @Import(name="preset")
      private final @Nullable Output<String> preset;

    public Output<String> preset() {
        return this.preset == null ? Codegen.empty() : this.preset;
    }

    /**
     * Enforces the specified codec profile. The following profiles are supported: * 8-bit profiles * `main` (default) * `main-intra` * `mainstillpicture` * 10-bit profiles * `main10` (default) * `main10-intra` * `main422-10` * `main422-10-intra` * `main444-10` * `main444-10-intra` * 12-bit profiles * `main12` (default) * `main12-intra` * `main422-12` * `main422-12-intra` * `main444-12` * `main444-12-intra` The available options are [FFmpeg-compatible](https://x265.readthedocs.io/). Note that certain values for this field may cause the transcoder to override other fields you set in the `H265CodecSettings` message.
     * 
     */
    @Import(name="profile")
      private final @Nullable Output<String> profile;

    public Output<String> profile() {
        return this.profile == null ? Codegen.empty() : this.profile;
    }

    /**
     * Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` - variable bitrate - `crf` - constant rate factor
     * 
     */
    @Import(name="rateControlMode")
      private final @Nullable Output<String> rateControlMode;

    public Output<String> rateControlMode() {
        return this.rateControlMode == null ? Codegen.empty() : this.rateControlMode;
    }

    /**
     * Enforces the specified codec tune. The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.265). Note that certain values for this field may cause the transcoder to override other fields you set in the `H265CodecSettings` message.
     * 
     */
    @Import(name="tune")
      private final @Nullable Output<String> tune;

    public Output<String> tune() {
        return this.tune == null ? Codegen.empty() : this.tune;
    }

    /**
     * Initial fullness of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to 90% of `VideoStream.vbv_size_bits`.
     * 
     */
    @Import(name="vbvFullnessBits")
      private final @Nullable Output<Integer> vbvFullnessBits;

    public Output<Integer> vbvFullnessBits() {
        return this.vbvFullnessBits == null ? Codegen.empty() : this.vbvFullnessBits;
    }

    /**
     * Size of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to `VideoStream.bitrate_bps`.
     * 
     */
    @Import(name="vbvSizeBits")
      private final @Nullable Output<Integer> vbvSizeBits;

    public Output<Integer> vbvSizeBits() {
        return this.vbvSizeBits == null ? Codegen.empty() : this.vbvSizeBits;
    }

    /**
     * The width of the video in pixels. Must be an even integer. When not specified, the width is adjusted to match the specified height and input aspect ratio. If both are omitted, the input width is used.
     * 
     */
    @Import(name="widthPixels")
      private final @Nullable Output<Integer> widthPixels;

    public Output<Integer> widthPixels() {
        return this.widthPixels == null ? Codegen.empty() : this.widthPixels;
    }

    public H265CodecSettingsArgs(
        @Nullable Output<Boolean> allowOpenGop,
        @Nullable Output<Double> aqStrength,
        @Nullable Output<Integer> bFrameCount,
        @Nullable Output<Boolean> bPyramid,
        Output<Integer> bitrateBps,
        @Nullable Output<Integer> crfLevel,
        @Nullable Output<Boolean> enableTwoPass,
        Output<Double> frameRate,
        @Nullable Output<String> gopDuration,
        @Nullable Output<Integer> gopFrameCount,
        @Nullable Output<Integer> heightPixels,
        @Nullable Output<String> pixelFormat,
        @Nullable Output<String> preset,
        @Nullable Output<String> profile,
        @Nullable Output<String> rateControlMode,
        @Nullable Output<String> tune,
        @Nullable Output<Integer> vbvFullnessBits,
        @Nullable Output<Integer> vbvSizeBits,
        @Nullable Output<Integer> widthPixels) {
        this.allowOpenGop = allowOpenGop;
        this.aqStrength = aqStrength;
        this.bFrameCount = bFrameCount;
        this.bPyramid = bPyramid;
        this.bitrateBps = Objects.requireNonNull(bitrateBps, "expected parameter 'bitrateBps' to be non-null");
        this.crfLevel = crfLevel;
        this.enableTwoPass = enableTwoPass;
        this.frameRate = Objects.requireNonNull(frameRate, "expected parameter 'frameRate' to be non-null");
        this.gopDuration = gopDuration;
        this.gopFrameCount = gopFrameCount;
        this.heightPixels = heightPixels;
        this.pixelFormat = pixelFormat;
        this.preset = preset;
        this.profile = profile;
        this.rateControlMode = rateControlMode;
        this.tune = tune;
        this.vbvFullnessBits = vbvFullnessBits;
        this.vbvSizeBits = vbvSizeBits;
        this.widthPixels = widthPixels;
    }

    private H265CodecSettingsArgs() {
        this.allowOpenGop = Codegen.empty();
        this.aqStrength = Codegen.empty();
        this.bFrameCount = Codegen.empty();
        this.bPyramid = Codegen.empty();
        this.bitrateBps = Codegen.empty();
        this.crfLevel = Codegen.empty();
        this.enableTwoPass = Codegen.empty();
        this.frameRate = Codegen.empty();
        this.gopDuration = Codegen.empty();
        this.gopFrameCount = Codegen.empty();
        this.heightPixels = Codegen.empty();
        this.pixelFormat = Codegen.empty();
        this.preset = Codegen.empty();
        this.profile = Codegen.empty();
        this.rateControlMode = Codegen.empty();
        this.tune = Codegen.empty();
        this.vbvFullnessBits = Codegen.empty();
        this.vbvSizeBits = Codegen.empty();
        this.widthPixels = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(H265CodecSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowOpenGop;
        private @Nullable Output<Double> aqStrength;
        private @Nullable Output<Integer> bFrameCount;
        private @Nullable Output<Boolean> bPyramid;
        private Output<Integer> bitrateBps;
        private @Nullable Output<Integer> crfLevel;
        private @Nullable Output<Boolean> enableTwoPass;
        private Output<Double> frameRate;
        private @Nullable Output<String> gopDuration;
        private @Nullable Output<Integer> gopFrameCount;
        private @Nullable Output<Integer> heightPixels;
        private @Nullable Output<String> pixelFormat;
        private @Nullable Output<String> preset;
        private @Nullable Output<String> profile;
        private @Nullable Output<String> rateControlMode;
        private @Nullable Output<String> tune;
        private @Nullable Output<Integer> vbvFullnessBits;
        private @Nullable Output<Integer> vbvSizeBits;
        private @Nullable Output<Integer> widthPixels;

        public Builder() {
    	      // Empty
        }

        public Builder(H265CodecSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowOpenGop = defaults.allowOpenGop;
    	      this.aqStrength = defaults.aqStrength;
    	      this.bFrameCount = defaults.bFrameCount;
    	      this.bPyramid = defaults.bPyramid;
    	      this.bitrateBps = defaults.bitrateBps;
    	      this.crfLevel = defaults.crfLevel;
    	      this.enableTwoPass = defaults.enableTwoPass;
    	      this.frameRate = defaults.frameRate;
    	      this.gopDuration = defaults.gopDuration;
    	      this.gopFrameCount = defaults.gopFrameCount;
    	      this.heightPixels = defaults.heightPixels;
    	      this.pixelFormat = defaults.pixelFormat;
    	      this.preset = defaults.preset;
    	      this.profile = defaults.profile;
    	      this.rateControlMode = defaults.rateControlMode;
    	      this.tune = defaults.tune;
    	      this.vbvFullnessBits = defaults.vbvFullnessBits;
    	      this.vbvSizeBits = defaults.vbvSizeBits;
    	      this.widthPixels = defaults.widthPixels;
        }

        public Builder allowOpenGop(@Nullable Output<Boolean> allowOpenGop) {
            this.allowOpenGop = allowOpenGop;
            return this;
        }
        public Builder allowOpenGop(@Nullable Boolean allowOpenGop) {
            this.allowOpenGop = Codegen.ofNullable(allowOpenGop);
            return this;
        }
        public Builder aqStrength(@Nullable Output<Double> aqStrength) {
            this.aqStrength = aqStrength;
            return this;
        }
        public Builder aqStrength(@Nullable Double aqStrength) {
            this.aqStrength = Codegen.ofNullable(aqStrength);
            return this;
        }
        public Builder bFrameCount(@Nullable Output<Integer> bFrameCount) {
            this.bFrameCount = bFrameCount;
            return this;
        }
        public Builder bFrameCount(@Nullable Integer bFrameCount) {
            this.bFrameCount = Codegen.ofNullable(bFrameCount);
            return this;
        }
        public Builder bPyramid(@Nullable Output<Boolean> bPyramid) {
            this.bPyramid = bPyramid;
            return this;
        }
        public Builder bPyramid(@Nullable Boolean bPyramid) {
            this.bPyramid = Codegen.ofNullable(bPyramid);
            return this;
        }
        public Builder bitrateBps(Output<Integer> bitrateBps) {
            this.bitrateBps = Objects.requireNonNull(bitrateBps);
            return this;
        }
        public Builder bitrateBps(Integer bitrateBps) {
            this.bitrateBps = Output.of(Objects.requireNonNull(bitrateBps));
            return this;
        }
        public Builder crfLevel(@Nullable Output<Integer> crfLevel) {
            this.crfLevel = crfLevel;
            return this;
        }
        public Builder crfLevel(@Nullable Integer crfLevel) {
            this.crfLevel = Codegen.ofNullable(crfLevel);
            return this;
        }
        public Builder enableTwoPass(@Nullable Output<Boolean> enableTwoPass) {
            this.enableTwoPass = enableTwoPass;
            return this;
        }
        public Builder enableTwoPass(@Nullable Boolean enableTwoPass) {
            this.enableTwoPass = Codegen.ofNullable(enableTwoPass);
            return this;
        }
        public Builder frameRate(Output<Double> frameRate) {
            this.frameRate = Objects.requireNonNull(frameRate);
            return this;
        }
        public Builder frameRate(Double frameRate) {
            this.frameRate = Output.of(Objects.requireNonNull(frameRate));
            return this;
        }
        public Builder gopDuration(@Nullable Output<String> gopDuration) {
            this.gopDuration = gopDuration;
            return this;
        }
        public Builder gopDuration(@Nullable String gopDuration) {
            this.gopDuration = Codegen.ofNullable(gopDuration);
            return this;
        }
        public Builder gopFrameCount(@Nullable Output<Integer> gopFrameCount) {
            this.gopFrameCount = gopFrameCount;
            return this;
        }
        public Builder gopFrameCount(@Nullable Integer gopFrameCount) {
            this.gopFrameCount = Codegen.ofNullable(gopFrameCount);
            return this;
        }
        public Builder heightPixels(@Nullable Output<Integer> heightPixels) {
            this.heightPixels = heightPixels;
            return this;
        }
        public Builder heightPixels(@Nullable Integer heightPixels) {
            this.heightPixels = Codegen.ofNullable(heightPixels);
            return this;
        }
        public Builder pixelFormat(@Nullable Output<String> pixelFormat) {
            this.pixelFormat = pixelFormat;
            return this;
        }
        public Builder pixelFormat(@Nullable String pixelFormat) {
            this.pixelFormat = Codegen.ofNullable(pixelFormat);
            return this;
        }
        public Builder preset(@Nullable Output<String> preset) {
            this.preset = preset;
            return this;
        }
        public Builder preset(@Nullable String preset) {
            this.preset = Codegen.ofNullable(preset);
            return this;
        }
        public Builder profile(@Nullable Output<String> profile) {
            this.profile = profile;
            return this;
        }
        public Builder profile(@Nullable String profile) {
            this.profile = Codegen.ofNullable(profile);
            return this;
        }
        public Builder rateControlMode(@Nullable Output<String> rateControlMode) {
            this.rateControlMode = rateControlMode;
            return this;
        }
        public Builder rateControlMode(@Nullable String rateControlMode) {
            this.rateControlMode = Codegen.ofNullable(rateControlMode);
            return this;
        }
        public Builder tune(@Nullable Output<String> tune) {
            this.tune = tune;
            return this;
        }
        public Builder tune(@Nullable String tune) {
            this.tune = Codegen.ofNullable(tune);
            return this;
        }
        public Builder vbvFullnessBits(@Nullable Output<Integer> vbvFullnessBits) {
            this.vbvFullnessBits = vbvFullnessBits;
            return this;
        }
        public Builder vbvFullnessBits(@Nullable Integer vbvFullnessBits) {
            this.vbvFullnessBits = Codegen.ofNullable(vbvFullnessBits);
            return this;
        }
        public Builder vbvSizeBits(@Nullable Output<Integer> vbvSizeBits) {
            this.vbvSizeBits = vbvSizeBits;
            return this;
        }
        public Builder vbvSizeBits(@Nullable Integer vbvSizeBits) {
            this.vbvSizeBits = Codegen.ofNullable(vbvSizeBits);
            return this;
        }
        public Builder widthPixels(@Nullable Output<Integer> widthPixels) {
            this.widthPixels = widthPixels;
            return this;
        }
        public Builder widthPixels(@Nullable Integer widthPixels) {
            this.widthPixels = Codegen.ofNullable(widthPixels);
            return this;
        }        public H265CodecSettingsArgs build() {
            return new H265CodecSettingsArgs(allowOpenGop, aqStrength, bFrameCount, bPyramid, bitrateBps, crfLevel, enableTwoPass, frameRate, gopDuration, gopFrameCount, heightPixels, pixelFormat, preset, profile, rateControlMode, tune, vbvFullnessBits, vbvSizeBits, widthPixels);
        }
    }
}
