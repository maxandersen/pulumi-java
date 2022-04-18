// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.purview.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Gets or sets the Sku.
 * 
 */
public final class AccountResponseSku extends com.pulumi.resources.InvokeArgs {

    public static final AccountResponseSku Empty = new AccountResponseSku();

    /**
     * Gets or sets the sku capacity.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Integer capacity;

    public Optional<Integer> capacity() {
        return this.capacity == null ? Optional.empty() : Optional.ofNullable(this.capacity);
    }

    /**
     * Gets or sets the sku name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public AccountResponseSku(
        @Nullable Integer capacity,
        @Nullable String name) {
        this.capacity = capacity;
        this.name = name;
    }

    private AccountResponseSku() {
        this.capacity = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountResponseSku defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountResponseSku defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public AccountResponseSku build() {
            return new AccountResponseSku(capacity, name);
        }
    }
}
