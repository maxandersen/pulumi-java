// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The custom setup of setting environment variable.
 * 
 */
public final class EnvironmentVariableSetupArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentVariableSetupArgs Empty = new EnvironmentVariableSetupArgs();

    /**
     * The type of custom setup.
     * Expected value is 'EnvironmentVariableSetup'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The name of the environment variable.
     * 
     */
    @Import(name="variableName", required=true)
      private final Output<String> variableName;

    public Output<String> variableName() {
        return this.variableName;
    }

    /**
     * The value of the environment variable.
     * 
     */
    @Import(name="variableValue", required=true)
      private final Output<String> variableValue;

    public Output<String> variableValue() {
        return this.variableValue;
    }

    public EnvironmentVariableSetupArgs(
        Output<String> type,
        Output<String> variableName,
        Output<String> variableValue) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.variableName = Objects.requireNonNull(variableName, "expected parameter 'variableName' to be non-null");
        this.variableValue = Objects.requireNonNull(variableValue, "expected parameter 'variableValue' to be non-null");
    }

    private EnvironmentVariableSetupArgs() {
        this.type = Codegen.empty();
        this.variableName = Codegen.empty();
        this.variableValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVariableSetupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> type;
        private Output<String> variableName;
        private Output<String> variableValue;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentVariableSetupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.variableName = defaults.variableName;
    	      this.variableValue = defaults.variableValue;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder variableName(Output<String> variableName) {
            this.variableName = Objects.requireNonNull(variableName);
            return this;
        }
        public Builder variableName(String variableName) {
            this.variableName = Output.of(Objects.requireNonNull(variableName));
            return this;
        }
        public Builder variableValue(Output<String> variableValue) {
            this.variableValue = Objects.requireNonNull(variableValue);
            return this;
        }
        public Builder variableValue(String variableValue) {
            this.variableValue = Output.of(Objects.requireNonNull(variableValue));
            return this;
        }        public EnvironmentVariableSetupArgs build() {
            return new EnvironmentVariableSetupArgs(type, variableName, variableValue);
        }
    }
}
