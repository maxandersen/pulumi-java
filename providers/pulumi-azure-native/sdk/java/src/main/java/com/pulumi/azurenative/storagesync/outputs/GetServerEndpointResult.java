// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync.outputs;

import com.pulumi.azurenative.storagesync.outputs.ServerEndpointCloudTieringStatusResponse;
import com.pulumi.azurenative.storagesync.outputs.ServerEndpointRecallStatusResponse;
import com.pulumi.azurenative.storagesync.outputs.ServerEndpointSyncStatusResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServerEndpointResult {
    /**
     * Cloud Tiering.
     * 
     */
    private final @Nullable String cloudTiering;
    /**
     * Cloud tiering status. Only populated if cloud tiering is enabled.
     * 
     */
    private final ServerEndpointCloudTieringStatusResponse cloudTieringStatus;
    /**
     * Friendly Name
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Policy for how namespace and files are recalled during FastDr.
     * 
     */
    private final @Nullable String initialDownloadPolicy;
    /**
     * Resource Last Operation Name
     * 
     */
    private final String lastOperationName;
    /**
     * ServerEndpoint lastWorkflowId
     * 
     */
    private final String lastWorkflowId;
    /**
     * Policy for enabling follow-the-sun business models: link local cache to cloud behavior to pre-populate before local access.
     * 
     */
    private final @Nullable String localCacheMode;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Offline data transfer
     * 
     */
    private final @Nullable String offlineDataTransfer;
    /**
     * Offline data transfer share name
     * 
     */
    private final @Nullable String offlineDataTransferShareName;
    /**
     * Offline data transfer storage account resource ID
     * 
     */
    private final String offlineDataTransferStorageAccountResourceId;
    /**
     * Offline data transfer storage account tenant ID
     * 
     */
    private final String offlineDataTransferStorageAccountTenantId;
    /**
     * ServerEndpoint Provisioning State
     * 
     */
    private final String provisioningState;
    /**
     * Recall status. Only populated if cloud tiering is enabled.
     * 
     */
    private final ServerEndpointRecallStatusResponse recallStatus;
    /**
     * Server Local path.
     * 
     */
    private final @Nullable String serverLocalPath;
    /**
     * Server Resource Id.
     * 
     */
    private final @Nullable String serverResourceId;
    /**
     * Server Endpoint sync status
     * 
     */
    private final ServerEndpointSyncStatusResponse syncStatus;
    /**
     * Tier files older than days.
     * 
     */
    private final @Nullable Integer tierFilesOlderThanDays;
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;
    /**
     * Level of free space to be maintained by Cloud Tiering if it is enabled.
     * 
     */
    private final @Nullable Integer volumeFreeSpacePercent;

    @CustomType.Constructor
    private GetServerEndpointResult(
        @CustomType.Parameter("cloudTiering") @Nullable String cloudTiering,
        @CustomType.Parameter("cloudTieringStatus") ServerEndpointCloudTieringStatusResponse cloudTieringStatus,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("initialDownloadPolicy") @Nullable String initialDownloadPolicy,
        @CustomType.Parameter("lastOperationName") String lastOperationName,
        @CustomType.Parameter("lastWorkflowId") String lastWorkflowId,
        @CustomType.Parameter("localCacheMode") @Nullable String localCacheMode,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("offlineDataTransfer") @Nullable String offlineDataTransfer,
        @CustomType.Parameter("offlineDataTransferShareName") @Nullable String offlineDataTransferShareName,
        @CustomType.Parameter("offlineDataTransferStorageAccountResourceId") String offlineDataTransferStorageAccountResourceId,
        @CustomType.Parameter("offlineDataTransferStorageAccountTenantId") String offlineDataTransferStorageAccountTenantId,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("recallStatus") ServerEndpointRecallStatusResponse recallStatus,
        @CustomType.Parameter("serverLocalPath") @Nullable String serverLocalPath,
        @CustomType.Parameter("serverResourceId") @Nullable String serverResourceId,
        @CustomType.Parameter("syncStatus") ServerEndpointSyncStatusResponse syncStatus,
        @CustomType.Parameter("tierFilesOlderThanDays") @Nullable Integer tierFilesOlderThanDays,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("volumeFreeSpacePercent") @Nullable Integer volumeFreeSpacePercent) {
        this.cloudTiering = cloudTiering;
        this.cloudTieringStatus = cloudTieringStatus;
        this.friendlyName = friendlyName;
        this.id = id;
        this.initialDownloadPolicy = initialDownloadPolicy;
        this.lastOperationName = lastOperationName;
        this.lastWorkflowId = lastWorkflowId;
        this.localCacheMode = localCacheMode;
        this.name = name;
        this.offlineDataTransfer = offlineDataTransfer;
        this.offlineDataTransferShareName = offlineDataTransferShareName;
        this.offlineDataTransferStorageAccountResourceId = offlineDataTransferStorageAccountResourceId;
        this.offlineDataTransferStorageAccountTenantId = offlineDataTransferStorageAccountTenantId;
        this.provisioningState = provisioningState;
        this.recallStatus = recallStatus;
        this.serverLocalPath = serverLocalPath;
        this.serverResourceId = serverResourceId;
        this.syncStatus = syncStatus;
        this.tierFilesOlderThanDays = tierFilesOlderThanDays;
        this.type = type;
        this.volumeFreeSpacePercent = volumeFreeSpacePercent;
    }

    /**
     * Cloud Tiering.
     * 
    */
    public Optional<String> cloudTiering() {
        return Optional.ofNullable(this.cloudTiering);
    }
    /**
     * Cloud tiering status. Only populated if cloud tiering is enabled.
     * 
    */
    public ServerEndpointCloudTieringStatusResponse cloudTieringStatus() {
        return this.cloudTieringStatus;
    }
    /**
     * Friendly Name
     * 
    */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Policy for how namespace and files are recalled during FastDr.
     * 
    */
    public Optional<String> initialDownloadPolicy() {
        return Optional.ofNullable(this.initialDownloadPolicy);
    }
    /**
     * Resource Last Operation Name
     * 
    */
    public String lastOperationName() {
        return this.lastOperationName;
    }
    /**
     * ServerEndpoint lastWorkflowId
     * 
    */
    public String lastWorkflowId() {
        return this.lastWorkflowId;
    }
    /**
     * Policy for enabling follow-the-sun business models: link local cache to cloud behavior to pre-populate before local access.
     * 
    */
    public Optional<String> localCacheMode() {
        return Optional.ofNullable(this.localCacheMode);
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Offline data transfer
     * 
    */
    public Optional<String> offlineDataTransfer() {
        return Optional.ofNullable(this.offlineDataTransfer);
    }
    /**
     * Offline data transfer share name
     * 
    */
    public Optional<String> offlineDataTransferShareName() {
        return Optional.ofNullable(this.offlineDataTransferShareName);
    }
    /**
     * Offline data transfer storage account resource ID
     * 
    */
    public String offlineDataTransferStorageAccountResourceId() {
        return this.offlineDataTransferStorageAccountResourceId;
    }
    /**
     * Offline data transfer storage account tenant ID
     * 
    */
    public String offlineDataTransferStorageAccountTenantId() {
        return this.offlineDataTransferStorageAccountTenantId;
    }
    /**
     * ServerEndpoint Provisioning State
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Recall status. Only populated if cloud tiering is enabled.
     * 
    */
    public ServerEndpointRecallStatusResponse recallStatus() {
        return this.recallStatus;
    }
    /**
     * Server Local path.
     * 
    */
    public Optional<String> serverLocalPath() {
        return Optional.ofNullable(this.serverLocalPath);
    }
    /**
     * Server Resource Id.
     * 
    */
    public Optional<String> serverResourceId() {
        return Optional.ofNullable(this.serverResourceId);
    }
    /**
     * Server Endpoint sync status
     * 
    */
    public ServerEndpointSyncStatusResponse syncStatus() {
        return this.syncStatus;
    }
    /**
     * Tier files older than days.
     * 
    */
    public Optional<Integer> tierFilesOlderThanDays() {
        return Optional.ofNullable(this.tierFilesOlderThanDays);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Level of free space to be maintained by Cloud Tiering if it is enabled.
     * 
    */
    public Optional<Integer> volumeFreeSpacePercent() {
        return Optional.ofNullable(this.volumeFreeSpacePercent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudTiering;
        private ServerEndpointCloudTieringStatusResponse cloudTieringStatus;
        private @Nullable String friendlyName;
        private String id;
        private @Nullable String initialDownloadPolicy;
        private String lastOperationName;
        private String lastWorkflowId;
        private @Nullable String localCacheMode;
        private String name;
        private @Nullable String offlineDataTransfer;
        private @Nullable String offlineDataTransferShareName;
        private String offlineDataTransferStorageAccountResourceId;
        private String offlineDataTransferStorageAccountTenantId;
        private String provisioningState;
        private ServerEndpointRecallStatusResponse recallStatus;
        private @Nullable String serverLocalPath;
        private @Nullable String serverResourceId;
        private ServerEndpointSyncStatusResponse syncStatus;
        private @Nullable Integer tierFilesOlderThanDays;
        private String type;
        private @Nullable Integer volumeFreeSpacePercent;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudTiering = defaults.cloudTiering;
    	      this.cloudTieringStatus = defaults.cloudTieringStatus;
    	      this.friendlyName = defaults.friendlyName;
    	      this.id = defaults.id;
    	      this.initialDownloadPolicy = defaults.initialDownloadPolicy;
    	      this.lastOperationName = defaults.lastOperationName;
    	      this.lastWorkflowId = defaults.lastWorkflowId;
    	      this.localCacheMode = defaults.localCacheMode;
    	      this.name = defaults.name;
    	      this.offlineDataTransfer = defaults.offlineDataTransfer;
    	      this.offlineDataTransferShareName = defaults.offlineDataTransferShareName;
    	      this.offlineDataTransferStorageAccountResourceId = defaults.offlineDataTransferStorageAccountResourceId;
    	      this.offlineDataTransferStorageAccountTenantId = defaults.offlineDataTransferStorageAccountTenantId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.recallStatus = defaults.recallStatus;
    	      this.serverLocalPath = defaults.serverLocalPath;
    	      this.serverResourceId = defaults.serverResourceId;
    	      this.syncStatus = defaults.syncStatus;
    	      this.tierFilesOlderThanDays = defaults.tierFilesOlderThanDays;
    	      this.type = defaults.type;
    	      this.volumeFreeSpacePercent = defaults.volumeFreeSpacePercent;
        }

        public Builder cloudTiering(@Nullable String cloudTiering) {
            this.cloudTiering = cloudTiering;
            return this;
        }
        public Builder cloudTieringStatus(ServerEndpointCloudTieringStatusResponse cloudTieringStatus) {
            this.cloudTieringStatus = Objects.requireNonNull(cloudTieringStatus);
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder initialDownloadPolicy(@Nullable String initialDownloadPolicy) {
            this.initialDownloadPolicy = initialDownloadPolicy;
            return this;
        }
        public Builder lastOperationName(String lastOperationName) {
            this.lastOperationName = Objects.requireNonNull(lastOperationName);
            return this;
        }
        public Builder lastWorkflowId(String lastWorkflowId) {
            this.lastWorkflowId = Objects.requireNonNull(lastWorkflowId);
            return this;
        }
        public Builder localCacheMode(@Nullable String localCacheMode) {
            this.localCacheMode = localCacheMode;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder offlineDataTransfer(@Nullable String offlineDataTransfer) {
            this.offlineDataTransfer = offlineDataTransfer;
            return this;
        }
        public Builder offlineDataTransferShareName(@Nullable String offlineDataTransferShareName) {
            this.offlineDataTransferShareName = offlineDataTransferShareName;
            return this;
        }
        public Builder offlineDataTransferStorageAccountResourceId(String offlineDataTransferStorageAccountResourceId) {
            this.offlineDataTransferStorageAccountResourceId = Objects.requireNonNull(offlineDataTransferStorageAccountResourceId);
            return this;
        }
        public Builder offlineDataTransferStorageAccountTenantId(String offlineDataTransferStorageAccountTenantId) {
            this.offlineDataTransferStorageAccountTenantId = Objects.requireNonNull(offlineDataTransferStorageAccountTenantId);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder recallStatus(ServerEndpointRecallStatusResponse recallStatus) {
            this.recallStatus = Objects.requireNonNull(recallStatus);
            return this;
        }
        public Builder serverLocalPath(@Nullable String serverLocalPath) {
            this.serverLocalPath = serverLocalPath;
            return this;
        }
        public Builder serverResourceId(@Nullable String serverResourceId) {
            this.serverResourceId = serverResourceId;
            return this;
        }
        public Builder syncStatus(ServerEndpointSyncStatusResponse syncStatus) {
            this.syncStatus = Objects.requireNonNull(syncStatus);
            return this;
        }
        public Builder tierFilesOlderThanDays(@Nullable Integer tierFilesOlderThanDays) {
            this.tierFilesOlderThanDays = tierFilesOlderThanDays;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder volumeFreeSpacePercent(@Nullable Integer volumeFreeSpacePercent) {
            this.volumeFreeSpacePercent = volumeFreeSpacePercent;
            return this;
        }        public GetServerEndpointResult build() {
            return new GetServerEndpointResult(cloudTiering, cloudTieringStatus, friendlyName, id, initialDownloadPolicy, lastOperationName, lastWorkflowId, localCacheMode, name, offlineDataTransfer, offlineDataTransferShareName, offlineDataTransferStorageAccountResourceId, offlineDataTransferStorageAccountTenantId, provisioningState, recallStatus, serverLocalPath, serverResourceId, syncStatus, tierFilesOlderThanDays, type, volumeFreeSpacePercent);
        }
    }
}
