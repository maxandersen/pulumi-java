// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * vCenter Single Sign On Identity Source
 * 
 */
public final class IdentitySourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final IdentitySourceResponse Empty = new IdentitySourceResponse();

    /**
     * The domain&#39;s NetBIOS name
     * 
     */
    @Import(name="alias")
      private final @Nullable String alias;

    public Optional<String> alias() {
        return this.alias == null ? Optional.empty() : Optional.ofNullable(this.alias);
    }

    /**
     * The base distinguished name for groups
     * 
     */
    @Import(name="baseGroupDN")
      private final @Nullable String baseGroupDN;

    public Optional<String> baseGroupDN() {
        return this.baseGroupDN == null ? Optional.empty() : Optional.ofNullable(this.baseGroupDN);
    }

    /**
     * The base distinguished name for users
     * 
     */
    @Import(name="baseUserDN")
      private final @Nullable String baseUserDN;

    public Optional<String> baseUserDN() {
        return this.baseUserDN == null ? Optional.empty() : Optional.ofNullable(this.baseUserDN);
    }

    /**
     * The domain&#39;s dns name
     * 
     */
    @Import(name="domain")
      private final @Nullable String domain;

    public Optional<String> domain() {
        return this.domain == null ? Optional.empty() : Optional.ofNullable(this.domain);
    }

    /**
     * The name of the identity source
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The password of the Active Directory user with a minimum of read-only access to Base DN for users and groups.
     * 
     */
    @Import(name="password")
      private final @Nullable String password;

    public Optional<String> password() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * Primary server URL
     * 
     */
    @Import(name="primaryServer")
      private final @Nullable String primaryServer;

    public Optional<String> primaryServer() {
        return this.primaryServer == null ? Optional.empty() : Optional.ofNullable(this.primaryServer);
    }

    /**
     * Secondary server URL
     * 
     */
    @Import(name="secondaryServer")
      private final @Nullable String secondaryServer;

    public Optional<String> secondaryServer() {
        return this.secondaryServer == null ? Optional.empty() : Optional.ofNullable(this.secondaryServer);
    }

    /**
     * Protect LDAP communication using SSL certificate (LDAPS)
     * 
     */
    @Import(name="ssl")
      private final @Nullable String ssl;

    public Optional<String> ssl() {
        return this.ssl == null ? Optional.empty() : Optional.ofNullable(this.ssl);
    }

    /**
     * The ID of an Active Directory user with a minimum of read-only access to Base DN for users and group
     * 
     */
    @Import(name="username")
      private final @Nullable String username;

    public Optional<String> username() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public IdentitySourceResponse(
        @Nullable String alias,
        @Nullable String baseGroupDN,
        @Nullable String baseUserDN,
        @Nullable String domain,
        @Nullable String name,
        @Nullable String password,
        @Nullable String primaryServer,
        @Nullable String secondaryServer,
        @Nullable String ssl,
        @Nullable String username) {
        this.alias = alias;
        this.baseGroupDN = baseGroupDN;
        this.baseUserDN = baseUserDN;
        this.domain = domain;
        this.name = name;
        this.password = password;
        this.primaryServer = primaryServer;
        this.secondaryServer = secondaryServer;
        this.ssl = ssl;
        this.username = username;
    }

    private IdentitySourceResponse() {
        this.alias = null;
        this.baseGroupDN = null;
        this.baseUserDN = null;
        this.domain = null;
        this.name = null;
        this.password = null;
        this.primaryServer = null;
        this.secondaryServer = null;
        this.ssl = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentitySourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alias;
        private @Nullable String baseGroupDN;
        private @Nullable String baseUserDN;
        private @Nullable String domain;
        private @Nullable String name;
        private @Nullable String password;
        private @Nullable String primaryServer;
        private @Nullable String secondaryServer;
        private @Nullable String ssl;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentitySourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.baseGroupDN = defaults.baseGroupDN;
    	      this.baseUserDN = defaults.baseUserDN;
    	      this.domain = defaults.domain;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.primaryServer = defaults.primaryServer;
    	      this.secondaryServer = defaults.secondaryServer;
    	      this.ssl = defaults.ssl;
    	      this.username = defaults.username;
        }

        public Builder alias(@Nullable String alias) {
            this.alias = alias;
            return this;
        }
        public Builder baseGroupDN(@Nullable String baseGroupDN) {
            this.baseGroupDN = baseGroupDN;
            return this;
        }
        public Builder baseUserDN(@Nullable String baseUserDN) {
            this.baseUserDN = baseUserDN;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder primaryServer(@Nullable String primaryServer) {
            this.primaryServer = primaryServer;
            return this;
        }
        public Builder secondaryServer(@Nullable String secondaryServer) {
            this.secondaryServer = secondaryServer;
            return this;
        }
        public Builder ssl(@Nullable String ssl) {
            this.ssl = ssl;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public IdentitySourceResponse build() {
            return new IdentitySourceResponse(alias, baseGroupDN, baseUserDN, domain, name, password, primaryServer, secondaryServer, ssl, username);
        }
    }
}
