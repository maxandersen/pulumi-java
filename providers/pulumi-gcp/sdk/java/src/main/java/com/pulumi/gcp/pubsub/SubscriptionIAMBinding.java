// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.pubsub.SubscriptionIAMBindingArgs;
import com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingState;
import com.pulumi.gcp.pubsub.outputs.SubscriptionIAMBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for pubsub subscription. Each of these resources serves a different use case:
 * 
 * * `gcp.pubsub.SubscriptionIAMPolicy`: Authoritative. Sets the IAM policy for the subscription and replaces any existing policy already attached.
 * * `gcp.pubsub.SubscriptionIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the subscription are preserved.
 * * `gcp.pubsub.SubscriptionIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the subscription are preserved.
 * 
 * &gt; **Note:** `gcp.pubsub.SubscriptionIAMPolicy` **cannot** be used in conjunction with `gcp.pubsub.SubscriptionIAMBinding` and `gcp.pubsub.SubscriptionIAMMember` or they will fight over what your policy should be.
 * 
 * &gt; **Note:** `gcp.pubsub.SubscriptionIAMBinding` resources **can be** used in conjunction with `gcp.pubsub.SubscriptionIAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_pubsub\_subscription\_iam\_policy
 * 
 * ## google\_pubsub\_subscription\_iam\_binding
 * 
 * ## google\_pubsub\_subscription\_iam\_member
 * 
 * ## Import
 * 
 * Pubsub subscription IAM resources can be imported using the project, subscription name, role and member.
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/subscriptionIAMBinding:SubscriptionIAMBinding editor projects/{your-project-id}/subscriptions/{your-subscription-name}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/subscriptionIAMBinding:SubscriptionIAMBinding editor &#34;projects/{your-project-id}/subscriptions/{your-subscription-name} roles/editor&#34;
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/subscriptionIAMBinding:SubscriptionIAMBinding editor &#34;projects/{your-project-id}/subscriptions/{your-subscription-name} roles/editor jane@example.com&#34;
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:pubsub/subscriptionIAMBinding:SubscriptionIAMBinding")
public class SubscriptionIAMBinding extends com.pulumi.resources.CustomResource {
    @Export(name="condition", type=SubscriptionIAMBindingCondition.class, parameters={})
    private Output</* @Nullable */ SubscriptionIAMBindingCondition> condition;

    public Output</* @Nullable */ SubscriptionIAMBindingCondition> condition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the subscription&#39;s IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the subscription&#39;s IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * The subscription name or id to bind to attach IAM policy to.
     * 
     */
    @Export(name="subscription", type=String.class, parameters={})
    private Output<String> subscription;

    /**
     * @return The subscription name or id to bind to attach IAM policy to.
     * 
     */
    public Output<String> subscription() {
        return this.subscription;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SubscriptionIAMBinding(String name) {
        this(name, SubscriptionIAMBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SubscriptionIAMBinding(String name, SubscriptionIAMBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubscriptionIAMBinding(String name, SubscriptionIAMBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/subscriptionIAMBinding:SubscriptionIAMBinding", name, args == null ? SubscriptionIAMBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SubscriptionIAMBinding(String name, Output<String> id, @Nullable SubscriptionIAMBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/subscriptionIAMBinding:SubscriptionIAMBinding", name, state, makeResourceOptions(options, id));
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
    public static SubscriptionIAMBinding get(String name, Output<String> id, @Nullable SubscriptionIAMBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SubscriptionIAMBinding(name, id, state, options);
    }
}
