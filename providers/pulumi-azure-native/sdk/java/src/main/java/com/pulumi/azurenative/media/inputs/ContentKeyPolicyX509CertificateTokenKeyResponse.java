// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies a certificate for token validation.
 * 
 */
public final class ContentKeyPolicyX509CertificateTokenKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicyX509CertificateTokenKeyResponse Empty = new ContentKeyPolicyX509CertificateTokenKeyResponse();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyX509CertificateTokenKey'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * The raw data field of a certificate in PKCS 12 format (X509Certificate2 in .NET)
     * 
     */
    @Import(name="rawBody", required=true)
      private final String rawBody;

    public String rawBody() {
        return this.rawBody;
    }

    public ContentKeyPolicyX509CertificateTokenKeyResponse(
        String odataType,
        String rawBody) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.rawBody = Objects.requireNonNull(rawBody, "expected parameter 'rawBody' to be non-null");
    }

    private ContentKeyPolicyX509CertificateTokenKeyResponse() {
        this.odataType = null;
        this.rawBody = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyX509CertificateTokenKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private String rawBody;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyX509CertificateTokenKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.rawBody = defaults.rawBody;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder rawBody(String rawBody) {
            this.rawBody = Objects.requireNonNull(rawBody);
            return this;
        }        public ContentKeyPolicyX509CertificateTokenKeyResponse build() {
            return new ContentKeyPolicyX509CertificateTokenKeyResponse(odataType, rawBody);
        }
    }
}
