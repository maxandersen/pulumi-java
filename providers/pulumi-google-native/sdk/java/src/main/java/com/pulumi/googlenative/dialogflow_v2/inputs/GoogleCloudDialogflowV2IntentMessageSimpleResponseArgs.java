// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The simple response message containing speech or text.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageSimpleResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageSimpleResponseArgs Empty = new GoogleCloudDialogflowV2IntentMessageSimpleResponseArgs();

    /**
     * Optional. The text to display.
     * 
     */
    @Import(name="displayText")
    private @Nullable Output<String> displayText;

    public Optional<Output<String>> displayText() {
        return Optional.ofNullable(this.displayText);
    }

    /**
     * One of text_to_speech or ssml must be provided. Structured spoken response to the user in the SSML format. Mutually exclusive with text_to_speech.
     * 
     */
    @Import(name="ssml")
    private @Nullable Output<String> ssml;

    public Optional<Output<String>> ssml() {
        return Optional.ofNullable(this.ssml);
    }

    /**
     * One of text_to_speech or ssml must be provided. The plain text of the speech output. Mutually exclusive with ssml.
     * 
     */
    @Import(name="textToSpeech")
    private @Nullable Output<String> textToSpeech;

    public Optional<Output<String>> textToSpeech() {
        return Optional.ofNullable(this.textToSpeech);
    }

    private GoogleCloudDialogflowV2IntentMessageSimpleResponseArgs() {}

    private GoogleCloudDialogflowV2IntentMessageSimpleResponseArgs(GoogleCloudDialogflowV2IntentMessageSimpleResponseArgs $) {
        this.displayText = $.displayText;
        this.ssml = $.ssml;
        this.textToSpeech = $.textToSpeech;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageSimpleResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageSimpleResponseArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageSimpleResponseArgs();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageSimpleResponseArgs defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageSimpleResponseArgs(Objects.requireNonNull(defaults));
        }

        public Builder displayText(@Nullable Output<String> displayText) {
            $.displayText = displayText;
            return this;
        }

        public Builder displayText(String displayText) {
            return displayText(Output.of(displayText));
        }

        public Builder ssml(@Nullable Output<String> ssml) {
            $.ssml = ssml;
            return this;
        }

        public Builder ssml(String ssml) {
            return ssml(Output.of(ssml));
        }

        public Builder textToSpeech(@Nullable Output<String> textToSpeech) {
            $.textToSpeech = textToSpeech;
            return this;
        }

        public Builder textToSpeech(String textToSpeech) {
            return textToSpeech(Output.of(textToSpeech));
        }

        public GoogleCloudDialogflowV2IntentMessageSimpleResponseArgs build() {
            return $;
        }
    }

}
