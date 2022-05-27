// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LinuxVirtualMachinePlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxVirtualMachinePlanArgs Empty = new LinuxVirtualMachinePlanArgs();

    /**
     * Specifies the Name of the Marketplace Image this Virtual Machine should be created from. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the Name of the Marketplace Image this Virtual Machine should be created from. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the Product of the Marketplace Image this Virtual Machine should be created from. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="product", required=true)
    private Output<String> product;

    /**
     * @return Specifies the Product of the Marketplace Image this Virtual Machine should be created from. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> product() {
        return this.product;
    }

    /**
     * Specifies the Publisher of the Marketplace Image this Virtual Machine should be created from. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="publisher", required=true)
    private Output<String> publisher;

    /**
     * @return Specifies the Publisher of the Marketplace Image this Virtual Machine should be created from. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> publisher() {
        return this.publisher;
    }

    private LinuxVirtualMachinePlanArgs() {}

    private LinuxVirtualMachinePlanArgs(LinuxVirtualMachinePlanArgs $) {
        this.name = $.name;
        this.product = $.product;
        this.publisher = $.publisher;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxVirtualMachinePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxVirtualMachinePlanArgs $;

        public Builder() {
            $ = new LinuxVirtualMachinePlanArgs();
        }

        public Builder(LinuxVirtualMachinePlanArgs defaults) {
            $ = new LinuxVirtualMachinePlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the Name of the Marketplace Image this Virtual Machine should be created from. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the Name of the Marketplace Image this Virtual Machine should be created from. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param product Specifies the Product of the Marketplace Image this Virtual Machine should be created from. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder product(Output<String> product) {
            $.product = product;
            return this;
        }

        /**
         * @param product Specifies the Product of the Marketplace Image this Virtual Machine should be created from. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder product(String product) {
            return product(Output.of(product));
        }

        /**
         * @param publisher Specifies the Publisher of the Marketplace Image this Virtual Machine should be created from. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publisher(Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher Specifies the Publisher of the Marketplace Image this Virtual Machine should be created from. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        public LinuxVirtualMachinePlanArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.product = Objects.requireNonNull($.product, "expected parameter 'product' to be non-null");
            $.publisher = Objects.requireNonNull($.publisher, "expected parameter 'publisher' to be non-null");
            return $;
        }
    }

}
