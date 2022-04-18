// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.inputs.BackendServiceIAPOAuth2ClientInfoArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identity-Aware Proxy
 * 
 */
public final class BackendServiceIAPArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceIAPArgs Empty = new BackendServiceIAPArgs();

    /**
     * Whether the serving infrastructure will authenticate and authorize all incoming requests. If true, the oauth2ClientId and oauth2ClientSecret fields must be non-empty.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * OAuth2 client ID to use for the authentication flow.
     * 
     */
    @Import(name="oauth2ClientId")
      private final @Nullable Output<String> oauth2ClientId;

    public Output<String> oauth2ClientId() {
        return this.oauth2ClientId == null ? Codegen.empty() : this.oauth2ClientId;
    }

    /**
     * [Input Only] OAuth client info required to generate client id to be used for IAP.
     * 
     */
    @Import(name="oauth2ClientInfo")
      private final @Nullable Output<BackendServiceIAPOAuth2ClientInfoArgs> oauth2ClientInfo;

    public Output<BackendServiceIAPOAuth2ClientInfoArgs> oauth2ClientInfo() {
        return this.oauth2ClientInfo == null ? Codegen.empty() : this.oauth2ClientInfo;
    }

    /**
     * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. @InputOnly
     * 
     */
    @Import(name="oauth2ClientSecret")
      private final @Nullable Output<String> oauth2ClientSecret;

    public Output<String> oauth2ClientSecret() {
        return this.oauth2ClientSecret == null ? Codegen.empty() : this.oauth2ClientSecret;
    }

    public BackendServiceIAPArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> oauth2ClientId,
        @Nullable Output<BackendServiceIAPOAuth2ClientInfoArgs> oauth2ClientInfo,
        @Nullable Output<String> oauth2ClientSecret) {
        this.enabled = enabled;
        this.oauth2ClientId = oauth2ClientId;
        this.oauth2ClientInfo = oauth2ClientInfo;
        this.oauth2ClientSecret = oauth2ClientSecret;
    }

    private BackendServiceIAPArgs() {
        this.enabled = Codegen.empty();
        this.oauth2ClientId = Codegen.empty();
        this.oauth2ClientInfo = Codegen.empty();
        this.oauth2ClientSecret = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceIAPArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> oauth2ClientId;
        private @Nullable Output<BackendServiceIAPOAuth2ClientInfoArgs> oauth2ClientInfo;
        private @Nullable Output<String> oauth2ClientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceIAPArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.oauth2ClientId = defaults.oauth2ClientId;
    	      this.oauth2ClientInfo = defaults.oauth2ClientInfo;
    	      this.oauth2ClientSecret = defaults.oauth2ClientSecret;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder oauth2ClientId(@Nullable Output<String> oauth2ClientId) {
            this.oauth2ClientId = oauth2ClientId;
            return this;
        }
        public Builder oauth2ClientId(@Nullable String oauth2ClientId) {
            this.oauth2ClientId = Codegen.ofNullable(oauth2ClientId);
            return this;
        }
        public Builder oauth2ClientInfo(@Nullable Output<BackendServiceIAPOAuth2ClientInfoArgs> oauth2ClientInfo) {
            this.oauth2ClientInfo = oauth2ClientInfo;
            return this;
        }
        public Builder oauth2ClientInfo(@Nullable BackendServiceIAPOAuth2ClientInfoArgs oauth2ClientInfo) {
            this.oauth2ClientInfo = Codegen.ofNullable(oauth2ClientInfo);
            return this;
        }
        public Builder oauth2ClientSecret(@Nullable Output<String> oauth2ClientSecret) {
            this.oauth2ClientSecret = oauth2ClientSecret;
            return this;
        }
        public Builder oauth2ClientSecret(@Nullable String oauth2ClientSecret) {
            this.oauth2ClientSecret = Codegen.ofNullable(oauth2ClientSecret);
            return this;
        }        public BackendServiceIAPArgs build() {
            return new BackendServiceIAPArgs(enabled, oauth2ClientId, oauth2ClientInfo, oauth2ClientSecret);
        }
    }
}
