// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudsearch_v1.outputs.DateResponse;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ValueResponse {
    private final Boolean booleanValue;
    private final DateResponse dateValue;
    private final Double doubleValue;
    private final String integerValue;
    private final String stringValue;
    private final String timestampValue;

    @CustomType.Constructor
    private ValueResponse(
        @CustomType.Parameter("booleanValue") Boolean booleanValue,
        @CustomType.Parameter("dateValue") DateResponse dateValue,
        @CustomType.Parameter("doubleValue") Double doubleValue,
        @CustomType.Parameter("integerValue") String integerValue,
        @CustomType.Parameter("stringValue") String stringValue,
        @CustomType.Parameter("timestampValue") String timestampValue) {
        this.booleanValue = booleanValue;
        this.dateValue = dateValue;
        this.doubleValue = doubleValue;
        this.integerValue = integerValue;
        this.stringValue = stringValue;
        this.timestampValue = timestampValue;
    }

    public Boolean booleanValue() {
        return this.booleanValue;
    }
    public DateResponse dateValue() {
        return this.dateValue;
    }
    public Double doubleValue() {
        return this.doubleValue;
    }
    public String integerValue() {
        return this.integerValue;
    }
    public String stringValue() {
        return this.stringValue;
    }
    public String timestampValue() {
        return this.timestampValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean booleanValue;
        private DateResponse dateValue;
        private Double doubleValue;
        private String integerValue;
        private String stringValue;
        private String timestampValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanValue = defaults.booleanValue;
    	      this.dateValue = defaults.dateValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.integerValue = defaults.integerValue;
    	      this.stringValue = defaults.stringValue;
    	      this.timestampValue = defaults.timestampValue;
        }

        public Builder booleanValue(Boolean booleanValue) {
            this.booleanValue = Objects.requireNonNull(booleanValue);
            return this;
        }
        public Builder dateValue(DateResponse dateValue) {
            this.dateValue = Objects.requireNonNull(dateValue);
            return this;
        }
        public Builder doubleValue(Double doubleValue) {
            this.doubleValue = Objects.requireNonNull(doubleValue);
            return this;
        }
        public Builder integerValue(String integerValue) {
            this.integerValue = Objects.requireNonNull(integerValue);
            return this;
        }
        public Builder stringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }
        public Builder timestampValue(String timestampValue) {
            this.timestampValue = Objects.requireNonNull(timestampValue);
            return this;
        }        public ValueResponse build() {
            return new ValueResponse(booleanValue, dateValue, doubleValue, integerValue, stringValue, timestampValue);
        }
    }
}
