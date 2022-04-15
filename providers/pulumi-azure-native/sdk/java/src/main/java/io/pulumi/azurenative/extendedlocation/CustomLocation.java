// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.extendedlocation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.extendedlocation.CustomLocationArgs;
import io.pulumi.azurenative.extendedlocation.outputs.CustomLocationPropertiesResponseAuthentication;
import io.pulumi.azurenative.extendedlocation.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Custom Locations definition.
 * API Version: 2021-03-15-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:extendedlocation:CustomLocation customLocation01 /subscriptions/11111111-2222-3333-4444-555555555555/resourceGroups/testrg/providers/Microsoft.ExtendedLocation/customLocations/customLocation01 
 * ```
 * 
 */
@ResourceType(type="azure-native:extendedlocation:CustomLocation")
public class CustomLocation extends io.pulumi.resources.CustomResource {
    /**
     * This is optional input that contains the authentication that should be used to generate the namespace.
     * 
     */
    @Export(name="authentication", type=CustomLocationPropertiesResponseAuthentication.class, parameters={})
    private Output</* @Nullable */ CustomLocationPropertiesResponseAuthentication> authentication;

    /**
     * @return This is optional input that contains the authentication that should be used to generate the namespace.
     * 
     */
    public Output</* @Nullable */ CustomLocationPropertiesResponseAuthentication> authentication() {
        return this.authentication;
    }
    /**
     * Contains the reference to the add-on that contains charts to deploy CRDs and operators.
     * 
     */
    @Export(name="clusterExtensionIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> clusterExtensionIds;

    /**
     * @return Contains the reference to the add-on that contains charts to deploy CRDs and operators.
     * 
     */
    public Output</* @Nullable */ List<String>> clusterExtensionIds() {
        return this.clusterExtensionIds;
    }
    /**
     * Display name for the Custom Locations location.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Display name for the Custom Locations location.
     * 
     */
    public Output</* @Nullable */ String> displayName() {
        return this.displayName;
    }
    /**
     * Connected Cluster or AKS Cluster. The Custom Locations RP will perform a checkAccess API for listAdminCredentials permissions.
     * 
     */
    @Export(name="hostResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostResourceId;

    /**
     * @return Connected Cluster or AKS Cluster. The Custom Locations RP will perform a checkAccess API for listAdminCredentials permissions.
     * 
     */
    public Output</* @Nullable */ String> hostResourceId() {
        return this.hostResourceId;
    }
    /**
     * Type of host the Custom Locations is referencing (Kubernetes, etc...).
     * 
     */
    @Export(name="hostType", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostType;

    /**
     * @return Type of host the Custom Locations is referencing (Kubernetes, etc...).
     * 
     */
    public Output</* @Nullable */ String> hostType() {
        return this.hostType;
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
     * Kubernetes namespace that will be created on the specified cluster.
     * 
     */
    @Export(name="namespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> namespace;

    /**
     * @return Kubernetes namespace that will be created on the specified cluster.
     * 
     */
    public Output</* @Nullable */ String> namespace() {
        return this.namespace;
    }
    /**
     * Provisioning State for the Custom Location.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Provisioning State for the Custom Location.
     * 
     */
    public Output</* @Nullable */ String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
    public CustomLocation(String name) {
        this(name, CustomLocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomLocation(String name, CustomLocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomLocation(String name, CustomLocationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:extendedlocation:CustomLocation", name, args == null ? CustomLocationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomLocation(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:extendedlocation:CustomLocation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:extendedlocation/v20210315preview:CustomLocation").build()),
                Output.of(Alias.builder().type("azure-native:extendedlocation/v20210815:CustomLocation").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CustomLocation get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CustomLocation(name, id, options);
    }
}
