// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.H265Complexity;
import com.pulumi.azurenative.media.enums.StretchMode;
import com.pulumi.azurenative.media.enums.VideoSyncMode;
import com.pulumi.azurenative.media.inputs.H265LayerArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes all the properties for encoding a video with the H.265 codec.
 * 
 */
public final class H265VideoArgs extends com.pulumi.resources.ResourceArgs {

    public static final H265VideoArgs Empty = new H265VideoArgs();

    /**
     * Tells the encoder how to choose its encoding settings.  Quality will provide for a higher compression ratio but at a higher cost and longer compute time.  Speed will produce a relatively larger file but is faster and more economical. The default value is Balanced.
     * 
     */
    @Import(name="complexity")
      private final @Nullable Output<Either<String,H265Complexity>> complexity;

    public Output<Either<String,H265Complexity>> complexity() {
        return this.complexity == null ? Codegen.empty() : this.complexity;
    }

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
     * The collection of output H.265 layers to be produced by the encoder.
     * 
     */
    @Import(name="layers")
      private final @Nullable Output<List<H265LayerArgs>> layers;

    public Output<List<H265LayerArgs>> layers() {
        return this.layers == null ? Codegen.empty() : this.layers;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.H265Video&#39;.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * Specifies whether or not the encoder should insert key frames at scene changes. If not specified, the default is false. This flag should be set to true only when the encoder is being configured to produce a single output video.
     * 
     */
    @Import(name="sceneChangeDetection")
      private final @Nullable Output<Boolean> sceneChangeDetection;

    public Output<Boolean> sceneChangeDetection() {
        return this.sceneChangeDetection == null ? Codegen.empty() : this.sceneChangeDetection;
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

    public H265VideoArgs(
        @Nullable Output<Either<String,H265Complexity>> complexity,
        @Nullable Output<String> keyFrameInterval,
        @Nullable Output<String> label,
        @Nullable Output<List<H265LayerArgs>> layers,
        Output<String> odataType,
        @Nullable Output<Boolean> sceneChangeDetection,
        @Nullable Output<Either<String,StretchMode>> stretchMode,
        @Nullable Output<Either<String,VideoSyncMode>> syncMode) {
        this.complexity = complexity;
        this.keyFrameInterval = keyFrameInterval;
        this.label = label;
        this.layers = layers;
        this.odataType = Codegen.stringProp("odataType").output().arg(odataType).require();
        this.sceneChangeDetection = sceneChangeDetection;
        this.stretchMode = stretchMode;
        this.syncMode = syncMode;
    }

    private H265VideoArgs() {
        this.complexity = Codegen.empty();
        this.keyFrameInterval = Codegen.empty();
        this.label = Codegen.empty();
        this.layers = Codegen.empty();
        this.odataType = Codegen.empty();
        this.sceneChangeDetection = Codegen.empty();
        this.stretchMode = Codegen.empty();
        this.syncMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(H265VideoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,H265Complexity>> complexity;
        private @Nullable Output<String> keyFrameInterval;
        private @Nullable Output<String> label;
        private @Nullable Output<List<H265LayerArgs>> layers;
        private Output<String> odataType;
        private @Nullable Output<Boolean> sceneChangeDetection;
        private @Nullable Output<Either<String,StretchMode>> stretchMode;
        private @Nullable Output<Either<String,VideoSyncMode>> syncMode;

        public Builder() {
    	      // Empty
        }

        public Builder(H265VideoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complexity = defaults.complexity;
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.label = defaults.label;
    	      this.layers = defaults.layers;
    	      this.odataType = defaults.odataType;
    	      this.sceneChangeDetection = defaults.sceneChangeDetection;
    	      this.stretchMode = defaults.stretchMode;
    	      this.syncMode = defaults.syncMode;
        }

        public Builder complexity(@Nullable Output<Either<String,H265Complexity>> complexity) {
            this.complexity = complexity;
            return this;
        }
        public Builder complexity(@Nullable Either<String,H265Complexity> complexity) {
            this.complexity = Codegen.ofNullable(complexity);
            return this;
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
        public Builder layers(@Nullable Output<List<H265LayerArgs>> layers) {
            this.layers = layers;
            return this;
        }
        public Builder layers(@Nullable List<H265LayerArgs> layers) {
            this.layers = Codegen.ofNullable(layers);
            return this;
        }
        public Builder layers(H265LayerArgs... layers) {
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
        public Builder sceneChangeDetection(@Nullable Output<Boolean> sceneChangeDetection) {
            this.sceneChangeDetection = sceneChangeDetection;
            return this;
        }
        public Builder sceneChangeDetection(@Nullable Boolean sceneChangeDetection) {
            this.sceneChangeDetection = Codegen.ofNullable(sceneChangeDetection);
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
        }        public H265VideoArgs build() {
            return new H265VideoArgs(complexity, keyFrameInterval, label, layers, odataType, sceneChangeDetection, stretchMode, syncMode);
        }
    }
}
