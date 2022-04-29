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
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerDetailsArgs extends ResourceArgs {

    public static final ServerDetailsArgs Empty = new ServerDetailsArgs();

    /**
     * A collection of AS server administrators
     * 
     */
    @Import(name="asAdministrators")
    private @Nullable Output<ServerAdministratorsArgs> asAdministrators;

    /**
     * @return A collection of AS server administrators
     * 
     */
    public Optional<Output<ServerAdministratorsArgs>> asAdministrators() {
        return Optional.ofNullable(this.asAdministrators);
    }

    /**
     * The SAS container URI to the backup container.
     * 
     */
    @Import(name="backupBlobContainerUri")
    private @Nullable Output<String> backupBlobContainerUri;

    /**
     * @return The SAS container URI to the backup container.
     * 
     */
    public Optional<Output<String>> backupBlobContainerUri() {
        return Optional.ofNullable(this.backupBlobContainerUri);
    }

    /**
     * The gateway details configured for the AS server.
     * 
     */
    @Import(name="gatewayDetails")
    private @Nullable Output<GatewayDetailsArgs> gatewayDetails;

    /**
     * @return The gateway details configured for the AS server.
     * 
     */
    public Optional<Output<GatewayDetailsArgs>> gatewayDetails() {
        return Optional.ofNullable(this.gatewayDetails);
    }

    /**
     * The firewall settings for the AS server.
     * 
     */
    @Import(name="ipV4FirewallSettings")
    private @Nullable Output<IPv4FirewallSettingsArgs> ipV4FirewallSettings;

    /**
     * @return The firewall settings for the AS server.
     * 
     */
    public Optional<Output<IPv4FirewallSettingsArgs>> ipV4FirewallSettings() {
        return Optional.ofNullable(this.ipV4FirewallSettings);
    }

    /**
     * Location of the Analysis Services resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location of the Analysis Services resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The managed mode of the server (0 = not managed, 1 = managed).
     * 
     */
    @Import(name="managedMode")
    private @Nullable Output<Integer> managedMode;

    /**
     * @return The managed mode of the server (0 = not managed, 1 = managed).
     * 
     */
    public Optional<Output<Integer>> managedMode() {
        return Optional.ofNullable(this.managedMode);
    }

    /**
     * How the read-write server&#39;s participation in the query pool is controlled.&lt;br/&gt;It can have the following values: &lt;ul&gt;&lt;li&gt;readOnly - indicates that the read-write server is intended not to participate in query operations&lt;/li&gt;&lt;li&gt;all - indicates that the read-write server can participate in query operations&lt;/li&gt;&lt;/ul&gt;Specifying readOnly when capacity is 1 results in error.
     * 
     */
    @Import(name="querypoolConnectionMode")
    private @Nullable Output<ConnectionMode> querypoolConnectionMode;

    /**
     * @return How the read-write server&#39;s participation in the query pool is controlled.&lt;br/&gt;It can have the following values: &lt;ul&gt;&lt;li&gt;readOnly - indicates that the read-write server is intended not to participate in query operations&lt;/li&gt;&lt;li&gt;all - indicates that the read-write server can participate in query operations&lt;/li&gt;&lt;/ul&gt;Specifying readOnly when capacity is 1 results in error.
     * 
     */
    public Optional<Output<ConnectionMode>> querypoolConnectionMode() {
        return Optional.ofNullable(this.querypoolConnectionMode);
    }

    /**
     * The name of the Azure Resource group of which a given Analysis Services server is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Azure Resource group of which a given Analysis Services server is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The server monitor mode for AS server
     * 
     */
    @Import(name="serverMonitorMode")
    private @Nullable Output<Integer> serverMonitorMode;

    /**
     * @return The server monitor mode for AS server
     * 
     */
    public Optional<Output<Integer>> serverMonitorMode() {
        return Optional.ofNullable(this.serverMonitorMode);
    }

    /**
     * The name of the Analysis Services server. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    @Import(name="serverName")
    private @Nullable Output<String> serverName;

    /**
     * @return The name of the Analysis Services server. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    public Optional<Output<String>> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    /**
     * The SKU of the Analysis Services resource.
     * 
     */
    @Import(name="sku", required=true)
    private Output<ResourceSkuArgs> sku;

    /**
     * @return The SKU of the Analysis Services resource.
     * 
     */
    public Output<ResourceSkuArgs> sku() {
        return this.sku;
    }

    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value pairs of additional resource provisioning properties.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ServerDetailsArgs() {}

    private ServerDetailsArgs(ServerDetailsArgs $) {
        this.asAdministrators = $.asAdministrators;
        this.backupBlobContainerUri = $.backupBlobContainerUri;
        this.gatewayDetails = $.gatewayDetails;
        this.ipV4FirewallSettings = $.ipV4FirewallSettings;
        this.location = $.location;
        this.managedMode = $.managedMode;
        this.querypoolConnectionMode = $.querypoolConnectionMode;
        this.resourceGroupName = $.resourceGroupName;
        this.serverMonitorMode = $.serverMonitorMode;
        this.serverName = $.serverName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerDetailsArgs $;

        public Builder() {
            $ = new ServerDetailsArgs();
        }

        public Builder(ServerDetailsArgs defaults) {
            $ = new ServerDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param asAdministrators A collection of AS server administrators
         * 
         * @return builder
         * 
         */
        public Builder asAdministrators(@Nullable Output<ServerAdministratorsArgs> asAdministrators) {
            $.asAdministrators = asAdministrators;
            return this;
        }

        /**
         * @param asAdministrators A collection of AS server administrators
         * 
         * @return builder
         * 
         */
        public Builder asAdministrators(ServerAdministratorsArgs asAdministrators) {
            return asAdministrators(Output.of(asAdministrators));
        }

        /**
         * @param backupBlobContainerUri The SAS container URI to the backup container.
         * 
         * @return builder
         * 
         */
        public Builder backupBlobContainerUri(@Nullable Output<String> backupBlobContainerUri) {
            $.backupBlobContainerUri = backupBlobContainerUri;
            return this;
        }

        /**
         * @param backupBlobContainerUri The SAS container URI to the backup container.
         * 
         * @return builder
         * 
         */
        public Builder backupBlobContainerUri(String backupBlobContainerUri) {
            return backupBlobContainerUri(Output.of(backupBlobContainerUri));
        }

        /**
         * @param gatewayDetails The gateway details configured for the AS server.
         * 
         * @return builder
         * 
         */
        public Builder gatewayDetails(@Nullable Output<GatewayDetailsArgs> gatewayDetails) {
            $.gatewayDetails = gatewayDetails;
            return this;
        }

        /**
         * @param gatewayDetails The gateway details configured for the AS server.
         * 
         * @return builder
         * 
         */
        public Builder gatewayDetails(GatewayDetailsArgs gatewayDetails) {
            return gatewayDetails(Output.of(gatewayDetails));
        }

        /**
         * @param ipV4FirewallSettings The firewall settings for the AS server.
         * 
         * @return builder
         * 
         */
        public Builder ipV4FirewallSettings(@Nullable Output<IPv4FirewallSettingsArgs> ipV4FirewallSettings) {
            $.ipV4FirewallSettings = ipV4FirewallSettings;
            return this;
        }

        /**
         * @param ipV4FirewallSettings The firewall settings for the AS server.
         * 
         * @return builder
         * 
         */
        public Builder ipV4FirewallSettings(IPv4FirewallSettingsArgs ipV4FirewallSettings) {
            return ipV4FirewallSettings(Output.of(ipV4FirewallSettings));
        }

        /**
         * @param location Location of the Analysis Services resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of the Analysis Services resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedMode The managed mode of the server (0 = not managed, 1 = managed).
         * 
         * @return builder
         * 
         */
        public Builder managedMode(@Nullable Output<Integer> managedMode) {
            $.managedMode = managedMode;
            return this;
        }

        /**
         * @param managedMode The managed mode of the server (0 = not managed, 1 = managed).
         * 
         * @return builder
         * 
         */
        public Builder managedMode(Integer managedMode) {
            return managedMode(Output.of(managedMode));
        }

        /**
         * @param querypoolConnectionMode How the read-write server&#39;s participation in the query pool is controlled.&lt;br/&gt;It can have the following values: &lt;ul&gt;&lt;li&gt;readOnly - indicates that the read-write server is intended not to participate in query operations&lt;/li&gt;&lt;li&gt;all - indicates that the read-write server can participate in query operations&lt;/li&gt;&lt;/ul&gt;Specifying readOnly when capacity is 1 results in error.
         * 
         * @return builder
         * 
         */
        public Builder querypoolConnectionMode(@Nullable Output<ConnectionMode> querypoolConnectionMode) {
            $.querypoolConnectionMode = querypoolConnectionMode;
            return this;
        }

        /**
         * @param querypoolConnectionMode How the read-write server&#39;s participation in the query pool is controlled.&lt;br/&gt;It can have the following values: &lt;ul&gt;&lt;li&gt;readOnly - indicates that the read-write server is intended not to participate in query operations&lt;/li&gt;&lt;li&gt;all - indicates that the read-write server can participate in query operations&lt;/li&gt;&lt;/ul&gt;Specifying readOnly when capacity is 1 results in error.
         * 
         * @return builder
         * 
         */
        public Builder querypoolConnectionMode(ConnectionMode querypoolConnectionMode) {
            return querypoolConnectionMode(Output.of(querypoolConnectionMode));
        }

        /**
         * @param resourceGroupName The name of the Azure Resource group of which a given Analysis Services server is part. This name must be at least 1 character in length, and no more than 90.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Azure Resource group of which a given Analysis Services server is part. This name must be at least 1 character in length, and no more than 90.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverMonitorMode The server monitor mode for AS server
         * 
         * @return builder
         * 
         */
        public Builder serverMonitorMode(@Nullable Output<Integer> serverMonitorMode) {
            $.serverMonitorMode = serverMonitorMode;
            return this;
        }

        /**
         * @param serverMonitorMode The server monitor mode for AS server
         * 
         * @return builder
         * 
         */
        public Builder serverMonitorMode(Integer serverMonitorMode) {
            return serverMonitorMode(Output.of(serverMonitorMode));
        }

        /**
         * @param serverName The name of the Analysis Services server. It must be a minimum of 3 characters, and a maximum of 63.
         * 
         * @return builder
         * 
         */
        public Builder serverName(@Nullable Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the Analysis Services server. It must be a minimum of 3 characters, and a maximum of 63.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param sku The SKU of the Analysis Services resource.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<ResourceSkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU of the Analysis Services resource.
         * 
         * @return builder
         * 
         */
        public Builder sku(ResourceSkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags Key-value pairs of additional resource provisioning properties.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value pairs of additional resource provisioning properties.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ServerDetailsArgs build() {
            $.managedMode = Codegen.integerProp("managedMode").output().arg($.managedMode).def(1).getNullable();
            $.querypoolConnectionMode = Codegen.objectProp("querypoolConnectionMode", ConnectionMode.class).output().arg($.querypoolConnectionMode).def(ConnectionMode.All).getNullable();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverMonitorMode = Codegen.integerProp("serverMonitorMode").output().arg($.serverMonitorMode).def(1).getNullable();
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
