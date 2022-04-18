// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Key Vault containing the SSL certificate
 * 
 */
public final class KeyVaultCertificateSourceParametersResponseVault extends com.pulumi.resources.InvokeArgs {

    public static final KeyVaultCertificateSourceParametersResponseVault Empty = new KeyVaultCertificateSourceParametersResponseVault();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public KeyVaultCertificateSourceParametersResponseVault(@Nullable String id) {
        this.id = id;
    }

    private KeyVaultCertificateSourceParametersResponseVault() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultCertificateSourceParametersResponseVault defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultCertificateSourceParametersResponseVault defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public KeyVaultCertificateSourceParametersResponseVault build() {
            return new KeyVaultCertificateSourceParametersResponseVault(id);
        }
    }
}
