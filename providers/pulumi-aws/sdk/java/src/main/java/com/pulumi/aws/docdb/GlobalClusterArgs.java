// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.docdb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalClusterArgs Empty = new GlobalClusterArgs();

    /**
     * Name for an automatically created database on cluster creation.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * If the Global Cluster should have deletion protection enabled. The database can&#39;t be deleted when this value is set to `true`. The default is `false`.
     * 
     */
    @Import(name="deletionProtection")
    private @Nullable Output<Boolean> deletionProtection;

    public Optional<Output<Boolean>> deletionProtection() {
        return Optional.ofNullable(this.deletionProtection);
    }

    @Import(name="engine")
    private @Nullable Output<String> engine;

    public Optional<Output<String>> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
     * * **NOTE:** Upgrading major versions is not supported.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * The global cluster identifier.
     * 
     */
    @Import(name="globalClusterIdentifier", required=true)
    private Output<String> globalClusterIdentifier;

    public Output<String> globalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    @Import(name="sourceDbClusterIdentifier")
    private @Nullable Output<String> sourceDbClusterIdentifier;

    public Optional<Output<String>> sourceDbClusterIdentifier() {
        return Optional.ofNullable(this.sourceDbClusterIdentifier);
    }

    @Import(name="storageEncrypted")
    private @Nullable Output<Boolean> storageEncrypted;

    public Optional<Output<Boolean>> storageEncrypted() {
        return Optional.ofNullable(this.storageEncrypted);
    }

    private GlobalClusterArgs() {}

    private GlobalClusterArgs(GlobalClusterArgs $) {
        this.databaseName = $.databaseName;
        this.deletionProtection = $.deletionProtection;
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.globalClusterIdentifier = $.globalClusterIdentifier;
        this.sourceDbClusterIdentifier = $.sourceDbClusterIdentifier;
        this.storageEncrypted = $.storageEncrypted;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalClusterArgs $;

        public Builder() {
            $ = new GlobalClusterArgs();
        }

        public Builder(GlobalClusterArgs defaults) {
            $ = new GlobalClusterArgs(Objects.requireNonNull(defaults));
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            $.deletionProtection = deletionProtection;
            return this;
        }

        public Builder deletionProtection(Boolean deletionProtection) {
            return deletionProtection(Output.of(deletionProtection));
        }

        public Builder engine(@Nullable Output<String> engine) {
            $.engine = engine;
            return this;
        }

        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        public Builder globalClusterIdentifier(Output<String> globalClusterIdentifier) {
            $.globalClusterIdentifier = globalClusterIdentifier;
            return this;
        }

        public Builder globalClusterIdentifier(String globalClusterIdentifier) {
            return globalClusterIdentifier(Output.of(globalClusterIdentifier));
        }

        public Builder sourceDbClusterIdentifier(@Nullable Output<String> sourceDbClusterIdentifier) {
            $.sourceDbClusterIdentifier = sourceDbClusterIdentifier;
            return this;
        }

        public Builder sourceDbClusterIdentifier(String sourceDbClusterIdentifier) {
            return sourceDbClusterIdentifier(Output.of(sourceDbClusterIdentifier));
        }

        public Builder storageEncrypted(@Nullable Output<Boolean> storageEncrypted) {
            $.storageEncrypted = storageEncrypted;
            return this;
        }

        public Builder storageEncrypted(Boolean storageEncrypted) {
            return storageEncrypted(Output.of(storageEncrypted));
        }

        public GlobalClusterArgs build() {
            $.globalClusterIdentifier = Objects.requireNonNull($.globalClusterIdentifier, "expected parameter 'globalClusterIdentifier' to be non-null");
            return $;
        }
    }

}
