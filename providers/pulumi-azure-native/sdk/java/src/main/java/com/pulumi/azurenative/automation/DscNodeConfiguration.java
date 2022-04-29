// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.automation.DscNodeConfigurationArgs;
import com.pulumi.azurenative.automation.outputs.DscConfigurationAssociationPropertyResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Definition of the dsc node configuration.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:DscNodeConfiguration configName.nodeConfigName /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/myAutomationAccount20/nodeConfigurations/configName.nodeConfigName 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:DscNodeConfiguration")
public class DscNodeConfiguration extends CustomResource {
    /**
     * Gets or sets the configuration of the node.
     * 
     */
    @Export(name="configuration", type=DscConfigurationAssociationPropertyResponse.class, parameters={})
    private Output</* @Nullable */ DscConfigurationAssociationPropertyResponse> configuration;

    /**
     * @return Gets or sets the configuration of the node.
     * 
     */
    public Output<Optional<DscConfigurationAssociationPropertyResponse>> configuration() {
        return Codegen.optional(this.configuration);
    }
    /**
     * Gets or sets creation time.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> creationTime;

    /**
     * @return Gets or sets creation time.
     * 
     */
    public Output<Optional<String>> creationTime() {
        return Codegen.optional(this.creationTime);
    }
    /**
     * If a new build version of NodeConfiguration is required.
     * 
     */
    @Export(name="incrementNodeConfigurationBuild", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> incrementNodeConfigurationBuild;

    /**
     * @return If a new build version of NodeConfiguration is required.
     * 
     */
    public Output<Optional<Boolean>> incrementNodeConfigurationBuild() {
        return Codegen.optional(this.incrementNodeConfigurationBuild);
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
    public Output<Optional<String>> lastModifiedTime() {
        return Codegen.optional(this.lastModifiedTime);
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
     * Number of nodes with this node configuration assigned
     * 
     */
    @Export(name="nodeCount", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> nodeCount;

    /**
     * @return Number of nodes with this node configuration assigned
     * 
     */
    public Output<Optional<Double>> nodeCount() {
        return Codegen.optional(this.nodeCount);
    }
    /**
     * Source of node configuration.
     * 
     */
    @Export(name="source", type=String.class, parameters={})
    private Output</* @Nullable */ String> source;

    /**
     * @return Source of node configuration.
     * 
     */
    public Output<Optional<String>> source() {
        return Codegen.optional(this.source);
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DscNodeConfiguration(String name) {
        this(name, DscNodeConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DscNodeConfiguration(String name, DscNodeConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DscNodeConfiguration(String name, DscNodeConfigurationArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:automation:DscNodeConfiguration", name, args == null ? DscNodeConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DscNodeConfiguration(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:automation:DscNodeConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:automation/v20151031:DscNodeConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20180115:DscNodeConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20190601:DscNodeConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:automation/v20200113preview:DscNodeConfiguration").build())
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
    public static DscNodeConfiguration get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new DscNodeConfiguration(name, id, options);
    }
}
