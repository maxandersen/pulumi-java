// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetSubscriptionArgs extends InvokeArgs {

    public static final GetSubscriptionArgs Empty = new GetSubscriptionArgs();

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    /**
     * @return The namespace name
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The subscription name.
     * 
     */
    @Import(name="subscriptionName", required=true)
    private String subscriptionName;

    /**
     * @return The subscription name.
     * 
     */
    public String subscriptionName() {
        return this.subscriptionName;
    }

    /**
     * The topic name.
     * 
     */
    @Import(name="topicName", required=true)
    private String topicName;

    /**
     * @return The topic name.
     * 
     */
    public String topicName() {
        return this.topicName;
    }

    private GetSubscriptionArgs() {}

    private GetSubscriptionArgs(GetSubscriptionArgs $) {
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
        this.subscriptionName = $.subscriptionName;
        this.topicName = $.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscriptionArgs $;

        public Builder() {
            $ = new GetSubscriptionArgs();
        }

        public Builder(GetSubscriptionArgs defaults) {
            $ = new GetSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespaceName The namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param subscriptionName The subscription name.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionName(String subscriptionName) {
            $.subscriptionName = subscriptionName;
            return this;
        }

        /**
         * @param topicName The topic name.
         * 
         * @return builder
         * 
         */
        public Builder topicName(String topicName) {
            $.topicName = topicName;
            return this;
        }

        public GetSubscriptionArgs build() {
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.subscriptionName = Objects.requireNonNull($.subscriptionName, "expected parameter 'subscriptionName' to be non-null");
            $.topicName = Objects.requireNonNull($.topicName, "expected parameter 'topicName' to be non-null");
            return $;
        }
    }

}
