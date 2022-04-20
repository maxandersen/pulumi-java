// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.inputs;

import com.pulumi.azurenative.storsimple.enums.ManagerSkuType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * The Sku.
 * 
 */
public final class ManagerSkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagerSkuArgs Empty = new ManagerSkuArgs();

    /**
     * Refers to the sku name which should be &#34;Standard&#34;
     * 
     */
    @Import(name="name", required=true)
      private final Output<ManagerSkuType> name;

    public Output<ManagerSkuType> name() {
        return this.name;
    }

    public ManagerSkuArgs(Output<ManagerSkuType> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ManagerSkuArgs() {
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagerSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ManagerSkuType> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagerSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Output<ManagerSkuType> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(ManagerSkuType name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public ManagerSkuArgs build() {
            return new ManagerSkuArgs(name);
        }
    }
}
