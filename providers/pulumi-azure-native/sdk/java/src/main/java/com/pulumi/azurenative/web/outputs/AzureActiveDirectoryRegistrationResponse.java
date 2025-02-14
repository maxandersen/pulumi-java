// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureActiveDirectoryRegistrationResponse {
    /**
     * @return The Client ID of this relying party application, known as the client_id.
     * This setting is required for enabling OpenID Connection authentication with Azure Active Directory or
     * other 3rd party OpenID Connect providers.
     * More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html
     * 
     */
    private final @Nullable String clientId;
    /**
     * @return An alternative to the client secret thumbprint, that is the issuer of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret Certificate Thumbprint. It is also optional.
     * 
     */
    private final @Nullable String clientSecretCertificateIssuer;
    /**
     * @return An alternative to the client secret thumbprint, that is the subject alternative name of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret Certificate Thumbprint. It is also optional.
     * 
     */
    private final @Nullable String clientSecretCertificateSubjectAlternativeName;
    /**
     * @return An alternative to the client secret, that is the thumbprint of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret. It is also optional.
     * 
     */
    private final @Nullable String clientSecretCertificateThumbprint;
    /**
     * @return The app setting name that contains the client secret of the relying party application.
     * 
     */
    private final @Nullable String clientSecretSettingName;
    /**
     * @return The OpenID Connect Issuer URI that represents the entity which issues access tokens for this application.
     * When using Azure Active Directory, this value is the URI of the directory tenant, e.g. https://login.microsoftonline.com/v2.0/{tenant-guid}/.
     * This URI is a case-sensitive identifier for the token issuer.
     * More information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html
     * 
     */
    private final @Nullable String openIdIssuer;

    @CustomType.Constructor
    private AzureActiveDirectoryRegistrationResponse(
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("clientSecretCertificateIssuer") @Nullable String clientSecretCertificateIssuer,
        @CustomType.Parameter("clientSecretCertificateSubjectAlternativeName") @Nullable String clientSecretCertificateSubjectAlternativeName,
        @CustomType.Parameter("clientSecretCertificateThumbprint") @Nullable String clientSecretCertificateThumbprint,
        @CustomType.Parameter("clientSecretSettingName") @Nullable String clientSecretSettingName,
        @CustomType.Parameter("openIdIssuer") @Nullable String openIdIssuer) {
        this.clientId = clientId;
        this.clientSecretCertificateIssuer = clientSecretCertificateIssuer;
        this.clientSecretCertificateSubjectAlternativeName = clientSecretCertificateSubjectAlternativeName;
        this.clientSecretCertificateThumbprint = clientSecretCertificateThumbprint;
        this.clientSecretSettingName = clientSecretSettingName;
        this.openIdIssuer = openIdIssuer;
    }

    /**
     * @return The Client ID of this relying party application, known as the client_id.
     * This setting is required for enabling OpenID Connection authentication with Azure Active Directory or
     * other 3rd party OpenID Connect providers.
     * More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return An alternative to the client secret thumbprint, that is the issuer of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret Certificate Thumbprint. It is also optional.
     * 
     */
    public Optional<String> clientSecretCertificateIssuer() {
        return Optional.ofNullable(this.clientSecretCertificateIssuer);
    }
    /**
     * @return An alternative to the client secret thumbprint, that is the subject alternative name of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret Certificate Thumbprint. It is also optional.
     * 
     */
    public Optional<String> clientSecretCertificateSubjectAlternativeName() {
        return Optional.ofNullable(this.clientSecretCertificateSubjectAlternativeName);
    }
    /**
     * @return An alternative to the client secret, that is the thumbprint of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret. It is also optional.
     * 
     */
    public Optional<String> clientSecretCertificateThumbprint() {
        return Optional.ofNullable(this.clientSecretCertificateThumbprint);
    }
    /**
     * @return The app setting name that contains the client secret of the relying party application.
     * 
     */
    public Optional<String> clientSecretSettingName() {
        return Optional.ofNullable(this.clientSecretSettingName);
    }
    /**
     * @return The OpenID Connect Issuer URI that represents the entity which issues access tokens for this application.
     * When using Azure Active Directory, this value is the URI of the directory tenant, e.g. https://login.microsoftonline.com/v2.0/{tenant-guid}/.
     * This URI is a case-sensitive identifier for the token issuer.
     * More information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html
     * 
     */
    public Optional<String> openIdIssuer() {
        return Optional.ofNullable(this.openIdIssuer);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureActiveDirectoryRegistrationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String clientSecretCertificateIssuer;
        private @Nullable String clientSecretCertificateSubjectAlternativeName;
        private @Nullable String clientSecretCertificateThumbprint;
        private @Nullable String clientSecretSettingName;
        private @Nullable String openIdIssuer;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureActiveDirectoryRegistrationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecretCertificateIssuer = defaults.clientSecretCertificateIssuer;
    	      this.clientSecretCertificateSubjectAlternativeName = defaults.clientSecretCertificateSubjectAlternativeName;
    	      this.clientSecretCertificateThumbprint = defaults.clientSecretCertificateThumbprint;
    	      this.clientSecretSettingName = defaults.clientSecretSettingName;
    	      this.openIdIssuer = defaults.openIdIssuer;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecretCertificateIssuer(@Nullable String clientSecretCertificateIssuer) {
            this.clientSecretCertificateIssuer = clientSecretCertificateIssuer;
            return this;
        }
        public Builder clientSecretCertificateSubjectAlternativeName(@Nullable String clientSecretCertificateSubjectAlternativeName) {
            this.clientSecretCertificateSubjectAlternativeName = clientSecretCertificateSubjectAlternativeName;
            return this;
        }
        public Builder clientSecretCertificateThumbprint(@Nullable String clientSecretCertificateThumbprint) {
            this.clientSecretCertificateThumbprint = clientSecretCertificateThumbprint;
            return this;
        }
        public Builder clientSecretSettingName(@Nullable String clientSecretSettingName) {
            this.clientSecretSettingName = clientSecretSettingName;
            return this;
        }
        public Builder openIdIssuer(@Nullable String openIdIssuer) {
            this.openIdIssuer = openIdIssuer;
            return this;
        }        public AzureActiveDirectoryRegistrationResponse build() {
            return new AzureActiveDirectoryRegistrationResponse(clientId, clientSecretCertificateIssuer, clientSecretCertificateSubjectAlternativeName, clientSecretCertificateThumbprint, clientSecretSettingName, openIdIssuer);
        }
    }
}
