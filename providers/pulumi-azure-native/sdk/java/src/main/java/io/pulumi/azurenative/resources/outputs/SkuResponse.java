// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SkuResponse {
    /**
     * The SKU capacity.
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * The SKU family.
     * 
     */
    private final @Nullable String family;
    /**
     * The SKU model.
     * 
     */
    private final @Nullable String model;
    /**
     * The SKU name.
     * 
     */
    private final @Nullable String name;
    /**
     * The SKU size.
     * 
     */
    private final @Nullable String size;
    /**
     * The SKU tier.
     * 
     */
    private final @Nullable String tier;

    @CustomType.Constructor
    private SkuResponse(
        @CustomType.Parameter("capacity") @Nullable Integer capacity,
        @CustomType.Parameter("family") @Nullable String family,
        @CustomType.Parameter("model") @Nullable String model,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("size") @Nullable String size,
        @CustomType.Parameter("tier") @Nullable String tier) {
        this.capacity = capacity;
        this.family = family;
        this.model = model;
        this.name = name;
        this.size = size;
        this.tier = tier;
    }

    /**
     * The SKU capacity.
     * 
    */
    public Optional<Integer> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * The SKU family.
     * 
    */
    public Optional<String> family() {
        return Optional.ofNullable(this.family);
    }
    /**
     * The SKU model.
     * 
    */
    public Optional<String> model() {
        return Optional.ofNullable(this.model);
    }
    /**
     * The SKU name.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The SKU size.
     * 
    */
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * The SKU tier.
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
        private @Nullable Integer capacity;
        private @Nullable String family;
        private @Nullable String model;
        private @Nullable String name;
        private @Nullable String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.model = defaults.model;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder family(@Nullable String family) {
            this.family = family;
            return this;
        }
        public Builder model(@Nullable String model) {
            this.model = model;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public SkuResponse build() {
            return new SkuResponse(capacity, family, model, name, size, tier);
        }
    }
}
