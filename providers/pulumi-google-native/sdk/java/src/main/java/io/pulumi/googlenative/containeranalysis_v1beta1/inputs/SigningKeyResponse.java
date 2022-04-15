// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * This defines the format used to record keys used in the software supply chain. An in-toto link is attested using one or more keys defined in the in-toto layout. An example of this is: { "key_id": "776a00e29f3559e0141b3b096f696abc6cfb0c657ab40f441132b345b0...", "key_type": "rsa", "public_key_value": "-----BEGIN PUBLIC KEY-----\nMIIBojANBgkqhkiG9w0B...", "key_scheme": "rsassa-pss-sha256" } The format for in-toto's key definition can be found in section 4.2 of the in-toto specification.
 * 
 */
public final class SigningKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final SigningKeyResponse Empty = new SigningKeyResponse();

    /**
     * key_id is an identifier for the signing key.
     * 
     */
    @Import(name="keyId", required=true)
      private final String keyId;

    public String keyId() {
        return this.keyId;
    }

    /**
     * This field contains the corresponding signature scheme. Eg: "rsassa-pss-sha256".
     * 
     */
    @Import(name="keyScheme", required=true)
      private final String keyScheme;

    public String keyScheme() {
        return this.keyScheme;
    }

    /**
     * This field identifies the specific signing method. Eg: "rsa", "ed25519", and "ecdsa".
     * 
     */
    @Import(name="keyType", required=true)
      private final String keyType;

    public String keyType() {
        return this.keyType;
    }

    /**
     * This field contains the actual public key.
     * 
     */
    @Import(name="publicKeyValue", required=true)
      private final String publicKeyValue;

    public String publicKeyValue() {
        return this.publicKeyValue;
    }

    public SigningKeyResponse(
        String keyId,
        String keyScheme,
        String keyType,
        String publicKeyValue) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.keyScheme = Objects.requireNonNull(keyScheme, "expected parameter 'keyScheme' to be non-null");
        this.keyType = Objects.requireNonNull(keyType, "expected parameter 'keyType' to be non-null");
        this.publicKeyValue = Objects.requireNonNull(publicKeyValue, "expected parameter 'publicKeyValue' to be non-null");
    }

    private SigningKeyResponse() {
        this.keyId = null;
        this.keyScheme = null;
        this.keyType = null;
        this.publicKeyValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;
        private String keyScheme;
        private String keyType;
        private String publicKeyValue;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.keyScheme = defaults.keyScheme;
    	      this.keyType = defaults.keyType;
    	      this.publicKeyValue = defaults.publicKeyValue;
        }

        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder keyScheme(String keyScheme) {
            this.keyScheme = Objects.requireNonNull(keyScheme);
            return this;
        }
        public Builder keyType(String keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        public Builder publicKeyValue(String publicKeyValue) {
            this.publicKeyValue = Objects.requireNonNull(publicKeyValue);
            return this;
        }        public SigningKeyResponse build() {
            return new SigningKeyResponse(keyId, keyScheme, keyType, publicKeyValue);
        }
    }
}
