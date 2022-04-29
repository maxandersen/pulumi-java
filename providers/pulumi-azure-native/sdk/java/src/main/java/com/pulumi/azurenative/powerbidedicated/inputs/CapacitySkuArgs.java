// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerbidedicated.inputs;

import com.pulumi.azurenative.powerbidedicated.enums.CapacitySkuTier;
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
 * Represents the SKU name and Azure pricing tier for PowerBI Dedicated capacity resource.
 * 
 */
public final class CapacitySkuArgs extends ResourceArgs {

    public static final CapacitySkuArgs Empty = new CapacitySkuArgs();

    /**
     * The capacity of the SKU.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    /**
     * @return The capacity of the SKU.
     * 
     */
    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * Name of the SKU level.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the SKU level.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Azure pricing tier to which the SKU applies.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<Either<String,CapacitySkuTier>> tier;

    /**
     * @return The name of the Azure pricing tier to which the SKU applies.
     * 
     */
    public Optional<Output<Either<String,CapacitySkuTier>>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private CapacitySkuArgs() {}

    private CapacitySkuArgs(CapacitySkuArgs $) {
        this.capacity = $.capacity;
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CapacitySkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CapacitySkuArgs $;

        public Builder() {
            $ = new CapacitySkuArgs();
        }

        public Builder(CapacitySkuArgs defaults) {
            $ = new CapacitySkuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity The capacity of the SKU.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity The capacity of the SKU.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param name Name of the SKU level.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the SKU level.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tier The name of the Azure pricing tier to which the SKU applies.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<Either<String,CapacitySkuTier>> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The name of the Azure pricing tier to which the SKU applies.
         * 
         * @return builder
         * 
         */
        public Builder tier(Either<String,CapacitySkuTier> tier) {
            return tier(Output.of(tier));
        }

        /**
         * @param tier The name of the Azure pricing tier to which the SKU applies.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Either.ofLeft(tier));
        }

        /**
         * @param tier The name of the Azure pricing tier to which the SKU applies.
         * 
         * @return builder
         * 
         */
        public Builder tier(CapacitySkuTier tier) {
            return tier(Either.ofRight(tier));
        }

        public CapacitySkuArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
