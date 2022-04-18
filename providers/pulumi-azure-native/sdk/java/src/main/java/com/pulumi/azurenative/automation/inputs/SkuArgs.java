// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.azurenative.automation.enums.SkuNameEnum;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The account SKU.
 * 
 */
public final class SkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * Gets or sets the SKU capacity.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<Integer> capacity;

    public Output<Integer> capacity() {
        return this.capacity == null ? Codegen.empty() : this.capacity;
    }

    /**
     * Gets or sets the SKU family.
     * 
     */
    @Import(name="family")
      private final @Nullable Output<String> family;

    public Output<String> family() {
        return this.family == null ? Codegen.empty() : this.family;
    }

    /**
     * Gets or sets the SKU name of the account.
     * 
     */
    @Import(name="name", required=true)
      private final Output<Either<String,SkuNameEnum>> name;

    public Output<Either<String,SkuNameEnum>> name() {
        return this.name;
    }

    public SkuArgs(
        @Nullable Output<Integer> capacity,
        @Nullable Output<String> family,
        Output<Either<String,SkuNameEnum>> name) {
        this.capacity = capacity;
        this.family = family;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private SkuArgs() {
        this.capacity = Codegen.empty();
        this.family = Codegen.empty();
        this.name = Codegen.empty();
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
        private Output<Either<String,SkuNameEnum>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
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
        public Builder name(Output<Either<String,SkuNameEnum>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(Either<String,SkuNameEnum> name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public SkuArgs build() {
            return new SkuArgs(capacity, family, name);
        }
    }
}
