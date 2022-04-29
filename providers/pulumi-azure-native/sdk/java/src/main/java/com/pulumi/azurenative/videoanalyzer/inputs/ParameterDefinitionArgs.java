// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameter value of an specific pipeline topology parameter. See pipeline topology parameters for more information.
 * 
 */
public final class ParameterDefinitionArgs extends ResourceArgs {

    public static final ParameterDefinitionArgs Empty = new ParameterDefinitionArgs();

    /**
     * Name of the parameter declared in the pipeline topology.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the parameter declared in the pipeline topology.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Parameter value to be applied on this specific pipeline.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Parameter value to be applied on this specific pipeline.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ParameterDefinitionArgs() {}

    private ParameterDefinitionArgs(ParameterDefinitionArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParameterDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParameterDefinitionArgs $;

        public Builder() {
            $ = new ParameterDefinitionArgs();
        }

        public Builder(ParameterDefinitionArgs defaults) {
            $ = new ParameterDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the parameter declared in the pipeline topology.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the parameter declared in the pipeline topology.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Parameter value to be applied on this specific pipeline.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Parameter value to be applied on this specific pipeline.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ParameterDefinitionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
