// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blockchain.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Consortium payload
 * 
 */
public final class ConsortiumResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConsortiumResponse Empty = new ConsortiumResponse();

    /**
     * Gets or sets the blockchain member name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Gets or sets the protocol for the consortium.
     * 
     */
    @Import(name="protocol")
      private final @Nullable String protocol;

    public Optional<String> protocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    public ConsortiumResponse(
        @Nullable String name,
        @Nullable String protocol) {
        this.name = name;
        this.protocol = protocol;
    }

    private ConsortiumResponse() {
        this.name = null;
        this.protocol = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsortiumResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsortiumResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }        public ConsortiumResponse build() {
            return new ConsortiumResponse(name, protocol);
        }
    }
}
