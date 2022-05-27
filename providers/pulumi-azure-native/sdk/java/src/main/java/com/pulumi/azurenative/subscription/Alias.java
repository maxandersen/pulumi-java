// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.subscription;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.subscription.AliasArgs;
import com.pulumi.azurenative.subscription.outputs.PutAliasResponsePropertiesResponse;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Subscription Information with the alias.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * ### CreateAlias
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
 *         var alias = new Alias(&#34;alias&#34;, AliasArgs.builder()        
 *             .aliasName(&#34;aliasForNewSub&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;billingScope&#34;, &#34;/providers/Microsoft.Billing/billingAccounts/e879cf0f-2b4d-5431-109a-f72fc9868693:024cabf4-7321-4cf9-be59-df0c77ca51de_2019-05-31/billingProfiles/PE2Q-NOIT-BG7-TGB/invoiceSections/MTT4-OBS7-PJA-TGB&#34;),
 *                 Map.entry(&#34;displayName&#34;, &#34;Contoso MCA subscription&#34;),
 *                 Map.entry(&#34;workload&#34;, &#34;Production&#34;)
 *             ))
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
 * $ pulumi import azure-native:subscription:Alias aliasForNewSub /providers/Microsoft.Subscription/aliases/aliasForNewSub 
 * ```
 * 
 */
@ResourceType(type="azure-native:subscription:Alias")
public class Alias extends com.pulumi.resources.CustomResource {
    /**
     * Alias ID.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Alias ID.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Put Alias response properties.
     * 
     */
    @Export(name="properties", type=PutAliasResponsePropertiesResponse.class, parameters={})
    private Output<PutAliasResponsePropertiesResponse> properties;

    /**
     * @return Put Alias response properties.
     * 
     */
    public Output<PutAliasResponsePropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * Resource type, Microsoft.Subscription/aliases.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type, Microsoft.Subscription/aliases.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Alias(String name) {
        this(name, AliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Alias(String name, AliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alias(String name, AliasArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:subscription:Alias", name, args == null ? AliasArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Alias(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:subscription:Alias", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(com.pulumi.core.Alias.builder().type("azure-native:subscription/v20191001preview:Alias").build()),
                Output.of(com.pulumi.core.Alias.builder().type("azure-native:subscription/v20200901:Alias").build()),
                Output.of(com.pulumi.core.Alias.builder().type("azure-native:subscription/v20211001:Alias").build())
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
    public static Alias get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Alias(name, id, options);
    }
}
