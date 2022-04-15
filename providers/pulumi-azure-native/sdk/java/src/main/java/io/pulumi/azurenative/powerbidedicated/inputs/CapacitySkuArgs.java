// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbidedicated.inputs;

import io.pulumi.azurenative.powerbidedicated.enums.CapacitySkuTier;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the SKU name and Azure pricing tier for PowerBI Dedicated capacity resource.
 * 
 */
public final class CapacitySkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapacitySkuArgs Empty = new CapacitySkuArgs();

    /**
     * The capacity of the SKU.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<Integer> capacity;

    public Output<Integer> capacity() {
        return this.capacity == null ? Codegen.empty() : this.capacity;
    }

    /**
     * Name of the SKU level.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Azure pricing tier to which the SKU applies.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<Either<String,CapacitySkuTier>> tier;

    public Output<Either<String,CapacitySkuTier>> tier() {
        return this.tier == null ? Codegen.empty() : this.tier;
    }

    public CapacitySkuArgs(
        @Nullable Output<Integer> capacity,
        Output<String> name,
        @Nullable Output<Either<String,CapacitySkuTier>> tier) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tier = tier;
    }

    private CapacitySkuArgs() {
        this.capacity = Codegen.empty();
        this.name = Codegen.empty();
        this.tier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacitySkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> capacity;
        private Output<String> name;
        private @Nullable Output<Either<String,CapacitySkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacitySkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Output<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = Codegen.ofNullable(capacity);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder tier(@Nullable Output<Either<String,CapacitySkuTier>> tier) {
            this.tier = tier;
            return this;
        }
        public Builder tier(@Nullable Either<String,CapacitySkuTier> tier) {
            this.tier = Codegen.ofNullable(tier);
            return this;
        }        public CapacitySkuArgs build() {
            return new CapacitySkuArgs(capacity, name, tier);
        }
    }
}
