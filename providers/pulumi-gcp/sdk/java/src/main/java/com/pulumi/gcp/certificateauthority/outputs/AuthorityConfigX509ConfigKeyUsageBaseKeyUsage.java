// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthorityConfigX509ConfigKeyUsageBaseKeyUsage {
    /**
     * The key may be used to sign certificates.
     * 
     */
    private final @Nullable Boolean certSign;
    /**
     * The key may be used for cryptographic commitments. Note that this may also be referred to as &#34;non-repudiation&#34;.
     * 
     */
    private final @Nullable Boolean contentCommitment;
    /**
     * The key may be used sign certificate revocation lists.
     * 
     */
    private final @Nullable Boolean crlSign;
    /**
     * The key may be used to encipher data.
     * 
     */
    private final @Nullable Boolean dataEncipherment;
    /**
     * The key may be used to decipher only.
     * 
     */
    private final @Nullable Boolean decipherOnly;
    /**
     * The key may be used for digital signatures.
     * 
     */
    private final @Nullable Boolean digitalSignature;
    /**
     * The key may be used to encipher only.
     * 
     */
    private final @Nullable Boolean encipherOnly;
    /**
     * The key may be used in a key agreement protocol.
     * 
     */
    private final @Nullable Boolean keyAgreement;
    /**
     * The key may be used to encipher other keys.
     * 
     */
    private final @Nullable Boolean keyEncipherment;

    @CustomType.Constructor
    private AuthorityConfigX509ConfigKeyUsageBaseKeyUsage(
        @CustomType.Parameter("certSign") @Nullable Boolean certSign,
        @CustomType.Parameter("contentCommitment") @Nullable Boolean contentCommitment,
        @CustomType.Parameter("crlSign") @Nullable Boolean crlSign,
        @CustomType.Parameter("dataEncipherment") @Nullable Boolean dataEncipherment,
        @CustomType.Parameter("decipherOnly") @Nullable Boolean decipherOnly,
        @CustomType.Parameter("digitalSignature") @Nullable Boolean digitalSignature,
        @CustomType.Parameter("encipherOnly") @Nullable Boolean encipherOnly,
        @CustomType.Parameter("keyAgreement") @Nullable Boolean keyAgreement,
        @CustomType.Parameter("keyEncipherment") @Nullable Boolean keyEncipherment) {
        this.certSign = certSign;
        this.contentCommitment = contentCommitment;
        this.crlSign = crlSign;
        this.dataEncipherment = dataEncipherment;
        this.decipherOnly = decipherOnly;
        this.digitalSignature = digitalSignature;
        this.encipherOnly = encipherOnly;
        this.keyAgreement = keyAgreement;
        this.keyEncipherment = keyEncipherment;
    }

    /**
     * The key may be used to sign certificates.
     * 
    */
    public Optional<Boolean> certSign() {
        return Optional.ofNullable(this.certSign);
    }
    /**
     * The key may be used for cryptographic commitments. Note that this may also be referred to as &#34;non-repudiation&#34;.
     * 
    */
    public Optional<Boolean> contentCommitment() {
        return Optional.ofNullable(this.contentCommitment);
    }
    /**
     * The key may be used sign certificate revocation lists.
     * 
    */
    public Optional<Boolean> crlSign() {
        return Optional.ofNullable(this.crlSign);
    }
    /**
     * The key may be used to encipher data.
     * 
    */
    public Optional<Boolean> dataEncipherment() {
        return Optional.ofNullable(this.dataEncipherment);
    }
    /**
     * The key may be used to decipher only.
     * 
    */
    public Optional<Boolean> decipherOnly() {
        return Optional.ofNullable(this.decipherOnly);
    }
    /**
     * The key may be used for digital signatures.
     * 
    */
    public Optional<Boolean> digitalSignature() {
        return Optional.ofNullable(this.digitalSignature);
    }
    /**
     * The key may be used to encipher only.
     * 
    */
    public Optional<Boolean> encipherOnly() {
        return Optional.ofNullable(this.encipherOnly);
    }
    /**
     * The key may be used in a key agreement protocol.
     * 
    */
    public Optional<Boolean> keyAgreement() {
        return Optional.ofNullable(this.keyAgreement);
    }
    /**
     * The key may be used to encipher other keys.
     * 
    */
    public Optional<Boolean> keyEncipherment() {
        return Optional.ofNullable(this.keyEncipherment);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigKeyUsageBaseKeyUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean certSign;
        private @Nullable Boolean contentCommitment;
        private @Nullable Boolean crlSign;
        private @Nullable Boolean dataEncipherment;
        private @Nullable Boolean decipherOnly;
        private @Nullable Boolean digitalSignature;
        private @Nullable Boolean encipherOnly;
        private @Nullable Boolean keyAgreement;
        private @Nullable Boolean keyEncipherment;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigKeyUsageBaseKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certSign = defaults.certSign;
    	      this.contentCommitment = defaults.contentCommitment;
    	      this.crlSign = defaults.crlSign;
    	      this.dataEncipherment = defaults.dataEncipherment;
    	      this.decipherOnly = defaults.decipherOnly;
    	      this.digitalSignature = defaults.digitalSignature;
    	      this.encipherOnly = defaults.encipherOnly;
    	      this.keyAgreement = defaults.keyAgreement;
    	      this.keyEncipherment = defaults.keyEncipherment;
        }

        public Builder certSign(@Nullable Boolean certSign) {
            this.certSign = certSign;
            return this;
        }
        public Builder contentCommitment(@Nullable Boolean contentCommitment) {
            this.contentCommitment = contentCommitment;
            return this;
        }
        public Builder crlSign(@Nullable Boolean crlSign) {
            this.crlSign = crlSign;
            return this;
        }
        public Builder dataEncipherment(@Nullable Boolean dataEncipherment) {
            this.dataEncipherment = dataEncipherment;
            return this;
        }
        public Builder decipherOnly(@Nullable Boolean decipherOnly) {
            this.decipherOnly = decipherOnly;
            return this;
        }
        public Builder digitalSignature(@Nullable Boolean digitalSignature) {
            this.digitalSignature = digitalSignature;
            return this;
        }
        public Builder encipherOnly(@Nullable Boolean encipherOnly) {
            this.encipherOnly = encipherOnly;
            return this;
        }
        public Builder keyAgreement(@Nullable Boolean keyAgreement) {
            this.keyAgreement = keyAgreement;
            return this;
        }
        public Builder keyEncipherment(@Nullable Boolean keyEncipherment) {
            this.keyEncipherment = keyEncipherment;
            return this;
        }        public AuthorityConfigX509ConfigKeyUsageBaseKeyUsage build() {
            return new AuthorityConfigX509ConfigKeyUsageBaseKeyUsage(certSign, contentCommitment, crlSign, dataEncipherment, decipherOnly, digitalSignature, encipherOnly, keyAgreement, keyEncipherment);
        }
    }
}
