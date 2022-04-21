// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.SourceVaultResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Key Vault Key Url and vault id of KeK, KeK is optional and when provided is used to unwrap the encryptionKey
 * 
 */
public final class KeyVaultAndKeyReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyVaultAndKeyReferenceResponse Empty = new KeyVaultAndKeyReferenceResponse();

    /**
     * Url pointing to a key or secret in KeyVault
     * 
     */
    @Import(name="keyUrl", required=true)
    private String keyUrl;

    public String keyUrl() {
        return this.keyUrl;
    }

    /**
     * Resource id of the KeyVault containing the key or secret
     * 
     */
    @Import(name="sourceVault", required=true)
    private SourceVaultResponse sourceVault;

    public SourceVaultResponse sourceVault() {
        return this.sourceVault;
    }

    private KeyVaultAndKeyReferenceResponse() {}

    private KeyVaultAndKeyReferenceResponse(KeyVaultAndKeyReferenceResponse $) {
        this.keyUrl = $.keyUrl;
        this.sourceVault = $.sourceVault;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultAndKeyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultAndKeyReferenceResponse $;

        public Builder() {
            $ = new KeyVaultAndKeyReferenceResponse();
        }

        public Builder(KeyVaultAndKeyReferenceResponse defaults) {
            $ = new KeyVaultAndKeyReferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder keyUrl(String keyUrl) {
            $.keyUrl = keyUrl;
            return this;
        }

        public Builder sourceVault(SourceVaultResponse sourceVault) {
            $.sourceVault = sourceVault;
            return this;
        }

        public KeyVaultAndKeyReferenceResponse build() {
            $.keyUrl = Objects.requireNonNull($.keyUrl, "expected parameter 'keyUrl' to be non-null");
            $.sourceVault = Objects.requireNonNull($.sourceVault, "expected parameter 'sourceVault' to be non-null");
            return $;
        }
    }

}
