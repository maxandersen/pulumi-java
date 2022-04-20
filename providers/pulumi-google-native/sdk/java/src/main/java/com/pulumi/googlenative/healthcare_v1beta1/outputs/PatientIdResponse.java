// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PatientIdResponse {
    /**
     * ID type. For example, MRN or NHS.
     * 
     */
    private final String type;
    /**
     * The patient&#39;s unique identifier.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private PatientIdResponse(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * ID type. For example, MRN or NHS.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The patient&#39;s unique identifier.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatientIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(PatientIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public PatientIdResponse build() {
            return new PatientIdResponse(type, value);
        }
    }
}
