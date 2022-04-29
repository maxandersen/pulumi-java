// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.ManagedInstanceArgs;
import com.pulumi.azurenative.sql.outputs.ManagedInstanceExternalAdministratorResponse;
import com.pulumi.azurenative.sql.outputs.ManagedInstancePecPropertyResponse;
import com.pulumi.azurenative.sql.outputs.ResourceIdentityResponse;
import com.pulumi.azurenative.sql.outputs.SkuResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An Azure SQL managed instance.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ManagedInstance testinstance /subscriptions/20d7082a-0fc7-4468-82bd-542694d5042b/resourceGroups/testrg/providers/Microsoft.Sql/managedInstances/testinstance 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ManagedInstance")
public class ManagedInstance extends CustomResource {
    /**
     * Administrator username for the managed instance. Can only be specified when the managed instance is being created (and is required for creation).
     * 
     */
    @Export(name="administratorLogin", type=String.class, parameters={})
    private Output</* @Nullable */ String> administratorLogin;

    /**
     * @return Administrator username for the managed instance. Can only be specified when the managed instance is being created (and is required for creation).
     * 
     */
    public Output<Optional<String>> administratorLogin() {
        return Codegen.optional(this.administratorLogin);
    }
    /**
     * The Azure Active Directory administrator of the server.
     * 
     */
    @Export(name="administrators", type=ManagedInstanceExternalAdministratorResponse.class, parameters={})
    private Output</* @Nullable */ ManagedInstanceExternalAdministratorResponse> administrators;

    /**
     * @return The Azure Active Directory administrator of the server.
     * 
     */
    public Output<Optional<ManagedInstanceExternalAdministratorResponse>> administrators() {
        return Codegen.optional(this.administrators);
    }
    /**
     * Collation of the managed instance.
     * 
     */
    @Export(name="collation", type=String.class, parameters={})
    private Output</* @Nullable */ String> collation;

    /**
     * @return Collation of the managed instance.
     * 
     */
    public Output<Optional<String>> collation() {
        return Codegen.optional(this.collation);
    }
    /**
     * The Dns Zone that the managed instance is in.
     * 
     */
    @Export(name="dnsZone", type=String.class, parameters={})
    private Output<String> dnsZone;

    /**
     * @return The Dns Zone that the managed instance is in.
     * 
     */
    public Output<String> dnsZone() {
        return this.dnsZone;
    }
    /**
     * The fully qualified domain name of the managed instance.
     * 
     */
    @Export(name="fullyQualifiedDomainName", type=String.class, parameters={})
    private Output<String> fullyQualifiedDomainName;

