// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerAuthenticateOidcConfig extends com.pulumi.resources.InvokeArgs {

    public static final ListenerAuthenticateOidcConfig Empty = new ListenerAuthenticateOidcConfig();

    @Import(name="authenticationRequestExtraParams")
      private final @Nullable Object authenticationRequestExtraParams;

    public Optional<Object> authenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams == null ? Optional.empty() : Optional.ofNullable(this.authenticationRequestExtraParams);
    }

    @Import(name="authorizationEndpoint", required=true)
      private final String authorizationEndpoint;

    public String authorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    @Import(name="clientId", required=true)
      private final String clientId;

    public String clientId() {
        return this.clientId;
    }

    @Import(name="clientSecret", required=true)
      private final String clientSecret;

    public String clientSecret() {
        return this.clientSecret;
    }

    @Import(name="issuer", required=true)
      private final String issuer;

    public String issuer() {
        return this.issuer;
    }

    @Import(name="onUnauthenticatedRequest")
      private final @Nullable String onUnauthenticatedRequest;

    public Optional<String> onUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest == null ? Optional.empty() : Optional.ofNullable(this.onUnauthenticatedRequest);
    }

    @Import(name="scope")
      private final @Nullable String scope;

    public Optional<String> scope() {
        return this.scope == null ? Optional.empty() : Optional.ofNullable(this.scope);
    }

    @Import(name="sessionCookieName")
      private final @Nullable String sessionCookieName;

    public Optional<String> sessionCookieName() {
        return this.sessionCookieName == null ? Optional.empty() : Optional.ofNullable(this.sessionCookieName);
    }

    @Import(name="sessionTimeout")
      private final @Nullable String sessionTimeout;

    public Optional<String> sessionTimeout() {
        return this.sessionTimeout == null ? Optional.empty() : Optional.ofNullable(this.sessionTimeout);
    }

    @Import(name="tokenEndpoint", required=true)
      private final String tokenEndpoint;

    public String tokenEndpoint() {
        return this.tokenEndpoint;
    }

    @Import(name="userInfoEndpoint", required=true)
      private final String userInfoEndpoint;

    public String userInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public ListenerAuthenticateOidcConfig(
        @Nullable Object authenticationRequestExtraParams,
        String authorizationEndpoint,
        String clientId,
        String clientSecret,
        String issuer,
        @Nullable String onUnauthenticatedRequest,
        @Nullable String scope,
        @Nullable String sessionCookieName,
        @Nullable String sessionTimeout,
        String tokenEndpoint,
        String userInfoEndpoint) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint, "expected parameter 'authorizationEndpoint' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.clientSecret = Objects.requireNonNull(clientSecret, "expected parameter 'clientSecret' to be non-null");
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint, "expected parameter 'tokenEndpoint' to be non-null");
        this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint, "expected parameter 'userInfoEndpoint' to be non-null");
    }

    private ListenerAuthenticateOidcConfig() {
        this.authenticationRequestExtraParams = null;
        this.authorizationEndpoint = null;
        this.clientId = null;
        this.clientSecret = null;
        this.issuer = null;
        this.onUnauthenticatedRequest = null;
        this.scope = null;
        this.sessionCookieName = null;
        this.sessionTimeout = null;
        this.tokenEndpoint = null;
        this.userInfoEndpoint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerAuthenticateOidcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object authenticationRequestExtraParams;
        private String authorizationEndpoint;
        private String clientId;
        private String clientSecret;
        private String issuer;
        private @Nullable String onUnauthenticatedRequest;
        private @Nullable String scope;
        private @Nullable String sessionCookieName;
        private @Nullable String sessionTimeout;
        private String tokenEndpoint;
        private String userInfoEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerAuthenticateOidcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationRequestExtraParams = defaults.authenticationRequestExtraParams;
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.issuer = defaults.issuer;
    	      this.onUnauthenticatedRequest = defaults.onUnauthenticatedRequest;
    	      this.scope = defaults.scope;
    	      this.sessionCookieName = defaults.sessionCookieName;
    	      this.sessionTimeout = defaults.sessionTimeout;
    	      this.tokenEndpoint = defaults.tokenEndpoint;
    	      this.userInfoEndpoint = defaults.userInfoEndpoint;
        }

        public Builder authenticationRequestExtraParams(@Nullable Object authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }
        public Builder authorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public Builder onUnauthenticatedRequest(@Nullable String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public Builder sessionCookieName(@Nullable String sessionCookieName) {
            this.sessionCookieName = sessionCookieName;
            return this;
        }
        public Builder sessionTimeout(@Nullable String sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }
        public Builder tokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint);
            return this;
        }
        public Builder userInfoEndpoint(String userInfoEndpoint) {
            this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint);
            return this;
        }        public ListenerAuthenticateOidcConfig build() {
            return new ListenerAuthenticateOidcConfig(authenticationRequestExtraParams, authorizationEndpoint, clientId, clientSecret, issuer, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, tokenEndpoint, userInfoEndpoint);
        }
    }
}
