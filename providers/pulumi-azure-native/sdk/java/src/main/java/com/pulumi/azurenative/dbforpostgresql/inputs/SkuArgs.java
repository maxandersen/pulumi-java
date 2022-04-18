// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbforpostgresql.inputs;

import com.pulumi.azurenative.dbforpostgresql.enums.SkuTier;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Billing information related properties of a server.
 * 
 */
public final class SkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The scale up/out capacity, representing server's compute units.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<Integer> capacity;

    public Output<Integer> capacity() {
        return this.capacity == null ? Codegen.empty() : this.capacity;
    }

    /**
     * The family of hardware.
     * 
     */
    @Import(name="family")
      private final @Nullable Output<String> family;

    public Output<String> family() {
        return this.family == null ? Codegen.empty() : this.family;
    }

    /**
     * The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1, GP_Gen5_8.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The size code, to be interpreted by resource as appropriate.
     * 
     */
    @Import(name="size")
      private final @Nullable Output<String> size;

    public Output<String> size() {
        return this.size == null ? Codegen.empty() : this.size;
    }

    /**
     * The tier of the particular SKU, e.g. Basic.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<Either<String,SkuTier>> tier;

    public Output<Either<String,SkuTier>> tier() {
        return this.tier == null ? Codegen.empty() : this.tier;
    }

    public SkuArgs(
        @Nullable Output<Integer> capacity,
        @Nullable Output<String> family,
        Output<String> name,
        @Nullable Output<String> size,
        @Nullable Output<Either<String,SkuTier>> tier) {
        this.capacity = capacity;
        this.family = family;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.size = size;
        this.tier = tier;
    }

    private SkuArgs() {
        this.capacity = Codegen.empty();
        this.family = Codegen.empty();
        this.name = Codegen.empty();
        this.size = Codegen.empty();
        this.tier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> capacity;
        private @Nullable Output<String> family;
        private Output<String> name;
        private @Nullable Output<String> size;
        private @Nullable Output<Either<String,SkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
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
        public Builder family(@Nullable Output<String> family) {
            this.family = family;
            return this;
        }
        public Builder family(@Nullable String family) {
            this.family = Codegen.ofNullable(family);
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
        public Builder size(@Nullable Output<String> size) {
            this.size = size;
            return this;
        }
        public Builder size(@Nullable String size) {
            this.size = Codegen.ofNullable(size);
            return this;
        }
        public Builder tier(@Nullable Output<Either<String,SkuTier>> tier) {
            this.tier = tier;
            return this;
        }
        public Builder tier(@Nullable Either<String,SkuTier> tier) {
            this.tier = Codegen.ofNullable(tier);
            return this;
        }        public SkuArgs build() {
            return new SkuArgs(capacity, family, name, size, tier);
        }
    }
}
