// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SQL Server specific audit configuration.
 * 
 */
public final class SqlServerAuditConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlServerAuditConfigArgs Empty = new SqlServerAuditConfigArgs();

    /**
     * The name of the destination bucket (e.g., gs://mybucket).
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket == null ? Codegen.empty() : this.bucket;
    }

    /**
     * This is always sql#sqlServerAuditConfig
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    public SqlServerAuditConfigArgs(
        @Nullable Output<String> bucket,
        @Nullable Output<String> kind) {
        this.bucket = bucket;
        this.kind = kind;
    }

    private SqlServerAuditConfigArgs() {
        this.bucket = Codegen.empty();
        this.kind = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerAuditConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucket;
        private @Nullable Output<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerAuditConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.kind = defaults.kind;
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder bucket(@Nullable String bucket) {
            this.bucket = Codegen.ofNullable(bucket);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }        public SqlServerAuditConfigArgs build() {
            return new SqlServerAuditConfigArgs(bucket, kind);
        }
    }
}
