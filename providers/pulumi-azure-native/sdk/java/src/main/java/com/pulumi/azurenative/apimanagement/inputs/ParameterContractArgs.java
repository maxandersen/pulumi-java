// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Operation parameters details.
 * 
 */
public final class ParameterContractArgs extends com.pulumi.resources.ResourceArgs {

    public static final ParameterContractArgs Empty = new ParameterContractArgs();

    /**
     * Default parameter value.
     * 
     */
    @Import(name="defaultValue")
    private @Nullable Output<String> defaultValue;

    public Optional<Output<String>> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * Parameter description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Parameter name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies whether parameter is required or not.
     * 
     */
    @Import(name="required")
    private @Nullable Output<Boolean> required;

    public Optional<Output<Boolean>> required() {
        return Optional.ofNullable(this.required);
    }

    /**
     * Parameter type.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Parameter values.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ParameterContractArgs() {}

    private ParameterContractArgs(ParameterContractArgs $) {
        this.defaultValue = $.defaultValue;
        this.description = $.description;
        this.name = $.name;
        this.required = $.required;
        this.type = $.type;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParameterContractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParameterContractArgs $;

        public Builder() {
            $ = new ParameterContractArgs();
        }

        public Builder(ParameterContractArgs defaults) {
            $ = new ParameterContractArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        public Builder defaultValue(String defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder required(@Nullable Output<Boolean> required) {
            $.required = required;
            return this;
        }

        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ParameterContractArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
