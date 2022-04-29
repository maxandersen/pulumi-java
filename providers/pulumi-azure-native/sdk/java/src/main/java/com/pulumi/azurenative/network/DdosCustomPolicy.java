// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.DdosCustomPolicyArgs;
import com.pulumi.azurenative.network.outputs.ProtocolCustomSettingsFormatResponse;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
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
 * A DDoS custom policy in a resource group.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:DdosCustomPolicy test-ddos-custom-policy /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/ddosCustomPolicies/test-ddos-custom-policy 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:DdosCustomPolicy")
public class DdosCustomPolicy extends CustomResource {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The protocol-specific DDoS policy customization parameters.
     * 
     */
    @Export(name="protocolCustomSettings", type=List.class, parameters={ProtocolCustomSettingsFormatResponse.class})
    private Output</* @Nullable */ List<ProtocolCustomSettingsFormatResponse>> protocolCustomSettings;

    /**
     * @return The protocol-specific DDoS policy customization parameters.
     * 
     */
    public Output<Optional<List<ProtocolCustomSettingsFormatResponse>>> protocolCustomSettings() {
        return Codegen.optional(this.protocolCustomSettings);
    }
    /**
     * The provisioning state of the DDoS custom policy resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the DDoS custom policy resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The list of public IPs associated with the DDoS custom policy resource. This list is read-only.
     * 
     */
    @Export(name="publicIPAddresses", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> publicIPAddresses;

    /**
     * @return The list of public IPs associated with the DDoS custom policy resource. This list is read-only.
     * 
     */
    public Output<List<SubResourceResponse>> publicIPAddresses() {
        return this.publicIPAddresses;
    }
    /**
     * The resource GUID property of the DDoS custom policy resource. It uniquely identifies the resource, even if the user changes its name or migrate the resource across subscriptions or resource groups.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the DDoS custom policy resource. It uniquely identifies the resource, even if the user changes its name or migrate the resource across subscriptions or resource groups.
     * 
     */
    public Output<String> resourceGuid() {
        return this.resourceGuid;
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
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DdosCustomPolicy(String name) {
        this(name, DdosCustomPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DdosCustomPolicy(String name, DdosCustomPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DdosCustomPolicy(String name, DdosCustomPolicyArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:network:DdosCustomPolicy", name, args == null ? DdosCustomPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DdosCustomPolicy(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:network:DdosCustomPolicy", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20181101:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:DdosCustomPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:DdosCustomPolicy").build())
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
    public static DdosCustomPolicy get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new DdosCustomPolicy(name, id, options);
    }
}
