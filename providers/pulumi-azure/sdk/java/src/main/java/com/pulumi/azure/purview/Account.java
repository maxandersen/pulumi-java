// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.purview;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.purview.AccountArgs;
import com.pulumi.azure.purview.inputs.AccountState;
import com.pulumi.azure.purview.outputs.AccountIdentity;
import com.pulumi.azure.purview.outputs.AccountManagedResource;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Purview Account.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .identity(AccountIdentity.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Purview Accounts can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:purview/account:Account example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Purview/accounts/account1
 * ```
 * 
 */
@ResourceType(type="azure:purview/account:Account")
public class Account extends com.pulumi.resources.CustomResource {
    /**
     * Atlas Kafka endpoint primary connection string.
     * 
     */
    @Export(name="atlasKafkaEndpointPrimaryConnectionString", type=String.class, parameters={})
    private Output<String> atlasKafkaEndpointPrimaryConnectionString;

    /**
     * @return Atlas Kafka endpoint primary connection string.
     * 
     */
    public Output<String> atlasKafkaEndpointPrimaryConnectionString() {
        return this.atlasKafkaEndpointPrimaryConnectionString;
    }
    /**
     * Atlas Kafka endpoint secondary connection string.
     * 
     */
    @Export(name="atlasKafkaEndpointSecondaryConnectionString", type=String.class, parameters={})
    private Output<String> atlasKafkaEndpointSecondaryConnectionString;

    /**
     * @return Atlas Kafka endpoint secondary connection string.
     * 
     */
    public Output<String> atlasKafkaEndpointSecondaryConnectionString() {
        return this.atlasKafkaEndpointSecondaryConnectionString;
    }
    /**
     * Catalog endpoint.
     * 
     */
    @Export(name="catalogEndpoint", type=String.class, parameters={})
    private Output<String> catalogEndpoint;

    /**
     * @return Catalog endpoint.
     * 
     */
    public Output<String> catalogEndpoint() {
        return this.catalogEndpoint;
    }
    /**
     * Guardian endpoint.
     * 
     */
    @Export(name="guardianEndpoint", type=String.class, parameters={})
    private Output<String> guardianEndpoint;

    /**
     * @return Guardian endpoint.
     * 
     */
    public Output<String> guardianEndpoint() {
        return this.guardianEndpoint;
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=AccountIdentity.class, parameters={})
    private Output<AccountIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<AccountIdentity> identity() {
        return this.identity;
    }
    /**
     * The Azure Region where the Purview Account should exist. Changing this forces a new Purview Account to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Purview Account should exist. Changing this forces a new Purview Account to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for the new Resource Group where Purview Account creates the managed resources. Changing this forces a new Purview Account to be created.
     * 
     */
    @Export(name="managedResourceGroupName", type=String.class, parameters={})
    private Output<String> managedResourceGroupName;

    /**
     * @return The name which should be used for the new Resource Group where Purview Account creates the managed resources. Changing this forces a new Purview Account to be created.
     * 
     */
    public Output<String> managedResourceGroupName() {
        return this.managedResourceGroupName;
    }
    /**
     * A `managed_resources` block as defined below.
     * 
     */
    @Export(name="managedResources", type=List.class, parameters={AccountManagedResource.class})
    private Output<List<AccountManagedResource>> managedResources;

    /**
     * @return A `managed_resources` block as defined below.
     * 
     */
    public Output<List<AccountManagedResource>> managedResources() {
        return this.managedResources;
    }
    /**
     * The name which should be used for this Purview Account. Changing this forces a new Purview Account to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Purview Account. Changing this forces a new Purview Account to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Should the Purview Account be visible to the public network? Defaults to `true`.
     * 
     */
    @Export(name="publicNetworkEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publicNetworkEnabled;

    /**
     * @return Should the Purview Account be visible to the public network? Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> publicNetworkEnabled() {
        return Codegen.optional(this.publicNetworkEnabled);
    }
    /**
     * The name of the Resource Group where the Purview Account should exist. Changing this forces a new Purview Account to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Purview Account should exist. Changing this forces a new Purview Account to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Scan endpoint.
     * 
     */
    @Export(name="scanEndpoint", type=String.class, parameters={})
    private Output<String> scanEndpoint;

    /**
     * @return Scan endpoint.
     * 
     */
    public Output<String> scanEndpoint() {
        return this.scanEndpoint;
    }
    /**
     * A mapping of tags which should be assigned to the Purview Account.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Purview Account.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Account(String name) {
        this(name, AccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Account(String name, AccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Account(String name, AccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:purview/account:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Account(String name, Output<String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:purview/account:Account", name, state, makeResourceOptions(options, id));
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
    public static Account get(String name, Output<String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, state, options);
    }
}
