// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsublite_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.pubsublite_v1.TopicArgs;
import com.pulumi.googlenative.pubsublite_v1.outputs.PartitionConfigResponse;
import com.pulumi.googlenative.pubsublite_v1.outputs.ReservationConfigResponse;
import com.pulumi.googlenative.pubsublite_v1.outputs.RetentionConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new topic.
 * 
 */
@ResourceType(type="google-native:pubsublite/v1:Topic")
public class Topic extends com.pulumi.resources.CustomResource {
    /**
     * The name of the topic. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the topic. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The settings for this topic&#39;s partitions.
     * 
     */
    @Export(name="partitionConfig", type=PartitionConfigResponse.class, parameters={})
    private Output<PartitionConfigResponse> partitionConfig;

    /**
     * @return The settings for this topic&#39;s partitions.
     * 
     */
    public Output<PartitionConfigResponse> partitionConfig() {
        return this.partitionConfig;
    }
    /**
     * The settings for this topic&#39;s Reservation usage.
     * 
     */
    @Export(name="reservationConfig", type=ReservationConfigResponse.class, parameters={})
    private Output<ReservationConfigResponse> reservationConfig;

    /**
     * @return The settings for this topic&#39;s Reservation usage.
     * 
     */
    public Output<ReservationConfigResponse> reservationConfig() {
        return this.reservationConfig;
    }
    /**
     * The settings for this topic&#39;s message retention.
     * 
     */
    @Export(name="retentionConfig", type=RetentionConfigResponse.class, parameters={})
    private Output<RetentionConfigResponse> retentionConfig;

    /**
     * @return The settings for this topic&#39;s message retention.
     * 
     */
    public Output<RetentionConfigResponse> retentionConfig() {
        return this.retentionConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Topic(String name) {
        this(name, TopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Topic(String name, TopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Topic(String name, TopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:pubsublite/v1:Topic", name, args == null ? TopicArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Topic(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:pubsublite/v1:Topic", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Topic get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Topic(name, id, options);
    }
}
