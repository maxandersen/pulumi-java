// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.enums.AzureSkuName;
import io.pulumi.azurenative.synapse.enums.AzureSkuTier;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure SKU definition.
 * 
 */
public final class AzureSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureSkuArgs Empty = new AzureSkuArgs();

    /**
     * The number of instances of the cluster.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<Integer> capacity;

    public Output<Integer> capacity() {
        return this.capacity == null ? Codegen.empty() : this.capacity;
    }

    /**
     * SKU name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<Either<String,AzureSkuName>> name;

    public Output<Either<String,AzureSkuName>> name() {
        return this.name;
    }

    /**
     * SKU tier.
     * 
     */
    @Import(name="tier", required=true)
      private final Output<Either<String,AzureSkuTier>> tier;

    public Output<Either<String,AzureSkuTier>> tier() {
        return this.tier;
    }

    public AzureSkuArgs(
        @Nullable Output<Integer> capacity,
        Output<Either<String,AzureSkuName>> name,
        Output<Either<String,AzureSkuTier>> tier) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
    }

    private AzureSkuArgs() {
        this.capacity = Codegen.empty();
        this.name = Codegen.empty();
        this.tier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> capacity;
        private Output<Either<String,AzureSkuName>> name;
        private Output<Either<String,AzureSkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSkuArgs defaults) {
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
        public Builder name(Output<Either<String,AzureSkuName>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(Either<String,AzureSkuName> name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder tier(Output<Either<String,AzureSkuTier>> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder tier(Either<String,AzureSkuTier> tier) {
            this.tier = Output.of(Objects.requireNonNull(tier));
            return this;
        }        public AzureSkuArgs build() {
            return new AzureSkuArgs(capacity, name, tier);
        }
    }
}
