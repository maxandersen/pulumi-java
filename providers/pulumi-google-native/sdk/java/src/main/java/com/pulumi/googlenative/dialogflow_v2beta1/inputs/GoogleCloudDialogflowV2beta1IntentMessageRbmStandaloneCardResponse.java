// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Standalone Rich Business Messaging (RBM) rich card. Rich cards allow you to respond to users with more vivid content, e.g. with media and suggestions. You can group multiple rich cards into one using RbmCarouselCard but carousel cards will give you less control over the card layout.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse();

    /**
     * Card content.
     * 
     */
    @Import(name="cardContent", required=true)
    private GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse cardContent;

    public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse cardContent() {
        return this.cardContent;
    }

    /**
     * Orientation of the card.
     * 
     */
    @Import(name="cardOrientation", required=true)
    private String cardOrientation;

    public String cardOrientation() {
        return this.cardOrientation;
    }

    /**
     * Required if orientation is horizontal. Image preview alignment for standalone cards with horizontal layout.
     * 
     */
    @Import(name="thumbnailImageAlignment", required=true)
    private String thumbnailImageAlignment;

    public String thumbnailImageAlignment() {
        return this.thumbnailImageAlignment;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse() {}

    private GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse(GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse $) {
        this.cardContent = $.cardContent;
        this.cardOrientation = $.cardOrientation;
        this.thumbnailImageAlignment = $.thumbnailImageAlignment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse(Objects.requireNonNull(defaults));
        }

        public Builder cardContent(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse cardContent) {
            $.cardContent = cardContent;
            return this;
        }

        public Builder cardOrientation(String cardOrientation) {
            $.cardOrientation = cardOrientation;
            return this;
        }

        public Builder thumbnailImageAlignment(String thumbnailImageAlignment) {
            $.thumbnailImageAlignment = thumbnailImageAlignment;
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse build() {
            $.cardContent = Objects.requireNonNull($.cardContent, "expected parameter 'cardContent' to be non-null");
            $.cardOrientation = Objects.requireNonNull($.cardOrientation, "expected parameter 'cardOrientation' to be non-null");
            $.thumbnailImageAlignment = Objects.requireNonNull($.thumbnailImageAlignment, "expected parameter 'thumbnailImageAlignment' to be non-null");
            return $;
        }
    }

}
