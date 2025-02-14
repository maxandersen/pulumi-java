// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageImageArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The basic card message. Useful for displaying information.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs();

    /**
     * Optional. The collection of card buttons.
     * 
     */
    @Import(name="buttons")
    private @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> buttons;

    /**
     * @return Optional. The collection of card buttons.
     * 
     */
    public Optional<Output<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>>> buttons() {
        return Optional.ofNullable(this.buttons);
    }

    /**
     * Required, unless image is present. The body text of the card.
     * 
     */
    @Import(name="formattedText")
    private @Nullable Output<String> formattedText;

    /**
     * @return Required, unless image is present. The body text of the card.
     * 
     */
    public Optional<Output<String>> formattedText() {
        return Optional.ofNullable(this.formattedText);
    }

    /**
     * Optional. The image for the card.
     * 
     */
    @Import(name="image")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image;

    /**
     * @return Optional. The image for the card.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Optional. The subtitle of the card.
     * 
     */
    @Import(name="subtitle")
    private @Nullable Output<String> subtitle;

    /**
     * @return Optional. The subtitle of the card.
     * 
     */
    public Optional<Output<String>> subtitle() {
        return Optional.ofNullable(this.subtitle);
    }

    /**
     * Optional. The title of the card.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Optional. The title of the card.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs(GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs $) {
        this.buttons = $.buttons;
        this.formattedText = $.formattedText;
        this.image = $.image;
        this.subtitle = $.subtitle;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buttons Optional. The collection of card buttons.
         * 
         * @return builder
         * 
         */
        public Builder buttons(@Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> buttons) {
            $.buttons = buttons;
            return this;
        }

        /**
         * @param buttons Optional. The collection of card buttons.
         * 
         * @return builder
         * 
         */
        public Builder buttons(List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs> buttons) {
            return buttons(Output.of(buttons));
        }

        /**
         * @param buttons Optional. The collection of card buttons.
         * 
         * @return builder
         * 
         */
        public Builder buttons(GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs... buttons) {
            return buttons(List.of(buttons));
        }

        /**
         * @param formattedText Required, unless image is present. The body text of the card.
         * 
         * @return builder
         * 
         */
        public Builder formattedText(@Nullable Output<String> formattedText) {
            $.formattedText = formattedText;
            return this;
        }

        /**
         * @param formattedText Required, unless image is present. The body text of the card.
         * 
         * @return builder
         * 
         */
        public Builder formattedText(String formattedText) {
            return formattedText(Output.of(formattedText));
        }

        /**
         * @param image Optional. The image for the card.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Optional. The image for the card.
         * 
         * @return builder
         * 
         */
        public Builder image(GoogleCloudDialogflowV2beta1IntentMessageImageArgs image) {
            return image(Output.of(image));
        }

        /**
         * @param subtitle Optional. The subtitle of the card.
         * 
         * @return builder
         * 
         */
        public Builder subtitle(@Nullable Output<String> subtitle) {
            $.subtitle = subtitle;
            return this;
        }

        /**
         * @param subtitle Optional. The subtitle of the card.
         * 
         * @return builder
         * 
         */
        public Builder subtitle(String subtitle) {
            return subtitle(Output.of(subtitle));
        }

        /**
         * @param title Optional. The title of the card.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Optional. The title of the card.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageBasicCardArgs build() {
            return $;
        }
    }

}
