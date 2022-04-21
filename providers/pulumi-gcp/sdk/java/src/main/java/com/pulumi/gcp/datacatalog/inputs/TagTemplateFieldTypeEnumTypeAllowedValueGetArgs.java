// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TagTemplateFieldTypeEnumTypeAllowedValueGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagTemplateFieldTypeEnumTypeAllowedValueGetArgs Empty = new TagTemplateFieldTypeEnumTypeAllowedValueGetArgs();

    /**
     * The display name for this template.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    private TagTemplateFieldTypeEnumTypeAllowedValueGetArgs() {}

    private TagTemplateFieldTypeEnumTypeAllowedValueGetArgs(TagTemplateFieldTypeEnumTypeAllowedValueGetArgs $) {
        this.displayName = $.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagTemplateFieldTypeEnumTypeAllowedValueGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagTemplateFieldTypeEnumTypeAllowedValueGetArgs $;

        public Builder() {
            $ = new TagTemplateFieldTypeEnumTypeAllowedValueGetArgs();
        }

        public Builder(TagTemplateFieldTypeEnumTypeAllowedValueGetArgs defaults) {
            $ = new TagTemplateFieldTypeEnumTypeAllowedValueGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public TagTemplateFieldTypeEnumTypeAllowedValueGetArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}
