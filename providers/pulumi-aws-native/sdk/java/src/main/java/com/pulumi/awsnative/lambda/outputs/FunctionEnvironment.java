// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionEnvironment {
    /**
     * Environment variable key-value pairs.
     * 
     */
    private final @Nullable Object variables;

    @CustomType.Constructor
    private FunctionEnvironment(@CustomType.Parameter("variables") @Nullable Object variables) {
        this.variables = variables;
    }

    /**
     * Environment variable key-value pairs.
     * 
    */
    public Optional<Object> variables() {
        return Optional.ofNullable(this.variables);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object variables;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.variables = defaults.variables;
        }

        public Builder variables(@Nullable Object variables) {
            this.variables = variables;
            return this;
        }        public FunctionEnvironment build() {
            return new FunctionEnvironment(variables);
        }
    }
}
