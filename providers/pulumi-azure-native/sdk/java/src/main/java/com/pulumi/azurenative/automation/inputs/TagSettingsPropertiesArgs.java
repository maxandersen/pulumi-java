// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.azurenative.automation.enums.TagOperators;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Tag filter information for the VM.
 * 
 */
public final class TagSettingsPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagSettingsPropertiesArgs Empty = new TagSettingsPropertiesArgs();

    /**
     * Filter VMs by Any or All specified tags.
     * 
     */
    @Import(name="filterOperator")
    private @Nullable Output<TagOperators> filterOperator;

    public Optional<Output<TagOperators>> filterOperator() {
        return Optional.ofNullable(this.filterOperator);
    }

    /**
     * Dictionary of tags with its list of values.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,List<String>>> tags;

    public Optional<Output<Map<String,List<String>>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private TagSettingsPropertiesArgs() {}

    private TagSettingsPropertiesArgs(TagSettingsPropertiesArgs $) {
        this.filterOperator = $.filterOperator;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagSettingsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagSettingsPropertiesArgs $;

        public Builder() {
            $ = new TagSettingsPropertiesArgs();
        }

        public Builder(TagSettingsPropertiesArgs defaults) {
            $ = new TagSettingsPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder filterOperator(@Nullable Output<TagOperators> filterOperator) {
            $.filterOperator = filterOperator;
            return this;
        }

        public Builder filterOperator(TagOperators filterOperator) {
            return filterOperator(Output.of(filterOperator));
        }

        public Builder tags(@Nullable Output<Map<String,List<String>>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,List<String>> tags) {
            return tags(Output.of(tags));
        }

        public TagSettingsPropertiesArgs build() {
            return $;
        }
    }

}
