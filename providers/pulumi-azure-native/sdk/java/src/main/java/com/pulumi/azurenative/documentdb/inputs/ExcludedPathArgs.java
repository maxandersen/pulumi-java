// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExcludedPathArgs extends ResourceArgs {

    public static final ExcludedPathArgs Empty = new ExcludedPathArgs();

    /**
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private ExcludedPathArgs() {}

    private ExcludedPathArgs(ExcludedPathArgs $) {
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExcludedPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExcludedPathArgs $;

        public Builder() {
            $ = new ExcludedPathArgs();
        }

        public Builder(ExcludedPathArgs defaults) {
            $ = new ExcludedPathArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public ExcludedPathArgs build() {
            return $;
        }
    }

}
