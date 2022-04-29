// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class ResourceSkuArgs extends ResourceArgs {

    public static final ResourceSkuArgs Empty = new ResourceSkuArgs();

    /**
     * Name of the SKU.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the SKU.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private ResourceSkuArgs() {}

    private ResourceSkuArgs(ResourceSkuArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceSkuArgs $;

        public Builder() {
            $ = new ResourceSkuArgs();
        }

        public Builder(ResourceSkuArgs defaults) {
            $ = new ResourceSkuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the SKU.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the SKU.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ResourceSkuArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
