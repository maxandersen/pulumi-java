// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.inputs;

import com.pulumi.aws.lakeformation.inputs.PermissionsDataLocationGetArgs;
import com.pulumi.aws.lakeformation.inputs.PermissionsDatabaseGetArgs;
import com.pulumi.aws.lakeformation.inputs.PermissionsTableGetArgs;
import com.pulumi.aws.lakeformation.inputs.PermissionsTableWithColumnsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PermissionsState extends com.pulumi.resources.ResourceArgs {

    public static final PermissionsState Empty = new PermissionsState();

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @Import(name="catalogId")
    private @Nullable Output<String> catalogId;

    public Optional<Output<String>> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }

    /**
     * Whether the permissions are to be granted for the Data Catalog. Defaults to `false`.
     * 
     */
    @Import(name="catalogResource")
    private @Nullable Output<Boolean> catalogResource;

    public Optional<Output<Boolean>> catalogResource() {
        return Optional.ofNullable(this.catalogResource);
    }

    /**
     * Configuration block for a data location resource. Detailed below.
     * 
     */
    @Import(name="dataLocation")
    private @Nullable Output<PermissionsDataLocationGetArgs> dataLocation;

    public Optional<Output<PermissionsDataLocationGetArgs>> dataLocation() {
        return Optional.ofNullable(this.dataLocation);
    }

    /**
     * Configuration block for a database resource. Detailed below.
     * 
     */
    @Import(name="database")
    private @Nullable Output<PermissionsDatabaseGetArgs> database;

    public Optional<Output<PermissionsDatabaseGetArgs>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * List of permissions granted to the principal. Valid values may include `ALL`, `ALTER`, `CREATE_DATABASE`, `CREATE_TABLE`, `DATA_LOCATION_ACCESS`, `DELETE`, `DESCRIBE`, `DROP`, `INSERT`, and `SELECT`. For details on each permission, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<String>> permissions;

    public Optional<Output<List<String>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * Subset of `permissions` which the principal can pass.
     * 
     */
    @Import(name="permissionsWithGrantOptions")
    private @Nullable Output<List<String>> permissionsWithGrantOptions;

    public Optional<Output<List<String>>> permissionsWithGrantOptions() {
        return Optional.ofNullable(this.permissionsWithGrantOptions);
    }

    /**
     * Principal to be granted the permissions on the resource. Supported principals include `IAM_ALLOWED_PRINCIPALS` (see Default Behavior and `IAMAllowedPrincipals` above), IAM roles, users, groups, SAML groups and users, QuickSight groups, OUs, and organizations as well as AWS account IDs for cross-account permissions. For more information, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    @Import(name="principal")
    private @Nullable Output<String> principal;

    public Optional<Output<String>> principal() {
        return Optional.ofNullable(this.principal);
    }

    /**
     * Configuration block for a table resource. Detailed below.
     * 
     */
    @Import(name="table")
    private @Nullable Output<PermissionsTableGetArgs> table;

    public Optional<Output<PermissionsTableGetArgs>> table() {
        return Optional.ofNullable(this.table);
    }

    /**
     * Configuration block for a table with columns resource. Detailed below.
     * 
     */
    @Import(name="tableWithColumns")
    private @Nullable Output<PermissionsTableWithColumnsGetArgs> tableWithColumns;

    public Optional<Output<PermissionsTableWithColumnsGetArgs>> tableWithColumns() {
        return Optional.ofNullable(this.tableWithColumns);
    }

    private PermissionsState() {}

    private PermissionsState(PermissionsState $) {
        this.catalogId = $.catalogId;
        this.catalogResource = $.catalogResource;
        this.dataLocation = $.dataLocation;
        this.database = $.database;
        this.permissions = $.permissions;
        this.permissionsWithGrantOptions = $.permissionsWithGrantOptions;
        this.principal = $.principal;
        this.table = $.table;
        this.tableWithColumns = $.tableWithColumns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PermissionsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PermissionsState $;

        public Builder() {
            $ = new PermissionsState();
        }

        public Builder(PermissionsState defaults) {
            $ = new PermissionsState(Objects.requireNonNull(defaults));
        }

        public Builder catalogId(@Nullable Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        public Builder catalogResource(@Nullable Output<Boolean> catalogResource) {
            $.catalogResource = catalogResource;
            return this;
        }

        public Builder catalogResource(Boolean catalogResource) {
            return catalogResource(Output.of(catalogResource));
        }

        public Builder dataLocation(@Nullable Output<PermissionsDataLocationGetArgs> dataLocation) {
            $.dataLocation = dataLocation;
            return this;
        }

        public Builder dataLocation(PermissionsDataLocationGetArgs dataLocation) {
            return dataLocation(Output.of(dataLocation));
        }

        public Builder database(@Nullable Output<PermissionsDatabaseGetArgs> database) {
            $.database = database;
            return this;
        }

        public Builder database(PermissionsDatabaseGetArgs database) {
            return database(Output.of(database));
        }

        public Builder permissions(@Nullable Output<List<String>> permissions) {
            $.permissions = permissions;
            return this;
        }

        public Builder permissions(List<String> permissions) {
            return permissions(Output.of(permissions));
        }

        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }

        public Builder permissionsWithGrantOptions(@Nullable Output<List<String>> permissionsWithGrantOptions) {
            $.permissionsWithGrantOptions = permissionsWithGrantOptions;
            return this;
        }

        public Builder permissionsWithGrantOptions(List<String> permissionsWithGrantOptions) {
            return permissionsWithGrantOptions(Output.of(permissionsWithGrantOptions));
        }

        public Builder permissionsWithGrantOptions(String... permissionsWithGrantOptions) {
            return permissionsWithGrantOptions(List.of(permissionsWithGrantOptions));
        }

        public Builder principal(@Nullable Output<String> principal) {
            $.principal = principal;
            return this;
        }

        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        public Builder table(@Nullable Output<PermissionsTableGetArgs> table) {
            $.table = table;
            return this;
        }

        public Builder table(PermissionsTableGetArgs table) {
            return table(Output.of(table));
        }

        public Builder tableWithColumns(@Nullable Output<PermissionsTableWithColumnsGetArgs> tableWithColumns) {
            $.tableWithColumns = tableWithColumns;
            return this;
        }

        public Builder tableWithColumns(PermissionsTableWithColumnsGetArgs tableWithColumns) {
            return tableWithColumns(Output.of(tableWithColumns));
        }

        public PermissionsState build() {
            return $;
        }
    }

}
