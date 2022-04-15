// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.PublicIPAddressSkuName;
import io.pulumi.azurenative.network.enums.PublicIPAddressSkuTier;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SKU of a public IP address.
 * 
 */
public final class PublicIPAddressSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicIPAddressSkuArgs Empty = new PublicIPAddressSkuArgs();

    /**
     * Name of a public IP address SKU.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<Either<String,PublicIPAddressSkuName>> name;

    public Output<Either<String,PublicIPAddressSkuName>> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Tier of a public IP address SKU.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<Either<String,PublicIPAddressSkuTier>> tier;

    public Output<Either<String,PublicIPAddressSkuTier>> tier() {
        return this.tier == null ? Codegen.empty() : this.tier;
    }

    public PublicIPAddressSkuArgs(
        @Nullable Output<Either<String,PublicIPAddressSkuName>> name,
        @Nullable Output<Either<String,PublicIPAddressSkuTier>> tier) {
        this.name = name;
        this.tier = tier;
    }

    private PublicIPAddressSkuArgs() {
        this.name = Codegen.empty();
        this.tier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIPAddressSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,PublicIPAddressSkuName>> name;
        private @Nullable Output<Either<String,PublicIPAddressSkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicIPAddressSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(@Nullable Output<Either<String,PublicIPAddressSkuName>> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable Either<String,PublicIPAddressSkuName> name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tier(@Nullable Output<Either<String,PublicIPAddressSkuTier>> tier) {
            this.tier = tier;
            return this;
        }
        public Builder tier(@Nullable Either<String,PublicIPAddressSkuTier> tier) {
            this.tier = Codegen.ofNullable(tier);
            return this;
        }        public PublicIPAddressSkuArgs build() {
            return new PublicIPAddressSkuArgs(name, tier);
        }
    }
}
