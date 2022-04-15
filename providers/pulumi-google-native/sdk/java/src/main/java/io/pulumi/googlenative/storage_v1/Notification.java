// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.storage_v1.NotificationArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a notification subscription for a given bucket.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:storage/v1:Notification")
public class Notification extends io.pulumi.resources.CustomResource {
    /**
     * An optional list of additional attributes to attach to each Cloud PubSub message published for this notification subscription.
     * 
     */
    @Export(name="customAttributes", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> customAttributes;

    /**
     * @return An optional list of additional attributes to attach to each Cloud PubSub message published for this notification subscription.
     * 
     */
    public Output<Map<String,String>> customAttributes() {
        return this.customAttributes;
    }
    /**
     * HTTP 1.1 Entity tag for this subscription notification.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return HTTP 1.1 Entity tag for this subscription notification.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * If present, only send notifications about listed event types. If empty, sent notifications for all event types.
     * 
     */
    @Export(name="eventTypes", type=List.class, parameters={String.class})
    private Output<List<String>> eventTypes;

    /**
     * @return If present, only send notifications about listed event types. If empty, sent notifications for all event types.
     * 
     */
    public Output<List<String>> eventTypes() {
        return this.eventTypes;
    }
    /**
     * The kind of item this is. For notifications, this is always storage#notification.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of item this is. For notifications, this is always storage#notification.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * If present, only apply this notification configuration to object names that begin with this prefix.
     * 
     */
    @Export(name="objectNamePrefix", type=String.class, parameters={})
    private Output<String> objectNamePrefix;

    /**
     * @return If present, only apply this notification configuration to object names that begin with this prefix.
     * 
     */
    public Output<String> objectNamePrefix() {
        return this.objectNamePrefix;
    }
    /**
     * The desired content of the Payload.
     * 
     */
    @Export(name="payloadFormat", type=String.class, parameters={})
    private Output<String> payloadFormat;

    /**
     * @return The desired content of the Payload.
     * 
     */
    public Output<String> payloadFormat() {
        return this.payloadFormat;
    }
    /**
     * The canonical URL of this notification.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The canonical URL of this notification.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The Cloud PubSub topic to which this subscription publishes. Formatted as: '//pubsub.googleapis.com/projects/{project-identifier}/topics/{my-topic}'
     * 
     */
    @Export(name="topic", type=String.class, parameters={})
    private Output<String> topic;

    /**
     * @return The Cloud PubSub topic to which this subscription publishes. Formatted as: '//pubsub.googleapis.com/projects/{project-identifier}/topics/{my-topic}'
     * 
     */
    public Output<String> topic() {
        return this.topic;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Notification(String name) {
        this(name, NotificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Notification(String name, NotificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Notification(String name, NotificationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:Notification", name, args == null ? NotificationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Notification(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:Notification", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Notification get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Notification(name, id, options);
    }
}
