// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recommendationengine_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * FeatureMap represents extra features that customers want to include in the recommendation model for catalogs/user events as categorical/numerical features.
 * 
 */
public final class GoogleCloudRecommendationengineV1beta1FeatureMapArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRecommendationengineV1beta1FeatureMapArgs Empty = new GoogleCloudRecommendationengineV1beta1FeatureMapArgs();

    /**
     * Categorical features that can take on one of a limited number of possible values. Some examples would be the brand/maker of a product, or country of a customer. Feature names and values must be UTF-8 encoded strings. For example: `{ &#34;colors&#34;: {&#34;value&#34;: [&#34;yellow&#34;, &#34;green&#34;]}, &#34;sizes&#34;: {&#34;value&#34;:[&#34;S&#34;, &#34;M&#34;]}`
     * 
     */
    @Import(name="categoricalFeatures")
    private @Nullable Output<Map<String,String>> categoricalFeatures;

    public Optional<Output<Map<String,String>>> categoricalFeatures() {
        return Optional.ofNullable(this.categoricalFeatures);
    }

    /**
     * Numerical features. Some examples would be the height/weight of a product, or age of a customer. Feature names must be UTF-8 encoded strings. For example: `{ &#34;lengths_cm&#34;: {&#34;value&#34;:[2.3, 15.4]}, &#34;heights_cm&#34;: {&#34;value&#34;:[8.1, 6.4]} }`
     * 
     */
    @Import(name="numericalFeatures")
    private @Nullable Output<Map<String,String>> numericalFeatures;

    public Optional<Output<Map<String,String>>> numericalFeatures() {
        return Optional.ofNullable(this.numericalFeatures);
    }

    private GoogleCloudRecommendationengineV1beta1FeatureMapArgs() {}

    private GoogleCloudRecommendationengineV1beta1FeatureMapArgs(GoogleCloudRecommendationengineV1beta1FeatureMapArgs $) {
        this.categoricalFeatures = $.categoricalFeatures;
        this.numericalFeatures = $.numericalFeatures;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRecommendationengineV1beta1FeatureMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRecommendationengineV1beta1FeatureMapArgs $;

        public Builder() {
            $ = new GoogleCloudRecommendationengineV1beta1FeatureMapArgs();
        }

        public Builder(GoogleCloudRecommendationengineV1beta1FeatureMapArgs defaults) {
            $ = new GoogleCloudRecommendationengineV1beta1FeatureMapArgs(Objects.requireNonNull(defaults));
        }

        public Builder categoricalFeatures(@Nullable Output<Map<String,String>> categoricalFeatures) {
            $.categoricalFeatures = categoricalFeatures;
            return this;
        }

        public Builder categoricalFeatures(Map<String,String> categoricalFeatures) {
            return categoricalFeatures(Output.of(categoricalFeatures));
        }

        public Builder numericalFeatures(@Nullable Output<Map<String,String>> numericalFeatures) {
            $.numericalFeatures = numericalFeatures;
            return this;
        }

        public Builder numericalFeatures(Map<String,String> numericalFeatures) {
            return numericalFeatures(Output.of(numericalFeatures));
        }

        public GoogleCloudRecommendationengineV1beta1FeatureMapArgs build() {
            return $;
        }
    }

}
