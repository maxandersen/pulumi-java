// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datashare.KustoClusterDataSetArgs;
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
 * A kusto cluster data set.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:KustoClusterDataSet dataset1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/sourceAccount/shares/share1/dataSets/dataset1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:KustoClusterDataSet")
public class KustoClusterDataSet extends com.pulumi.resources.CustomResource {
    /**
     * Unique id for identifying a data set resource
     * 
     */
    @Export(name="dataSetId", type=String.class, parameters={})
    private Output<String> dataSetId;

    /**
     * @return Unique id for identifying a data set resource
     * 
     */
    public Output<String> dataSetId() {
        return this.dataSetId;
    }
    /**
     * Kind of data set.
     * Expected value is &#39;KustoCluster&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set.
     * Expected value is &#39;KustoCluster&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Resource id of the kusto cluster.
     * 
     */
    @Export(name="kustoClusterResourceId", type=String.class, parameters={})
    private Output<String> kustoClusterResourceId;

    /**
     * @return Resource id of the kusto cluster.
     * 
     */
    public Output<String> kustoClusterResourceId() {
        return this.kustoClusterResourceId;
    }
    /**
     * Location of the kusto cluster.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the kusto cluster.
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * Provisioning state of the kusto cluster data set.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the kusto cluster data set.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
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
    public KustoClusterDataSet(String name) {
        this(name, KustoClusterDataSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KustoClusterDataSet(String name, KustoClusterDataSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KustoClusterDataSet(String name, KustoClusterDataSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:KustoClusterDataSet", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private KustoClusterDataSet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:KustoClusterDataSet", name, null, makeResourceOptions(options, id));
    }

    private static KustoClusterDataSetArgs makeArgs(KustoClusterDataSetArgs args) {
        var builder = args == null ? KustoClusterDataSetArgs.builder() : KustoClusterDataSetArgs.builder(args);
        return builder
            .kind("KustoCluster")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datashare/v20181101preview:KustoClusterDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20191101:KustoClusterDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20200901:KustoClusterDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20201001preview:KustoClusterDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20210801:KustoClusterDataSet").build())
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
    public static KustoClusterDataSet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KustoClusterDataSet(name, id, options);
    }
}
