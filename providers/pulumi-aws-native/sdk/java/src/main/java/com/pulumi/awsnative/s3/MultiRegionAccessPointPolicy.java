// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.s3.MultiRegionAccessPointPolicyArgs;
import com.pulumi.awsnative.s3.outputs.PolicyStatusProperties;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The policy to be attached to a Multi Region Access Point
 * 
 */
@ResourceType(type="aws-native:s3:MultiRegionAccessPointPolicy")
public class MultiRegionAccessPointPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Multi Region Access Point to apply policy
     * 
     */
    @Export(name="mrapName", type=String.class, parameters={})
    private Output<String> mrapName;

    /**
     * @return The name of the Multi Region Access Point to apply policy
     * 
     */
    public Output<String> mrapName() {
        return this.mrapName;
    }
    /**
     * Policy document to apply to a Multi Region Access Point
     * 
     */
    @Export(name="policy", type=Object.class, parameters={})
    private Output<Object> policy;

    /**
     * @return Policy document to apply to a Multi Region Access Point
     * 
     */
    public Output<Object> policy() {
        return this.policy;
    }
    /**
     * The Policy Status associated with this Multi Region Access Point
     * 
     */
    @Export(name="policyStatus", type=PolicyStatusProperties.class, parameters={})
    private Output<PolicyStatusProperties> policyStatus;

    /**
     * @return The Policy Status associated with this Multi Region Access Point
     * 
     */
    public Output<PolicyStatusProperties> policyStatus() {
        return this.policyStatus;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MultiRegionAccessPointPolicy(String name) {
        this(name, MultiRegionAccessPointPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MultiRegionAccessPointPolicy(String name, MultiRegionAccessPointPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MultiRegionAccessPointPolicy(String name, MultiRegionAccessPointPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3:MultiRegionAccessPointPolicy", name, args == null ? MultiRegionAccessPointPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MultiRegionAccessPointPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3:MultiRegionAccessPointPolicy", name, null, makeResourceOptions(options, id));
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
    public static MultiRegionAccessPointPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MultiRegionAccessPointPolicy(name, id, options);
    }
}
