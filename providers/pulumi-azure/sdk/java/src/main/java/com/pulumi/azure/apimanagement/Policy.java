// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.PolicyArgs;
import com.pulumi.azure.apimanagement.inputs.PolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a API Management service Policy.
 * 
 * &gt; **NOTE:** This resource will, upon creation, **overwrite any existing policy in the API Management service**, as there is no feasible way to test whether the policy has been modified from the default. Similarly, when this resource is destroyed, the API Management service will revert to its default policy.
 * 
 * ## Example Usage
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .publisherName(&#34;pub1&#34;)
 *             .publisherEmail(&#34;pub1@email.com&#34;)
 *             .skuName(&#34;Developer_1&#34;)
 *             .build());
 * 
 *         var exampleNamedValue = new NamedValue(&#34;exampleNamedValue&#34;, NamedValueArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .apiManagementName(exampleService.getName())
 *             .displayName(&#34;ExampleProperty&#34;)
 *             .value(&#34;Example Value&#34;)
 *             .build());
 * 
 *         var examplePolicy = new Policy(&#34;examplePolicy&#34;, PolicyArgs.builder()        
 *             .apiManagementId(exampleService.getId())
 *             .xmlContent(Files.readString(&#34;example.xml&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * API Management service Policys can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:apimanagement/policy:Policy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/instance1/policies/policy
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/policy:Policy")
public class Policy extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the API Management service. Changing this forces a new API Management service Policy to be created.
     * 
     */
    @Export(name="apiManagementId", type=String.class, parameters={})
    private Output<String> apiManagementId;

    /**
     * @return The ID of the API Management service. Changing this forces a new API Management service Policy to be created.
     * 
     */
    public Output<String> apiManagementId() {
        return this.apiManagementId;
    }
    /**
     * The XML Content for this Policy as a string.
     * 
     */
    @Export(name="xmlContent", type=String.class, parameters={})
    private Output<String> xmlContent;

    /**
     * @return The XML Content for this Policy as a string.
     * 
     */
    public Output<String> xmlContent() {
        return this.xmlContent;
    }
    /**
     * A link to a Policy XML Document, which must be publicly available.
     * 
     */
    @Export(name="xmlLink", type=String.class, parameters={})
    private Output</* @Nullable */ String> xmlLink;

    /**
     * @return A link to a Policy XML Document, which must be publicly available.
     * 
     */
    public Output<Optional<String>> xmlLink() {
        return Codegen.optional(this.xmlLink);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Policy(String name) {
        this(name, PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Policy(String name, PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, PolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/policy:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Policy(String name, Output<String> id, @Nullable PolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/policy:Policy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Policy get(String name, Output<String> id, @Nullable PolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, state, options);
    }
}
