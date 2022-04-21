// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.transcoder_v1.inputs.TextMappingResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Encoding of a text stream. For example, closed captions or subtitles.
 * 
 */
public final class TextStreamResponse extends com.pulumi.resources.InvokeArgs {

    public static final TextStreamResponse Empty = new TextStreamResponse();

    /**
     * The codec for this text stream. The default is `webvtt`. Supported text codecs: - `srt` - `ttml` - `cea608` - `cea708` - `webvtt`
     * 
     */
    @Import(name="codec", required=true)
    private String codec;

    public String codec() {
        return this.codec;
    }

    /**
     * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
     * 
     */
    @Import(name="mapping", required=true)
    private List<TextMappingResponse> mapping;

    public List<TextMappingResponse> mapping() {
        return this.mapping;
    }

    private TextStreamResponse() {}

    private TextStreamResponse(TextStreamResponse $) {
        this.codec = $.codec;
        this.mapping = $.mapping;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TextStreamResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TextStreamResponse $;

        public Builder() {
            $ = new TextStreamResponse();
        }

        public Builder(TextStreamResponse defaults) {
            $ = new TextStreamResponse(Objects.requireNonNull(defaults));
        }

        public Builder codec(String codec) {
            $.codec = codec;
            return this;
        }

        public Builder mapping(List<TextMappingResponse> mapping) {
            $.mapping = mapping;
            return this;
        }

        public Builder mapping(TextMappingResponse... mapping) {
            return mapping(List.of(mapping));
        }

        public TextStreamResponse build() {
            $.codec = Objects.requireNonNull($.codec, "expected parameter 'codec' to be non-null");
            $.mapping = Objects.requireNonNull($.mapping, "expected parameter 'mapping' to be non-null");
            return $;
        }
    }

}
