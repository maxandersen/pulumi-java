// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.containerservice.OpenShiftManagedClusterArgs;
import com.pulumi.azurenative.containerservice.outputs.NetworkProfileResponse;
import com.pulumi.azurenative.containerservice.outputs.OpenShiftManagedClusterAgentPoolProfileResponse;
import com.pulumi.azurenative.containerservice.outputs.OpenShiftManagedClusterAuthProfileResponse;
import com.pulumi.azurenative.containerservice.outputs.OpenShiftManagedClusterMasterPoolProfileResponse;
import com.pulumi.azurenative.containerservice.outputs.OpenShiftRouterProfileResponse;
import com.pulumi.azurenative.containerservice.outputs.PurchasePlanResponse;
import com.pulumi.core.Alias;
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
 * OpenShift Managed cluster.
 * API Version: 2019-04-30.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:containerservice:OpenShiftManagedCluster clustername1 /subscriptions/subid1/resourcegroups/rg1/providers/Microsoft.ContainerService/openShiftManagedClusters/clustername1 
 * ```
 * 
 */
@ResourceType(type="azure-native:containerservice:OpenShiftManagedCluster")
public class OpenShiftManagedCluster extends CustomResource {
    /**
     * Configuration of OpenShift cluster VMs.
     * 
     */
    @Export(name="agentPoolProfiles", type=List.class, parameters={OpenShiftManagedClusterAgentPoolProfileResponse.class})
    private Output</* @Nullable */ List<OpenShiftManagedClusterAgentPoolProfileResponse>> agentPoolProfiles;

    /**
     * @return Configuration of OpenShift cluster VMs.
     * 
     */
    public Output<Optional<List<OpenShiftManagedClusterAgentPoolProfileResponse>>> agentPoolProfiles() {
        return Codegen.optional(this.agentPoolProfiles);
    }
    /**
     * Configures OpenShift authentication.
     * 
     */
    @Export(name="authProfile", type=OpenShiftManagedClusterAuthProfileResponse.class, parameters={})
    private Output</* @Nullable */ OpenShiftManagedClusterAuthProfileResponse> authProfile;

    /**
     * @return Configures OpenShift authentication.
     * 
     */
    public Output<Optional<OpenShiftManagedClusterAuthProfileResponse>> authProfile() {
        return Codegen.optional(this.authProfile);
    }
    /**
     * Version of OpenShift specified when creating the cluster.
     * 
     */
    @Export(name="clusterVersion", type=String.class, parameters={})
    private Output<String> clusterVersion;

    /**
     * @return Version of OpenShift specified when creating the cluster.
     * 
     */
    public Output<String> clusterVersion() {
        return this.clusterVersion;
    }
    /**
     * Service generated FQDN for OpenShift API server loadbalancer internal hostname.
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return Service generated FQDN for OpenShift API server loadbalancer internal hostname.
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Configuration for OpenShift master VMs.
     * 
     */
    @Export(name="masterPoolProfile", type=OpenShiftManagedClusterMasterPoolProfileResponse.class, parameters={})
    private Output</* @Nullable */ OpenShiftManagedClusterMasterPoolProfileResponse> masterPoolProfile;

    /**
     * @return Configuration for OpenShift master VMs.
     * 
     */
    public Output<Optional<OpenShiftManagedClusterMasterPoolProfileResponse>> masterPoolProfile() {
        return Codegen.optional(this.masterPoolProfile);
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration for OpenShift networking.
     * 
     */
    @Export(name="networkProfile", type=NetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ NetworkProfileResponse> networkProfile;

    /**
     * @return Configuration for OpenShift networking.
     * 
     */
    public Output<Optional<NetworkProfileResponse>> networkProfile() {
        return Codegen.optional(this.networkProfile);
    }
    /**
     * Version of OpenShift specified when creating the cluster.
     * 
     */
    @Export(name="openShiftVersion", type=String.class, parameters={})
    private Output<String> openShiftVersion;

    /**
     * @return Version of OpenShift specified when creating the cluster.
     * 
     */
    public Output<String> openShiftVersion() {
        return this.openShiftVersion;
    }
    /**
     * Define the resource plan as required by ARM for billing purposes
     * 
     */
    @Export(name="plan", type=PurchasePlanResponse.class, parameters={})
    private Output</* @Nullable */ PurchasePlanResponse> plan;

    /**
     * @return Define the resource plan as required by ARM for billing purposes
     * 
     */
    public Output<Optional<PurchasePlanResponse>> plan() {
        return Codegen.optional(this.plan);
    }
    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The current deployment or provisioning state, which only appears in the response.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Service generated FQDN for OpenShift API server.
     * 
     */
    @Export(name="publicHostname", type=String.class, parameters={})
    private Output<String> publicHostname;

    /**
     * @return Service generated FQDN for OpenShift API server.
     * 
     */
    public Output<String> publicHostname() {
        return this.publicHostname;
    }
    /**
     * Configuration for OpenShift router(s).
     * 
     */
    @Export(name="routerProfiles", type=List.class, parameters={OpenShiftRouterProfileResponse.class})
    private Output</* @Nullable */ List<OpenShiftRouterProfileResponse>> routerProfiles;

    /**
     * @return Configuration for OpenShift router(s).
     * 
     */
    public Output<Optional<List<OpenShiftRouterProfileResponse>>> routerProfiles() {
        return Codegen.optional(this.routerProfiles);
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
    public OpenShiftManagedCluster(String name) {
        this(name, OpenShiftManagedClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OpenShiftManagedCluster(String name, OpenShiftManagedClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OpenShiftManagedCluster(String name, OpenShiftManagedClusterArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:containerservice:OpenShiftManagedCluster", name, args == null ? OpenShiftManagedClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OpenShiftManagedCluster(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:containerservice:OpenShiftManagedCluster", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:containerservice/v20180930preview:OpenShiftManagedCluster").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20190430:OpenShiftManagedCluster").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20190930preview:OpenShiftManagedCluster").build()),
                Output.of(Alias.builder().type("azure-native:containerservice/v20191027preview:OpenShiftManagedCluster").build())
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
    public static OpenShiftManagedCluster get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new OpenShiftManagedCluster(name, id, options);
    }
}
