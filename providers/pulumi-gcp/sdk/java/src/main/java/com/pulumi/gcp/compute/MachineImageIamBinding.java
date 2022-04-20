// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.MachineImageIamBindingArgs;
import com.pulumi.gcp.compute.inputs.MachineImageIamBindingState;
import com.pulumi.gcp.compute.outputs.MachineImageIamBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Compute Engine MachineImage. Each of these resources serves a different use case:
 * 
 * * `gcp.compute.MachineImageIamPolicy`: Authoritative. Sets the IAM policy for the machineimage and replaces any existing policy already attached.
 * * `gcp.compute.MachineImageIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the machineimage are preserved.
 * * `gcp.compute.MachineImageIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the machineimage are preserved.
 * 
 * &gt; **Note:** `gcp.compute.MachineImageIamPolicy` **cannot** be used in conjunction with `gcp.compute.MachineImageIamBinding` and `gcp.compute.MachineImageIamMember` or they will fight over what your policy should be.
 * 
 * &gt; **Note:** `gcp.compute.MachineImageIamBinding` resources **can be** used in conjunction with `gcp.compute.MachineImageIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_compute\_machine\_image\_iam\_policy
 * 
 * With IAM Conditions:
 * ## google\_compute\_machine\_image\_iam\_binding
 * 
 * With IAM Conditions:
 * ## google\_compute\_machine\_image\_iam\_member
 * 
 * With IAM Conditions:
 * 
 * ## Import
 * 
 * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms* projects/{{project}}/global/machineImages/{{name}} * {{project}}/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Compute Engine machineimage IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:compute/machineImageIamBinding:MachineImageIamBinding editor &#34;projects/{{project}}/global/machineImages/{{machine_image}} roles/compute.admin user:jane@example.com&#34;
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:compute/machineImageIamBinding:MachineImageIamBinding editor &#34;projects/{{project}}/global/machineImages/{{machine_image}} roles/compute.admin&#34;
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:compute/machineImageIamBinding:MachineImageIamBinding editor projects/{{project}}/global/machineImages/{{machine_image}}
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:compute/machineImageIamBinding:MachineImageIamBinding")
public class MachineImageIamBinding extends com.pulumi.resources.CustomResource {
    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Export(name="condition", type=MachineImageIamBindingCondition.class, parameters={})
    private Output</* @Nullable */ MachineImageIamBindingCondition> condition;

    /**
     * @return An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ MachineImageIamBindingCondition> condition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Export(name="machineImage", type=String.class, parameters={})
    private Output<String> machineImage;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> machineImage() {
        return this.machineImage;
    }
    @Export(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.compute.MachineImageIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.compute.MachineImageIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MachineImageIamBinding(String name) {
        this(name, MachineImageIamBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MachineImageIamBinding(String name, MachineImageIamBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MachineImageIamBinding(String name, MachineImageIamBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/machineImageIamBinding:MachineImageIamBinding", name, args == null ? MachineImageIamBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MachineImageIamBinding(String name, Output<String> id, @Nullable MachineImageIamBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/machineImageIamBinding:MachineImageIamBinding", name, state, makeResourceOptions(options, id));
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
    public static MachineImageIamBinding get(String name, Output<String> id, @Nullable MachineImageIamBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MachineImageIamBinding(name, id, state, options);
    }
}
