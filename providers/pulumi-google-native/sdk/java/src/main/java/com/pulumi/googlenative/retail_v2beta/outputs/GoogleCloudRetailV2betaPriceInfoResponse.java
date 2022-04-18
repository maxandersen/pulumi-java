// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaPriceInfoPriceRangeResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2betaPriceInfoResponse {
    /**
     * The costs associated with the sale of a particular product. Used for gross profit reporting. * Profit = price - cost Google Merchant Center property [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
     * 
     */
    private final Double cost;
    /**
     * The 3-letter currency code defined in [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html). If this field is an unrecognizable currency code, an INVALID_ARGUMENT error is returned. The Product.Type.VARIANT Products with the same Product.primary_product_id must share the same currency_code. Otherwise, a FAILED_PRECONDITION error is returned.
     * 
     */
    private final String currencyCode;
    /**
     * Price of the product without any discount. If zero, by default set to be the price.
     * 
     */
    private final Double originalPrice;
    /**
     * Price of the product. Google Merchant Center property [price](https://support.google.com/merchants/answer/6324371). Schema.org property [Offer.price](https://schema.org/price).
     * 
     */
    private final Double price;
    /**
     * The timestamp when the price starts to be effective. This can be set as a future timestamp, and the price is only used for search after price_effective_time. If so, the original_price must be set and original_price is used before price_effective_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
     */
    private final String priceEffectiveTime;
    /**
     * The timestamp when the price stops to be effective. The price is used for search before price_expire_time. If this field is set, the original_price must be set and original_price is used after price_expire_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
     */
    private final String priceExpireTime;
    /**
     * The price range of all the child Product.Type.VARIANT Products grouped together on the Product.Type.PRIMARY Product. Only populated for Product.Type.PRIMARY Products. Note: This field is OUTPUT_ONLY for ProductService.GetProduct. Do not set this field in API requests.
     * 
     */
    private final GoogleCloudRetailV2betaPriceInfoPriceRangeResponse priceRange;

    @CustomType.Constructor
    private GoogleCloudRetailV2betaPriceInfoResponse(
        @CustomType.Parameter("cost") Double cost,
        @CustomType.Parameter("currencyCode") String currencyCode,
        @CustomType.Parameter("originalPrice") Double originalPrice,
        @CustomType.Parameter("price") Double price,
        @CustomType.Parameter("priceEffectiveTime") String priceEffectiveTime,
        @CustomType.Parameter("priceExpireTime") String priceExpireTime,
        @CustomType.Parameter("priceRange") GoogleCloudRetailV2betaPriceInfoPriceRangeResponse priceRange) {
        this.cost = cost;
        this.currencyCode = currencyCode;
        this.originalPrice = originalPrice;
        this.price = price;
        this.priceEffectiveTime = priceEffectiveTime;
        this.priceExpireTime = priceExpireTime;
        this.priceRange = priceRange;
    }

    /**
     * The costs associated with the sale of a particular product. Used for gross profit reporting. * Profit = price - cost Google Merchant Center property [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
     * 
    */
    public Double cost() {
        return this.cost;
    }
    /**
     * The 3-letter currency code defined in [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html). If this field is an unrecognizable currency code, an INVALID_ARGUMENT error is returned. The Product.Type.VARIANT Products with the same Product.primary_product_id must share the same currency_code. Otherwise, a FAILED_PRECONDITION error is returned.
     * 
    */
    public String currencyCode() {
        return this.currencyCode;
    }
    /**
     * Price of the product without any discount. If zero, by default set to be the price.
     * 
    */
    public Double originalPrice() {
        return this.originalPrice;
    }
    /**
     * Price of the product. Google Merchant Center property [price](https://support.google.com/merchants/answer/6324371). Schema.org property [Offer.price](https://schema.org/price).
     * 
    */
    public Double price() {
        return this.price;
    }
    /**
     * The timestamp when the price starts to be effective. This can be set as a future timestamp, and the price is only used for search after price_effective_time. If so, the original_price must be set and original_price is used before price_effective_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
    */
    public String priceEffectiveTime() {
        return this.priceEffectiveTime;
    }
    /**
     * The timestamp when the price stops to be effective. The price is used for search before price_expire_time. If this field is set, the original_price must be set and original_price is used after price_expire_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
    */
    public String priceExpireTime() {
        return this.priceExpireTime;
    }
    /**
     * The price range of all the child Product.Type.VARIANT Products grouped together on the Product.Type.PRIMARY Product. Only populated for Product.Type.PRIMARY Products. Note: This field is OUTPUT_ONLY for ProductService.GetProduct. Do not set this field in API requests.
     * 
    */
    public GoogleCloudRetailV2betaPriceInfoPriceRangeResponse priceRange() {
        return this.priceRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaPriceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cost;
        private String currencyCode;
        private Double originalPrice;
        private Double price;
        private String priceEffectiveTime;
        private String priceExpireTime;
        private GoogleCloudRetailV2betaPriceInfoPriceRangeResponse priceRange;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaPriceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cost = defaults.cost;
    	      this.currencyCode = defaults.currencyCode;
    	      this.originalPrice = defaults.originalPrice;
    	      this.price = defaults.price;
    	      this.priceEffectiveTime = defaults.priceEffectiveTime;
    	      this.priceExpireTime = defaults.priceExpireTime;
    	      this.priceRange = defaults.priceRange;
        }

        public Builder cost(Double cost) {
            this.cost = Objects.requireNonNull(cost);
            return this;
        }
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = Objects.requireNonNull(currencyCode);
            return this;
        }
        public Builder originalPrice(Double originalPrice) {
            this.originalPrice = Objects.requireNonNull(originalPrice);
            return this;
        }
        public Builder price(Double price) {
            this.price = Objects.requireNonNull(price);
            return this;
        }
        public Builder priceEffectiveTime(String priceEffectiveTime) {
            this.priceEffectiveTime = Objects.requireNonNull(priceEffectiveTime);
            return this;
        }
        public Builder priceExpireTime(String priceExpireTime) {
            this.priceExpireTime = Objects.requireNonNull(priceExpireTime);
            return this;
        }
        public Builder priceRange(GoogleCloudRetailV2betaPriceInfoPriceRangeResponse priceRange) {
            this.priceRange = Objects.requireNonNull(priceRange);
            return this;
        }        public GoogleCloudRetailV2betaPriceInfoResponse build() {
            return new GoogleCloudRetailV2betaPriceInfoResponse(cost, currencyCode, originalPrice, price, priceEffectiveTime, priceExpireTime, priceRange);
        }
    }
}
