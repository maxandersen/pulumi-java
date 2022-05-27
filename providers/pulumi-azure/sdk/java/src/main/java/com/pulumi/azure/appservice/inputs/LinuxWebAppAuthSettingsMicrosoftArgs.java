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


public final class LinuxWebAppAuthSettingsMicrosoftArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxWebAppAuthSettingsMicrosoftArgs Empty = new LinuxWebAppAuthSettingsMicrosoftArgs();

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
     * The OAuth 2.0 client secret that was created for the app used for authentication. Cannot be specified with `client_secret_setting_name`.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return The OAuth 2.0 client secret that was created for the app used for authentication. Cannot be specified with `client_secret_setting_name`.
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * The app setting name containing the OAuth 2.0 client secret that was created for the app used for authentication. Cannot be specified with `client_secret`.
     * 
     */
    @Import(name="clientSecretSettingName")
    private @Nullable Output<String> clientSecretSettingName;

    /**
     * @return The app setting name containing the OAuth 2.0 client secret that was created for the app used for authentication. Cannot be specified with `client_secret`.
     * 
     */
    public Optional<Output<String>> clientSecretSettingName() {
        return Optional.ofNullable(this.clientSecretSettingName);
    }

    /**
     * Specifies a list of OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication. If not specified, &#34;wl.basic&#34; is used as the default scope.
     * 
     */
    @Import(name="oauthScopes")
    private @Nullable Output<List<String>> oauthScopes;

    /**
     * @return Specifies a list of OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication. If not specified, &#34;wl.basic&#34; is used as the default scope.
     * 
     */
    public Optional<Output<List<String>>> oauthScopes() {
        return Optional.ofNullable(this.oauthScopes);
    }

    private LinuxWebAppAuthSettingsMicrosoftArgs() {}

    private LinuxWebAppAuthSettingsMicrosoftArgs(LinuxWebAppAuthSettingsMicrosoftArgs $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.clientSecretSettingName = $.clientSecretSettingName;
        this.oauthScopes = $.oauthScopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxWebAppAuthSettingsMicrosoftArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxWebAppAuthSettingsMicrosoftArgs $;

        public Builder() {
            $ = new LinuxWebAppAuthSettingsMicrosoftArgs();
        }

        public Builder(LinuxWebAppAuthSettingsMicrosoftArgs defaults) {
            $ = new LinuxWebAppAuthSettingsMicrosoftArgs(Objects.requireNonNull(defaults));
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
         * @param clientSecret The OAuth 2.0 client secret that was created for the app used for authentication. Cannot be specified with `client_secret_setting_name`.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The OAuth 2.0 client secret that was created for the app used for authentication. Cannot be specified with `client_secret_setting_name`.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param clientSecretSettingName The app setting name containing the OAuth 2.0 client secret that was created for the app used for authentication. Cannot be specified with `client_secret`.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretSettingName(@Nullable Output<String> clientSecretSettingName) {
            $.clientSecretSettingName = clientSecretSettingName;
            return this;
        }

        /**
         * @param clientSecretSettingName The app setting name containing the OAuth 2.0 client secret that was created for the app used for authentication. Cannot be specified with `client_secret`.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretSettingName(String clientSecretSettingName) {
            return clientSecretSettingName(Output.of(clientSecretSettingName));
        }

        /**
         * @param oauthScopes Specifies a list of OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication. If not specified, &#34;wl.basic&#34; is used as the default scope.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(@Nullable Output<List<String>> oauthScopes) {
            $.oauthScopes = oauthScopes;
            return this;
        }

        /**
         * @param oauthScopes Specifies a list of OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication. If not specified, &#34;wl.basic&#34; is used as the default scope.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(List<String> oauthScopes) {
            return oauthScopes(Output.of(oauthScopes));
        }

        /**
         * @param oauthScopes Specifies a list of OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication. If not specified, &#34;wl.basic&#34; is used as the default scope.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }

        public LinuxWebAppAuthSettingsMicrosoftArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            return $;
        }
    }

}
