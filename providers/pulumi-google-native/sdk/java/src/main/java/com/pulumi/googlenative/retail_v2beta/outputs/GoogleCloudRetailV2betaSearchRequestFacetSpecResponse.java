// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2betaSearchRequestFacetSpecResponse {
    /**
     * Enables dynamic position for this facet. If set to true, the position of this facet among all facets in the response is determined by Google Retail Search. It will be ordered together with dynamic facets if dynamic facets is enabled. If set to false, the position of this facet in the response will be the same as in the request, and it will be ranked before the facets with dynamic position enable and all dynamic facets. For example, you may always want to have rating facet returned in the response, but it&#39;s not necessarily to always display the rating facet at the top. In that case, you can set enable_dynamic_position to true so that the position of rating facet in response will be determined by Google Retail Search. Another example, assuming you have the following facets in the request: * &#34;rating&#34;, enable_dynamic_position = true * &#34;price&#34;, enable_dynamic_position = false * &#34;brands&#34;, enable_dynamic_position = false And also you have a dynamic facets enable, which will generate a facet &#39;gender&#39;. Then the final order of the facets in the response can be (&#34;price&#34;, &#34;brands&#34;, &#34;rating&#34;, &#34;gender&#34;) or (&#34;price&#34;, &#34;brands&#34;, &#34;gender&#34;, &#34;rating&#34;) depends on how Google Retail Search orders &#34;gender&#34; and &#34;rating&#34; facets. However, notice that &#34;price&#34; and &#34;brands&#34; will always be ranked at 1st and 2nd position since their enable_dynamic_position are false.
     * 
     */
    private final Boolean enableDynamicPosition;
    /**
     * List of keys to exclude when faceting. By default, FacetKey.key is not excluded from the filter unless it is listed in this field. For example, suppose there are 100 products with color facet &#34;Red&#34; and 200 products with color facet &#34;Blue&#34;. A query containing the filter &#34;colorFamilies:ANY(&#34;Red&#34;)&#34; and have &#34;colorFamilies&#34; as FacetKey.key will by default return the &#34;Red&#34; with count 100. If this field contains &#34;colorFamilies&#34;, then the query returns both the &#34;Red&#34; with count 100 and &#34;Blue&#34; with count 200, because the &#34;colorFamilies&#34; key is now excluded from the filter. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    private final List<String> excludedFilterKeys;
    /**
     * The facet key specification.
     * 
     */
    private final GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyResponse facetKey;
    /**
     * Maximum of facet values that should be returned for this facet. If unspecified, defaults to 20. The maximum allowed value is 300. Values above 300 will be coerced to 300. If this field is negative, an INVALID_ARGUMENT is returned.
     * 
     */
    private final Integer limit;

    @CustomType.Constructor
    private GoogleCloudRetailV2betaSearchRequestFacetSpecResponse(
        @CustomType.Parameter("enableDynamicPosition") Boolean enableDynamicPosition,
        @CustomType.Parameter("excludedFilterKeys") List<String> excludedFilterKeys,
        @CustomType.Parameter("facetKey") GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyResponse facetKey,
        @CustomType.Parameter("limit") Integer limit) {
        this.enableDynamicPosition = enableDynamicPosition;
        this.excludedFilterKeys = excludedFilterKeys;
        this.facetKey = facetKey;
        this.limit = limit;
    }

    /**
     * Enables dynamic position for this facet. If set to true, the position of this facet among all facets in the response is determined by Google Retail Search. It will be ordered together with dynamic facets if dynamic facets is enabled. If set to false, the position of this facet in the response will be the same as in the request, and it will be ranked before the facets with dynamic position enable and all dynamic facets. For example, you may always want to have rating facet returned in the response, but it&#39;s not necessarily to always display the rating facet at the top. In that case, you can set enable_dynamic_position to true so that the position of rating facet in response will be determined by Google Retail Search. Another example, assuming you have the following facets in the request: * &#34;rating&#34;, enable_dynamic_position = true * &#34;price&#34;, enable_dynamic_position = false * &#34;brands&#34;, enable_dynamic_position = false And also you have a dynamic facets enable, which will generate a facet &#39;gender&#39;. Then the final order of the facets in the response can be (&#34;price&#34;, &#34;brands&#34;, &#34;rating&#34;, &#34;gender&#34;) or (&#34;price&#34;, &#34;brands&#34;, &#34;gender&#34;, &#34;rating&#34;) depends on how Google Retail Search orders &#34;gender&#34; and &#34;rating&#34; facets. However, notice that &#34;price&#34; and &#34;brands&#34; will always be ranked at 1st and 2nd position since their enable_dynamic_position are false.
     * 
    */
    public Boolean enableDynamicPosition() {
        return this.enableDynamicPosition;
    }
    /**
     * List of keys to exclude when faceting. By default, FacetKey.key is not excluded from the filter unless it is listed in this field. For example, suppose there are 100 products with color facet &#34;Red&#34; and 200 products with color facet &#34;Blue&#34;. A query containing the filter &#34;colorFamilies:ANY(&#34;Red&#34;)&#34; and have &#34;colorFamilies&#34; as FacetKey.key will by default return the &#34;Red&#34; with count 100. If this field contains &#34;colorFamilies&#34;, then the query returns both the &#34;Red&#34; with count 100 and &#34;Blue&#34; with count 200, because the &#34;colorFamilies&#34; key is now excluded from the filter. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
    */
    public List<String> excludedFilterKeys() {
        return this.excludedFilterKeys;
    }
    /**
     * The facet key specification.
     * 
    */
    public GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyResponse facetKey() {
        return this.facetKey;
    }
    /**
     * Maximum of facet values that should be returned for this facet. If unspecified, defaults to 20. The maximum allowed value is 300. Values above 300 will be coerced to 300. If this field is negative, an INVALID_ARGUMENT is returned.
     * 
    */
    public Integer limit() {
        return this.limit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaSearchRequestFacetSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableDynamicPosition;
        private List<String> excludedFilterKeys;
        private GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyResponse facetKey;
        private Integer limit;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaSearchRequestFacetSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDynamicPosition = defaults.enableDynamicPosition;
    	      this.excludedFilterKeys = defaults.excludedFilterKeys;
    	      this.facetKey = defaults.facetKey;
    	      this.limit = defaults.limit;
        }

        public Builder enableDynamicPosition(Boolean enableDynamicPosition) {
            this.enableDynamicPosition = Objects.requireNonNull(enableDynamicPosition);
            return this;
        }
        public Builder excludedFilterKeys(List<String> excludedFilterKeys) {
            this.excludedFilterKeys = Objects.requireNonNull(excludedFilterKeys);
            return this;
        }
        public Builder excludedFilterKeys(String... excludedFilterKeys) {
            return excludedFilterKeys(List.of(excludedFilterKeys));
        }
        public Builder facetKey(GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyResponse facetKey) {
            this.facetKey = Objects.requireNonNull(facetKey);
            return this;
        }
        public Builder limit(Integer limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }        public GoogleCloudRetailV2betaSearchRequestFacetSpecResponse build() {
            return new GoogleCloudRetailV2betaSearchRequestFacetSpecResponse(enableDynamicPosition, excludedFilterKeys, facetKey, limit);
        }
    }
}
