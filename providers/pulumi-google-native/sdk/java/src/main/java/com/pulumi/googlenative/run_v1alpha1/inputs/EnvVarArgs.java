// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.run_v1alpha1.inputs.EnvVarSourceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EnvVar represents an environment variable present in a Container.
 * 
 */
public final class EnvVarArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvVarArgs Empty = new EnvVarArgs();

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * (Optional) Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to &#34;&#34;.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    /**
     * (Optional) Source for the environment variable&#39;s value. Only supports secret_key_ref. Source for the environment variable&#39;s value. Cannot be used if value is not empty.
     * 
     */
    @Import(name="valueFrom")
      private final @Nullable Output<EnvVarSourceArgs> valueFrom;

    public Output<EnvVarSourceArgs> valueFrom() {
        return this.valueFrom == null ? Codegen.empty() : this.valueFrom;
    }

    public EnvVarArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> value,
        @Nullable Output<EnvVarSourceArgs> valueFrom) {
        this.name = name;
        this.value = value;
        this.valueFrom = valueFrom;
    }

    private EnvVarArgs() {
        this.name = Codegen.empty();
        this.value = Codegen.empty();
        this.valueFrom = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvVarArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> value;
        private @Nullable Output<EnvVarSourceArgs> valueFrom;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvVarArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
    	      this.valueFrom = defaults.valueFrom;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }
        public Builder valueFrom(@Nullable Output<EnvVarSourceArgs> valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public Builder valueFrom(@Nullable EnvVarSourceArgs valueFrom) {
            this.valueFrom = Codegen.ofNullable(valueFrom);
            return this;
        }        public EnvVarArgs build() {
            return new EnvVarArgs(name, value, valueFrom);
        }
    }
}
