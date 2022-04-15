// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SkuResponse {
    /**
     * The SKU name. Required for account creation; optional for update. Note that in older versions, SKU name was called accountType.
     * 
     */
    private final String name;
    /**
     * The SKU tier. This is based on the SKU name.
     * 
     */
    private final String tier;

    @CustomType.Constructor
    private SkuResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tier") String tier) {
        this.name = name;
        this.tier = tier;
    }

    /**
     * The SKU name. Required for account creation; optional for update. Note that in older versions, SKU name was called accountType.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The SKU tier. This is based on the SKU name.
     * 
    */
    public String tier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }        public SkuResponse build() {
            return new SkuResponse(name, tier);
        }
    }
}
