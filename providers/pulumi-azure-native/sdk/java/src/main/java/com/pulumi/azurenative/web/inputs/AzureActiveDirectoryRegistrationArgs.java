// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of the Azure Active Directory app registration.
 * 
 */
public final class AzureActiveDirectoryRegistrationArgs extends ResourceArgs {

    public static final AzureActiveDirectoryRegistrationArgs Empty = new AzureActiveDirectoryRegistrationArgs();

    /**
     * The Client ID of this relying party application, known as the client_id.
     * This setting is required for enabling OpenID Connection authentication with Azure Active Directory or
     * other 3rd party OpenID Connect providers.
     * More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The Client ID of this relying party application, known as the client_id.
     * This setting is required for enabling OpenID Connection authentication with Azure Active Directory or
     * other 3rd party OpenID Connect providers.
     * More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * An alternative to the client secret thumbprint, that is the issuer of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret Certificate Thumbprint. It is also optional.
     * 
     */
    @Import(name="clientSecretCertificateIssuer")
    private @Nullable Output<String> clientSecretCertificateIssuer;

    /**
     * @return An alternative to the client secret thumbprint, that is the issuer of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret Certificate Thumbprint. It is also optional.
     * 
     */
    public Optional<Output<String>> clientSecretCertificateIssuer() {
        return Optional.ofNullable(this.clientSecretCertificateIssuer);
    }

    /**
     * An alternative to the client secret thumbprint, that is the subject alternative name of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret Certificate Thumbprint. It is also optional.
     * 
     */
    @Import(name="clientSecretCertificateSubjectAlternativeName")
    private @Nullable Output<String> clientSecretCertificateSubjectAlternativeName;

    /**
     * @return An alternative to the client secret thumbprint, that is the subject alternative name of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret Certificate Thumbprint. It is also optional.
     * 
     */
    public Optional<Output<String>> clientSecretCertificateSubjectAlternativeName() {
        return Optional.ofNullable(this.clientSecretCertificateSubjectAlternativeName);
    }

    /**
     * An alternative to the client secret, that is the thumbprint of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret. It is also optional.
     * 
     */
    @Import(name="clientSecretCertificateThumbprint")
    private @Nullable Output<String> clientSecretCertificateThumbprint;

    /**
     * @return An alternative to the client secret, that is the thumbprint of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret. It is also optional.
     * 
     */
    public Optional<Output<String>> clientSecretCertificateThumbprint() {
        return Optional.ofNullable(this.clientSecretCertificateThumbprint);
    }

    /**
     * The app setting name that contains the client secret of the relying party application.
     * 
     */
    @Import(name="clientSecretSettingName")
    private @Nullable Output<String> clientSecretSettingName;

    /**
     * @return The app setting name that contains the client secret of the relying party application.
     * 
     */
    public Optional<Output<String>> clientSecretSettingName() {
        return Optional.ofNullable(this.clientSecretSettingName);
    }

    /**
     * The OpenID Connect Issuer URI that represents the entity which issues access tokens for this application.
     * When using Azure Active Directory, this value is the URI of the directory tenant, e.g. https://login.microsoftonline.com/v2.0/{tenant-guid}/.
     * This URI is a case-sensitive identifier for the token issuer.
     * More information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html
     * 
     */
    @Import(name="openIdIssuer")
    private @Nullable Output<String> openIdIssuer;

    /**
     * @return The OpenID Connect Issuer URI that represents the entity which issues access tokens for this application.
     * When using Azure Active Directory, this value is the URI of the directory tenant, e.g. https://login.microsoftonline.com/v2.0/{tenant-guid}/.
     * This URI is a case-sensitive identifier for the token issuer.
     * More information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html
     * 
     */
    public Optional<Output<String>> openIdIssuer() {
        return Optional.ofNullable(this.openIdIssuer);
    }

    private AzureActiveDirectoryRegistrationArgs() {}

