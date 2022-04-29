// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a resource Id to source Key Vault.
 * 
 */
public final class KeyVaultKeyReferenceSourceVaultArgs extends ResourceArgs {

    public static final KeyVaultKeyReferenceSourceVaultArgs Empty = new KeyVaultKeyReferenceSourceVaultArgs();

    /**
     * Resource Id.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource Id.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private KeyVaultKeyReferenceSourceVaultArgs() {}

    private KeyVaultKeyReferenceSourceVaultArgs(KeyVaultKeyReferenceSourceVaultArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultKeyReferenceSourceVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultKeyReferenceSourceVaultArgs $;

        public Builder() {
            $ = new KeyVaultKeyReferenceSourceVaultArgs();
        }

        public Builder(KeyVaultKeyReferenceSourceVaultArgs defaults) {
            $ = new KeyVaultKeyReferenceSourceVaultArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource Id.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource Id.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public KeyVaultKeyReferenceSourceVaultArgs build() {
            return $;
        }
    }

}
