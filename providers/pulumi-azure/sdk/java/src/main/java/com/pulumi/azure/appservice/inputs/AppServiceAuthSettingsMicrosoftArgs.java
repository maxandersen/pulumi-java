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


public final class AppServiceAuthSettingsMicrosoftArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppServiceAuthSettingsMicrosoftArgs Empty = new AppServiceAuthSettingsMicrosoftArgs();

    /**
     * The OAuth 2.0 client ID that was created for the app used for authentication.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The OAuth 2.0 client ID that was created for the app used for authentication.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The OAuth 2.0 client secret that was created for the app used for authentication.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return The OAuth 2.0 client secret that was created for the app used for authentication.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * The OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication. https://msdn.microsoft.com/en-us/library/dn631845.aspx
     * 
     */
    @Import(name="oauthScopes")
    private @Nullable Output<List<String>> oauthScopes;

    /**
     * @return The OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication. https://msdn.microsoft.com/en-us/library/dn631845.aspx
     * 
     */
    public Optional<Output<List<String>>> oauthScopes() {
        return Optional.ofNullable(this.oauthScopes);
    }

    private AppServiceAuthSettingsMicrosoftArgs() {}

    private AppServiceAuthSettingsMicrosoftArgs(AppServiceAuthSettingsMicrosoftArgs $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.oauthScopes = $.oauthScopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppServiceAuthSettingsMicrosoftArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppServiceAuthSettingsMicrosoftArgs $;

        public Builder() {
            $ = new AppServiceAuthSettingsMicrosoftArgs();
        }

        public Builder(AppServiceAuthSettingsMicrosoftArgs defaults) {
            $ = new AppServiceAuthSettingsMicrosoftArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The OAuth 2.0 client ID that was created for the app used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The OAuth 2.0 client ID that was created for the app used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The OAuth 2.0 client secret that was created for the app used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The OAuth 2.0 client secret that was created for the app used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param oauthScopes The OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication. https://msdn.microsoft.com/en-us/library/dn631845.aspx
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(@Nullable Output<List<String>> oauthScopes) {
            $.oauthScopes = oauthScopes;
            return this;
        }

        /**
         * @param oauthScopes The OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication. https://msdn.microsoft.com/en-us/library/dn631845.aspx
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(List<String> oauthScopes) {
            return oauthScopes(Output.of(oauthScopes));
        }

        /**
         * @param oauthScopes The OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication. https://msdn.microsoft.com/en-us/library/dn631845.aspx
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }

        public AppServiceAuthSettingsMicrosoftArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            return $;
        }
    }

}
