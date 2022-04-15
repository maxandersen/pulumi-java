// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Indicates that the conversation succeeded, i.e., the bot handled the issue that the customer talked to it about. Dialogflow only uses this to determine which conversations should be counted as successful and doesn't process the metadata in this message in any way. Note that Dialogflow also considers conversations that get to the conversation end page as successful even if they don't return ConversationSuccess. You may set this, for example: * In the entry_fulfillment of a Page if entering the page indicates that the conversation succeeded. * In a webhook response when you determine that you handled the customer issue.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse();

    /**
     * Custom metadata. Dialogflow doesn't impose any structure on this.
     * 
     */
    @Import(name="metadata", required=true)
      private final Map<String,String> metadata;

    public Map<String,String> metadata() {
        return this.metadata;
    }

    public GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse(Map<String,String> metadata) {
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse() {
        this.metadata = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
        }

        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse(metadata);
        }
    }
}
