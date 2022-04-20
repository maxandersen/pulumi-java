// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [Optional] The categories attached to this field, used for field-level access control.
 * 
 */
public final class TableFieldSchemaCategoriesArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableFieldSchemaCategoriesArgs Empty = new TableFieldSchemaCategoriesArgs();

    /**
     * A list of category resource names. For example, &#34;projects/1/taxonomies/2/categories/3&#34;. At most 5 categories are allowed.
     * 
     */
    @Import(name="names")
      private final @Nullable Output<List<String>> names;

    public Output<List<String>> names() {
        return this.names == null ? Codegen.empty() : this.names;
    }

    public TableFieldSchemaCategoriesArgs(@Nullable Output<List<String>> names) {
        this.names = names;
    }

    private TableFieldSchemaCategoriesArgs() {
        this.names = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableFieldSchemaCategoriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> names;

        public Builder() {
    	      // Empty
        }

        public Builder(TableFieldSchemaCategoriesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.names = defaults.names;
        }

        public Builder names(@Nullable Output<List<String>> names) {
            this.names = names;
            return this;
        }
        public Builder names(@Nullable List<String> names) {
            this.names = Codegen.ofNullable(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }        public TableFieldSchemaCategoriesArgs build() {
            return new TableFieldSchemaCategoriesArgs(names);
        }
    }
}
