// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache;

import io.pulumi.azurenative.cache.enums.ClusteringPolicy;
import io.pulumi.azurenative.cache.enums.EvictionPolicy;
import io.pulumi.azurenative.cache.enums.Protocol;
import io.pulumi.azurenative.cache.inputs.ModuleArgs;
import io.pulumi.azurenative.cache.inputs.PersistenceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    /**
     * Specifies whether redis clients can connect using TLS-encrypted or plaintext redis protocols. Default is TLS-encrypted.
     * 
     */
    @Import(name="clientProtocol")
      private final @Nullable Output<Either<String,Protocol>> clientProtocol;

    public Output<Either<String,Protocol>> clientProtocol() {
        return this.clientProtocol == null ? Codegen.empty() : this.clientProtocol;
    }

    /**
     * The name of the RedisEnterprise cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Clustering policy - default is OSSCluster. Specified at create time.
     * 
     */
    @Import(name="clusteringPolicy")
      private final @Nullable Output<Either<String,ClusteringPolicy>> clusteringPolicy;

    public Output<Either<String,ClusteringPolicy>> clusteringPolicy() {
        return this.clusteringPolicy == null ? Codegen.empty() : this.clusteringPolicy;
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName == null ? Codegen.empty() : this.databaseName;
    }

    /**
     * Redis eviction policy - default is VolatileLRU
     * 
     */
    @Import(name="evictionPolicy")
      private final @Nullable Output<Either<String,EvictionPolicy>> evictionPolicy;

    public Output<Either<String,EvictionPolicy>> evictionPolicy() {
        return this.evictionPolicy == null ? Codegen.empty() : this.evictionPolicy;
    }

    /**
     * Optional set of redis modules to enable in this database - modules can only be added at creation time.
     * 
     */
    @Import(name="modules")
      private final @Nullable Output<List<ModuleArgs>> modules;

    public Output<List<ModuleArgs>> modules() {
        return this.modules == null ? Codegen.empty() : this.modules;
    }

    /**
     * Persistence settings
     * 
     */
    @Import(name="persistence")
      private final @Nullable Output<PersistenceArgs> persistence;

    public Output<PersistenceArgs> persistence() {
        return this.persistence == null ? Codegen.empty() : this.persistence;
    }

    /**
     * TCP port of the database endpoint. Specified at create time. Defaults to an available port.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    public DatabaseArgs(
        @Nullable Output<Either<String,Protocol>> clientProtocol,
        Output<String> clusterName,
        @Nullable Output<Either<String,ClusteringPolicy>> clusteringPolicy,
        @Nullable Output<String> databaseName,
        @Nullable Output<Either<String,EvictionPolicy>> evictionPolicy,
        @Nullable Output<List<ModuleArgs>> modules,
        @Nullable Output<PersistenceArgs> persistence,
        @Nullable Output<Integer> port,
        Output<String> resourceGroupName) {
        this.clientProtocol = clientProtocol;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusteringPolicy = clusteringPolicy;
        this.databaseName = databaseName;
        this.evictionPolicy = evictionPolicy;
        this.modules = modules;
        this.persistence = persistence;
        this.port = port;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private DatabaseArgs() {
        this.clientProtocol = Codegen.empty();
        this.clusterName = Codegen.empty();
        this.clusteringPolicy = Codegen.empty();
        this.databaseName = Codegen.empty();
        this.evictionPolicy = Codegen.empty();
        this.modules = Codegen.empty();
        this.persistence = Codegen.empty();
        this.port = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,Protocol>> clientProtocol;
        private Output<String> clusterName;
        private @Nullable Output<Either<String,ClusteringPolicy>> clusteringPolicy;
        private @Nullable Output<String> databaseName;
        private @Nullable Output<Either<String,EvictionPolicy>> evictionPolicy;
        private @Nullable Output<List<ModuleArgs>> modules;
        private @Nullable Output<PersistenceArgs> persistence;
        private @Nullable Output<Integer> port;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientProtocol = defaults.clientProtocol;
    	      this.clusterName = defaults.clusterName;
    	      this.clusteringPolicy = defaults.clusteringPolicy;
    	      this.databaseName = defaults.databaseName;
    	      this.evictionPolicy = defaults.evictionPolicy;
    	      this.modules = defaults.modules;
    	      this.persistence = defaults.persistence;
    	      this.port = defaults.port;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder clientProtocol(@Nullable Output<Either<String,Protocol>> clientProtocol) {
            this.clientProtocol = clientProtocol;
            return this;
        }
        public Builder clientProtocol(@Nullable Either<String,Protocol> clientProtocol) {
            this.clientProtocol = Codegen.ofNullable(clientProtocol);
            return this;
        }
        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder clusteringPolicy(@Nullable Output<Either<String,ClusteringPolicy>> clusteringPolicy) {
            this.clusteringPolicy = clusteringPolicy;
            return this;
        }
        public Builder clusteringPolicy(@Nullable Either<String,ClusteringPolicy> clusteringPolicy) {
            this.clusteringPolicy = Codegen.ofNullable(clusteringPolicy);
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
        public Builder evictionPolicy(@Nullable Output<Either<String,EvictionPolicy>> evictionPolicy) {
            this.evictionPolicy = evictionPolicy;
            return this;
        }
        public Builder evictionPolicy(@Nullable Either<String,EvictionPolicy> evictionPolicy) {
            this.evictionPolicy = Codegen.ofNullable(evictionPolicy);
            return this;
        }
        public Builder modules(@Nullable Output<List<ModuleArgs>> modules) {
            this.modules = modules;
            return this;
        }
        public Builder modules(@Nullable List<ModuleArgs> modules) {
            this.modules = Codegen.ofNullable(modules);
            return this;
        }
        public Builder modules(ModuleArgs... modules) {
            return modules(List.of(modules));
        }
        public Builder persistence(@Nullable Output<PersistenceArgs> persistence) {
            this.persistence = persistence;
            return this;
        }
        public Builder persistence(@Nullable PersistenceArgs persistence) {
            this.persistence = Codegen.ofNullable(persistence);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public DatabaseArgs build() {
            return new DatabaseArgs(clientProtocol, clusterName, clusteringPolicy, databaseName, evictionPolicy, modules, persistence, port, resourceGroupName);
        }
    }
}