    private AzureActiveDirectoryRegistrationArgs(AzureActiveDirectoryRegistrationArgs $) {
        this.clientId = $.clientId;
        this.clientSecretCertificateIssuer = $.clientSecretCertificateIssuer;
        this.clientSecretCertificateSubjectAlternativeName = $.clientSecretCertificateSubjectAlternativeName;
        this.clientSecretCertificateThumbprint = $.clientSecretCertificateThumbprint;
        this.clientSecretSettingName = $.clientSecretSettingName;
        this.openIdIssuer = $.openIdIssuer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureActiveDirectoryRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureActiveDirectoryRegistrationArgs $;

        public Builder() {
            $ = new AzureActiveDirectoryRegistrationArgs();
        }

        public Builder(AzureActiveDirectoryRegistrationArgs defaults) {
            $ = new AzureActiveDirectoryRegistrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The Client ID of this relying party application, known as the client_id.
         * This setting is required for enabling OpenID Connection authentication with Azure Active Directory or
         * other 3rd party OpenID Connect providers.
         * More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The Client ID of this relying party application, known as the client_id.
         * This setting is required for enabling OpenID Connection authentication with Azure Active Directory or
         * other 3rd party OpenID Connect providers.
         * More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecretCertificateIssuer An alternative to the client secret thumbprint, that is the issuer of a certificate used for signing purposes. This property acts as
         * a replacement for the Client Secret Certificate Thumbprint. It is also optional.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretCertificateIssuer(@Nullable Output<String> clientSecretCertificateIssuer) {
            $.clientSecretCertificateIssuer = clientSecretCertificateIssuer;
            return this;
        }

        /**
         * @param clientSecretCertificateIssuer An alternative to the client secret thumbprint, that is the issuer of a certificate used for signing purposes. This property acts as
         * a replacement for the Client Secret Certificate Thumbprint. It is also optional.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretCertificateIssuer(String clientSecretCertificateIssuer) {
            return clientSecretCertificateIssuer(Output.of(clientSecretCertificateIssuer));
        }

        /**
         * @param clientSecretCertificateSubjectAlternativeName An alternative to the client secret thumbprint, that is the subject alternative name of a certificate used for signing purposes. This property acts as
         * a replacement for the Client Secret Certificate Thumbprint. It is also optional.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretCertificateSubjectAlternativeName(@Nullable Output<String> clientSecretCertificateSubjectAlternativeName) {
            $.clientSecretCertificateSubjectAlternativeName = clientSecretCertificateSubjectAlternativeName;
            return this;
        }

        /**
         * @param clientSecretCertificateSubjectAlternativeName An alternative to the client secret thumbprint, that is the subject alternative name of a certificate used for signing purposes. This property acts as
         * a replacement for the Client Secret Certificate Thumbprint. It is also optional.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretCertificateSubjectAlternativeName(String clientSecretCertificateSubjectAlternativeName) {
            return clientSecretCertificateSubjectAlternativeName(Output.of(clientSecretCertificateSubjectAlternativeName));
        }

        /**
         * @param clientSecretCertificateThumbprint An alternative to the client secret, that is the thumbprint of a certificate used for signing purposes. This property acts as
         * a replacement for the Client Secret. It is also optional.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretCertificateThumbprint(@Nullable Output<String> clientSecretCertificateThumbprint) {
            $.clientSecretCertificateThumbprint = clientSecretCertificateThumbprint;
            return this;
        }

        /**
         * @param clientSecretCertificateThumbprint An alternative to the client secret, that is the thumbprint of a certificate used for signing purposes. This property acts as
         * a replacement for the Client Secret. It is also optional.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretCertificateThumbprint(String clientSecretCertificateThumbprint) {
            return clientSecretCertificateThumbprint(Output.of(clientSecretCertificateThumbprint));
        }

        /**
         * @param clientSecretSettingName The app setting name that contains the client secret of the relying party application.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretSettingName(@Nullable Output<String> clientSecretSettingName) {
            $.clientSecretSettingName = clientSecretSettingName;
            return this;
        }

        /**
         * @param clientSecretSettingName The app setting name that contains the client secret of the relying party application.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretSettingName(String clientSecretSettingName) {
            return clientSecretSettingName(Output.of(clientSecretSettingName));
        }

        /**
         * @param openIdIssuer The OpenID Connect Issuer URI that represents the entity which issues access tokens for this application.
         * When using Azure Active Directory, this value is the URI of the directory tenant, e.g. https://login.microsoftonline.com/v2.0/{tenant-guid}/.
         * This URI is a case-sensitive identifier for the token issuer.
         * More information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html
         * 
         * @return builder
         * 
         */
        public Builder openIdIssuer(@Nullable Output<String> openIdIssuer) {
            $.openIdIssuer = openIdIssuer;
            return this;
        }

        /**
         * @param openIdIssuer The OpenID Connect Issuer URI that represents the entity which issues access tokens for this application.
         * When using Azure Active Directory, this value is the URI of the directory tenant, e.g. https://login.microsoftonline.com/v2.0/{tenant-guid}/.
         * This URI is a case-sensitive identifier for the token issuer.
         * More information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html
         * 
         * @return builder
         * 
         */
        public Builder openIdIssuer(String openIdIssuer) {
            return openIdIssuer(Output.of(openIdIssuer));
        }

        public AzureActiveDirectoryRegistrationArgs build() {
            return $;
        }
    }

}
