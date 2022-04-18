// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SqlActiveDirectoryConfigResponse {
    /**
     * The name of the domain (e.g., mydomain.com).
     * 
     */
    private final String domain;
    /**
     * This is always sql#activeDirectoryConfig.
     * 
     */
    private final String kind;

    @CustomType.Constructor
    private SqlActiveDirectoryConfigResponse(
        @CustomType.Parameter("domain") String domain,
        @CustomType.Parameter("kind") String kind) {
        this.domain = domain;
        this.kind = kind;
    }

    /**
     * The name of the domain (e.g., mydomain.com).
     * 
    */
    public String domain() {
        return this.domain;
    }
    /**
     * This is always sql#activeDirectoryConfig.
     * 
    */
    public String kind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlActiveDirectoryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domain;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlActiveDirectoryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.kind = defaults.kind;
        }

        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }        public SqlActiveDirectoryConfigResponse build() {
            return new SqlActiveDirectoryConfigResponse(domain, kind);
        }
    }
}
