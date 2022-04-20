// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Prevents a term in the query from being used in search. Example: Don&#39;t search for &#34;shoddy&#34;.
 * 
 */
public final class GoogleCloudRetailV2betaRuleIgnoreActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2betaRuleIgnoreActionResponse Empty = new GoogleCloudRetailV2betaRuleIgnoreActionResponse();

    /**
     * Terms to ignore in the search query.
     * 
     */
    @Import(name="ignoreTerms", required=true)
      private final List<String> ignoreTerms;

    public List<String> ignoreTerms() {
        return this.ignoreTerms;
    }

    public GoogleCloudRetailV2betaRuleIgnoreActionResponse(List<String> ignoreTerms) {
        this.ignoreTerms = Objects.requireNonNull(ignoreTerms, "expected parameter 'ignoreTerms' to be non-null");
    }

    private GoogleCloudRetailV2betaRuleIgnoreActionResponse() {
        this.ignoreTerms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRuleIgnoreActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> ignoreTerms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRuleIgnoreActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreTerms = defaults.ignoreTerms;
        }

        public Builder ignoreTerms(List<String> ignoreTerms) {
            this.ignoreTerms = Objects.requireNonNull(ignoreTerms);
            return this;
        }
        public Builder ignoreTerms(String... ignoreTerms) {
            return ignoreTerms(List.of(ignoreTerms));
        }        public GoogleCloudRetailV2betaRuleIgnoreActionResponse build() {
            return new GoogleCloudRetailV2betaRuleIgnoreActionResponse(ignoreTerms);
        }
    }
}
