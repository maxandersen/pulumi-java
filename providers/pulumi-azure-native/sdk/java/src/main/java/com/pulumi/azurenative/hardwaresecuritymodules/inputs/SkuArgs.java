// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hardwaresecuritymodules.inputs;

import com.pulumi.azurenative.hardwaresecuritymodules.enums.SkuName;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SKU of the dedicated HSM
 * 
 */
public final class SkuArgs extends ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * SKU of the dedicated HSM
     * 
     */
    @Import(name="name")
    private @Nullable Output<Either<String,SkuName>> name;

    /**
     * @return SKU of the dedicated HSM
     * 
     */
    public Optional<Output<Either<String,SkuName>>> name() {
        return Optional.ofNullable(this.name);
    }

    private SkuArgs() {}

    private SkuArgs(SkuArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkuArgs $;

        public Builder() {
            $ = new SkuArgs();
        }

        public Builder(SkuArgs defaults) {
            $ = new SkuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name SKU of the dedicated HSM
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<Either<String,SkuName>> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name SKU of the dedicated HSM
         * 
         * @return builder
         * 
         */
        public Builder name(Either<String,SkuName> name) {
            return name(Output.of(name));
        }

        /**
         * @param name SKU of the dedicated HSM
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Either.ofLeft(name));
        }

        /**
         * @param name SKU of the dedicated HSM
         * 
         * @return builder
         * 
         */
        public Builder name(SkuName name) {
            return name(Either.ofRight(name));
        }

        public SkuArgs build() {
            return $;
        }
    }

}
