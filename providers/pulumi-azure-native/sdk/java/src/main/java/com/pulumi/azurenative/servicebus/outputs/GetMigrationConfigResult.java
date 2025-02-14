// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMigrationConfigResult {
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return State in which Standard to Premium Migration is, possible values : Unknown, Reverting, Completing, Initiating, Syncing, Active
     * 
     */
    private final String migrationState;
    /**
     * @return Resource name
     * 
     */
    private final String name;
    /**
     * @return Number of entities pending to be replicated.
     * 
     */
    private final Double pendingReplicationOperationsCount;
    /**
     * @return Name to access Standard Namespace after migration
     * 
     */
    private final String postMigrationName;
    /**
     * @return Provisioning state of Migration Configuration
     * 
     */
    private final String provisioningState;
    /**
     * @return Existing premium Namespace ARM Id name which has no entities, will be used for migration
     * 
     */
    private final String targetNamespace;
    /**
     * @return Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetMigrationConfigResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("migrationState") String migrationState,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("pendingReplicationOperationsCount") Double pendingReplicationOperationsCount,
        @CustomType.Parameter("postMigrationName") String postMigrationName,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("targetNamespace") String targetNamespace,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.migrationState = migrationState;
        this.name = name;
        this.pendingReplicationOperationsCount = pendingReplicationOperationsCount;
        this.postMigrationName = postMigrationName;
        this.provisioningState = provisioningState;
        this.targetNamespace = targetNamespace;
        this.type = type;
    }

    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return State in which Standard to Premium Migration is, possible values : Unknown, Reverting, Completing, Initiating, Syncing, Active
     * 
     */
    public String migrationState() {
        return this.migrationState;
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Number of entities pending to be replicated.
     * 
     */
    public Double pendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
    }
    /**
     * @return Name to access Standard Namespace after migration
     * 
     */
    public String postMigrationName() {
        return this.postMigrationName;
    }
    /**
     * @return Provisioning state of Migration Configuration
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Existing premium Namespace ARM Id name which has no entities, will be used for migration
     * 
     */
    public String targetNamespace() {
        return this.targetNamespace;
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMigrationConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String migrationState;
        private String name;
        private Double pendingReplicationOperationsCount;
        private String postMigrationName;
        private String provisioningState;
        private String targetNamespace;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMigrationConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.migrationState = defaults.migrationState;
    	      this.name = defaults.name;
    	      this.pendingReplicationOperationsCount = defaults.pendingReplicationOperationsCount;
    	      this.postMigrationName = defaults.postMigrationName;
    	      this.provisioningState = defaults.provisioningState;
    	      this.targetNamespace = defaults.targetNamespace;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder migrationState(String migrationState) {
            this.migrationState = Objects.requireNonNull(migrationState);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder pendingReplicationOperationsCount(Double pendingReplicationOperationsCount) {
            this.pendingReplicationOperationsCount = Objects.requireNonNull(pendingReplicationOperationsCount);
            return this;
        }
        public Builder postMigrationName(String postMigrationName) {
            this.postMigrationName = Objects.requireNonNull(postMigrationName);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder targetNamespace(String targetNamespace) {
            this.targetNamespace = Objects.requireNonNull(targetNamespace);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetMigrationConfigResult build() {
            return new GetMigrationConfigResult(id, migrationState, name, pendingReplicationOperationsCount, postMigrationName, provisioningState, targetNamespace, type);
        }
    }
}
