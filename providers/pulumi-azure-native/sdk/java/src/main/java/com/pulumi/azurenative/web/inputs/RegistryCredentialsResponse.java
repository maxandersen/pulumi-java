// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App Private Registry
 * 
 */
public final class RegistryCredentialsResponse extends com.pulumi.resources.InvokeArgs {

    public static final RegistryCredentialsResponse Empty = new RegistryCredentialsResponse();

    /**
     * The name of the Secret that contains the registry login password
     * 
     */
    @Import(name="passwordSecretRef")
      private final @Nullable String passwordSecretRef;

    public Optional<String> passwordSecretRef() {
        return this.passwordSecretRef == null ? Optional.empty() : Optional.ofNullable(this.passwordSecretRef);
    }

    /**
     * Container Registry Server
     * 
     */
    @Import(name="server")
      private final @Nullable String server;

    public Optional<String> server() {
        return this.server == null ? Optional.empty() : Optional.ofNullable(this.server);
    }

    /**
     * Container Registry Username
     * 
     */
    @Import(name="username")
      private final @Nullable String username;

    public Optional<String> username() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public RegistryCredentialsResponse(
        @Nullable String passwordSecretRef,
        @Nullable String server,
        @Nullable String username) {
        this.passwordSecretRef = passwordSecretRef;
        this.server = server;
        this.username = username;
    }

    private RegistryCredentialsResponse() {
        this.passwordSecretRef = null;
        this.server = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String passwordSecretRef;
        private @Nullable String server;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordSecretRef = defaults.passwordSecretRef;
    	      this.server = defaults.server;
    	      this.username = defaults.username;
        }

        public Builder passwordSecretRef(@Nullable String passwordSecretRef) {
            this.passwordSecretRef = passwordSecretRef;
            return this;
        }
        public Builder server(@Nullable String server) {
            this.server = server;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public RegistryCredentialsResponse build() {
            return new RegistryCredentialsResponse(passwordSecretRef, server, username);
        }
    }
}
