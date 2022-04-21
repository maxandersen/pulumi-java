// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the runbook parameter type.
 * 
 */
public final class RunbookParameterResponse extends com.pulumi.resources.InvokeArgs {

    public static final RunbookParameterResponse Empty = new RunbookParameterResponse();

    /**
     * Gets or sets the default value of parameter.
     * 
     */
    @Import(name="defaultValue")
    private @Nullable String defaultValue;

    public Optional<String> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * Gets or sets a Boolean value to indicate whether the parameter is mandatory or not.
     * 
     */
    @Import(name="isMandatory")
    private @Nullable Boolean isMandatory;

    public Optional<Boolean> isMandatory() {
        return Optional.ofNullable(this.isMandatory);
    }

    /**
     * Get or sets the position of the parameter.
     * 
     */
    @Import(name="position")
    private @Nullable Integer position;

    public Optional<Integer> position() {
        return Optional.ofNullable(this.position);
    }

    /**
     * Gets or sets the type of the parameter.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private RunbookParameterResponse() {}

    private RunbookParameterResponse(RunbookParameterResponse $) {
        this.defaultValue = $.defaultValue;
        this.isMandatory = $.isMandatory;
        this.position = $.position;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RunbookParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RunbookParameterResponse $;

        public Builder() {
            $ = new RunbookParameterResponse();
        }

        public Builder(RunbookParameterResponse defaults) {
            $ = new RunbookParameterResponse(Objects.requireNonNull(defaults));
        }

        public Builder defaultValue(@Nullable String defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        public Builder isMandatory(@Nullable Boolean isMandatory) {
            $.isMandatory = isMandatory;
            return this;
        }

        public Builder position(@Nullable Integer position) {
            $.position = position;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public RunbookParameterResponse build() {
            return $;
        }
    }

}
