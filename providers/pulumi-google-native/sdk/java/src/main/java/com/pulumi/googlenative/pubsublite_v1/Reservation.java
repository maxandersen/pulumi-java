// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsublite_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.pubsublite_v1.ReservationArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new reservation.
 * 
 */
@ResourceType(type="google-native:pubsublite/v1:Reservation")
public class Reservation extends com.pulumi.resources.CustomResource {
    /**
     * The name of the reservation. Structured like: projects/{project_number}/locations/{location}/reservations/{reservation_id}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the reservation. Structured like: projects/{project_number}/locations/{location}/reservations/{reservation_id}
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The reserved throughput capacity. Every unit of throughput capacity is equivalent to 1 MiB/s of published messages or 2 MiB/s of subscribed messages. Any topics which are declared as using capacity from a Reservation will consume resources from this reservation instead of being charged individually.
     * 
     */
    @Export(name="throughputCapacity", type=String.class, parameters={})
    private Output<String> throughputCapacity;

    /**
     * @return The reserved throughput capacity. Every unit of throughput capacity is equivalent to 1 MiB/s of published messages or 2 MiB/s of subscribed messages. Any topics which are declared as using capacity from a Reservation will consume resources from this reservation instead of being charged individually.
     * 
     */
    public Output<String> throughputCapacity() {
        return this.throughputCapacity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Reservation(String name) {
        this(name, ReservationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Reservation(String name, ReservationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Reservation(String name, ReservationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:pubsublite/v1:Reservation", name, args == null ? ReservationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Reservation(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:pubsublite/v1:Reservation", name, null, makeResourceOptions(options, id));
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
    public static Reservation get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Reservation(name, id, options);
    }
}
