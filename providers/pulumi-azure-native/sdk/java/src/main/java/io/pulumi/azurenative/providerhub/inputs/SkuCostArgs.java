// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SkuCostArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuCostArgs Empty = new SkuCostArgs();

    @Import(name="extendedUnit")
      private final @Nullable Output<String> extendedUnit;

    public Output<String> extendedUnit() {
        return this.extendedUnit == null ? Codegen.empty() : this.extendedUnit;
    }

    @Import(name="meterId", required=true)
      private final Output<String> meterId;

    public Output<String> meterId() {
        return this.meterId;
    }

    @Import(name="quantity")
      private final @Nullable Output<Integer> quantity;

    public Output<Integer> quantity() {
        return this.quantity == null ? Codegen.empty() : this.quantity;
    }

    public SkuCostArgs(
        @Nullable Output<String> extendedUnit,
        Output<String> meterId,
        @Nullable Output<Integer> quantity) {
        this.extendedUnit = extendedUnit;
        this.meterId = Objects.requireNonNull(meterId, "expected parameter 'meterId' to be non-null");
        this.quantity = quantity;
    }

    private SkuCostArgs() {
        this.extendedUnit = Codegen.empty();
        this.meterId = Codegen.empty();
        this.quantity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuCostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> extendedUnit;
        private Output<String> meterId;
        private @Nullable Output<Integer> quantity;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuCostArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedUnit = defaults.extendedUnit;
    	      this.meterId = defaults.meterId;
    	      this.quantity = defaults.quantity;
        }

        public Builder extendedUnit(@Nullable Output<String> extendedUnit) {
            this.extendedUnit = extendedUnit;
            return this;
        }
        public Builder extendedUnit(@Nullable String extendedUnit) {
            this.extendedUnit = Codegen.ofNullable(extendedUnit);
            return this;
        }
        public Builder meterId(Output<String> meterId) {
            this.meterId = Objects.requireNonNull(meterId);
            return this;
        }
        public Builder meterId(String meterId) {
            this.meterId = Output.of(Objects.requireNonNull(meterId));
            return this;
        }
        public Builder quantity(@Nullable Output<Integer> quantity) {
            this.quantity = quantity;
            return this;
        }
        public Builder quantity(@Nullable Integer quantity) {
            this.quantity = Codegen.ofNullable(quantity);
            return this;
        }        public SkuCostArgs build() {
            return new SkuCostArgs(extendedUnit, meterId, quantity);
        }
    }
}
