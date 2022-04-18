// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FollowerDatabaseDefinitionResponse {
    /**
     * Resource name of the attached database configuration in the follower cluster.
     * 
     */
    private final String attachedDatabaseConfigurationName;
    /**
     * Resource id of the cluster that follows a database owned by this cluster.
     * 
     */
    private final String clusterResourceId;
    /**
     * The database name owned by this cluster that was followed. * in case following all databases.
     * 
     */
    private final String databaseName;

    @CustomType.Constructor
    private FollowerDatabaseDefinitionResponse(
        @CustomType.Parameter("attachedDatabaseConfigurationName") String attachedDatabaseConfigurationName,
        @CustomType.Parameter("clusterResourceId") String clusterResourceId,
        @CustomType.Parameter("databaseName") String databaseName) {
        this.attachedDatabaseConfigurationName = attachedDatabaseConfigurationName;
        this.clusterResourceId = clusterResourceId;
        this.databaseName = databaseName;
    }

    /**
     * Resource name of the attached database configuration in the follower cluster.
     * 
    */
    public String attachedDatabaseConfigurationName() {
        return this.attachedDatabaseConfigurationName;
    }
    /**
     * Resource id of the cluster that follows a database owned by this cluster.
     * 
    */
    public String clusterResourceId() {
        return this.clusterResourceId;
    }
    /**
     * The database name owned by this cluster that was followed. * in case following all databases.
     * 
    */
    public String databaseName() {
        return this.databaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FollowerDatabaseDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attachedDatabaseConfigurationName;
        private String clusterResourceId;
        private String databaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(FollowerDatabaseDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedDatabaseConfigurationName = defaults.attachedDatabaseConfigurationName;
    	      this.clusterResourceId = defaults.clusterResourceId;
    	      this.databaseName = defaults.databaseName;
        }

        public Builder attachedDatabaseConfigurationName(String attachedDatabaseConfigurationName) {
            this.attachedDatabaseConfigurationName = Objects.requireNonNull(attachedDatabaseConfigurationName);
            return this;
        }
        public Builder clusterResourceId(String clusterResourceId) {
            this.clusterResourceId = Objects.requireNonNull(clusterResourceId);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }        public FollowerDatabaseDefinitionResponse build() {
            return new FollowerDatabaseDefinitionResponse(attachedDatabaseConfigurationName, clusterResourceId, databaseName);
        }
    }
}
