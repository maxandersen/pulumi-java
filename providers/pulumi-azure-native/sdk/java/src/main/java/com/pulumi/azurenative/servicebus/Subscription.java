// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.servicebus.SubscriptionArgs;
import com.pulumi.azurenative.servicebus.outputs.MessageCountDetailsResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Description of subscription resource.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicebus:Subscription sdk-Subscriptions-2178 /subscriptions/Subscriptionid/resourceGroups/ResourceGroup/providers/Microsoft.ServiceBus/namespaces/sdk-Namespace-1349/topics/sdk-Topics-8740/subscriptions/sdk-Subscriptions-2178 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicebus:Subscription")
public class Subscription extends com.pulumi.resources.CustomResource {
    /**
     * Last time there was a receive request to this subscription.
     * 
     */
    @Export(name="accessedAt", type=String.class, parameters={})
    private Output<String> accessedAt;

    /**
     * @return Last time there was a receive request to this subscription.
     * 
     */
    public Output<String> accessedAt() {
        return this.accessedAt;
    }
    /**
     * ISO 8061 timeSpan idle interval after which the topic is automatically deleted. The minimum duration is 5 minutes.
     * 
     */
    @Export(name="autoDeleteOnIdle", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoDeleteOnIdle;

    /**
     * @return ISO 8061 timeSpan idle interval after which the topic is automatically deleted. The minimum duration is 5 minutes.
     * 
     */
    public Output</* @Nullable */ String> autoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }
    /**
     * Message count details
     * 
     */
    @Export(name="countDetails", type=MessageCountDetailsResponse.class, parameters={})
    private Output<MessageCountDetailsResponse> countDetails;

    /**
     * @return Message count details
     * 
     */
    public Output<MessageCountDetailsResponse> countDetails() {
        return this.countDetails;
    }
    /**
     * Exact time the message was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Exact time the message was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Value that indicates whether a subscription has dead letter support on filter evaluation exceptions.
     * 
     */
    @Export(name="deadLetteringOnFilterEvaluationExceptions", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deadLetteringOnFilterEvaluationExceptions;

    /**
     * @return Value that indicates whether a subscription has dead letter support on filter evaluation exceptions.
     * 
     */
    public Output</* @Nullable */ Boolean> deadLetteringOnFilterEvaluationExceptions() {
        return this.deadLetteringOnFilterEvaluationExceptions;
    }
    /**
     * Value that indicates whether a subscription has dead letter support when a message expires.
     * 
     */
    @Export(name="deadLetteringOnMessageExpiration", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deadLetteringOnMessageExpiration;

    /**
     * @return Value that indicates whether a subscription has dead letter support when a message expires.
     * 
     */
    public Output</* @Nullable */ Boolean> deadLetteringOnMessageExpiration() {
        return this.deadLetteringOnMessageExpiration;
    }
    /**
     * ISO 8061 Default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     * 
     */
    @Export(name="defaultMessageTimeToLive", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultMessageTimeToLive;

    /**
     * @return ISO 8061 Default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     * 
     */
    public Output</* @Nullable */ String> defaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }
    /**
     * ISO 8601 timeSpan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     * 
     */
    @Export(name="duplicateDetectionHistoryTimeWindow", type=String.class, parameters={})
    private Output</* @Nullable */ String> duplicateDetectionHistoryTimeWindow;

    /**
     * @return ISO 8601 timeSpan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     * 
     */
    public Output</* @Nullable */ String> duplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }
    /**
     * Value that indicates whether server-side batched operations are enabled.
     * 
     */
    @Export(name="enableBatchedOperations", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableBatchedOperations;

    /**
     * @return Value that indicates whether server-side batched operations are enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> enableBatchedOperations() {
        return this.enableBatchedOperations;
    }
    /**
     * Queue/Topic name to forward the Dead Letter message
     * 
     */
    @Export(name="forwardDeadLetteredMessagesTo", type=String.class, parameters={})
    private Output</* @Nullable */ String> forwardDeadLetteredMessagesTo;

    /**
     * @return Queue/Topic name to forward the Dead Letter message
     * 
     */
    public Output</* @Nullable */ String> forwardDeadLetteredMessagesTo() {
        return this.forwardDeadLetteredMessagesTo;
    }
    /**
     * Queue/Topic name to forward the messages
     * 
     */
    @Export(name="forwardTo", type=String.class, parameters={})
    private Output</* @Nullable */ String> forwardTo;

    /**
     * @return Queue/Topic name to forward the messages
     * 
     */
    public Output</* @Nullable */ String> forwardTo() {
        return this.forwardTo;
    }
    /**
     * ISO 8061 lock duration timespan for the subscription. The default value is 1 minute.
     * 
     */
    @Export(name="lockDuration", type=String.class, parameters={})
    private Output</* @Nullable */ String> lockDuration;

    /**
     * @return ISO 8061 lock duration timespan for the subscription. The default value is 1 minute.
     * 
     */
    public Output</* @Nullable */ String> lockDuration() {
        return this.lockDuration;
    }
    /**
     * Number of maximum deliveries.
     * 
     */
    @Export(name="maxDeliveryCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxDeliveryCount;

    /**
     * @return Number of maximum deliveries.
     * 
     */
    public Output</* @Nullable */ Integer> maxDeliveryCount() {
        return this.maxDeliveryCount;
    }
    /**
     * Number of messages.
     * 
     */
    @Export(name="messageCount", type=Double.class, parameters={})
    private Output<Double> messageCount;

    /**
     * @return Number of messages.
     * 
     */
    public Output<Double> messageCount() {
        return this.messageCount;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Value indicating if a subscription supports the concept of sessions.
     * 
     */
    @Export(name="requiresSession", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requiresSession;

    /**
     * @return Value indicating if a subscription supports the concept of sessions.
     * 
     */
    public Output</* @Nullable */ Boolean> requiresSession() {
        return this.requiresSession;
    }
    /**
     * Enumerates the possible values for the status of a messaging entity.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Enumerates the possible values for the status of a messaging entity.
     * 
     */
    public Output</* @Nullable */ String> status() {
        return this.status;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The exact time the message was updated.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The exact time the message was updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subscription(String name) {
        this(name, SubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subscription(String name, SubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subscription(String name, SubscriptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicebus:Subscription", name, args == null ? SubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Subscription(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicebus:Subscription", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:servicebus/v20140901:Subscription").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20150801:Subscription").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20170401:Subscription").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20180101preview:Subscription").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20210101preview:Subscription").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20210601preview:Subscription").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20211101:Subscription").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Subscription get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Subscription(name, id, options);
    }
}
