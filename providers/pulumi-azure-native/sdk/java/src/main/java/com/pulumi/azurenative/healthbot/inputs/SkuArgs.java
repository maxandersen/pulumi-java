// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthbot.inputs;

import com.pulumi.azurenative.healthbot.enums.SkuName;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;


/**
 * The resource model definition representing SKU
 * 
 */
public final class SkuArgs extends ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The name of the HealthBot SKU
     * 
     */
    @Import(name="name", required=true)
    private Output<SkuName> name;

    /**
     * @return The name of the HealthBot SKU
     * 
     */
    public Output<SkuName> name() {
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
         * @param name The name of the HealthBot SKU
         * 
         * @return builder
         * 
         */
        public Builder name(Output<SkuName> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the HealthBot SKU
         * 
         * @return builder
         * 
         */
        public Builder name(SkuName name) {
            return name(Output.of(name));
        }

        public SkuArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
