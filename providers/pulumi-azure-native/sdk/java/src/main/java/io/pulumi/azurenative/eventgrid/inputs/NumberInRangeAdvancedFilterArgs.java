// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NumberInRange Advanced Filter.
 * 
 */
public final class NumberInRangeAdvancedFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final NumberInRangeAdvancedFilterArgs Empty = new NumberInRangeAdvancedFilterArgs();

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
     * Expected value is 'NumberInRange'.
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
      private final @Nullable Output<List<List<Double>>> values;

    public Output<List<List<Double>>> values() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    public NumberInRangeAdvancedFilterArgs(
        @Nullable Output<String> key,
        Output<String> operatorType,
        @Nullable Output<List<List<Double>>> values) {
        this.key = key;
        this.operatorType = Objects.requireNonNull(operatorType, "expected parameter 'operatorType' to be non-null");
        this.values = values;
    }

    private NumberInRangeAdvancedFilterArgs() {
        this.key = Codegen.empty();
        this.operatorType = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NumberInRangeAdvancedFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private Output<String> operatorType;
        private @Nullable Output<List<List<Double>>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(NumberInRangeAdvancedFilterArgs defaults) {
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
        public Builder values(@Nullable Output<List<List<Double>>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable List<List<Double>> values) {
            this.values = Codegen.ofNullable(values);
            return this;
        }        public NumberInRangeAdvancedFilterArgs build() {
            return new NumberInRangeAdvancedFilterArgs(key, operatorType, values);
        }
    }
}
