// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * A boost action to apply to results matching condition specified above.
 * 
 */
public final class GoogleCloudRetailV2alphaRuleBoostActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaRuleBoostActionResponse Empty = new GoogleCloudRetailV2alphaRuleBoostActionResponse();

    /**
     * Strength of the condition boost, which must be in [-1, 1]. Negative boost means demotion. Default is 0.0. Setting to 1.0 gives the item a big promotion. However, it does not necessarily mean that the boosted item will be the top result at all times, nor that other items will be excluded. Results could still be shown even when none of them matches the condition. And results that are significantly more relevant to the search query can still trump your heavily favored but irrelevant items. Setting to -1.0 gives the item a big demotion. However, results that are deeply relevant might still be shown. The item will have an upstream battle to get a fairly high ranking, but it is not blocked out completely. Setting to 0.0 means no boost applied. The boosting condition is ignored.
     * 
     */
    @Import(name="boost", required=true)
    private Double boost;

    public Double boost() {
        return this.boost;
    }

    /**
     * The filter can have a max size of 5000 characters. An expression which specifies which products to apply an action to. The syntax and supported fields are the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Examples: * To boost products with product ID &#34;product_1&#34; or &#34;product_2&#34;, and color &#34;Red&#34; or &#34;Blue&#34;: *(id: ANY(&#34;product_1&#34;, &#34;product_2&#34;)) * *AND * *(colorFamilies: ANY(&#34;Red&#34;, &#34;Blue&#34;)) *
     * 
     */
    @Import(name="productsFilter", required=true)
    private String productsFilter;

    public String productsFilter() {
        return this.productsFilter;
    }

    private GoogleCloudRetailV2alphaRuleBoostActionResponse() {}

    private GoogleCloudRetailV2alphaRuleBoostActionResponse(GoogleCloudRetailV2alphaRuleBoostActionResponse $) {
        this.boost = $.boost;
        this.productsFilter = $.productsFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2alphaRuleBoostActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2alphaRuleBoostActionResponse $;

        public Builder() {
            $ = new GoogleCloudRetailV2alphaRuleBoostActionResponse();
        }

        public Builder(GoogleCloudRetailV2alphaRuleBoostActionResponse defaults) {
            $ = new GoogleCloudRetailV2alphaRuleBoostActionResponse(Objects.requireNonNull(defaults));
        }

        public Builder boost(Double boost) {
            $.boost = boost;
            return this;
        }

        public Builder productsFilter(String productsFilter) {
            $.productsFilter = productsFilter;
            return this;
        }

        public GoogleCloudRetailV2alphaRuleBoostActionResponse build() {
            $.boost = Objects.requireNonNull($.boost, "expected parameter 'boost' to be non-null");
            $.productsFilter = Objects.requireNonNull($.productsFilter, "expected parameter 'productsFilter' to be non-null");
            return $;
        }
    }

}
