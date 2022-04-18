// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.azurenative.logz.enums.TagAction;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
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
      private final @Nullable Output<Either<String,TagAction>> action;

    public Output<Either<String,TagAction>> action() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * The name (also known as the key) of the tag.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The value of the tag.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public FilteringTagArgs(
        @Nullable Output<Either<String,TagAction>> action,
        @Nullable Output<String> name,
        @Nullable Output<String> value) {
        this.action = action;
        this.name = name;
        this.value = value;
    }

    private FilteringTagArgs() {
        this.action = Codegen.empty();
        this.name = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilteringTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,TagAction>> action;
        private @Nullable Output<String> name;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(FilteringTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder action(@Nullable Output<Either<String,TagAction>> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable Either<String,TagAction> action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public FilteringTagArgs build() {
            return new FilteringTagArgs(action, name, value);
        }
    }
}
