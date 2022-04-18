// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.automation.ConnectionTypeArgs;
import com.pulumi.azurenative.automation.outputs.FieldDefinitionResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Definition of the connection type.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:ConnectionType myCT /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/myAutomationAccount22/connectionTypes/myCT 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:ConnectionType")
public class ConnectionType extends com.pulumi.resources.CustomResource {
    /**
     * Gets the creation time.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return Gets the creation time.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * Gets or sets the description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Gets or sets the description.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Gets the field definitions of the connection type.
     * 
     */
    @Export(name="fieldDefinitions", type=Map.class, parameters={String.class, FieldDefinitionResponse.class})
    private Output<Map<String,FieldDefinitionResponse>> fieldDefinitions;

    /**
     * @return Gets the field definitions of the connection type.
     * 
     */
    public Output<Map<String,FieldDefinitionResponse>> fieldDefinitions() {
        return this.fieldDefinitions;
    }
    /**
     * Gets or sets a Boolean value to indicate if the connection type is global.
     * 
     */
    @Export(name="isGlobal", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isGlobal;

    /**
     * @return Gets or sets a Boolean value to indicate if the connection type is global.
     * 
     */
    public Output</* @Nullable */ Boolean> isGlobal() {
        return this.isGlobal;
    }
    /**
     * Gets or sets the last modified time.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    /**
     * @return Gets or sets the last modified time.
     * 
     */
    public Output</* @Nullable */ String> lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * Gets the name of the connection type.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the name of the connection type.
     * 
     */
    public Output<String> name() {
        return this.name;
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
    public ConnectionType(String name) {
        this(name, ConnectionTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionType(String name, ConnectionTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionType(String name, ConnectionTypeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:ConnectionType", name, args == null ? ConnectionTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectionType(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:ConnectionType", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:automation/v20151031:ConnectionType").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20190601:ConnectionType").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20200113preview:ConnectionType").build())
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
    public static ConnectionType get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionType(name, id, options);
    }
}
