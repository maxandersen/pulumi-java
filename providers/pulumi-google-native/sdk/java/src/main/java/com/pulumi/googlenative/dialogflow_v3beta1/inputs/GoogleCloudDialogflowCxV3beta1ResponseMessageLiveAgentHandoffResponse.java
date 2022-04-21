// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Indicates that the conversation should be handed off to a live agent. Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures. You may set this, for example: * In the entry_fulfillment of a Page if entering the page indicates something went extremely wrong in the conversation. * In a webhook response when you determine that the customer issue can only be handled by a human.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse();

    /**
     * Custom metadata for your handoff procedure. Dialogflow doesn&#39;t impose any structure on this.
     * 
     */
    @Import(name="metadata", required=true)
    private Map<String,String> metadata;

    public Map<String,String> metadata() {
        return this.metadata;
    }

    private GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse() {}

    private GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse(GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse $) {
        this.metadata = $.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse(Objects.requireNonNull(defaults));
        }

        public Builder metadata(Map<String,String> metadata) {
            $.metadata = metadata;
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse build() {
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            return $;
        }
    }

}
