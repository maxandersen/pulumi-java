// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.vmwarecloudsimple.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SkuResponse {
    /**
     * The capacity of the SKU
     * 
     */
    private final @Nullable String capacity;
    /**
     * dedicatedCloudNode example: 8 x Ten-Core Intel® Xeon® Processor E5-2640 v4 2.40GHz 25MB Cache (90W); 12 x 64GB PC4-19200 2400MHz DDR4 ECC Registered DIMM, ...
     * 
     */
    private final @Nullable String description;
    /**
     * If the service has different generations of hardware, for the same SKU, then that can be captured here
     * 
     */
    private final @Nullable String family;
    /**
     * The name of the SKU for VMWare CloudSimple Node
     * 
     */
    private final String name;
    /**
     * The tier of the SKU
     * 
     */
    private final @Nullable String tier;

    @CustomType.Constructor
    private SkuResponse(
        @CustomType.Parameter("capacity") @Nullable String capacity,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("family") @Nullable String family,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tier") @Nullable String tier) {
        this.capacity = capacity;
        this.description = description;
        this.family = family;
        this.name = name;
        this.tier = tier;
    }

    /**
     * The capacity of the SKU
     * 
    */
    public Optional<String> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * dedicatedCloudNode example: 8 x Ten-Core Intel® Xeon® Processor E5-2640 v4 2.40GHz 25MB Cache (90W); 12 x 64GB PC4-19200 2400MHz DDR4 ECC Registered DIMM, ...
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * If the service has different generations of hardware, for the same SKU, then that can be captured here
     * 
    */
    public Optional<String> family() {
        return Optional.ofNullable(this.family);
    }
    /**
     * The name of the SKU for VMWare CloudSimple Node
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The tier of the SKU
     * 
    */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String capacity;
        private @Nullable String description;
        private @Nullable String family;
        private String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.description = defaults.description;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable String capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder family(@Nullable String family) {
            this.family = family;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public SkuResponse build() {
            return new SkuResponse(capacity, description, family, name, tier);
        }
    }
}
