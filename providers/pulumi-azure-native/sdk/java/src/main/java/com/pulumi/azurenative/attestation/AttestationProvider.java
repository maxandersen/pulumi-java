// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.attestation;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.attestation.AttestationProviderArgs;
import com.pulumi.azurenative.attestation.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.azurenative.attestation.outputs.SystemDataResponse;
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
 * Attestation service response message.
 * API Version: 2020-10-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:attestation:AttestationProvider myattestationprovider subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/MyResourceGroup/providers/Microsoft.Attestation/attestationProviders/myattestationprovider 
 * ```
 * 
 */
@ResourceType(type="azure-native:attestation:AttestationProvider")
public class AttestationProvider extends com.pulumi.resources.CustomResource {
    /**
     * Gets the uri of attestation service
     * 
     */
    @Export(name="attestUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> attestUri;

    /**
     * @return Gets the uri of attestation service
     * 
     */
    public Output</* @Nullable */ String> attestUri() {
        return this.attestUri;
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
     * List of private endpoint connections associated with the attestation provider.
     * 
     */
    @Export(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return List of private endpoint connections associated with the attestation provider.
     * 
     */
    public Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Status of attestation service.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Status of attestation service.
     * 
     */
    public Output</* @Nullable */ String> status() {
        return this.status;
    }
    /**
     * The system metadata relating to this resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource
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
     * Trust model for the attestation provider.
     * 
     */
    @Export(name="trustModel", type=String.class, parameters={})
    private Output</* @Nullable */ String> trustModel;

    /**
     * @return Trust model for the attestation provider.
     * 
     */
    public Output</* @Nullable */ String> trustModel() {
        return this.trustModel;
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
    public AttestationProvider(String name) {
        this(name, AttestationProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AttestationProvider(String name, AttestationProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AttestationProvider(String name, AttestationProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:attestation:AttestationProvider", name, args == null ? AttestationProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AttestationProvider(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:attestation:AttestationProvider", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:attestation/v20180901preview:AttestationProvider").build()),
                Output.of(Alias.builder().type("azure-native:attestation/v20201001:AttestationProvider").build()),
                Output.of(Alias.builder().type("azure-native:attestation/v20210601preview:AttestationProvider").build())
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
    public static AttestationProvider get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AttestationProvider(name, id, options);
    }
}
