// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mixedreality;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.mixedreality.RemoteRenderingAccountArgs;
import com.pulumi.azurenative.mixedreality.outputs.IdentityResponse;
import com.pulumi.azurenative.mixedreality.outputs.SkuResponse;
import com.pulumi.azurenative.mixedreality.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * RemoteRenderingAccount Response.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:mixedreality:RemoteRenderingAccount MyAccount /subscriptions/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/resourceGroups/MyResourceGroup/providers/Microsoft.MixedReality/remoteRenderingAccounts/MyAccount 
 * ```
 * 
 */
@ResourceType(type="azure-native:mixedreality:RemoteRenderingAccount")
public class RemoteRenderingAccount extends com.pulumi.resources.CustomResource {
    /**
     * Correspond domain name of certain Spatial Anchors Account
     * 
     */
    @Export(name="accountDomain", type=String.class, parameters={})
    private Output<String> accountDomain;

    /**
     * @return Correspond domain name of certain Spatial Anchors Account
     * 
     */
    public Output<String> accountDomain() {
        return this.accountDomain;
    }
    /**
     * unique id of certain account.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return unique id of certain account.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The identity associated with this account
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity associated with this account
     * 
     */
    public Output</* @Nullable */ IdentityResponse> identity() {
        return this.identity;
    }
    /**
     * The kind of account, if supported
     * 
     */
    @Export(name="kind", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> kind;

    /**
     * @return The kind of account, if supported
     * 
     */
    public Output</* @Nullable */ SkuResponse> kind() {
        return this.kind;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The plan associated with this account
     * 
     */
    @Export(name="plan", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> plan;

    /**
     * @return The plan associated with this account
     * 
     */
    public Output</* @Nullable */ IdentityResponse> plan() {
        return this.plan;
    }
    /**
     * The sku associated with this account
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The sku associated with this account
     * 
     */
    public Output</* @Nullable */ SkuResponse> sku() {
        return this.sku;
    }
    /**
     * The name of the storage account associated with this accountId
     * 
     */
    @Export(name="storageAccountName", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountName;

    /**
     * @return The name of the storage account associated with this accountId
     * 
     */
    public Output</* @Nullable */ String> storageAccountName() {
        return this.storageAccountName;
    }
    /**
     * System metadata for this account
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System metadata for this account
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RemoteRenderingAccount(String name) {
        this(name, RemoteRenderingAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RemoteRenderingAccount(String name, RemoteRenderingAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RemoteRenderingAccount(String name, RemoteRenderingAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:mixedreality:RemoteRenderingAccount", name, args == null ? RemoteRenderingAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RemoteRenderingAccount(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:mixedreality:RemoteRenderingAccount", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:mixedreality/v20191202preview:RemoteRenderingAccount").build()),
                Output.of(Alias.builder().type("azure-native:mixedreality/v20200406preview:RemoteRenderingAccount").build()),
                Output.of(Alias.builder().type("azure-native:mixedreality/v20210101:RemoteRenderingAccount").build()),
                Output.of(Alias.builder().type("azure-native:mixedreality/v20210301preview:RemoteRenderingAccount").build())
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
    public static RemoteRenderingAccount get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RemoteRenderingAccount(name, id, options);
    }
}
