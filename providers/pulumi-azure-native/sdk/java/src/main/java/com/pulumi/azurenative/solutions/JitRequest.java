// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.solutions.JitRequestArgs;
import com.pulumi.azurenative.solutions.outputs.ApplicationClientDetailsResponse;
import com.pulumi.azurenative.solutions.outputs.JitAuthorizationPoliciesResponse;
import com.pulumi.azurenative.solutions.outputs.JitSchedulingPolicyResponse;
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
 * Information about JIT request definition.
 * API Version: 2019-07-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:solutions:JitRequest myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Solutions/jitRequests/{jitRequestName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:solutions:JitRequest")
public class JitRequest extends CustomResource {
    /**
     * The parent application id.
     * 
     */
    @Export(name="applicationResourceId", type=String.class, parameters={})
    private Output<String> applicationResourceId;

    /**
     * @return The parent application id.
     * 
     */
    public Output<String> applicationResourceId() {
        return this.applicationResourceId;
    }
    /**
     * The client entity that created the JIT request.
     * 
     */
    @Export(name="createdBy", type=ApplicationClientDetailsResponse.class, parameters={})
    private Output<ApplicationClientDetailsResponse> createdBy;

    /**
     * @return The client entity that created the JIT request.
     * 
     */
    public Output<ApplicationClientDetailsResponse> createdBy() {
        return this.createdBy;
    }
    /**
     * The JIT authorization policies.
     * 
     */
    @Export(name="jitAuthorizationPolicies", type=List.class, parameters={JitAuthorizationPoliciesResponse.class})
    private Output<List<JitAuthorizationPoliciesResponse>> jitAuthorizationPolicies;

    /**
     * @return The JIT authorization policies.
     * 
     */
    public Output<List<JitAuthorizationPoliciesResponse>> jitAuthorizationPolicies() {
        return this.jitAuthorizationPolicies;
    }
    /**
     * The JIT request state.
     * 
     */
    @Export(name="jitRequestState", type=String.class, parameters={})
    private Output<String> jitRequestState;

    /**
     * @return The JIT request state.
     * 
     */
    public Output<String> jitRequestState() {
        return this.jitRequestState;
    }
    /**
     * The JIT request properties.
     * 
     */
    @Export(name="jitSchedulingPolicy", type=JitSchedulingPolicyResponse.class, parameters={})
    private Output<JitSchedulingPolicyResponse> jitSchedulingPolicy;

    /**
     * @return The JIT request properties.
     * 
     */
    public Output<JitSchedulingPolicyResponse> jitSchedulingPolicy() {
        return this.jitSchedulingPolicy;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The JIT request provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The JIT request provisioning state.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The publisher tenant id.
     * 
     */
    @Export(name="publisherTenantId", type=String.class, parameters={})
    private Output<String> publisherTenantId;

    /**
     * @return The publisher tenant id.
     * 
     */
    public Output<String> publisherTenantId() {
        return this.publisherTenantId;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The client entity that last updated the JIT request.
     * 
     */
    @Export(name="updatedBy", type=ApplicationClientDetailsResponse.class, parameters={})
    private Output<ApplicationClientDetailsResponse> updatedBy;

    /**
     * @return The client entity that last updated the JIT request.
     * 
     */
    public Output<ApplicationClientDetailsResponse> updatedBy() {
        return this.updatedBy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JitRequest(String name) {
        this(name, JitRequestArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JitRequest(String name, JitRequestArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JitRequest(String name, JitRequestArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:solutions:JitRequest", name, args == null ? JitRequestArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private JitRequest(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:solutions:JitRequest", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:solutions/v20190701:JitRequest").build()),
                Output.of(Alias.builder().type("azure-native:solutions/v20200821preview:JitRequest").build()),
                Output.of(Alias.builder().type("azure-native:solutions/v20210701:JitRequest").build())
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
    public static JitRequest get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new JitRequest(name, id, options);
    }
}
