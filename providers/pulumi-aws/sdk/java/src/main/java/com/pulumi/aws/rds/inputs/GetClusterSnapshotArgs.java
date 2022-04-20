// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterSnapshotArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterSnapshotArgs Empty = new GetClusterSnapshotArgs();

    /**
     * Returns the list of snapshots created by the specific db_cluster
     * 
     */
    @Import(name="dbClusterIdentifier")
      private final @Nullable String dbClusterIdentifier;

    public Optional<String> dbClusterIdentifier() {
        return this.dbClusterIdentifier == null ? Optional.empty() : Optional.ofNullable(this.dbClusterIdentifier);
    }

    /**
     * Returns information on a specific snapshot_id.
     * 
     */
    @Import(name="dbClusterSnapshotIdentifier")
      private final @Nullable String dbClusterSnapshotIdentifier;

    public Optional<String> dbClusterSnapshotIdentifier() {
        return this.dbClusterSnapshotIdentifier == null ? Optional.empty() : Optional.ofNullable(this.dbClusterSnapshotIdentifier);
    }

    /**
     * Set this value to true to include manual DB Cluster Snapshots that are public and can be
     * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
     * 
     */
    @Import(name="includePublic")
      private final @Nullable Boolean includePublic;

    public Optional<Boolean> includePublic() {
        return this.includePublic == null ? Optional.empty() : Optional.ofNullable(this.includePublic);
    }

    /**
     * Set this value to true to include shared manual DB Cluster Snapshots from other
     * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
     * The default is `false`.
     * 
     */
    @Import(name="includeShared")
      private final @Nullable Boolean includeShared;

    public Optional<Boolean> includeShared() {
        return this.includeShared == null ? Optional.empty() : Optional.ofNullable(this.includeShared);
    }

    /**
     * If more than one result is returned, use the most recent Snapshot.
     * 
     */
    @Import(name="mostRecent")
      private final @Nullable Boolean mostRecent;

    public Optional<Boolean> mostRecent() {
        return this.mostRecent == null ? Optional.empty() : Optional.ofNullable(this.mostRecent);
    }

    /**
     * The type of snapshots to be returned. If you don&#39;t specify a SnapshotType
     * value, then both automated and manual DB cluster snapshots are returned. Shared and public DB Cluster Snapshots are not
     * included in the returned results by default. Possible values are, `automated`, `manual`, `shared`, `public` and `awsbackup`.
     * 
     */
    @Import(name="snapshotType")
      private final @Nullable String snapshotType;

    public Optional<String> snapshotType() {
        return this.snapshotType == null ? Optional.empty() : Optional.ofNullable(this.snapshotType);
    }

    /**
     * A map of tags for the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetClusterSnapshotArgs(
        @Nullable String dbClusterIdentifier,
        @Nullable String dbClusterSnapshotIdentifier,
        @Nullable Boolean includePublic,
        @Nullable Boolean includeShared,
        @Nullable Boolean mostRecent,
        @Nullable String snapshotType,
        @Nullable Map<String,String> tags) {
        this.dbClusterIdentifier = dbClusterIdentifier;
        this.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
        this.includePublic = includePublic;
        this.includeShared = includeShared;
        this.mostRecent = mostRecent;
        this.snapshotType = snapshotType;
        this.tags = tags;
    }

    private GetClusterSnapshotArgs() {
        this.dbClusterIdentifier = null;
        this.dbClusterSnapshotIdentifier = null;
        this.includePublic = null;
        this.includeShared = null;
        this.mostRecent = null;
        this.snapshotType = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dbClusterIdentifier;
        private @Nullable String dbClusterSnapshotIdentifier;
        private @Nullable Boolean includePublic;
        private @Nullable Boolean includeShared;
        private @Nullable Boolean mostRecent;
        private @Nullable String snapshotType;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterSnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbClusterIdentifier = defaults.dbClusterIdentifier;
    	      this.dbClusterSnapshotIdentifier = defaults.dbClusterSnapshotIdentifier;
    	      this.includePublic = defaults.includePublic;
    	      this.includeShared = defaults.includeShared;
    	      this.mostRecent = defaults.mostRecent;
    	      this.snapshotType = defaults.snapshotType;
    	      this.tags = defaults.tags;
        }

        public Builder dbClusterIdentifier(@Nullable String dbClusterIdentifier) {
            this.dbClusterIdentifier = dbClusterIdentifier;
            return this;
        }
        public Builder dbClusterSnapshotIdentifier(@Nullable String dbClusterSnapshotIdentifier) {
            this.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
            return this;
        }
        public Builder includePublic(@Nullable Boolean includePublic) {
            this.includePublic = includePublic;
            return this;
        }
        public Builder includeShared(@Nullable Boolean includeShared) {
            this.includeShared = includeShared;
            return this;
        }
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }
        public Builder snapshotType(@Nullable String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetClusterSnapshotArgs build() {
            return new GetClusterSnapshotArgs(dbClusterIdentifier, dbClusterSnapshotIdentifier, includePublic, includeShared, mostRecent, snapshotType, tags);
        }
    }
}
