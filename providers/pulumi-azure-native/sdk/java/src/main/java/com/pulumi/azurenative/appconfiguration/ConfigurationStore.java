// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appconfiguration;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.appconfiguration.ConfigurationStoreArgs;
import com.pulumi.azurenative.appconfiguration.outputs.EncryptionPropertiesResponse;
import com.pulumi.azurenative.appconfiguration.outputs.PrivateEndpointConnectionReferenceResponse;
import com.pulumi.azurenative.appconfiguration.outputs.ResourceIdentityResponse;
import com.pulumi.azurenative.appconfiguration.outputs.SkuResponse;
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
 * The configuration store along with all resource properties. The Configuration Store will have all information to begin utilizing it.
 * API Version: 2020-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:appconfiguration:ConfigurationStore contoso /subscriptions/c80fb759-c965-4c6a-9110-9b2b2d038882/resourceGroups/myResourceGroup/providers/Microsoft.AppConfiguration/configurationStores/contoso 
 * ```
 * 
 */
@ResourceType(type="azure-native:appconfiguration:ConfigurationStore")
public class ConfigurationStore extends CustomResource {
    /**
     * The creation date of configuration store.
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The creation date of configuration store.
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * The encryption settings of the configuration store.
     * 
     */
    @Export(name="encryption", type=EncryptionPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ EncryptionPropertiesResponse> encryption;

    /**
     * @return The encryption settings of the configuration store.
     * 
     */
    public Output<Optional<EncryptionPropertiesResponse>> encryption() {
        return Codegen.optional(this.encryption);
    }
    /**
     * The DNS endpoint where the configuration store API will be available.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The DNS endpoint where the configuration store API will be available.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * The managed identity information, if configured.
     * 
     */
    @Export(name="identity", type=ResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ResourceIdentityResponse> identity;

    /**
     * @return The managed identity information, if configured.
     * 
     */
    public Output<Optional<ResourceIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The list of private endpoint connections that are set up for this resource.
     * 
     */
    @Export(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionReferenceResponse.class})
    private Output<List<PrivateEndpointConnectionReferenceResponse>> privateEndpointConnections;

    /**
     * @return The list of private endpoint connections that are set up for this resource.
     * 
     */
    public Output<List<PrivateEndpointConnectionReferenceResponse>> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * The provisioning state of the configuration store.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the configuration store.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    @Export(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    public Output<Optional<String>> publicNetworkAccess() {
        return Codegen.optional(this.publicNetworkAccess);
    }
    /**
     * The sku of the configuration store.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return The sku of the configuration store.
     * 
     */
    public Output<SkuResponse> sku() {
        return this.sku;
    }
    /**
     * The tags of the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
    public ConfigurationStore(String name) {
        this(name, ConfigurationStoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationStore(String name, ConfigurationStoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationStore(String name, ConfigurationStoreArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:appconfiguration:ConfigurationStore", name, args == null ? ConfigurationStoreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationStore(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:appconfiguration:ConfigurationStore", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:appconfiguration/v20190201preview:ConfigurationStore").build()),
                Output.of(Alias.builder().type("azure-native:appconfiguration/v20191001:ConfigurationStore").build()),
                Output.of(Alias.builder().type("azure-native:appconfiguration/v20191101preview:ConfigurationStore").build()),
                Output.of(Alias.builder().type("azure-native:appconfiguration/v20200601:ConfigurationStore").build()),
                Output.of(Alias.builder().type("azure-native:appconfiguration/v20200701preview:ConfigurationStore").build()),
                Output.of(Alias.builder().type("azure-native:appconfiguration/v20210301preview:ConfigurationStore").build()),
                Output.of(Alias.builder().type("azure-native:appconfiguration/v20211001preview:ConfigurationStore").build())
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
    public static ConfigurationStore get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ConfigurationStore(name, id, options);
    }
}
