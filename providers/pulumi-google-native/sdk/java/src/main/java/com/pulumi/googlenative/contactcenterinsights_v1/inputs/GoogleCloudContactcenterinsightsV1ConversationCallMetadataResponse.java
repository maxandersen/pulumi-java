// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Call-specific metadata.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse Empty = new GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse();

    /**
     * The audio channel that contains the agent.
     * 
     */
    @Import(name="agentChannel", required=true)
    private Integer agentChannel;

    public Integer agentChannel() {
        return this.agentChannel;
    }

    /**
     * The audio channel that contains the customer.
     * 
     */
    @Import(name="customerChannel", required=true)
    private Integer customerChannel;

    public Integer customerChannel() {
        return this.customerChannel;
    }

    private GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse() {}

    private GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse(GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse $) {
        this.agentChannel = $.agentChannel;
        this.customerChannel = $.customerChannel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse $;

        public Builder() {
            $ = new GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse();
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse defaults) {
            $ = new GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse(Objects.requireNonNull(defaults));
        }

        public Builder agentChannel(Integer agentChannel) {
            $.agentChannel = agentChannel;
            return this;
        }

        public Builder customerChannel(Integer customerChannel) {
            $.customerChannel = customerChannel;
            return this;
        }

        public GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse build() {
            $.agentChannel = Objects.requireNonNull($.agentChannel, "expected parameter 'agentChannel' to be non-null");
            $.customerChannel = Objects.requireNonNull($.customerChannel, "expected parameter 'customerChannel' to be non-null");
            return $;
        }
    }

}
