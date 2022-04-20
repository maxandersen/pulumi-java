// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.azurenative.apimanagement.outputs.TokenBodyParameterContractResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAuthorizationServerResult {
    /**
     * OAuth authorization endpoint. See http://tools.ietf.org/html/rfc6749#section-3.2.
     * 
     */
    private final String authorizationEndpoint;
    /**
     * HTTP verbs supported by the authorization endpoint. GET must be always present. POST is optional.
     * 
     */
    private final @Nullable List<String> authorizationMethods;
    /**
     * Specifies the mechanism by which access token is passed to the API.
     * 
     */
    private final @Nullable List<String> bearerTokenSendingMethods;
    /**
     * Method of authentication supported by the token endpoint of this authorization server. Possible values are Basic and/or Body. When Body is specified, client credentials and other parameters are passed within the request body in the application/x-www-form-urlencoded format.
     * 
     */
    private final @Nullable List<String> clientAuthenticationMethod;
    /**
     * Client or app id registered with this authorization server.
     * 
     */
    private final String clientId;
    /**
     * Optional reference to a page where client or app registration for this authorization server is performed. Contains absolute URL to entity being referenced.
     * 
     */
    private final String clientRegistrationEndpoint;
    /**
     * Client or app secret registered with this authorization server. This property will not be filled on &#39;GET&#39; operations! Use &#39;/listSecrets&#39; POST request to get the value.
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * Access token scope that is going to be requested by default. Can be overridden at the API level. Should be provided in the form of a string containing space-delimited values.
     * 
     */
    private final @Nullable String defaultScope;
    /**
     * Description of the authorization server. Can contain HTML formatting tags.
     * 
     */
    private final @Nullable String description;
    /**
     * User-friendly authorization server name.
     * 
     */
    private final String displayName;
    /**
     * Form of an authorization grant, which the client uses to request the access token.
     * 
     */
    private final List<String> grantTypes;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password.
     * 
     */
    private final @Nullable String resourceOwnerPassword;
    /**
     * Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username.
     * 
     */
    private final @Nullable String resourceOwnerUsername;
    /**
     * If true, authorization server will include state parameter from the authorization request to its response. Client may use state parameter to raise protocol security.
     * 
     */
    private final @Nullable Boolean supportState;
    /**
     * Additional parameters required by the token endpoint of this authorization server represented as an array of JSON objects with name and value string properties, i.e. {&#34;name&#34; : &#34;name value&#34;, &#34;value&#34;: &#34;a value&#34;}.
     * 
     */
    private final @Nullable List<TokenBodyParameterContractResponse> tokenBodyParameters;
    /**
     * OAuth token endpoint. Contains absolute URI to entity being referenced.
     * 
     */
    private final @Nullable String tokenEndpoint;
    /**
     * Resource type for API Management resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAuthorizationServerResult(
        @CustomType.Parameter("authorizationEndpoint") String authorizationEndpoint,
        @CustomType.Parameter("authorizationMethods") @Nullable List<String> authorizationMethods,
        @CustomType.Parameter("bearerTokenSendingMethods") @Nullable List<String> bearerTokenSendingMethods,
        @CustomType.Parameter("clientAuthenticationMethod") @Nullable List<String> clientAuthenticationMethod,
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientRegistrationEndpoint") String clientRegistrationEndpoint,
        @CustomType.Parameter("clientSecret") @Nullable String clientSecret,
        @CustomType.Parameter("defaultScope") @Nullable String defaultScope,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("grantTypes") List<String> grantTypes,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceOwnerPassword") @Nullable String resourceOwnerPassword,
        @CustomType.Parameter("resourceOwnerUsername") @Nullable String resourceOwnerUsername,
        @CustomType.Parameter("supportState") @Nullable Boolean supportState,
        @CustomType.Parameter("tokenBodyParameters") @Nullable List<TokenBodyParameterContractResponse> tokenBodyParameters,
        @CustomType.Parameter("tokenEndpoint") @Nullable String tokenEndpoint,
        @CustomType.Parameter("type") String type) {
        this.authorizationEndpoint = authorizationEndpoint;
        this.authorizationMethods = authorizationMethods;
        this.bearerTokenSendingMethods = bearerTokenSendingMethods;
        this.clientAuthenticationMethod = clientAuthenticationMethod;
        this.clientId = clientId;
        this.clientRegistrationEndpoint = clientRegistrationEndpoint;
        this.clientSecret = clientSecret;
        this.defaultScope = defaultScope;
        this.description = description;
        this.displayName = displayName;
        this.grantTypes = grantTypes;
        this.id = id;
        this.name = name;
        this.resourceOwnerPassword = resourceOwnerPassword;
        this.resourceOwnerUsername = resourceOwnerUsername;
        this.supportState = supportState;
        this.tokenBodyParameters = tokenBodyParameters;
        this.tokenEndpoint = tokenEndpoint;
        this.type = type;
    }

    /**
     * OAuth authorization endpoint. See http://tools.ietf.org/html/rfc6749#section-3.2.
     * 
    */
    public String authorizationEndpoint() {
        return this.authorizationEndpoint;
    }
    /**
     * HTTP verbs supported by the authorization endpoint. GET must be always present. POST is optional.
     * 
    */
    public List<String> authorizationMethods() {
        return this.authorizationMethods == null ? List.of() : this.authorizationMethods;
    }
    /**
     * Specifies the mechanism by which access token is passed to the API.
     * 
    */
    public List<String> bearerTokenSendingMethods() {
        return this.bearerTokenSendingMethods == null ? List.of() : this.bearerTokenSendingMethods;
    }
    /**
     * Method of authentication supported by the token endpoint of this authorization server. Possible values are Basic and/or Body. When Body is specified, client credentials and other parameters are passed within the request body in the application/x-www-form-urlencoded format.
     * 
    */
    public List<String> clientAuthenticationMethod() {
        return this.clientAuthenticationMethod == null ? List.of() : this.clientAuthenticationMethod;
    }
    /**
     * Client or app id registered with this authorization server.
     * 
    */
    public String clientId() {
        return this.clientId;
    }
    /**
     * Optional reference to a page where client or app registration for this authorization server is performed. Contains absolute URL to entity being referenced.
     * 
    */
    public String clientRegistrationEndpoint() {
        return this.clientRegistrationEndpoint;
    }
    /**
     * Client or app secret registered with this authorization server. This property will not be filled on &#39;GET&#39; operations! Use &#39;/listSecrets&#39; POST request to get the value.
     * 
    */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * Access token scope that is going to be requested by default. Can be overridden at the API level. Should be provided in the form of a string containing space-delimited values.
     * 
    */
    public Optional<String> defaultScope() {
        return Optional.ofNullable(this.defaultScope);
    }
    /**
     * Description of the authorization server. Can contain HTML formatting tags.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * User-friendly authorization server name.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Form of an authorization grant, which the client uses to request the access token.
     * 
    */
    public List<String> grantTypes() {
        return this.grantTypes;
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password.
     * 
    */
    public Optional<String> resourceOwnerPassword() {
        return Optional.ofNullable(this.resourceOwnerPassword);
    }
    /**
     * Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username.
     * 
    */
    public Optional<String> resourceOwnerUsername() {
        return Optional.ofNullable(this.resourceOwnerUsername);
    }
    /**
     * If true, authorization server will include state parameter from the authorization request to its response. Client may use state parameter to raise protocol security.
     * 
    */
    public Optional<Boolean> supportState() {
        return Optional.ofNullable(this.supportState);
    }
    /**
     * Additional parameters required by the token endpoint of this authorization server represented as an array of JSON objects with name and value string properties, i.e. {&#34;name&#34; : &#34;name value&#34;, &#34;value&#34;: &#34;a value&#34;}.
     * 
    */
    public List<TokenBodyParameterContractResponse> tokenBodyParameters() {
        return this.tokenBodyParameters == null ? List.of() : this.tokenBodyParameters;
    }
    /**
     * OAuth token endpoint. Contains absolute URI to entity being referenced.
     * 
    */
    public Optional<String> tokenEndpoint() {
        return Optional.ofNullable(this.tokenEndpoint);
    }
    /**
     * Resource type for API Management resource.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizationServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationEndpoint;
        private @Nullable List<String> authorizationMethods;
        private @Nullable List<String> bearerTokenSendingMethods;
        private @Nullable List<String> clientAuthenticationMethod;
        private String clientId;
        private String clientRegistrationEndpoint;
        private @Nullable String clientSecret;
        private @Nullable String defaultScope;
        private @Nullable String description;
        private String displayName;
        private List<String> grantTypes;
        private String id;
        private String name;
        private @Nullable String resourceOwnerPassword;
        private @Nullable String resourceOwnerUsername;
        private @Nullable Boolean supportState;
        private @Nullable List<TokenBodyParameterContractResponse> tokenBodyParameters;
        private @Nullable String tokenEndpoint;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuthorizationServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.authorizationMethods = defaults.authorizationMethods;
    	      this.bearerTokenSendingMethods = defaults.bearerTokenSendingMethods;
    	      this.clientAuthenticationMethod = defaults.clientAuthenticationMethod;
    	      this.clientId = defaults.clientId;
    	      this.clientRegistrationEndpoint = defaults.clientRegistrationEndpoint;
    	      this.clientSecret = defaults.clientSecret;
    	      this.defaultScope = defaults.defaultScope;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.grantTypes = defaults.grantTypes;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceOwnerPassword = defaults.resourceOwnerPassword;
    	      this.resourceOwnerUsername = defaults.resourceOwnerUsername;
    	      this.supportState = defaults.supportState;
    	      this.tokenBodyParameters = defaults.tokenBodyParameters;
    	      this.tokenEndpoint = defaults.tokenEndpoint;
    	      this.type = defaults.type;
        }

        public Builder authorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
            return this;
        }
        public Builder authorizationMethods(@Nullable List<String> authorizationMethods) {
            this.authorizationMethods = authorizationMethods;
            return this;
        }
        public Builder authorizationMethods(String... authorizationMethods) {
            return authorizationMethods(List.of(authorizationMethods));
        }
        public Builder bearerTokenSendingMethods(@Nullable List<String> bearerTokenSendingMethods) {
            this.bearerTokenSendingMethods = bearerTokenSendingMethods;
            return this;
        }
        public Builder bearerTokenSendingMethods(String... bearerTokenSendingMethods) {
            return bearerTokenSendingMethods(List.of(bearerTokenSendingMethods));
        }
        public Builder clientAuthenticationMethod(@Nullable List<String> clientAuthenticationMethod) {
            this.clientAuthenticationMethod = clientAuthenticationMethod;
            return this;
        }
        public Builder clientAuthenticationMethod(String... clientAuthenticationMethod) {
            return clientAuthenticationMethod(List.of(clientAuthenticationMethod));
        }
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientRegistrationEndpoint(String clientRegistrationEndpoint) {
            this.clientRegistrationEndpoint = Objects.requireNonNull(clientRegistrationEndpoint);
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder defaultScope(@Nullable String defaultScope) {
            this.defaultScope = defaultScope;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder grantTypes(List<String> grantTypes) {
            this.grantTypes = Objects.requireNonNull(grantTypes);
            return this;
        }
        public Builder grantTypes(String... grantTypes) {
            return grantTypes(List.of(grantTypes));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceOwnerPassword(@Nullable String resourceOwnerPassword) {
            this.resourceOwnerPassword = resourceOwnerPassword;
            return this;
        }
        public Builder resourceOwnerUsername(@Nullable String resourceOwnerUsername) {
            this.resourceOwnerUsername = resourceOwnerUsername;
            return this;
        }
        public Builder supportState(@Nullable Boolean supportState) {
            this.supportState = supportState;
            return this;
        }
        public Builder tokenBodyParameters(@Nullable List<TokenBodyParameterContractResponse> tokenBodyParameters) {
            this.tokenBodyParameters = tokenBodyParameters;
            return this;
        }
        public Builder tokenBodyParameters(TokenBodyParameterContractResponse... tokenBodyParameters) {
            return tokenBodyParameters(List.of(tokenBodyParameters));
        }
        public Builder tokenEndpoint(@Nullable String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetAuthorizationServerResult build() {
            return new GetAuthorizationServerResult(authorizationEndpoint, authorizationMethods, bearerTokenSendingMethods, clientAuthenticationMethod, clientId, clientRegistrationEndpoint, clientSecret, defaultScope, description, displayName, grantTypes, id, name, resourceOwnerPassword, resourceOwnerUsername, supportState, tokenBodyParameters, tokenEndpoint, type);
        }
    }
}
