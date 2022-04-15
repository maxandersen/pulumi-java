// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GlobalParameterSpecificationResponse {
    /**
     * Global Parameter type.
     * 
     */
    private final String type;
    /**
     * Value of parameter.
     * 
     */
    private final Object value;

    @CustomType.Constructor
    private GlobalParameterSpecificationResponse(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") Object value) {
        this.type = type;
        this.value = value;
    }

    /**
     * Global Parameter type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Value of parameter.
     * 
    */
    public Object value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalParameterSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalParameterSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(Object value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GlobalParameterSpecificationResponse build() {
            return new GlobalParameterSpecificationResponse(type, value);
        }
    }
}
