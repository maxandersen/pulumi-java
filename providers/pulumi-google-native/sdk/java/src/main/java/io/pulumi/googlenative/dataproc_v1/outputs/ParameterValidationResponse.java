// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.RegexValidationResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.ValueValidationResponse;
import java.util.Objects;

@CustomType
public final class ParameterValidationResponse {
    /**
     * Validation based on regular expressions.
     * 
     */
    private final RegexValidationResponse regex;
    /**
     * Validation based on a list of allowed values.
     * 
     */
    private final ValueValidationResponse values;

    @CustomType.Constructor
    private ParameterValidationResponse(
        @CustomType.Parameter("regex") RegexValidationResponse regex,
        @CustomType.Parameter("values") ValueValidationResponse values) {
        this.regex = regex;
        this.values = values;
    }

    /**
     * Validation based on regular expressions.
     * 
    */
    public RegexValidationResponse regex() {
        return this.regex;
    }
    /**
     * Validation based on a list of allowed values.
     * 
    */
    public ValueValidationResponse values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterValidationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegexValidationResponse regex;
        private ValueValidationResponse values;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterValidationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
    	      this.values = defaults.values;
        }

        public Builder regex(RegexValidationResponse regex) {
            this.regex = Objects.requireNonNull(regex);
            return this;
        }
        public Builder values(ValueValidationResponse values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }        public ParameterValidationResponse build() {
            return new ParameterValidationResponse(regex, values);
        }
    }
}
