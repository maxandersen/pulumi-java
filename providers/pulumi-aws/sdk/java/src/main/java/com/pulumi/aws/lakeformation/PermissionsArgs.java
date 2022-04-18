// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation;

import com.pulumi.aws.lakeformation.inputs.PermissionsDataLocationArgs;
import com.pulumi.aws.lakeformation.inputs.PermissionsDatabaseArgs;
import com.pulumi.aws.lakeformation.inputs.PermissionsTableArgs;
import com.pulumi.aws.lakeformation.inputs.PermissionsTableWithColumnsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PermissionsArgs Empty = new PermissionsArgs();

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @Import(name="catalogId")
      private final @Nullable Output<String> catalogId;

    public Output<String> catalogId() {
        return this.catalogId == null ? Codegen.empty() : this.catalogId;
    }

    /**
     * Whether the permissions are to be granted for the Data Catalog. Defaults to `false`.
     * 
     */
    @Import(name="catalogResource")
      private final @Nullable Output<Boolean> catalogResource;

    public Output<Boolean> catalogResource() {
        return this.catalogResource == null ? Codegen.empty() : this.catalogResource;
    }

    /**
     * Configuration block for a data location resource. Detailed below.
     * 
     */
    @Import(name="dataLocation")
      private final @Nullable Output<PermissionsDataLocationArgs> dataLocation;

    public Output<PermissionsDataLocationArgs> dataLocation() {
        return this.dataLocation == null ? Codegen.empty() : this.dataLocation;
    }

    /**
     * Configuration block for a database resource. Detailed below.
     * 
     */
    @Import(name="database")
      private final @Nullable Output<PermissionsDatabaseArgs> database;

    public Output<PermissionsDatabaseArgs> database() {
        return this.database == null ? Codegen.empty() : this.database;
    }

    /**
     * List of permissions granted to the principal. Valid values may include `ALL`, `ALTER`, `CREATE_DATABASE`, `CREATE_TABLE`, `DATA_LOCATION_ACCESS`, `DELETE`, `DESCRIBE`, `DROP`, `INSERT`, and `SELECT`. For details on each permission, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    @Import(name="permissions", required=true)
      private final Output<List<String>> permissions;

    public Output<List<String>> permissions() {
        return this.permissions;
    }

    /**
     * Subset of `permissions` which the principal can pass.
     * 
     */
    @Import(name="permissionsWithGrantOptions")
      private final @Nullable Output<List<String>> permissionsWithGrantOptions;

    public Output<List<String>> permissionsWithGrantOptions() {
        return this.permissionsWithGrantOptions == null ? Codegen.empty() : this.permissionsWithGrantOptions;
    }

    /**
     * Principal to be granted the permissions on the resource. Supported principals include `IAM_ALLOWED_PRINCIPALS` (see Default Behavior and `IAMAllowedPrincipals` above), IAM roles, users, groups, SAML groups and users, QuickSight groups, OUs, and organizations as well as AWS account IDs for cross-account permissions. For more information, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    @Import(name="principal", required=true)
      private final Output<String> principal;

    public Output<String> principal() {
        return this.principal;
    }

    /**
     * Configuration block for a table resource. Detailed below.
     * 
     */
    @Import(name="table")
      private final @Nullable Output<PermissionsTableArgs> table;

    public Output<PermissionsTableArgs> table() {
        return this.table == null ? Codegen.empty() : this.table;
    }

    /**
     * Configuration block for a table with columns resource. Detailed below.
     * 
     */
    @Import(name="tableWithColumns")
      private final @Nullable Output<PermissionsTableWithColumnsArgs> tableWithColumns;

    public Output<PermissionsTableWithColumnsArgs> tableWithColumns() {
        return this.tableWithColumns == null ? Codegen.empty() : this.tableWithColumns;
    }

    public PermissionsArgs(
        @Nullable Output<String> catalogId,
        @Nullable Output<Boolean> catalogResource,
        @Nullable Output<PermissionsDataLocationArgs> dataLocation,
        @Nullable Output<PermissionsDatabaseArgs> database,
        Output<List<String>> permissions,
        @Nullable Output<List<String>> permissionsWithGrantOptions,
        Output<String> principal,
        @Nullable Output<PermissionsTableArgs> table,
        @Nullable Output<PermissionsTableWithColumnsArgs> tableWithColumns) {
        this.catalogId = catalogId;
        this.catalogResource = catalogResource;
        this.dataLocation = dataLocation;
        this.database = database;
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
        this.permissionsWithGrantOptions = permissionsWithGrantOptions;
        this.principal = Objects.requireNonNull(principal, "expected parameter 'principal' to be non-null");
        this.table = table;
        this.tableWithColumns = tableWithColumns;
    }

    private PermissionsArgs() {
        this.catalogId = Codegen.empty();
        this.catalogResource = Codegen.empty();
        this.dataLocation = Codegen.empty();
        this.database = Codegen.empty();
        this.permissions = Codegen.empty();
        this.permissionsWithGrantOptions = Codegen.empty();
        this.principal = Codegen.empty();
        this.table = Codegen.empty();
        this.tableWithColumns = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> catalogId;
        private @Nullable Output<Boolean> catalogResource;
        private @Nullable Output<PermissionsDataLocationArgs> dataLocation;
        private @Nullable Output<PermissionsDatabaseArgs> database;
        private Output<List<String>> permissions;
        private @Nullable Output<List<String>> permissionsWithGrantOptions;
        private Output<String> principal;
        private @Nullable Output<PermissionsTableArgs> table;
        private @Nullable Output<PermissionsTableWithColumnsArgs> tableWithColumns;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.catalogResource = defaults.catalogResource;
    	      this.dataLocation = defaults.dataLocation;
    	      this.database = defaults.database;
    	      this.permissions = defaults.permissions;
    	      this.permissionsWithGrantOptions = defaults.permissionsWithGrantOptions;
    	      this.principal = defaults.principal;
    	      this.table = defaults.table;
    	      this.tableWithColumns = defaults.tableWithColumns;
        }

        public Builder catalogId(@Nullable Output<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = Codegen.ofNullable(catalogId);
            return this;
        }
        public Builder catalogResource(@Nullable Output<Boolean> catalogResource) {
            this.catalogResource = catalogResource;
            return this;
        }
        public Builder catalogResource(@Nullable Boolean catalogResource) {
            this.catalogResource = Codegen.ofNullable(catalogResource);
            return this;
        }
        public Builder dataLocation(@Nullable Output<PermissionsDataLocationArgs> dataLocation) {
            this.dataLocation = dataLocation;
            return this;
        }
        public Builder dataLocation(@Nullable PermissionsDataLocationArgs dataLocation) {
            this.dataLocation = Codegen.ofNullable(dataLocation);
            return this;
        }
        public Builder database(@Nullable Output<PermissionsDatabaseArgs> database) {
            this.database = database;
            return this;
        }
        public Builder database(@Nullable PermissionsDatabaseArgs database) {
            this.database = Codegen.ofNullable(database);
            return this;
        }
        public Builder permissions(Output<List<String>> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder permissions(List<String> permissions) {
            this.permissions = Output.of(Objects.requireNonNull(permissions));
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder permissionsWithGrantOptions(@Nullable Output<List<String>> permissionsWithGrantOptions) {
            this.permissionsWithGrantOptions = permissionsWithGrantOptions;
            return this;
        }
        public Builder permissionsWithGrantOptions(@Nullable List<String> permissionsWithGrantOptions) {
            this.permissionsWithGrantOptions = Codegen.ofNullable(permissionsWithGrantOptions);
            return this;
        }
        public Builder permissionsWithGrantOptions(String... permissionsWithGrantOptions) {
            return permissionsWithGrantOptions(List.of(permissionsWithGrantOptions));
        }
        public Builder principal(Output<String> principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }
        public Builder principal(String principal) {
            this.principal = Output.of(Objects.requireNonNull(principal));
            return this;
        }
        public Builder table(@Nullable Output<PermissionsTableArgs> table) {
            this.table = table;
            return this;
        }
        public Builder table(@Nullable PermissionsTableArgs table) {
            this.table = Codegen.ofNullable(table);
            return this;
        }
        public Builder tableWithColumns(@Nullable Output<PermissionsTableWithColumnsArgs> tableWithColumns) {
            this.tableWithColumns = tableWithColumns;
            return this;
        }
        public Builder tableWithColumns(@Nullable PermissionsTableWithColumnsArgs tableWithColumns) {
            this.tableWithColumns = Codegen.ofNullable(tableWithColumns);
            return this;
        }        public PermissionsArgs build() {
            return new PermissionsArgs(catalogId, catalogResource, dataLocation, database, permissions, permissionsWithGrantOptions, principal, table, tableWithColumns);
        }
    }
}
