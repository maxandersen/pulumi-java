// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lakeformation.DataLakeSettingsArgs;
import com.pulumi.aws.lakeformation.inputs.DataLakeSettingsState;
import com.pulumi.aws.lakeformation.outputs.DataLakeSettingsCreateDatabaseDefaultPermission;
import com.pulumi.aws.lakeformation.outputs.DataLakeSettingsCreateTableDefaultPermission;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions.
 * 
 * &gt; **NOTE:** Lake Formation introduces fine-grained access control for data in your data lake. Part of the changes include the `IAMAllowedPrincipals` principal in order to make Lake Formation backwards compatible with existing IAM and Glue permissions. For more information, see [Changing the Default Security Settings for Your Data Lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html) and [Upgrading AWS Glue Data Permissions to the AWS Lake Formation Model](https://docs.aws.amazon.com/lake-formation/latest/dg/upgrade-glue-lake-formation.html).
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:lakeformation/dataLakeSettings:DataLakeSettings")
public class DataLakeSettings extends com.pulumi.resources.CustomResource {
    /**
     * Set of ARNs of AWS Lake Formation principals (IAM users or roles).
     * 
     */
    @Export(name="admins", type=List.class, parameters={String.class})
    private Output<List<String>> admins;

    /**
     * @return Set of ARNs of AWS Lake Formation principals (IAM users or roles).
     * 
     */
    public Output<List<String>> admins() {
        return this.admins;
    }
    /**
     * Identifier for the Data Catalog. By default, the account ID.
     * 
     */
    @Export(name="catalogId", type=String.class, parameters={})
    private Output</* @Nullable */ String> catalogId;

    /**
     * @return Identifier for the Data Catalog. By default, the account ID.
     * 
     */
    public Output</* @Nullable */ String> catalogId() {
        return this.catalogId;
    }
    /**
     * Up to three configuration blocks of principal permissions for default create database permissions. Detailed below.
     * 
     */
    @Export(name="createDatabaseDefaultPermissions", type=List.class, parameters={DataLakeSettingsCreateDatabaseDefaultPermission.class})
    private Output<List<DataLakeSettingsCreateDatabaseDefaultPermission>> createDatabaseDefaultPermissions;

    /**
     * @return Up to three configuration blocks of principal permissions for default create database permissions. Detailed below.
     * 
     */
    public Output<List<DataLakeSettingsCreateDatabaseDefaultPermission>> createDatabaseDefaultPermissions() {
        return this.createDatabaseDefaultPermissions;
    }
    /**
     * Up to three configuration blocks of principal permissions for default create table permissions. Detailed below.
     * 
     */
    @Export(name="createTableDefaultPermissions", type=List.class, parameters={DataLakeSettingsCreateTableDefaultPermission.class})
    private Output<List<DataLakeSettingsCreateTableDefaultPermission>> createTableDefaultPermissions;

    /**
     * @return Up to three configuration blocks of principal permissions for default create table permissions. Detailed below.
     * 
     */
    public Output<List<DataLakeSettingsCreateTableDefaultPermission>> createTableDefaultPermissions() {
        return this.createTableDefaultPermissions;
    }
    /**
     * List of the resource-owning account IDs that the caller&#39;s account can use to share their user access details (user ARNs).
     * 
     */
    @Export(name="trustedResourceOwners", type=List.class, parameters={String.class})
    private Output<List<String>> trustedResourceOwners;

    /**
     * @return List of the resource-owning account IDs that the caller&#39;s account can use to share their user access details (user ARNs).
     * 
     */
    public Output<List<String>> trustedResourceOwners() {
        return this.trustedResourceOwners;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataLakeSettings(String name) {
        this(name, DataLakeSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataLakeSettings(String name, @Nullable DataLakeSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataLakeSettings(String name, @Nullable DataLakeSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lakeformation/dataLakeSettings:DataLakeSettings", name, args == null ? DataLakeSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataLakeSettings(String name, Output<String> id, @Nullable DataLakeSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lakeformation/dataLakeSettings:DataLakeSettings", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DataLakeSettings get(String name, Output<String> id, @Nullable DataLakeSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataLakeSettings(name, id, state, options);
    }
}
