// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterSnapshotArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterSnapshotArgs Empty = new ClusterSnapshotArgs();

    /**
     * The DB Cluster Identifier from which to take the snapshot.
     * 
     */
    @Import(name="dbClusterIdentifier", required=true)
      private final Output<String> dbClusterIdentifier;

    public Output<String> dbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }

    /**
     * The Identifier for the snapshot.
     * 
     */
    @Import(name="dbClusterSnapshotIdentifier", required=true)
      private final Output<String> dbClusterSnapshotIdentifier;

    public Output<String> dbClusterSnapshotIdentifier() {
        return this.dbClusterSnapshotIdentifier;
    }

    /**
     * A map of tags to assign to the DB cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ClusterSnapshotArgs(
        Output<String> dbClusterIdentifier,
        Output<String> dbClusterSnapshotIdentifier,
        @Nullable Output<Map<String,String>> tags) {
        this.dbClusterIdentifier = Objects.requireNonNull(dbClusterIdentifier, "expected parameter 'dbClusterIdentifier' to be non-null");
        this.dbClusterSnapshotIdentifier = Objects.requireNonNull(dbClusterSnapshotIdentifier, "expected parameter 'dbClusterSnapshotIdentifier' to be non-null");
        this.tags = tags;
    }

    private ClusterSnapshotArgs() {
        this.dbClusterIdentifier = Codegen.empty();
        this.dbClusterSnapshotIdentifier = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dbClusterIdentifier;
        private Output<String> dbClusterSnapshotIdentifier;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbClusterIdentifier = defaults.dbClusterIdentifier;
    	      this.dbClusterSnapshotIdentifier = defaults.dbClusterSnapshotIdentifier;
    	      this.tags = defaults.tags;
        }

        public Builder dbClusterIdentifier(Output<String> dbClusterIdentifier) {
            this.dbClusterIdentifier = Objects.requireNonNull(dbClusterIdentifier);
            return this;
        }
        public Builder dbClusterIdentifier(String dbClusterIdentifier) {
            this.dbClusterIdentifier = Output.of(Objects.requireNonNull(dbClusterIdentifier));
            return this;
        }
        public Builder dbClusterSnapshotIdentifier(Output<String> dbClusterSnapshotIdentifier) {
            this.dbClusterSnapshotIdentifier = Objects.requireNonNull(dbClusterSnapshotIdentifier);
            return this;
        }
        public Builder dbClusterSnapshotIdentifier(String dbClusterSnapshotIdentifier) {
            this.dbClusterSnapshotIdentifier = Output.of(Objects.requireNonNull(dbClusterSnapshotIdentifier));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ClusterSnapshotArgs build() {
            return new ClusterSnapshotArgs(dbClusterIdentifier, dbClusterSnapshotIdentifier, tags);
        }
    }
}
