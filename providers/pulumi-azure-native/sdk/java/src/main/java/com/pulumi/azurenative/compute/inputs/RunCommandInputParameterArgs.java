// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the properties of a run command parameter.
 * 
 */
public final class RunCommandInputParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final RunCommandInputParameterArgs Empty = new RunCommandInputParameterArgs();

    /**
     * The run command parameter name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The run command parameter name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The run command parameter value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The run command parameter value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private RunCommandInputParameterArgs() {}

    private RunCommandInputParameterArgs(RunCommandInputParameterArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RunCommandInputParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RunCommandInputParameterArgs $;

        public Builder() {
            $ = new RunCommandInputParameterArgs();
        }

        public Builder(RunCommandInputParameterArgs defaults) {
            $ = new RunCommandInputParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The run command parameter name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The run command parameter name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The run command parameter value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The run command parameter value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RunCommandInputParameterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
