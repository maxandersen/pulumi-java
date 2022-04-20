// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The key vault properties for the encryption scope. This is a required field if encryption scope &#39;source&#39; attribute is set to &#39;Microsoft.KeyVault&#39;.
 * 
 */
public final class EncryptionScopeKeyVaultPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionScopeKeyVaultPropertiesArgs Empty = new EncryptionScopeKeyVaultPropertiesArgs();

    /**
     * The object identifier for a key vault key object. When applied, the encryption scope will use the key referenced by the identifier to enable customer-managed key support on this encryption scope.
     * 
     */
    @Import(name="keyUri")
      private final @Nullable Output<String> keyUri;

    public Output<String> keyUri() {
        return this.keyUri == null ? Codegen.empty() : this.keyUri;
    }

    public EncryptionScopeKeyVaultPropertiesArgs(@Nullable Output<String> keyUri) {
        this.keyUri = keyUri;
    }

    private EncryptionScopeKeyVaultPropertiesArgs() {
        this.keyUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionScopeKeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyUri;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionScopeKeyVaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUri = defaults.keyUri;
        }

        public Builder keyUri(@Nullable Output<String> keyUri) {
            this.keyUri = keyUri;
            return this;
        }
        public Builder keyUri(@Nullable String keyUri) {
            this.keyUri = Codegen.ofNullable(keyUri);
            return this;
        }        public EncryptionScopeKeyVaultPropertiesArgs build() {
            return new EncryptionScopeKeyVaultPropertiesArgs(keyUri);
        }
    }
}
