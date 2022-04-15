// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * * Rule Condition: - No Condition provided is a global match. - 1 or more Condition provided is combined with OR operator. * Action Input: The request query and filter that will be applied to the retrieved products, in addition to any filters already provided with the SearchRequest. The AND operator is used to combine the query's existing filters with the filter rule(s). NOTE: May result in 0 results when filters conflict. * Action Result: Filters the returned objects to be ONLY those that passed the filter.
 * 
 */
public final class GoogleCloudRetailV2alphaRuleFilterActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaRuleFilterActionArgs Empty = new GoogleCloudRetailV2alphaRuleFilterActionArgs();

    /**
     * A filter to apply on the matching condition results. Supported features: * filter must be set. * Filter syntax is identical to SearchRequest.filter. See more details at the Retail Search [user guide](/retail/search/docs/filter-and-order#filter). * To filter products with product ID "product_1" or "product_2", and color "Red" or "Blue": *(id: ANY("product_1", "product_2")) * *AND * *(colorFamilies: ANY("Red", "Blue")) *
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> filter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    public GoogleCloudRetailV2alphaRuleFilterActionArgs(@Nullable Output<String> filter) {
        this.filter = filter;
    }

    private GoogleCloudRetailV2alphaRuleFilterActionArgs() {
        this.filter = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleFilterActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> filter;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleFilterActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
        }

        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }        public GoogleCloudRetailV2alphaRuleFilterActionArgs build() {
            return new GoogleCloudRetailV2alphaRuleFilterActionArgs(filter);
        }
    }
}
