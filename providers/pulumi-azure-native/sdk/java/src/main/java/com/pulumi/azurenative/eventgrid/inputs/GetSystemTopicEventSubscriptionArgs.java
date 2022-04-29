// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetSystemTopicEventSubscriptionArgs extends InvokeArgs {

    public static final GetSystemTopicEventSubscriptionArgs Empty = new GetSystemTopicEventSubscriptionArgs();

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

    /**
     * Name of the system topic.
     * 
     */
    @Import(name="systemTopicName", required=true)
    private String systemTopicName;

    /**
     * @return Name of the system topic.
     * 
     */
    public String systemTopicName() {
        return this.systemTopicName;
    }

    private GetSystemTopicEventSubscriptionArgs() {}

    private GetSystemTopicEventSubscriptionArgs(GetSystemTopicEventSubscriptionArgs $) {
        this.eventSubscriptionName = $.eventSubscriptionName;
        this.resourceGroupName = $.resourceGroupName;
        this.systemTopicName = $.systemTopicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSystemTopicEventSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSystemTopicEventSubscriptionArgs $;

        public Builder() {
            $ = new GetSystemTopicEventSubscriptionArgs();
        }

        public Builder(GetSystemTopicEventSubscriptionArgs defaults) {
            $ = new GetSystemTopicEventSubscriptionArgs(Objects.requireNonNull(defaults));
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
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param systemTopicName Name of the system topic.
         * 
         * @return builder
         * 
         */
        public Builder systemTopicName(String systemTopicName) {
            $.systemTopicName = systemTopicName;
            return this;
        }

        public GetSystemTopicEventSubscriptionArgs build() {
            $.eventSubscriptionName = Objects.requireNonNull($.eventSubscriptionName, "expected parameter 'eventSubscriptionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.systemTopicName = Objects.requireNonNull($.systemTopicName, "expected parameter 'systemTopicName' to be non-null");
            return $;
        }
    }

}
