// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recommendationengine_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Exact product price.
 * 
 */
public final class GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs Empty = new GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs();

    /**
     * Optional. Display price of the product.
     * 
     */
    @Import(name="displayPrice")
    private @Nullable Output<Double> displayPrice;

    public Optional<Output<Double>> displayPrice() {
        return Optional.ofNullable(this.displayPrice);
    }

    /**
     * Optional. Price of the product without any discount. If zero, by default set to be the &#39;displayPrice&#39;.
     * 
     */
    @Import(name="originalPrice")
    private @Nullable Output<Double> originalPrice;

    public Optional<Output<Double>> originalPrice() {
        return Optional.ofNullable(this.originalPrice);
    }

    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs() {}

    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs(GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs $) {
        this.displayPrice = $.displayPrice;
        this.originalPrice = $.originalPrice;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs $;

        public Builder() {
            $ = new GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs();
        }

        public Builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs defaults) {
            $ = new GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs(Objects.requireNonNull(defaults));
        }

        public Builder displayPrice(@Nullable Output<Double> displayPrice) {
            $.displayPrice = displayPrice;
            return this;
        }

        public Builder displayPrice(Double displayPrice) {
            return displayPrice(Output.of(displayPrice));
        }

        public Builder originalPrice(@Nullable Output<Double> originalPrice) {
            $.originalPrice = originalPrice;
            return this;
        }

        public Builder originalPrice(Double originalPrice) {
            return originalPrice(Output.of(originalPrice));
        }

        public GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceArgs build() {
            return $;
        }
    }

}
