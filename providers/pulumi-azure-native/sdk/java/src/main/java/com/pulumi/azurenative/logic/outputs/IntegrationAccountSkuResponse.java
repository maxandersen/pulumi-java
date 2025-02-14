// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IntegrationAccountSkuResponse {
    /**
     * @return The sku name.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private IntegrationAccountSkuResponse(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * @return The sku name.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public IntegrationAccountSkuResponse build() {
            return new IntegrationAccountSkuResponse(name);
        }
    }
}
