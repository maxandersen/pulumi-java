// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.azurenative.logz.enums.TagAction;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The definition of a filtering tag. Filtering tags are used for capturing resources and include/exclude them from being monitored.
 * 
 */
public final class FilteringTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final FilteringTagArgs Empty = new FilteringTagArgs();

    /**
     * Valid actions for a filtering tag. Exclusion takes priority over inclusion.
     * 
     */
    @Import(name="action")
    private @Nullable Output<Either<String,TagAction>> action;

    /**
     * @return Valid actions for a filtering tag. Exclusion takes priority over inclusion.
     * 
     */
    public Optional<Output<Either<String,TagAction>>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * The name (also known as the key) of the tag.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name (also known as the key) of the tag.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The value of the tag.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the tag.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private FilteringTagArgs() {}

    private FilteringTagArgs(FilteringTagArgs $) {
        this.action = $.action;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilteringTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilteringTagArgs $;

        public Builder() {
            $ = new FilteringTagArgs();
        }

        public Builder(FilteringTagArgs defaults) {
            $ = new FilteringTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Valid actions for a filtering tag. Exclusion takes priority over inclusion.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<Either<String,TagAction>> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Valid actions for a filtering tag. Exclusion takes priority over inclusion.
         * 
         * @return builder
         * 
         */
        public Builder action(Either<String,TagAction> action) {
            return action(Output.of(action));
        }

        /**
         * @param action Valid actions for a filtering tag. Exclusion takes priority over inclusion.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Either.ofLeft(action));
        }

        /**
         * @param action Valid actions for a filtering tag. Exclusion takes priority over inclusion.
         * 
         * @return builder
         * 
         */
        public Builder action(TagAction action) {
            return action(Either.ofRight(action));
        }

        /**
         * @param name The name (also known as the key) of the tag.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name (also known as the key) of the tag.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of the tag.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the tag.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public FilteringTagArgs build() {
            return $;
        }
    }

}
