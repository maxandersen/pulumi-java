// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.bigquery.DatasetIamPolicyArgs;
import com.pulumi.gcp.bigquery.inputs.DatasetIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for BigQuery dataset. Each of these resources serves a different use case:
 * 
 * * `gcp.bigquery.DatasetIamPolicy`: Authoritative. Sets the IAM policy for the dataset and replaces any existing policy already attached.
 * * `gcp.bigquery.DatasetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataset are preserved.
 * * `gcp.bigquery.DatasetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataset are preserved.
 * 
 * These resources are intended to convert the permissions system for BigQuery datasets to the standard IAM interface. For advanced usages, including [creating authorized views](https://cloud.google.com/bigquery/docs/share-access-views), please use either `gcp.bigquery.DatasetAccess` or the `access` field on `gcp.bigquery.Dataset`.
 * 
 * &gt; **Note:** These resources **cannot** be used with `gcp.bigquery.DatasetAccess` resources or the `access` field on `gcp.bigquery.Dataset` or they will fight over what the policy should be.
 * 
 * &gt; **Note:** Using any of these resources will remove any authorized view permissions from the dataset. To assign and preserve authorized view permissions use the `gcp.bigquery.DatasetAccess` instead.
 * 
 * &gt; **Note:** Legacy BigQuery roles `OWNER` `WRITER` and `READER` **cannot** be used with any of these IAM resources. Instead use the full role form of: `roles/bigquery.dataOwner` `roles/bigquery.dataEditor` and `roles/bigquery.dataViewer`.
 * 
 * &gt; **Note:** `gcp.bigquery.DatasetIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.DatasetIamBinding` and `gcp.bigquery.DatasetIamMember` or they will fight over what your policy should be.
 * 
 * &gt; **Note:** `gcp.bigquery.DatasetIamBinding` resources **can be** used in conjunction with `gcp.bigquery.DatasetIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_bigquery\_dataset\_iam\_policy
 * 
 * ## google\_bigquery\_dataset\_iam\_binding
 * 
 * ## google\_bigquery\_dataset\_iam\_member
 * 
 * ## Import
 * 
 * IAM member imports use space-delimited identifiers; the resource in question, the role, and the account.
 * 
 * This member resource can be imported using the `dataset_id`, role, and account e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/datasetIamPolicy:DatasetIamPolicy dataset_iam &#34;projects/your-project-id/datasets/dataset-id roles/viewer user:foo@example.com&#34;
 * ```
 * 
 *  IAM binding imports use space-delimited identifiers; the resource in question and the role.
 * 
 * This binding resource can be imported using the `dataset_id` and role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/datasetIamPolicy:DatasetIamPolicy dataset_iam &#34;projects/your-project-id/datasets/dataset-id roles/viewer&#34;
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question.
 * 
 * This policy resource can be imported using the `dataset_id`, role, and account e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/datasetIamPolicy:DatasetIamPolicy dataset_iam projects/your-project-id/datasets/dataset-id
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:bigquery/datasetIamPolicy:DatasetIamPolicy")
public class DatasetIamPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The dataset ID.
     * 
     */
    @Export(name="datasetId", type=String.class, parameters={})
    private Output<String> datasetId;

    /**
     * @return The dataset ID.
     * 
     */
    public Output<String> datasetId() {
        return this.datasetId;
    }
    /**
     * (Computed) The etag of the dataset&#39;s IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the dataset&#39;s IAM policy.
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
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatasetIamPolicy(String name) {
        this(name, DatasetIamPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatasetIamPolicy(String name, DatasetIamPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatasetIamPolicy(String name, DatasetIamPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/datasetIamPolicy:DatasetIamPolicy", name, args == null ? DatasetIamPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatasetIamPolicy(String name, Output<String> id, @Nullable DatasetIamPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/datasetIamPolicy:DatasetIamPolicy", name, state, makeResourceOptions(options, id));
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
    public static DatasetIamPolicy get(String name, Output<String> id, @Nullable DatasetIamPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatasetIamPolicy(name, id, state, options);
    }
}
