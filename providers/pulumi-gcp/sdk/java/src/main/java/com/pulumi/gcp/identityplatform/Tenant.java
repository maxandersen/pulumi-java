// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.identityplatform.TenantArgs;
import com.pulumi.gcp.identityplatform.inputs.TenantState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Tenant configuration in a multi-tenant project.
 * 
 * You must enable the
 * [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
 * the marketplace prior to using this resource.
 * 
 * You must [enable multi-tenancy](https://cloud.google.com/identity-platform/docs/multi-tenancy-quickstart) via
 * the Cloud Console prior to creating tenants.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Tenant can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/tenant:Tenant default projects/{{project}}/tenants/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/tenant:Tenant default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/tenant:Tenant default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:identityplatform/tenant:Tenant")
public class Tenant extends com.pulumi.resources.CustomResource {
    /**
     * Whether to allow email/password user authentication.
     * 
     */
    @Export(name="allowPasswordSignup", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowPasswordSignup;

    /**
     * @return Whether to allow email/password user authentication.
     * 
     */
    public Output</* @Nullable */ Boolean> allowPasswordSignup() {
        return this.allowPasswordSignup;
    }
    /**
     * Whether authentication is disabled for the tenant. If true, the users under
     * the disabled tenant are not allowed to sign-in. Admins of the disabled tenant
     * are not able to manage its users.
     * 
     */
    @Export(name="disableAuth", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableAuth;

    /**
     * @return Whether authentication is disabled for the tenant. If true, the users under
     * the disabled tenant are not allowed to sign-in. Admins of the disabled tenant
     * are not able to manage its users.
     * 
     */
    public Output</* @Nullable */ Boolean> disableAuth() {
        return this.disableAuth;
    }
    /**
     * Human friendly display name of the tenant.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human friendly display name of the tenant.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Whether to enable email link user authentication.
     * 
     */
    @Export(name="enableEmailLinkSignin", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableEmailLinkSignin;

    /**
     * @return Whether to enable email link user authentication.
     * 
     */
    public Output</* @Nullable */ Boolean> enableEmailLinkSignin() {
        return this.enableEmailLinkSignin;
    }
    /**
     * The name of the tenant that is generated by the server
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the tenant that is generated by the server
     * 
     */
    public Output<String> name() {
        return this.name;
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
    public Tenant(String name) {
        this(name, TenantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tenant(String name, TenantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tenant(String name, TenantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:identityplatform/tenant:Tenant", name, args == null ? TenantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Tenant(String name, Output<String> id, @Nullable TenantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:identityplatform/tenant:Tenant", name, state, makeResourceOptions(options, id));
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
    public static Tenant get(String name, Output<String> id, @Nullable TenantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Tenant(name, id, state, options);
    }
}
