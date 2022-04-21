// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An attribute value for a Consent or User data mapping. Each Attribute must have a corresponding AttributeDefinition in the consent store that defines the default and allowed values.
 * 
 */
public final class AttributeArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttributeArgs Empty = new AttributeArgs();

    /**
     * Indicates the name of an attribute defined in the consent store.
     * 
     */
    @Import(name="attributeDefinitionId")
    private @Nullable Output<String> attributeDefinitionId;

    public Optional<Output<String>> attributeDefinitionId() {
        return Optional.ofNullable(this.attributeDefinitionId);
    }

    /**
     * The value of the attribute. Must be an acceptable value as defined in the consent store. For example, if the consent store defines &#34;data type&#34; with acceptable values &#34;questionnaire&#34; and &#34;step-count&#34;, when the attribute name is data type, this field must contain one of those values.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private AttributeArgs() {}

    private AttributeArgs(AttributeArgs $) {
        this.attributeDefinitionId = $.attributeDefinitionId;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttributeArgs $;

        public Builder() {
            $ = new AttributeArgs();
        }

        public Builder(AttributeArgs defaults) {
            $ = new AttributeArgs(Objects.requireNonNull(defaults));
        }

        public Builder attributeDefinitionId(@Nullable Output<String> attributeDefinitionId) {
            $.attributeDefinitionId = attributeDefinitionId;
            return this;
        }

        public Builder attributeDefinitionId(String attributeDefinitionId) {
            return attributeDefinitionId(Output.of(attributeDefinitionId));
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

        public AttributeArgs build() {
            return $;
        }
    }

}
