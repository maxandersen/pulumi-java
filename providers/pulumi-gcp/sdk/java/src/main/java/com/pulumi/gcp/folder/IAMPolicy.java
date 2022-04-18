// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.folder.IAMPolicyArgs;
import com.pulumi.gcp.folder.inputs.IAMPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:folder/iAMPolicy:IAMPolicy")
public class IAMPolicy extends com.pulumi.resources.CustomResource {
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="folder", type=String.class, parameters={})
    private Output<String> folder;

    public Output<String> folder() {
        return this.folder;
    }
    @Export(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IAMPolicy(String name) {
        this(name, IAMPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IAMPolicy(String name, IAMPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IAMPolicy(String name, IAMPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:folder/iAMPolicy:IAMPolicy", name, args == null ? IAMPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IAMPolicy(String name, Output<String> id, @Nullable IAMPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:folder/iAMPolicy:IAMPolicy", name, state, makeResourceOptions(options, id));
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
    public static IAMPolicy get(String name, Output<String> id, @Nullable IAMPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IAMPolicy(name, id, state, options);
    }
}
