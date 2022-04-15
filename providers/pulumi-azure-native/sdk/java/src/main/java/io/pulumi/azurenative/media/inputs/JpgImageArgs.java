// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.StretchMode;
import io.pulumi.azurenative.media.enums.VideoSyncMode;
import io.pulumi.azurenative.media.inputs.JpgLayerArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the properties for producing a series of JPEG images from the input video.
 * 
 */
public final class JpgImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final JpgImageArgs Empty = new JpgImageArgs();

    /**
     * The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    @Import(name="keyFrameInterval")
      private final @Nullable Output<String> keyFrameInterval;

    public Output<String> keyFrameInterval() {
        return this.keyFrameInterval == null ? Codegen.empty() : this.keyFrameInterval;
    }

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @Import(name="label")
      private final @Nullable Output<String> label;

    public Output<String> label() {
        return this.label == null ? Codegen.empty() : this.label;
    }

    /**
     * A collection of output JPEG image layers to be produced by the encoder.
     * 
     */
    @Import(name="layers")
      private final @Nullable Output<List<JpgLayerArgs>> layers;

    public Output<List<JpgLayerArgs>> layers() {
        return this.layers == null ? Codegen.empty() : this.layers;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JpgImage'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * The position relative to transform preset start time in the input video at which to stop generating thumbnails. The value can be in ISO 8601 format (For example, PT5M30S to stop at 5 minutes and 30 seconds from start time), or a frame count (For example, 300 to stop at the 300th frame from the frame at start time. If this value is 1, it means only producing one thumbnail at start time), or a relative value to the stream duration (For example, 50% to stop at half of stream duration from start time). The default value is 100%, which means to stop at the end of the stream.
     * 
     */
    @Import(name="range")
      private final @Nullable Output<String> range;

    public Output<String> range() {
        return this.range == null ? Codegen.empty() : this.range;
    }

    /**
     * Sets the number of columns used in thumbnail sprite image.  The number of rows are automatically calculated and a VTT file is generated with the coordinate mappings for each thumbnail in the sprite. Note: this value should be a positive integer and a proper value is recommended so that the output image resolution will not go beyond JPEG maximum pixel resolution limit 65535x65535.
     * 
     */
    @Import(name="spriteColumn")
      private final @Nullable Output<Integer> spriteColumn;

    public Output<Integer> spriteColumn() {
        return this.spriteColumn == null ? Codegen.empty() : this.spriteColumn;
    }

    /**
     * The position in the input video from where to start generating thumbnails. The value can be in ISO 8601 format (For example, PT05S to start at 5 seconds), or a frame count (For example, 10 to start at the 10th frame), or a relative value to stream duration (For example, 10% to start at 10% of stream duration). Also supports a macro {Best}, which tells the encoder to select the best thumbnail from the first few seconds of the video and will only produce one thumbnail, no matter what other settings are for Step and Range. The default value is macro {Best}.
     * 
     */
    @Import(name="start", required=true)
      private final Output<String> start;

    public Output<String> start() {
        return this.start;
    }

    /**
     * The intervals at which thumbnails are generated. The value can be in ISO 8601 format (For example, PT05S for one image every 5 seconds), or a frame count (For example, 30 for one image every 30 frames), or a relative value to stream duration (For example, 10% for one image every 10% of stream duration). Note: Step value will affect the first generated thumbnail, which may not be exactly the one specified at transform preset start time. This is due to the encoder, which tries to select the best thumbnail between start time and Step position from start time as the first output. As the default value is 10%, it means if stream has long duration, the first generated thumbnail might be far away from the one specified at start time. Try to select reasonable value for Step if the first thumbnail is expected close to start time, or set Range value at 1 if only one thumbnail is needed at start time.
     * 
     */
    @Import(name="step")
      private final @Nullable Output<String> step;

    public Output<String> step() {
        return this.step == null ? Codegen.empty() : this.step;
    }

    /**
     * The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
     */
    @Import(name="stretchMode")
      private final @Nullable Output<Either<String,StretchMode>> stretchMode;

    public Output<Either<String,StretchMode>> stretchMode() {
        return this.stretchMode == null ? Codegen.empty() : this.stretchMode;
    }

    /**
     * The Video Sync Mode
     * 
     */
    @Import(name="syncMode")
      private final @Nullable Output<Either<String,VideoSyncMode>> syncMode;

    public Output<Either<String,VideoSyncMode>> syncMode() {
        return this.syncMode == null ? Codegen.empty() : this.syncMode;
    }

    public JpgImageArgs(
        @Nullable Output<String> keyFrameInterval,
        @Nullable Output<String> label,
        @Nullable Output<List<JpgLayerArgs>> layers,
        Output<String> odataType,
        @Nullable Output<String> range,
        @Nullable Output<Integer> spriteColumn,
        Output<String> start,
        @Nullable Output<String> step,
        @Nullable Output<Either<String,StretchMode>> stretchMode,
        @Nullable Output<Either<String,VideoSyncMode>> syncMode) {
        this.keyFrameInterval = keyFrameInterval;
        this.label = label;
        this.layers = layers;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.range = range;
        this.spriteColumn = spriteColumn;
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
        this.step = step;
        this.stretchMode = stretchMode;
        this.syncMode = syncMode;
    }

    private JpgImageArgs() {
        this.keyFrameInterval = Codegen.empty();
        this.label = Codegen.empty();
        this.layers = Codegen.empty();
        this.odataType = Codegen.empty();
        this.range = Codegen.empty();
        this.spriteColumn = Codegen.empty();
        this.start = Codegen.empty();
        this.step = Codegen.empty();
        this.stretchMode = Codegen.empty();
        this.syncMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JpgImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyFrameInterval;
        private @Nullable Output<String> label;
        private @Nullable Output<List<JpgLayerArgs>> layers;
        private Output<String> odataType;
        private @Nullable Output<String> range;
        private @Nullable Output<Integer> spriteColumn;
        private Output<String> start;
        private @Nullable Output<String> step;
        private @Nullable Output<Either<String,StretchMode>> stretchMode;
        private @Nullable Output<Either<String,VideoSyncMode>> syncMode;

        public Builder() {
    	      // Empty
        }

        public Builder(JpgImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.label = defaults.label;
    	      this.layers = defaults.layers;
    	      this.odataType = defaults.odataType;
    	      this.range = defaults.range;
    	      this.spriteColumn = defaults.spriteColumn;
    	      this.start = defaults.start;
    	      this.step = defaults.step;
    	      this.stretchMode = defaults.stretchMode;
    	      this.syncMode = defaults.syncMode;
        }

        public Builder keyFrameInterval(@Nullable Output<String> keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }
        public Builder keyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = Codegen.ofNullable(keyFrameInterval);
            return this;
        }
        public Builder label(@Nullable Output<String> label) {
            this.label = label;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = Codegen.ofNullable(label);
            return this;
        }
        public Builder layers(@Nullable Output<List<JpgLayerArgs>> layers) {
            this.layers = layers;
            return this;
        }
        public Builder layers(@Nullable List<JpgLayerArgs> layers) {
            this.layers = Codegen.ofNullable(layers);
            return this;
        }
        public Builder layers(JpgLayerArgs... layers) {
            return layers(List.of(layers));
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder range(@Nullable Output<String> range) {
            this.range = range;
            return this;
        }
        public Builder range(@Nullable String range) {
            this.range = Codegen.ofNullable(range);
            return this;
        }
        public Builder spriteColumn(@Nullable Output<Integer> spriteColumn) {
            this.spriteColumn = spriteColumn;
            return this;
        }
        public Builder spriteColumn(@Nullable Integer spriteColumn) {
            this.spriteColumn = Codegen.ofNullable(spriteColumn);
            return this;
        }
        public Builder start(Output<String> start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public Builder start(String start) {
            this.start = Output.of(Objects.requireNonNull(start));
            return this;
        }
        public Builder step(@Nullable Output<String> step) {
            this.step = step;
            return this;
        }
        public Builder step(@Nullable String step) {
            this.step = Codegen.ofNullable(step);
            return this;
        }
        public Builder stretchMode(@Nullable Output<Either<String,StretchMode>> stretchMode) {
            this.stretchMode = stretchMode;
            return this;
        }
        public Builder stretchMode(@Nullable Either<String,StretchMode> stretchMode) {
            this.stretchMode = Codegen.ofNullable(stretchMode);
            return this;
        }
        public Builder syncMode(@Nullable Output<Either<String,VideoSyncMode>> syncMode) {
            this.syncMode = syncMode;
            return this;
        }
        public Builder syncMode(@Nullable Either<String,VideoSyncMode> syncMode) {
            this.syncMode = Codegen.ofNullable(syncMode);
            return this;
        }        public JpgImageArgs build() {
            return new JpgImageArgs(keyFrameInterval, label, layers, odataType, range, spriteColumn, start, step, stretchMode, syncMode);
        }
    }
}
