// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies configuration of a redis module
 * 
 */
public final class ModuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final ModuleResponse Empty = new ModuleResponse();

    /**
     * Configuration options for the module, e.g. &#39;ERROR_RATE 0.00 INITIAL_SIZE 400&#39;.
     * 
     */
    @Import(name="args")
    private @Nullable String args;

    public Optional<String> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * The name of the module, e.g. &#39;RedisBloom&#39;, &#39;RediSearch&#39;, &#39;RedisTimeSeries&#39;
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The version of the module, e.g. &#39;1.0&#39;.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    public String version() {
        return this.version;
    }

    private ModuleResponse() {}

    private ModuleResponse(ModuleResponse $) {
        this.args = $.args;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModuleResponse $;

        public Builder() {
            $ = new ModuleResponse();
        }

        public Builder(ModuleResponse defaults) {
            $ = new ModuleResponse(Objects.requireNonNull(defaults));
        }

        public Builder args(@Nullable String args) {
            $.args = args;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public ModuleResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
