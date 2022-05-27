// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managementpartner;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.managementpartner.PartnerArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * this is the management partner operations response
 * API Version: 2018-02-01.
 * 
 * ## Example Usage
 * ### PutPartnerDetails
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var partner = new Partner(&#34;partner&#34;, PartnerArgs.builder()        
 *             .partnerId(&#34;123456&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:managementpartner:Partner 123456 /providers/microsoft.managementpartner/partners/123456 
 * ```
 * 
 */
@ResourceType(type="azure-native:managementpartner:Partner")
public class Partner extends com.pulumi.resources.CustomResource {
    /**
     * This is the DateTime when the partner was created.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdTime;

    /**
     * @return This is the DateTime when the partner was created.
     * 
     */
    public Output<Optional<String>> createdTime() {
        return Codegen.optional(this.createdTime);
    }
    /**
     * Type of the partner
     * 
     */
    @Export(name="etag", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> etag;

    /**
     * @return Type of the partner
     * 
     */
    public Output<Optional<Integer>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * Name of the partner
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the partner
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * This is the object id.
     * 
     */
    @Export(name="objectId", type=String.class, parameters={})
    private Output</* @Nullable */ String> objectId;

    /**
     * @return This is the object id.
     * 
     */
    public Output<Optional<String>> objectId() {
        return Codegen.optional(this.objectId);
    }
    /**
     * This is the partner id
     * 
     */
    @Export(name="partnerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerId;

    /**
     * @return This is the partner id
     * 
     */
    public Output<Optional<String>> partnerId() {
        return Codegen.optional(this.partnerId);
    }
    /**
     * This is the partner name
     * 
     */
    @Export(name="partnerName", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerName;

    /**
     * @return This is the partner name
     * 
     */
    public Output<Optional<String>> partnerName() {
        return Codegen.optional(this.partnerName);
    }
    /**
     * This is the tenant id.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return This is the tenant id.
     * 
     */
    public Output<Optional<String>> tenantId() {
        return Codegen.optional(this.tenantId);
    }
    /**
     * Type of resource. &#34;Microsoft.ManagementPartner/partners&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of resource. &#34;Microsoft.ManagementPartner/partners&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * This is the DateTime when the partner was updated.
     * 
     */
    @Export(name="updatedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> updatedTime;

    /**
     * @return This is the DateTime when the partner was updated.
     * 
     */
    public Output<Optional<String>> updatedTime() {
        return Codegen.optional(this.updatedTime);
    }
    /**
     * This is the version.
     * 
     */
    @Export(name="version", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> version;

    /**
     * @return This is the version.
     * 
     */
    public Output<Optional<Integer>> version() {
        return Codegen.optional(this.version);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Partner(String name) {
        this(name, PartnerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Partner(String name, @Nullable PartnerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Partner(String name, @Nullable PartnerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:managementpartner:Partner", name, args == null ? PartnerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Partner(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:managementpartner:Partner", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:managementpartner/v20180201:Partner").build())
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
    public static Partner get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Partner(name, id, options);
    }
}
