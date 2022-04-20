// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * StringNotEndsWith Advanced Filter.
 * 
 */
public final class StringNotEndsWithAdvancedFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final StringNotEndsWithAdvancedFilterArgs Empty = new StringNotEndsWithAdvancedFilterArgs();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;StringNotEndsWith&#39;.
     * 
     */
    @Import(name="operatorType", required=true)
      private final Output<String> operatorType;

    public Output<String> operatorType() {
        return this.operatorType;
    }

    /**
     * The set of filter values.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    public StringNotEndsWithAdvancedFilterArgs(
        @Nullable Output<String> key,
        Output<String> operatorType,
        @Nullable Output<List<String>> values) {
        this.key = key;
        this.operatorType = Codegen.stringProp("operatorType").output().arg(operatorType).require();
        this.values = values;
    }

    private StringNotEndsWithAdvancedFilterArgs() {
        this.key = Codegen.empty();
        this.operatorType = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StringNotEndsWithAdvancedFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private Output<String> operatorType;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(StringNotEndsWithAdvancedFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.values = defaults.values;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder operatorType(Output<String> operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }
        public Builder operatorType(String operatorType) {
            this.operatorType = Output.of(Objects.requireNonNull(operatorType));
            return this;
        }
        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = Codegen.ofNullable(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public StringNotEndsWithAdvancedFilterArgs build() {
            return new StringNotEndsWithAdvancedFilterArgs(key, operatorType, values);
        }
    }
}
