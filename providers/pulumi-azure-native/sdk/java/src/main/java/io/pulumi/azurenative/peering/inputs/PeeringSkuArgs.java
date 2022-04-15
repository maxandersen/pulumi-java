// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.azurenative.peering.enums.Family;
import io.pulumi.azurenative.peering.enums.Size;
import io.pulumi.azurenative.peering.enums.Tier;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The SKU that defines the tier and kind of the peering.
 * 
 */
public final class PeeringSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeeringSkuArgs Empty = new PeeringSkuArgs();

    /**
     * The family of the peering SKU.
     * 
     */
    @Import(name="family")
      private final @Nullable Output<Either<String,Family>> family;

    public Output<Either<String,Family>> family() {
        return this.family == null ? Codegen.empty() : this.family;
    }

    /**
     * The name of the peering SKU.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The size of the peering SKU.
     * 
     */
    @Import(name="size")
      private final @Nullable Output<Either<String,Size>> size;

    public Output<Either<String,Size>> size() {
        return this.size == null ? Codegen.empty() : this.size;
    }

    /**
     * The tier of the peering SKU.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<Either<String,Tier>> tier;

    public Output<Either<String,Tier>> tier() {
        return this.tier == null ? Codegen.empty() : this.tier;
    }

    public PeeringSkuArgs(
        @Nullable Output<Either<String,Family>> family,
        @Nullable Output<String> name,
        @Nullable Output<Either<String,Size>> size,
        @Nullable Output<Either<String,Tier>> tier) {
        this.family = family;
        this.name = name;
        this.size = size;
        this.tier = tier;
    }

    private PeeringSkuArgs() {
        this.family = Codegen.empty();
        this.name = Codegen.empty();
        this.size = Codegen.empty();
        this.tier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,Family>> family;
        private @Nullable Output<String> name;
        private @Nullable Output<Either<String,Size>> size;
        private @Nullable Output<Either<String,Tier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder family(@Nullable Output<Either<String,Family>> family) {
            this.family = family;
            return this;
        }
        public Builder family(@Nullable Either<String,Family> family) {
            this.family = Codegen.ofNullable(family);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder size(@Nullable Output<Either<String,Size>> size) {
            this.size = size;
            return this;
        }
        public Builder size(@Nullable Either<String,Size> size) {
            this.size = Codegen.ofNullable(size);
            return this;
        }
        public Builder tier(@Nullable Output<Either<String,Tier>> tier) {
            this.tier = tier;
            return this;
        }
        public Builder tier(@Nullable Either<String,Tier> tier) {
            this.tier = Codegen.ofNullable(tier);
            return this;
        }        public PeeringSkuArgs build() {
            return new PeeringSkuArgs(family, name, size, tier);
        }
    }
}
