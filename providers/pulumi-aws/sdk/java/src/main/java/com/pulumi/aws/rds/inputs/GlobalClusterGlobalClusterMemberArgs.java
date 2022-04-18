// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalClusterGlobalClusterMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalClusterGlobalClusterMemberArgs Empty = new GlobalClusterGlobalClusterMemberArgs();

    /**
     * Amazon Resource Name (ARN) of member DB Cluster
     * 
     */
    @Import(name="dbClusterArn")
      private final @Nullable Output<String> dbClusterArn;

    public Output<String> dbClusterArn() {
        return this.dbClusterArn == null ? Codegen.empty() : this.dbClusterArn;
    }

    /**
     * Whether the member is the primary DB Cluster
     * 
     */
    @Import(name="isWriter")
      private final @Nullable Output<Boolean> isWriter;

    public Output<Boolean> isWriter() {
        return this.isWriter == null ? Codegen.empty() : this.isWriter;
    }

    public GlobalClusterGlobalClusterMemberArgs(
        @Nullable Output<String> dbClusterArn,
        @Nullable Output<Boolean> isWriter) {
        this.dbClusterArn = dbClusterArn;
        this.isWriter = isWriter;
    }

    private GlobalClusterGlobalClusterMemberArgs() {
        this.dbClusterArn = Codegen.empty();
        this.isWriter = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalClusterGlobalClusterMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dbClusterArn;
        private @Nullable Output<Boolean> isWriter;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalClusterGlobalClusterMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbClusterArn = defaults.dbClusterArn;
    	      this.isWriter = defaults.isWriter;
        }

        public Builder dbClusterArn(@Nullable Output<String> dbClusterArn) {
            this.dbClusterArn = dbClusterArn;
            return this;
        }
        public Builder dbClusterArn(@Nullable String dbClusterArn) {
            this.dbClusterArn = Codegen.ofNullable(dbClusterArn);
            return this;
        }
        public Builder isWriter(@Nullable Output<Boolean> isWriter) {
            this.isWriter = isWriter;
            return this;
        }
        public Builder isWriter(@Nullable Boolean isWriter) {
            this.isWriter = Codegen.ofNullable(isWriter);
            return this;
        }        public GlobalClusterGlobalClusterMemberArgs build() {
            return new GlobalClusterGlobalClusterMemberArgs(dbClusterArn, isWriter);
        }
    }
}
