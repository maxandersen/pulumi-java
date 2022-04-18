// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.synapse.enums.WorkspacePublicNetworkAccess;
import com.pulumi.azurenative.synapse.inputs.DataLakeStorageAccountDetailsArgs;
import com.pulumi.azurenative.synapse.inputs.EncryptionDetailsArgs;
import com.pulumi.azurenative.synapse.inputs.ManagedIdentityArgs;
import com.pulumi.azurenative.synapse.inputs.ManagedVirtualNetworkSettingsArgs;
import com.pulumi.azurenative.synapse.inputs.PrivateEndpointConnectionArgs;
import com.pulumi.azurenative.synapse.inputs.PurviewConfigurationArgs;
import com.pulumi.azurenative.synapse.inputs.VirtualNetworkProfileArgs;
import com.pulumi.azurenative.synapse.inputs.WorkspaceRepositoryConfigurationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * Connectivity endpoints
     * 
     */
    @Import(name="connectivityEndpoints")
      private final @Nullable Output<Map<String,String>> connectivityEndpoints;

    public Output<Map<String,String>> connectivityEndpoints() {
        return this.connectivityEndpoints == null ? Codegen.empty() : this.connectivityEndpoints;
    }

    /**
     * Workspace default data lake storage account details
     * 
     */
    @Import(name="defaultDataLakeStorage")
      private final @Nullable Output<DataLakeStorageAccountDetailsArgs> defaultDataLakeStorage;

    public Output<DataLakeStorageAccountDetailsArgs> defaultDataLakeStorage() {
        return this.defaultDataLakeStorage == null ? Codegen.empty() : this.defaultDataLakeStorage;
    }

    /**
     * The encryption details of the workspace
     * 
     */
    @Import(name="encryption")
      private final @Nullable Output<EncryptionDetailsArgs> encryption;

    public Output<EncryptionDetailsArgs> encryption() {
        return this.encryption == null ? Codegen.empty() : this.encryption;
    }

    /**
     * Identity of the workspace
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ManagedIdentityArgs> identity;

    public Output<ManagedIdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Workspace managed resource group. The resource group name uniquely identifies the resource group within the user subscriptionId. The resource group name must be no longer than 90 characters long, and must be alphanumeric characters (Char.IsLetterOrDigit()) and '-', '_', '(', ')' and'.'. Note that the name cannot end with '.'
     * 
     */
    @Import(name="managedResourceGroupName")
      private final @Nullable Output<String> managedResourceGroupName;

    public Output<String> managedResourceGroupName() {
        return this.managedResourceGroupName == null ? Codegen.empty() : this.managedResourceGroupName;
    }

    /**
     * Setting this to 'default' will ensure that all compute for this workspace is in a virtual network managed on behalf of the user.
     * 
     */
    @Import(name="managedVirtualNetwork")
      private final @Nullable Output<String> managedVirtualNetwork;

    public Output<String> managedVirtualNetwork() {
        return this.managedVirtualNetwork == null ? Codegen.empty() : this.managedVirtualNetwork;
    }

    /**
     * Managed Virtual Network Settings
     * 
     */
    @Import(name="managedVirtualNetworkSettings")
      private final @Nullable Output<ManagedVirtualNetworkSettingsArgs> managedVirtualNetworkSettings;

    public Output<ManagedVirtualNetworkSettingsArgs> managedVirtualNetworkSettings() {
        return this.managedVirtualNetworkSettings == null ? Codegen.empty() : this.managedVirtualNetworkSettings;
    }

    /**
     * Private endpoint connections to the workspace
     * 
     */
    @Import(name="privateEndpointConnections")
      private final @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;

    public Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections() {
        return this.privateEndpointConnections == null ? Codegen.empty() : this.privateEndpointConnections;
    }

    /**
     * Enable or Disable public network access to workspace
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<Either<String,WorkspacePublicNetworkAccess>> publicNetworkAccess;

    public Output<Either<String,WorkspacePublicNetworkAccess>> publicNetworkAccess() {
        return this.publicNetworkAccess == null ? Codegen.empty() : this.publicNetworkAccess;
    }

    /**
     * Purview Configuration
     * 
     */
    @Import(name="purviewConfiguration")
      private final @Nullable Output<PurviewConfigurationArgs> purviewConfiguration;

    public Output<PurviewConfigurationArgs> purviewConfiguration() {
        return this.purviewConfiguration == null ? Codegen.empty() : this.purviewConfiguration;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Login for workspace SQL active directory administrator
     * 
     */
    @Import(name="sqlAdministratorLogin")
      private final @Nullable Output<String> sqlAdministratorLogin;

    public Output<String> sqlAdministratorLogin() {
        return this.sqlAdministratorLogin == null ? Codegen.empty() : this.sqlAdministratorLogin;
    }

    /**
     * SQL administrator login password
     * 
     */
    @Import(name="sqlAdministratorLoginPassword")
      private final @Nullable Output<String> sqlAdministratorLoginPassword;

    public Output<String> sqlAdministratorLoginPassword() {
        return this.sqlAdministratorLoginPassword == null ? Codegen.empty() : this.sqlAdministratorLoginPassword;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Virtual Network profile
     * 
     */
    @Import(name="virtualNetworkProfile")
      private final @Nullable Output<VirtualNetworkProfileArgs> virtualNetworkProfile;

    public Output<VirtualNetworkProfileArgs> virtualNetworkProfile() {
        return this.virtualNetworkProfile == null ? Codegen.empty() : this.virtualNetworkProfile;
    }

    /**
     * The name of the workspace
     * 
     */
    @Import(name="workspaceName")
      private final @Nullable Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName == null ? Codegen.empty() : this.workspaceName;
    }

    /**
     * Git integration settings
     * 
     */
    @Import(name="workspaceRepositoryConfiguration")
      private final @Nullable Output<WorkspaceRepositoryConfigurationArgs> workspaceRepositoryConfiguration;

    public Output<WorkspaceRepositoryConfigurationArgs> workspaceRepositoryConfiguration() {
        return this.workspaceRepositoryConfiguration == null ? Codegen.empty() : this.workspaceRepositoryConfiguration;
    }

    public WorkspaceArgs(
        @Nullable Output<Map<String,String>> connectivityEndpoints,
        @Nullable Output<DataLakeStorageAccountDetailsArgs> defaultDataLakeStorage,
        @Nullable Output<EncryptionDetailsArgs> encryption,
        @Nullable Output<ManagedIdentityArgs> identity,
        @Nullable Output<String> location,
        @Nullable Output<String> managedResourceGroupName,
        @Nullable Output<String> managedVirtualNetwork,
        @Nullable Output<ManagedVirtualNetworkSettingsArgs> managedVirtualNetworkSettings,
        @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections,
        @Nullable Output<Either<String,WorkspacePublicNetworkAccess>> publicNetworkAccess,
        @Nullable Output<PurviewConfigurationArgs> purviewConfiguration,
        Output<String> resourceGroupName,
        @Nullable Output<String> sqlAdministratorLogin,
        @Nullable Output<String> sqlAdministratorLoginPassword,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<VirtualNetworkProfileArgs> virtualNetworkProfile,
        @Nullable Output<String> workspaceName,
        @Nullable Output<WorkspaceRepositoryConfigurationArgs> workspaceRepositoryConfiguration) {
        this.connectivityEndpoints = connectivityEndpoints;
        this.defaultDataLakeStorage = defaultDataLakeStorage;
        this.encryption = encryption;
        this.identity = identity;
        this.location = location;
        this.managedResourceGroupName = managedResourceGroupName;
        this.managedVirtualNetwork = managedVirtualNetwork;
        this.managedVirtualNetworkSettings = managedVirtualNetworkSettings;
        this.privateEndpointConnections = privateEndpointConnections;
        this.publicNetworkAccess = publicNetworkAccess;
        this.purviewConfiguration = purviewConfiguration;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlAdministratorLogin = sqlAdministratorLogin;
        this.sqlAdministratorLoginPassword = sqlAdministratorLoginPassword;
        this.tags = tags;
        this.virtualNetworkProfile = virtualNetworkProfile;
        this.workspaceName = workspaceName;
        this.workspaceRepositoryConfiguration = workspaceRepositoryConfiguration;
    }

    private WorkspaceArgs() {
        this.connectivityEndpoints = Codegen.empty();
        this.defaultDataLakeStorage = Codegen.empty();
        this.encryption = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.managedResourceGroupName = Codegen.empty();
        this.managedVirtualNetwork = Codegen.empty();
        this.managedVirtualNetworkSettings = Codegen.empty();
        this.privateEndpointConnections = Codegen.empty();
        this.publicNetworkAccess = Codegen.empty();
        this.purviewConfiguration = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sqlAdministratorLogin = Codegen.empty();
        this.sqlAdministratorLoginPassword = Codegen.empty();
        this.tags = Codegen.empty();
        this.virtualNetworkProfile = Codegen.empty();
        this.workspaceName = Codegen.empty();
        this.workspaceRepositoryConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> connectivityEndpoints;
        private @Nullable Output<DataLakeStorageAccountDetailsArgs> defaultDataLakeStorage;
        private @Nullable Output<EncryptionDetailsArgs> encryption;
        private @Nullable Output<ManagedIdentityArgs> identity;
        private @Nullable Output<String> location;
        private @Nullable Output<String> managedResourceGroupName;
        private @Nullable Output<String> managedVirtualNetwork;
        private @Nullable Output<ManagedVirtualNetworkSettingsArgs> managedVirtualNetworkSettings;
        private @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;
        private @Nullable Output<Either<String,WorkspacePublicNetworkAccess>> publicNetworkAccess;
        private @Nullable Output<PurviewConfigurationArgs> purviewConfiguration;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> sqlAdministratorLogin;
        private @Nullable Output<String> sqlAdministratorLoginPassword;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<VirtualNetworkProfileArgs> virtualNetworkProfile;
        private @Nullable Output<String> workspaceName;
        private @Nullable Output<WorkspaceRepositoryConfigurationArgs> workspaceRepositoryConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectivityEndpoints = defaults.connectivityEndpoints;
    	      this.defaultDataLakeStorage = defaults.defaultDataLakeStorage;
    	      this.encryption = defaults.encryption;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.managedResourceGroupName = defaults.managedResourceGroupName;
    	      this.managedVirtualNetwork = defaults.managedVirtualNetwork;
    	      this.managedVirtualNetworkSettings = defaults.managedVirtualNetworkSettings;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.purviewConfiguration = defaults.purviewConfiguration;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlAdministratorLogin = defaults.sqlAdministratorLogin;
    	      this.sqlAdministratorLoginPassword = defaults.sqlAdministratorLoginPassword;
    	      this.tags = defaults.tags;
    	      this.virtualNetworkProfile = defaults.virtualNetworkProfile;
    	      this.workspaceName = defaults.workspaceName;
    	      this.workspaceRepositoryConfiguration = defaults.workspaceRepositoryConfiguration;
        }

        public Builder connectivityEndpoints(@Nullable Output<Map<String,String>> connectivityEndpoints) {
            this.connectivityEndpoints = connectivityEndpoints;
            return this;
        }
        public Builder connectivityEndpoints(@Nullable Map<String,String> connectivityEndpoints) {
            this.connectivityEndpoints = Codegen.ofNullable(connectivityEndpoints);
            return this;
        }
        public Builder defaultDataLakeStorage(@Nullable Output<DataLakeStorageAccountDetailsArgs> defaultDataLakeStorage) {
            this.defaultDataLakeStorage = defaultDataLakeStorage;
            return this;
        }
        public Builder defaultDataLakeStorage(@Nullable DataLakeStorageAccountDetailsArgs defaultDataLakeStorage) {
            this.defaultDataLakeStorage = Codegen.ofNullable(defaultDataLakeStorage);
            return this;
        }
        public Builder encryption(@Nullable Output<EncryptionDetailsArgs> encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder encryption(@Nullable EncryptionDetailsArgs encryption) {
            this.encryption = Codegen.ofNullable(encryption);
            return this;
        }
        public Builder identity(@Nullable Output<ManagedIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ManagedIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder managedResourceGroupName(@Nullable Output<String> managedResourceGroupName) {
            this.managedResourceGroupName = managedResourceGroupName;
            return this;
        }
        public Builder managedResourceGroupName(@Nullable String managedResourceGroupName) {
            this.managedResourceGroupName = Codegen.ofNullable(managedResourceGroupName);
            return this;
        }
        public Builder managedVirtualNetwork(@Nullable Output<String> managedVirtualNetwork) {
            this.managedVirtualNetwork = managedVirtualNetwork;
            return this;
        }
        public Builder managedVirtualNetwork(@Nullable String managedVirtualNetwork) {
            this.managedVirtualNetwork = Codegen.ofNullable(managedVirtualNetwork);
            return this;
        }
        public Builder managedVirtualNetworkSettings(@Nullable Output<ManagedVirtualNetworkSettingsArgs> managedVirtualNetworkSettings) {
            this.managedVirtualNetworkSettings = managedVirtualNetworkSettings;
            return this;
        }
        public Builder managedVirtualNetworkSettings(@Nullable ManagedVirtualNetworkSettingsArgs managedVirtualNetworkSettings) {
            this.managedVirtualNetworkSettings = Codegen.ofNullable(managedVirtualNetworkSettings);
            return this;
        }
        public Builder privateEndpointConnections(@Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }
        public Builder privateEndpointConnections(@Nullable List<PrivateEndpointConnectionArgs> privateEndpointConnections) {
            this.privateEndpointConnections = Codegen.ofNullable(privateEndpointConnections);
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionArgs... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder publicNetworkAccess(@Nullable Output<Either<String,WorkspacePublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Either<String,WorkspacePublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Codegen.ofNullable(publicNetworkAccess);
            return this;
        }
        public Builder purviewConfiguration(@Nullable Output<PurviewConfigurationArgs> purviewConfiguration) {
            this.purviewConfiguration = purviewConfiguration;
            return this;
        }
        public Builder purviewConfiguration(@Nullable PurviewConfigurationArgs purviewConfiguration) {
            this.purviewConfiguration = Codegen.ofNullable(purviewConfiguration);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sqlAdministratorLogin(@Nullable Output<String> sqlAdministratorLogin) {
            this.sqlAdministratorLogin = sqlAdministratorLogin;
            return this;
        }
        public Builder sqlAdministratorLogin(@Nullable String sqlAdministratorLogin) {
            this.sqlAdministratorLogin = Codegen.ofNullable(sqlAdministratorLogin);
            return this;
        }
        public Builder sqlAdministratorLoginPassword(@Nullable Output<String> sqlAdministratorLoginPassword) {
            this.sqlAdministratorLoginPassword = sqlAdministratorLoginPassword;
            return this;
        }
        public Builder sqlAdministratorLoginPassword(@Nullable String sqlAdministratorLoginPassword) {
            this.sqlAdministratorLoginPassword = Codegen.ofNullable(sqlAdministratorLoginPassword);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder virtualNetworkProfile(@Nullable Output<VirtualNetworkProfileArgs> virtualNetworkProfile) {
            this.virtualNetworkProfile = virtualNetworkProfile;
            return this;
        }
        public Builder virtualNetworkProfile(@Nullable VirtualNetworkProfileArgs virtualNetworkProfile) {
            this.virtualNetworkProfile = Codegen.ofNullable(virtualNetworkProfile);
            return this;
        }
        public Builder workspaceName(@Nullable Output<String> workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public Builder workspaceName(@Nullable String workspaceName) {
            this.workspaceName = Codegen.ofNullable(workspaceName);
            return this;
        }
        public Builder workspaceRepositoryConfiguration(@Nullable Output<WorkspaceRepositoryConfigurationArgs> workspaceRepositoryConfiguration) {
            this.workspaceRepositoryConfiguration = workspaceRepositoryConfiguration;
            return this;
        }
        public Builder workspaceRepositoryConfiguration(@Nullable WorkspaceRepositoryConfigurationArgs workspaceRepositoryConfiguration) {
            this.workspaceRepositoryConfiguration = Codegen.ofNullable(workspaceRepositoryConfiguration);
            return this;
        }        public WorkspaceArgs build() {
            return new WorkspaceArgs(connectivityEndpoints, defaultDataLakeStorage, encryption, identity, location, managedResourceGroupName, managedVirtualNetwork, managedVirtualNetworkSettings, privateEndpointConnections, publicNetworkAccess, purviewConfiguration, resourceGroupName, sqlAdministratorLogin, sqlAdministratorLoginPassword, tags, virtualNetworkProfile, workspaceName, workspaceRepositoryConfiguration);
        }
    }
}
