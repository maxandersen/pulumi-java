// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.FileShareArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Properties of the file share, including Id, resource name, resource type, Etag.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storage:FileShare share1235 /subscriptions/{subscription-id}/resourceGroups/res346/providers/Microsoft.Storage/storageAccounts/sto666/fileServices/default/shares/share1235 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:FileShare")
public class FileShare extends io.pulumi.resources.CustomResource {
    /**
     * Access tier for specific share. GpV2 account can choose between TransactionOptimized (default), Hot, and Cool. FileStorage account can choose Premium.
     * 
     */
    @Export(name="accessTier", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessTier;

    /**
     * @return Access tier for specific share. GpV2 account can choose between TransactionOptimized (default), Hot, and Cool. FileStorage account can choose Premium.
     * 
     */
    public Output</* @Nullable */ String> accessTier() {
        return this.accessTier;
    }
    /**
     * Indicates the last modification time for share access tier.
     * 
     */
    @Export(name="accessTierChangeTime", type=String.class, parameters={})
    private Output<String> accessTierChangeTime;

    /**
     * @return Indicates the last modification time for share access tier.
     * 
     */
    public Output<String> accessTierChangeTime() {
        return this.accessTierChangeTime;
    }
    /**
     * Indicates if there is a pending transition for access tier.
     * 
     */
    @Export(name="accessTierStatus", type=String.class, parameters={})
    private Output<String> accessTierStatus;

    /**
     * @return Indicates if there is a pending transition for access tier.
     * 
     */
    public Output<String> accessTierStatus() {
        return this.accessTierStatus;
    }
    /**
     * Indicates whether the share was deleted.
     * 
     */
    @Export(name="deleted", type=Boolean.class, parameters={})
    private Output<Boolean> deleted;

    /**
     * @return Indicates whether the share was deleted.
     * 
     */
    public Output<Boolean> deleted() {
        return this.deleted;
    }
    /**
     * The deleted time if the share was deleted.
     * 
     */
    @Export(name="deletedTime", type=String.class, parameters={})
    private Output<String> deletedTime;

    /**
     * @return The deleted time if the share was deleted.
     * 
     */
    public Output<String> deletedTime() {
        return this.deletedTime;
    }
    /**
     * The authentication protocol that is used for the file share. Can only be specified when creating a share.
     * 
     */
    @Export(name="enabledProtocols", type=String.class, parameters={})
    private Output</* @Nullable */ String> enabledProtocols;

    /**
     * @return The authentication protocol that is used for the file share. Can only be specified when creating a share.
     * 
     */
    public Output</* @Nullable */ String> enabledProtocols() {
        return this.enabledProtocols;
    }
    /**
     * Resource Etag.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Resource Etag.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Returns the date and time the share was last modified.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return Returns the date and time the share was last modified.
     * 
     */
    public Output<String> lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * A name-value pair to associate with the share as metadata.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return A name-value pair to associate with the share as metadata.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> metadata() {
        return this.metadata;
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
     * Remaining retention days for share that was soft deleted.
     * 
     */
    @Export(name="remainingRetentionDays", type=Integer.class, parameters={})
    private Output<Integer> remainingRetentionDays;

    /**
     * @return Remaining retention days for share that was soft deleted.
     * 
     */
    public Output<Integer> remainingRetentionDays() {
        return this.remainingRetentionDays;
    }
    /**
     * The property is for NFS share only. The default is NoRootSquash.
     * 
     */
    @Export(name="rootSquash", type=String.class, parameters={})
    private Output</* @Nullable */ String> rootSquash;

    /**
     * @return The property is for NFS share only. The default is NoRootSquash.
     * 
     */
    public Output</* @Nullable */ String> rootSquash() {
        return this.rootSquash;
    }
    /**
     * The maximum size of the share, in gigabytes. Must be greater than 0, and less than or equal to 5TB (5120). For Large File Shares, the maximum size is 102400.
     * 
     */
    @Export(name="shareQuota", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> shareQuota;

    /**
     * @return The maximum size of the share, in gigabytes. Must be greater than 0, and less than or equal to 5TB (5120). For Large File Shares, the maximum size is 102400.
     * 
     */
    public Output</* @Nullable */ Integer> shareQuota() {
        return this.shareQuota;
    }
    /**
     * The approximate size of the data stored on the share. Note that this value may not include all recently created or recently resized files.
     * 
     */
    @Export(name="shareUsageBytes", type=Double.class, parameters={})
    private Output<Double> shareUsageBytes;

    /**
     * @return The approximate size of the data stored on the share. Note that this value may not include all recently created or recently resized files.
     * 
     */
    public Output<Double> shareUsageBytes() {
        return this.shareUsageBytes;
    }
    /**
     * Creation time of share snapshot returned in the response of list shares with expand param "snapshots".
     * 
     */
    @Export(name="snapshotTime", type=String.class, parameters={})
    private Output<String> snapshotTime;

    /**
     * @return Creation time of share snapshot returned in the response of list shares with expand param "snapshots".
     * 
     */
    public Output<String> snapshotTime() {
        return this.snapshotTime;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The version of the share.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version of the share.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FileShare(String name) {
        this(name, FileShareArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FileShare(String name, FileShareArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FileShare(String name, FileShareArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:FileShare", name, args == null ? FileShareArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FileShare(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:FileShare", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storage/v20190401:FileShare").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20190601:FileShare").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20200801preview:FileShare").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210101:FileShare").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210201:FileShare").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210401:FileShare").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210601:FileShare").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210801:FileShare").build())
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
    public static FileShare get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FileShare(name, id, options);
    }
}
