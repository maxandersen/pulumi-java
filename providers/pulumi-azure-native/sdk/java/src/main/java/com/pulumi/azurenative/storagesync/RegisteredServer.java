// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.storagesync.RegisteredServerArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Registered Server resource.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storagesync:RegisteredServer ankushb-prod3.redmond.corp.microsoft.com /subscriptions/52b8da2f-61e0-4a1f-8dde-336911f367fb/resourceGroups/SampleResourceGroup_1/providers/Microsoft.StorageSync/storageSyncServices/SampleStorageSyncService_1/registeredServers/530a0384-50ac-456d-8240-9d6621404151 
 * ```
 * 
 */
@ResourceType(type="azure-native:storagesync:RegisteredServer")
public class RegisteredServer extends com.pulumi.resources.CustomResource {
    /**
     * Registered Server Agent Version
     * 
     */
    @Export(name="agentVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> agentVersion;

    /**
     * @return Registered Server Agent Version
     * 
     */
    public Output</* @Nullable */ String> agentVersion() {
        return this.agentVersion;
    }
    /**
     * Registered Server Agent Version Expiration Date
     * 
     */
    @Export(name="agentVersionExpirationDate", type=String.class, parameters={})
    private Output<String> agentVersionExpirationDate;

    /**
     * @return Registered Server Agent Version Expiration Date
     * 
     */
    public Output<String> agentVersionExpirationDate() {
        return this.agentVersionExpirationDate;
    }
    /**
     * Registered Server Agent Version Status
     * 
     */
    @Export(name="agentVersionStatus", type=String.class, parameters={})
    private Output<String> agentVersionStatus;

    /**
     * @return Registered Server Agent Version Status
     * 
     */
    public Output<String> agentVersionStatus() {
        return this.agentVersionStatus;
    }
    /**
     * Registered Server clusterId
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterId;

    /**
     * @return Registered Server clusterId
     * 
     */
    public Output</* @Nullable */ String> clusterId() {
        return this.clusterId;
    }
    /**
     * Registered Server clusterName
     * 
     */
    @Export(name="clusterName", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterName;

    /**
     * @return Registered Server clusterName
     * 
     */
    public Output</* @Nullable */ String> clusterName() {
        return this.clusterName;
    }
    /**
     * Resource discoveryEndpointUri
     * 
     */
    @Export(name="discoveryEndpointUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> discoveryEndpointUri;

    /**
     * @return Resource discoveryEndpointUri
     * 
     */
    public Output</* @Nullable */ String> discoveryEndpointUri() {
        return this.discoveryEndpointUri;
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
    public Output</* @Nullable */ String> friendlyName() {
        return this.friendlyName;
    }
    /**
     * Registered Server last heart beat
     * 
     */
    @Export(name="lastHeartBeat", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastHeartBeat;

    /**
     * @return Registered Server last heart beat
     * 
     */
    public Output</* @Nullable */ String> lastHeartBeat() {
        return this.lastHeartBeat;
    }
    /**
     * Resource Last Operation Name
     * 
     */
    @Export(name="lastOperationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastOperationName;

    /**
     * @return Resource Last Operation Name
     * 
     */
    public Output</* @Nullable */ String> lastOperationName() {
        return this.lastOperationName;
    }
    /**
     * Registered Server lastWorkflowId
     * 
     */
    @Export(name="lastWorkflowId", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastWorkflowId;

    /**
     * @return Registered Server lastWorkflowId
     * 
     */
    public Output</* @Nullable */ String> lastWorkflowId() {
        return this.lastWorkflowId;
    }
    /**
     * Management Endpoint Uri
     * 
     */
    @Export(name="managementEndpointUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> managementEndpointUri;

    /**
     * @return Management Endpoint Uri
     * 
     */
    public Output</* @Nullable */ String> managementEndpointUri() {
        return this.managementEndpointUri;
    }
    /**
     * Monitoring Configuration
     * 
     */
    @Export(name="monitoringConfiguration", type=String.class, parameters={})
    private Output</* @Nullable */ String> monitoringConfiguration;

    /**
     * @return Monitoring Configuration
     * 
     */
    public Output</* @Nullable */ String> monitoringConfiguration() {
        return this.monitoringConfiguration;
    }
    /**
     * Telemetry Endpoint Uri
     * 
     */
    @Export(name="monitoringEndpointUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> monitoringEndpointUri;

    /**
     * @return Telemetry Endpoint Uri
     * 
     */
    public Output</* @Nullable */ String> monitoringEndpointUri() {
        return this.monitoringEndpointUri;
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
     * Registered Server Provisioning State
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Registered Server Provisioning State
     * 
     */
    public Output</* @Nullable */ String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource Location
     * 
     */
    @Export(name="resourceLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceLocation;

    /**
     * @return Resource Location
     * 
     */
    public Output</* @Nullable */ String> resourceLocation() {
        return this.resourceLocation;
    }
    /**
     * Registered Server Certificate
     * 
     */
    @Export(name="serverCertificate", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverCertificate;

    /**
     * @return Registered Server Certificate
     * 
     */
    public Output</* @Nullable */ String> serverCertificate() {
        return this.serverCertificate;
    }
    /**
     * Registered Server serverId
     * 
     */
    @Export(name="serverId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverId;

    /**
     * @return Registered Server serverId
     * 
     */
    public Output</* @Nullable */ String> serverId() {
        return this.serverId;
    }
    /**
     * Registered Server Management Error Code
     * 
     */
    @Export(name="serverManagementErrorCode", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> serverManagementErrorCode;

    /**
     * @return Registered Server Management Error Code
     * 
     */
    public Output</* @Nullable */ Integer> serverManagementErrorCode() {
        return this.serverManagementErrorCode;
    }
    /**
     * Registered Server OS Version
     * 
     */
    @Export(name="serverOSVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverOSVersion;

    /**
     * @return Registered Server OS Version
     * 
     */
    public Output</* @Nullable */ String> serverOSVersion() {
        return this.serverOSVersion;
    }
    /**
     * Registered Server serverRole
     * 
     */
    @Export(name="serverRole", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverRole;

    /**
     * @return Registered Server serverRole
     * 
     */
    public Output</* @Nullable */ String> serverRole() {
        return this.serverRole;
    }
    /**
     * Service Location
     * 
     */
    @Export(name="serviceLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceLocation;

    /**
     * @return Service Location
     * 
     */
    public Output</* @Nullable */ String> serviceLocation() {
        return this.serviceLocation;
    }
    /**
     * Registered Server storageSyncServiceUid
     * 
     */
    @Export(name="storageSyncServiceUid", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageSyncServiceUid;

    /**
     * @return Registered Server storageSyncServiceUid
     * 
     */
    public Output</* @Nullable */ String> storageSyncServiceUid() {
        return this.storageSyncServiceUid;
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
    public RegisteredServer(String name) {
        this(name, RegisteredServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegisteredServer(String name, RegisteredServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegisteredServer(String name, RegisteredServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagesync:RegisteredServer", name, args == null ? RegisteredServerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegisteredServer(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagesync:RegisteredServer", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storagesync/v20170605preview:RegisteredServer").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20180402:RegisteredServer").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20180701:RegisteredServer").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20181001:RegisteredServer").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20190201:RegisteredServer").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20190301:RegisteredServer").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20190601:RegisteredServer").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20191001:RegisteredServer").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20200301:RegisteredServer").build()),
                Output.of(Alias.builder().type("azure-native:storagesync/v20200901:RegisteredServer").build())
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
    public static RegisteredServer get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegisteredServer(name, id, options);
    }
}
