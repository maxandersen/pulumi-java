// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NumberGreaterThanAdvancedFilterResponse {
    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    private final @Nullable String key;
    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;NumberGreaterThan&#39;.
     * 
     */
    private final String operatorType;
    /**
     * The filter value.
     * 
     */
    private final @Nullable Double value;

    @CustomType.Constructor
    private NumberGreaterThanAdvancedFilterResponse(
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("operatorType") String operatorType,
        @CustomType.Parameter("value") @Nullable Double value) {
        this.key = key;
        this.operatorType = operatorType;
        this.value = value;
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
     * Expected value is &#39;NumberGreaterThan&#39;.
     * 
    */
    public String operatorType() {
        return this.operatorType;
    }
    /**
     * The filter value.
     * 
    */
    public Optional<Double> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NumberGreaterThanAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private String operatorType;
        private @Nullable Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(NumberGreaterThanAdvancedFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder operatorType(String operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }
        public Builder value(@Nullable Double value) {
            this.value = value;
            return this;
        }        public NumberGreaterThanAdvancedFilterResponse build() {
            return new NumberGreaterThanAdvancedFilterResponse(key, operatorType, value);
        }
    }
}
