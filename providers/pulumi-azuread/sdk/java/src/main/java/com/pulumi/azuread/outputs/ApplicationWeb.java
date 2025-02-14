// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.outputs;

import com.pulumi.azuread.outputs.ApplicationWebImplicitGrant;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationWeb {
    /**
     * @return Home page or landing page of the application.
     * 
     */
    private final @Nullable String homepageUrl;
    /**
     * @return An `implicit_grant` block as documented above.
     * 
     */
    private final @Nullable ApplicationWebImplicitGrant implicitGrant;
    /**
     * @return The URL that will be used by Microsoft&#39;s authorization service to sign out a user using front-channel, back-channel or SAML logout protocols.
     * 
     */
    private final @Nullable String logoutUrl;
    /**
     * @return A set of URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent. Must be a valid `http` URL or a URN.
     * 
     */
    private final @Nullable List<String> redirectUris;

    @CustomType.Constructor
    private ApplicationWeb(
        @CustomType.Parameter("homepageUrl") @Nullable String homepageUrl,
        @CustomType.Parameter("implicitGrant") @Nullable ApplicationWebImplicitGrant implicitGrant,
        @CustomType.Parameter("logoutUrl") @Nullable String logoutUrl,
        @CustomType.Parameter("redirectUris") @Nullable List<String> redirectUris) {
        this.homepageUrl = homepageUrl;
        this.implicitGrant = implicitGrant;
        this.logoutUrl = logoutUrl;
        this.redirectUris = redirectUris;
    }

    /**
     * @return Home page or landing page of the application.
     * 
     */
    public Optional<String> homepageUrl() {
        return Optional.ofNullable(this.homepageUrl);
    }
    /**
     * @return An `implicit_grant` block as documented above.
     * 
     */
    public Optional<ApplicationWebImplicitGrant> implicitGrant() {
        return Optional.ofNullable(this.implicitGrant);
    }
    /**
     * @return The URL that will be used by Microsoft&#39;s authorization service to sign out a user using front-channel, back-channel or SAML logout protocols.
     * 
     */
    public Optional<String> logoutUrl() {
        return Optional.ofNullable(this.logoutUrl);
    }
    /**
     * @return A set of URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent. Must be a valid `http` URL or a URN.
     * 
     */
    public List<String> redirectUris() {
        return this.redirectUris == null ? List.of() : this.redirectUris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationWeb defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String homepageUrl;
        private @Nullable ApplicationWebImplicitGrant implicitGrant;
        private @Nullable String logoutUrl;
        private @Nullable List<String> redirectUris;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationWeb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.homepageUrl = defaults.homepageUrl;
    	      this.implicitGrant = defaults.implicitGrant;
    	      this.logoutUrl = defaults.logoutUrl;
    	      this.redirectUris = defaults.redirectUris;
        }

        public Builder homepageUrl(@Nullable String homepageUrl) {
            this.homepageUrl = homepageUrl;
            return this;
        }
        public Builder implicitGrant(@Nullable ApplicationWebImplicitGrant implicitGrant) {
            this.implicitGrant = implicitGrant;
            return this;
        }
        public Builder logoutUrl(@Nullable String logoutUrl) {
            this.logoutUrl = logoutUrl;
            return this;
        }
        public Builder redirectUris(@Nullable List<String> redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public Builder redirectUris(String... redirectUris) {
            return redirectUris(List.of(redirectUris));
        }        public ApplicationWeb build() {
            return new ApplicationWeb(homepageUrl, implicitGrant, logoutUrl, redirectUris);
        }
    }
}
