// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.enums.GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardCardWidth;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentArgs;
import java.util.List;
import java.util.Objects;


/**
 * Carousel Rich Business Messaging (RBM) rich card. Rich cards allow you to respond to users with more vivid content, e.g. with media and suggestions. If you want to show a single card with more control over the layout, please use RbmStandaloneCard instead.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs();

    /**
     * The cards in the carousel. A carousel must have at least 2 cards and at most 10.
     * 
     */
    @Import(name="cardContents", required=true)
    private Output<List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentArgs>> cardContents;

    /**
     * @return The cards in the carousel. A carousel must have at least 2 cards and at most 10.
     * 
     */
    public Output<List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentArgs>> cardContents() {
        return this.cardContents;
    }

    /**
     * The width of the cards in the carousel.
     * 
     */
    @Import(name="cardWidth", required=true)
    private Output<GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardCardWidth> cardWidth;

    /**
     * @return The width of the cards in the carousel.
     * 
     */
    public Output<GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardCardWidth> cardWidth() {
        return this.cardWidth;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs(GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs $) {
        this.cardContents = $.cardContents;
        this.cardWidth = $.cardWidth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cardContents The cards in the carousel. A carousel must have at least 2 cards and at most 10.
         * 
         * @return builder
         * 
         */
        public Builder cardContents(Output<List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentArgs>> cardContents) {
            $.cardContents = cardContents;
            return this;
        }

        /**
         * @param cardContents The cards in the carousel. A carousel must have at least 2 cards and at most 10.
         * 
         * @return builder
         * 
         */
        public Builder cardContents(List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentArgs> cardContents) {
            return cardContents(Output.of(cardContents));
        }

        /**
         * @param cardContents The cards in the carousel. A carousel must have at least 2 cards and at most 10.
         * 
         * @return builder
         * 
         */
        public Builder cardContents(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentArgs... cardContents) {
            return cardContents(List.of(cardContents));
        }

        /**
         * @param cardWidth The width of the cards in the carousel.
         * 
         * @return builder
         * 
         */
        public Builder cardWidth(Output<GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardCardWidth> cardWidth) {
            $.cardWidth = cardWidth;
            return this;
        }

        /**
         * @param cardWidth The width of the cards in the carousel.
         * 
         * @return builder
         * 
         */
        public Builder cardWidth(GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardCardWidth cardWidth) {
            return cardWidth(Output.of(cardWidth));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardArgs build() {
            $.cardContents = Objects.requireNonNull($.cardContents, "expected parameter 'cardContents' to be non-null");
            $.cardWidth = Objects.requireNonNull($.cardWidth, "expected parameter 'cardWidth' to be non-null");
            return $;
        }
    }

}
