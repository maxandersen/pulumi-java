// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.QueryParameterTypeResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class QueryParameterTypeStructTypesItemResponse {
    /**
     * [Optional] Human-oriented description of the field.
     * 
     */
    private final String description;
    /**
     * [Optional] The name of this field.
     * 
     */
    private final String name;
    /**
     * [Required] The type of this field.
     * 
     */
    private final QueryParameterTypeResponse type;

    @CustomType.Constructor
    private QueryParameterTypeStructTypesItemResponse(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") QueryParameterTypeResponse type) {
        this.description = description;
        this.name = name;
        this.type = type;
    }

    /**
     * [Optional] Human-oriented description of the field.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * [Optional] The name of this field.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * [Required] The type of this field.
     * 
    */
    public QueryParameterTypeResponse type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryParameterTypeStructTypesItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String name;
        private QueryParameterTypeResponse type;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryParameterTypeStructTypesItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(QueryParameterTypeResponse type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public QueryParameterTypeStructTypesItemResponse build() {
            return new QueryParameterTypeStructTypesItemResponse(description, name, type);
        }
    }
}
