// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudwatch.EventBusPolicyArgs;
import com.pulumi.aws.cloudwatch.inputs.EventBusPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to create an EventBridge resource policy to support cross-account events.
 * 
 * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 * 
 * &gt; **Note:** The EventBridge bus policy resource  (`aws.cloudwatch.EventBusPolicy`) is incompatible with the EventBridge permission resource (`aws.cloudwatch.EventPermission`) and will overwrite permissions.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EventBridge permissions can be imported using the `event_bus_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventBusPolicy:EventBusPolicy DevAccountAccess example-event-bus
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/eventBusPolicy:EventBusPolicy")
public class EventBusPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    @Export(name="eventBusName", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventBusName;

    /**
     * @return The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    public Output</* @Nullable */ String> eventBusName() {
        return this.eventBusName;
    }
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    public Output<String> policy() {
        return this.policy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventBusPolicy(String name) {
        this(name, EventBusPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventBusPolicy(String name, EventBusPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventBusPolicy(String name, EventBusPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventBusPolicy:EventBusPolicy", name, args == null ? EventBusPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventBusPolicy(String name, Output<String> id, @Nullable EventBusPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventBusPolicy:EventBusPolicy", name, state, makeResourceOptions(options, id));
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
    public static EventBusPolicy get(String name, Output<String> id, @Nullable EventBusPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventBusPolicy(name, id, state, options);
    }
}
