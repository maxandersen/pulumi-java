// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListSqlMigrationServiceAuthKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListSqlMigrationServiceAuthKeysArgs Empty = new ListSqlMigrationServiceAuthKeysArgs();

    /**
     * Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the SQL Migration Service.
     * 
     */
    @Import(name="sqlMigrationServiceName", required=true)
      private final String sqlMigrationServiceName;

    public String sqlMigrationServiceName() {
        return this.sqlMigrationServiceName;
    }

    public ListSqlMigrationServiceAuthKeysArgs(
        String resourceGroupName,
        String sqlMigrationServiceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlMigrationServiceName = Objects.requireNonNull(sqlMigrationServiceName, "expected parameter 'sqlMigrationServiceName' to be non-null");
    }

    private ListSqlMigrationServiceAuthKeysArgs() {
        this.resourceGroupName = null;
        this.sqlMigrationServiceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSqlMigrationServiceAuthKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String sqlMigrationServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSqlMigrationServiceAuthKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlMigrationServiceName = defaults.sqlMigrationServiceName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder sqlMigrationServiceName(String sqlMigrationServiceName) {
            this.sqlMigrationServiceName = Objects.requireNonNull(sqlMigrationServiceName);
            return this;
        }        public ListSqlMigrationServiceAuthKeysArgs build() {
            return new ListSqlMigrationServiceAuthKeysArgs(resourceGroupName, sqlMigrationServiceName);
        }
    }
}
