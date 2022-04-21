// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CompositePathResponse extends com.pulumi.resources.InvokeArgs {

    public static final CompositePathResponse Empty = new CompositePathResponse();

    /**
     * Sort order for composite paths.
     * 
     */
    @Import(name="order")
    private @Nullable String order;

    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     * 
     */
    @Import(name="path")
    private @Nullable String path;

    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    private CompositePathResponse() {}

    private CompositePathResponse(CompositePathResponse $) {
        this.order = $.order;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CompositePathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CompositePathResponse $;

        public Builder() {
            $ = new CompositePathResponse();
        }

        public Builder(CompositePathResponse defaults) {
            $ = new CompositePathResponse(Objects.requireNonNull(defaults));
        }

        public Builder order(@Nullable String order) {
            $.order = order;
            return this;
        }

        public Builder path(@Nullable String path) {
            $.path = path;
            return this;
        }

        public CompositePathResponse build() {
            return $;
        }
    }

}
