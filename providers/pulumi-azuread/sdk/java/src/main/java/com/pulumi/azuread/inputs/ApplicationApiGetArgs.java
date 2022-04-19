// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.azuread.inputs.ApplicationApiOauth2PermissionScopeGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApiGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApiGetArgs Empty = new ApplicationApiGetArgs();

    /**
     * A set of application IDs (client IDs), used for bundling consent if you have a solution that contains two parts: a client app and a custom web API app.
     * 
     */
    @Import(name="knownClientApplications")
      private final @Nullable Output<List<String>> knownClientApplications;

    public Output<List<String>> knownClientApplications() {
        return this.knownClientApplications == null ? Codegen.empty() : this.knownClientApplications;
    }

    /**
     * Allows an application to use claims mapping without specifying a custom signing key. Defaults to `false`.
     * 
     */
    @Import(name="mappedClaimsEnabled")
      private final @Nullable Output<Boolean> mappedClaimsEnabled;

    public Output<Boolean> mappedClaimsEnabled() {
        return this.mappedClaimsEnabled == null ? Codegen.empty() : this.mappedClaimsEnabled;
    }

    /**
     * One or more `oauth2_permission_scope` blocks as documented below, to describe delegated permissions exposed by the web API represented by this application.
     * 
     */
    @Import(name="oauth2PermissionScopes")
      private final @Nullable Output<List<ApplicationApiOauth2PermissionScopeGetArgs>> oauth2PermissionScopes;

    public Output<List<ApplicationApiOauth2PermissionScopeGetArgs>> oauth2PermissionScopes() {
        return this.oauth2PermissionScopes == null ? Codegen.empty() : this.oauth2PermissionScopes;
    }

    /**
     * The access token version expected by this resource. Must be one of `1` or `2`, and must be `2` when `sign_in_audience` is either `AzureADandPersonalMicrosoftAccount` or `PersonalMicrosoftAccount` Defaults to `1`.
     * 
     */
    @Import(name="requestedAccessTokenVersion")
      private final @Nullable Output<Integer> requestedAccessTokenVersion;

    public Output<Integer> requestedAccessTokenVersion() {
        return this.requestedAccessTokenVersion == null ? Codegen.empty() : this.requestedAccessTokenVersion;
    }

    public ApplicationApiGetArgs(
        @Nullable Output<List<String>> knownClientApplications,
        @Nullable Output<Boolean> mappedClaimsEnabled,
        @Nullable Output<List<ApplicationApiOauth2PermissionScopeGetArgs>> oauth2PermissionScopes,
        @Nullable Output<Integer> requestedAccessTokenVersion) {
        this.knownClientApplications = knownClientApplications;
        this.mappedClaimsEnabled = mappedClaimsEnabled;
        this.oauth2PermissionScopes = oauth2PermissionScopes;
        this.requestedAccessTokenVersion = requestedAccessTokenVersion;
    }

    private ApplicationApiGetArgs() {
        this.knownClientApplications = Codegen.empty();
        this.mappedClaimsEnabled = Codegen.empty();
        this.oauth2PermissionScopes = Codegen.empty();
        this.requestedAccessTokenVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApiGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> knownClientApplications;
        private @Nullable Output<Boolean> mappedClaimsEnabled;
        private @Nullable Output<List<ApplicationApiOauth2PermissionScopeGetArgs>> oauth2PermissionScopes;
        private @Nullable Output<Integer> requestedAccessTokenVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApiGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.knownClientApplications = defaults.knownClientApplications;
    	      this.mappedClaimsEnabled = defaults.mappedClaimsEnabled;
    	      this.oauth2PermissionScopes = defaults.oauth2PermissionScopes;
    	      this.requestedAccessTokenVersion = defaults.requestedAccessTokenVersion;
        }

        public Builder knownClientApplications(@Nullable Output<List<String>> knownClientApplications) {
            this.knownClientApplications = knownClientApplications;
            return this;
        }
        public Builder knownClientApplications(@Nullable List<String> knownClientApplications) {
            this.knownClientApplications = Codegen.ofNullable(knownClientApplications);
            return this;
        }
        public Builder knownClientApplications(String... knownClientApplications) {
            return knownClientApplications(List.of(knownClientApplications));
        }
        public Builder mappedClaimsEnabled(@Nullable Output<Boolean> mappedClaimsEnabled) {
            this.mappedClaimsEnabled = mappedClaimsEnabled;
            return this;
        }
        public Builder mappedClaimsEnabled(@Nullable Boolean mappedClaimsEnabled) {
            this.mappedClaimsEnabled = Codegen.ofNullable(mappedClaimsEnabled);
            return this;
        }
        public Builder oauth2PermissionScopes(@Nullable Output<List<ApplicationApiOauth2PermissionScopeGetArgs>> oauth2PermissionScopes) {
            this.oauth2PermissionScopes = oauth2PermissionScopes;
            return this;
        }
        public Builder oauth2PermissionScopes(@Nullable List<ApplicationApiOauth2PermissionScopeGetArgs> oauth2PermissionScopes) {
            this.oauth2PermissionScopes = Codegen.ofNullable(oauth2PermissionScopes);
            return this;
        }
        public Builder oauth2PermissionScopes(ApplicationApiOauth2PermissionScopeGetArgs... oauth2PermissionScopes) {
            return oauth2PermissionScopes(List.of(oauth2PermissionScopes));
        }
        public Builder requestedAccessTokenVersion(@Nullable Output<Integer> requestedAccessTokenVersion) {
            this.requestedAccessTokenVersion = requestedAccessTokenVersion;
            return this;
        }
        public Builder requestedAccessTokenVersion(@Nullable Integer requestedAccessTokenVersion) {
            this.requestedAccessTokenVersion = Codegen.ofNullable(requestedAccessTokenVersion);
            return this;
        }        public ApplicationApiGetArgs build() {
            return new ApplicationApiGetArgs(knownClientApplications, mappedClaimsEnabled, oauth2PermissionScopes, requestedAccessTokenVersion);
        }
    }
}
