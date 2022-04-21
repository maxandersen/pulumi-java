// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

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
public final class ScriptStringExecutionParameterResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScriptStringExecutionParameterResponse Empty = new ScriptStringExecutionParameterResponse();

    /**
     * The parameter name
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The type of execution parameter
     * Expected value is &#39;Value&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * The value for the passed parameter
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private ScriptStringExecutionParameterResponse() {}

    private ScriptStringExecutionParameterResponse(ScriptStringExecutionParameterResponse $) {
        this.name = $.name;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScriptStringExecutionParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScriptStringExecutionParameterResponse $;

        public Builder() {
            $ = new ScriptStringExecutionParameterResponse();
        }

        public Builder(ScriptStringExecutionParameterResponse defaults) {
            $ = new ScriptStringExecutionParameterResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public ScriptStringExecutionParameterResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
