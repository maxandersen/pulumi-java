// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudChannelV1ValueResponse {
    /**
     * Represents a boolean value.
     * 
     */
    private final Boolean boolValue;
    /**
     * Represents a double value.
     * 
     */
    private final Double doubleValue;
    /**
     * Represents an int64 value.
     * 
     */
    private final String int64Value;
    /**
     * Represents an 'Any' proto value.
     * 
     */
    private final Map<String,String> protoValue;
    /**
     * Represents a string value.
     * 
     */
    private final String stringValue;

    @CustomType.Constructor
    private GoogleCloudChannelV1ValueResponse(
        @CustomType.Parameter("boolValue") Boolean boolValue,
        @CustomType.Parameter("doubleValue") Double doubleValue,
        @CustomType.Parameter("int64Value") String int64Value,
        @CustomType.Parameter("protoValue") Map<String,String> protoValue,
        @CustomType.Parameter("stringValue") String stringValue) {
        this.boolValue = boolValue;
        this.doubleValue = doubleValue;
        this.int64Value = int64Value;
        this.protoValue = protoValue;
        this.stringValue = stringValue;
    }

    /**
     * Represents a boolean value.
     * 
    */
    public Boolean boolValue() {
        return this.boolValue;
    }
    /**
     * Represents a double value.
     * 
    */
    public Double doubleValue() {
        return this.doubleValue;
    }
    /**
     * Represents an int64 value.
     * 
    */
    public String int64Value() {
        return this.int64Value;
    }
    /**
     * Represents an 'Any' proto value.
     * 
    */
    public Map<String,String> protoValue() {
        return this.protoValue;
    }
    /**
     * Represents a string value.
     * 
    */
    public String stringValue() {
        return this.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1ValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean boolValue;
        private Double doubleValue;
        private String int64Value;
        private Map<String,String> protoValue;
        private String stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1ValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boolValue = defaults.boolValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.int64Value = defaults.int64Value;
    	      this.protoValue = defaults.protoValue;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder boolValue(Boolean boolValue) {
            this.boolValue = Objects.requireNonNull(boolValue);
            return this;
        }
        public Builder doubleValue(Double doubleValue) {
            this.doubleValue = Objects.requireNonNull(doubleValue);
            return this;
        }
        public Builder int64Value(String int64Value) {
            this.int64Value = Objects.requireNonNull(int64Value);
            return this;
        }
        public Builder protoValue(Map<String,String> protoValue) {
            this.protoValue = Objects.requireNonNull(protoValue);
            return this;
        }
        public Builder stringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }        public GoogleCloudChannelV1ValueResponse build() {
            return new GoogleCloudChannelV1ValueResponse(boolValue, doubleValue, int64Value, protoValue, stringValue);
        }
    }
}
