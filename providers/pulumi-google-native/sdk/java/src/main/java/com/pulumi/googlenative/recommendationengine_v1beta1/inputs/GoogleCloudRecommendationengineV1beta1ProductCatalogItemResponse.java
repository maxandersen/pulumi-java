// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recommendationengine_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.recommendationengine_v1beta1.inputs.GoogleCloudRecommendationengineV1beta1ImageResponse;
import com.pulumi.googlenative.recommendationengine_v1beta1.inputs.GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse;
import com.pulumi.googlenative.recommendationengine_v1beta1.inputs.GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * ProductCatalogItem captures item metadata specific to retail products.
 * 
 */
public final class GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse Empty = new GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse();

    /**
     * Optional. The available quantity of the item.
     * 
     */
    @Import(name="availableQuantity", required=true)
    private String availableQuantity;

    public String availableQuantity() {
        return this.availableQuantity;
    }

    /**
     * Optional. Canonical URL directly linking to the item detail page with a length limit of 5 KiB..
     * 
     */
    @Import(name="canonicalProductUri", required=true)
    private String canonicalProductUri;

    public String canonicalProductUri() {
        return this.canonicalProductUri;
    }

    /**
     * Optional. A map to pass the costs associated with the product. For example: {&#34;manufacturing&#34;: 45.5} The profit of selling this item is computed like so: * If &#39;exactPrice&#39; is provided, profit = displayPrice - sum(costs) * If &#39;priceRange&#39; is provided, profit = minPrice - sum(costs)
     * 
     */
    @Import(name="costs", required=true)
    private Map<String,String> costs;

    public Map<String,String> costs() {
        return this.costs;
    }

    /**
     * Optional. Only required if the price is set. Currency code for price/costs. Use three-character ISO-4217 code.
     * 
     */
    @Import(name="currencyCode", required=true)
    private String currencyCode;

    public String currencyCode() {
        return this.currencyCode;
    }

    /**
     * Optional. The exact product price.
     * 
     */
    @Import(name="exactPrice", required=true)
    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse exactPrice;

    public GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse exactPrice() {
        return this.exactPrice;
    }

    /**
     * Optional. Product images for the catalog item.
     * 
     */
    @Import(name="images", required=true)
    private List<GoogleCloudRecommendationengineV1beta1ImageResponse> images;

    public List<GoogleCloudRecommendationengineV1beta1ImageResponse> images() {
        return this.images;
    }

    /**
     * Optional. The product price range.
     * 
     */
    @Import(name="priceRange", required=true)
    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse priceRange;

    public GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse priceRange() {
        return this.priceRange;
    }

    /**
     * Optional. Online stock state of the catalog item. Default is `IN_STOCK`.
     * 
     */
    @Import(name="stockState", required=true)
    private String stockState;

    public String stockState() {
        return this.stockState;
    }

    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse() {}

    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse(GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse $) {
        this.availableQuantity = $.availableQuantity;
        this.canonicalProductUri = $.canonicalProductUri;
        this.costs = $.costs;
        this.currencyCode = $.currencyCode;
        this.exactPrice = $.exactPrice;
        this.images = $.images;
        this.priceRange = $.priceRange;
        this.stockState = $.stockState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse $;

        public Builder() {
            $ = new GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse();
        }

        public Builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse defaults) {
            $ = new GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse(Objects.requireNonNull(defaults));
        }

        public Builder availableQuantity(String availableQuantity) {
            $.availableQuantity = availableQuantity;
            return this;
        }

        public Builder canonicalProductUri(String canonicalProductUri) {
            $.canonicalProductUri = canonicalProductUri;
            return this;
        }

        public Builder costs(Map<String,String> costs) {
            $.costs = costs;
            return this;
        }

        public Builder currencyCode(String currencyCode) {
            $.currencyCode = currencyCode;
            return this;
        }

        public Builder exactPrice(GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceResponse exactPrice) {
            $.exactPrice = exactPrice;
            return this;
        }

        public Builder images(List<GoogleCloudRecommendationengineV1beta1ImageResponse> images) {
            $.images = images;
            return this;
        }

        public Builder images(GoogleCloudRecommendationengineV1beta1ImageResponse... images) {
            return images(List.of(images));
        }

        public Builder priceRange(GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse priceRange) {
            $.priceRange = priceRange;
            return this;
        }

        public Builder stockState(String stockState) {
            $.stockState = stockState;
            return this;
        }

        public GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse build() {
            $.availableQuantity = Objects.requireNonNull($.availableQuantity, "expected parameter 'availableQuantity' to be non-null");
            $.canonicalProductUri = Objects.requireNonNull($.canonicalProductUri, "expected parameter 'canonicalProductUri' to be non-null");
            $.costs = Objects.requireNonNull($.costs, "expected parameter 'costs' to be non-null");
            $.currencyCode = Objects.requireNonNull($.currencyCode, "expected parameter 'currencyCode' to be non-null");
            $.exactPrice = Objects.requireNonNull($.exactPrice, "expected parameter 'exactPrice' to be non-null");
            $.images = Objects.requireNonNull($.images, "expected parameter 'images' to be non-null");
            $.priceRange = Objects.requireNonNull($.priceRange, "expected parameter 'priceRange' to be non-null");
            $.stockState = Objects.requireNonNull($.stockState, "expected parameter 'stockState' to be non-null");
            return $;
        }
    }

}
