// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Prevents a term in the query from being used in search. Example: Don&#39;t search for &#34;shoddy&#34;.
 * 
 */
public final class GoogleCloudRetailV2alphaRuleIgnoreActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaRuleIgnoreActionArgs Empty = new GoogleCloudRetailV2alphaRuleIgnoreActionArgs();

    /**
     * Terms to ignore in the search query.
     * 
     */
    @Import(name="ignoreTerms")
      private final @Nullable Output<List<String>> ignoreTerms;

    public Output<List<String>> ignoreTerms() {
        return this.ignoreTerms == null ? Codegen.empty() : this.ignoreTerms;
    }

    public GoogleCloudRetailV2alphaRuleIgnoreActionArgs(@Nullable Output<List<String>> ignoreTerms) {
        this.ignoreTerms = ignoreTerms;
    }

    private GoogleCloudRetailV2alphaRuleIgnoreActionArgs() {
        this.ignoreTerms = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleIgnoreActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> ignoreTerms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleIgnoreActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreTerms = defaults.ignoreTerms;
        }

        public Builder ignoreTerms(@Nullable Output<List<String>> ignoreTerms) {
            this.ignoreTerms = ignoreTerms;
            return this;
        }
        public Builder ignoreTerms(@Nullable List<String> ignoreTerms) {
            this.ignoreTerms = Codegen.ofNullable(ignoreTerms);
            return this;
        }
        public Builder ignoreTerms(String... ignoreTerms) {
            return ignoreTerms(List.of(ignoreTerms));
        }        public GoogleCloudRetailV2alphaRuleIgnoreActionArgs build() {
            return new GoogleCloudRetailV2alphaRuleIgnoreActionArgs(ignoreTerms);
        }
    }
}
