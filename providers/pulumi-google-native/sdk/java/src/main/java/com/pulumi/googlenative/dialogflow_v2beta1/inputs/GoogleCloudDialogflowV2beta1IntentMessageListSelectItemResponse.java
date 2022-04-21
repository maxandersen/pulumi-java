// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageImageResponse;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse;
import java.lang.String;
import java.util.Objects;


/**
 * An item in the list.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse();

    /**
     * Optional. The main text describing the item.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    /**
     * Optional. The image to display.
     * 
     */
    @Import(name="image", required=true)
    private GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;

    public GoogleCloudDialogflowV2beta1IntentMessageImageResponse image() {
        return this.image;
    }

    /**
     * Additional information about this option.
     * 
     */
    @Import(name="info", required=true)
    private GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info;

    public GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info() {
        return this.info;
    }

    /**
     * The title of the list item.
     * 
     */
    @Import(name="title", required=true)
    private String title;

    public String title() {
        return this.title;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse() {}

    private GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse(GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse $) {
        this.description = $.description;
        this.image = $.image;
        this.info = $.info;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse(Objects.requireNonNull(defaults));
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder image(GoogleCloudDialogflowV2beta1IntentMessageImageResponse image) {
            $.image = image;
            return this;
        }

        public Builder info(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info) {
            $.info = info;
            return this;
        }

        public Builder title(String title) {
            $.title = title;
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            $.info = Objects.requireNonNull($.info, "expected parameter 'info' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}
