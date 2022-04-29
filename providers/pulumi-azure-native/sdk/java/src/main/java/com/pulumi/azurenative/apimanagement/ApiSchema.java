// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.apimanagement.ApiSchemaArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Schema Contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ApiSchema ec12520d-9d48-4e7b-8f39-698ca2ac63f1 /subscriptions/subid/resourcegroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/apis/59d6bb8f1f7fab13dc67ec9b/schemas/ec12520d-9d48-4e7b-8f39-698ca2ac63f1 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ApiSchema")
public class ApiSchema extends CustomResource {
    /**
     * Must be a valid a media type used in a Content-Type header as defined in the RFC 2616. Media type of the schema document (e.g. application/json, application/xml). &lt;/br&gt; - `Swagger` Schema use `application/vnd.ms-azure-apim.swagger.definitions+json` &lt;/br&gt; - `WSDL` Schema use `application/vnd.ms-azure-apim.xsd+xml` &lt;/br&gt; - `OpenApi` Schema use `application/vnd.oai.openapi.components+json` &lt;/br&gt; - `WADL Schema` use `application/vnd.ms-azure-apim.wadl.grammars+xml`.
     * 
     */
    @Export(name="contentType", type=String.class, parameters={})
    private Output<String> contentType;

    /**
     * @return Must be a valid a media type used in a Content-Type header as defined in the RFC 2616. Media type of the schema document (e.g. application/json, application/xml). &lt;/br&gt; - `Swagger` Schema use `application/vnd.ms-azure-apim.swagger.definitions+json` &lt;/br&gt; - `WSDL` Schema use `application/vnd.ms-azure-apim.xsd+xml` &lt;/br&gt; - `OpenApi` Schema use `application/vnd.oai.openapi.components+json` &lt;/br&gt; - `WADL Schema` use `application/vnd.ms-azure-apim.wadl.grammars+xml`.
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }
    /**
     * Types definitions. Used for Swagger/OpenAPI schemas only, null otherwise.
     * 
     */
    @Export(name="definitions", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> definitions;

    /**
     * @return Types definitions. Used for Swagger/OpenAPI schemas only, null otherwise.
     * 
     */
    public Output<Optional<Object>> definitions() {
        return Codegen.optional(this.definitions);
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
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Json escaped string defining the document representing the Schema. Used for schemas other than Swagger/OpenAPI.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return Json escaped string defining the document representing the Schema. Used for schemas other than Swagger/OpenAPI.
     * 
     */
    public Output<Optional<String>> value() {
        return Codegen.optional(this.value);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiSchema(String name) {
        this(name, ApiSchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiSchema(String name, ApiSchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiSchema(String name, ApiSchemaArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiSchema", name, args == null ? ApiSchemaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiSchema(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiSchema", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180601preview:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20190101:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201preview:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:ApiSchema").build())
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
    public static ApiSchema get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ApiSchema(name, id, options);
    }
}
