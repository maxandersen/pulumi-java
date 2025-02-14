// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.deploymentmanager.ServiceUnitArgs;
import com.pulumi.azurenative.deploymentmanager.outputs.ServiceUnitArtifactsResponse;
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
 * Represents the response of a service unit resource.
 * API Version: 2019-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:deploymentmanager:ServiceUnit myServiceUnit /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DeploymentManager/serviceTopologies/{serviceTopologyName}/services/{serviceName}/serviceUnits/{serviceUnitName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:deploymentmanager:ServiceUnit")
public class ServiceUnit extends com.pulumi.resources.CustomResource {
    /**
     * The artifacts for the service unit.
     * 
     */
    @Export(name="artifacts", type=ServiceUnitArtifactsResponse.class, parameters={})
    private Output</* @Nullable */ ServiceUnitArtifactsResponse> artifacts;

    /**
     * @return The artifacts for the service unit.
     * 
     */
    public Output<Optional<ServiceUnitArtifactsResponse>> artifacts() {
        return Codegen.optional(this.artifacts);
    }
    /**
     * Describes the type of ARM deployment to be performed on the resource.
     * 
     */
    @Export(name="deploymentMode", type=String.class, parameters={})
    private Output<String> deploymentMode;

    /**
     * @return Describes the type of ARM deployment to be performed on the resource.
     * 
     */
    public Output<String> deploymentMode() {
        return this.deploymentMode;
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
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The Azure Resource Group to which the resources in the service unit belong to or should be deployed to.
     * 
     */
    @Export(name="targetResourceGroup", type=String.class, parameters={})
    private Output<String> targetResourceGroup;

    /**
     * @return The Azure Resource Group to which the resources in the service unit belong to or should be deployed to.
     * 
     */
    public Output<String> targetResourceGroup() {
        return this.targetResourceGroup;
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
    public ServiceUnit(String name) {
        this(name, ServiceUnitArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceUnit(String name, ServiceUnitArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceUnit(String name, ServiceUnitArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:deploymentmanager:ServiceUnit", name, args == null ? ServiceUnitArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceUnit(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:deploymentmanager:ServiceUnit", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:deploymentmanager/v20180901preview:ServiceUnit").build()),
                Output.of(Alias.builder().type("azure-native:deploymentmanager/v20191101preview:ServiceUnit").build())
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
    public static ServiceUnit get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceUnit(name, id, options);
    }
}
