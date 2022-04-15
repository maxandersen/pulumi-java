// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformariadb.inputs;

import io.pulumi.azurenative.dbformariadb.enums.MinimalTlsVersionEnum;
import io.pulumi.azurenative.dbformariadb.enums.PublicNetworkAccessEnum;
import io.pulumi.azurenative.dbformariadb.enums.ServerVersion;
import io.pulumi.azurenative.dbformariadb.enums.SslEnforcementEnum;
import io.pulumi.azurenative.dbformariadb.inputs.StorageProfileArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties used to create a new server.
 * 
 */
public final class ServerPropertiesForDefaultCreateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerPropertiesForDefaultCreateArgs Empty = new ServerPropertiesForDefaultCreateArgs();

    /**
     * The administrator's login name of a server. Can only be specified when the server is being created (and is required for creation).
     * 
     */
    @Import(name="administratorLogin", required=true)
      private final Output<String> administratorLogin;

    public Output<String> administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * The password of the administrator login.
     * 
     */
    @Import(name="administratorLoginPassword", required=true)
      private final Output<String> administratorLoginPassword;

    public Output<String> administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * The mode to create a new server.
     * Expected value is 'Default'.
     * 
     */
    @Import(name="createMode", required=true)
      private final Output<String> createMode;

    public Output<String> createMode() {
        return this.createMode;
    }

    /**
     * Enforce a minimal Tls version for the server.
     * 
     */
    @Import(name="minimalTlsVersion")
      private final @Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion;

    public Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion() {
        return this.minimalTlsVersion == null ? Codegen.empty() : this.minimalTlsVersion;
    }

    /**
     * Whether or not public network access is allowed for this server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess;

    public Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess() {
        return this.publicNetworkAccess == null ? Codegen.empty() : this.publicNetworkAccess;
    }

    /**
     * Enable ssl enforcement or not when connect to server.
     * 
     */
    @Import(name="sslEnforcement")
      private final @Nullable Output<SslEnforcementEnum> sslEnforcement;

    public Output<SslEnforcementEnum> sslEnforcement() {
        return this.sslEnforcement == null ? Codegen.empty() : this.sslEnforcement;
    }

    /**
     * Storage profile of a server.
     * 
     */
    @Import(name="storageProfile")
      private final @Nullable Output<StorageProfileArgs> storageProfile;

    public Output<StorageProfileArgs> storageProfile() {
        return this.storageProfile == null ? Codegen.empty() : this.storageProfile;
    }

    /**
     * Server version.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Either<String,ServerVersion>> version;

    public Output<Either<String,ServerVersion>> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public ServerPropertiesForDefaultCreateArgs(
        Output<String> administratorLogin,
        Output<String> administratorLoginPassword,
        Output<String> createMode,
        @Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion,
        @Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess,
        @Nullable Output<SslEnforcementEnum> sslEnforcement,
        @Nullable Output<StorageProfileArgs> storageProfile,
        @Nullable Output<Either<String,ServerVersion>> version) {
        this.administratorLogin = Objects.requireNonNull(administratorLogin, "expected parameter 'administratorLogin' to be non-null");
        this.administratorLoginPassword = Objects.requireNonNull(administratorLoginPassword, "expected parameter 'administratorLoginPassword' to be non-null");
        this.createMode = Objects.requireNonNull(createMode, "expected parameter 'createMode' to be non-null");
        this.minimalTlsVersion = minimalTlsVersion;
        this.publicNetworkAccess = publicNetworkAccess;
        this.sslEnforcement = sslEnforcement;
        this.storageProfile = storageProfile;
        this.version = version;
    }

    private ServerPropertiesForDefaultCreateArgs() {
        this.administratorLogin = Codegen.empty();
        this.administratorLoginPassword = Codegen.empty();
        this.createMode = Codegen.empty();
        this.minimalTlsVersion = Codegen.empty();
        this.publicNetworkAccess = Codegen.empty();
        this.sslEnforcement = Codegen.empty();
        this.storageProfile = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerPropertiesForDefaultCreateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> administratorLogin;
        private Output<String> administratorLoginPassword;
        private Output<String> createMode;
        private @Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion;
        private @Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess;
        private @Nullable Output<SslEnforcementEnum> sslEnforcement;
        private @Nullable Output<StorageProfileArgs> storageProfile;
        private @Nullable Output<Either<String,ServerVersion>> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerPropertiesForDefaultCreateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.administratorLoginPassword = defaults.administratorLoginPassword;
    	      this.createMode = defaults.createMode;
    	      this.minimalTlsVersion = defaults.minimalTlsVersion;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.sslEnforcement = defaults.sslEnforcement;
    	      this.storageProfile = defaults.storageProfile;
    	      this.version = defaults.version;
        }

        public Builder administratorLogin(Output<String> administratorLogin) {
            this.administratorLogin = Objects.requireNonNull(administratorLogin);
            return this;
        }
        public Builder administratorLogin(String administratorLogin) {
            this.administratorLogin = Output.of(Objects.requireNonNull(administratorLogin));
            return this;
        }
        public Builder administratorLoginPassword(Output<String> administratorLoginPassword) {
            this.administratorLoginPassword = Objects.requireNonNull(administratorLoginPassword);
            return this;
        }
        public Builder administratorLoginPassword(String administratorLoginPassword) {
            this.administratorLoginPassword = Output.of(Objects.requireNonNull(administratorLoginPassword));
            return this;
        }
        public Builder createMode(Output<String> createMode) {
            this.createMode = Objects.requireNonNull(createMode);
            return this;
        }
        public Builder createMode(String createMode) {
            this.createMode = Output.of(Objects.requireNonNull(createMode));
            return this;
        }
        public Builder minimalTlsVersion(@Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion) {
            this.minimalTlsVersion = minimalTlsVersion;
            return this;
        }
        public Builder minimalTlsVersion(@Nullable Either<String,MinimalTlsVersionEnum> minimalTlsVersion) {
            this.minimalTlsVersion = Codegen.ofNullable(minimalTlsVersion);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Either<String,PublicNetworkAccessEnum> publicNetworkAccess) {
            this.publicNetworkAccess = Codegen.ofNullable(publicNetworkAccess);
            return this;
        }
        public Builder sslEnforcement(@Nullable Output<SslEnforcementEnum> sslEnforcement) {
            this.sslEnforcement = sslEnforcement;
            return this;
        }
        public Builder sslEnforcement(@Nullable SslEnforcementEnum sslEnforcement) {
            this.sslEnforcement = Codegen.ofNullable(sslEnforcement);
            return this;
        }
        public Builder storageProfile(@Nullable Output<StorageProfileArgs> storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }
        public Builder storageProfile(@Nullable StorageProfileArgs storageProfile) {
            this.storageProfile = Codegen.ofNullable(storageProfile);
            return this;
        }
        public Builder version(@Nullable Output<Either<String,ServerVersion>> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable Either<String,ServerVersion> version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public ServerPropertiesForDefaultCreateArgs build() {
            return new ServerPropertiesForDefaultCreateArgs(administratorLogin, administratorLoginPassword, createMode, minimalTlsVersion, publicNetworkAccess, sslEnforcement, storageProfile, version);
        }
    }
}
