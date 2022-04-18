// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Active Directory configuration, relevant only for Cloud SQL for SQL Server.
 * 
 */
public final class SqlActiveDirectoryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlActiveDirectoryConfigArgs Empty = new SqlActiveDirectoryConfigArgs();

    /**
     * The name of the domain (e.g., mydomain.com).
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> domain() {
        return this.domain == null ? Codegen.empty() : this.domain;
    }

    /**
     * This is always sql#activeDirectoryConfig.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    public SqlActiveDirectoryConfigArgs(
        @Nullable Output<String> domain,
        @Nullable Output<String> kind) {
        this.domain = domain;
        this.kind = kind;
    }

    private SqlActiveDirectoryConfigArgs() {
        this.domain = Codegen.empty();
        this.kind = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlActiveDirectoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> domain;
        private @Nullable Output<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlActiveDirectoryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.kind = defaults.kind;
        }

        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = Codegen.ofNullable(domain);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }        public SqlActiveDirectoryConfigArgs build() {
            return new SqlActiveDirectoryConfigArgs(domain, kind);
        }
    }
}
