// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.deploymentmanager.StepArgs;
import com.pulumi.azurenative.deploymentmanager.outputs.HealthCheckStepPropertiesResponse;
import com.pulumi.azurenative.deploymentmanager.outputs.WaitStepPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The resource representation of a rollout step.
 * API Version: 2019-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:deploymentmanager:Step waitStep /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DeploymentManager/steps/{stepName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:deploymentmanager:Step")
public class Step extends CustomResource {
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
     * The properties that define the step.
     * 
     */
    @Export(name="properties", type=Either.class, parameters={HealthCheckStepPropertiesResponse.class, WaitStepPropertiesResponse.class})
    private Output<Either<HealthCheckStepPropertiesResponse,WaitStepPropertiesResponse>> properties;

    /**
     * @return The properties that define the step.
     * 
     */
    public Output<Either<HealthCheckStepPropertiesResponse,WaitStepPropertiesResponse>> properties() {
        return this.properties;
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
    public Step(String name) {
        this(name, StepArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Step(String name, StepArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Step(String name, StepArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:deploymentmanager:Step", name, args == null ? StepArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Step(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:deploymentmanager:Step", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:deploymentmanager/v20180901preview:Step").build()),
                Output.of(Alias.builder().type("azure-native:deploymentmanager/v20191101preview:Step").build())
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
    public static Step get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Step(name, id, options);
    }
}
