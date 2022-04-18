// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sagemaker.ModelPackageGroupPolicyArgs;
import com.pulumi.aws.sagemaker.inputs.ModelPackageGroupPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Sagemaker Model Package Group Policy resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Sagemaker Code Model Package Groups can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/modelPackageGroupPolicy:ModelPackageGroupPolicy example example
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/modelPackageGroupPolicy:ModelPackageGroupPolicy")
public class ModelPackageGroupPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The name of the model package group.
     * 
     */
    @Export(name="modelPackageGroupName", type=String.class, parameters={})
    private Output<String> modelPackageGroupName;

    /**
     * @return The name of the model package group.
     * 
     */
    public Output<String> modelPackageGroupName() {
        return this.modelPackageGroupName;
    }
    @Export(name="resourcePolicy", type=String.class, parameters={})
    private Output<String> resourcePolicy;

    public Output<String> resourcePolicy() {
        return this.resourcePolicy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ModelPackageGroupPolicy(String name) {
        this(name, ModelPackageGroupPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ModelPackageGroupPolicy(String name, ModelPackageGroupPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ModelPackageGroupPolicy(String name, ModelPackageGroupPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/modelPackageGroupPolicy:ModelPackageGroupPolicy", name, args == null ? ModelPackageGroupPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ModelPackageGroupPolicy(String name, Output<String> id, @Nullable ModelPackageGroupPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/modelPackageGroupPolicy:ModelPackageGroupPolicy", name, state, makeResourceOptions(options, id));
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
    public static ModelPackageGroupPolicy get(String name, Output<String> id, @Nullable ModelPackageGroupPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ModelPackageGroupPolicy(name, id, state, options);
    }
}
