// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.app.ManagedEnvironmentsStorageArgs;
import com.pulumi.azurenative.app.outputs.ManagedEnvironmentStorageResponseProperties;
import com.pulumi.azurenative.app.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Storage resource for managedEnvironment.
 * API Version: 2022-03-01.
 * 
 * ## Example Usage
 * ### Create or update environments storage
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
 *         var managedEnvironmentsStorage = new ManagedEnvironmentsStorage(&#34;managedEnvironmentsStorage&#34;, ManagedEnvironmentsStorageArgs.builder()        
 *             .envName(&#34;managedEnv&#34;)
 *             .name(&#34;jlaw-demo1&#34;)
 *             .properties(Map.of(&#34;azureFile&#34;, Map.ofEntries(
 *                 Map.entry(&#34;accessMode&#34;, &#34;ReadOnly&#34;),
 *                 Map.entry(&#34;accountKey&#34;, &#34;key&#34;),
 *                 Map.entry(&#34;accountName&#34;, &#34;account1&#34;),
 *                 Map.entry(&#34;shareName&#34;, &#34;share1&#34;)
 *             )))
 *             .resourceGroupName(&#34;examplerg&#34;)
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
 * $ pulumi import azure-native:app:ManagedEnvironmentsStorage jlaw-demo1 /subscriptions/8efdecc5-919e-44eb-b179-915dca89ebf9/resourceGroups/examplerg/providers/Microsoft.App/managedEnvironments/managedEnv/storages/jlaw-demo1 
 * ```
 * 
 */
@ResourceType(type="azure-native:app:ManagedEnvironmentsStorage")
public class ManagedEnvironmentsStorage extends com.pulumi.resources.CustomResource {
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
    /**
     * Storage properties
     * 
     */
    @Export(name="properties", type=ManagedEnvironmentStorageResponseProperties.class, parameters={})
    private Output<ManagedEnvironmentStorageResponseProperties> properties;

    /**
     * @return Storage properties
     * 
     */
    public Output<ManagedEnvironmentStorageResponseProperties> properties() {
        return this.properties;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
    public ManagedEnvironmentsStorage(String name) {
        this(name, ManagedEnvironmentsStorageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedEnvironmentsStorage(String name, ManagedEnvironmentsStorageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedEnvironmentsStorage(String name, ManagedEnvironmentsStorageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:app:ManagedEnvironmentsStorage", name, args == null ? ManagedEnvironmentsStorageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedEnvironmentsStorage(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:app:ManagedEnvironmentsStorage", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:app/v20220101preview:ManagedEnvironmentsStorage").build()),
                Output.of(Alias.builder().type("azure-native:app/v20220301:ManagedEnvironmentsStorage").build())
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
    public static ManagedEnvironmentsStorage get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedEnvironmentsStorage(name, id, options);
    }
}
