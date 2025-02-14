// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.apimanagement.ApiPolicyArgs;
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
 * Policy Contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ApiPolicy policy /subscriptions/4c1a3bc6-89f9-46fe-a175-5d8984b25095/resourcegroups/Api-DF-West-US/providers/Microsoft.ApiManagement/service/samirmsiservice2/apis/echo-api/operations/create-resource/policies/policy 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ApiPolicy")
public class ApiPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Format of the policyContent.
     * 
     */
    @Export(name="format", type=String.class, parameters={})
    private Output</* @Nullable */ String> format;

    /**
     * @return Format of the policyContent.
     * 
     */
    public Output<Optional<String>> format() {
        return Codegen.optional(this.format);
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
     * Contents of the Policy as defined by the format.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return Contents of the Policy as defined by the format.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiPolicy(String name) {
        this(name, ApiPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiPolicy(String name, ApiPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiPolicy(String name, ApiPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiPolicy", name, args == null ? ApiPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiPolicy", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:ApiPolicy").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:ApiPolicy").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180601preview:ApiPolicy").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20190101:ApiPolicy").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:ApiPolicy").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201preview:ApiPolicy").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:ApiPolicy").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:ApiPolicy").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:ApiPolicy").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:ApiPolicy").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:ApiPolicy").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20211201preview:ApiPolicy").build())
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
    public static ApiPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiPolicy(name, id, options);
    }
}
