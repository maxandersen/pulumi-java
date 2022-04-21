// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An attribute value for a Consent or User data mapping. Each Attribute must have a corresponding AttributeDefinition in the consent store that defines the default and allowed values.
 * 
 */
public final class AttributeResponse extends com.pulumi.resources.InvokeArgs {

    public static final AttributeResponse Empty = new AttributeResponse();

    /**
     * Indicates the name of an attribute defined in the consent store.
     * 
     */
    @Import(name="attributeDefinitionId", required=true)
    private String attributeDefinitionId;

    public String attributeDefinitionId() {
        return this.attributeDefinitionId;
    }

    /**
     * The value of the attribute. Must be an acceptable value as defined in the consent store. For example, if the consent store defines &#34;data type&#34; with acceptable values &#34;questionnaire&#34; and &#34;step-count&#34;, when the attribute name is data type, this field must contain one of those values.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private AttributeResponse() {}

    private AttributeResponse(AttributeResponse $) {
        this.attributeDefinitionId = $.attributeDefinitionId;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttributeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttributeResponse $;

        public Builder() {
            $ = new AttributeResponse();
        }

        public Builder(AttributeResponse defaults) {
            $ = new AttributeResponse(Objects.requireNonNull(defaults));
        }

        public Builder attributeDefinitionId(String attributeDefinitionId) {
            $.attributeDefinitionId = attributeDefinitionId;
            return this;
        }

        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public AttributeResponse build() {
            $.attributeDefinitionId = Objects.requireNonNull($.attributeDefinitionId, "expected parameter 'attributeDefinitionId' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
