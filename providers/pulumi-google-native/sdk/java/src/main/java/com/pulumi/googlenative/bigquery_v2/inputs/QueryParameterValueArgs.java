// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueryParameterValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueryParameterValueArgs Empty = new QueryParameterValueArgs();

    /**
     * [Optional] The array values, if this is an array type.
     * 
     */
    @Import(name="arrayValues")
      private final @Nullable Output<List<QueryParameterValueArgs>> arrayValues;

    public Output<List<QueryParameterValueArgs>> arrayValues() {
        return this.arrayValues == null ? Codegen.empty() : this.arrayValues;
    }

    /**
     * [Optional] The struct field values, in order of the struct type&#39;s declaration.
     * 
     */
    @Import(name="structValues")
      private final @Nullable Output<Map<String,String>> structValues;

    public Output<Map<String,String>> structValues() {
        return this.structValues == null ? Codegen.empty() : this.structValues;
    }

    /**
     * [Optional] The value of this value, if a simple scalar type.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public QueryParameterValueArgs(
        @Nullable Output<List<QueryParameterValueArgs>> arrayValues,
        @Nullable Output<Map<String,String>> structValues,
        @Nullable Output<String> value) {
        this.arrayValues = arrayValues;
        this.structValues = structValues;
        this.value = value;
    }

    private QueryParameterValueArgs() {
        this.arrayValues = Codegen.empty();
        this.structValues = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryParameterValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<QueryParameterValueArgs>> arrayValues;
        private @Nullable Output<Map<String,String>> structValues;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryParameterValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arrayValues = defaults.arrayValues;
    	      this.structValues = defaults.structValues;
    	      this.value = defaults.value;
        }

        public Builder arrayValues(@Nullable Output<List<QueryParameterValueArgs>> arrayValues) {
            this.arrayValues = arrayValues;
            return this;
        }
        public Builder arrayValues(@Nullable List<QueryParameterValueArgs> arrayValues) {
            this.arrayValues = Codegen.ofNullable(arrayValues);
            return this;
        }
        public Builder arrayValues(QueryParameterValueArgs... arrayValues) {
            return arrayValues(List.of(arrayValues));
        }
        public Builder structValues(@Nullable Output<Map<String,String>> structValues) {
            this.structValues = structValues;
            return this;
        }
        public Builder structValues(@Nullable Map<String,String> structValues) {
            this.structValues = Codegen.ofNullable(structValues);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public QueryParameterValueArgs build() {
            return new QueryParameterValueArgs(arrayValues, structValues, value);
        }
    }
}
