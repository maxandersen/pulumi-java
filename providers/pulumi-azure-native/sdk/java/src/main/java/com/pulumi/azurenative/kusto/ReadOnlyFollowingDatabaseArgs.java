// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReadOnlyFollowingDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReadOnlyFollowingDatabaseArgs Empty = new ReadOnlyFollowingDatabaseArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName == null ? Codegen.empty() : this.databaseName;
    }

    /**
     * The time the data should be kept in cache for fast queries in TimeSpan.
     * 
     */
    @Import(name="hotCachePeriod")
      private final @Nullable Output<String> hotCachePeriod;

    public Output<String> hotCachePeriod() {
        return this.hotCachePeriod == null ? Codegen.empty() : this.hotCachePeriod;
    }

    /**
     * Kind of the database
     * Expected value is &#39;ReadOnlyFollowing&#39;.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    public ReadOnlyFollowingDatabaseArgs(
        Output<String> clusterName,
        @Nullable Output<String> databaseName,
        @Nullable Output<String> hotCachePeriod,
        Output<String> kind,
        @Nullable Output<String> location,
        Output<String> resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.databaseName = databaseName;
        this.hotCachePeriod = hotCachePeriod;
        this.kind = Codegen.stringProp("kind").output().arg(kind).require();
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ReadOnlyFollowingDatabaseArgs() {
        this.clusterName = Codegen.empty();
        this.databaseName = Codegen.empty();
        this.hotCachePeriod = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReadOnlyFollowingDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterName;
        private @Nullable Output<String> databaseName;
        private @Nullable Output<String> hotCachePeriod;
        private Output<String> kind;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReadOnlyFollowingDatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.databaseName = defaults.databaseName;
    	      this.hotCachePeriod = defaults.hotCachePeriod;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Codegen.ofNullable(databaseName);
            return this;
        }
        public Builder hotCachePeriod(@Nullable Output<String> hotCachePeriod) {
            this.hotCachePeriod = hotCachePeriod;
            return this;
        }
        public Builder hotCachePeriod(@Nullable String hotCachePeriod) {
            this.hotCachePeriod = Codegen.ofNullable(hotCachePeriod);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public ReadOnlyFollowingDatabaseArgs build() {
            return new ReadOnlyFollowingDatabaseArgs(clusterName, databaseName, hotCachePeriod, kind, location, resourceGroupName);
        }
    }
}