    /**
     * @return The fully qualified domain name of the managed instance.
     * 
     */
    public Output<String> fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }
    /**
     * The Azure Active Directory identity of the managed instance.
     * 
     */
    @Export(name="identity", type=ResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ResourceIdentityResponse> identity;

    /**
     * @return The Azure Active Directory identity of the managed instance.
     * 
     */
    public Output<Optional<ResourceIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The Id of the instance pool this managed server belongs to.
     * 
     */
    @Export(name="instancePoolId", type=String.class, parameters={})
    private Output</* @Nullable */ String> instancePoolId;

    /**
     * @return The Id of the instance pool this managed server belongs to.
     * 
     */
    public Output<Optional<String>> instancePoolId() {
        return Codegen.optional(this.instancePoolId);
    }
    /**
     * A CMK URI of the key to use for encryption.
     * 
     */
    @Export(name="keyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyId;

    /**
     * @return A CMK URI of the key to use for encryption.
     * 
     */
    public Output<Optional<String>> keyId() {
        return Codegen.optional(this.keyId);
    }
    /**
     * The license type. Possible values are &#39;LicenseIncluded&#39; (regular price inclusive of a new SQL license) and &#39;BasePrice&#39; (discounted AHB price for bringing your own SQL licenses).
     * 
     */
    @Export(name="licenseType", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseType;

    /**
     * @return The license type. Possible values are &#39;LicenseIncluded&#39; (regular price inclusive of a new SQL license) and &#39;BasePrice&#39; (discounted AHB price for bringing your own SQL licenses).
     * 
     */
    public Output<Optional<String>> licenseType() {
        return Codegen.optional(this.licenseType);
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies maintenance configuration id to apply to this managed instance.
     * 
     */
    @Export(name="maintenanceConfigurationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> maintenanceConfigurationId;

    /**
     * @return Specifies maintenance configuration id to apply to this managed instance.
     * 
     */
    public Output<Optional<String>> maintenanceConfigurationId() {
        return Codegen.optional(this.maintenanceConfigurationId);
    }
    /**
     * Minimal TLS version. Allowed values: &#39;None&#39;, &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;
     * 
     */
    @Export(name="minimalTlsVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> minimalTlsVersion;

    /**
     * @return Minimal TLS version. Allowed values: &#39;None&#39;, &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;
     * 
     */
    public Output<Optional<String>> minimalTlsVersion() {
        return Codegen.optional(this.minimalTlsVersion);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The resource id of a user assigned identity to be used by default.
     * 
     */
    @Export(name="primaryUserAssignedIdentityId", type=String.class, parameters={})
    private Output</* @Nullable */ String> primaryUserAssignedIdentityId;

    /**
     * @return The resource id of a user assigned identity to be used by default.
     * 
     */
    public Output<Optional<String>> primaryUserAssignedIdentityId() {
        return Codegen.optional(this.primaryUserAssignedIdentityId);
    }
    /**
     * List of private endpoint connections on a managed instance.
     * 
     */
    @Export(name="privateEndpointConnections", type=List.class, parameters={ManagedInstancePecPropertyResponse.class})
    private Output<List<ManagedInstancePecPropertyResponse>> privateEndpointConnections;

    /**
     * @return List of private endpoint connections on a managed instance.
     * 
     */
    public Output<List<ManagedInstancePecPropertyResponse>> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Connection type used for connecting to the instance.
     * 
     */
    @Export(name="proxyOverride", type=String.class, parameters={})
    private Output</* @Nullable */ String> proxyOverride;

    /**
     * @return Connection type used for connecting to the instance.
     * 
     */
    public Output<Optional<String>> proxyOverride() {
        return Codegen.optional(this.proxyOverride);
    }
    /**
     * Whether or not the public data endpoint is enabled.
     * 
     */
    @Export(name="publicDataEndpointEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publicDataEndpointEnabled;

    /**
     * @return Whether or not the public data endpoint is enabled.
     * 
     */
    public Output<Optional<Boolean>> publicDataEndpointEnabled() {
        return Codegen.optional(this.publicDataEndpointEnabled);
    }
    /**
     * Managed instance SKU. Allowed values for sku.name: GP_Gen4, GP_Gen5, BC_Gen4, BC_Gen5
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return Managed instance SKU. Allowed values for sku.name: GP_Gen4, GP_Gen5, BC_Gen4, BC_Gen5
     * 
     */
    public Output<Optional<SkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * The state of the managed instance.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the managed instance.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The storage account type used to store backups for this instance. The options are LRS (LocallyRedundantStorage), ZRS (ZoneRedundantStorage) and GRS (GeoRedundantStorage)
     * 
     */
    @Export(name="storageAccountType", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountType;

    /**
     * @return The storage account type used to store backups for this instance. The options are LRS (LocallyRedundantStorage), ZRS (ZoneRedundantStorage) and GRS (GeoRedundantStorage)
     * 
     */
    public Output<Optional<String>> storageAccountType() {
        return Codegen.optional(this.storageAccountType);
    }
    /**
     * Storage size in GB. Minimum value: 32. Maximum value: 8192. Increments of 32 GB allowed only.
     * 
     */
    @Export(name="storageSizeInGB", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> storageSizeInGB;

    /**
     * @return Storage size in GB. Minimum value: 32. Maximum value: 8192. Increments of 32 GB allowed only.
     * 
     */
    public Output<Optional<Integer>> storageSizeInGB() {
        return Codegen.optional(this.storageSizeInGB);
    }
    /**
     * Subnet resource ID for the managed instance.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> subnetId;

    /**
     * @return Subnet resource ID for the managed instance.
     * 
     */
    public Output<Optional<String>> subnetId() {
        return Codegen.optional(this.subnetId);
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
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Id of the timezone. Allowed values are timezones supported by Windows.
     * Windows keeps details on supported timezones, including the id, in registry under
     * KEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Time Zones.
     * You can get those registry values via SQL Server by querying SELECT name AS timezone_id FROM sys.time_zone_info.
     * List of Ids can also be obtained by executing [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell.
     * An example of valid timezone id is &#34;Pacific Standard Time&#34; or &#34;W. Europe Standard Time&#34;.
     * 
     */
    @Export(name="timezoneId", type=String.class, parameters={})
    private Output</* @Nullable */ String> timezoneId;

    /**
     * @return Id of the timezone. Allowed values are timezones supported by Windows.
     * Windows keeps details on supported timezones, including the id, in registry under
     * KEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Time Zones.
     * You can get those registry values via SQL Server by querying SELECT name AS timezone_id FROM sys.time_zone_info.
     * List of Ids can also be obtained by executing [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell.
     * An example of valid timezone id is &#34;Pacific Standard Time&#34; or &#34;W. Europe Standard Time&#34;.
     * 
     */
    public Output<Optional<String>> timezoneId() {
        return Codegen.optional(this.timezoneId);
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
     * The number of vCores. Allowed values: 8, 16, 24, 32, 40, 64, 80.
     * 
     */
    @Export(name="vCores", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> vCores;

    /**
     * @return The number of vCores. Allowed values: 8, 16, 24, 32, 40, 64, 80.
     * 
     */
    public Output<Optional<Integer>> vCores() {
        return Codegen.optional(this.vCores);
    }
    /**
     * Whether or not the multi-az is enabled.
     * 
     */
    @Export(name="zoneRedundant", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> zoneRedundant;

    /**
     * @return Whether or not the multi-az is enabled.
     * 
     */
    public Output<Optional<Boolean>> zoneRedundant() {
        return Codegen.optional(this.zoneRedundant);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedInstance(String name) {
        this(name, ManagedInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedInstance(String name, ManagedInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedInstance(String name, ManagedInstanceArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:sql:ManagedInstance", name, args == null ? ManagedInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedInstance(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:sql:ManagedInstance", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20150501preview:ManagedInstance").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20180601preview:ManagedInstance").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:ManagedInstance").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:ManagedInstance").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:ManagedInstance").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:ManagedInstance").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:ManagedInstance").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:ManagedInstance").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ManagedInstance get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ManagedInstance(name, id, options);
    }
}
