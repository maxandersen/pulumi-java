// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kinesis.StreamConsumerArgs;
import com.pulumi.aws.kinesis.inputs.StreamConsumerState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a Kinesis Stream Consumer.
 * 
 * &gt; **Note:** You can register up to 20 consumers per stream. A given consumer can only be registered with one stream at a time.
 * 
 * For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-consumers.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Kinesis Stream Consumers can be imported using the Amazon Resource Name (ARN) e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:kinesis/streamConsumer:StreamConsumer example arn:aws:kinesis:us-west-2:123456789012:stream/example/consumer/example:1616044553
 * ```
 * 
 *  [1]https://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-consumers.html
 * 
 */
@ResourceType(type="aws:kinesis/streamConsumer:StreamConsumer")
public class StreamConsumer extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the stream consumer.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the stream consumer.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Approximate timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of when the stream consumer was created.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Approximate timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of when the stream consumer was created.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * Name of the stream consumer.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the stream consumer.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Amazon Resource Name (ARN) of the data stream the consumer is registered with.
     * 
     */
    @Export(name="streamArn", type=String.class, parameters={})
    private Output<String> streamArn;

    /**
     * @return Amazon Resource Name (ARN) of the data stream the consumer is registered with.
     * 
     */
    public Output<String> streamArn() {
        return this.streamArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamConsumer(String name) {
        this(name, StreamConsumerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamConsumer(String name, StreamConsumerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamConsumer(String name, StreamConsumerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesis/streamConsumer:StreamConsumer", name, args == null ? StreamConsumerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StreamConsumer(String name, Output<String> id, @Nullable StreamConsumerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesis/streamConsumer:StreamConsumer", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static StreamConsumer get(String name, Output<String> id, @Nullable StreamConsumerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StreamConsumer(name, id, state, options);
    }
}
