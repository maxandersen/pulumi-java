// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.neptune.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ParameterGroupParameterGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ParameterGroupParameterGetArgs Empty = new ParameterGroupParameterGetArgs();

    /**
     * The apply method of the Neptune parameter. Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
     * 
     */
    @Import(name="applyMethod")
      private final @Nullable Output<String> applyMethod;

    public Output<String> applyMethod() {
        return this.applyMethod == null ? Codegen.empty() : this.applyMethod;
    }

    /**
     * The name of the Neptune parameter.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The value of the Neptune parameter.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    public ParameterGroupParameterGetArgs(
        @Nullable Output<String> applyMethod,
        Output<String> name,
        Output<String> value) {
        this.applyMethod = applyMethod;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ParameterGroupParameterGetArgs() {
        this.applyMethod = Codegen.empty();
        this.name = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterGroupParameterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applyMethod;
        private Output<String> name;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterGroupParameterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyMethod = defaults.applyMethod;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder applyMethod(@Nullable Output<String> applyMethod) {
            this.applyMethod = applyMethod;
            return this;
        }
        public Builder applyMethod(@Nullable String applyMethod) {
            this.applyMethod = Codegen.ofNullable(applyMethod);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public ParameterGroupParameterGetArgs build() {
            return new ParameterGroupParameterGetArgs(applyMethod, name, value);
        }
    }
}
