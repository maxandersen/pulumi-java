// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.ServerAzureADAdministratorArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Azure Active Directory administrator.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ServerAzureADAdministrator activeDirectory /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-4799/providers/Microsoft.Sql/servers/sqlcrudtest-6440/administrators/ActiveDirectory 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ServerAzureADAdministrator")
public class ServerAzureADAdministrator extends com.pulumi.resources.CustomResource {
    /**
     * Type of the sever administrator.
     * 
     */
    @Export(name="administratorType", type=String.class, parameters={})
    private Output<String> administratorType;

    /**
     * @return Type of the sever administrator.
     * 
     */
    public Output<String> administratorType() {
        return this.administratorType;
    }
    /**
     * Azure Active Directory only Authentication enabled.
     * 
     */
    @Export(name="azureADOnlyAuthentication", type=Boolean.class, parameters={})
    private Output<Boolean> azureADOnlyAuthentication;

    /**
     * @return Azure Active Directory only Authentication enabled.
     * 
     */
    public Output<Boolean> azureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }
    /**
     * Login name of the server administrator.
     * 
     */
    @Export(name="login", type=String.class, parameters={})
    private Output<String> login;

    /**
     * @return Login name of the server administrator.
     * 
     */
    public Output<String> login() {
        return this.login;
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
     * SID (object ID) of the server administrator.
     * 
     */
    @Export(name="sid", type=String.class, parameters={})
    private Output<String> sid;

    /**
     * @return SID (object ID) of the server administrator.
     * 
     */
    public Output<String> sid() {
        return this.sid;
    }
    /**
     * Tenant ID of the administrator.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return Tenant ID of the administrator.
     * 
     */
    public Output<Optional<String>> tenantId() {
        return Codegen.optional(this.tenantId);
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerAzureADAdministrator(String name) {
        this(name, ServerAzureADAdministratorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerAzureADAdministrator(String name, ServerAzureADAdministratorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerAzureADAdministrator(String name, ServerAzureADAdministratorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerAzureADAdministrator", name, args == null ? ServerAzureADAdministratorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerAzureADAdministrator(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerAzureADAdministrator", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20140401:ServerAzureADAdministrator").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20180601preview:ServerAzureADAdministrator").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20190601preview:ServerAzureADAdministrator").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:ServerAzureADAdministrator").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:ServerAzureADAdministrator").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:ServerAzureADAdministrator").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:ServerAzureADAdministrator").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:ServerAzureADAdministrator").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:ServerAzureADAdministrator").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101preview:ServerAzureADAdministrator").build())
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
    public static ServerAzureADAdministrator get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerAzureADAdministrator(name, id, options);
    }
}
