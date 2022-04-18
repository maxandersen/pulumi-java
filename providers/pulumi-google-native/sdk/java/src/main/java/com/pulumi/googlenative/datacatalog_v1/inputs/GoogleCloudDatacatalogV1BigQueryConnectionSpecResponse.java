// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Specification for the BigQuery connection.
 * 
 */
public final class GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse Empty = new GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse();

    /**
     * Specification for the BigQuery connection to a Cloud SQL instance.
     * 
     */
    @Import(name="cloudSql", required=true)
      private final GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse cloudSql;

    public GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse cloudSql() {
        return this.cloudSql;
    }

    /**
     * The type of the BigQuery connection.
     * 
     */
    @Import(name="connectionType", required=true)
      private final String connectionType;

    public String connectionType() {
        return this.connectionType;
    }

    /**
     * True if there are credentials attached to the BigQuery connection; false otherwise.
     * 
     */
    @Import(name="hasCredential", required=true)
      private final Boolean hasCredential;

    public Boolean hasCredential() {
        return this.hasCredential;
    }

    public GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse(
        GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse cloudSql,
        String connectionType,
        Boolean hasCredential) {
        this.cloudSql = Objects.requireNonNull(cloudSql, "expected parameter 'cloudSql' to be non-null");
        this.connectionType = Objects.requireNonNull(connectionType, "expected parameter 'connectionType' to be non-null");
        this.hasCredential = Objects.requireNonNull(hasCredential, "expected parameter 'hasCredential' to be non-null");
    }

    private GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse() {
        this.cloudSql = null;
        this.connectionType = null;
        this.hasCredential = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse cloudSql;
        private String connectionType;
        private Boolean hasCredential;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSql = defaults.cloudSql;
    	      this.connectionType = defaults.connectionType;
    	      this.hasCredential = defaults.hasCredential;
        }

        public Builder cloudSql(GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse cloudSql) {
            this.cloudSql = Objects.requireNonNull(cloudSql);
            return this;
        }
        public Builder connectionType(String connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }
        public Builder hasCredential(Boolean hasCredential) {
            this.hasCredential = Objects.requireNonNull(hasCredential);
            return this;
        }        public GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse build() {
            return new GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse(cloudSql, connectionType, hasCredential);
        }
    }
}
