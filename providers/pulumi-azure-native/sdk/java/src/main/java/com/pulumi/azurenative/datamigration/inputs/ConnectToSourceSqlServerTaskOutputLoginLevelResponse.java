// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.MigrationEligibilityInfoResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Login level output for the task that validates connection to SQL Server and also validates source server requirements
 * 
 */
public final class ConnectToSourceSqlServerTaskOutputLoginLevelResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectToSourceSqlServerTaskOutputLoginLevelResponse Empty = new ConnectToSourceSqlServerTaskOutputLoginLevelResponse();

    /**
     * The default database for the login.
     * 
     */
    @Import(name="defaultDatabase", required=true)
      private final String defaultDatabase;

    public String defaultDatabase() {
        return this.defaultDatabase;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The state of the login.
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Boolean isEnabled;

    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * The type of login.
     * 
     */
    @Import(name="loginType", required=true)
      private final String loginType;

    public String loginType() {
        return this.loginType;
    }

    /**
     * Information about eligibility of login for migration.
     * 
     */
    @Import(name="migrationEligibility", required=true)
      private final MigrationEligibilityInfoResponse migrationEligibility;

    public MigrationEligibilityInfoResponse migrationEligibility() {
        return this.migrationEligibility;
    }

    /**
     * Login name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Type of result - database level or task level
     * Expected value is 'LoginLevelOutput'.
     * 
     */
    @Import(name="resultType", required=true)
      private final String resultType;

    public String resultType() {
        return this.resultType;
    }

    public ConnectToSourceSqlServerTaskOutputLoginLevelResponse(
        String defaultDatabase,
        String id,
        Boolean isEnabled,
        String loginType,
        MigrationEligibilityInfoResponse migrationEligibility,
        String name,
        String resultType) {
        this.defaultDatabase = Objects.requireNonNull(defaultDatabase, "expected parameter 'defaultDatabase' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.loginType = Objects.requireNonNull(loginType, "expected parameter 'loginType' to be non-null");
        this.migrationEligibility = Objects.requireNonNull(migrationEligibility, "expected parameter 'migrationEligibility' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
    }

    private ConnectToSourceSqlServerTaskOutputLoginLevelResponse() {
        this.defaultDatabase = null;
        this.id = null;
        this.isEnabled = null;
        this.loginType = null;
        this.migrationEligibility = null;
        this.name = null;
        this.resultType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourceSqlServerTaskOutputLoginLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultDatabase;
        private String id;
        private Boolean isEnabled;
        private String loginType;
        private MigrationEligibilityInfoResponse migrationEligibility;
        private String name;
        private String resultType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourceSqlServerTaskOutputLoginLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultDatabase = defaults.defaultDatabase;
    	      this.id = defaults.id;
    	      this.isEnabled = defaults.isEnabled;
    	      this.loginType = defaults.loginType;
    	      this.migrationEligibility = defaults.migrationEligibility;
    	      this.name = defaults.name;
    	      this.resultType = defaults.resultType;
        }

        public Builder defaultDatabase(String defaultDatabase) {
            this.defaultDatabase = Objects.requireNonNull(defaultDatabase);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder loginType(String loginType) {
            this.loginType = Objects.requireNonNull(loginType);
            return this;
        }
        public Builder migrationEligibility(MigrationEligibilityInfoResponse migrationEligibility) {
            this.migrationEligibility = Objects.requireNonNull(migrationEligibility);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }        public ConnectToSourceSqlServerTaskOutputLoginLevelResponse build() {
            return new ConnectToSourceSqlServerTaskOutputLoginLevelResponse(defaultDatabase, id, isEnabled, loginType, migrationEligibility, name, resultType);
        }
    }
}
