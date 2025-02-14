// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.transcoder_v1.inputs.H264CodecSettingsArgs;
import com.pulumi.googlenative.transcoder_v1.inputs.H265CodecSettingsArgs;
import com.pulumi.googlenative.transcoder_v1.inputs.Vp9CodecSettingsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Video stream resource.
 * 
 */
public final class VideoStreamArgs extends com.pulumi.resources.ResourceArgs {

    public static final VideoStreamArgs Empty = new VideoStreamArgs();

    /**
     * H264 codec settings.
     * 
     */
    @Import(name="h264")
    private @Nullable Output<H264CodecSettingsArgs> h264;

    /**
     * @return H264 codec settings.
     * 
     */
    public Optional<Output<H264CodecSettingsArgs>> h264() {
        return Optional.ofNullable(this.h264);
    }

    /**
     * H265 codec settings.
     * 
     */
    @Import(name="h265")
    private @Nullable Output<H265CodecSettingsArgs> h265;

    /**
     * @return H265 codec settings.
     * 
     */
    public Optional<Output<H265CodecSettingsArgs>> h265() {
        return Optional.ofNullable(this.h265);
    }

    /**
     * VP9 codec settings.
     * 
     */
    @Import(name="vp9")
    private @Nullable Output<Vp9CodecSettingsArgs> vp9;

    /**
     * @return VP9 codec settings.
     * 
     */
    public Optional<Output<Vp9CodecSettingsArgs>> vp9() {
        return Optional.ofNullable(this.vp9);
    }

    private VideoStreamArgs() {}

    private VideoStreamArgs(VideoStreamArgs $) {
        this.h264 = $.h264;
        this.h265 = $.h265;
        this.vp9 = $.vp9;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VideoStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VideoStreamArgs $;

        public Builder() {
            $ = new VideoStreamArgs();
        }

        public Builder(VideoStreamArgs defaults) {
            $ = new VideoStreamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param h264 H264 codec settings.
         * 
         * @return builder
         * 
         */
        public Builder h264(@Nullable Output<H264CodecSettingsArgs> h264) {
            $.h264 = h264;
            return this;
        }

        /**
         * @param h264 H264 codec settings.
         * 
         * @return builder
         * 
         */
        public Builder h264(H264CodecSettingsArgs h264) {
            return h264(Output.of(h264));
        }

        /**
         * @param h265 H265 codec settings.
         * 
         * @return builder
         * 
         */
        public Builder h265(@Nullable Output<H265CodecSettingsArgs> h265) {
            $.h265 = h265;
            return this;
        }

        /**
         * @param h265 H265 codec settings.
         * 
         * @return builder
         * 
         */
        public Builder h265(H265CodecSettingsArgs h265) {
            return h265(Output.of(h265));
        }

        /**
         * @param vp9 VP9 codec settings.
         * 
         * @return builder
         * 
         */
        public Builder vp9(@Nullable Output<Vp9CodecSettingsArgs> vp9) {
            $.vp9 = vp9;
            return this;
        }

        /**
         * @param vp9 VP9 codec settings.
         * 
         * @return builder
         * 
         */
        public Builder vp9(Vp9CodecSettingsArgs vp9) {
            return vp9(Output.of(vp9));
        }

        public VideoStreamArgs build() {
            return $;
        }
    }

}
