// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.kusto.ScriptArgs;
import com.pulumi.azurenative.kusto.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Class representing a database script.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kusto:Script KustoClusterRPTest4/KustoDatabase8/kustoScript1 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Kusto/Clusters/KustoClusterRPTest4/Databases/KustoDatabase8/Scripts/kustoScript1 
 * ```
 * 
 */
@ResourceType(type="azure-native:kusto:Script")
public class Script extends CustomResource {
    /**
     * Flag that indicates whether to continue if one of the command fails.
     * 
     */
    @Export(name="continueOnErrors", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> continueOnErrors;

    /**
     * @return Flag that indicates whether to continue if one of the command fails.
     * 
     */
    public Output<Optional<Boolean>> continueOnErrors() {
        return Codegen.optional(this.continueOnErrors);
    }
    /**
     * A unique string. If changed the script will be applied again.
     * 
     */
    @Export(name="forceUpdateTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> forceUpdateTag;

    /**
     * @return A unique string. If changed the script will be applied again.
     * 
     */
    public Output<Optional<String>> forceUpdateTag() {
        return Codegen.optional(this.forceUpdateTag);
    }
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
     * The provisioned state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioned state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The url to the KQL script blob file.
     * 
     */
    @Export(name="scriptUrl", type=String.class, parameters={})
    private Output<String> scriptUrl;

    /**
     * @return The url to the KQL script blob file.
     * 
     */
    public Output<String> scriptUrl() {
        return this.scriptUrl;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
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
    public Script(String name) {
        this(name, ScriptArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Script(String name, ScriptArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Script(String name, ScriptArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:kusto:Script", name, args == null ? ScriptArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Script(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:kusto:Script", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:kusto/v20210101:Script").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20210827:Script").build())
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
    public static Script get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Script(name, id, options);
    }
}
