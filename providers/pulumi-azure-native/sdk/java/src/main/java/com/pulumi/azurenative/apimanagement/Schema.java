// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.apimanagement.SchemaArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Schema Contract details.
 * API Version: 2021-04-01-preview.
 * 
 * ## Example Usage
 * ### ApiManagementCreateSchema1
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
 *         var schema = new Schema(&#34;schema&#34;, SchemaArgs.builder()        
 *             .description(&#34;sample schema description&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .schemaId(&#34;schema1&#34;)
 *             .schemaType(&#34;xml&#34;)
 *             .serviceName(&#34;apimService1&#34;)
 *             .value(&#34;&#34;&#34;
 * &lt;xsd:schema xmlns:xsd=&#34;http://www.w3.org/2001/XMLSchema&#34;
 *            xmlns:tns=&#34;http://tempuri.org/PurchaseOrderSchema.xsd&#34;
 *            targetNamespace=&#34;http://tempuri.org/PurchaseOrderSchema.xsd&#34;
 *            elementFormDefault=&#34;qualified&#34;&gt;
 *  &lt;xsd:element name=&#34;PurchaseOrder&#34; type=&#34;tns:PurchaseOrderType&#34;/&gt;
 *  &lt;xsd:complexType name=&#34;PurchaseOrderType&#34;&gt;
 *   &lt;xsd:sequence&gt;
 *    &lt;xsd:element name=&#34;ShipTo&#34; type=&#34;tns:USAddress&#34; maxOccurs=&#34;2&#34;/&gt;
 *    &lt;xsd:element name=&#34;BillTo&#34; type=&#34;tns:USAddress&#34;/&gt;
 *   &lt;/xsd:sequence&gt;
 *   &lt;xsd:attribute name=&#34;OrderDate&#34; type=&#34;xsd:date&#34;/&gt;
 *  &lt;/xsd:complexType&gt;
 * 
 *  &lt;xsd:complexType name=&#34;USAddress&#34;&gt;
 *   &lt;xsd:sequence&gt;
 *    &lt;xsd:element name=&#34;name&#34;   type=&#34;xsd:string&#34;/&gt;
 *    &lt;xsd:element name=&#34;street&#34; type=&#34;xsd:string&#34;/&gt;
 *    &lt;xsd:element name=&#34;city&#34;   type=&#34;xsd:string&#34;/&gt;
 *    &lt;xsd:element name=&#34;state&#34;  type=&#34;xsd:string&#34;/&gt;
 *    &lt;xsd:element name=&#34;zip&#34;    type=&#34;xsd:integer&#34;/&gt;
 *   &lt;/xsd:sequence&gt;
 *   &lt;xsd:attribute name=&#34;country&#34; type=&#34;xsd:NMTOKEN&#34; fixed=&#34;US&#34;/&gt;
 *  &lt;/xsd:complexType&gt;
 * &lt;/xsd:schema&gt;            &#34;&#34;&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### ApiManagementCreateSchema2
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
 *         var schema = new Schema(&#34;schema&#34;, SchemaArgs.builder()        
 *             .description(&#34;sample schema description&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .schemaId(&#34;schema1&#34;)
 *             .schemaType(&#34;json&#34;)
 *             .serviceName(&#34;apimService1&#34;)
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
 * $ pulumi import azure-native:apimanagement:Schema schema1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/schemas/schema1 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:Schema")
public class Schema extends com.pulumi.resources.CustomResource {
    /**
     * Free-form schema entity description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Free-form schema entity description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
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
     * Schema Type. Immutable.
     * 
     */
    @Export(name="schemaType", type=String.class, parameters={})
    private Output<String> schemaType;

    /**
     * @return Schema Type. Immutable.
     * 
     */
    public Output<String> schemaType() {
        return this.schemaType;
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
     * Json-encoded string for non json-based schema.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return Json-encoded string for non json-based schema.
     * 
     */
    public Output<Optional<String>> value() {
        return Codegen.optional(this.value);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schema(String name) {
        this(name, SchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schema(String name, SchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schema(String name, SchemaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Schema", name, args == null ? SchemaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Schema(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Schema", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:Schema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:Schema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20211201preview:Schema").build())
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
    public static Schema get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Schema(name, id, options);
    }
}
