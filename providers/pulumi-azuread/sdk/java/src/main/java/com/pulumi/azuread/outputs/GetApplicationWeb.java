// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.outputs;

import com.pulumi.azuread.outputs.GetApplicationWebImplicitGrant;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplicationWeb {
    /**
     * Home page or landing page of the application.
     * 
     */
    private final String homepageUrl;
    /**
     * An `implicit_grant` block as documented above.
     * 
     */
    private final List<GetApplicationWebImplicitGrant> implicitGrants;
    /**
     * The URL that will be used by Microsoft's authorization service to sign out a user using front-channel, back-channel or SAML logout protocols.
     * 
     */
    private final String logoutUrl;
    /**
     * A list of URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent.
     * 
     */
    private final List<String> redirectUris;

    @CustomType.Constructor
    private GetApplicationWeb(
        @CustomType.Parameter("homepageUrl") String homepageUrl,
        @CustomType.Parameter("implicitGrants") List<GetApplicationWebImplicitGrant> implicitGrants,
        @CustomType.Parameter("logoutUrl") String logoutUrl,
        @CustomType.Parameter("redirectUris") List<String> redirectUris) {
        this.homepageUrl = homepageUrl;
        this.implicitGrants = implicitGrants;
        this.logoutUrl = logoutUrl;
        this.redirectUris = redirectUris;
    }

    /**
     * Home page or landing page of the application.
     * 
    */
    public String homepageUrl() {
        return this.homepageUrl;
    }
    /**
     * An `implicit_grant` block as documented above.
     * 
    */
    public List<GetApplicationWebImplicitGrant> implicitGrants() {
        return this.implicitGrants;
    }
    /**
     * The URL that will be used by Microsoft's authorization service to sign out a user using front-channel, back-channel or SAML logout protocols.
     * 
    */
    public String logoutUrl() {
        return this.logoutUrl;
    }
    /**
     * A list of URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent.
     * 
    */
    public List<String> redirectUris() {
        return this.redirectUris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationWeb defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String homepageUrl;
        private List<GetApplicationWebImplicitGrant> implicitGrants;
        private String logoutUrl;
        private List<String> redirectUris;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationWeb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.homepageUrl = defaults.homepageUrl;
    	      this.implicitGrants = defaults.implicitGrants;
    	      this.logoutUrl = defaults.logoutUrl;
    	      this.redirectUris = defaults.redirectUris;
        }

        public Builder homepageUrl(String homepageUrl) {
            this.homepageUrl = Objects.requireNonNull(homepageUrl);
            return this;
        }
        public Builder implicitGrants(List<GetApplicationWebImplicitGrant> implicitGrants) {
            this.implicitGrants = Objects.requireNonNull(implicitGrants);
            return this;
        }
        public Builder implicitGrants(GetApplicationWebImplicitGrant... implicitGrants) {
            return implicitGrants(List.of(implicitGrants));
        }
        public Builder logoutUrl(String logoutUrl) {
            this.logoutUrl = Objects.requireNonNull(logoutUrl);
            return this;
        }
        public Builder redirectUris(List<String> redirectUris) {
            this.redirectUris = Objects.requireNonNull(redirectUris);
            return this;
        }
        public Builder redirectUris(String... redirectUris) {
            return redirectUris(List.of(redirectUris));
        }        public GetApplicationWeb build() {
            return new GetApplicationWeb(homepageUrl, implicitGrants, logoutUrl, redirectUris);
        }
    }
}
