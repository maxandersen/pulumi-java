// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The key vault reference.
 * 
 */
public final class KeyVaultReference extends InvokeArgs {

    public static final KeyVaultReference Empty = new KeyVaultReference();

    /**
     * The resource id.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The resource id.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The key vault name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The key vault name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private KeyVaultReference() {}

    private KeyVaultReference(KeyVaultReference $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultReference $;

        public Builder() {
            $ = new KeyVaultReference();
        }

        public Builder(KeyVaultReference defaults) {
            $ = new KeyVaultReference(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The resource id.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The key vault name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public KeyVaultReference build() {
            return $;
        }
    }

}
