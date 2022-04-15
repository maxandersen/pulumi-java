// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.WatchlistItemArgs;
import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.azurenative.securityinsights.outputs.WatchlistUserInfoResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a Watchlist item in Azure Security Insights.
 * API Version: 2021-03-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:WatchlistItem myresource1 /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/Watchlists/highValueAsset/WatchlistItems/82ba292c-dc97-4dfc-969d-d4dd9e666842 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:WatchlistItem")
public class WatchlistItem extends io.pulumi.resources.CustomResource {
    /**
     * The time the watchlist item was created
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output</* @Nullable */ String> created;

    /**
     * @return The time the watchlist item was created
     * 
     */
    public Output</* @Nullable */ String> created() {
        return this.created;
    }
    /**
     * Describes a user that created the watchlist item
     * 
     */
    @Export(name="createdBy", type=WatchlistUserInfoResponse.class, parameters={})
    private Output</* @Nullable */ WatchlistUserInfoResponse> createdBy;

    /**
     * @return Describes a user that created the watchlist item
     * 
     */
    public Output</* @Nullable */ WatchlistUserInfoResponse> createdBy() {
        return this.createdBy;
    }
    /**
     * key-value pairs for a watchlist item entity mapping
     * 
     */
    @Export(name="entityMapping", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> entityMapping;

    /**
     * @return key-value pairs for a watchlist item entity mapping
     * 
     */
    public Output</* @Nullable */ Object> entityMapping() {
        return this.entityMapping;
    }
    /**
     * Etag of the azure resource
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Etag of the azure resource
     * 
     */
    public Output</* @Nullable */ String> etag() {
        return this.etag;
    }
    /**
     * A flag that indicates if the watchlist item is deleted or not
     * 
     */
    @Export(name="isDeleted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isDeleted;

    /**
     * @return A flag that indicates if the watchlist item is deleted or not
     * 
     */
    public Output</* @Nullable */ Boolean> isDeleted() {
        return this.isDeleted;
    }
    /**
     * key-value pairs for a watchlist item
     * 
     */
    @Export(name="itemsKeyValue", type=Object.class, parameters={})
    private Output<Object> itemsKeyValue;

    /**
     * @return key-value pairs for a watchlist item
     * 
     */
    public Output<Object> itemsKeyValue() {
        return this.itemsKeyValue;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The tenantId to which the watchlist item belongs to
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return The tenantId to which the watchlist item belongs to
     * 
     */
    public Output</* @Nullable */ String> tenantId() {
        return this.tenantId;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The last time the watchlist item was updated
     * 
     */
    @Export(name="updated", type=String.class, parameters={})
    private Output</* @Nullable */ String> updated;

    /**
     * @return The last time the watchlist item was updated
     * 
     */
    public Output</* @Nullable */ String> updated() {
        return this.updated;
    }
    /**
     * Describes a user that updated the watchlist item
     * 
     */
    @Export(name="updatedBy", type=WatchlistUserInfoResponse.class, parameters={})
    private Output</* @Nullable */ WatchlistUserInfoResponse> updatedBy;

    /**
     * @return Describes a user that updated the watchlist item
     * 
     */
    public Output</* @Nullable */ WatchlistUserInfoResponse> updatedBy() {
        return this.updatedBy;
    }
    /**
     * The id (a Guid) of the watchlist item
     * 
     */
    @Export(name="watchlistItemId", type=String.class, parameters={})
    private Output</* @Nullable */ String> watchlistItemId;

    /**
     * @return The id (a Guid) of the watchlist item
     * 
     */
    public Output</* @Nullable */ String> watchlistItemId() {
        return this.watchlistItemId;
    }
    /**
     * The type of the watchlist item
     * 
     */
    @Export(name="watchlistItemType", type=String.class, parameters={})
    private Output</* @Nullable */ String> watchlistItemType;

    /**
     * @return The type of the watchlist item
     * 
     */
    public Output</* @Nullable */ String> watchlistItemType() {
        return this.watchlistItemType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WatchlistItem(String name) {
        this(name, WatchlistItemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WatchlistItem(String name, WatchlistItemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WatchlistItem(String name, WatchlistItemArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:WatchlistItem", name, args == null ? WatchlistItemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WatchlistItem(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:WatchlistItem", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:securityinsights/v20190101preview:WatchlistItem").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210301preview:WatchlistItem").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210401:WatchlistItem").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210901preview:WatchlistItem").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static WatchlistItem get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WatchlistItem(name, id, options);
    }
}
