// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.ContentKeyPolicyRsaTokenKeyResponse;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicySymmetricTokenKeyResponse;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyTokenClaimResponse;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyX509CertificateTokenKeyResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a token restriction. Provided token must match these requirements for successful license or key delivery.
 * 
 */
public final class ContentKeyPolicyTokenRestrictionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicyTokenRestrictionResponse Empty = new ContentKeyPolicyTokenRestrictionResponse();

    /**
     * A list of alternative verification keys.
     * 
     */
    @Import(name="alternateVerificationKeys")
      private final @Nullable List<Object> alternateVerificationKeys;

    public List<Object> alternateVerificationKeys() {
        return this.alternateVerificationKeys == null ? List.of() : this.alternateVerificationKeys;
    }

    /**
     * The audience for the token.
     * 
     */
    @Import(name="audience", required=true)
      private final String audience;

    public String audience() {
        return this.audience;
    }

    /**
     * The token issuer.
     * 
     */
    @Import(name="issuer", required=true)
      private final String issuer;

    public String issuer() {
        return this.issuer;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyTokenRestriction'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * The OpenID connect discovery document.
     * 
     */
    @Import(name="openIdConnectDiscoveryDocument")
      private final @Nullable String openIdConnectDiscoveryDocument;

    public Optional<String> openIdConnectDiscoveryDocument() {
        return this.openIdConnectDiscoveryDocument == null ? Optional.empty() : Optional.ofNullable(this.openIdConnectDiscoveryDocument);
    }

    /**
     * The primary verification key.
     * 
     */
    @Import(name="primaryVerificationKey", required=true)
      private final Object primaryVerificationKey;

    public Object primaryVerificationKey() {
        return this.primaryVerificationKey;
    }

    /**
     * A list of required token claims.
     * 
     */
    @Import(name="requiredClaims")
      private final @Nullable List<ContentKeyPolicyTokenClaimResponse> requiredClaims;

    public List<ContentKeyPolicyTokenClaimResponse> requiredClaims() {
        return this.requiredClaims == null ? List.of() : this.requiredClaims;
    }

    /**
     * The type of token.
     * 
     */
    @Import(name="restrictionTokenType", required=true)
      private final String restrictionTokenType;

    public String restrictionTokenType() {
        return this.restrictionTokenType;
    }

    public ContentKeyPolicyTokenRestrictionResponse(
        @Nullable List<Object> alternateVerificationKeys,
        String audience,
        String issuer,
        String odataType,
        @Nullable String openIdConnectDiscoveryDocument,
        Object primaryVerificationKey,
        @Nullable List<ContentKeyPolicyTokenClaimResponse> requiredClaims,
        String restrictionTokenType) {
        this.alternateVerificationKeys = alternateVerificationKeys;
        this.audience = Objects.requireNonNull(audience, "expected parameter 'audience' to be non-null");
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.openIdConnectDiscoveryDocument = openIdConnectDiscoveryDocument;
        this.primaryVerificationKey = Objects.requireNonNull(primaryVerificationKey, "expected parameter 'primaryVerificationKey' to be non-null");
        this.requiredClaims = requiredClaims;
        this.restrictionTokenType = Objects.requireNonNull(restrictionTokenType, "expected parameter 'restrictionTokenType' to be non-null");
    }

    private ContentKeyPolicyTokenRestrictionResponse() {
        this.alternateVerificationKeys = List.of();
        this.audience = null;
        this.issuer = null;
        this.odataType = null;
        this.openIdConnectDiscoveryDocument = null;
        this.primaryVerificationKey = null;
        this.requiredClaims = List.of();
        this.restrictionTokenType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyTokenRestrictionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> alternateVerificationKeys;
        private String audience;
        private String issuer;
        private String odataType;
        private @Nullable String openIdConnectDiscoveryDocument;
        private Object primaryVerificationKey;
        private @Nullable List<ContentKeyPolicyTokenClaimResponse> requiredClaims;
        private String restrictionTokenType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyTokenRestrictionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateVerificationKeys = defaults.alternateVerificationKeys;
    	      this.audience = defaults.audience;
    	      this.issuer = defaults.issuer;
    	      this.odataType = defaults.odataType;
    	      this.openIdConnectDiscoveryDocument = defaults.openIdConnectDiscoveryDocument;
    	      this.primaryVerificationKey = defaults.primaryVerificationKey;
    	      this.requiredClaims = defaults.requiredClaims;
    	      this.restrictionTokenType = defaults.restrictionTokenType;
        }

        public Builder alternateVerificationKeys(@Nullable List<Object> alternateVerificationKeys) {
            this.alternateVerificationKeys = alternateVerificationKeys;
            return this;
        }
        public Builder alternateVerificationKeys(Object... alternateVerificationKeys) {
            return alternateVerificationKeys(List.of(alternateVerificationKeys));
        }
        public Builder audience(String audience) {
            this.audience = Objects.requireNonNull(audience);
            return this;
        }
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder openIdConnectDiscoveryDocument(@Nullable String openIdConnectDiscoveryDocument) {
            this.openIdConnectDiscoveryDocument = openIdConnectDiscoveryDocument;
            return this;
        }
        public Builder primaryVerificationKey(Object primaryVerificationKey) {
            this.primaryVerificationKey = Objects.requireNonNull(primaryVerificationKey);
            return this;
        }
        public Builder requiredClaims(@Nullable List<ContentKeyPolicyTokenClaimResponse> requiredClaims) {
            this.requiredClaims = requiredClaims;
            return this;
        }
        public Builder requiredClaims(ContentKeyPolicyTokenClaimResponse... requiredClaims) {
            return requiredClaims(List.of(requiredClaims));
        }
        public Builder restrictionTokenType(String restrictionTokenType) {
            this.restrictionTokenType = Objects.requireNonNull(restrictionTokenType);
            return this;
        }        public ContentKeyPolicyTokenRestrictionResponse build() {
            return new ContentKeyPolicyTokenRestrictionResponse(alternateVerificationKeys, audience, issuer, odataType, openIdConnectDiscoveryDocument, primaryVerificationKey, requiredClaims, restrictionTokenType);
        }
    }
}
