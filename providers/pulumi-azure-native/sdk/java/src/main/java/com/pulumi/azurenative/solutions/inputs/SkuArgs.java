// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SKU for the resource.
 * 
 */
public final class SkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The SKU capacity.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * The SKU family.
     * 
     */
    @Import(name="family")
    private @Nullable Output<String> family;

    public Optional<Output<String>> family() {
        return Optional.ofNullable(this.family);
    }

    /**
     * The SKU model.
     * 
     */
    @Import(name="model")
    private @Nullable Output<String> model;

    public Optional<Output<String>> model() {
        return Optional.ofNullable(this.model);
    }

    /**
     * The SKU name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The SKU size.
     * 
     */
    @Import(name="size")
    private @Nullable Output<String> size;

    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The SKU tier.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private SkuArgs() {}

    private SkuArgs(SkuArgs $) {
        this.capacity = $.capacity;
        this.family = $.family;
        this.model = $.model;
        this.name = $.name;
        this.size = $.size;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkuArgs $;

        public Builder() {
            $ = new SkuArgs();
        }

        public Builder(SkuArgs defaults) {
            $ = new SkuArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        public Builder family(@Nullable Output<String> family) {
            $.family = family;
            return this;
        }

        public Builder family(String family) {
            return family(Output.of(family));
        }

        public Builder model(@Nullable Output<String> model) {
            $.model = model;
            return this;
        }

        public Builder model(String model) {
            return model(Output.of(model));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        public Builder size(String size) {
            return size(Output.of(size));
        }

        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public SkuArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
