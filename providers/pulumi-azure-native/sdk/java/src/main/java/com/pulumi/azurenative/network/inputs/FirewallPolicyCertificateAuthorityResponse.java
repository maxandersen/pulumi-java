// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trusted Root certificates properties for tls.
 * 
 */
public final class FirewallPolicyCertificateAuthorityResponse extends com.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyCertificateAuthorityResponse Empty = new FirewallPolicyCertificateAuthorityResponse();

    /**
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     * 
     */
    @Import(name="keyVaultSecretId")
      private final @Nullable String keyVaultSecretId;

    public Optional<String> keyVaultSecretId() {
        return this.keyVaultSecretId == null ? Optional.empty() : Optional.ofNullable(this.keyVaultSecretId);
    }

    /**
     * Name of the CA certificate.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public FirewallPolicyCertificateAuthorityResponse(
        @Nullable String keyVaultSecretId,
        @Nullable String name) {
        this.keyVaultSecretId = keyVaultSecretId;
        this.name = name;
    }

    private FirewallPolicyCertificateAuthorityResponse() {
        this.keyVaultSecretId = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyCertificateAuthorityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyVaultSecretId;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyCertificateAuthorityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultSecretId = defaults.keyVaultSecretId;
    	      this.name = defaults.name;
        }

        public Builder keyVaultSecretId(@Nullable String keyVaultSecretId) {
            this.keyVaultSecretId = keyVaultSecretId;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public FirewallPolicyCertificateAuthorityResponse build() {
            return new FirewallPolicyCertificateAuthorityResponse(keyVaultSecretId, name);
        }
    }
}
