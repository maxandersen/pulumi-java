// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.bigtable.InstanceIamBindingArgs;
import com.pulumi.gcp.bigtable.inputs.InstanceIamBindingState;
import com.pulumi.gcp.bigtable.outputs.InstanceIamBindingCondition;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage IAM policies on bigtable instances. Each of these resources serves a different use case:
 * 
 * * `gcp.bigtable.InstanceIamPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
 * * `gcp.bigtable.InstanceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
 * * `gcp.bigtable.InstanceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
 * 
 * &gt; **Note:** `gcp.bigtable.InstanceIamPolicy` **cannot** be used in conjunction with `gcp.bigtable.InstanceIamBinding` and `gcp.bigtable.InstanceIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the instance as `gcp.bigtable.InstanceIamPolicy` replaces the entire policy.
 * 
 * &gt; **Note:** `gcp.bigtable.InstanceIamBinding` resources **can be** used in conjunction with `gcp.bigtable.InstanceIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_bigtable\_instance\_iam\_policy
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var admin = Output.of(OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
 *             .bindings(GetIAMPolicyBinding.builder()
 *                 .role(&#34;roles/bigtable.user&#34;)
 *                 .members(&#34;user:jane@example.com&#34;)
 *                 .build())
 *             .build()));
 * 
 *         var editor = new InstanceIamPolicy(&#34;editor&#34;, InstanceIamPolicyArgs.builder()        
 *             .project(&#34;your-project&#34;)
 *             .instance(&#34;your-bigtable-instance&#34;)
 *             .policyData(admin.apply(getIAMPolicyResult -&gt; getIAMPolicyResult.getPolicyData()))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## google\_bigtable\_instance\_iam\_binding
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var editor = new InstanceIamBinding(&#34;editor&#34;, InstanceIamBindingArgs.builder()        
 *             .instance(&#34;your-bigtable-instance&#34;)
 *             .members(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/bigtable.user&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## google\_bigtable\_instance\_iam\_member
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var editor = new InstanceIamMember(&#34;editor&#34;, InstanceIamMemberArgs.builder()        
 *             .instance(&#34;your-bigtable-instance&#34;)
 *             .member(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/bigtable.user&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Instance IAM resources can be imported using the project, instance name, role and/or member.
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/instanceIamBinding:InstanceIamBinding editor &#34;projects/{project}/instances/{instance}&#34;
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/instanceIamBinding:InstanceIamBinding editor &#34;projects/{project}/instances/{instance} roles/editor&#34;
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigtable/instanceIamBinding:InstanceIamBinding editor &#34;projects/{project}/instances/{instance} roles/editor user:jane@example.com&#34;
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:bigtable/instanceIamBinding:InstanceIamBinding")
public class InstanceIamBinding extends com.pulumi.resources.CustomResource {
    @Export(name="condition", type=InstanceIamBindingCondition.class, parameters={})
    private Output</* @Nullable */ InstanceIamBindingCondition> condition;

    public Output<Optional<InstanceIamBindingCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * (Computed) The etag of the instances&#39;s IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the instances&#39;s IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The name or relative resource id of the instance to manage IAM policies for.
     * 
     */
    @Export(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return The name or relative resource id of the instance to manage IAM policies for.
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }
    @Export(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }
    /**
     * The project in which the instance belongs. If it
     * is not provided, a default will be supplied.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project in which the instance belongs. If it
     * is not provided, a default will be supplied.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.bigtable.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.bigtable.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceIamBinding(String name) {
        this(name, InstanceIamBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceIamBinding(String name, InstanceIamBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceIamBinding(String name, InstanceIamBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigtable/instanceIamBinding:InstanceIamBinding", name, args == null ? InstanceIamBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceIamBinding(String name, Output<String> id, @Nullable InstanceIamBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigtable/instanceIamBinding:InstanceIamBinding", name, state, makeResourceOptions(options, id));
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
    public static InstanceIamBinding get(String name, Output<String> id, @Nullable InstanceIamBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceIamBinding(name, id, state, options);
    }
}
