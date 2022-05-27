// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.storagesync.ServerEndpointArgs;
import com.pulumi.azurenative.storagesync.outputs.ServerEndpointCloudTieringStatusResponse;
import com.pulumi.azurenative.storagesync.outputs.ServerEndpointRecallStatusResponse;
import com.pulumi.azurenative.storagesync.outputs.ServerEndpointSyncStatusResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Server Endpoint object.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * ### ServerEndpoints_Create
 * 
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
 *         var serverEndpoint = new ServerEndpoint(&#34;serverEndpoint&#34;, ServerEndpointArgs.builder()        
 *             .cloudTiering(&#34;off&#34;)
 *             .initialDownloadPolicy(&#34;NamespaceThenModifiedFiles&#34;)
 *             .localCacheMode(&#34;UpdateLocallyCachedFiles&#34;)
 *             .offlineDataTransfer(&#34;on&#34;)
 *             .offlineDataTransferShareName(&#34;myfileshare&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup_1&#34;)
 *             .serverEndpointName(&#34;SampleServerEndpoint_1&#34;)
 *             .serverLocalPath(&#34;D:\\SampleServerEndpoint_1&#34;)
 *             .serverResourceId(&#34;/subscriptions/52b8da2f-61e0-4a1f-8dde-336911f367fb/resourceGroups/SampleResourceGroup_1/providers/Microsoft.StorageSync/storageSyncServices/SampleStorageSyncService_1/registeredServers/080d4133-bdb5-40a0-96a0-71a6057bfe9a&#34;)
 *             .storageSyncServiceName(&#34;SampleStorageSyncService_1&#34;)
 *             .syncGroupName(&#34;SampleSyncGroup_1&#34;)
 *             .tierFilesOlderThanDays(0)
 *             .volumeFreeSpacePercent(100)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storagesync:ServerEndpoint SampleServerEndpoint_1 /subscriptions/52b8da2f-61e0-4a1f-8dde-336911f367fb/resourceGroups/SampleResourceGroup_1/providers/Microsoft.StorageSync/storageSyncServices/SampleStorageSyncService_1/syncGroups/SampleSyncGroup_1/serverEndpoints/SampleServerEndpoint_1 
 * ```
 * 
 */
@ResourceType(type="azure-native:storagesync:ServerEndpoint")
public class ServerEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * Cloud Tiering.
     * 
     */
    @Export(name="cloudTiering", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudTiering;

    /**
     * @return Cloud Tiering.
     * 
     */
    public Output<Optional<String>> cloudTiering() {
        return Codegen.optional(this.cloudTiering);
    }
    /**
     * Cloud tiering status. Only populated if cloud tiering is enabled.
     * 
     */
    @Export(name="cloudTieringStatus", type=ServerEndpointCloudTieringStatusResponse.class, parameters={})
    private Output<ServerEndpointCloudTieringStatusResponse> cloudTieringStatus;

    /**
     * @return Cloud tiering status. Only populated if cloud tiering is enabled.
     * 
     */
    public Output<ServerEndpointCloudTieringStatusResponse> cloudTieringStatus() {
        return this.cloudTieringStatus;
    }
    /**
     * Friendly Name
     * 
     */
    @Export(name="friendlyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> friendlyName;

    /**
     * @return Friendly Name
     * 
     */
    public Output<Optional<String>> friendlyName() {
        return Codegen.optional(this.friendlyName);
    }
    /**
     * Policy for how namespace and files are recalled during FastDr.
     * 
     */
    @Export(name="initialDownloadPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> initialDownloadPolicy;

    /**
     * @return Policy for how namespace and files are recalled during FastDr.
     * 
     */
    public Output<Optional<String>> initialDownloadPolicy() {
        return Codegen.optional(this.initialDownloadPolicy);
    }
    /**
     * Resource Last Operation Name
     * 
     */
    @Export(name="lastOperationName", type=String.class, parameters={})
    private Output<String> lastOperationName;

    /**
     * @return Resource Last Operation Name
     * 
     */
    public Output<String> lastOperationName() {
        return this.lastOperationName;
    }
    /**
     * ServerEndpoint lastWorkflowId
     * 
     */
    @Export(name="lastWorkflowId", type=String.class, parameters={})
    private Output<String> lastWorkflowId;

    /**
     * @return ServerEndpoint lastWorkflowId
     * 
     */
    public Output<String> lastWorkflowId() {
        return this.lastWorkflowId;
    }
    /**
     * Policy for enabling follow-the-sun business models: link local cache to cloud behavior to pre-populate before local access.
     * 
     */
    @Export(name="localCacheMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> localCacheMode;

    /**
     * @return Policy for enabling follow-the-sun business models: link local cache to cloud behavior to pre-populate before local access.
     * 
     */
    public Output<Optional<String>> localCacheMode() {
        return Codegen.optional(this.localCacheMode);
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
     * Offline data transfer
     * 
     */
    @Export(name="offlineDataTransfer", type=String.class, parameters={})
    private Output</* @Nullable */ String> offlineDataTransfer;

    /**
     * @return Offline data transfer
     * 
     */
    public Output<Optional<String>> offlineDataTransfer() {
        return Codegen.optional(this.offlineDataTransfer);
    }
    /**
     * Offline data transfer share name
     * 
     */
    @Export(name="offlineDataTransferShareName", type=String.class, parameters={})
    private Output</* @Nullable */ String> offlineDataTransferShareName;

    /**
     * @return Offline data transfer share name
     * 
     */
    public Output<Optional<String>> offlineDataTransferShareName() {
        return Codegen.optional(this.offlineDataTransferShareName);
    }
    /**
     * Offline data transfer storage account resource ID
     * 
     */
    @Export(name="offlineDataTransferStorageAccountResourceId", type=String.class, parameters={})
    private Output<String> offlineDataTransferStorageAccountResourceId;

    /**
     * @return Offline data transfer storage account resource ID
     * 
     */
    public Output<String> offlineDataTransferStorageAccountResourceId() {
        return this.offlineDataTransferStorageAccountResourceId;
    }
    /**
     * Offline data transfer storage account tenant ID
     * 
     */
    @Export(name="offlineDataTransferStorageAccountTenantId", type=String.class, parameters={})
    private Output<String> offlineDataTransferStorageAccountTenantId;

    /**
     * @return Offline data transfer storage account tenant ID
     * 
     */
    public Output<String> offlineDataTransferStorageAccountTenantId() {
        return this.offlineDataTransferStorageAccountTenantId;
    }
    /**
     * ServerEndpoint Provisioning State
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return ServerEndpoint Provisioning State
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Recall status. Only populated if cloud tiering is enabled.
     * 
     */
    @Export(name="recallStatus", type=ServerEndpointRecallStatusResponse.class, parameters={})
    private Output<ServerEndpointRecallStatusResponse> recallStatus;

    /**
     * @return Recall status. Only populated if cloud tiering is enabled.
     * 
     */
    public Output<ServerEndpointRecallStatusResponse> recallStatus() {
        return this.recallStatus;
    }
    /**
     * Server Local path.
     * 
     */
    @Export(name="serverLocalPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverLocalPath;

    /**
     * @return Server Local path.
     * 
     */
    public Output<Optional<String>> serverLocalPath() {
        return Codegen.optional(this.serverLocalPath);
    }
    /**
     * Server Resource Id.
     * 
     */
    @Export(name="serverResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverResourceId;

    /**
     * @return Server Resource Id.
     * 
     */
    public Output<Optional<String>> serverResourceId() {
        return Codegen.optional(this.serverResourceId);
    }
    /**
     * Server Endpoint sync status
     * 
     */
    @Export(name="syncStatus", type=ServerEndpointSyncStatusResponse.class, parameters={})
    private Output<ServerEndpointSyncStatusResponse> syncStatus;

    /**
     * @return Server Endpoint sync status
     * 
     */
    public Output<ServerEndpointSyncStatusResponse> syncStatus() {
        return this.syncStatus;
    }
    /**
     * Tier files older than days.
     * 
     */
    @Export(name="tierFilesOlderThanDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tierFilesOlderThanDays;

    /**
     * @return Tier files older than days.
     * 
     */
    public Output<Optional<Integer>> tierFilesOlderThanDays() {
        return Codegen.optional(this.tierFilesOlderThanDays);
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
     * Level of free space to be maintained by Cloud Tiering if it is enabled.
     * 
     */
    @Export(name="volumeFreeSpacePercent", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> volumeFreeSpacePercent;

    /**
     * @return Level of free space to be maintained by Cloud Tiering if it is enabled.
     * 
     */
    public Output<Optional<Integer>> volumeFreeSpacePercent() {
        return Codegen.optional(this.volumeFreeSpacePercent);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerEndpoint(String name) {
        this(name, ServerEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerEndpoint(String name, ServerEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerEndpoint(String name, ServerEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagesync:ServerEndpoint", name, args == null ? ServerEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerEndpoint(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagesync:ServerEndpoint", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storagesync/v20170605preview:ServerEndpoint").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20180402:ServerEndpoint").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20180701:ServerEndpoint").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20181001:ServerEndpoint").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20190201:ServerEndpoint").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20190301:ServerEndpoint").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20190601:ServerEndpoint").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20191001:ServerEndpoint").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20200301:ServerEndpoint").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20200901:ServerEndpoint").build())
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
    public static ServerEndpoint get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerEndpoint(name, id, options);
    }
}
