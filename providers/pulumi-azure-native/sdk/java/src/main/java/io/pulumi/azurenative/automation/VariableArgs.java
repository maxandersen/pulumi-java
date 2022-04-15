// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VariableArgs extends io.pulumi.resources.ResourceArgs {

    public static final VariableArgs Empty = new VariableArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
      private final Output<String> automationAccountName;

    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Gets or sets the description of the variable.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Gets or sets the encrypted flag of the variable.
     * 
     */
    @Import(name="isEncrypted")
      private final @Nullable Output<Boolean> isEncrypted;

    public Output<Boolean> isEncrypted() {
        return this.isEncrypted == null ? Codegen.empty() : this.isEncrypted;
    }

    /**
     * Gets or sets the name of the variable.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the value of the variable.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    /**
     * The variable name.
     * 
     */
    @Import(name="variableName")
      private final @Nullable Output<String> variableName;

    public Output<String> variableName() {
        return this.variableName == null ? Codegen.empty() : this.variableName;
    }

    public VariableArgs(
        Output<String> automationAccountName,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> isEncrypted,
        Output<String> name,
        Output<String> resourceGroupName,
        @Nullable Output<String> value,
        @Nullable Output<String> variableName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.description = description;
        this.isEncrypted = isEncrypted;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.value = value;
        this.variableName = variableName;
    }

    private VariableArgs() {
        this.automationAccountName = Codegen.empty();
        this.description = Codegen.empty();
        this.isEncrypted = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.value = Codegen.empty();
        this.variableName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> automationAccountName;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> isEncrypted;
        private Output<String> name;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> value;
        private @Nullable Output<String> variableName;

        public Builder() {
    	      // Empty
        }

        public Builder(VariableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.description = defaults.description;
    	      this.isEncrypted = defaults.isEncrypted;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.value = defaults.value;
    	      this.variableName = defaults.variableName;
        }

        public Builder automationAccountName(Output<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }
        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Output.of(Objects.requireNonNull(automationAccountName));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder isEncrypted(@Nullable Output<Boolean> isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }
        public Builder isEncrypted(@Nullable Boolean isEncrypted) {
            this.isEncrypted = Codegen.ofNullable(isEncrypted);
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
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
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
        public Builder variableName(@Nullable Output<String> variableName) {
            this.variableName = variableName;
            return this;
        }
        public Builder variableName(@Nullable String variableName) {
            this.variableName = Codegen.ofNullable(variableName);
            return this;
        }        public VariableArgs build() {
            return new VariableArgs(automationAccountName, description, isEncrypted, name, resourceGroupName, value, variableName);
        }
    }
}
