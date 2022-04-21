// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleActionAuthenticateOidcArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionAuthenticateOidcArgs Empty = new ListenerRuleActionAuthenticateOidcArgs();

    /**
     * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
     */
    @Import(name="authenticationRequestExtraParams")
    private @Nullable Output<Map<String,String>> authenticationRequestExtraParams;

    public Optional<Output<Map<String,String>>> authenticationRequestExtraParams() {
        return Optional.ofNullable(this.authenticationRequestExtraParams);
    }

    /**
     * The authorization endpoint of the IdP.
     * 
     */
    @Import(name="authorizationEndpoint", required=true)
    private Output<String> authorizationEndpoint;

    public Output<String> authorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * The OAuth 2.0 client identifier.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The OAuth 2.0 client secret.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * The OIDC issuer identifier of the IdP.
     * 
     */
    @Import(name="issuer", required=true)
    private Output<String> issuer;

    public Output<String> issuer() {
        return this.issuer;
    }

    /**
     * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
     */
    @Import(name="onUnauthenticatedRequest")
    private @Nullable Output<String> onUnauthenticatedRequest;

    public Optional<Output<String>> onUnauthenticatedRequest() {
        return Optional.ofNullable(this.onUnauthenticatedRequest);
    }

    /**
     * The set of user claims to be requested from the IdP.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * The name of the cookie used to maintain session information.
     * 
     */
    @Import(name="sessionCookieName")
    private @Nullable Output<String> sessionCookieName;

    public Optional<Output<String>> sessionCookieName() {
        return Optional.ofNullable(this.sessionCookieName);
    }

    /**
     * The maximum duration of the authentication session, in seconds.
     * 
     */
    @Import(name="sessionTimeout")
    private @Nullable Output<Integer> sessionTimeout;

    public Optional<Output<Integer>> sessionTimeout() {
        return Optional.ofNullable(this.sessionTimeout);
    }

    /**
     * The token endpoint of the IdP.
     * 
     */
    @Import(name="tokenEndpoint", required=true)
    private Output<String> tokenEndpoint;

    public Output<String> tokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * The user info endpoint of the IdP.
     * 
     */
    @Import(name="userInfoEndpoint", required=true)
    private Output<String> userInfoEndpoint;

    public Output<String> userInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    private ListenerRuleActionAuthenticateOidcArgs() {}

    private ListenerRuleActionAuthenticateOidcArgs(ListenerRuleActionAuthenticateOidcArgs $) {
        this.authenticationRequestExtraParams = $.authenticationRequestExtraParams;
        this.authorizationEndpoint = $.authorizationEndpoint;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.issuer = $.issuer;
        this.onUnauthenticatedRequest = $.onUnauthenticatedRequest;
        this.scope = $.scope;
        this.sessionCookieName = $.sessionCookieName;
        this.sessionTimeout = $.sessionTimeout;
        this.tokenEndpoint = $.tokenEndpoint;
        this.userInfoEndpoint = $.userInfoEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleActionAuthenticateOidcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleActionAuthenticateOidcArgs $;

        public Builder() {
            $ = new ListenerRuleActionAuthenticateOidcArgs();
        }

        public Builder(ListenerRuleActionAuthenticateOidcArgs defaults) {
            $ = new ListenerRuleActionAuthenticateOidcArgs(Objects.requireNonNull(defaults));
        }

        public Builder authenticationRequestExtraParams(@Nullable Output<Map<String,String>> authenticationRequestExtraParams) {
            $.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }

        public Builder authenticationRequestExtraParams(Map<String,String> authenticationRequestExtraParams) {
            return authenticationRequestExtraParams(Output.of(authenticationRequestExtraParams));
        }

        public Builder authorizationEndpoint(Output<String> authorizationEndpoint) {
            $.authorizationEndpoint = authorizationEndpoint;
            return this;
        }

        public Builder authorizationEndpoint(String authorizationEndpoint) {
            return authorizationEndpoint(Output.of(authorizationEndpoint));
        }

        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public Builder issuer(Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        public Builder onUnauthenticatedRequest(@Nullable Output<String> onUnauthenticatedRequest) {
            $.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }

        public Builder onUnauthenticatedRequest(String onUnauthenticatedRequest) {
            return onUnauthenticatedRequest(Output.of(onUnauthenticatedRequest));
        }

        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public Builder sessionCookieName(@Nullable Output<String> sessionCookieName) {
            $.sessionCookieName = sessionCookieName;
            return this;
        }

        public Builder sessionCookieName(String sessionCookieName) {
            return sessionCookieName(Output.of(sessionCookieName));
        }

        public Builder sessionTimeout(@Nullable Output<Integer> sessionTimeout) {
            $.sessionTimeout = sessionTimeout;
            return this;
        }

        public Builder sessionTimeout(Integer sessionTimeout) {
            return sessionTimeout(Output.of(sessionTimeout));
        }

        public Builder tokenEndpoint(Output<String> tokenEndpoint) {
            $.tokenEndpoint = tokenEndpoint;
            return this;
        }

        public Builder tokenEndpoint(String tokenEndpoint) {
            return tokenEndpoint(Output.of(tokenEndpoint));
        }

        public Builder userInfoEndpoint(Output<String> userInfoEndpoint) {
            $.userInfoEndpoint = userInfoEndpoint;
            return this;
        }

        public Builder userInfoEndpoint(String userInfoEndpoint) {
            return userInfoEndpoint(Output.of(userInfoEndpoint));
        }

        public ListenerRuleActionAuthenticateOidcArgs build() {
            $.authorizationEndpoint = Objects.requireNonNull($.authorizationEndpoint, "expected parameter 'authorizationEndpoint' to be non-null");
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            $.issuer = Objects.requireNonNull($.issuer, "expected parameter 'issuer' to be non-null");
            $.tokenEndpoint = Objects.requireNonNull($.tokenEndpoint, "expected parameter 'tokenEndpoint' to be non-null");
            $.userInfoEndpoint = Objects.requireNonNull($.userInfoEndpoint, "expected parameter 'userInfoEndpoint' to be non-null");
            return $;
        }
    }

}
