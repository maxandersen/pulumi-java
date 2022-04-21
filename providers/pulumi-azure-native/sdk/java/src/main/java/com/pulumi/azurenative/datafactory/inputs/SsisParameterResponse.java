// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Ssis parameter.
 * 
 */
public final class SsisParameterResponse extends com.pulumi.resources.InvokeArgs {

    public static final SsisParameterResponse Empty = new SsisParameterResponse();

    /**
     * Parameter type.
     * 
     */
    @Import(name="dataType")
    private @Nullable String dataType;

    public Optional<String> dataType() {
        return Optional.ofNullable(this.dataType);
    }

    /**
     * Default value of parameter.
     * 
     */
    @Import(name="defaultValue")
    private @Nullable String defaultValue;

    public Optional<String> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * Parameter description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Design default value of parameter.
     * 
     */
    @Import(name="designDefaultValue")
    private @Nullable String designDefaultValue;

    public Optional<String> designDefaultValue() {
        return Optional.ofNullable(this.designDefaultValue);
    }

    /**
     * Parameter id.
     * 
     */
    @Import(name="id")
    private @Nullable Double id;

    public Optional<Double> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Parameter name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether parameter is required.
     * 
     */
    @Import(name="required")
    private @Nullable Boolean required;

    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }

    /**
     * Whether parameter is sensitive.
     * 
     */
    @Import(name="sensitive")
    private @Nullable Boolean sensitive;

    public Optional<Boolean> sensitive() {
        return Optional.ofNullable(this.sensitive);
    }

    /**
     * Default sensitive value of parameter.
     * 
     */
    @Import(name="sensitiveDefaultValue")
    private @Nullable String sensitiveDefaultValue;

    public Optional<String> sensitiveDefaultValue() {
        return Optional.ofNullable(this.sensitiveDefaultValue);
    }

    /**
     * Parameter value set.
     * 
     */
    @Import(name="valueSet")
    private @Nullable Boolean valueSet;

    public Optional<Boolean> valueSet() {
        return Optional.ofNullable(this.valueSet);
    }

    /**
     * Parameter value type.
     * 
     */
    @Import(name="valueType")
    private @Nullable String valueType;

    public Optional<String> valueType() {
        return Optional.ofNullable(this.valueType);
    }

    /**
     * Parameter reference variable.
     * 
     */
    @Import(name="variable")
    private @Nullable String variable;

    public Optional<String> variable() {
        return Optional.ofNullable(this.variable);
    }

    private SsisParameterResponse() {}

    private SsisParameterResponse(SsisParameterResponse $) {
        this.dataType = $.dataType;
        this.defaultValue = $.defaultValue;
        this.description = $.description;
        this.designDefaultValue = $.designDefaultValue;
        this.id = $.id;
        this.name = $.name;
        this.required = $.required;
        this.sensitive = $.sensitive;
        this.sensitiveDefaultValue = $.sensitiveDefaultValue;
        this.valueSet = $.valueSet;
        this.valueType = $.valueType;
        this.variable = $.variable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SsisParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SsisParameterResponse $;

        public Builder() {
            $ = new SsisParameterResponse();
        }

        public Builder(SsisParameterResponse defaults) {
            $ = new SsisParameterResponse(Objects.requireNonNull(defaults));
        }

        public Builder dataType(@Nullable String dataType) {
            $.dataType = dataType;
            return this;
        }

        public Builder defaultValue(@Nullable String defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder designDefaultValue(@Nullable String designDefaultValue) {
            $.designDefaultValue = designDefaultValue;
            return this;
        }

        public Builder id(@Nullable Double id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder required(@Nullable Boolean required) {
            $.required = required;
            return this;
        }

        public Builder sensitive(@Nullable Boolean sensitive) {
            $.sensitive = sensitive;
            return this;
        }

        public Builder sensitiveDefaultValue(@Nullable String sensitiveDefaultValue) {
            $.sensitiveDefaultValue = sensitiveDefaultValue;
            return this;
        }

        public Builder valueSet(@Nullable Boolean valueSet) {
            $.valueSet = valueSet;
            return this;
        }

        public Builder valueType(@Nullable String valueType) {
            $.valueType = valueType;
            return this;
        }

        public Builder variable(@Nullable String variable) {
            $.variable = variable;
            return this;
        }

        public SsisParameterResponse build() {
            return $;
        }
    }

}
