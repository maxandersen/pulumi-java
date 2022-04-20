// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GlobalValidationResponse {
    /**
     * The paths for which unauthenticated flow would not be redirected to the login page.
     * 
     */
    private final @Nullable List<String> excludedPaths;
    /**
     * The default authentication provider to use when multiple providers are configured.
     * This setting is only needed if multiple providers are configured and the unauthenticated client
     * action is set to &#34;RedirectToLoginPage&#34;.
     * 
     */
    private final @Nullable String redirectToProvider;
    /**
     * &lt;code&gt;true&lt;/code&gt; if the authentication flow is required any request is made; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    private final @Nullable Boolean requireAuthentication;
    /**
     * The action to take when an unauthenticated client attempts to access the app.
     * 
     */
    private final @Nullable String unauthenticatedClientAction;

    @CustomType.Constructor
    private GlobalValidationResponse(
        @CustomType.Parameter("excludedPaths") @Nullable List<String> excludedPaths,
        @CustomType.Parameter("redirectToProvider") @Nullable String redirectToProvider,
        @CustomType.Parameter("requireAuthentication") @Nullable Boolean requireAuthentication,
        @CustomType.Parameter("unauthenticatedClientAction") @Nullable String unauthenticatedClientAction) {
        this.excludedPaths = excludedPaths;
        this.redirectToProvider = redirectToProvider;
        this.requireAuthentication = requireAuthentication;
        this.unauthenticatedClientAction = unauthenticatedClientAction;
    }

    /**
     * The paths for which unauthenticated flow would not be redirected to the login page.
     * 
    */
    public List<String> excludedPaths() {
        return this.excludedPaths == null ? List.of() : this.excludedPaths;
    }
    /**
     * The default authentication provider to use when multiple providers are configured.
     * This setting is only needed if multiple providers are configured and the unauthenticated client
     * action is set to &#34;RedirectToLoginPage&#34;.
     * 
    */
    public Optional<String> redirectToProvider() {
        return Optional.ofNullable(this.redirectToProvider);
    }
    /**
     * &lt;code&gt;true&lt;/code&gt; if the authentication flow is required any request is made; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
    */
    public Optional<Boolean> requireAuthentication() {
        return Optional.ofNullable(this.requireAuthentication);
    }
    /**
     * The action to take when an unauthenticated client attempts to access the app.
     * 
    */
    public Optional<String> unauthenticatedClientAction() {
        return Optional.ofNullable(this.unauthenticatedClientAction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalValidationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludedPaths;
        private @Nullable String redirectToProvider;
        private @Nullable Boolean requireAuthentication;
        private @Nullable String unauthenticatedClientAction;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalValidationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedPaths = defaults.excludedPaths;
    	      this.redirectToProvider = defaults.redirectToProvider;
    	      this.requireAuthentication = defaults.requireAuthentication;
    	      this.unauthenticatedClientAction = defaults.unauthenticatedClientAction;
        }

        public Builder excludedPaths(@Nullable List<String> excludedPaths) {
            this.excludedPaths = excludedPaths;
            return this;
        }
        public Builder excludedPaths(String... excludedPaths) {
            return excludedPaths(List.of(excludedPaths));
        }
        public Builder redirectToProvider(@Nullable String redirectToProvider) {
            this.redirectToProvider = redirectToProvider;
            return this;
        }
        public Builder requireAuthentication(@Nullable Boolean requireAuthentication) {
            this.requireAuthentication = requireAuthentication;
            return this;
        }
        public Builder unauthenticatedClientAction(@Nullable String unauthenticatedClientAction) {
            this.unauthenticatedClientAction = unauthenticatedClientAction;
            return this;
        }        public GlobalValidationResponse build() {
            return new GlobalValidationResponse(excludedPaths, redirectToProvider, requireAuthentication, unauthenticatedClientAction);
        }
    }
}
