// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.enums.SkuFamily;
import io.pulumi.azurenative.keyvault.enums.SkuName;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * SKU details
 * 
 */
public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * SKU family name
     * 
     */
    @Import(name="family", required=true)
      private final Output<Either<String,SkuFamily>> family;

    public Output<Either<String,SkuFamily>> family() {
        return this.family;
    }

    /**
     * SKU name to specify whether the key vault is a standard vault or a premium vault.
     * 
     */
    @Import(name="name", required=true)
      private final Output<SkuName> name;

    public Output<SkuName> name() {
        return this.name;
    }

    public SkuArgs(
        Output<Either<String,SkuFamily>> family,
        Output<SkuName> name) {
        this.family = Objects.requireNonNull(family, "expected parameter 'family' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private SkuArgs() {
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
        private Output<Either<String,SkuFamily>> family;
        private Output<SkuName> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
    	      this.name = defaults.name;
        }

        public Builder family(Output<Either<String,SkuFamily>> family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }
        public Builder family(Either<String,SkuFamily> family) {
            this.family = Output.of(Objects.requireNonNull(family));
            return this;
        }
        public Builder name(Output<SkuName> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(SkuName name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public SkuArgs build() {
            return new SkuArgs(family, name);
        }
    }
}
