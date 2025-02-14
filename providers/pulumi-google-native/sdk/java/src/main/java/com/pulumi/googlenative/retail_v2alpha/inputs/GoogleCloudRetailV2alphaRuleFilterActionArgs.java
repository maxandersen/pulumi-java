// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * * Rule Condition: - No Condition provided is a global match. - 1 or more Condition provided is combined with OR operator. * Action Input: The request query and filter that will be applied to the retrieved products, in addition to any filters already provided with the SearchRequest. The AND operator is used to combine the query&#39;s existing filters with the filter rule(s). NOTE: May result in 0 results when filters conflict. * Action Result: Filters the returned objects to be ONLY those that passed the filter.
 * 
 */
public final class GoogleCloudRetailV2alphaRuleFilterActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaRuleFilterActionArgs Empty = new GoogleCloudRetailV2alphaRuleFilterActionArgs();

    /**
     * A filter to apply on the matching condition results. Supported features: * filter must be set. * Filter syntax is identical to SearchRequest.filter. See more details at the Retail Search [user guide](/retail/search/docs/filter-and-order#filter). * To filter products with product ID &#34;product_1&#34; or &#34;product_2&#34;, and color &#34;Red&#34; or &#34;Blue&#34;: *(id: ANY(&#34;product_1&#34;, &#34;product_2&#34;)) * *AND * *(colorFamilies: ANY(&#34;Red&#34;, &#34;Blue&#34;)) *
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return A filter to apply on the matching condition results. Supported features: * filter must be set. * Filter syntax is identical to SearchRequest.filter. See more details at the Retail Search [user guide](/retail/search/docs/filter-and-order#filter). * To filter products with product ID &#34;product_1&#34; or &#34;product_2&#34;, and color &#34;Red&#34; or &#34;Blue&#34;: *(id: ANY(&#34;product_1&#34;, &#34;product_2&#34;)) * *AND * *(colorFamilies: ANY(&#34;Red&#34;, &#34;Blue&#34;)) *
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    private GoogleCloudRetailV2alphaRuleFilterActionArgs() {}

    private GoogleCloudRetailV2alphaRuleFilterActionArgs(GoogleCloudRetailV2alphaRuleFilterActionArgs $) {
        this.filter = $.filter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2alphaRuleFilterActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2alphaRuleFilterActionArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2alphaRuleFilterActionArgs();
        }

        public Builder(GoogleCloudRetailV2alphaRuleFilterActionArgs defaults) {
            $ = new GoogleCloudRetailV2alphaRuleFilterActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter A filter to apply on the matching condition results. Supported features: * filter must be set. * Filter syntax is identical to SearchRequest.filter. See more details at the Retail Search [user guide](/retail/search/docs/filter-and-order#filter). * To filter products with product ID &#34;product_1&#34; or &#34;product_2&#34;, and color &#34;Red&#34; or &#34;Blue&#34;: *(id: ANY(&#34;product_1&#34;, &#34;product_2&#34;)) * *AND * *(colorFamilies: ANY(&#34;Red&#34;, &#34;Blue&#34;)) *
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter A filter to apply on the matching condition results. Supported features: * filter must be set. * Filter syntax is identical to SearchRequest.filter. See more details at the Retail Search [user guide](/retail/search/docs/filter-and-order#filter). * To filter products with product ID &#34;product_1&#34; or &#34;product_2&#34;, and color &#34;Red&#34; or &#34;Blue&#34;: *(id: ANY(&#34;product_1&#34;, &#34;product_2&#34;)) * *AND * *(colorFamilies: ANY(&#34;Red&#34;, &#34;Blue&#34;)) *
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public GoogleCloudRetailV2alphaRuleFilterActionArgs build() {
            return $;
        }
    }

}
