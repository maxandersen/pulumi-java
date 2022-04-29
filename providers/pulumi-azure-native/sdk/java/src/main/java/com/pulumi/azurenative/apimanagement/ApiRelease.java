// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.apimanagement.ApiReleaseArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ApiRelease details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ApiRelease testrev /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/apis/a1/releases/testrev 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ApiRelease")
public class ApiRelease extends CustomResource {
    /**
     * Identifier of the API the release belongs to.
     * 
     */
    @Export(name="apiId", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiId;

    /**
     * @return Identifier of the API the release belongs to.
     * 
     */
    public Output<Optional<String>> apiId() {
        return Codegen.optional(this.apiId);
    }
    /**
     * The time the API was released. The date conforms to the following format: yyyy-MM-ddTHH:mm:ssZ as specified by the ISO 8601 standard.
     * 
     */
    @Export(name="createdDateTime", type=String.class, parameters={})
    private Output<String> createdDateTime;

    /**
     * @return The time the API was released. The date conforms to the following format: yyyy-MM-ddTHH:mm:ssZ as specified by the ISO 8601 standard.
     * 
     */
    public Output<String> createdDateTime() {
        return this.createdDateTime;
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
     * Release Notes
     * 
     */
    @Export(name="notes", type=String.class, parameters={})
    private Output</* @Nullable */ String> notes;

    /**
     * @return Release Notes
     * 
     */
    public Output<Optional<String>> notes() {
        return Codegen.optional(this.notes);
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
     * The time the API release was updated.
     * 
     */
    @Export(name="updatedDateTime", type=String.class, parameters={})
    private Output<String> updatedDateTime;

    /**
     * @return The time the API release was updated.
     * 
     */
    public Output<String> updatedDateTime() {
        return this.updatedDateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiRelease(String name) {
        this(name, ApiReleaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiRelease(String name, ApiReleaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiRelease(String name, ApiReleaseArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiRelease", name, args == null ? ApiReleaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiRelease(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiRelease", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:ApiRelease").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:ApiRelease").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180601preview:ApiRelease").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20190101:ApiRelease").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:ApiRelease").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201preview:ApiRelease").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:ApiRelease").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:ApiRelease").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:ApiRelease").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:ApiRelease").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:ApiRelease").build())
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
    public static ApiRelease get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ApiRelease(name, id, options);
    }
}
