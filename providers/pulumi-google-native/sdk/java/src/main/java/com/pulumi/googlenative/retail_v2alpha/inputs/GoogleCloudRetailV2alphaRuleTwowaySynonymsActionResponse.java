// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Creates a set of terms that will be treated as synonyms of each other. Example: synonyms of "sneakers" and "shoes". * "sneakers" will use a synonym of "shoes". * "shoes" will use a synonym of "sneakers".
 * 
 */
public final class GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse Empty = new GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse();

    /**
     * Defines a set of synonyms. Can specify up to 100 synonyms. Must specify at least 2 synonyms.
     * 
     */
    @Import(name="synonyms", required=true)
      private final List<String> synonyms;

    public List<String> synonyms() {
        return this.synonyms;
    }

    public GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse(List<String> synonyms) {
        this.synonyms = Objects.requireNonNull(synonyms, "expected parameter 'synonyms' to be non-null");
    }

    private GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse() {
        this.synonyms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
        }

        public Builder synonyms(List<String> synonyms) {
            this.synonyms = Objects.requireNonNull(synonyms);
            return this;
        }
        public Builder synonyms(String... synonyms) {
            return synonyms(List.of(synonyms));
        }        public GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse build() {
            return new GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse(synonyms);
        }
    }
}
