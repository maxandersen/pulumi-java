// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetPartnerTopicEventSubscriptionDeliveryAttributesArgs extends InvokeArgs {

    public static final GetPartnerTopicEventSubscriptionDeliveryAttributesArgs Empty = new GetPartnerTopicEventSubscriptionDeliveryAttributesArgs();

    /**
     * Name of the event subscription to be created. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
     * 
     */
    @Import(name="eventSubscriptionName", required=true)
    private String eventSubscriptionName;

    /**
     * @return Name of the event subscription to be created. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
     * 
     */
    public String eventSubscriptionName() {
        return this.eventSubscriptionName;
    }

    /**
     * Name of the partner topic.
     * 
     */
    @Import(name="partnerTopicName", required=true)
    private String partnerTopicName;

    /**
     * @return Name of the partner topic.
     * 
     */
    public String partnerTopicName() {
        return this.partnerTopicName;
    }

    /**
     * The name of the resource group within the user&#39;s subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPartnerTopicEventSubscriptionDeliveryAttributesArgs() {}

    private GetPartnerTopicEventSubscriptionDeliveryAttributesArgs(GetPartnerTopicEventSubscriptionDeliveryAttributesArgs $) {
        this.eventSubscriptionName = $.eventSubscriptionName;
        this.partnerTopicName = $.partnerTopicName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPartnerTopicEventSubscriptionDeliveryAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPartnerTopicEventSubscriptionDeliveryAttributesArgs $;

        public Builder() {
            $ = new GetPartnerTopicEventSubscriptionDeliveryAttributesArgs();
        }

        public Builder(GetPartnerTopicEventSubscriptionDeliveryAttributesArgs defaults) {
            $ = new GetPartnerTopicEventSubscriptionDeliveryAttributesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
         * 
         * @return builder
         * 
         */
        public Builder eventSubscriptionName(String eventSubscriptionName) {
            $.eventSubscriptionName = eventSubscriptionName;
            return this;
        }

        /**
         * @param partnerTopicName Name of the partner topic.
         * 
         * @return builder
         * 
         */
        public Builder partnerTopicName(String partnerTopicName) {
            $.partnerTopicName = partnerTopicName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPartnerTopicEventSubscriptionDeliveryAttributesArgs build() {
            $.eventSubscriptionName = Objects.requireNonNull($.eventSubscriptionName, "expected parameter 'eventSubscriptionName' to be non-null");
            $.partnerTopicName = Objects.requireNonNull($.partnerTopicName, "expected parameter 'partnerTopicName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
