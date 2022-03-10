// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryconnection_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigqueryconnection_v1beta1.outputs.CloudSqlCredentialResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CloudSqlPropertiesResponse {
    /**
     * Input only. Cloud SQL credential.
     * 
     */
    private final CloudSqlCredentialResponse credential;
    /**
     * Database name.
     * 
     */
    private final String database;
    /**
     * Cloud SQL instance ID in the form `project:location:instance`.
     * 
     */
    private final String instanceId;
    /**
     * Type of the Cloud SQL database.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private CloudSqlPropertiesResponse(
        @OutputCustomType.Parameter("credential") CloudSqlCredentialResponse credential,
        @OutputCustomType.Parameter("database") String database,
        @OutputCustomType.Parameter("instanceId") String instanceId,
        @OutputCustomType.Parameter("type") String type) {
        this.credential = credential;
        this.database = database;
        this.instanceId = instanceId;
        this.type = type;
    }

    /**
     * Input only. Cloud SQL credential.
     * 
    */
    public CloudSqlCredentialResponse getCredential() {
        return this.credential;
    }
    /**
     * Database name.
     * 
    */
    public String getDatabase() {
        return this.database;
    }
    /**
     * Cloud SQL instance ID in the form `project:location:instance`.
     * 
    */
    public String getInstanceId() {
        return this.instanceId;
    }
    /**
     * Type of the Cloud SQL database.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudSqlPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudSqlCredentialResponse credential;
        private String database;
        private String instanceId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudSqlPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.database = defaults.database;
    	      this.instanceId = defaults.instanceId;
    	      this.type = defaults.type;
        }

        public Builder setCredential(CloudSqlCredentialResponse credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }

        public Builder setDatabase(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public CloudSqlPropertiesResponse build() {
            return new CloudSqlPropertiesResponse(credential, database, instanceId, type);
        }
    }
}
