// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.synapse.KustoPoolAttachedDatabaseConfigurationArgs;
import com.pulumi.azurenative.synapse.outputs.SystemDataResponse;
import com.pulumi.azurenative.synapse.outputs.TableLevelSharingPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Class representing an attached database configuration.
 * API Version: 2021-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:synapse:KustoPoolAttachedDatabaseConfiguration KustoClusterRPTest4/attachedDatabaseConfigurations1 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Synapse/Workspaces/kustorptest/KustoPools/kustoclusterrptest4/attachedDatabaseConfigurations/attachedDatabaseConfigurations1 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:KustoPoolAttachedDatabaseConfiguration")
public class KustoPoolAttachedDatabaseConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The list of databases from the clusterResourceId which are currently attached to the kusto pool.
     * 
     */
    @Export(name="attachedDatabaseNames", type=List.class, parameters={String.class})
    private Output<List<String>> attachedDatabaseNames;

    /**
     * @return The list of databases from the clusterResourceId which are currently attached to the kusto pool.
     * 
     */
    public Output<List<String>> attachedDatabaseNames() {
        return this.attachedDatabaseNames;
    }
    /**
     * The name of the database which you would like to attach, use * if you want to follow all current and future databases.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return The name of the database which you would like to attach, use * if you want to follow all current and future databases.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    /**
     * The default principals modification kind
     * 
     */
    @Export(name="defaultPrincipalsModificationKind", type=String.class, parameters={})
    private Output<String> defaultPrincipalsModificationKind;

    /**
     * @return The default principals modification kind
     * 
     */
    public Output<String> defaultPrincipalsModificationKind() {
        return this.defaultPrincipalsModificationKind;
    }
    /**
     * The resource id of the kusto pool where the databases you would like to attach reside.
     * 
     */
    @Export(name="kustoPoolResourceId", type=String.class, parameters={})
    private Output<String> kustoPoolResourceId;

    /**
     * @return The resource id of the kusto pool where the databases you would like to attach reside.
     * 
     */
    public Output<String> kustoPoolResourceId() {
        return this.kustoPoolResourceId;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
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
     * The provisioned state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioned state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Table level sharing specifications
     * 
     */
    @Export(name="tableLevelSharingProperties", type=TableLevelSharingPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ TableLevelSharingPropertiesResponse> tableLevelSharingProperties;

    /**
     * @return Table level sharing specifications
     * 
     */
    public Output</* @Nullable */ TableLevelSharingPropertiesResponse> tableLevelSharingProperties() {
        return this.tableLevelSharingProperties;
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
    public KustoPoolAttachedDatabaseConfiguration(String name) {
        this(name, KustoPoolAttachedDatabaseConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KustoPoolAttachedDatabaseConfiguration(String name, KustoPoolAttachedDatabaseConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KustoPoolAttachedDatabaseConfiguration(String name, KustoPoolAttachedDatabaseConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:KustoPoolAttachedDatabaseConfiguration", name, args == null ? KustoPoolAttachedDatabaseConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KustoPoolAttachedDatabaseConfiguration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:KustoPoolAttachedDatabaseConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:synapse/v20210601preview:KustoPoolAttachedDatabaseConfiguration").build())
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
    public static KustoPoolAttachedDatabaseConfiguration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KustoPoolAttachedDatabaseConfiguration(name, id, options);
    }
}
