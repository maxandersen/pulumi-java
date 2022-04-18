// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.servicefabricmesh.ApplicationArgs;
import com.pulumi.azurenative.servicefabricmesh.outputs.DiagnosticsDescriptionResponse;
import com.pulumi.azurenative.servicefabricmesh.outputs.ServiceResourceDescriptionResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This type describes an application resource.
 * API Version: 2018-09-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicefabricmesh:Application sampleApplication /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/sbz_demo/providers/Microsoft.ServiceFabricMesh/applications/sampleApplication 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicefabricmesh:Application")
public class Application extends com.pulumi.resources.CustomResource {
    /**
     * Internal - used by Visual Studio to setup the debugging session on the local development environment.
     * 
     */
    @Export(name="debugParams", type=String.class, parameters={})
    private Output</* @Nullable */ String> debugParams;

    /**
     * @return Internal - used by Visual Studio to setup the debugging session on the local development environment.
     * 
     */
    public Output</* @Nullable */ String> debugParams() {
        return this.debugParams;
    }
    /**
     * User readable description of the application.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return User readable description of the application.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Describes the diagnostics definition and usage for an application resource.
     * 
     */
    @Export(name="diagnostics", type=DiagnosticsDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ DiagnosticsDescriptionResponse> diagnostics;

    /**
     * @return Describes the diagnostics definition and usage for an application resource.
     * 
     */
    public Output</* @Nullable */ DiagnosticsDescriptionResponse> diagnostics() {
        return this.diagnostics;
    }
    /**
     * Describes the health state of an application resource.
     * 
     */
    @Export(name="healthState", type=String.class, parameters={})
    private Output<String> healthState;

    /**
     * @return Describes the health state of an application resource.
     * 
     */
    public Output<String> healthState() {
        return this.healthState;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * State of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Names of the services in the application.
     * 
     */
    @Export(name="serviceNames", type=List.class, parameters={String.class})
    private Output<List<String>> serviceNames;

    /**
     * @return Names of the services in the application.
     * 
     */
    public Output<List<String>> serviceNames() {
        return this.serviceNames;
    }
    /**
     * Describes the services in the application. This property is used to create or modify services of the application. On get only the name of the service is returned. The service description can be obtained by querying for the service resource.
     * 
     */
    @Export(name="services", type=List.class, parameters={ServiceResourceDescriptionResponse.class})
    private Output</* @Nullable */ List<ServiceResourceDescriptionResponse>> services;

    /**
     * @return Describes the services in the application. This property is used to create or modify services of the application. On get only the name of the service is returned. The service description can be obtained by querying for the service resource.
     * 
     */
    public Output</* @Nullable */ List<ServiceResourceDescriptionResponse>> services() {
        return this.services;
    }
    /**
     * Status of the application.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the application.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Gives additional information about the current status of the application.
     * 
     */
    @Export(name="statusDetails", type=String.class, parameters={})
    private Output<String> statusDetails;

    /**
     * @return Gives additional information about the current status of the application.
     * 
     */
    public Output<String> statusDetails() {
        return this.statusDetails;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * When the application's health state is not 'Ok', this additional details from service fabric Health Manager for the user to know why the application is marked unhealthy.
     * 
     */
    @Export(name="unhealthyEvaluation", type=String.class, parameters={})
    private Output<String> unhealthyEvaluation;

    /**
     * @return When the application's health state is not 'Ok', this additional details from service fabric Health Manager for the user to know why the application is marked unhealthy.
     * 
     */
    public Output<String> unhealthyEvaluation() {
        return this.unhealthyEvaluation;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, ApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabricmesh:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Application(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabricmesh:Application", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:servicefabricmesh/v20180701preview:Application").build()),
                Output.of(Alias.builder().type("azure-native:servicefabricmesh/v20180901preview:Application").build())
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
    public static Application get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, options);
    }
}
