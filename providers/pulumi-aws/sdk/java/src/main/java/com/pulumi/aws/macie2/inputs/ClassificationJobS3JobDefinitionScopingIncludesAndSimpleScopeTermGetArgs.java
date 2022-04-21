// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs Empty = new ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs();

    /**
     * The operator to use in a condition. Valid values are: `EQ`, `GT`, `GTE`, `LT`, `LTE`, `NE`, `CONTAINS`, `STARTS_WITH`
     * 
     */
    @Import(name="comparator")
    private @Nullable Output<String> comparator;

    public Optional<Output<String>> comparator() {
        return Optional.ofNullable(this.comparator);
    }

    /**
     * The object property to use in the condition.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * An array that lists the values to use in the condition.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs() {}

    private ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs(ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs $) {
        this.comparator = $.comparator;
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs $;

        public Builder() {
            $ = new ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs();
        }

        public Builder(ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs defaults) {
            $ = new ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder comparator(@Nullable Output<String> comparator) {
            $.comparator = comparator;
            return this;
        }

        public Builder comparator(String comparator) {
            return comparator(Output.of(comparator));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermGetArgs build() {
            return $;
        }
    }

}
