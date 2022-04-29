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


public final class VendorSkuPreviewArgs extends ResourceArgs {

    public static final VendorSkuPreviewArgs Empty = new VendorSkuPreviewArgs();

    /**
     * Preview subscription ID.
     * 
     */
    @Import(name="previewSubscription")
    private @Nullable Output<String> previewSubscription;

    /**
     * @return Preview subscription ID.
     * 
     */
    public Optional<Output<String>> previewSubscription() {
        return Optional.ofNullable(this.previewSubscription);
    }

    /**
     * The name of the vendor sku.
     * 
     */
    @Import(name="skuName", required=true)
    private Output<String> skuName;

    /**
     * @return The name of the vendor sku.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }

    /**
     * The name of the vendor.
     * 
     */
    @Import(name="vendorName", required=true)
    private Output<String> vendorName;

    /**
     * @return The name of the vendor.
     * 
     */
    public Output<String> vendorName() {
        return this.vendorName;
    }

    private VendorSkuPreviewArgs() {}

    private VendorSkuPreviewArgs(VendorSkuPreviewArgs $) {
        this.previewSubscription = $.previewSubscription;
        this.skuName = $.skuName;
        this.vendorName = $.vendorName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VendorSkuPreviewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VendorSkuPreviewArgs $;

        public Builder() {
            $ = new VendorSkuPreviewArgs();
        }

        public Builder(VendorSkuPreviewArgs defaults) {
            $ = new VendorSkuPreviewArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param previewSubscription Preview subscription ID.
         * 
         * @return builder
         * 
         */
        public Builder previewSubscription(@Nullable Output<String> previewSubscription) {
            $.previewSubscription = previewSubscription;
            return this;
        }

        /**
         * @param previewSubscription Preview subscription ID.
         * 
         * @return builder
         * 
         */
        public Builder previewSubscription(String previewSubscription) {
            return previewSubscription(Output.of(previewSubscription));
        }

        /**
         * @param skuName The name of the vendor sku.
         * 
         * @return builder
         * 
         */
        public Builder skuName(Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The name of the vendor sku.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param vendorName The name of the vendor.
         * 
         * @return builder
         * 
         */
        public Builder vendorName(Output<String> vendorName) {
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

        public VendorSkuPreviewArgs build() {
            $.skuName = Objects.requireNonNull($.skuName, "expected parameter 'skuName' to be non-null");
            $.vendorName = Objects.requireNonNull($.vendorName, "expected parameter 'vendorName' to be non-null");
            return $;
        }
    }

}
