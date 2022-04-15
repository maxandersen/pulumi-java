// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.netapp.VolumeArgs;
import io.pulumi.azurenative.netapp.outputs.MountTargetPropertiesResponse;
import io.pulumi.azurenative.netapp.outputs.VolumePropertiesResponseDataProtection;
import io.pulumi.azurenative.netapp.outputs.VolumePropertiesResponseExportPolicy;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Volume resource
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:netapp:Volume account1/pool1/volume1 /subscriptions/D633CC2E-722B-4AE1-B636-BBD9E4C60ED9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1/volumes/volume1 
 * ```
 * 
 */
@ResourceType(type="azure-native:netapp:Volume")
public class Volume extends io.pulumi.resources.CustomResource {
    /**
     * UUID v4 or resource identifier used to identify the Backup.
     * 
     */
    @Export(name="backupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> backupId;

    /**
     * @return UUID v4 or resource identifier used to identify the Backup.
     * 
     */
    public Output</* @Nullable */ String> backupId() {
        return this.backupId;
    }
    /**
     * Unique Baremetal Tenant Identifier.
     * 
     */
    @Export(name="baremetalTenantId", type=String.class, parameters={})
    private Output<String> baremetalTenantId;

    /**
     * @return Unique Baremetal Tenant Identifier.
     * 
     */
    public Output<String> baremetalTenantId() {
        return this.baremetalTenantId;
    }
    /**
     * A unique file path for the volume. Used when creating mount targets
     * 
     */
    @Export(name="creationToken", type=String.class, parameters={})
    private Output<String> creationToken;

    /**
     * @return A unique file path for the volume. Used when creating mount targets
     * 
     */
    public Output<String> creationToken() {
        return this.creationToken;
    }
    /**
     * DataProtection type volumes include an object containing details of the replication
     * 
     */
    @Export(name="dataProtection", type=VolumePropertiesResponseDataProtection.class, parameters={})
    private Output</* @Nullable */ VolumePropertiesResponseDataProtection> dataProtection;

    /**
     * @return DataProtection type volumes include an object containing details of the replication
     * 
     */
    public Output</* @Nullable */ VolumePropertiesResponseDataProtection> dataProtection() {
        return this.dataProtection;
    }
    /**
     * Encryption Key Source. Possible values are: 'Microsoft.NetApp'
     * 
     */
    @Export(name="encryptionKeySource", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryptionKeySource;

    /**
     * @return Encryption Key Source. Possible values are: 'Microsoft.NetApp'
     * 
     */
    public Output</* @Nullable */ String> encryptionKeySource() {
        return this.encryptionKeySource;
    }
    /**
     * Set of export policy rules
     * 
     */
    @Export(name="exportPolicy", type=VolumePropertiesResponseExportPolicy.class, parameters={})
    private Output</* @Nullable */ VolumePropertiesResponseExportPolicy> exportPolicy;

    /**
     * @return Set of export policy rules
     * 
     */
    public Output</* @Nullable */ VolumePropertiesResponseExportPolicy> exportPolicy() {
        return this.exportPolicy;
    }
    /**
     * Unique FileSystem Identifier.
     * 
     */
    @Export(name="fileSystemId", type=String.class, parameters={})
    private Output<String> fileSystemId;

    /**
     * @return Unique FileSystem Identifier.
     * 
     */
    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }
    /**
     * Restoring
     * 
     */
    @Export(name="isRestoring", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isRestoring;

    /**
     * @return Restoring
     * 
     */
    public Output</* @Nullable */ Boolean> isRestoring() {
        return this.isRestoring;
    }
    /**
     * Describe if a volume is KerberosEnabled. To be use with swagger version 2020-05-01 or later
     * 
     */
    @Export(name="kerberosEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> kerberosEnabled;

    /**
     * @return Describe if a volume is KerberosEnabled. To be use with swagger version 2020-05-01 or later
     * 
     */
    public Output</* @Nullable */ Boolean> kerberosEnabled() {
        return this.kerberosEnabled;
    }
    /**
     * Specifies whether LDAP is enabled or not for a given NFS volume.
     * 
     */
    @Export(name="ldapEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ldapEnabled;

    /**
     * @return Specifies whether LDAP is enabled or not for a given NFS volume.
     * 
     */
    public Output</* @Nullable */ Boolean> ldapEnabled() {
        return this.ldapEnabled;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * List of mount targets
     * 
     */
    @Export(name="mountTargets", type=List.class, parameters={MountTargetPropertiesResponse.class})
    private Output<List<MountTargetPropertiesResponse>> mountTargets;

    /**
     * @return List of mount targets
     * 
     */
    public Output<List<MountTargetPropertiesResponse>> mountTargets() {
        return this.mountTargets;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Set of protocol types, default NFSv3, CIFS for SMB protocol
     * 
     */
    @Export(name="protocolTypes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> protocolTypes;

    /**
     * @return Set of protocol types, default NFSv3, CIFS for SMB protocol
     * 
     */
    public Output</* @Nullable */ List<String>> protocolTypes() {
        return this.protocolTypes;
    }
    /**
     * Azure lifecycle management
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Azure lifecycle management
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The security style of volume, default unix, defaults to ntfs for dual protocol or CIFS protocol
     * 
     */
    @Export(name="securityStyle", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityStyle;

    /**
     * @return The security style of volume, default unix, defaults to ntfs for dual protocol or CIFS protocol
     * 
     */
    public Output</* @Nullable */ String> securityStyle() {
        return this.securityStyle;
    }
    /**
     * The service level of the file system
     * 
     */
    @Export(name="serviceLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceLevel;

    /**
     * @return The service level of the file system
     * 
     */
    public Output</* @Nullable */ String> serviceLevel() {
        return this.serviceLevel;
    }
    /**
     * Enables continuously available share property for smb volume. Only applicable for SMB volume
     * 
     */
    @Export(name="smbContinuouslyAvailable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> smbContinuouslyAvailable;

    /**
     * @return Enables continuously available share property for smb volume. Only applicable for SMB volume
     * 
     */
    public Output</* @Nullable */ Boolean> smbContinuouslyAvailable() {
        return this.smbContinuouslyAvailable;
    }
    /**
     * Enables encryption for in-flight smb3 data. Only applicable for SMB/DualProtocol volume. To be used with swagger version 2020-08-01 or later
     * 
     */
    @Export(name="smbEncryption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> smbEncryption;

    /**
     * @return Enables encryption for in-flight smb3 data. Only applicable for SMB/DualProtocol volume. To be used with swagger version 2020-08-01 or later
     * 
     */
    public Output</* @Nullable */ Boolean> smbEncryption() {
        return this.smbEncryption;
    }
    /**
     * If enabled (true) the volume will contain a read-only snapshot directory which provides access to each of the volume's snapshots (default to true).
     * 
     */
    @Export(name="snapshotDirectoryVisible", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> snapshotDirectoryVisible;

    /**
     * @return If enabled (true) the volume will contain a read-only snapshot directory which provides access to each of the volume's snapshots (default to true).
     * 
     */
    public Output</* @Nullable */ Boolean> snapshotDirectoryVisible() {
        return this.snapshotDirectoryVisible;
    }
    /**
     * UUID v4 or resource identifier used to identify the Snapshot.
     * 
     */
    @Export(name="snapshotId", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotId;

    /**
     * @return UUID v4 or resource identifier used to identify the Snapshot.
     * 
     */
    public Output</* @Nullable */ String> snapshotId() {
        return this.snapshotId;
    }
    /**
     * The Azure Resource URI for a delegated subnet. Must have the delegation Microsoft.NetApp/volumes
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The Azure Resource URI for a delegated subnet. Must have the delegation Microsoft.NetApp/volumes
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    @Export(name="throughputMibps", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> throughputMibps;

    public Output</* @Nullable */ Double> throughputMibps() {
        return this.throughputMibps;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     * 
     */
    @Export(name="usageThreshold", type=Double.class, parameters={})
    private Output<Double> usageThreshold;

    /**
     * @return Maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     * 
     */
    public Output<Double> usageThreshold() {
        return this.usageThreshold;
    }
    /**
     * What type of volume is this
     * 
     */
    @Export(name="volumeType", type=String.class, parameters={})
    private Output</* @Nullable */ String> volumeType;

    /**
     * @return What type of volume is this
     * 
     */
    public Output</* @Nullable */ String> volumeType() {
        return this.volumeType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Volume(String name) {
        this(name, VolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Volume(String name, VolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Volume(String name, VolumeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:Volume", name, args == null ? VolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Volume(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:Volume", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:netapp/v20170815:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20190501:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20190601:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20190701:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20190801:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20191001:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20191101:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200201:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200301:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200501:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200601:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200701:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200801:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200901:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20201101:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20201201:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210201:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210401:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210401preview:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210601:Volume").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210801:Volume").build())
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
    public static Volume get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Volume(name, id, options);
    }
}
