// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.redhatopenshift;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.redhatopenshift.OpenShiftClusterArgs;
import com.pulumi.azurenative.redhatopenshift.outputs.APIServerProfileResponse;
import com.pulumi.azurenative.redhatopenshift.outputs.ClusterProfileResponse;
import com.pulumi.azurenative.redhatopenshift.outputs.ConsoleProfileResponse;
import com.pulumi.azurenative.redhatopenshift.outputs.IngressProfileResponse;
import com.pulumi.azurenative.redhatopenshift.outputs.MasterProfileResponse;
import com.pulumi.azurenative.redhatopenshift.outputs.NetworkProfileResponse;
import com.pulumi.azurenative.redhatopenshift.outputs.ServicePrincipalProfileResponse;
import com.pulumi.azurenative.redhatopenshift.outputs.WorkerProfileResponse;
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
 * OpenShiftCluster represents an Azure Red Hat OpenShift cluster.
 * API Version: 2020-04-30.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:redhatopenshift:OpenShiftCluster resourceName /subscriptions/subscriptionId/resourceGroups/resourceGroup/providers/Microsoft.RedHatOpenShift/OpenShiftClusters/resourceName 
 * ```
 * 
 */
@ResourceType(type="azure-native:redhatopenshift:OpenShiftCluster")
public class OpenShiftCluster extends com.pulumi.resources.CustomResource {
    /**
     * The cluster API server profile.
     * 
     */
    @Export(name="apiserverProfile", type=APIServerProfileResponse.class, parameters={})
    private Output</* @Nullable */ APIServerProfileResponse> apiserverProfile;

    /**
     * @return The cluster API server profile.
     * 
     */
    public Output</* @Nullable */ APIServerProfileResponse> apiserverProfile() {
        return this.apiserverProfile;
    }
    /**
     * The cluster profile.
     * 
     */
    @Export(name="clusterProfile", type=ClusterProfileResponse.class, parameters={})
    private Output</* @Nullable */ ClusterProfileResponse> clusterProfile;

    /**
     * @return The cluster profile.
     * 
     */
    public Output</* @Nullable */ ClusterProfileResponse> clusterProfile() {
        return this.clusterProfile;
    }
    /**
     * The console profile.
     * 
     */
    @Export(name="consoleProfile", type=ConsoleProfileResponse.class, parameters={})
    private Output</* @Nullable */ ConsoleProfileResponse> consoleProfile;

    /**
     * @return The console profile.
     * 
     */
    public Output</* @Nullable */ ConsoleProfileResponse> consoleProfile() {
        return this.consoleProfile;
    }
    /**
     * The cluster ingress profiles.
     * 
     */
    @Export(name="ingressProfiles", type=List.class, parameters={IngressProfileResponse.class})
    private Output</* @Nullable */ List<IngressProfileResponse>> ingressProfiles;

    /**
     * @return The cluster ingress profiles.
     * 
     */
    public Output</* @Nullable */ List<IngressProfileResponse>> ingressProfiles() {
        return this.ingressProfiles;
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
     * The cluster master profile.
     * 
     */
    @Export(name="masterProfile", type=MasterProfileResponse.class, parameters={})
    private Output</* @Nullable */ MasterProfileResponse> masterProfile;

    /**
     * @return The cluster master profile.
     * 
     */
    public Output</* @Nullable */ MasterProfileResponse> masterProfile() {
        return this.masterProfile;
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
     * The cluster network profile.
     * 
     */
    @Export(name="networkProfile", type=NetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ NetworkProfileResponse> networkProfile;

    /**
     * @return The cluster network profile.
     * 
     */
    public Output</* @Nullable */ NetworkProfileResponse> networkProfile() {
        return this.networkProfile;
    }
    /**
     * The cluster provisioning state (immutable).
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return The cluster provisioning state (immutable).
     * 
     */
    public Output</* @Nullable */ String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The cluster service principal profile.
     * 
     */
    @Export(name="servicePrincipalProfile", type=ServicePrincipalProfileResponse.class, parameters={})
    private Output</* @Nullable */ ServicePrincipalProfileResponse> servicePrincipalProfile;

    /**
     * @return The cluster service principal profile.
     * 
     */
    public Output</* @Nullable */ ServicePrincipalProfileResponse> servicePrincipalProfile() {
        return this.servicePrincipalProfile;
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
     * The cluster worker profiles.
     * 
     */
    @Export(name="workerProfiles", type=List.class, parameters={WorkerProfileResponse.class})
    private Output</* @Nullable */ List<WorkerProfileResponse>> workerProfiles;

    /**
     * @return The cluster worker profiles.
     * 
     */
    public Output</* @Nullable */ List<WorkerProfileResponse>> workerProfiles() {
        return this.workerProfiles;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OpenShiftCluster(String name) {
        this(name, OpenShiftClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OpenShiftCluster(String name, OpenShiftClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OpenShiftCluster(String name, OpenShiftClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:redhatopenshift:OpenShiftCluster", name, args == null ? OpenShiftClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OpenShiftCluster(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:redhatopenshift:OpenShiftCluster", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:redhatopenshift/v20200430:OpenShiftCluster").build()),
                Output.of(Alias.builder().type("azure-native:redhatopenshift/v20210901preview:OpenShiftCluster").build())
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
    public static OpenShiftCluster get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OpenShiftCluster(name, id, options);
    }
}
