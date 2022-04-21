// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.transcoder_v1.inputs.AudioStreamResponse;
import com.pulumi.googlenative.transcoder_v1.inputs.TextStreamResponse;
import com.pulumi.googlenative.transcoder_v1.inputs.VideoStreamResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Encoding of an input file such as an audio, video, or text track. Elementary streams must be packaged before mapping and sharing between different output formats.
 * 
 */
public final class ElementaryStreamResponse extends com.pulumi.resources.InvokeArgs {

    public static final ElementaryStreamResponse Empty = new ElementaryStreamResponse();

    /**
     * Encoding of an audio stream.
     * 
     */
    @Import(name="audioStream", required=true)
    private AudioStreamResponse audioStream;

    public AudioStreamResponse audioStream() {
        return this.audioStream;
    }

    /**
     * A unique key for this elementary stream.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    /**
     * Encoding of a text stream. For example, closed captions or subtitles.
     * 
     */
    @Import(name="textStream", required=true)
    private TextStreamResponse textStream;

    public TextStreamResponse textStream() {
        return this.textStream;
    }

    /**
     * Encoding of a video stream.
     * 
     */
    @Import(name="videoStream", required=true)
    private VideoStreamResponse videoStream;

    public VideoStreamResponse videoStream() {
        return this.videoStream;
    }

    private ElementaryStreamResponse() {}

    private ElementaryStreamResponse(ElementaryStreamResponse $) {
        this.audioStream = $.audioStream;
        this.key = $.key;
        this.textStream = $.textStream;
        this.videoStream = $.videoStream;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElementaryStreamResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElementaryStreamResponse $;

        public Builder() {
            $ = new ElementaryStreamResponse();
        }

        public Builder(ElementaryStreamResponse defaults) {
            $ = new ElementaryStreamResponse(Objects.requireNonNull(defaults));
        }

        public Builder audioStream(AudioStreamResponse audioStream) {
            $.audioStream = audioStream;
            return this;
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder textStream(TextStreamResponse textStream) {
            $.textStream = textStream;
            return this;
        }

        public Builder videoStream(VideoStreamResponse videoStream) {
            $.videoStream = videoStream;
            return this;
        }

        public ElementaryStreamResponse build() {
            $.audioStream = Objects.requireNonNull($.audioStream, "expected parameter 'audioStream' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.textStream = Objects.requireNonNull($.textStream, "expected parameter 'textStream' to be non-null");
            $.videoStream = Objects.requireNonNull($.videoStream, "expected parameter 'videoStream' to be non-null");
            return $;
        }
    }

}
