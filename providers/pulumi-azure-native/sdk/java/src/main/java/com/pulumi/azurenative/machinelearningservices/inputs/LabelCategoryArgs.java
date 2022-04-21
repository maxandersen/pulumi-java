// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.LabelClassArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a category of labels in a labeling job.
 * 
 */
public final class LabelCategoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final LabelCategoryArgs Empty = new LabelCategoryArgs();

    /**
     * Indicates whether it is allowed to select multiple classes in this category.
     * 
     */
    @Import(name="allowMultiSelect")
    private @Nullable Output<Boolean> allowMultiSelect;

    public Optional<Output<Boolean>> allowMultiSelect() {
        return Optional.ofNullable(this.allowMultiSelect);
    }

    /**
     * Dictionary of label classes in this category.
     * 
     */
    @Import(name="classes", required=true)
    private Output<Map<String,LabelClassArgs>> classes;

    public Output<Map<String,LabelClassArgs>> classes() {
        return this.classes;
    }

    /**
     * Display name of the label category.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    private LabelCategoryArgs() {}

    private LabelCategoryArgs(LabelCategoryArgs $) {
        this.allowMultiSelect = $.allowMultiSelect;
        this.classes = $.classes;
        this.displayName = $.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabelCategoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabelCategoryArgs $;

        public Builder() {
            $ = new LabelCategoryArgs();
        }

        public Builder(LabelCategoryArgs defaults) {
            $ = new LabelCategoryArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowMultiSelect(@Nullable Output<Boolean> allowMultiSelect) {
            $.allowMultiSelect = allowMultiSelect;
            return this;
        }

        public Builder allowMultiSelect(Boolean allowMultiSelect) {
            return allowMultiSelect(Output.of(allowMultiSelect));
        }

        public Builder classes(Output<Map<String,LabelClassArgs>> classes) {
            $.classes = classes;
            return this;
        }

        public Builder classes(Map<String,LabelClassArgs> classes) {
            return classes(Output.of(classes));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public LabelCategoryArgs build() {
            $.classes = Objects.requireNonNull($.classes, "expected parameter 'classes' to be non-null");
            return $;
        }
    }

}
