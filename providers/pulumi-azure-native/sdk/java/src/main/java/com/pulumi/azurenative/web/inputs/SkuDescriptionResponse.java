// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.CapabilityResponse;
import com.pulumi.azurenative.web.inputs.SkuCapacityResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a SKU for a scalable resource.
 * 
 */
public final class SkuDescriptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final SkuDescriptionResponse Empty = new SkuDescriptionResponse();

    /**
     * Capabilities of the SKU, e.g., is traffic manager enabled?
     * 
     */
    @Import(name="capabilities")
    private @Nullable List<CapabilityResponse> capabilities;

    public Optional<List<CapabilityResponse>> capabilities() {
        return Optional.ofNullable(this.capabilities);
    }

    /**
     * Current number of instances assigned to the resource.
     * 
     */
    @Import(name="capacity")
    private @Nullable Integer capacity;

    public Optional<Integer> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * Family code of the resource SKU.
     * 
     */
    @Import(name="family")
    private @Nullable String family;

    public Optional<String> family() {
        return Optional.ofNullable(this.family);
    }

    /**
     * Locations of the SKU.
     * 
     */
    @Import(name="locations")
    private @Nullable List<String> locations;

    public Optional<List<String>> locations() {
        return Optional.ofNullable(this.locations);
    }

    /**
     * Name of the resource SKU.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Size specifier of the resource SKU.
     * 
     */
    @Import(name="size")
    private @Nullable String size;

    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * Min, max, and default scale values of the SKU.
     * 
     */
    @Import(name="skuCapacity")
    private @Nullable SkuCapacityResponse skuCapacity;

    public Optional<SkuCapacityResponse> skuCapacity() {
        return Optional.ofNullable(this.skuCapacity);
    }

    /**
     * Service tier of the resource SKU.
     * 
     */
    @Import(name="tier")
    private @Nullable String tier;

    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    private SkuDescriptionResponse() {}

    private SkuDescriptionResponse(SkuDescriptionResponse $) {
        this.capabilities = $.capabilities;
        this.capacity = $.capacity;
        this.family = $.family;
        this.locations = $.locations;
        this.name = $.name;
        this.size = $.size;
        this.skuCapacity = $.skuCapacity;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkuDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkuDescriptionResponse $;

        public Builder() {
            $ = new SkuDescriptionResponse();
        }

        public Builder(SkuDescriptionResponse defaults) {
            $ = new SkuDescriptionResponse(Objects.requireNonNull(defaults));
        }

        public Builder capabilities(@Nullable List<CapabilityResponse> capabilities) {
            $.capabilities = capabilities;
            return this;
        }

        public Builder capabilities(CapabilityResponse... capabilities) {
            return capabilities(List.of(capabilities));
        }

        public Builder capacity(@Nullable Integer capacity) {
            $.capacity = capacity;
            return this;
        }

        public Builder family(@Nullable String family) {
            $.family = family;
            return this;
        }

        public Builder locations(@Nullable List<String> locations) {
            $.locations = locations;
            return this;
        }

        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder size(@Nullable String size) {
            $.size = size;
            return this;
        }

        public Builder skuCapacity(@Nullable SkuCapacityResponse skuCapacity) {
            $.skuCapacity = skuCapacity;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            $.tier = tier;
            return this;
        }

        public SkuDescriptionResponse build() {
            return $;
        }
    }

}
