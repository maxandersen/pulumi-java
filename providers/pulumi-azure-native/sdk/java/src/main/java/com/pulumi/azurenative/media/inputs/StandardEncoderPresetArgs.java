// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.AacAudioArgs;
import com.pulumi.azurenative.media.inputs.AudioArgs;
import com.pulumi.azurenative.media.inputs.CopyAudioArgs;
import com.pulumi.azurenative.media.inputs.CopyVideoArgs;
import com.pulumi.azurenative.media.inputs.FiltersArgs;
import com.pulumi.azurenative.media.inputs.H264VideoArgs;
import com.pulumi.azurenative.media.inputs.H265VideoArgs;
import com.pulumi.azurenative.media.inputs.ImageArgs;
import com.pulumi.azurenative.media.inputs.ImageFormatArgs;
import com.pulumi.azurenative.media.inputs.JpgFormatArgs;
import com.pulumi.azurenative.media.inputs.JpgImageArgs;
import com.pulumi.azurenative.media.inputs.Mp4FormatArgs;
import com.pulumi.azurenative.media.inputs.MultiBitrateFormatArgs;
import com.pulumi.azurenative.media.inputs.PngFormatArgs;
import com.pulumi.azurenative.media.inputs.PngImageArgs;
import com.pulumi.azurenative.media.inputs.TransportStreamFormatArgs;
import com.pulumi.azurenative.media.inputs.VideoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes all the settings to be used when encoding the input video with the Standard Encoder.
 * 
 */
public final class StandardEncoderPresetArgs extends ResourceArgs {

    public static final StandardEncoderPresetArgs Empty = new StandardEncoderPresetArgs();

    /**
     * The list of codecs to be used when encoding the input video.
     * 
     */
    @Import(name="codecs", required=true)
    private Output<List<Object>> codecs;

    /**
     * @return The list of codecs to be used when encoding the input video.
     * 
     */
    public Output<List<Object>> codecs() {
        return this.codecs;
    }

    /**
     * One or more filtering operations that are applied to the input media before encoding.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<FiltersArgs> filters;

    /**
     * @return One or more filtering operations that are applied to the input media before encoding.
     * 
     */
    public Optional<Output<FiltersArgs>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The list of outputs to be produced by the encoder.
     * 
     */
    @Import(name="formats", required=true)
    private Output<List<Object>> formats;

    /**
     * @return The list of outputs to be produced by the encoder.
     * 
     */
    public Output<List<Object>> formats() {
        return this.formats;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.StandardEncoderPreset&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.StandardEncoderPreset&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    private StandardEncoderPresetArgs() {}

    private StandardEncoderPresetArgs(StandardEncoderPresetArgs $) {
        this.codecs = $.codecs;
        this.filters = $.filters;
        this.formats = $.formats;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardEncoderPresetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardEncoderPresetArgs $;

        public Builder() {
            $ = new StandardEncoderPresetArgs();
        }

        public Builder(StandardEncoderPresetArgs defaults) {
            $ = new StandardEncoderPresetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param codecs The list of codecs to be used when encoding the input video.
         * 
         * @return builder
         * 
         */
        public Builder codecs(Output<List<Object>> codecs) {
            $.codecs = codecs;
            return this;
        }

        /**
         * @param codecs The list of codecs to be used when encoding the input video.
         * 
         * @return builder
         * 
         */
        public Builder codecs(List<Object> codecs) {
            return codecs(Output.of(codecs));
        }

        /**
         * @param codecs The list of codecs to be used when encoding the input video.
         * 
         * @return builder
         * 
         */
        public Builder codecs(Object... codecs) {
            return codecs(List.of(codecs));
        }

        /**
         * @param filters One or more filtering operations that are applied to the input media before encoding.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<FiltersArgs> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more filtering operations that are applied to the input media before encoding.
         * 
         * @return builder
         * 
         */
        public Builder filters(FiltersArgs filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param formats The list of outputs to be produced by the encoder.
         * 
         * @return builder
         * 
         */
        public Builder formats(Output<List<Object>> formats) {
            $.formats = formats;
            return this;
        }

        /**
         * @param formats The list of outputs to be produced by the encoder.
         * 
         * @return builder
         * 
         */
        public Builder formats(List<Object> formats) {
            return formats(Output.of(formats));
        }

        /**
         * @param formats The list of outputs to be produced by the encoder.
         * 
         * @return builder
         * 
         */
        public Builder formats(Object... formats) {
            return formats(List.of(formats));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.StandardEncoderPreset&#39;.
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
         * Expected value is &#39;#Microsoft.Media.StandardEncoderPreset&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public StandardEncoderPresetArgs build() {
            $.codecs = Objects.requireNonNull($.codecs, "expected parameter 'codecs' to be non-null");
            $.formats = Objects.requireNonNull($.formats, "expected parameter 'formats' to be non-null");
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
