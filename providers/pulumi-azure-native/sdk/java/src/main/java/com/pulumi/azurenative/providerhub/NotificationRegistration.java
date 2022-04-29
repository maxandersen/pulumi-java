// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.providerhub.NotificationRegistrationArgs;
import com.pulumi.azurenative.providerhub.outputs.NotificationRegistrationResponseProperties;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The notification registration definition.
 * API Version: 2020-11-20.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:providerhub:NotificationRegistration fooNotificationRegistration /subscriptions/ab7a8701-f7ef-471a-a2f4-d0ebbf494f77providers/Microsoft.ProviderHub/providerRegistrations/Microsoft.Contoso/notificationregistrations/fooNotificationRegistration 
 * ```
 * 
 */
@ResourceType(type="azure-native:providerhub:NotificationRegistration")
public class NotificationRegistration extends CustomResource {
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="properties", type=NotificationRegistrationResponseProperties.class, parameters={})
    private Output<NotificationRegistrationResponseProperties> properties;

    public Output<NotificationRegistrationResponseProperties> properties() {
        return this.properties;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationRegistration(String name) {
        this(name, NotificationRegistrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationRegistration(String name, NotificationRegistrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationRegistration(String name, NotificationRegistrationArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:providerhub:NotificationRegistration", name, args == null ? NotificationRegistrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotificationRegistration(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:providerhub:NotificationRegistration", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:providerhub/v20201120:NotificationRegistration").build()),
                Output.of(Alias.builder().type("azure-native:providerhub/v20210501preview:NotificationRegistration").build()),
                Output.of(Alias.builder().type("azure-native:providerhub/v20210601preview:NotificationRegistration").build()),
                Output.of(Alias.builder().type("azure-native:providerhub/v20210901preview:NotificationRegistration").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NotificationRegistration get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new NotificationRegistration(name, id, options);
    }
}
