// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.retail_v2.inputs.GoogleCloudRetailV2PriceInfoPriceRangeResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * The price information of a Product.
 * 
 */
public final class GoogleCloudRetailV2PriceInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2PriceInfoResponse Empty = new GoogleCloudRetailV2PriceInfoResponse();

    /**
     * The costs associated with the sale of a particular product. Used for gross profit reporting. * Profit = price - cost Google Merchant Center property [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
     * 
     */
    @Import(name="cost", required=true)
    private Double cost;

    public Double cost() {
        return this.cost;
    }

    /**
     * The 3-letter currency code defined in [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html). If this field is an unrecognizable currency code, an INVALID_ARGUMENT error is returned. The Product.Type.VARIANT Products with the same Product.primary_product_id must share the same currency_code. Otherwise, a FAILED_PRECONDITION error is returned.
     * 
     */
    @Import(name="currencyCode", required=true)
    private String currencyCode;

    public String currencyCode() {
        return this.currencyCode;
    }

    /**
     * Price of the product without any discount. If zero, by default set to be the price.
     * 
     */
    @Import(name="originalPrice", required=true)
    private Double originalPrice;

    public Double originalPrice() {
        return this.originalPrice;
    }

    /**
     * Price of the product. Google Merchant Center property [price](https://support.google.com/merchants/answer/6324371). Schema.org property [Offer.price](https://schema.org/price).
     * 
     */
    @Import(name="price", required=true)
    private Double price;

    public Double price() {
        return this.price;
    }

    /**
     * The timestamp when the price starts to be effective. This can be set as a future timestamp, and the price is only used for search after price_effective_time. If so, the original_price must be set and original_price is used before price_effective_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
     */
    @Import(name="priceEffectiveTime", required=true)
    private String priceEffectiveTime;

    public String priceEffectiveTime() {
        return this.priceEffectiveTime;
    }

    /**
     * The timestamp when the price stops to be effective. The price is used for search before price_expire_time. If this field is set, the original_price must be set and original_price is used after price_expire_time. Do not set if price is always effective because it will cause additional latency during search.
     * 
     */
    @Import(name="priceExpireTime", required=true)
    private String priceExpireTime;

    public String priceExpireTime() {
        return this.priceExpireTime;
    }

    /**
     * The price range of all the child Product.Type.VARIANT Products grouped together on the Product.Type.PRIMARY Product. Only populated for Product.Type.PRIMARY Products. Note: This field is OUTPUT_ONLY for ProductService.GetProduct. Do not set this field in API requests.
     * 
     */
    @Import(name="priceRange", required=true)
    private GoogleCloudRetailV2PriceInfoPriceRangeResponse priceRange;

    public GoogleCloudRetailV2PriceInfoPriceRangeResponse priceRange() {
        return this.priceRange;
    }

    private GoogleCloudRetailV2PriceInfoResponse() {}

    private GoogleCloudRetailV2PriceInfoResponse(GoogleCloudRetailV2PriceInfoResponse $) {
        this.cost = $.cost;
        this.currencyCode = $.currencyCode;
        this.originalPrice = $.originalPrice;
        this.price = $.price;
        this.priceEffectiveTime = $.priceEffectiveTime;
        this.priceExpireTime = $.priceExpireTime;
        this.priceRange = $.priceRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2PriceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2PriceInfoResponse $;

        public Builder() {
            $ = new GoogleCloudRetailV2PriceInfoResponse();
        }

        public Builder(GoogleCloudRetailV2PriceInfoResponse defaults) {
            $ = new GoogleCloudRetailV2PriceInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder cost(Double cost) {
            $.cost = cost;
            return this;
        }

        public Builder currencyCode(String currencyCode) {
            $.currencyCode = currencyCode;
            return this;
        }

        public Builder originalPrice(Double originalPrice) {
            $.originalPrice = originalPrice;
            return this;
        }

        public Builder price(Double price) {
            $.price = price;
            return this;
        }

        public Builder priceEffectiveTime(String priceEffectiveTime) {
            $.priceEffectiveTime = priceEffectiveTime;
            return this;
        }

        public Builder priceExpireTime(String priceExpireTime) {
            $.priceExpireTime = priceExpireTime;
            return this;
        }

        public Builder priceRange(GoogleCloudRetailV2PriceInfoPriceRangeResponse priceRange) {
            $.priceRange = priceRange;
            return this;
        }

        public GoogleCloudRetailV2PriceInfoResponse build() {
            $.cost = Objects.requireNonNull($.cost, "expected parameter 'cost' to be non-null");
            $.currencyCode = Objects.requireNonNull($.currencyCode, "expected parameter 'currencyCode' to be non-null");
            $.originalPrice = Objects.requireNonNull($.originalPrice, "expected parameter 'originalPrice' to be non-null");
            $.price = Objects.requireNonNull($.price, "expected parameter 'price' to be non-null");
            $.priceEffectiveTime = Objects.requireNonNull($.priceEffectiveTime, "expected parameter 'priceEffectiveTime' to be non-null");
            $.priceExpireTime = Objects.requireNonNull($.priceExpireTime, "expected parameter 'priceExpireTime' to be non-null");
            $.priceRange = Objects.requireNonNull($.priceRange, "expected parameter 'priceRange' to be non-null");
            return $;
        }
    }

}
