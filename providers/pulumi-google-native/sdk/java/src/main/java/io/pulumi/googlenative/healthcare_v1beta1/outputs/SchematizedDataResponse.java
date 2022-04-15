// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SchematizedDataResponse {
    /**
     * JSON output of the parser.
     * 
     */
    private final String data;
    /**
     * The error output of the parser.
     * 
     */
    private final String error;

    @CustomType.Constructor
    private SchematizedDataResponse(
        @CustomType.Parameter("data") String data,
        @CustomType.Parameter("error") String error) {
        this.data = data;
        this.error = error;
    }

    /**
     * JSON output of the parser.
     * 
    */
    public String data() {
        return this.data;
    }
    /**
     * The error output of the parser.
     * 
    */
    public String error() {
        return this.error;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchematizedDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String data;
        private String error;

        public Builder() {
    	      // Empty
        }

        public Builder(SchematizedDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.error = defaults.error;
        }

        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder error(String error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }        public SchematizedDataResponse build() {
            return new SchematizedDataResponse(data, error);
        }
    }
}
