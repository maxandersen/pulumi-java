// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScriptStringExecutionParameterResponse {
    /**
     * The parameter name
     * 
     */
    private final String name;
    /**
     * The type of execution parameter
     * Expected value is 'Value'.
     * 
     */
    private final String type;
    /**
     * The value for the passed parameter
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private ScriptStringExecutionParameterResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") @Nullable String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    /**
     * The parameter name
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The type of execution parameter
     * Expected value is 'Value'.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The value for the passed parameter
     * 
    */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptStringExecutionParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptStringExecutionParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public ScriptStringExecutionParameterResponse build() {
            return new ScriptStringExecutionParameterResponse(name, type, value);
        }
    }
}
