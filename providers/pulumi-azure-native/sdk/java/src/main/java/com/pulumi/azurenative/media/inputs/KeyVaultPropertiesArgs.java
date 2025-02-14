// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyVaultPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyVaultPropertiesArgs Empty = new KeyVaultPropertiesArgs();

    /**
     * The URL of the Key Vault key used to encrypt the account. The key may either be versioned (for example https://vault/keys/mykey/version1) or reference a key without a version (for example https://vault/keys/mykey).
     * 
     */
    @Import(name="keyIdentifier")
    private @Nullable Output<String> keyIdentifier;

    /**
     * @return The URL of the Key Vault key used to encrypt the account. The key may either be versioned (for example https://vault/keys/mykey/version1) or reference a key without a version (for example https://vault/keys/mykey).
     * 
     */
    public Optional<Output<String>> keyIdentifier() {
        return Optional.ofNullable(this.keyIdentifier);
    }

    private KeyVaultPropertiesArgs() {}

    private KeyVaultPropertiesArgs(KeyVaultPropertiesArgs $) {
        this.keyIdentifier = $.keyIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultPropertiesArgs $;

        public Builder() {
            $ = new KeyVaultPropertiesArgs();
        }

        public Builder(KeyVaultPropertiesArgs defaults) {
            $ = new KeyVaultPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyIdentifier The URL of the Key Vault key used to encrypt the account. The key may either be versioned (for example https://vault/keys/mykey/version1) or reference a key without a version (for example https://vault/keys/mykey).
         * 
         * @return builder
         * 
         */
        public Builder keyIdentifier(@Nullable Output<String> keyIdentifier) {
            $.keyIdentifier = keyIdentifier;
            return this;
        }

        /**
         * @param keyIdentifier The URL of the Key Vault key used to encrypt the account. The key may either be versioned (for example https://vault/keys/mykey/version1) or reference a key without a version (for example https://vault/keys/mykey).
         * 
         * @return builder
         * 
         */
        public Builder keyIdentifier(String keyIdentifier) {
            return keyIdentifier(Output.of(keyIdentifier));
        }

        public KeyVaultPropertiesArgs build() {
            return $;
        }
    }

}
