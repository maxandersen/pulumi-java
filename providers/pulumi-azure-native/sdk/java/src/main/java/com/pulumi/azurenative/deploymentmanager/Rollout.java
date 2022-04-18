// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.deploymentmanager.RolloutArgs;
import com.pulumi.azurenative.deploymentmanager.outputs.IdentityResponse;
import com.pulumi.azurenative.deploymentmanager.outputs.StepGroupResponse;
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
 * Defines the PUT rollout request body.
 * API Version: 2019-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:deploymentmanager:Rollout myRollout /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DeploymentManager/rollouts/{rolloutName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:deploymentmanager:Rollout")
public class Rollout extends com.pulumi.resources.CustomResource {
    /**
     * The reference to the artifact source resource Id where the payload is located.
     * 
     */
    @Export(name="artifactSourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> artifactSourceId;

    /**
     * @return The reference to the artifact source resource Id where the payload is located.
     * 
     */
    public Output</* @Nullable */ String> artifactSourceId() {
        return this.artifactSourceId;
    }
    /**
     * The version of the build being deployed.
     * 
     */
    @Export(name="buildVersion", type=String.class, parameters={})
    private Output<String> buildVersion;

    /**
     * @return The version of the build being deployed.
     * 
     */
    public Output<String> buildVersion() {
        return this.buildVersion;
    }
    /**
     * Identity for the resource.
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output<IdentityResponse> identity;

    /**
     * @return Identity for the resource.
     * 
     */
    public Output<IdentityResponse> identity() {
        return this.identity;
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
     * The list of step groups that define the orchestration.
     * 
     */
    @Export(name="stepGroups", type=List.class, parameters={StepGroupResponse.class})
    private Output<List<StepGroupResponse>> stepGroups;

    /**
     * @return The list of step groups that define the orchestration.
     * 
     */
    public Output<List<StepGroupResponse>> stepGroups() {
        return this.stepGroups;
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
     * The resource Id of the service topology from which service units are being referenced in step groups to be deployed.
     * 
     */
    @Export(name="targetServiceTopologyId", type=String.class, parameters={})
    private Output<String> targetServiceTopologyId;

    /**
     * @return The resource Id of the service topology from which service units are being referenced in step groups to be deployed.
     * 
     */
    public Output<String> targetServiceTopologyId() {
        return this.targetServiceTopologyId;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Rollout(String name) {
        this(name, RolloutArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Rollout(String name, RolloutArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Rollout(String name, RolloutArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:deploymentmanager:Rollout", name, args == null ? RolloutArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Rollout(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:deploymentmanager:Rollout", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:deploymentmanager/v20180901preview:Rollout").build()),
                Output.of(Alias.builder().type("azure-native:deploymentmanager/v20191101preview:Rollout").build())
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
    public static Rollout get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Rollout(name, id, options);
    }
}
