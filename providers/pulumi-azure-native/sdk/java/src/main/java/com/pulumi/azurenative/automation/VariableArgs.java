// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final VariableArgs Empty = new VariableArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Gets or sets the description of the variable.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Gets or sets the description of the variable.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Gets or sets the encrypted flag of the variable.
     * 
     */
    @Import(name="isEncrypted")
    private @Nullable Output<Boolean> isEncrypted;

    /**
     * @return Gets or sets the encrypted flag of the variable.
     * 
     */
    public Optional<Output<Boolean>> isEncrypted() {
        return Optional.ofNullable(this.isEncrypted);
    }

    /**
     * Gets or sets the name of the variable.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Gets or sets the name of the variable.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the value of the variable.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Gets or sets the value of the variable.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * The variable name.
     * 
     */
    @Import(name="variableName")
    private @Nullable Output<String> variableName;

    /**
     * @return The variable name.
     * 
     */
    public Optional<Output<String>> variableName() {
        return Optional.ofNullable(this.variableName);
    }

    private VariableArgs() {}

    private VariableArgs(VariableArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.description = $.description;
        this.isEncrypted = $.isEncrypted;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.value = $.value;
        this.variableName = $.variableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VariableArgs $;

        public Builder() {
            $ = new VariableArgs();
        }

        public Builder(VariableArgs defaults) {
            $ = new VariableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param description Gets or sets the description of the variable.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Gets or sets the description of the variable.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param isEncrypted Gets or sets the encrypted flag of the variable.
         * 
         * @return builder
         * 
         */
        public Builder isEncrypted(@Nullable Output<Boolean> isEncrypted) {
            $.isEncrypted = isEncrypted;
            return this;
        }

        /**
         * @param isEncrypted Gets or sets the encrypted flag of the variable.
         * 
         * @return builder
         * 
         */
        public Builder isEncrypted(Boolean isEncrypted) {
            return isEncrypted(Output.of(isEncrypted));
        }

        /**
         * @param name Gets or sets the name of the variable.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Gets or sets the name of the variable.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param value Gets or sets the value of the variable.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Gets or sets the value of the variable.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param variableName The variable name.
         * 
         * @return builder
         * 
         */
        public Builder variableName(@Nullable Output<String> variableName) {
            $.variableName = variableName;
            return this;
        }

        /**
         * @param variableName The variable name.
         * 
         * @return builder
         * 
         */
        public Builder variableName(String variableName) {
            return variableName(Output.of(variableName));
        }

        public VariableArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
