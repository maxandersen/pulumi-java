// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionDetailsResponse {
    /**
     * The key encryption key certificate expiry date.
     * 
     */
    private final @Nullable String kekCertExpiryDate;
    /**
     * The key encryption key certificate thumbprint.
     * 
     */
    private final @Nullable String kekCertThumbprint;
    /**
     * The key encryption key state for the Vmm.
     * 
     */
    private final @Nullable String kekState;

    @CustomType.Constructor
    private EncryptionDetailsResponse(
        @CustomType.Parameter("kekCertExpiryDate") @Nullable String kekCertExpiryDate,
        @CustomType.Parameter("kekCertThumbprint") @Nullable String kekCertThumbprint,
        @CustomType.Parameter("kekState") @Nullable String kekState) {
        this.kekCertExpiryDate = kekCertExpiryDate;
        this.kekCertThumbprint = kekCertThumbprint;
        this.kekState = kekState;
    }

    /**
     * The key encryption key certificate expiry date.
     * 
    */
    public Optional<String> kekCertExpiryDate() {
        return Optional.ofNullable(this.kekCertExpiryDate);
    }
    /**
     * The key encryption key certificate thumbprint.
     * 
    */
    public Optional<String> kekCertThumbprint() {
        return Optional.ofNullable(this.kekCertThumbprint);
    }
    /**
     * The key encryption key state for the Vmm.
     * 
    */
    public Optional<String> kekState() {
        return Optional.ofNullable(this.kekState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kekCertExpiryDate;
        private @Nullable String kekCertThumbprint;
        private @Nullable String kekState;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kekCertExpiryDate = defaults.kekCertExpiryDate;
    	      this.kekCertThumbprint = defaults.kekCertThumbprint;
    	      this.kekState = defaults.kekState;
        }

        public Builder kekCertExpiryDate(@Nullable String kekCertExpiryDate) {
            this.kekCertExpiryDate = kekCertExpiryDate;
            return this;
        }
        public Builder kekCertThumbprint(@Nullable String kekCertThumbprint) {
            this.kekCertThumbprint = kekCertThumbprint;
            return this;
        }
        public Builder kekState(@Nullable String kekState) {
            this.kekState = kekState;
            return this;
        }        public EncryptionDetailsResponse build() {
            return new EncryptionDetailsResponse(kekCertExpiryDate, kekCertThumbprint, kekState);
        }
    }
}
