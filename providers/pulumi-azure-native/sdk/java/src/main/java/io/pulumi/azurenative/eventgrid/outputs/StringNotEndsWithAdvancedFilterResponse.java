// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StringNotEndsWithAdvancedFilterResponse {
    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    private final @Nullable String key;
    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'StringNotEndsWith'.
     * 
     */
    private final String operatorType;
    /**
     * The set of filter values.
     * 
     */
    private final @Nullable List<String> values;

    @CustomType.Constructor
    private StringNotEndsWithAdvancedFilterResponse(
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("operatorType") String operatorType,
        @CustomType.Parameter("values") @Nullable List<String> values) {
        this.key = key;
        this.operatorType = operatorType;
        this.values = values;
    }

    /**
     * The field/property in the event based on which you want to filter.
     * 
    */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'StringNotEndsWith'.
     * 
    */
    public String operatorType() {
        return this.operatorType;
    }
    /**
     * The set of filter values.
     * 
    */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
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
