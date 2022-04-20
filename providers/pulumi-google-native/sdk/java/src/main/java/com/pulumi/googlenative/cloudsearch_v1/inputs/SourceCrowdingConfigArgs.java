// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Set search results crowding limits. Crowding is a situation in which multiple results from the same source or host &#34;crowd out&#34; other results, diminishing the quality of search for users. To foster better search quality and source diversity in search results, you can set a condition to reduce repetitive results by source.
 * 
 */
public final class SourceCrowdingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceCrowdingConfigArgs Empty = new SourceCrowdingConfigArgs();

    /**
     * Maximum number of results allowed from a datasource in a result page as long as results from other sources are not exhausted. Value specified must not be negative. A default value is used if this value is equal to 0. To disable crowding, set the value greater than 100.
     * 
     */
    @Import(name="numResults")
      private final @Nullable Output<Integer> numResults;

    public Output<Integer> numResults() {
        return this.numResults == null ? Codegen.empty() : this.numResults;
    }

    /**
     * Maximum number of suggestions allowed from a source. No limits will be set on results if this value is less than or equal to 0.
     * 
     */
    @Import(name="numSuggestions")
      private final @Nullable Output<Integer> numSuggestions;

    public Output<Integer> numSuggestions() {
        return this.numSuggestions == null ? Codegen.empty() : this.numSuggestions;
    }

    public SourceCrowdingConfigArgs(
        @Nullable Output<Integer> numResults,
        @Nullable Output<Integer> numSuggestions) {
        this.numResults = numResults;
        this.numSuggestions = numSuggestions;
    }

    private SourceCrowdingConfigArgs() {
        this.numResults = Codegen.empty();
        this.numSuggestions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceCrowdingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> numResults;
        private @Nullable Output<Integer> numSuggestions;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceCrowdingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numResults = defaults.numResults;
    	      this.numSuggestions = defaults.numSuggestions;
        }

        public Builder numResults(@Nullable Output<Integer> numResults) {
            this.numResults = numResults;
            return this;
        }
        public Builder numResults(@Nullable Integer numResults) {
            this.numResults = Codegen.ofNullable(numResults);
            return this;
        }
        public Builder numSuggestions(@Nullable Output<Integer> numSuggestions) {
            this.numSuggestions = numSuggestions;
            return this;
        }
        public Builder numSuggestions(@Nullable Integer numSuggestions) {
            this.numSuggestions = Codegen.ofNullable(numSuggestions);
            return this;
        }        public SourceCrowdingConfigArgs build() {
            return new SourceCrowdingConfigArgs(numResults, numSuggestions);
        }
    }
}
