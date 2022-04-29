// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.ApplicationGatewaySkuName;
import com.pulumi.azurenative.network.enums.ApplicationGatewayTier;
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
 * SKU of an application gateway.
 * 
 */
public final class ApplicationGatewaySkuArgs extends ResourceArgs {

    public static final ApplicationGatewaySkuArgs Empty = new ApplicationGatewaySkuArgs();

    /**
     * Capacity (instance count) of an application gateway.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    /**
     * @return Capacity (instance count) of an application gateway.
     * 
     */
    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * Name of an application gateway SKU.
     * 
     */
    @Import(name="name")
    private @Nullable Output<Either<String,ApplicationGatewaySkuName>> name;

    /**
     * @return Name of an application gateway SKU.
     * 
     */
    public Optional<Output<Either<String,ApplicationGatewaySkuName>>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Tier of an application gateway.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<Either<String,ApplicationGatewayTier>> tier;

    /**
     * @return Tier of an application gateway.
     * 
     */
    public Optional<Output<Either<String,ApplicationGatewayTier>>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private ApplicationGatewaySkuArgs() {}

    private ApplicationGatewaySkuArgs(ApplicationGatewaySkuArgs $) {
        this.capacity = $.capacity;
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewaySkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewaySkuArgs $;

        public Builder() {
            $ = new ApplicationGatewaySkuArgs();
        }

        public Builder(ApplicationGatewaySkuArgs defaults) {
            $ = new ApplicationGatewaySkuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity Capacity (instance count) of an application gateway.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity Capacity (instance count) of an application gateway.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param name Name of an application gateway SKU.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<Either<String,ApplicationGatewaySkuName>> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of an application gateway SKU.
         * 
         * @return builder
         * 
         */
        public Builder name(Either<String,ApplicationGatewaySkuName> name) {
            return name(Output.of(name));
        }

        /**
         * @param name Name of an application gateway SKU.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Either.ofLeft(name));
        }

        /**
         * @param name Name of an application gateway SKU.
         * 
         * @return builder
         * 
         */
        public Builder name(ApplicationGatewaySkuName name) {
            return name(Either.ofRight(name));
        }

        /**
         * @param tier Tier of an application gateway.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<Either<String,ApplicationGatewayTier>> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier Tier of an application gateway.
         * 
         * @return builder
         * 
         */
        public Builder tier(Either<String,ApplicationGatewayTier> tier) {
            return tier(Output.of(tier));
        }

        /**
         * @param tier Tier of an application gateway.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Either.ofLeft(tier));
        }

        /**
         * @param tier Tier of an application gateway.
         * 
         * @return builder
         * 
         */
        public Builder tier(ApplicationGatewayTier tier) {
            return tier(Either.ofRight(tier));
        }

        public ApplicationGatewaySkuArgs build() {
            return $;
        }
    }

}
