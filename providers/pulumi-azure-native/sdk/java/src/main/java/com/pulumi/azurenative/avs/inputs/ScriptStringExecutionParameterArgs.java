// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * a plain text value execution parameter
 * 
 */
public final class ScriptStringExecutionParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScriptStringExecutionParameterArgs Empty = new ScriptStringExecutionParameterArgs();

    /**
     * The parameter name
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The parameter name
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The type of execution parameter
     * Expected value is &#39;Value&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of execution parameter
     * Expected value is &#39;Value&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The value for the passed parameter
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value for the passed parameter
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ScriptStringExecutionParameterArgs() {}

    private ScriptStringExecutionParameterArgs(ScriptStringExecutionParameterArgs $) {
        this.name = $.name;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScriptStringExecutionParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScriptStringExecutionParameterArgs $;

        public Builder() {
            $ = new ScriptStringExecutionParameterArgs();
        }

        public Builder(ScriptStringExecutionParameterArgs defaults) {
            $ = new ScriptStringExecutionParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The parameter name
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The parameter name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The type of execution parameter
         * Expected value is &#39;Value&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of execution parameter
         * Expected value is &#39;Value&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The value for the passed parameter
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value for the passed parameter
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ScriptStringExecutionParameterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
