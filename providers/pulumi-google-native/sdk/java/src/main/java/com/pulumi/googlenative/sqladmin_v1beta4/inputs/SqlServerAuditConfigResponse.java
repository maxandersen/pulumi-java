// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * SQL Server specific audit configuration.
 * 
 */
public final class SqlServerAuditConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final SqlServerAuditConfigResponse Empty = new SqlServerAuditConfigResponse();

    /**
     * The name of the destination bucket (e.g., gs://mybucket).
     * 
     */
    @Import(name="bucket", required=true)
      private final String bucket;

    public String bucket() {
        return this.bucket;
    }

    /**
     * This is always sql#sqlServerAuditConfig
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    public SqlServerAuditConfigResponse(
        String bucket,
        String kind) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
    }

    private SqlServerAuditConfigResponse() {
        this.bucket = null;
        this.kind = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerAuditConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerAuditConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.kind = defaults.kind;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }        public SqlServerAuditConfigResponse build() {
            return new SqlServerAuditConfigResponse(bucket, kind);
        }
    }
}
