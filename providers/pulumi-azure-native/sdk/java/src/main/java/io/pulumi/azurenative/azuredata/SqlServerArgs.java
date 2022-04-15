// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azuredata;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlServerArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlServerArgs Empty = new SqlServerArgs();

    /**
     * Cores of the Sql Server.
     * 
     */
    @Import(name="cores")
      private final @Nullable Output<Integer> cores;

    public Output<Integer> cores() {
        return this.cores == null ? Codegen.empty() : this.cores;
    }

    /**
     * Sql Server Edition.
     * 
     */
    @Import(name="edition")
      private final @Nullable Output<String> edition;

    public Output<String> edition() {
        return this.edition == null ? Codegen.empty() : this.edition;
    }

    /**
     * Sql Server Json Property Bag.
     * 
     */
    @Import(name="propertyBag")
      private final @Nullable Output<String> propertyBag;

    public Output<String> propertyBag() {
        return this.propertyBag == null ? Codegen.empty() : this.propertyBag;
    }

    /**
     * ID for Parent Sql Server Registration.
     * 
     */
    @Import(name="registrationID")
      private final @Nullable Output<String> registrationID;

    public Output<String> registrationID() {
        return this.registrationID == null ? Codegen.empty() : this.registrationID;
    }

    /**
     * Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the SQL Server.
     * 
     */
    @Import(name="sqlServerName")
      private final @Nullable Output<String> sqlServerName;

    public Output<String> sqlServerName() {
        return this.sqlServerName == null ? Codegen.empty() : this.sqlServerName;
    }

    /**
     * Name of the SQL Server registration.
     * 
     */
    @Import(name="sqlServerRegistrationName", required=true)
      private final Output<String> sqlServerRegistrationName;

    public Output<String> sqlServerRegistrationName() {
        return this.sqlServerRegistrationName;
    }

    /**
     * Version of the Sql Server.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public SqlServerArgs(
        @Nullable Output<Integer> cores,
        @Nullable Output<String> edition,
        @Nullable Output<String> propertyBag,
        @Nullable Output<String> registrationID,
        Output<String> resourceGroupName,
        @Nullable Output<String> sqlServerName,
        Output<String> sqlServerRegistrationName,
        @Nullable Output<String> version) {
        this.cores = cores;
        this.edition = edition;
        this.propertyBag = propertyBag;
        this.registrationID = registrationID;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlServerName = sqlServerName;
        this.sqlServerRegistrationName = Objects.requireNonNull(sqlServerRegistrationName, "expected parameter 'sqlServerRegistrationName' to be non-null");
        this.version = version;
    }

    private SqlServerArgs() {
        this.cores = Codegen.empty();
        this.edition = Codegen.empty();
        this.propertyBag = Codegen.empty();
        this.registrationID = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sqlServerName = Codegen.empty();
        this.sqlServerRegistrationName = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> cores;
        private @Nullable Output<String> edition;
        private @Nullable Output<String> propertyBag;
        private @Nullable Output<String> registrationID;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> sqlServerName;
        private Output<String> sqlServerRegistrationName;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cores = defaults.cores;
    	      this.edition = defaults.edition;
    	      this.propertyBag = defaults.propertyBag;
    	      this.registrationID = defaults.registrationID;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlServerName = defaults.sqlServerName;
    	      this.sqlServerRegistrationName = defaults.sqlServerRegistrationName;
    	      this.version = defaults.version;
        }

        public Builder cores(@Nullable Output<Integer> cores) {
            this.cores = cores;
            return this;
        }
        public Builder cores(@Nullable Integer cores) {
            this.cores = Codegen.ofNullable(cores);
            return this;
        }
        public Builder edition(@Nullable Output<String> edition) {
            this.edition = edition;
            return this;
        }
        public Builder edition(@Nullable String edition) {
            this.edition = Codegen.ofNullable(edition);
            return this;
        }
        public Builder propertyBag(@Nullable Output<String> propertyBag) {
            this.propertyBag = propertyBag;
            return this;
        }
        public Builder propertyBag(@Nullable String propertyBag) {
            this.propertyBag = Codegen.ofNullable(propertyBag);
            return this;
        }
        public Builder registrationID(@Nullable Output<String> registrationID) {
            this.registrationID = registrationID;
            return this;
        }
        public Builder registrationID(@Nullable String registrationID) {
            this.registrationID = Codegen.ofNullable(registrationID);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sqlServerName(@Nullable Output<String> sqlServerName) {
            this.sqlServerName = sqlServerName;
            return this;
        }
        public Builder sqlServerName(@Nullable String sqlServerName) {
            this.sqlServerName = Codegen.ofNullable(sqlServerName);
            return this;
        }
        public Builder sqlServerRegistrationName(Output<String> sqlServerRegistrationName) {
            this.sqlServerRegistrationName = Objects.requireNonNull(sqlServerRegistrationName);
            return this;
        }
        public Builder sqlServerRegistrationName(String sqlServerRegistrationName) {
            this.sqlServerRegistrationName = Output.of(Objects.requireNonNull(sqlServerRegistrationName));
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public SqlServerArgs build() {
            return new SqlServerArgs(cores, edition, propertyBag, registrationID, resourceGroupName, sqlServerName, sqlServerRegistrationName, version);
        }
    }
}
