// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaIntervalArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies how a facet is computed.
 * 
 */
public final class GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs Empty = new GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs();

    /**
     * Only get facet values that contains the given strings. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;contains&#34; to &#34;Shoe&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Men &gt; Shoe&#34;. Only supported on textual fields. Maximum is 10.
     * 
     */
    @Import(name="contains")
      private final @Nullable Output<List<String>> contains;

    public Output<List<String>> contains() {
        return this.contains == null ? Codegen.empty() : this.contains;
    }

    /**
     * Set only if values should be bucketized into intervals. Must be set for facets with numerical values. Must not be set for facet with text values. Maximum number of intervals is 30.
     * 
     */
    @Import(name="intervals")
      private final @Nullable Output<List<GoogleCloudRetailV2alphaIntervalArgs>> intervals;

    public Output<List<GoogleCloudRetailV2alphaIntervalArgs>> intervals() {
        return this.intervals == null ? Codegen.empty() : this.intervals;
    }

    /**
     * Supported textual and numerical facet keys in Product object, over which the facet values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not specified: * textual_field = * &#34;brands&#34; * &#34;categories&#34; * &#34;genders&#34; * &#34;ageGroups&#34; * &#34;availability&#34; * &#34;colorFamilies&#34; * &#34;colors&#34; * &#34;sizes&#34; * &#34;materials&#34; * &#34;patterns&#34; * &#34;conditions&#34; * &#34;attributes.key&#34; * &#34;pickupInStore&#34; * &#34;shipToStore&#34; * &#34;sameDayDelivery&#34; * &#34;nextDayDelivery&#34; * &#34;customFulfillment1&#34; * &#34;customFulfillment2&#34; * &#34;customFulfillment3&#34; * &#34;customFulfillment4&#34; * &#34;customFulfillment5&#34; * &#34;inventory(place_id,attributes.key)&#34; * numerical_field = * &#34;price&#34; * &#34;discount&#34; * &#34;rating&#34; * &#34;ratingCount&#34; * &#34;attributes.key&#34; * &#34;inventory(place_id,price)&#34; * &#34;inventory(place_id,original_price)&#34; * &#34;inventory(place_id,attributes.key)&#34;
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * The order in which Facet.values are returned. Allowed values are: * &#34;count desc&#34;, which means order by Facet.FacetValue.count descending. * &#34;value desc&#34;, which means order by Facet.FacetValue.value descending. Only applies to textual facets. If not set, textual values are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical intervals are sorted in the order given by FacetSpec.FacetKey.intervals; FulfillmentInfo.place_ids are sorted in the order given by FacetSpec.FacetKey.restricted_values.
     * 
     */
    @Import(name="orderBy")
      private final @Nullable Output<String> orderBy;

    public Output<String> orderBy() {
        return this.orderBy == null ? Codegen.empty() : this.orderBy;
    }

    /**
     * Only get facet values that start with the given string prefix. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;prefixes&#34; to &#34;Women&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Women &gt; Dress&#34;. Only supported on textual fields. Maximum is 10.
     * 
     */
    @Import(name="prefixes")
      private final @Nullable Output<List<String>> prefixes;

    public Output<List<String>> prefixes() {
        return this.prefixes == null ? Codegen.empty() : this.prefixes;
    }

    /**
     * The query that is used to compute facet for the given facet key. When provided, it will override the default behavior of facet computation. The query syntax is the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no limitation on FacetKey.key when query is specified. In the response, FacetValue.value will be always &#34;1&#34; and FacetValue.count will be the number of results that matches the query. For example, you can set a customized facet for &#34;shipToStore&#34;, where FacetKey.key is &#34;customizedShipToStore&#34;, and FacetKey.query is &#34;availability: ANY(\&#34;IN_STOCK\&#34;) AND shipToStore: ANY(\&#34;123\&#34;)&#34;. Then the facet will count the products that are both in stock and ship to store &#34;123&#34;.
     * 
     */
    @Import(name="query")
      private final @Nullable Output<String> query;

    public Output<String> query() {
        return this.query == null ? Codegen.empty() : this.query;
    }

    /**
     * Only get facet for the given restricted values. For example, when using &#34;pickupInStore&#34; as key and set restricted values to [&#34;store123&#34;, &#34;store456&#34;], only facets for &#34;store123&#34; and &#34;store456&#34; are returned. Only supported on textual fields and fulfillments. Maximum is 20. Must be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 * customFulfillment4 * customFulfillment5
     * 
     */
    @Import(name="restrictedValues")
      private final @Nullable Output<List<String>> restrictedValues;

    public Output<List<String>> restrictedValues() {
        return this.restrictedValues == null ? Codegen.empty() : this.restrictedValues;
    }

    public GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs(
        @Nullable Output<List<String>> contains,
        @Nullable Output<List<GoogleCloudRetailV2alphaIntervalArgs>> intervals,
        Output<String> key,
        @Nullable Output<String> orderBy,
        @Nullable Output<List<String>> prefixes,
        @Nullable Output<String> query,
        @Nullable Output<List<String>> restrictedValues) {
        this.contains = contains;
        this.intervals = intervals;
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.orderBy = orderBy;
        this.prefixes = prefixes;
        this.query = query;
        this.restrictedValues = restrictedValues;
    }

    private GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs() {
        this.contains = Codegen.empty();
        this.intervals = Codegen.empty();
        this.key = Codegen.empty();
        this.orderBy = Codegen.empty();
        this.prefixes = Codegen.empty();
        this.query = Codegen.empty();
        this.restrictedValues = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> contains;
        private @Nullable Output<List<GoogleCloudRetailV2alphaIntervalArgs>> intervals;
        private Output<String> key;
        private @Nullable Output<String> orderBy;
        private @Nullable Output<List<String>> prefixes;
        private @Nullable Output<String> query;
        private @Nullable Output<List<String>> restrictedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contains = defaults.contains;
    	      this.intervals = defaults.intervals;
    	      this.key = defaults.key;
    	      this.orderBy = defaults.orderBy;
    	      this.prefixes = defaults.prefixes;
    	      this.query = defaults.query;
    	      this.restrictedValues = defaults.restrictedValues;
        }

        public Builder contains(@Nullable Output<List<String>> contains) {
            this.contains = contains;
            return this;
        }
        public Builder contains(@Nullable List<String> contains) {
            this.contains = Codegen.ofNullable(contains);
            return this;
        }
        public Builder contains(String... contains) {
            return contains(List.of(contains));
        }
        public Builder intervals(@Nullable Output<List<GoogleCloudRetailV2alphaIntervalArgs>> intervals) {
            this.intervals = intervals;
            return this;
        }
        public Builder intervals(@Nullable List<GoogleCloudRetailV2alphaIntervalArgs> intervals) {
            this.intervals = Codegen.ofNullable(intervals);
            return this;
        }
        public Builder intervals(GoogleCloudRetailV2alphaIntervalArgs... intervals) {
            return intervals(List.of(intervals));
        }
        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder orderBy(@Nullable Output<String> orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public Builder orderBy(@Nullable String orderBy) {
            this.orderBy = Codegen.ofNullable(orderBy);
            return this;
        }
        public Builder prefixes(@Nullable Output<List<String>> prefixes) {
            this.prefixes = prefixes;
            return this;
        }
        public Builder prefixes(@Nullable List<String> prefixes) {
            this.prefixes = Codegen.ofNullable(prefixes);
            return this;
        }
        public Builder prefixes(String... prefixes) {
            return prefixes(List.of(prefixes));
        }
        public Builder query(@Nullable Output<String> query) {
            this.query = query;
            return this;
        }
        public Builder query(@Nullable String query) {
            this.query = Codegen.ofNullable(query);
            return this;
        }
        public Builder restrictedValues(@Nullable Output<List<String>> restrictedValues) {
            this.restrictedValues = restrictedValues;
            return this;
        }
        public Builder restrictedValues(@Nullable List<String> restrictedValues) {
            this.restrictedValues = Codegen.ofNullable(restrictedValues);
            return this;
        }
        public Builder restrictedValues(String... restrictedValues) {
            return restrictedValues(List.of(restrictedValues));
        }        public GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs build() {
            return new GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs(contains, intervals, key, orderBy, prefixes, query, restrictedValues);
        }
    }
}
