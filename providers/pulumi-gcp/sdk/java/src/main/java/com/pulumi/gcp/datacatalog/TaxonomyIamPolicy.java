// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.datacatalog.TaxonomyIamPolicyArgs;
import com.pulumi.gcp.datacatalog.inputs.TaxonomyIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Data catalog Taxonomy. Each of these resources serves a different use case:
 * 
 * * `gcp.datacatalog.TaxonomyIamPolicy`: Authoritative. Sets the IAM policy for the taxonomy and replaces any existing policy already attached.
 * * `gcp.datacatalog.TaxonomyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the taxonomy are preserved.
 * * `gcp.datacatalog.TaxonomyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the taxonomy are preserved.
 * 
 * &gt; **Note:** `gcp.datacatalog.TaxonomyIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.TaxonomyIamBinding` and `gcp.datacatalog.TaxonomyIamMember` or they will fight over what your policy should be.
 * 
 * &gt; **Note:** `gcp.datacatalog.TaxonomyIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.TaxonomyIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_data\_catalog\_taxonomy\_iam\_policy
 * 
 * ## google\_data\_catalog\_taxonomy\_iam\_binding
 * 
 * ## google\_data\_catalog\_taxonomy\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms* projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}} * {{project}}/{{region}}/{{taxonomy}} * {{region}}/{{taxonomy}} * {{taxonomy}} Any variables not passed in the import command will be taken from the provider configuration. Data catalog taxonomy IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:datacatalog/taxonomyIamPolicy:TaxonomyIamPolicy editor &#34;projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}} roles/viewer user:jane@example.com&#34;
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:datacatalog/taxonomyIamPolicy:TaxonomyIamPolicy editor &#34;projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}} roles/viewer&#34;
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:datacatalog/taxonomyIamPolicy:TaxonomyIamPolicy editor projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}}
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:datacatalog/taxonomyIamPolicy:TaxonomyIamPolicy")
public class TaxonomyIamPolicy extends com.pulumi.resources.CustomResource {
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
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Export(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
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
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Export(name="taxonomy", type=String.class, parameters={})
    private Output<String> taxonomy;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> taxonomy() {
        return this.taxonomy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TaxonomyIamPolicy(String name) {
        this(name, TaxonomyIamPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TaxonomyIamPolicy(String name, TaxonomyIamPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TaxonomyIamPolicy(String name, TaxonomyIamPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/taxonomyIamPolicy:TaxonomyIamPolicy", name, args == null ? TaxonomyIamPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TaxonomyIamPolicy(String name, Output<String> id, @Nullable TaxonomyIamPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/taxonomyIamPolicy:TaxonomyIamPolicy", name, state, makeResourceOptions(options, id));
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
    public static TaxonomyIamPolicy get(String name, Output<String> id, @Nullable TaxonomyIamPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TaxonomyIamPolicy(name, id, state, options);
    }
}
