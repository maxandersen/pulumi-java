// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.azurenative.storagecache.inputs.KeyVaultKeyReferenceResponseSourceVault;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a reference to Key Vault Key.
 * 
 */
public final class KeyVaultKeyReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyVaultKeyReferenceResponse Empty = new KeyVaultKeyReferenceResponse();

    /**
     * The URL referencing a key encryption key in Key Vault.
     * 
     */
    @Import(name="keyUrl", required=true)
      private final String keyUrl;

    public String keyUrl() {
        return this.keyUrl;
    }

    /**
     * Describes a resource Id to source Key Vault.
     * 
     */
    @Import(name="sourceVault", required=true)
      private final KeyVaultKeyReferenceResponseSourceVault sourceVault;

    public KeyVaultKeyReferenceResponseSourceVault sourceVault() {
        return this.sourceVault;
    }

    public KeyVaultKeyReferenceResponse(
        String keyUrl,
        KeyVaultKeyReferenceResponseSourceVault sourceVault) {
        this.keyUrl = Objects.requireNonNull(keyUrl, "expected parameter 'keyUrl' to be non-null");
        this.sourceVault = Objects.requireNonNull(sourceVault, "expected parameter 'sourceVault' to be non-null");
    }

    private KeyVaultKeyReferenceResponse() {
        this.keyUrl = null;
        this.sourceVault = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyUrl;
        private KeyVaultKeyReferenceResponseSourceVault sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUrl = defaults.keyUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder keyUrl(String keyUrl) {
            this.keyUrl = Objects.requireNonNull(keyUrl);
            return this;
        }
        public Builder sourceVault(KeyVaultKeyReferenceResponseSourceVault sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }        public KeyVaultKeyReferenceResponse build() {
            return new KeyVaultKeyReferenceResponse(keyUrl, sourceVault);
        }
    }
}
