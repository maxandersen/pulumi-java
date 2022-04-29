// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.databoxedge.ShareArgs;
import com.pulumi.azurenative.databoxedge.outputs.AzureContainerInfoResponse;
import com.pulumi.azurenative.databoxedge.outputs.ClientAccessRightResponse;
import com.pulumi.azurenative.databoxedge.outputs.MountPointMapResponse;
import com.pulumi.azurenative.databoxedge.outputs.RefreshDetailsResponse;
import com.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import com.pulumi.azurenative.databoxedge.outputs.UserAccessRightResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a share on the  Data Box Edge/Gateway device.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:databoxedge:Share smbshare /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/testedgedevice/shares/smbshare 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:Share")
public class Share extends CustomResource {
    /**
     * Access protocol to be used by the share.
     * 
     */
    @Export(name="accessProtocol", type=String.class, parameters={})
    private Output<String> accessProtocol;

    /**
     * @return Access protocol to be used by the share.
     * 
     */
    public Output<String> accessProtocol() {
        return this.accessProtocol;
    }
    /**
     * Azure container mapping for the share.
     * 
     */
    @Export(name="azureContainerInfo", type=AzureContainerInfoResponse.class, parameters={})
    private Output</* @Nullable */ AzureContainerInfoResponse> azureContainerInfo;

    /**
     * @return Azure container mapping for the share.
     * 
     */
    public Output<Optional<AzureContainerInfoResponse>> azureContainerInfo() {
        return Codegen.optional(this.azureContainerInfo);
    }
    /**
     * List of IP addresses and corresponding access rights on the share(required for NFS protocol).
     * 
     */
    @Export(name="clientAccessRights", type=List.class, parameters={ClientAccessRightResponse.class})
    private Output</* @Nullable */ List<ClientAccessRightResponse>> clientAccessRights;

    /**
     * @return List of IP addresses and corresponding access rights on the share(required for NFS protocol).
     * 
     */
    public Output<Optional<List<ClientAccessRightResponse>>> clientAccessRights() {
        return Codegen.optional(this.clientAccessRights);
    }
    /**
     * Data policy of the share.
     * 
     */
    @Export(name="dataPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataPolicy;

    /**
     * @return Data policy of the share.
     * 
     */
    public Output<Optional<String>> dataPolicy() {
        return Codegen.optional(this.dataPolicy);
    }
    /**
     * Description for the share.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description for the share.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Current monitoring status of the share.
     * 
     */
    @Export(name="monitoringStatus", type=String.class, parameters={})
    private Output<String> monitoringStatus;

    /**
     * @return Current monitoring status of the share.
     * 
     */
    public Output<String> monitoringStatus() {
        return this.monitoringStatus;
    }
    /**
     * The object name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Details of the refresh job on this share.
     * 
     */
    @Export(name="refreshDetails", type=RefreshDetailsResponse.class, parameters={})
    private Output</* @Nullable */ RefreshDetailsResponse> refreshDetails;

    /**
     * @return Details of the refresh job on this share.
     * 
     */
    public Output<Optional<RefreshDetailsResponse>> refreshDetails() {
        return Codegen.optional(this.refreshDetails);
    }
    /**
     * Share mount point to the role.
     * 
     */
    @Export(name="shareMappings", type=List.class, parameters={MountPointMapResponse.class})
    private Output<List<MountPointMapResponse>> shareMappings;

    /**
     * @return Share mount point to the role.
     * 
     */
    public Output<List<MountPointMapResponse>> shareMappings() {
        return this.shareMappings;
    }
    /**
     * Current status of the share.
     * 
     */
    @Export(name="shareStatus", type=String.class, parameters={})
    private Output<String> shareStatus;

    /**
     * @return Current status of the share.
     * 
     */
    public Output<String> shareStatus() {
        return this.shareStatus;
    }
    /**
     * Share on ASE device
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Share on ASE device
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Mapping of users and corresponding access rights on the share (required for SMB protocol).
     * 
     */
    @Export(name="userAccessRights", type=List.class, parameters={UserAccessRightResponse.class})
    private Output</* @Nullable */ List<UserAccessRightResponse>> userAccessRights;

    /**
     * @return Mapping of users and corresponding access rights on the share (required for SMB protocol).
     * 
     */
    public Output<Optional<List<UserAccessRightResponse>>> userAccessRights() {
        return Codegen.optional(this.userAccessRights);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Share(String name) {
        this(name, ShareArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Share(String name, ShareArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Share(String name, ShareArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:databoxedge:Share", name, args == null ? ShareArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Share(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:databoxedge:Share", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190301:Share").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190701:Share").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190801:Share").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200501preview:Share").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200901:Share").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200901preview:Share").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20201201:Share").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210201:Share").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210201preview:Share").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210601:Share").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210601preview:Share").build())
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
    public static Share get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Share(name, id, options);
    }
}
