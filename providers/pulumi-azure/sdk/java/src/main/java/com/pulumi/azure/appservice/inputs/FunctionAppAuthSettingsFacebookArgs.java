// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionAppAuthSettingsFacebookArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionAppAuthSettingsFacebookArgs Empty = new FunctionAppAuthSettingsFacebookArgs();

    /**
     * The App ID of the Facebook app used for login
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return The App ID of the Facebook app used for login
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }

    /**
     * The App Secret of the Facebook app used for Facebook Login.
     * 
     */
    @Import(name="appSecret", required=true)
    private Output<String> appSecret;

    /**
     * @return The App Secret of the Facebook app used for Facebook Login.
     * 
     */
    public Output<String> appSecret() {
        return this.appSecret;
    }

    /**
     * The OAuth 2.0 scopes that will be requested as part of Facebook Login authentication. https://developers.facebook.com/docs/facebook-login
     * 
     */
    @Import(name="oauthScopes")
    private @Nullable Output<List<String>> oauthScopes;

    /**
     * @return The OAuth 2.0 scopes that will be requested as part of Facebook Login authentication. https://developers.facebook.com/docs/facebook-login
     * 
     */
    public Optional<Output<List<String>>> oauthScopes() {
        return Optional.ofNullable(this.oauthScopes);
    }

    private FunctionAppAuthSettingsFacebookArgs() {}

    private FunctionAppAuthSettingsFacebookArgs(FunctionAppAuthSettingsFacebookArgs $) {
        this.appId = $.appId;
        this.appSecret = $.appSecret;
        this.oauthScopes = $.oauthScopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionAppAuthSettingsFacebookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionAppAuthSettingsFacebookArgs $;

        public Builder() {
            $ = new FunctionAppAuthSettingsFacebookArgs();
        }

        public Builder(FunctionAppAuthSettingsFacebookArgs defaults) {
            $ = new FunctionAppAuthSettingsFacebookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The App ID of the Facebook app used for login
         * 
         * @return builder
         * 
         */
        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The App ID of the Facebook app used for login
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param appSecret The App Secret of the Facebook app used for Facebook Login.
         * 
         * @return builder
         * 
         */
        public Builder appSecret(Output<String> appSecret) {
            $.appSecret = appSecret;
            return this;
        }

        /**
         * @param appSecret The App Secret of the Facebook app used for Facebook Login.
         * 
         * @return builder
         * 
         */
        public Builder appSecret(String appSecret) {
            return appSecret(Output.of(appSecret));
        }

        /**
         * @param oauthScopes The OAuth 2.0 scopes that will be requested as part of Facebook Login authentication. https://developers.facebook.com/docs/facebook-login
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(@Nullable Output<List<String>> oauthScopes) {
            $.oauthScopes = oauthScopes;
            return this;
        }

        /**
         * @param oauthScopes The OAuth 2.0 scopes that will be requested as part of Facebook Login authentication. https://developers.facebook.com/docs/facebook-login
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(List<String> oauthScopes) {
            return oauthScopes(Output.of(oauthScopes));
        }

        /**
         * @param oauthScopes The OAuth 2.0 scopes that will be requested as part of Facebook Login authentication. https://developers.facebook.com/docs/facebook-login
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }

        public FunctionAppAuthSettingsFacebookArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            $.appSecret = Objects.requireNonNull($.appSecret, "expected parameter 'appSecret' to be non-null");
            return $;
        }
    }

}
