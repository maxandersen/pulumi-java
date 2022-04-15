// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azurestack.CustomerSubscriptionArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Customer subscription.
 * API Version: 2017-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:azurestack:CustomerSubscription   
 * ```
 * 
 */
@ResourceType(type="azure-native:azurestack:CustomerSubscription")
public class CustomerSubscription extends io.pulumi.resources.CustomResource {
    /**
     * The entity tag used for optimistic concurrency when modifying the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return The entity tag used for optimistic concurrency when modifying the resource.
     * 
     */
    public Output</* @Nullable */ String> etag() {
        return this.etag;
    }
    /**
     * Name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Tenant Id.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return Tenant Id.
     * 
     */
    public Output</* @Nullable */ String> tenantId() {
        return this.tenantId;
    }
    /**
     * Type of Resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of Resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomerSubscription(String name) {
        this(name, CustomerSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomerSubscription(String name, CustomerSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomerSubscription(String name, CustomerSubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azurestack:CustomerSubscription", name, args == null ? CustomerSubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomerSubscription(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azurestack:CustomerSubscription", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:azurestack/v20170601:CustomerSubscription").build()),
                Output.of(Alias.builder().type("azure-native:azurestack/v20200601preview:CustomerSubscription").build())
            ))
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
    public static CustomerSubscription get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CustomerSubscription(name, id, options);
    }
}
