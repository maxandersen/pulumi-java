// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetImageRecipesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetImageRecipesFilter Empty = new GetImageRecipesFilter();

    /**
     * The name of the filter field. Valid values can be found in the [Image Builder ListImageRecipes API Reference](https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_ListImageRecipes.html).
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
     * 
     */
    @Import(name="values", required=true)
      private final List<String> values;

    public List<String> values() {
        return this.values;
    }

    public GetImageRecipesFilter(
        String name,
        List<String> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private GetImageRecipesFilter() {
        this.name = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageRecipesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageRecipesFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetImageRecipesFilter build() {
            return new GetImageRecipesFilter(name, values);
        }
    }
}
