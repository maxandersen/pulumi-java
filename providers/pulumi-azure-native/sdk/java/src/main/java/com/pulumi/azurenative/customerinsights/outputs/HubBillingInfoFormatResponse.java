// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HubBillingInfoFormatResponse {
    /**
     * @return The maximum number of units can be used.  One unit is 10,000 Profiles and 100,000 Interactions.
     * 
     */
    private final @Nullable Integer maxUnits;
    /**
     * @return The minimum number of units will be billed. One unit is 10,000 Profiles and 100,000 Interactions.
     * 
     */
    private final @Nullable Integer minUnits;
    /**
     * @return The sku name.
     * 
     */
    private final @Nullable String skuName;

    @CustomType.Constructor
    private HubBillingInfoFormatResponse(
        @CustomType.Parameter("maxUnits") @Nullable Integer maxUnits,
        @CustomType.Parameter("minUnits") @Nullable Integer minUnits,
        @CustomType.Parameter("skuName") @Nullable String skuName) {
        this.maxUnits = maxUnits;
        this.minUnits = minUnits;
        this.skuName = skuName;
    }

    /**
     * @return The maximum number of units can be used.  One unit is 10,000 Profiles and 100,000 Interactions.
     * 
     */
    public Optional<Integer> maxUnits() {
        return Optional.ofNullable(this.maxUnits);
    }
    /**
     * @return The minimum number of units will be billed. One unit is 10,000 Profiles and 100,000 Interactions.
     * 
     */
    public Optional<Integer> minUnits() {
        return Optional.ofNullable(this.minUnits);
    }
    /**
     * @return The sku name.
     * 
     */
    public Optional<String> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubBillingInfoFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxUnits;
        private @Nullable Integer minUnits;
        private @Nullable String skuName;

        public Builder() {
    	      // Empty
        }

        public Builder(HubBillingInfoFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnits = defaults.maxUnits;
    	      this.minUnits = defaults.minUnits;
    	      this.skuName = defaults.skuName;
        }

        public Builder maxUnits(@Nullable Integer maxUnits) {
            this.maxUnits = maxUnits;
            return this;
        }
        public Builder minUnits(@Nullable Integer minUnits) {
            this.minUnits = minUnits;
            return this;
        }
        public Builder skuName(@Nullable String skuName) {
            this.skuName = skuName;
            return this;
        }        public HubBillingInfoFormatResponse build() {
            return new HubBillingInfoFormatResponse(maxUnits, minUnits, skuName);
        }
    }
}
