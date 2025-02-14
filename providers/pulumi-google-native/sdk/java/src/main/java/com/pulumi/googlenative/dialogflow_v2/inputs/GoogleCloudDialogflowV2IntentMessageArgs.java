// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.enums.GoogleCloudDialogflowV2IntentMessagePlatform;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageBasicCardArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageCardArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageImageArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageListSelectArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageMediaContentArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageQuickRepliesArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageSimpleResponsesArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageSuggestionsArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageTableCardArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageTextArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rich response message. Corresponds to the intent `Response` field in the Dialogflow console. For more information, see [Rich response messages](https://cloud.google.com/dialogflow/docs/intents-rich-messages).
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageArgs Empty = new GoogleCloudDialogflowV2IntentMessageArgs();

    /**
     * The basic card response for Actions on Google.
     * 
     */
    @Import(name="basicCard")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageBasicCardArgs> basicCard;

    /**
     * @return The basic card response for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageBasicCardArgs>> basicCard() {
        return Optional.ofNullable(this.basicCard);
    }

    /**
     * Browse carousel card for Actions on Google.
     * 
     */
    @Import(name="browseCarouselCard")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardArgs> browseCarouselCard;

    /**
     * @return Browse carousel card for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardArgs>> browseCarouselCard() {
        return Optional.ofNullable(this.browseCarouselCard);
    }

    /**
     * The card response.
     * 
     */
    @Import(name="card")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageCardArgs> card;

    /**
     * @return The card response.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageCardArgs>> card() {
        return Optional.ofNullable(this.card);
    }

    /**
     * The carousel card response for Actions on Google.
     * 
     */
    @Import(name="carouselSelect")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs> carouselSelect;

    /**
     * @return The carousel card response for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs>> carouselSelect() {
        return Optional.ofNullable(this.carouselSelect);
    }

    /**
     * The image response.
     * 
     */
    @Import(name="image")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> image;

    /**
     * @return The image response.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageImageArgs>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * The link out suggestion chip for Actions on Google.
     * 
     */
    @Import(name="linkOutSuggestion")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionArgs> linkOutSuggestion;

    /**
     * @return The link out suggestion chip for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionArgs>> linkOutSuggestion() {
        return Optional.ofNullable(this.linkOutSuggestion);
    }

    /**
     * The list card response for Actions on Google.
     * 
     */
    @Import(name="listSelect")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageListSelectArgs> listSelect;

    /**
     * @return The list card response for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageListSelectArgs>> listSelect() {
        return Optional.ofNullable(this.listSelect);
    }

    /**
     * The media content card for Actions on Google.
     * 
     */
    @Import(name="mediaContent")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageMediaContentArgs> mediaContent;

    /**
     * @return The media content card for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageMediaContentArgs>> mediaContent() {
        return Optional.ofNullable(this.mediaContent);
    }

    /**
     * A custom platform-specific response.
     * 
     */
    @Import(name="payload")
    private @Nullable Output<Map<String,String>> payload;

    /**
     * @return A custom platform-specific response.
     * 
     */
    public Optional<Output<Map<String,String>>> payload() {
        return Optional.ofNullable(this.payload);
    }

    /**
     * Optional. The platform that this message is intended for.
     * 
     */
    @Import(name="platform")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessagePlatform> platform;

    /**
     * @return Optional. The platform that this message is intended for.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessagePlatform>> platform() {
        return Optional.ofNullable(this.platform);
    }

    /**
     * The quick replies response.
     * 
     */
    @Import(name="quickReplies")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageQuickRepliesArgs> quickReplies;

    /**
     * @return The quick replies response.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageQuickRepliesArgs>> quickReplies() {
        return Optional.ofNullable(this.quickReplies);
    }

    /**
     * The voice and text-only responses for Actions on Google.
     * 
     */
    @Import(name="simpleResponses")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageSimpleResponsesArgs> simpleResponses;

    /**
     * @return The voice and text-only responses for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageSimpleResponsesArgs>> simpleResponses() {
        return Optional.ofNullable(this.simpleResponses);
    }

    /**
     * The suggestion chips for Actions on Google.
     * 
     */
    @Import(name="suggestions")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageSuggestionsArgs> suggestions;

    /**
     * @return The suggestion chips for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageSuggestionsArgs>> suggestions() {
        return Optional.ofNullable(this.suggestions);
    }

    /**
     * Table card for Actions on Google.
     * 
     */
    @Import(name="tableCard")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageTableCardArgs> tableCard;

    /**
     * @return Table card for Actions on Google.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageTableCardArgs>> tableCard() {
        return Optional.ofNullable(this.tableCard);
    }

    /**
     * The text response.
     * 
     */
    @Import(name="text")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageTextArgs> text;

    /**
     * @return The text response.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageTextArgs>> text() {
        return Optional.ofNullable(this.text);
    }

    private GoogleCloudDialogflowV2IntentMessageArgs() {}

    private GoogleCloudDialogflowV2IntentMessageArgs(GoogleCloudDialogflowV2IntentMessageArgs $) {
        this.basicCard = $.basicCard;
        this.browseCarouselCard = $.browseCarouselCard;
        this.card = $.card;
        this.carouselSelect = $.carouselSelect;
        this.image = $.image;
        this.linkOutSuggestion = $.linkOutSuggestion;
        this.listSelect = $.listSelect;
        this.mediaContent = $.mediaContent;
        this.payload = $.payload;
        this.platform = $.platform;
        this.quickReplies = $.quickReplies;
        this.simpleResponses = $.simpleResponses;
        this.suggestions = $.suggestions;
        this.tableCard = $.tableCard;
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageArgs();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageArgs defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param basicCard The basic card response for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder basicCard(@Nullable Output<GoogleCloudDialogflowV2IntentMessageBasicCardArgs> basicCard) {
            $.basicCard = basicCard;
            return this;
        }

        /**
         * @param basicCard The basic card response for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder basicCard(GoogleCloudDialogflowV2IntentMessageBasicCardArgs basicCard) {
            return basicCard(Output.of(basicCard));
        }

        /**
         * @param browseCarouselCard Browse carousel card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder browseCarouselCard(@Nullable Output<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardArgs> browseCarouselCard) {
            $.browseCarouselCard = browseCarouselCard;
            return this;
        }

        /**
         * @param browseCarouselCard Browse carousel card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder browseCarouselCard(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardArgs browseCarouselCard) {
            return browseCarouselCard(Output.of(browseCarouselCard));
        }

        /**
         * @param card The card response.
         * 
         * @return builder
         * 
         */
        public Builder card(@Nullable Output<GoogleCloudDialogflowV2IntentMessageCardArgs> card) {
            $.card = card;
            return this;
        }

        /**
         * @param card The card response.
         * 
         * @return builder
         * 
         */
        public Builder card(GoogleCloudDialogflowV2IntentMessageCardArgs card) {
            return card(Output.of(card));
        }

        /**
         * @param carouselSelect The carousel card response for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder carouselSelect(@Nullable Output<GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs> carouselSelect) {
            $.carouselSelect = carouselSelect;
            return this;
        }

        /**
         * @param carouselSelect The carousel card response for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder carouselSelect(GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs carouselSelect) {
            return carouselSelect(Output.of(carouselSelect));
        }

        /**
         * @param image The image response.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image The image response.
         * 
         * @return builder
         * 
         */
        public Builder image(GoogleCloudDialogflowV2IntentMessageImageArgs image) {
            return image(Output.of(image));
        }

        /**
         * @param linkOutSuggestion The link out suggestion chip for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder linkOutSuggestion(@Nullable Output<GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionArgs> linkOutSuggestion) {
            $.linkOutSuggestion = linkOutSuggestion;
            return this;
        }

        /**
         * @param linkOutSuggestion The link out suggestion chip for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder linkOutSuggestion(GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionArgs linkOutSuggestion) {
            return linkOutSuggestion(Output.of(linkOutSuggestion));
        }

        /**
         * @param listSelect The list card response for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder listSelect(@Nullable Output<GoogleCloudDialogflowV2IntentMessageListSelectArgs> listSelect) {
            $.listSelect = listSelect;
            return this;
        }

        /**
         * @param listSelect The list card response for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder listSelect(GoogleCloudDialogflowV2IntentMessageListSelectArgs listSelect) {
            return listSelect(Output.of(listSelect));
        }

        /**
         * @param mediaContent The media content card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder mediaContent(@Nullable Output<GoogleCloudDialogflowV2IntentMessageMediaContentArgs> mediaContent) {
            $.mediaContent = mediaContent;
            return this;
        }

        /**
         * @param mediaContent The media content card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder mediaContent(GoogleCloudDialogflowV2IntentMessageMediaContentArgs mediaContent) {
            return mediaContent(Output.of(mediaContent));
        }

        /**
         * @param payload A custom platform-specific response.
         * 
         * @return builder
         * 
         */
        public Builder payload(@Nullable Output<Map<String,String>> payload) {
            $.payload = payload;
            return this;
        }

        /**
         * @param payload A custom platform-specific response.
         * 
         * @return builder
         * 
         */
        public Builder payload(Map<String,String> payload) {
            return payload(Output.of(payload));
        }

        /**
         * @param platform Optional. The platform that this message is intended for.
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<GoogleCloudDialogflowV2IntentMessagePlatform> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform Optional. The platform that this message is intended for.
         * 
         * @return builder
         * 
         */
        public Builder platform(GoogleCloudDialogflowV2IntentMessagePlatform platform) {
            return platform(Output.of(platform));
        }

        /**
         * @param quickReplies The quick replies response.
         * 
         * @return builder
         * 
         */
        public Builder quickReplies(@Nullable Output<GoogleCloudDialogflowV2IntentMessageQuickRepliesArgs> quickReplies) {
            $.quickReplies = quickReplies;
            return this;
        }

        /**
         * @param quickReplies The quick replies response.
         * 
         * @return builder
         * 
         */
        public Builder quickReplies(GoogleCloudDialogflowV2IntentMessageQuickRepliesArgs quickReplies) {
            return quickReplies(Output.of(quickReplies));
        }

        /**
         * @param simpleResponses The voice and text-only responses for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder simpleResponses(@Nullable Output<GoogleCloudDialogflowV2IntentMessageSimpleResponsesArgs> simpleResponses) {
            $.simpleResponses = simpleResponses;
            return this;
        }

        /**
         * @param simpleResponses The voice and text-only responses for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder simpleResponses(GoogleCloudDialogflowV2IntentMessageSimpleResponsesArgs simpleResponses) {
            return simpleResponses(Output.of(simpleResponses));
        }

        /**
         * @param suggestions The suggestion chips for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder suggestions(@Nullable Output<GoogleCloudDialogflowV2IntentMessageSuggestionsArgs> suggestions) {
            $.suggestions = suggestions;
            return this;
        }

        /**
         * @param suggestions The suggestion chips for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder suggestions(GoogleCloudDialogflowV2IntentMessageSuggestionsArgs suggestions) {
            return suggestions(Output.of(suggestions));
        }

        /**
         * @param tableCard Table card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder tableCard(@Nullable Output<GoogleCloudDialogflowV2IntentMessageTableCardArgs> tableCard) {
            $.tableCard = tableCard;
            return this;
        }

        /**
         * @param tableCard Table card for Actions on Google.
         * 
         * @return builder
         * 
         */
        public Builder tableCard(GoogleCloudDialogflowV2IntentMessageTableCardArgs tableCard) {
            return tableCard(Output.of(tableCard));
        }

        /**
         * @param text The text response.
         * 
         * @return builder
         * 
         */
        public Builder text(@Nullable Output<GoogleCloudDialogflowV2IntentMessageTextArgs> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text The text response.
         * 
         * @return builder
         * 
         */
        public Builder text(GoogleCloudDialogflowV2IntentMessageTextArgs text) {
            return text(Output.of(text));
        }

        public GoogleCloudDialogflowV2IntentMessageArgs build() {
            return $;
        }
    }

}
