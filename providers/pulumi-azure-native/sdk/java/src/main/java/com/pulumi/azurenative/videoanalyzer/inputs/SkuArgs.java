// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.azurenative.videoanalyzer.enums.SkuName;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * The SKU details.
 * 
 */
public final class SkuArgs extends ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The SKU name.
     * 
     */
    @Import(name="name", required=true)
    private Output<Either<String,SkuName>> name;

    /**
     * @return The SKU name.
     * 
     */
    public Output<Either<String,SkuName>> name() {
        return this.name;
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
         * @param name The SKU name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<Either<String,SkuName>> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The SKU name.
         * 
         * @return builder
         * 
         */
        public Builder name(Either<String,SkuName> name) {
            return name(Output.of(name));
        }

        /**
         * @param name The SKU name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Either.ofLeft(name));
        }

        /**
         * @param name The SKU name.
         * 
         * @return builder
         * 
         */
        public Builder name(SkuName name) {
            return name(Either.ofRight(name));
        }

        public SkuArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
