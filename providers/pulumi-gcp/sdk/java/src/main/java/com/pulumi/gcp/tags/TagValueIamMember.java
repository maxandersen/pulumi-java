// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tags;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.tags.TagValueIamMemberArgs;
import com.pulumi.gcp.tags.inputs.TagValueIamMemberState;
import com.pulumi.gcp.tags.outputs.TagValueIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Tags TagValue. Each of these resources serves a different use case:
 * 
 * * `gcp.tags.TagValueIamPolicy`: Authoritative. Sets the IAM policy for the tagvalue and replaces any existing policy already attached.
 * * `gcp.tags.TagValueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tagvalue are preserved.
 * * `gcp.tags.TagValueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tagvalue are preserved.
 * 
 * &gt; **Note:** `gcp.tags.TagValueIamPolicy` **cannot** be used in conjunction with `gcp.tags.TagValueIamBinding` and `gcp.tags.TagValueIamMember` or they will fight over what your policy should be.
 * 
 * &gt; **Note:** `gcp.tags.TagValueIamBinding` resources **can be** used in conjunction with `gcp.tags.TagValueIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_tags\_tag\_value\_iam\_policy
 * 
 * ## google\_tags\_tag\_value\_iam\_binding
 * 
 * ## google\_tags\_tag\_value\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms* tagValues/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Tags tagvalue IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:tags/tagValueIamMember:TagValueIamMember editor &#34;tagValues/{{tag_value}} roles/viewer user:jane@example.com&#34;
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:tags/tagValueIamMember:TagValueIamMember editor &#34;tagValues/{{tag_value}} roles/viewer&#34;
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:tags/tagValueIamMember:TagValueIamMember editor tagValues/{{tag_value}}
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:tags/tagValueIamMember:TagValueIamMember")
public class TagValueIamMember extends com.pulumi.resources.CustomResource {
    @Export(name="condition", type=TagValueIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ TagValueIamMemberCondition> condition;

    public Output</* @Nullable */ TagValueIamMemberCondition> condition() {
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
    @Export(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Export(name="tagValue", type=String.class, parameters={})
    private Output<String> tagValue;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> tagValue() {
        return this.tagValue;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagValueIamMember(String name) {
        this(name, TagValueIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagValueIamMember(String name, TagValueIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagValueIamMember(String name, TagValueIamMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:tags/tagValueIamMember:TagValueIamMember", name, args == null ? TagValueIamMemberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TagValueIamMember(String name, Output<String> id, @Nullable TagValueIamMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:tags/tagValueIamMember:TagValueIamMember", name, state, makeResourceOptions(options, id));
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
    public static TagValueIamMember get(String name, Output<String> id, @Nullable TagValueIamMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TagValueIamMember(name, id, state, options);
    }
}
