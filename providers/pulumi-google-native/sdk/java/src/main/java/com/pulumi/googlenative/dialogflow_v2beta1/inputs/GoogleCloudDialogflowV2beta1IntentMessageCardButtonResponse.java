// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Optional. Contains information about a button.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse();

    /**
     * Optional. The text to send back to the Dialogflow API or a URI to open.
     * 
     */
    @Import(name="postback", required=true)
    private String postback;

    public String postback() {
        return this.postback;
    }

    /**
     * Optional. The text to show on the button.
     * 
     */
    @Import(name="text", required=true)
    private String text;

    public String text() {
        return this.text;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse() {}

    private GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse(GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse $) {
        this.postback = $.postback;
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse(Objects.requireNonNull(defaults));
        }

        public Builder postback(String postback) {
            $.postback = postback;
            return this;
        }

        public Builder text(String text) {
            $.text = text;
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse build() {
            $.postback = Objects.requireNonNull($.postback, "expected parameter 'postback' to be non-null");
            $.text = Objects.requireNonNull($.text, "expected parameter 'text' to be non-null");
            return $;
        }
    }

}
