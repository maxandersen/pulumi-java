// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a script action on role on the cluster.
 * 
 */
public final class ScriptActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScriptActionResponse Empty = new ScriptActionResponse();

    /**
     * The name of the script action.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The parameters for the script provided.
     * 
     */
    @Import(name="parameters", required=true)
    private String parameters;

    public String parameters() {
        return this.parameters;
    }

    /**
     * The URI to the script.
     * 
     */
    @Import(name="uri", required=true)
    private String uri;

    public String uri() {
        return this.uri;
    }

    private ScriptActionResponse() {}

    private ScriptActionResponse(ScriptActionResponse $) {
        this.name = $.name;
        this.parameters = $.parameters;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScriptActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScriptActionResponse $;

        public Builder() {
            $ = new ScriptActionResponse();
        }

        public Builder(ScriptActionResponse defaults) {
            $ = new ScriptActionResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder parameters(String parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder uri(String uri) {
            $.uri = uri;
            return this;
        }

        public ScriptActionResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
