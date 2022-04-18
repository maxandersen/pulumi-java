// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An attestation wrapper with a PGP-compatible signature. This message only supports `ATTACHED` signatures, where the payload that is signed is included alongside the signature itself in the same file.
 * 
 */
public final class PgpSignedAttestationResponse extends com.pulumi.resources.InvokeArgs {

    public static final PgpSignedAttestationResponse Empty = new PgpSignedAttestationResponse();

    /**
     * Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
     * 
     */
    @Import(name="contentType", required=true)
      private final String contentType;

    public String contentType() {
        return this.contentType;
    }

    /**
     * The cryptographic fingerprint of the key used to generate the signature, as output by, e.g. `gpg --list-keys`. This should be the version 4, full 160-bit fingerprint, expressed as a 40 character hexadecimal string. See https://tools.ietf.org/html/rfc4880#section-12.2 for details. Implementations may choose to acknowledge "LONG", "SHORT", or other abbreviated key IDs, but only the full fingerprint is guaranteed to work. In gpg, the full fingerprint can be retrieved from the `fpr` field returned when calling --list-keys with --with-colons. For example: ```gpg --with-colons --with-fingerprint --force-v4-certs \ --list-keys attester@example.com tru::1:1513631572:0:3:1:5 pub:...... fpr:::::::::24FF6481B76AC91E66A00AC657A93A81EF3AE6FB:``` Above, the fingerprint is `24FF6481B76AC91E66A00AC657A93A81EF3AE6FB`.
     * 
     */
    @Import(name="pgpKeyId", required=true)
      private final String pgpKeyId;

    public String pgpKeyId() {
        return this.pgpKeyId;
    }

    /**
     * The raw content of the signature, as output by GNU Privacy Guard (GPG) or equivalent. Since this message only supports attached signatures, the payload that was signed must be attached. While the signature format supported is dependent on the verification implementation, currently only ASCII-armored (`--armor` to gpg), non-clearsigned (`--sign` rather than `--clearsign` to gpg) are supported. Concretely, `gpg --sign --armor --output=signature.gpg payload.json` will create the signature content expected in this field in `signature.gpg` for the `payload.json` attestation payload.
     * 
     */
    @Import(name="signature", required=true)
      private final String signature;

    public String signature() {
        return this.signature;
    }

    public PgpSignedAttestationResponse(
        String contentType,
        String pgpKeyId,
        String signature) {
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.pgpKeyId = Objects.requireNonNull(pgpKeyId, "expected parameter 'pgpKeyId' to be non-null");
        this.signature = Objects.requireNonNull(signature, "expected parameter 'signature' to be non-null");
    }

    private PgpSignedAttestationResponse() {
        this.contentType = null;
        this.pgpKeyId = null;
        this.signature = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PgpSignedAttestationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentType;
        private String pgpKeyId;
        private String signature;

        public Builder() {
    	      // Empty
        }

        public Builder(PgpSignedAttestationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.pgpKeyId = defaults.pgpKeyId;
    	      this.signature = defaults.signature;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder pgpKeyId(String pgpKeyId) {
            this.pgpKeyId = Objects.requireNonNull(pgpKeyId);
            return this;
        }
        public Builder signature(String signature) {
            this.signature = Objects.requireNonNull(signature);
            return this;
        }        public PgpSignedAttestationResponse build() {
            return new PgpSignedAttestationResponse(contentType, pgpKeyId, signature);
        }
    }
}
