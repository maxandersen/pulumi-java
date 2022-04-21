// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse();

    /**
     * Whether the playback of this message can be interrupted by the end user&#39;s speech and the client can then starts the next Dialogflow request.
     * 
     */
    @Import(name="allowPlaybackInterruption", required=true)
    private Boolean allowPlaybackInterruption;

    public Boolean allowPlaybackInterruption() {
        return this.allowPlaybackInterruption;
    }

    /**
     * The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-speech/docs/ssml).
     * 
     */
    @Import(name="ssml", required=true)
    private String ssml;

    public String ssml() {
        return this.ssml;
    }

    /**
     * The raw text to be synthesized.
     * 
     */
    @Import(name="text", required=true)
    private String text;

    public String text() {
        return this.text;
    }

    private GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse() {}

    private GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse(GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse $) {
        this.allowPlaybackInterruption = $.allowPlaybackInterruption;
        this.ssml = $.ssml;
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse(Objects.requireNonNull(defaults));
        }

        public Builder allowPlaybackInterruption(Boolean allowPlaybackInterruption) {
            $.allowPlaybackInterruption = allowPlaybackInterruption;
            return this;
        }

        public Builder ssml(String ssml) {
            $.ssml = ssml;
            return this;
        }

        public Builder text(String text) {
            $.text = text;
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse build() {
            $.allowPlaybackInterruption = Objects.requireNonNull($.allowPlaybackInterruption, "expected parameter 'allowPlaybackInterruption' to be non-null");
            $.ssml = Objects.requireNonNull($.ssml, "expected parameter 'ssml' to be non-null");
            $.text = Objects.requireNonNull($.text, "expected parameter 'text' to be non-null");
            return $;
        }
    }

}
