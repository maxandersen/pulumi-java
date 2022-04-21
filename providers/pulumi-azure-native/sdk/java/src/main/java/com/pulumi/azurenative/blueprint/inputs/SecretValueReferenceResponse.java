// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.inputs;

import com.pulumi.azurenative.blueprint.inputs.KeyVaultReferenceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Reference to a Key Vault secret.
 * 
 */
public final class SecretValueReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SecretValueReferenceResponse Empty = new SecretValueReferenceResponse();

    /**
     * Specifies the reference to a given Azure Key Vault.
     * 
     */
    @Import(name="keyVault", required=true)
    private KeyVaultReferenceResponse keyVault;

    public KeyVaultReferenceResponse keyVault() {
        return this.keyVault;
    }

    /**
     * Name of the secret.
     * 
     */
    @Import(name="secretName", required=true)
    private String secretName;

    public String secretName() {
        return this.secretName;
    }

    /**
     * The version of the secret to use. If left blank, the latest version of the secret is used.
     * 
     */
    @Import(name="secretVersion")
    private @Nullable String secretVersion;

    public Optional<String> secretVersion() {
        return Optional.ofNullable(this.secretVersion);
    }

    private SecretValueReferenceResponse() {}

    private SecretValueReferenceResponse(SecretValueReferenceResponse $) {
        this.keyVault = $.keyVault;
        this.secretName = $.secretName;
        this.secretVersion = $.secretVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretValueReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretValueReferenceResponse $;

        public Builder() {
            $ = new SecretValueReferenceResponse();
        }

        public Builder(SecretValueReferenceResponse defaults) {
            $ = new SecretValueReferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder keyVault(KeyVaultReferenceResponse keyVault) {
            $.keyVault = keyVault;
            return this;
        }

        public Builder secretName(String secretName) {
            $.secretName = secretName;
            return this;
        }

        public Builder secretVersion(@Nullable String secretVersion) {
            $.secretVersion = secretVersion;
            return this;
        }

        public SecretValueReferenceResponse build() {
            $.keyVault = Objects.requireNonNull($.keyVault, "expected parameter 'keyVault' to be non-null");
            $.secretName = Objects.requireNonNull($.secretName, "expected parameter 'secretName' to be non-null");
            return $;
        }
    }

}
