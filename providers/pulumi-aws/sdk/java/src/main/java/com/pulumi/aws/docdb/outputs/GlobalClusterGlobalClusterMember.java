// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.docdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GlobalClusterGlobalClusterMember {
    /**
     * Amazon Resource Name (ARN) of member DB Cluster.
     * 
     */
    private final @Nullable String dbClusterArn;
    /**
     * Whether the member is the primary DB Cluster.
     * 
     */
    private final @Nullable Boolean isWriter;

    @CustomType.Constructor
    private GlobalClusterGlobalClusterMember(
        @CustomType.Parameter("dbClusterArn") @Nullable String dbClusterArn,
        @CustomType.Parameter("isWriter") @Nullable Boolean isWriter) {
        this.dbClusterArn = dbClusterArn;
        this.isWriter = isWriter;
    }

    /**
     * Amazon Resource Name (ARN) of member DB Cluster.
     * 
    */
    public Optional<String> dbClusterArn() {
        return Optional.ofNullable(this.dbClusterArn);
    }
    /**
     * Whether the member is the primary DB Cluster.
     * 
    */
    public Optional<Boolean> isWriter() {
        return Optional.ofNullable(this.isWriter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalClusterGlobalClusterMember defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dbClusterArn;
        private @Nullable Boolean isWriter;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalClusterGlobalClusterMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbClusterArn = defaults.dbClusterArn;
    	      this.isWriter = defaults.isWriter;
        }

        public Builder dbClusterArn(@Nullable String dbClusterArn) {
            this.dbClusterArn = dbClusterArn;
            return this;
        }
        public Builder isWriter(@Nullable Boolean isWriter) {
            this.isWriter = isWriter;
            return this;
        }        public GlobalClusterGlobalClusterMember build() {
            return new GlobalClusterGlobalClusterMember(dbClusterArn, isWriter);
        }
    }
}
