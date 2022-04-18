// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datashare.DataSetArgs;
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
 * A DataSet data transfer object.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:DataSet dataset1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/sourceAccount/shares/share1/dataSets/dataset1 
 * ```
 * 
 * @Deprecated
 * Please use one of the variants: ADLSGen1FileDataSet, ADLSGen1FolderDataSet, ADLSGen2FileDataSet, ADLSGen2FileSystemDataSet, ADLSGen2FolderDataSet, BlobContainerDataSet, BlobDataSet, BlobFolderDataSet, KustoClusterDataSet, KustoDatabaseDataSet, SqlDBTableDataSet, SqlDWTableDataSet, SynapseWorkspaceSqlPoolTableDataSet.
 * 
 */
@Deprecated /* Please use one of the variants: ADLSGen1FileDataSet, ADLSGen1FolderDataSet, ADLSGen2FileDataSet, ADLSGen2FileSystemDataSet, ADLSGen2FolderDataSet, BlobContainerDataSet, BlobDataSet, BlobFolderDataSet, KustoClusterDataSet, KustoDatabaseDataSet, SqlDBTableDataSet, SqlDWTableDataSet, SynapseWorkspaceSqlPoolTableDataSet. */
@ResourceType(type="azure-native:datashare:DataSet")
public class DataSet extends com.pulumi.resources.CustomResource {
    /**
     * Kind of data set.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set.
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
    public DataSet(String name) {
        this(name, DataSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataSet(String name, DataSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataSet(String name, DataSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:DataSet", name, args == null ? DataSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataSet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:DataSet", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datashare/v20181101preview:DataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20191101:DataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20200901:DataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20201001preview:DataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20210801:DataSet").build())
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
    public static DataSet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataSet(name, id, options);
    }
}
