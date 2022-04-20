// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StringNotEndsWith Advanced Filter.
 * 
 */
public final class StringNotEndsWithAdvancedFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final StringNotEndsWithAdvancedFilterResponse Empty = new StringNotEndsWithAdvancedFilterResponse();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
      private final @Nullable String key;

    public Optional<String> key() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;StringNotEndsWith&#39;.
     * 
     */
    @Import(name="operatorType", required=true)
      private final String operatorType;

    public String operatorType() {
        return this.operatorType;
    }

    /**
     * The set of filter values.
     * 
     */
    @Import(name="values")
      private final @Nullable List<String> values;

    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public StringNotEndsWithAdvancedFilterResponse(
        @Nullable String key,
        String operatorType,
        @Nullable List<String> values) {
        this.key = key;
        this.operatorType = Codegen.stringProp("operatorType").arg(operatorType).require();
        this.values = values;
    }

    private StringNotEndsWithAdvancedFilterResponse() {
        this.key = null;
        this.operatorType = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StringNotEndsWithAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private String operatorType;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(StringNotEndsWithAdvancedFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.values = defaults.values;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder operatorType(String operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public StringNotEndsWithAdvancedFilterResponse build() {
            return new StringNotEndsWithAdvancedFilterResponse(key, operatorType, values);
        }
    }
}
