// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApiKeyAuthenticationResponse {
    /**
     * The location of the authentication key/value pair in the request.
     * 
     */
    private final String in;
    /**
     * The key name of the authentication key/value pair.
     * 
     */
    private final String name;
    /**
     * The authentication type.
     * Expected value is 'ApiKey'.
     * 
     */
    private final String type;
    /**
     * The value of the authentication key/value pair.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ApiKeyAuthenticationResponse(
        @CustomType.Parameter("in") String in,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.in = in;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    /**
     * The location of the authentication key/value pair in the request.
     * 
    */
    public String in() {
        return this.in;
    }
    /**
     * The key name of the authentication key/value pair.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The authentication type.
     * Expected value is 'ApiKey'.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The value of the authentication key/value pair.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String in;
        private String name;
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.in = defaults.in;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder in(String in) {
            this.in = Objects.requireNonNull(in);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ApiKeyAuthenticationResponse build() {
            return new ApiKeyAuthenticationResponse(in, name, type, value);
        }
    }
}
