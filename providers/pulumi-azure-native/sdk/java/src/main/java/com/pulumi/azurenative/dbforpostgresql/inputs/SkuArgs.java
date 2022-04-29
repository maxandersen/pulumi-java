// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbforpostgresql.inputs;

import com.pulumi.azurenative.dbforpostgresql.enums.SkuTier;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Billing information related properties of a server.
 * 
 */
public final class SkuArgs extends ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The scale up/out capacity, representing server&#39;s compute units.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    /**
     * @return The scale up/out capacity, representing server&#39;s compute units.
     * 
     */
    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * The family of hardware.
     * 
     */
    @Import(name="family")
    private @Nullable Output<String> family;

    /**
     * @return The family of hardware.
     * 
     */
    public Optional<Output<String>> family() {
        return Optional.ofNullable(this.family);
    }

    /**
     * The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1, GP_Gen5_8.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1, GP_Gen5_8.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The size code, to be interpreted by resource as appropriate.
     * 
     */
    @Import(name="size")
    private @Nullable Output<String> size;

    /**
     * @return The size code, to be interpreted by resource as appropriate.
     * 
     */
    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The tier of the particular SKU, e.g. Basic.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<Either<String,SkuTier>> tier;

    /**
     * @return The tier of the particular SKU, e.g. Basic.
     * 
     */
    public Optional<Output<Either<String,SkuTier>>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private SkuArgs() {}

    private SkuArgs(SkuArgs $) {
        this.capacity = $.capacity;
        this.family = $.family;
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

        /**
         * @param capacity The scale up/out capacity, representing server&#39;s compute units.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity The scale up/out capacity, representing server&#39;s compute units.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param family The family of hardware.
         * 
         * @return builder
         * 
         */
        public Builder family(@Nullable Output<String> family) {
            $.family = family;
            return this;
        }

        /**
         * @param family The family of hardware.
         * 
         * @return builder
         * 
         */
        public Builder family(String family) {
            return family(Output.of(family));
        }

        /**
         * @param name The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1, GP_Gen5_8.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1, GP_Gen5_8.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param size The size code, to be interpreted by resource as appropriate.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size code, to be interpreted by resource as appropriate.
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Output.of(size));
        }

        /**
         * @param tier The tier of the particular SKU, e.g. Basic.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<Either<String,SkuTier>> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The tier of the particular SKU, e.g. Basic.
         * 
         * @return builder
         * 
         */
        public Builder tier(Either<String,SkuTier> tier) {
            return tier(Output.of(tier));
        }

        /**
         * @param tier The tier of the particular SKU, e.g. Basic.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Either.ofLeft(tier));
        }

        /**
         * @param tier The tier of the particular SKU, e.g. Basic.
         * 
         * @return builder
         * 
         */
        public Builder tier(SkuTier tier) {
            return tier(Either.ofRight(tier));
        }

        public SkuArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
