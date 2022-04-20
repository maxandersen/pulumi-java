// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEventSubscriptionDeliveryAttributesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventSubscriptionDeliveryAttributesArgs Empty = new GetEventSubscriptionDeliveryAttributesArgs();

    /**
     * Name of the event subscription.
     * 
     */
    @Import(name="eventSubscriptionName", required=true)
      private final String eventSubscriptionName;

    public String eventSubscriptionName() {
        return this.eventSubscriptionName;
    }

    /**
     * The scope of the event subscription. The scope can be a subscription, or a resource group, or a top level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use &#39;/subscriptions/{subscriptionId}/&#39; for a subscription, &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39; for a resource group, and &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}&#39; for a resource, and &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}&#39; for an EventGrid topic.
     * 
     */
    @Import(name="scope", required=true)
      private final String scope;

    public String scope() {
        return this.scope;
    }

    public GetEventSubscriptionDeliveryAttributesArgs(
        String eventSubscriptionName,
        String scope) {
        this.eventSubscriptionName = Objects.requireNonNull(eventSubscriptionName, "expected parameter 'eventSubscriptionName' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetEventSubscriptionDeliveryAttributesArgs() {
        this.eventSubscriptionName = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventSubscriptionDeliveryAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventSubscriptionName;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventSubscriptionDeliveryAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventSubscriptionName = defaults.eventSubscriptionName;
    	      this.scope = defaults.scope;
        }

        public Builder eventSubscriptionName(String eventSubscriptionName) {
            this.eventSubscriptionName = Objects.requireNonNull(eventSubscriptionName);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }        public GetEventSubscriptionDeliveryAttributesArgs build() {
            return new GetEventSubscriptionDeliveryAttributesArgs(eventSubscriptionName, scope);
        }
    }
}
