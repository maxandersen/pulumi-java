// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datamigration.ServiceArgs;
import com.pulumi.azurenative.datamigration.outputs.ServiceSkuResponse;
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
 * A Database Migration Service resource
 * API Version: 2018-04-19.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datamigration:Service DmsSdkService /subscriptions/fc04246f-04c5-437e-ac5e-206a19e7193f/resourceGroups/DmsSdkRg/providers/Microsoft.DataMigration/services/DmsSdkService 
 * ```
 * 
 */
@ResourceType(type="azure-native:datamigration:Service")
public class Service extends CustomResource {
    /**
     * HTTP strong entity tag value. Ignored if submitted
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return HTTP strong entity tag value. Ignored if submitted
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * The resource kind. Only &#39;vm&#39; (the default) is supported.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The resource kind. Only &#39;vm&#39; (the default) is supported.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * The resource&#39;s provisioning state
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The resource&#39;s provisioning state
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The public key of the service, used to encrypt secrets sent to the service
     * 
     */
    @Export(name="publicKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicKey;

    /**
     * @return The public key of the service, used to encrypt secrets sent to the service
     * 
     */
    public Output<Optional<String>> publicKey() {
        return Codegen.optional(this.publicKey);
    }
    /**
     * Service SKU
     * 
     */
    @Export(name="sku", type=ServiceSkuResponse.class, parameters={})
    private Output</* @Nullable */ ServiceSkuResponse> sku;

    /**
     * @return Service SKU
     * 
     */
    public Output<Optional<ServiceSkuResponse>> sku() {
        return Codegen.optional(this.sku);
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
     * The ID of the Microsoft.Network/virtualNetworks/subnets resource to which the service should be joined
     * 
     */
    @Export(name="virtualSubnetId", type=String.class, parameters={})
    private Output<String> virtualSubnetId;

    /**
     * @return The ID of the Microsoft.Network/virtualNetworks/subnets resource to which the service should be joined
     * 
     */
    public Output<String> virtualSubnetId() {
        return this.virtualSubnetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:datamigration:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Service(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:datamigration:Service", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datamigration/v20171115preview:Service").build()),
                Output.of(Alias.builder().type("azure-native:datamigration/v20180315preview:Service").build()),
                Output.of(Alias.builder().type("azure-native:datamigration/v20180331preview:Service").build()),
                Output.of(Alias.builder().type("azure-native:datamigration/v20180419:Service").build()),
                Output.of(Alias.builder().type("azure-native:datamigration/v20180715preview:Service").build()),
                Output.of(Alias.builder().type("azure-native:datamigration/v20210630:Service").build()),
                Output.of(Alias.builder().type("azure-native:datamigration/v20211030preview:Service").build())
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
    public static Service get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Service(name, id, options);
    }
}
