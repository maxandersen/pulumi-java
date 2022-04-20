// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.WebAppSlotArgs;
import com.pulumi.azurenative.web.outputs.HostNameSslStateResponse;
import com.pulumi.azurenative.web.outputs.HostingEnvironmentProfileResponse;
import com.pulumi.azurenative.web.outputs.ManagedServiceIdentityResponse;
import com.pulumi.azurenative.web.outputs.SiteConfigResponse;
import com.pulumi.azurenative.web.outputs.SlotSwapStatusResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A web app, a mobile app backend, or an API app.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppSlot myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppSlot")
public class WebAppSlot extends com.pulumi.resources.CustomResource {
    /**
     * Management information availability state for the app.
     * 
     */
    @Export(name="availabilityState", type=String.class, parameters={})
    private Output<String> availabilityState;

    /**
     * @return Management information availability state for the app.
     * 
     */
    public Output<String> availabilityState() {
        return this.availabilityState;
    }
    /**
     * &lt;code&gt;true&lt;/code&gt; to enable client affinity; &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    @Export(name="clientAffinityEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> clientAffinityEnabled;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to enable client affinity; &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    public Output</* @Nullable */ Boolean> clientAffinityEnabled() {
        return this.clientAffinityEnabled;
    }
    /**
     * &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Export(name="clientCertEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> clientCertEnabled;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Output</* @Nullable */ Boolean> clientCertEnabled() {
        return this.clientCertEnabled;
    }
    /**
     * client certificate authentication comma-separated exclusion paths
     * 
     */
    @Export(name="clientCertExclusionPaths", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientCertExclusionPaths;

    /**
     * @return client certificate authentication comma-separated exclusion paths
     * 
     */
    public Output</* @Nullable */ String> clientCertExclusionPaths() {
        return this.clientCertExclusionPaths;
    }
    /**
     * This composes with ClientCertEnabled setting.
     * - ClientCertEnabled: false means ClientCert is ignored.
     * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
     * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     * 
     */
    @Export(name="clientCertMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientCertMode;

    /**
     * @return This composes with ClientCertEnabled setting.
     * - ClientCertEnabled: false means ClientCert is ignored.
     * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
     * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     * 
     */
    public Output</* @Nullable */ String> clientCertMode() {
        return this.clientCertMode;
    }
    /**
     * Size of the function container.
     * 
     */
    @Export(name="containerSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> containerSize;

    /**
     * @return Size of the function container.
     * 
     */
    public Output</* @Nullable */ Integer> containerSize() {
        return this.containerSize;
    }
    /**
     * Unique identifier that verifies the custom domains assigned to the app. Customer will add this id to a txt record for verification.
     * 
     */
    @Export(name="customDomainVerificationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> customDomainVerificationId;

    /**
     * @return Unique identifier that verifies the custom domains assigned to the app. Customer will add this id to a txt record for verification.
     * 
     */
    public Output</* @Nullable */ String> customDomainVerificationId() {
        return this.customDomainVerificationId;
    }
    /**
     * Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     * 
     */
    @Export(name="dailyMemoryTimeQuota", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> dailyMemoryTimeQuota;

    /**
     * @return Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     * 
     */
    public Output</* @Nullable */ Integer> dailyMemoryTimeQuota() {
        return this.dailyMemoryTimeQuota;
    }
    /**
     * Default hostname of the app. Read-only.
     * 
     */
    @Export(name="defaultHostName", type=String.class, parameters={})
    private Output<String> defaultHostName;

    /**
     * @return Default hostname of the app. Read-only.
     * 
     */
    public Output<String> defaultHostName() {
        return this.defaultHostName;
    }
    /**
     * &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
     * 
     */
    public Output</* @Nullable */ Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Enabled hostnames for the app.Hostnames need to be assigned (see HostNames) AND enabled. Otherwise,
     * the app is not served on those hostnames.
     * 
     */
    @Export(name="enabledHostNames", type=List.class, parameters={String.class})
    private Output<List<String>> enabledHostNames;

    /**
     * @return Enabled hostnames for the app.Hostnames need to be assigned (see HostNames) AND enabled. Otherwise,
     * the app is not served on those hostnames.
     * 
     */
    public Output<List<String>> enabledHostNames() {
        return this.enabledHostNames;
    }
    /**
     * Hostname SSL states are used to manage the SSL bindings for app&#39;s hostnames.
     * 
     */
    @Export(name="hostNameSslStates", type=List.class, parameters={HostNameSslStateResponse.class})
    private Output</* @Nullable */ List<HostNameSslStateResponse>> hostNameSslStates;

    /**
     * @return Hostname SSL states are used to manage the SSL bindings for app&#39;s hostnames.
     * 
     */
    public Output</* @Nullable */ List<HostNameSslStateResponse>> hostNameSslStates() {
        return this.hostNameSslStates;
    }
    /**
     * Hostnames associated with the app.
     * 
     */
    @Export(name="hostNames", type=List.class, parameters={String.class})
    private Output<List<String>> hostNames;

    /**
     * @return Hostnames associated with the app.
     * 
     */
    public Output<List<String>> hostNames() {
        return this.hostNames;
    }
    /**
     * &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *  If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API management process.
     * 
     */
    @Export(name="hostNamesDisabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> hostNamesDisabled;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *  If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API management process.
     * 
     */
    public Output</* @Nullable */ Boolean> hostNamesDisabled() {
        return this.hostNamesDisabled;
    }
    /**
     * App Service Environment to use for the app.
     * 
     */
    @Export(name="hostingEnvironmentProfile", type=HostingEnvironmentProfileResponse.class, parameters={})
    private Output</* @Nullable */ HostingEnvironmentProfileResponse> hostingEnvironmentProfile;

    /**
     * @return App Service Environment to use for the app.
     * 
     */
    public Output</* @Nullable */ HostingEnvironmentProfileResponse> hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }
    /**
     * HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests
     * 
     */
    @Export(name="httpsOnly", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> httpsOnly;

    /**
     * @return HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests
     * 
     */
    public Output</* @Nullable */ Boolean> httpsOnly() {
        return this.httpsOnly;
    }
    /**
     * Hyper-V sandbox.
     * 
     */
    @Export(name="hyperV", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> hyperV;

    /**
     * @return Hyper-V sandbox.
     * 
     */
    public Output</* @Nullable */ Boolean> hyperV() {
        return this.hyperV;
    }
    /**
     * Managed service identity.
     * 
     */
    @Export(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return Managed service identity.
     * 
     */
    public Output</* @Nullable */ ManagedServiceIdentityResponse> identity() {
        return this.identity;
    }
    /**
     * Specifies an operation id if this site has a pending operation.
     * 
     */
    @Export(name="inProgressOperationId", type=String.class, parameters={})
    private Output<String> inProgressOperationId;

    /**
     * @return Specifies an operation id if this site has a pending operation.
     * 
     */
    public Output<String> inProgressOperationId() {
        return this.inProgressOperationId;
    }
    /**
     * &lt;code&gt;true&lt;/code&gt; if the app is a default container; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Export(name="isDefaultContainer", type=Boolean.class, parameters={})
    private Output<Boolean> isDefaultContainer;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; if the app is a default container; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Output<Boolean> isDefaultContainer() {
        return this.isDefaultContainer;
    }
    /**
     * Obsolete: Hyper-V sandbox.
     * 
     */
    @Export(name="isXenon", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isXenon;

    /**
     * @return Obsolete: Hyper-V sandbox.
     * 
     */
    public Output</* @Nullable */ Boolean> isXenon() {
        return this.isXenon;
    }
    /**
     * Identity to use for Key Vault Reference authentication.
     * 
     */
    @Export(name="keyVaultReferenceIdentity", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyVaultReferenceIdentity;

    /**
     * @return Identity to use for Key Vault Reference authentication.
     * 
     */
    public Output</* @Nullable */ String> keyVaultReferenceIdentity() {
        return this.keyVaultReferenceIdentity;
    }
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> kind() {
        return this.kind;
    }
    /**
     * Last time the app was modified, in UTC. Read-only.
     * 
     */
    @Export(name="lastModifiedTimeUtc", type=String.class, parameters={})
    private Output<String> lastModifiedTimeUtc;

    /**
     * @return Last time the app was modified, in UTC. Read-only.
     * 
     */
    public Output<String> lastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }
    /**
     * Resource Location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Maximum number of workers.
     * This only applies to Functions container.
     * 
     */
    @Export(name="maxNumberOfWorkers", type=Integer.class, parameters={})
    private Output<Integer> maxNumberOfWorkers;

    /**
     * @return Maximum number of workers.
     * This only applies to Functions container.
     * 
     */
    public Output<Integer> maxNumberOfWorkers() {
        return this.maxNumberOfWorkers;
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from tenants that site can be hosted with current settings. Read-only.
     * 
     */
    @Export(name="outboundIpAddresses", type=String.class, parameters={})
    private Output<String> outboundIpAddresses;

    /**
     * @return List of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from tenants that site can be hosted with current settings. Read-only.
     * 
     */
    public Output<String> outboundIpAddresses() {
        return this.outboundIpAddresses;
    }
    /**
     * List of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from all tenants except dataComponent. Read-only.
     * 
     */
    @Export(name="possibleOutboundIpAddresses", type=String.class, parameters={})
    private Output<String> possibleOutboundIpAddresses;

    /**
     * @return List of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from all tenants except dataComponent. Read-only.
     * 
     */
    public Output<String> possibleOutboundIpAddresses() {
        return this.possibleOutboundIpAddresses;
    }
    /**
     * Site redundancy mode
     * 
     */
    @Export(name="redundancyMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> redundancyMode;

    /**
     * @return Site redundancy mode
     * 
     */
    public Output</* @Nullable */ String> redundancyMode() {
        return this.redundancyMode;
    }
    /**
     * Name of the repository site.
     * 
     */
    @Export(name="repositorySiteName", type=String.class, parameters={})
    private Output<String> repositorySiteName;

    /**
     * @return Name of the repository site.
     * 
     */
    public Output<String> repositorySiteName() {
        return this.repositorySiteName;
    }
    /**
     * &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Export(name="reserved", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> reserved;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Output</* @Nullable */ Boolean> reserved() {
        return this.reserved;
    }
    /**
     * Name of the resource group the app belongs to. Read-only.
     * 
     */
    @Export(name="resourceGroup", type=String.class, parameters={})
    private Output<String> resourceGroup;

    /**
     * @return Name of the resource group the app belongs to. Read-only.
     * 
     */
    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Export(name="scmSiteAlsoStopped", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> scmSiteAlsoStopped;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Output</* @Nullable */ Boolean> scmSiteAlsoStopped() {
        return this.scmSiteAlsoStopped;
    }
    /**
     * Resource ID of the associated App Service plan, formatted as: &#34;/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}&#34;.
     * 
     */
    @Export(name="serverFarmId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverFarmId;

    /**
     * @return Resource ID of the associated App Service plan, formatted as: &#34;/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}&#34;.
     * 
     */
    public Output</* @Nullable */ String> serverFarmId() {
        return this.serverFarmId;
    }
    /**
     * Configuration of the app.
     * 
     */
    @Export(name="siteConfig", type=SiteConfigResponse.class, parameters={})
    private Output</* @Nullable */ SiteConfigResponse> siteConfig;

    /**
     * @return Configuration of the app.
     * 
     */
    public Output</* @Nullable */ SiteConfigResponse> siteConfig() {
        return this.siteConfig;
    }
    /**
     * Status of the last deployment slot swap operation.
     * 
     */
    @Export(name="slotSwapStatus", type=SlotSwapStatusResponse.class, parameters={})
    private Output<SlotSwapStatusResponse> slotSwapStatus;

    /**
     * @return Status of the last deployment slot swap operation.
     * 
     */
    public Output<SlotSwapStatusResponse> slotSwapStatus() {
        return this.slotSwapStatus;
    }
    /**
     * Current state of the app.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Current state of the app.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Checks if Customer provided storage account is required
     * 
     */
    @Export(name="storageAccountRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> storageAccountRequired;

    /**
     * @return Checks if Customer provided storage account is required
     * 
     */
    public Output</* @Nullable */ Boolean> storageAccountRequired() {
        return this.storageAccountRequired;
    }
    /**
     * App suspended till in case memory-time quota is exceeded.
     * 
     */
    @Export(name="suspendedTill", type=String.class, parameters={})
    private Output<String> suspendedTill;

    /**
     * @return App suspended till in case memory-time quota is exceeded.
     * 
     */
    public Output<String> suspendedTill() {
        return this.suspendedTill;
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
     * Specifies which deployment slot this app will swap into. Read-only.
     * 
     */
    @Export(name="targetSwapSlot", type=String.class, parameters={})
    private Output<String> targetSwapSlot;

    /**
     * @return Specifies which deployment slot this app will swap into. Read-only.
     * 
     */
    public Output<String> targetSwapSlot() {
        return this.targetSwapSlot;
    }
    /**
     * Azure Traffic Manager hostnames associated with the app. Read-only.
     * 
     */
    @Export(name="trafficManagerHostNames", type=List.class, parameters={String.class})
    private Output<List<String>> trafficManagerHostNames;

    /**
     * @return Azure Traffic Manager hostnames associated with the app. Read-only.
     * 
     */
    public Output<List<String>> trafficManagerHostNames() {
        return this.trafficManagerHostNames;
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
     * State indicating whether the app has exceeded its quota usage. Read-only.
     * 
     */
    @Export(name="usageState", type=String.class, parameters={})
    private Output<String> usageState;

    /**
     * @return State indicating whether the app has exceeded its quota usage. Read-only.
     * 
     */
    public Output<String> usageState() {
        return this.usageState;
    }
    /**
     * Azure Resource Manager ID of the Virtual network and subnet to be joined by Regional VNET Integration.
     * This must be of the form /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}
     * 
     */
    @Export(name="virtualNetworkSubnetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> virtualNetworkSubnetId;

    /**
     * @return Azure Resource Manager ID of the Virtual network and subnet to be joined by Regional VNET Integration.
     * This must be of the form /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}
     * 
     */
    public Output</* @Nullable */ String> virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppSlot(String name) {
        this(name, WebAppSlotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppSlot(String name, WebAppSlotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppSlot(String name, WebAppSlotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSlot", name, args == null ? WebAppSlotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppSlot(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSlot", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20150801:WebAppSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppSlot").build())
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
    public static WebAppSlot get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppSlot(name, id, options);
    }
}
