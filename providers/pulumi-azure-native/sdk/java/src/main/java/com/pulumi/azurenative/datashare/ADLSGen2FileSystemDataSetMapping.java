// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datashare.ADLSGen2FileSystemDataSetMappingArgs;
import com.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An ADLS Gen2 file system data set mapping.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:ADLSGen2FileSystemDataSetMapping datasetMappingName1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/consumerAccount/shareSubscriptions/ShareSubscription1/dataSetMappings/datasetMappingName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:ADLSGen2FileSystemDataSetMapping")
public class ADLSGen2FileSystemDataSetMapping extends com.pulumi.resources.CustomResource {
    /**
     * The id of the source data set.
     * 
     */
    @Export(name="dataSetId", type=String.class, parameters={})
    private Output<String> dataSetId;

    /**
     * @return The id of the source data set.
     * 
     */
    public Output<String> dataSetId() {
        return this.dataSetId;
    }
    /**
     * Gets the status of the data set mapping.
     * 
     */
    @Export(name="dataSetMappingStatus", type=String.class, parameters={})
    private Output<String> dataSetMappingStatus;

    /**
     * @return Gets the status of the data set mapping.
     * 
     */
    public Output<String> dataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    /**
     * The file system name.
     * 
     */
    @Export(name="fileSystem", type=String.class, parameters={})
    private Output<String> fileSystem;

    /**
     * @return The file system name.
     * 
     */
    public Output<String> fileSystem() {
        return this.fileSystem;
    }
    /**
     * Kind of data set mapping.
     * Expected value is &#39;AdlsGen2FileSystem&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set mapping.
     * Expected value is &#39;AdlsGen2FileSystem&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the azure resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provisioning state of the data set mapping.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the data set mapping.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource group of storage account.
     * 
     */
    @Export(name="resourceGroup", type=String.class, parameters={})
    private Output<String> resourceGroup;

    /**
     * @return Resource group of storage account.
     * 
     */
    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Storage account name of the source data set.
     * 
     */
    @Export(name="storageAccountName", type=String.class, parameters={})
    private Output<String> storageAccountName;

    /**
     * @return Storage account name of the source data set.
     * 
     */
    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }
    /**
     * Subscription id of storage account.
     * 
     */
    @Export(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return Subscription id of storage account.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System Data of the Azure resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the azure resource
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ADLSGen2FileSystemDataSetMapping(String name) {
        this(name, ADLSGen2FileSystemDataSetMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ADLSGen2FileSystemDataSetMapping(String name, ADLSGen2FileSystemDataSetMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ADLSGen2FileSystemDataSetMapping(String name, ADLSGen2FileSystemDataSetMappingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ADLSGen2FileSystemDataSetMapping", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private ADLSGen2FileSystemDataSetMapping(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ADLSGen2FileSystemDataSetMapping", name, null, makeResourceOptions(options, id));
    }

    private static ADLSGen2FileSystemDataSetMappingArgs makeArgs(ADLSGen2FileSystemDataSetMappingArgs args) {
        var builder = args == null ? ADLSGen2FileSystemDataSetMappingArgs.builder() : ADLSGen2FileSystemDataSetMappingArgs.builder(args);
        return builder
            .kind("AdlsGen2FileSystem")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datashare/v20181101preview:ADLSGen2FileSystemDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20191101:ADLSGen2FileSystemDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20200901:ADLSGen2FileSystemDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20201001preview:ADLSGen2FileSystemDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20210801:ADLSGen2FileSystemDataSetMapping").build())
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
    public static ADLSGen2FileSystemDataSetMapping get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ADLSGen2FileSystemDataSetMapping(name, id, options);
    }
}
