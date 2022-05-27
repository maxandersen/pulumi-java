// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datashare.ADLSGen1FolderDataSetArgs;
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
 * An ADLS Gen 1 folder data set.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * ### DataSets_Create
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var adlsGen1FolderDataSet = new ADLSGen1FolderDataSet(&#34;adlsGen1FolderDataSet&#34;, ADLSGen1FolderDataSetArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetName(&#34;Dataset1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareName(&#34;Share1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSets_KustoCluster_Create
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var adlsGen1FolderDataSet = new ADLSGen1FolderDataSet(&#34;adlsGen1FolderDataSet&#34;, ADLSGen1FolderDataSetArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetName(&#34;Dataset1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareName(&#34;Share1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSets_KustoDatabase_Create
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var adlsGen1FolderDataSet = new ADLSGen1FolderDataSet(&#34;adlsGen1FolderDataSet&#34;, ADLSGen1FolderDataSetArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetName(&#34;Dataset1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareName(&#34;Share1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSets_SqlDBTable_Create
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var adlsGen1FolderDataSet = new ADLSGen1FolderDataSet(&#34;adlsGen1FolderDataSet&#34;, ADLSGen1FolderDataSetArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetName(&#34;Dataset1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareName(&#34;Share1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSets_SqlDWTable_Create
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var adlsGen1FolderDataSet = new ADLSGen1FolderDataSet(&#34;adlsGen1FolderDataSet&#34;, ADLSGen1FolderDataSetArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetName(&#34;Dataset1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareName(&#34;Share1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSets_SynapseWorkspaceSqlPoolTable_Create
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var adlsGen1FolderDataSet = new ADLSGen1FolderDataSet(&#34;adlsGen1FolderDataSet&#34;, ADLSGen1FolderDataSetArgs.builder()        
 *             .accountName(&#34;sourceAccount&#34;)
 *             .dataSetName(&#34;dataset1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareName(&#34;share1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:ADLSGen1FolderDataSet dataset1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/sourceAccount/shares/share1/dataSets/dataset1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:ADLSGen1FolderDataSet")
public class ADLSGen1FolderDataSet extends com.pulumi.resources.CustomResource {
    /**
     * The ADLS account name.
     * 
     */
    @Export(name="accountName", type=String.class, parameters={})
    private Output<String> accountName;

    /**
     * @return The ADLS account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }
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
     * The folder path within the ADLS account.
     * 
     */
    @Export(name="folderPath", type=String.class, parameters={})
    private Output<String> folderPath;

    /**
     * @return The folder path within the ADLS account.
     * 
     */
    public Output<String> folderPath() {
        return this.folderPath;
    }
    /**
     * Kind of data set.
     * Expected value is &#39;AdlsGen1Folder&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set.
     * Expected value is &#39;AdlsGen1Folder&#39;.
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
     * Resource group of ADLS account.
     * 
     */
    @Export(name="resourceGroup", type=String.class, parameters={})
    private Output<String> resourceGroup;

    /**
     * @return Resource group of ADLS account.
     * 
     */
    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Subscription id of ADLS account.
     * 
     */
    @Export(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return Subscription id of ADLS account.
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
    public ADLSGen1FolderDataSet(String name) {
        this(name, ADLSGen1FolderDataSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ADLSGen1FolderDataSet(String name, ADLSGen1FolderDataSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ADLSGen1FolderDataSet(String name, ADLSGen1FolderDataSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ADLSGen1FolderDataSet", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private ADLSGen1FolderDataSet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ADLSGen1FolderDataSet", name, null, makeResourceOptions(options, id));
    }

    private static ADLSGen1FolderDataSetArgs makeArgs(ADLSGen1FolderDataSetArgs args) {
        var builder = args == null ? ADLSGen1FolderDataSetArgs.builder() : ADLSGen1FolderDataSetArgs.builder(args);
        return builder
            .kind("AdlsGen1Folder")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datashare/v20181101preview:ADLSGen1FolderDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20191101:ADLSGen1FolderDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20200901:ADLSGen1FolderDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20201001preview:ADLSGen1FolderDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20210801:ADLSGen1FolderDataSet").build())
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
    public static ADLSGen1FolderDataSet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ADLSGen1FolderDataSet(name, id, options);
    }
}
