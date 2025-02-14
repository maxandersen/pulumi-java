// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.apimanagement.IdentityProviderArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Identity Provider details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:IdentityProvider Facebook /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/identityProviders/Facebook 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:IdentityProvider")
public class IdentityProvider extends com.pulumi.resources.CustomResource {
    /**
     * List of Allowed Tenants when configuring Azure Active Directory login.
     * 
     */
    @Export(name="allowedTenants", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedTenants;

    /**
     * @return List of Allowed Tenants when configuring Azure Active Directory login.
     * 
     */
    public Output<Optional<List<String>>> allowedTenants() {
        return Codegen.optional(this.allowedTenants);
    }
    /**
     * OpenID Connect discovery endpoint hostname for AAD or AAD B2C.
     * 
     */
    @Export(name="authority", type=String.class, parameters={})
    private Output</* @Nullable */ String> authority;

    /**
     * @return OpenID Connect discovery endpoint hostname for AAD or AAD B2C.
     * 
     */
    public Output<Optional<String>> authority() {
        return Codegen.optional(this.authority);
    }
    /**
     * Client Id of the Application in the external Identity Provider. It is App ID for Facebook login, Client ID for Google login, App ID for Microsoft.
     * 
     */
    @Export(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return Client Id of the Application in the external Identity Provider. It is App ID for Facebook login, Client ID for Google login, App ID for Microsoft.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * Client secret of the Application in external Identity Provider, used to authenticate login request. For example, it is App Secret for Facebook login, API Key for Google login, Public Key for Microsoft. This property will not be filled on &#39;GET&#39; operations! Use &#39;/listSecrets&#39; POST request to get the value.
     * 
     */
    @Export(name="clientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecret;

    /**
     * @return Client secret of the Application in external Identity Provider, used to authenticate login request. For example, it is App Secret for Facebook login, API Key for Google login, Public Key for Microsoft. This property will not be filled on &#39;GET&#39; operations! Use &#39;/listSecrets&#39; POST request to get the value.
     * 
     */
    public Output<Optional<String>> clientSecret() {
        return Codegen.optional(this.clientSecret);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Password Reset Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    @Export(name="passwordResetPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> passwordResetPolicyName;

    /**
     * @return Password Reset Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    public Output<Optional<String>> passwordResetPolicyName() {
        return Codegen.optional(this.passwordResetPolicyName);
    }
    /**
     * Profile Editing Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    @Export(name="profileEditingPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> profileEditingPolicyName;

    /**
     * @return Profile Editing Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    public Output<Optional<String>> profileEditingPolicyName() {
        return Codegen.optional(this.profileEditingPolicyName);
    }
    /**
     * Signin Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    @Export(name="signinPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> signinPolicyName;

    /**
     * @return Signin Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    public Output<Optional<String>> signinPolicyName() {
        return Codegen.optional(this.signinPolicyName);
    }
    /**
     * The TenantId to use instead of Common when logging into Active Directory
     * 
     */
    @Export(name="signinTenant", type=String.class, parameters={})
    private Output</* @Nullable */ String> signinTenant;

    /**
     * @return The TenantId to use instead of Common when logging into Active Directory
     * 
     */
    public Output<Optional<String>> signinTenant() {
        return Codegen.optional(this.signinTenant);
    }
    /**
     * Signup Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    @Export(name="signupPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> signupPolicyName;

    /**
     * @return Signup Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    public Output<Optional<String>> signupPolicyName() {
        return Codegen.optional(this.signupPolicyName);
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IdentityProvider(String name) {
        this(name, IdentityProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IdentityProvider(String name, IdentityProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IdentityProvider(String name, IdentityProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:IdentityProvider", name, args == null ? IdentityProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IdentityProvider(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:IdentityProvider", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20160707:IdentityProvider").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20161010:IdentityProvider").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:IdentityProvider").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:IdentityProvider").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180601preview:IdentityProvider").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20190101:IdentityProvider").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:IdentityProvider").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201preview:IdentityProvider").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:IdentityProvider").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:IdentityProvider").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:IdentityProvider").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:IdentityProvider").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:IdentityProvider").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20211201preview:IdentityProvider").build())
            ))
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
    public static IdentityProvider get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IdentityProvider(name, id, options);
    }
}
