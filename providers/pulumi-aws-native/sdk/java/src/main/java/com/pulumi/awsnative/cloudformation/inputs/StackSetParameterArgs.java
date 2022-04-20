// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class StackSetParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final StackSetParameterArgs Empty = new StackSetParameterArgs();

    /**
     * The key associated with the parameter. If you don&#39;t specify a key and value for a particular parameter, AWS CloudFormation uses the default value that is specified in your template.
     * 
     */
    @Import(name="parameterKey", required=true)
      private final Output<String> parameterKey;

    public Output<String> parameterKey() {
        return this.parameterKey;
    }

    /**
     * The input value associated with the parameter.
     * 
     */
    @Import(name="parameterValue", required=true)
      private final Output<String> parameterValue;

    public Output<String> parameterValue() {
        return this.parameterValue;
    }

    public StackSetParameterArgs(
        Output<String> parameterKey,
        Output<String> parameterValue) {
        this.parameterKey = Objects.requireNonNull(parameterKey, "expected parameter 'parameterKey' to be non-null");
        this.parameterValue = Objects.requireNonNull(parameterValue, "expected parameter 'parameterValue' to be non-null");
    }

    private StackSetParameterArgs() {
        this.parameterKey = Codegen.empty();
        this.parameterValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> parameterKey;
        private Output<String> parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterKey = defaults.parameterKey;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder parameterKey(Output<String> parameterKey) {
            this.parameterKey = Objects.requireNonNull(parameterKey);
            return this;
        }
        public Builder parameterKey(String parameterKey) {
            this.parameterKey = Output.of(Objects.requireNonNull(parameterKey));
            return this;
        }
        public Builder parameterValue(Output<String> parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }
        public Builder parameterValue(String parameterValue) {
            this.parameterValue = Output.of(Objects.requireNonNull(parameterValue));
            return this;
        }        public StackSetParameterArgs build() {
            return new StackSetParameterArgs(parameterKey, parameterValue);
        }
    }
}
