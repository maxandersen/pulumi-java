// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestack.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProductPropertiesResponse {
    /**
     * The version.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private ProductPropertiesResponse(@CustomType.Parameter("version") @Nullable String version) {
        this.version = version;
    }

    /**
     * The version.
     * 
    */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public ProductPropertiesResponse build() {
            return new ProductPropertiesResponse(version);
        }
    }
}
