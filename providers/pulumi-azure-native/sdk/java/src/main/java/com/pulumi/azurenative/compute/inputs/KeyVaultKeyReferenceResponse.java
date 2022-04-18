// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a reference to Key Vault Key
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
     * The relative URL of the Key Vault containing the key.
     * 
     */
    @Import(name="sourceVault", required=true)
      private final SubResourceResponse sourceVault;

    public SubResourceResponse sourceVault() {
        return this.sourceVault;
    }

    public KeyVaultKeyReferenceResponse(
        String keyUrl,
        SubResourceResponse sourceVault) {
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
        private SubResourceResponse sourceVault;

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
        public Builder sourceVault(SubResourceResponse sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }        public KeyVaultKeyReferenceResponse build() {
            return new KeyVaultKeyReferenceResponse(keyUrl, sourceVault);
        }
    }
}
