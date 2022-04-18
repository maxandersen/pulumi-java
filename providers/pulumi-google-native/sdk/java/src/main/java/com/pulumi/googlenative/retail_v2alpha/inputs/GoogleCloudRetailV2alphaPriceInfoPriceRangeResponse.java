// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaIntervalResponse;
import java.util.Objects;


/**
 * The price range of all variant Product having the same Product.primary_product_id.
 * 
 */
public final class GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse Empty = new GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse();

    /**
     * The inclusive Product.pricing_info.original_price internal of all variant Product having the same Product.primary_product_id.
     * 
     */
    @Import(name="originalPrice", required=true)
      private final GoogleCloudRetailV2alphaIntervalResponse originalPrice;

    public GoogleCloudRetailV2alphaIntervalResponse originalPrice() {
        return this.originalPrice;
    }

    /**
     * The inclusive Product.pricing_info.price interval of all variant Product having the same Product.primary_product_id.
     * 
     */
    @Import(name="price", required=true)
      private final GoogleCloudRetailV2alphaIntervalResponse price;

    public GoogleCloudRetailV2alphaIntervalResponse price() {
        return this.price;
    }

    public GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse(
        GoogleCloudRetailV2alphaIntervalResponse originalPrice,
        GoogleCloudRetailV2alphaIntervalResponse price) {
        this.originalPrice = Objects.requireNonNull(originalPrice, "expected parameter 'originalPrice' to be non-null");
        this.price = Objects.requireNonNull(price, "expected parameter 'price' to be non-null");
    }

    private GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse() {
        this.originalPrice = null;
        this.price = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2alphaIntervalResponse originalPrice;
        private GoogleCloudRetailV2alphaIntervalResponse price;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originalPrice = defaults.originalPrice;
    	      this.price = defaults.price;
        }

        public Builder originalPrice(GoogleCloudRetailV2alphaIntervalResponse originalPrice) {
            this.originalPrice = Objects.requireNonNull(originalPrice);
            return this;
        }
        public Builder price(GoogleCloudRetailV2alphaIntervalResponse price) {
            this.price = Objects.requireNonNull(price);
            return this;
        }        public GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse build() {
            return new GoogleCloudRetailV2alphaPriceInfoPriceRangeResponse(originalPrice, price);
        }
    }
}
