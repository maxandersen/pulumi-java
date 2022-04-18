// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Carousel Rich Business Messaging (RBM) rich card. Rich cards allow you to respond to users with more vivid content, e.g. with media and suggestions. If you want to show a single card with more control over the layout, please use RbmStandaloneCard instead.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse();

    /**
     * The cards in the carousel. A carousel must have at least 2 cards and at most 10.
     * 
     */
    @Import(name="cardContents", required=true)
      private final List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse> cardContents;

    public List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse> cardContents() {
        return this.cardContents;
    }

    /**
     * The width of the cards in the carousel.
     * 
     */
    @Import(name="cardWidth", required=true)
      private final String cardWidth;

    public String cardWidth() {
        return this.cardWidth;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse(
        List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse> cardContents,
        String cardWidth) {
        this.cardContents = Objects.requireNonNull(cardContents, "expected parameter 'cardContents' to be non-null");
        this.cardWidth = Objects.requireNonNull(cardWidth, "expected parameter 'cardWidth' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse() {
        this.cardContents = List.of();
        this.cardWidth = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse> cardContents;
        private String cardWidth;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cardContents = defaults.cardContents;
    	      this.cardWidth = defaults.cardWidth;
        }

        public Builder cardContents(List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse> cardContents) {
            this.cardContents = Objects.requireNonNull(cardContents);
            return this;
        }
        public Builder cardContents(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse... cardContents) {
            return cardContents(List.of(cardContents));
        }
        public Builder cardWidth(String cardWidth) {
            this.cardWidth = Objects.requireNonNull(cardWidth);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse(cardContents, cardWidth);
        }
    }
}
