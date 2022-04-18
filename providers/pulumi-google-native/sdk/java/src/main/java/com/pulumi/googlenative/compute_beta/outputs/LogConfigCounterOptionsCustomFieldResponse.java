// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LogConfigCounterOptionsCustomFieldResponse {
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String name;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private LogConfigCounterOptionsCustomFieldResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigCounterOptionsCustomFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigCounterOptionsCustomFieldResponse defaults) {
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
        }        public LogConfigCounterOptionsCustomFieldResponse build() {
            return new LogConfigCounterOptionsCustomFieldResponse(name, value);
        }
    }
}
