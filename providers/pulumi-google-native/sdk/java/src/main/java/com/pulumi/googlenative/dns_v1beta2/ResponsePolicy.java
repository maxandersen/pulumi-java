// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dns_v1beta2.ResponsePolicyArgs;
import com.pulumi.googlenative.dns_v1beta2.outputs.ResponsePolicyGKEClusterResponse;
import com.pulumi.googlenative.dns_v1beta2.outputs.ResponsePolicyNetworkResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new Response Policy
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dns/v1beta2:ResponsePolicy")
public class ResponsePolicy extends com.pulumi.resources.CustomResource {
    /**
     * User-provided description for this Response Policy.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return User-provided description for this Response Policy.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The list of Google Kubernetes Engine clusters to which this response policy is applied.
     * 
     */
    @Export(name="gkeClusters", type=List.class, parameters={ResponsePolicyGKEClusterResponse.class})
    private Output<List<ResponsePolicyGKEClusterResponse>> gkeClusters;

    /**
     * @return The list of Google Kubernetes Engine clusters to which this response policy is applied.
     * 
     */
    public Output<List<ResponsePolicyGKEClusterResponse>> gkeClusters() {
        return this.gkeClusters;
    }
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }
    /**
     * List of network names specifying networks to which this policy is applied.
     * 
     */
    @Export(name="networks", type=List.class, parameters={ResponsePolicyNetworkResponse.class})
    private Output<List<ResponsePolicyNetworkResponse>> networks;

    /**
     * @return List of network names specifying networks to which this policy is applied.
     * 
     */
    public Output<List<ResponsePolicyNetworkResponse>> networks() {
        return this.networks;
    }
    /**
     * User assigned name for this Response Policy.
     * 
     */
    @Export(name="responsePolicyName", type=String.class, parameters={})
    private Output<String> responsePolicyName;

    /**
     * @return User assigned name for this Response Policy.
     * 
     */
    public Output<String> responsePolicyName() {
        return this.responsePolicyName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResponsePolicy(String name) {
        this(name, ResponsePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResponsePolicy(String name, @Nullable ResponsePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResponsePolicy(String name, @Nullable ResponsePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1beta2:ResponsePolicy", name, args == null ? ResponsePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResponsePolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1beta2:ResponsePolicy", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ResponsePolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResponsePolicy(name, id, options);
    }
}
