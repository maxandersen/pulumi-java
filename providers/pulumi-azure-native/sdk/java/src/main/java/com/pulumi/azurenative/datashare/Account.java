// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datashare.AccountArgs;
import com.pulumi.azurenative.datashare.outputs.IdentityResponse;
import com.pulumi.azurenative.datashare.outputs.SystemDataResponse;
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
 * An account data transfer object.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * ### Accounts_Create
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
 *             .accountName(&#34;Account1&#34;)
 *             .identity(Map.of(&#34;type&#34;, &#34;SystemAssigned&#34;))
 *             .location(&#34;West US 2&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;tag1&#34;, &#34;Red&#34;),
 *                 Map.entry(&#34;tag2&#34;, &#34;White&#34;)
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
 * $ pulumi import azure-native:datashare:Account Account1 /subscriptions/433a8dfd-e5d5-4e77-ad86-90acdc75eb1a/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/Account1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:Account")
public class Account extends com.pulumi.resources.CustomResource {
    /**
     * Time at which the account was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Time at which the account was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Identity Info on the Account
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output<IdentityResponse> identity;

    /**
     * @return Identity Info on the Account
     * 
     */
    public Output<IdentityResponse> identity() {
        return this.identity;
    }
    /**
     * Location of the azure resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location of the azure resource.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Name of the azure resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the azure resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provisioning state of the Account
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the Account
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System Data of the Azure resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Tags on the azure resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags on the azure resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Type of the azure resource
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the azure resource
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Email of the user who created the resource
     * 
     */
    @Export(name="userEmail", type=String.class, parameters={})
    private Output<String> userEmail;

    /**
     * @return Email of the user who created the resource
     * 
     */
    public Output<String> userEmail() {
        return this.userEmail;
    }
    /**
     * Name of the user who created the resource
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return Name of the user who created the resource
     * 
     */
    public Output<String> userName() {
        return this.userName;
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
        super("azure-native:datashare:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Account(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:Account", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datashare/v20181101preview:Account").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20191101:Account").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20200901:Account").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20201001preview:Account").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20210801:Account").build())
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
