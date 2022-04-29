// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.ServerAzureADOnlyAuthenticationArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Azure Active Directory only authentication.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ServerAzureADOnlyAuthentication Default /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-4799/providers/Microsoft.Sql/servers/sqlcrudtest-6440/azureadonlyauthentications/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ServerAzureADOnlyAuthentication")
public class ServerAzureADOnlyAuthentication extends CustomResource {
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
    public ServerAzureADOnlyAuthentication(String name) {
        this(name, ServerAzureADOnlyAuthenticationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerAzureADOnlyAuthentication(String name, ServerAzureADOnlyAuthenticationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerAzureADOnlyAuthentication(String name, ServerAzureADOnlyAuthenticationArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:sql:ServerAzureADOnlyAuthentication", name, args == null ? ServerAzureADOnlyAuthenticationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerAzureADOnlyAuthentication(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:sql:ServerAzureADOnlyAuthentication", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:ServerAzureADOnlyAuthentication").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:ServerAzureADOnlyAuthentication").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:ServerAzureADOnlyAuthentication").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:ServerAzureADOnlyAuthentication").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:ServerAzureADOnlyAuthentication").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:ServerAzureADOnlyAuthentication").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ServerAzureADOnlyAuthentication get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ServerAzureADOnlyAuthentication(name, id, options);
    }
}
