// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageSuggestionArgs;
import java.util.List;
import java.util.Objects;


/**
 * The collection of suggestions.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageSuggestionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageSuggestionsArgs Empty = new GoogleCloudDialogflowV2IntentMessageSuggestionsArgs();

    /**
     * The list of suggested replies.
     * 
     */
    @Import(name="suggestions", required=true)
    private Output<List<GoogleCloudDialogflowV2IntentMessageSuggestionArgs>> suggestions;

    /**
     * @return The list of suggested replies.
     * 
     */
    public Output<List<GoogleCloudDialogflowV2IntentMessageSuggestionArgs>> suggestions() {
        return this.suggestions;
    }

    private GoogleCloudDialogflowV2IntentMessageSuggestionsArgs() {}

    private GoogleCloudDialogflowV2IntentMessageSuggestionsArgs(GoogleCloudDialogflowV2IntentMessageSuggestionsArgs $) {
        this.suggestions = $.suggestions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageSuggestionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageSuggestionsArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageSuggestionsArgs();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageSuggestionsArgs defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageSuggestionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param suggestions The list of suggested replies.
         * 
         * @return builder
         * 
         */
        public Builder suggestions(Output<List<GoogleCloudDialogflowV2IntentMessageSuggestionArgs>> suggestions) {
            $.suggestions = suggestions;
            return this;
        }

        /**
         * @param suggestions The list of suggested replies.
         * 
         * @return builder
         * 
         */
        public Builder suggestions(List<GoogleCloudDialogflowV2IntentMessageSuggestionArgs> suggestions) {
            return suggestions(Output.of(suggestions));
        }

        /**
         * @param suggestions The list of suggested replies.
         * 
         * @return builder
         * 
         */
        public Builder suggestions(GoogleCloudDialogflowV2IntentMessageSuggestionArgs... suggestions) {
            return suggestions(List.of(suggestions));
        }

        public GoogleCloudDialogflowV2IntentMessageSuggestionsArgs build() {
            $.suggestions = Objects.requireNonNull($.suggestions, "expected parameter 'suggestions' to be non-null");
            return $;
        }
    }

}
