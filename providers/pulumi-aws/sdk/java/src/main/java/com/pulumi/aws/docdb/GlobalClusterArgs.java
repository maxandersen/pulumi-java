// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.docdb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalClusterArgs Empty = new GlobalClusterArgs();

    /**
     * Name for an automatically created database on cluster creation.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName == null ? Codegen.empty() : this.databaseName;
    }

    /**
     * If the Global Cluster should have deletion protection enabled. The database can&#39;t be deleted when this value is set to `true`. The default is `false`.
     * 
     */
    @Import(name="deletionProtection")
      private final @Nullable Output<Boolean> deletionProtection;

    public Output<Boolean> deletionProtection() {
        return this.deletionProtection == null ? Codegen.empty() : this.deletionProtection;
    }

    @Import(name="engine")
      private final @Nullable Output<String> engine;

    public Output<String> engine() {
        return this.engine == null ? Codegen.empty() : this.engine;
    }

    /**
     * Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
     * * **NOTE:** Upgrading major versions is not supported.
     * 
     */
    @Import(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> engineVersion() {
        return this.engineVersion == null ? Codegen.empty() : this.engineVersion;
    }

    /**
     * The global cluster identifier.
     * 
     */
    @Import(name="globalClusterIdentifier", required=true)
      private final Output<String> globalClusterIdentifier;

    public Output<String> globalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    @Import(name="sourceDbClusterIdentifier")
      private final @Nullable Output<String> sourceDbClusterIdentifier;

    public Output<String> sourceDbClusterIdentifier() {
        return this.sourceDbClusterIdentifier == null ? Codegen.empty() : this.sourceDbClusterIdentifier;
    }

    @Import(name="storageEncrypted")
      private final @Nullable Output<Boolean> storageEncrypted;

    public Output<Boolean> storageEncrypted() {
        return this.storageEncrypted == null ? Codegen.empty() : this.storageEncrypted;
    }

    public GlobalClusterArgs(
        @Nullable Output<String> databaseName,
        @Nullable Output<Boolean> deletionProtection,
        @Nullable Output<String> engine,
        @Nullable Output<String> engineVersion,
        Output<String> globalClusterIdentifier,
        @Nullable Output<String> sourceDbClusterIdentifier,
        @Nullable Output<Boolean> storageEncrypted) {
        this.databaseName = databaseName;
        this.deletionProtection = deletionProtection;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.globalClusterIdentifier = Objects.requireNonNull(globalClusterIdentifier, "expected parameter 'globalClusterIdentifier' to be non-null");
        this.sourceDbClusterIdentifier = sourceDbClusterIdentifier;
        this.storageEncrypted = storageEncrypted;
    }

    private GlobalClusterArgs() {
        this.databaseName = Codegen.empty();
        this.deletionProtection = Codegen.empty();
        this.engine = Codegen.empty();
        this.engineVersion = Codegen.empty();
        this.globalClusterIdentifier = Codegen.empty();
        this.sourceDbClusterIdentifier = Codegen.empty();
        this.storageEncrypted = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> databaseName;
        private @Nullable Output<Boolean> deletionProtection;
        private @Nullable Output<String> engine;
        private @Nullable Output<String> engineVersion;
        private Output<String> globalClusterIdentifier;
        private @Nullable Output<String> sourceDbClusterIdentifier;
        private @Nullable Output<Boolean> storageEncrypted;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.globalClusterIdentifier = defaults.globalClusterIdentifier;
    	      this.sourceDbClusterIdentifier = defaults.sourceDbClusterIdentifier;
    	      this.storageEncrypted = defaults.storageEncrypted;
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Codegen.ofNullable(databaseName);
            return this;
        }
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Codegen.ofNullable(deletionProtection);
            return this;
        }
        public Builder engine(@Nullable Output<String> engine) {
            this.engine = engine;
            return this;
        }
        public Builder engine(@Nullable String engine) {
            this.engine = Codegen.ofNullable(engine);
            return this;
        }
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public Builder engineVersion(@Nullable String engineVersion) {
            this.engineVersion = Codegen.ofNullable(engineVersion);
            return this;
        }
        public Builder globalClusterIdentifier(Output<String> globalClusterIdentifier) {
            this.globalClusterIdentifier = Objects.requireNonNull(globalClusterIdentifier);
            return this;
        }
        public Builder globalClusterIdentifier(String globalClusterIdentifier) {
            this.globalClusterIdentifier = Output.of(Objects.requireNonNull(globalClusterIdentifier));
            return this;
        }
        public Builder sourceDbClusterIdentifier(@Nullable Output<String> sourceDbClusterIdentifier) {
            this.sourceDbClusterIdentifier = sourceDbClusterIdentifier;
            return this;
        }
        public Builder sourceDbClusterIdentifier(@Nullable String sourceDbClusterIdentifier) {
            this.sourceDbClusterIdentifier = Codegen.ofNullable(sourceDbClusterIdentifier);
            return this;
        }
        public Builder storageEncrypted(@Nullable Output<Boolean> storageEncrypted) {
            this.storageEncrypted = storageEncrypted;
            return this;
        }
        public Builder storageEncrypted(@Nullable Boolean storageEncrypted) {
            this.storageEncrypted = Codegen.ofNullable(storageEncrypted);
            return this;
        }        public GlobalClusterArgs build() {
            return new GlobalClusterArgs(databaseName, deletionProtection, engine, engineVersion, globalClusterIdentifier, sourceDbClusterIdentifier, storageEncrypted);
        }
    }
}
