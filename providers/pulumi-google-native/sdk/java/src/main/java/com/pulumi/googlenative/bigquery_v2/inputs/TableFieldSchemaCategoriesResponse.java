// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * [Optional] The categories attached to this field, used for field-level access control.
 * 
 */
public final class TableFieldSchemaCategoriesResponse extends com.pulumi.resources.InvokeArgs {

    public static final TableFieldSchemaCategoriesResponse Empty = new TableFieldSchemaCategoriesResponse();

    /**
     * A list of category resource names. For example, &#34;projects/1/taxonomies/2/categories/3&#34;. At most 5 categories are allowed.
     * 
     */
    @Import(name="names", required=true)
      private final List<String> names;

    public List<String> names() {
        return this.names;
    }

    public TableFieldSchemaCategoriesResponse(List<String> names) {
        this.names = Objects.requireNonNull(names, "expected parameter 'names' to be non-null");
    }

    private TableFieldSchemaCategoriesResponse() {
        this.names = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableFieldSchemaCategoriesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> names;

        public Builder() {
    	      // Empty
        }

        public Builder(TableFieldSchemaCategoriesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.names = defaults.names;
        }

        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }        public TableFieldSchemaCategoriesResponse build() {
            return new TableFieldSchemaCategoriesResponse(names);
        }
    }
}
