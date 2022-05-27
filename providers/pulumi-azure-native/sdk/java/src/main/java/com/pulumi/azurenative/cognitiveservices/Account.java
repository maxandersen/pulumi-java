// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.cognitiveservices.AccountArgs;
import com.pulumi.azurenative.cognitiveservices.outputs.CognitiveServicesAccountPropertiesResponse;
import com.pulumi.azurenative.cognitiveservices.outputs.IdentityResponse;
import com.pulumi.azurenative.cognitiveservices.outputs.SkuResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Cognitive Services Account is an Azure resource representing the provisioned account, its type, location and SKU.
 * API Version: 2017-04-18.
 * 
 * ## Example Usage
 * ### Create Account
 * 
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
 *         var account = new Account(&#34;account&#34;, AccountArgs.builder()        
 *             .accountName(&#34;testCreate1&#34;)
 *             .identity(Map.of(&#34;type&#34;, &#34;SystemAssigned&#34;))
 *             .kind(&#34;Emotion&#34;)
 *             .location(&#34;West US&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;encryption&#34;, Map.ofEntries(
 *                     Map.entry(&#34;keySource&#34;, &#34;Microsoft.KeyVault&#34;),
 *                     Map.entry(&#34;keyVaultProperties&#34;, Map.ofEntries(
 *                         Map.entry(&#34;keyName&#34;, &#34;KeyName&#34;),
 *                         Map.entry(&#34;keyVaultUri&#34;, &#34;https://pltfrmscrts-use-pc-dev.vault.azure.net/&#34;),
 *                         Map.entry(&#34;keyVersion&#34;, &#34;891CF236-D241-4738-9462-D506AF493DFA&#34;)
 *                     ))
 *                 )),
 *                 Map.entry(&#34;userOwnedStorage&#34;, Map.of(&#34;resourceId&#34;, &#34;/subscriptions/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount&#34;))
 *             ))
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;S0&#34;))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create Account Min
 * 
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
 *         var account = new Account(&#34;account&#34;, AccountArgs.builder()        
 *             .accountName(&#34;testCreate1&#34;)
 *             .identity(Map.of(&#34;type&#34;, &#34;SystemAssigned&#34;))
 *             .kind(&#34;CognitiveServices&#34;)
 *             .location(&#34;West US&#34;)
 *             .properties()
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;S0&#34;))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cognitiveservices:Account testCreate1 /subscriptions/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/resourceGroups/myResourceGroup/providers/Microsoft.CognitiveServices/accounts/testCreate1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cognitiveservices:Account")
public class Account extends com.pulumi.resources.CustomResource {
    /**
     * Entity Tag
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Entity Tag
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The identity of Cognitive Services account.
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity of Cognitive Services account.
     * 
     */
    public Output<Optional<IdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The Kind of the resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The Kind of the resource.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * The location of the resource
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the created account
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the created account
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Properties of Cognitive Services account.
     * 
     */
    @Export(name="properties", type=CognitiveServicesAccountPropertiesResponse.class, parameters={})
    private Output<CognitiveServicesAccountPropertiesResponse> properties;

    /**
     * @return Properties of Cognitive Services account.
     * 
     */
    public Output<CognitiveServicesAccountPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * The SKU of Cognitive Services account.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The SKU of Cognitive Services account.
     * 
     */
    public Output<Optional<SkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * Gets or sets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Gets or sets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
        super("azure-native:cognitiveservices:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Account(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cognitiveservices:Account", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:cognitiveservices/v20160201preview:Account").build()),
                Output.of(Alias.builder().type("azure-native:cognitiveservices/v20170418:Account").build()),
                Output.of(Alias.builder().type("azure-native:cognitiveservices/v20210430:Account").build()),
                Output.of(Alias.builder().type("azure-native:cognitiveservices/v20211001:Account").build()),
                Output.of(Alias.builder().type("azure-native:cognitiveservices/v20220301:Account").build())
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
    public static Account get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, options);
    }
}
