// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VendorArgs extends ResourceArgs {

    public static final VendorArgs Empty = new VendorArgs();

    /**
     * The name of the vendor.
     * 
     */
    @Import(name="vendorName")
    private @Nullable Output<String> vendorName;

    /**
     * @return The name of the vendor.
     * 
     */
    public Optional<Output<String>> vendorName() {
        return Optional.ofNullable(this.vendorName);
    }

    private VendorArgs() {}

    private VendorArgs(VendorArgs $) {
        this.vendorName = $.vendorName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VendorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VendorArgs $;

        public Builder() {
            $ = new VendorArgs();
        }

        public Builder(VendorArgs defaults) {
            $ = new VendorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param vendorName The name of the vendor.
         * 
         * @return builder
         * 
         */
        public Builder vendorName(@Nullable Output<String> vendorName) {
            $.vendorName = vendorName;
            return this;
        }

        /**
         * @param vendorName The name of the vendor.
         * 
         * @return builder
         * 
         */
        public Builder vendorName(String vendorName) {
            return vendorName(Output.of(vendorName));
        }

        public VendorArgs build() {
            return $;
        }
    }

}
