// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.analysisservices;

import com.pulumi.azurenative.analysisservices.enums.ConnectionMode;
import com.pulumi.azurenative.analysisservices.inputs.GatewayDetailsArgs;
import com.pulumi.azurenative.analysisservices.inputs.IPv4FirewallSettingsArgs;
import com.pulumi.azurenative.analysisservices.inputs.ResourceSkuArgs;
import com.pulumi.azurenative.analysisservices.inputs.ServerAdministratorsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerDetailsArgs Empty = new ServerDetailsArgs();

    /**
     * A collection of AS server administrators
     * 
     */
    @Import(name="asAdministrators")
      private final @Nullable Output<ServerAdministratorsArgs> asAdministrators;

    public Output<ServerAdministratorsArgs> asAdministrators() {
        return this.asAdministrators == null ? Codegen.empty() : this.asAdministrators;
    }

    /**
     * The SAS container URI to the backup container.
     * 
     */
    @Import(name="backupBlobContainerUri")
      private final @Nullable Output<String> backupBlobContainerUri;

    public Output<String> backupBlobContainerUri() {
        return this.backupBlobContainerUri == null ? Codegen.empty() : this.backupBlobContainerUri;
    }

    /**
     * The gateway details configured for the AS server.
     * 
     */
    @Import(name="gatewayDetails")
      private final @Nullable Output<GatewayDetailsArgs> gatewayDetails;

    public Output<GatewayDetailsArgs> gatewayDetails() {
        return this.gatewayDetails == null ? Codegen.empty() : this.gatewayDetails;
    }

    /**
     * The firewall settings for the AS server.
     * 
     */
    @Import(name="ipV4FirewallSettings")
      private final @Nullable Output<IPv4FirewallSettingsArgs> ipV4FirewallSettings;

    public Output<IPv4FirewallSettingsArgs> ipV4FirewallSettings() {
        return this.ipV4FirewallSettings == null ? Codegen.empty() : this.ipV4FirewallSettings;
    }

    /**
     * Location of the Analysis Services resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The managed mode of the server (0 = not managed, 1 = managed).
     * 
     */
    @Import(name="managedMode")
      private final @Nullable Output<Integer> managedMode;

    public Output<Integer> managedMode() {
        return this.managedMode == null ? Codegen.empty() : this.managedMode;
    }

    /**
     * How the read-write server&#39;s participation in the query pool is controlled.&lt;br/&gt;It can have the following values: &lt;ul&gt;&lt;li&gt;readOnly - indicates that the read-write server is intended not to participate in query operations&lt;/li&gt;&lt;li&gt;all - indicates that the read-write server can participate in query operations&lt;/li&gt;&lt;/ul&gt;Specifying readOnly when capacity is 1 results in error.
     * 
     */
    @Import(name="querypoolConnectionMode")
      private final @Nullable Output<ConnectionMode> querypoolConnectionMode;

    public Output<ConnectionMode> querypoolConnectionMode() {
        return this.querypoolConnectionMode == null ? Codegen.empty() : this.querypoolConnectionMode;
    }

    /**
     * The name of the Azure Resource group of which a given Analysis Services server is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The server monitor mode for AS server
     * 
     */
    @Import(name="serverMonitorMode")
      private final @Nullable Output<Integer> serverMonitorMode;

    public Output<Integer> serverMonitorMode() {
        return this.serverMonitorMode == null ? Codegen.empty() : this.serverMonitorMode;
    }

    /**
     * The name of the Analysis Services server. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    @Import(name="serverName")
      private final @Nullable Output<String> serverName;

    public Output<String> serverName() {
        return this.serverName == null ? Codegen.empty() : this.serverName;
    }

    /**
     * The SKU of the Analysis Services resource.
     * 
     */
    @Import(name="sku", required=true)
      private final Output<ResourceSkuArgs> sku;

    public Output<ResourceSkuArgs> sku() {
        return this.sku;
    }

    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ServerDetailsArgs(
        @Nullable Output<ServerAdministratorsArgs> asAdministrators,
        @Nullable Output<String> backupBlobContainerUri,
        @Nullable Output<GatewayDetailsArgs> gatewayDetails,
        @Nullable Output<IPv4FirewallSettingsArgs> ipV4FirewallSettings,
        @Nullable Output<String> location,
        @Nullable Output<Integer> managedMode,
        @Nullable Output<ConnectionMode> querypoolConnectionMode,
        Output<String> resourceGroupName,
        @Nullable Output<Integer> serverMonitorMode,
        @Nullable Output<String> serverName,
        Output<ResourceSkuArgs> sku,
        @Nullable Output<Map<String,String>> tags) {
        this.asAdministrators = asAdministrators;
        this.backupBlobContainerUri = backupBlobContainerUri;
        this.gatewayDetails = gatewayDetails;
        this.ipV4FirewallSettings = ipV4FirewallSettings;
        this.location = location;
        this.managedMode = Codegen.integerProp("managedMode").output().arg(managedMode).def(1).getNullable();
        this.querypoolConnectionMode = Codegen.objectProp("querypoolConnectionMode", ConnectionMode.class).output().arg(querypoolConnectionMode).def(ConnectionMode.All).getNullable();
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverMonitorMode = Codegen.integerProp("serverMonitorMode").output().arg(serverMonitorMode).def(1).getNullable();
        this.serverName = serverName;
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
    }

    private ServerDetailsArgs() {
        this.asAdministrators = Codegen.empty();
        this.backupBlobContainerUri = Codegen.empty();
        this.gatewayDetails = Codegen.empty();
        this.ipV4FirewallSettings = Codegen.empty();
        this.location = Codegen.empty();
        this.managedMode = Codegen.empty();
        this.querypoolConnectionMode = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serverMonitorMode = Codegen.empty();
        this.serverName = Codegen.empty();
        this.sku = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServerAdministratorsArgs> asAdministrators;
        private @Nullable Output<String> backupBlobContainerUri;
        private @Nullable Output<GatewayDetailsArgs> gatewayDetails;
        private @Nullable Output<IPv4FirewallSettingsArgs> ipV4FirewallSettings;
        private @Nullable Output<String> location;
        private @Nullable Output<Integer> managedMode;
        private @Nullable Output<ConnectionMode> querypoolConnectionMode;
        private Output<String> resourceGroupName;
        private @Nullable Output<Integer> serverMonitorMode;
        private @Nullable Output<String> serverName;
        private Output<ResourceSkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asAdministrators = defaults.asAdministrators;
    	      this.backupBlobContainerUri = defaults.backupBlobContainerUri;
    	      this.gatewayDetails = defaults.gatewayDetails;
    	      this.ipV4FirewallSettings = defaults.ipV4FirewallSettings;
    	      this.location = defaults.location;
    	      this.managedMode = defaults.managedMode;
    	      this.querypoolConnectionMode = defaults.querypoolConnectionMode;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverMonitorMode = defaults.serverMonitorMode;
    	      this.serverName = defaults.serverName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder asAdministrators(@Nullable Output<ServerAdministratorsArgs> asAdministrators) {
            this.asAdministrators = asAdministrators;
            return this;
        }
        public Builder asAdministrators(@Nullable ServerAdministratorsArgs asAdministrators) {
            this.asAdministrators = Codegen.ofNullable(asAdministrators);
            return this;
        }
        public Builder backupBlobContainerUri(@Nullable Output<String> backupBlobContainerUri) {
            this.backupBlobContainerUri = backupBlobContainerUri;
            return this;
        }
        public Builder backupBlobContainerUri(@Nullable String backupBlobContainerUri) {
            this.backupBlobContainerUri = Codegen.ofNullable(backupBlobContainerUri);
            return this;
        }
        public Builder gatewayDetails(@Nullable Output<GatewayDetailsArgs> gatewayDetails) {
            this.gatewayDetails = gatewayDetails;
            return this;
        }
        public Builder gatewayDetails(@Nullable GatewayDetailsArgs gatewayDetails) {
            this.gatewayDetails = Codegen.ofNullable(gatewayDetails);
            return this;
        }
        public Builder ipV4FirewallSettings(@Nullable Output<IPv4FirewallSettingsArgs> ipV4FirewallSettings) {
            this.ipV4FirewallSettings = ipV4FirewallSettings;
            return this;
        }
        public Builder ipV4FirewallSettings(@Nullable IPv4FirewallSettingsArgs ipV4FirewallSettings) {
            this.ipV4FirewallSettings = Codegen.ofNullable(ipV4FirewallSettings);
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
        public Builder managedMode(@Nullable Output<Integer> managedMode) {
            this.managedMode = managedMode;
            return this;
        }
        public Builder managedMode(@Nullable Integer managedMode) {
            this.managedMode = Codegen.ofNullable(managedMode);
            return this;
        }
        public Builder querypoolConnectionMode(@Nullable Output<ConnectionMode> querypoolConnectionMode) {
            this.querypoolConnectionMode = querypoolConnectionMode;
            return this;
        }
        public Builder querypoolConnectionMode(@Nullable ConnectionMode querypoolConnectionMode) {
            this.querypoolConnectionMode = Codegen.ofNullable(querypoolConnectionMode);
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
        public Builder serverMonitorMode(@Nullable Output<Integer> serverMonitorMode) {
            this.serverMonitorMode = serverMonitorMode;
            return this;
        }
        public Builder serverMonitorMode(@Nullable Integer serverMonitorMode) {
            this.serverMonitorMode = Codegen.ofNullable(serverMonitorMode);
            return this;
        }
        public Builder serverName(@Nullable Output<String> serverName) {
            this.serverName = serverName;
            return this;
        }
        public Builder serverName(@Nullable String serverName) {
            this.serverName = Codegen.ofNullable(serverName);
            return this;
        }
        public Builder sku(Output<ResourceSkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder sku(ResourceSkuArgs sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ServerDetailsArgs build() {
            return new ServerDetailsArgs(asAdministrators, backupBlobContainerUri, gatewayDetails, ipV4FirewallSettings, location, managedMode, querypoolConnectionMode, resourceGroupName, serverMonitorMode, serverName, sku, tags);
        }
    }
}
