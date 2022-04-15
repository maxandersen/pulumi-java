// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UrlMapTestHeaderResponse {
    /**
     * Header name.
     * 
     */
    private final String name;
    /**
     * Header value.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private UrlMapTestHeaderResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Header name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Header value.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapTestHeaderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlMapTestHeaderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public UrlMapTestHeaderResponse build() {
            return new UrlMapTestHeaderResponse(name, value);
        }
    }
}
