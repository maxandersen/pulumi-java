// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendServiceIapArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceIapArgs Empty = new BackendServiceIapArgs();

    /**
     * OAuth2 Client ID for IAP
     * 
     */
    @Import(name="oauth2ClientId", required=true)
    private Output<String> oauth2ClientId;

    public Output<String> oauth2ClientId() {
        return this.oauth2ClientId;
    }

    /**
     * OAuth2 Client Secret for IAP
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="oauth2ClientSecret", required=true)
    private Output<String> oauth2ClientSecret;

    public Output<String> oauth2ClientSecret() {
        return this.oauth2ClientSecret;
    }

    /**
     * - 
     * OAuth2 Client Secret SHA-256 for IAP
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="oauth2ClientSecretSha256")
    private @Nullable Output<String> oauth2ClientSecretSha256;

    public Optional<Output<String>> oauth2ClientSecretSha256() {
        return Optional.ofNullable(this.oauth2ClientSecretSha256);
    }

    private BackendServiceIapArgs() {}

    private BackendServiceIapArgs(BackendServiceIapArgs $) {
        this.oauth2ClientId = $.oauth2ClientId;
        this.oauth2ClientSecret = $.oauth2ClientSecret;
        this.oauth2ClientSecretSha256 = $.oauth2ClientSecretSha256;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceIapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceIapArgs $;

        public Builder() {
            $ = new BackendServiceIapArgs();
        }

        public Builder(BackendServiceIapArgs defaults) {
            $ = new BackendServiceIapArgs(Objects.requireNonNull(defaults));
        }

        public Builder oauth2ClientId(Output<String> oauth2ClientId) {
            $.oauth2ClientId = oauth2ClientId;
            return this;
        }

        public Builder oauth2ClientId(String oauth2ClientId) {
            return oauth2ClientId(Output.of(oauth2ClientId));
        }

        public Builder oauth2ClientSecret(Output<String> oauth2ClientSecret) {
            $.oauth2ClientSecret = oauth2ClientSecret;
            return this;
        }

        public Builder oauth2ClientSecret(String oauth2ClientSecret) {
            return oauth2ClientSecret(Output.of(oauth2ClientSecret));
        }

        public Builder oauth2ClientSecretSha256(@Nullable Output<String> oauth2ClientSecretSha256) {
            $.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
            return this;
        }

        public Builder oauth2ClientSecretSha256(String oauth2ClientSecretSha256) {
            return oauth2ClientSecretSha256(Output.of(oauth2ClientSecretSha256));
        }

        public BackendServiceIapArgs build() {
            $.oauth2ClientId = Objects.requireNonNull($.oauth2ClientId, "expected parameter 'oauth2ClientId' to be non-null");
            $.oauth2ClientSecret = Objects.requireNonNull($.oauth2ClientSecret, "expected parameter 'oauth2ClientSecret' to be non-null");
            return $;
        }
    }

}
