// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TableFieldSchemaPolicyTagsResponse {
    /**
     * A list of category resource names. For example, &#34;projects/1/location/eu/taxonomies/2/policyTags/3&#34;. At most 1 policy tag is allowed.
     * 
     */
    private final List<String> names;

    @CustomType.Constructor
    private TableFieldSchemaPolicyTagsResponse(@CustomType.Parameter("names") List<String> names) {
        this.names = names;
    }

    /**
     * A list of category resource names. For example, &#34;projects/1/location/eu/taxonomies/2/policyTags/3&#34;. At most 1 policy tag is allowed.
     * 
    */
    public List<String> names() {
        return this.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableFieldSchemaPolicyTagsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> names;

        public Builder() {
    	      // Empty
        }

        public Builder(TableFieldSchemaPolicyTagsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.names = defaults.names;
        }

        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }        public TableFieldSchemaPolicyTagsResponse build() {
            return new TableFieldSchemaPolicyTagsResponse(names);
        }
    }
}
