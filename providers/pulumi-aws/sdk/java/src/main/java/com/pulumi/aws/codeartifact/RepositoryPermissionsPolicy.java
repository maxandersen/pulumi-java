// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codeartifact.RepositoryPermissionsPolicyArgs;
import com.pulumi.aws.codeartifact.inputs.RepositoryPermissionsPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CodeArtifact Repostory Permissions Policy Resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CodeArtifact Repository Permissions Policies can be imported using the CodeArtifact Repository ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:codeartifact/repositoryPermissionsPolicy:RepositoryPermissionsPolicy example arn:aws:codeartifact:us-west-2:012345678912:repository/tf-acc-test-6968272603913957763/tf-acc-test-6968272603913957763
 * ```
 * 
 */
@ResourceType(type="aws:codeartifact/repositoryPermissionsPolicy:RepositoryPermissionsPolicy")
public class RepositoryPermissionsPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The name of the domain on which to set the resource policy.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The name of the domain on which to set the resource policy.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * The account number of the AWS account that owns the domain.
     * 
     */
    @Export(name="domainOwner", type=String.class, parameters={})
    private Output<String> domainOwner;

    /**
     * @return The account number of the AWS account that owns the domain.
     * 
     */
    public Output<String> domainOwner() {
        return this.domainOwner;
    }
    /**
     * A JSON policy string to be set as the access control resource policy on the provided domain.
     * 
     */
    @Export(name="policyDocument", type=String.class, parameters={})
    private Output<String> policyDocument;

    /**
     * @return A JSON policy string to be set as the access control resource policy on the provided domain.
     * 
     */
    public Output<String> policyDocument() {
        return this.policyDocument;
    }
    /**
     * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain&#39;s resource policy.
     * 
     */
    @Export(name="policyRevision", type=String.class, parameters={})
    private Output<String> policyRevision;

    /**
     * @return The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain&#39;s resource policy.
     * 
     */
    public Output<String> policyRevision() {
        return this.policyRevision;
    }
    /**
     * The name of the repository to set the resource policy on.
     * 
     */
    @Export(name="repository", type=String.class, parameters={})
    private Output<String> repository;

    /**
     * @return The name of the repository to set the resource policy on.
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }
    /**
     * The ARN of the resource associated with the resource policy.
     * 
     */
    @Export(name="resourceArn", type=String.class, parameters={})
    private Output<String> resourceArn;

    /**
     * @return The ARN of the resource associated with the resource policy.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RepositoryPermissionsPolicy(String name) {
        this(name, RepositoryPermissionsPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RepositoryPermissionsPolicy(String name, RepositoryPermissionsPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RepositoryPermissionsPolicy(String name, RepositoryPermissionsPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codeartifact/repositoryPermissionsPolicy:RepositoryPermissionsPolicy", name, args == null ? RepositoryPermissionsPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RepositoryPermissionsPolicy(String name, Output<String> id, @Nullable RepositoryPermissionsPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codeartifact/repositoryPermissionsPolicy:RepositoryPermissionsPolicy", name, state, makeResourceOptions(options, id));
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
    public static RepositoryPermissionsPolicy get(String name, Output<String> id, @Nullable RepositoryPermissionsPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RepositoryPermissionsPolicy(name, id, state, options);
    }
}
