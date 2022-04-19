// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.outputs;

import com.pulumi.azuread.outputs.GetApplicationApiOauth2PermissionScope;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplicationApi {
    /**
     * A set of application IDs (client IDs), used for bundling consent if you have a solution that contains two parts: a client app and a custom web API app.
     * 
     */
    private final List<String> knownClientApplications;
    /**
     * Allows an application to use claims mapping without specifying a custom signing key.
     * 
     */
    private final Boolean mappedClaimsEnabled;
    /**
     * One or more `oauth2_permission_scope` blocks as documented below, to describe delegated permissions exposed by the web API represented by this application.
     * 
     */
    private final List<GetApplicationApiOauth2PermissionScope> oauth2PermissionScopes;
    /**
     * The access token version expected by this resource. Possible values are `1` or `2`.
     * 
     */
    private final Integer requestedAccessTokenVersion;

    @CustomType.Constructor
    private GetApplicationApi(
        @CustomType.Parameter("knownClientApplications") List<String> knownClientApplications,
        @CustomType.Parameter("mappedClaimsEnabled") Boolean mappedClaimsEnabled,
        @CustomType.Parameter("oauth2PermissionScopes") List<GetApplicationApiOauth2PermissionScope> oauth2PermissionScopes,
        @CustomType.Parameter("requestedAccessTokenVersion") Integer requestedAccessTokenVersion) {
        this.knownClientApplications = knownClientApplications;
        this.mappedClaimsEnabled = mappedClaimsEnabled;
        this.oauth2PermissionScopes = oauth2PermissionScopes;
        this.requestedAccessTokenVersion = requestedAccessTokenVersion;
    }

    /**
     * A set of application IDs (client IDs), used for bundling consent if you have a solution that contains two parts: a client app and a custom web API app.
     * 
    */
    public List<String> knownClientApplications() {
        return this.knownClientApplications;
    }
    /**
     * Allows an application to use claims mapping without specifying a custom signing key.
     * 
    */
    public Boolean mappedClaimsEnabled() {
        return this.mappedClaimsEnabled;
    }
    /**
     * One or more `oauth2_permission_scope` blocks as documented below, to describe delegated permissions exposed by the web API represented by this application.
     * 
    */
    public List<GetApplicationApiOauth2PermissionScope> oauth2PermissionScopes() {
        return this.oauth2PermissionScopes;
    }
    /**
     * The access token version expected by this resource. Possible values are `1` or `2`.
     * 
    */
    public Integer requestedAccessTokenVersion() {
        return this.requestedAccessTokenVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationApi defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> knownClientApplications;
        private Boolean mappedClaimsEnabled;
        private List<GetApplicationApiOauth2PermissionScope> oauth2PermissionScopes;
        private Integer requestedAccessTokenVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationApi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.knownClientApplications = defaults.knownClientApplications;
    	      this.mappedClaimsEnabled = defaults.mappedClaimsEnabled;
    	      this.oauth2PermissionScopes = defaults.oauth2PermissionScopes;
    	      this.requestedAccessTokenVersion = defaults.requestedAccessTokenVersion;
        }

        public Builder knownClientApplications(List<String> knownClientApplications) {
            this.knownClientApplications = Objects.requireNonNull(knownClientApplications);
            return this;
        }
        public Builder knownClientApplications(String... knownClientApplications) {
            return knownClientApplications(List.of(knownClientApplications));
        }
        public Builder mappedClaimsEnabled(Boolean mappedClaimsEnabled) {
            this.mappedClaimsEnabled = Objects.requireNonNull(mappedClaimsEnabled);
            return this;
        }
        public Builder oauth2PermissionScopes(List<GetApplicationApiOauth2PermissionScope> oauth2PermissionScopes) {
            this.oauth2PermissionScopes = Objects.requireNonNull(oauth2PermissionScopes);
            return this;
        }
        public Builder oauth2PermissionScopes(GetApplicationApiOauth2PermissionScope... oauth2PermissionScopes) {
            return oauth2PermissionScopes(List.of(oauth2PermissionScopes));
        }
        public Builder requestedAccessTokenVersion(Integer requestedAccessTokenVersion) {
            this.requestedAccessTokenVersion = Objects.requireNonNull(requestedAccessTokenVersion);
            return this;
        }        public GetApplicationApi build() {
            return new GetApplicationApi(knownClientApplications, mappedClaimsEnabled, oauth2PermissionScopes, requestedAccessTokenVersion);
        }
    }
}
