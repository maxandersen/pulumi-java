// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NatGatewaySkuResponse {
    /**
     * Name of Nat Gateway SKU.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private NatGatewaySkuResponse(@CustomType.Parameter("name") @Nullable String name) {
        this.name = name;
    }

    /**
     * Name of Nat Gateway SKU.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatGatewaySkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(NatGatewaySkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public NatGatewaySkuResponse build() {
            return new NatGatewaySkuResponse(name);
        }
    }
}
