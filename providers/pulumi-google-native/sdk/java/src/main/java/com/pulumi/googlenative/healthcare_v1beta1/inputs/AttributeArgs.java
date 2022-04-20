// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
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
      private final @Nullable Output<String> attributeDefinitionId;

    public Output<String> attributeDefinitionId() {
        return this.attributeDefinitionId == null ? Codegen.empty() : this.attributeDefinitionId;
    }

    /**
     * The value of the attribute. Must be an acceptable value as defined in the consent store. For example, if the consent store defines &#34;data type&#34; with acceptable values &#34;questionnaire&#34; and &#34;step-count&#34;, when the attribute name is data type, this field must contain one of those values.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    public AttributeArgs(
        @Nullable Output<String> attributeDefinitionId,
        @Nullable Output<List<String>> values) {
        this.attributeDefinitionId = attributeDefinitionId;
        this.values = values;
    }

    private AttributeArgs() {
        this.attributeDefinitionId = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> attributeDefinitionId;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(AttributeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeDefinitionId = defaults.attributeDefinitionId;
    	      this.values = defaults.values;
        }

        public Builder attributeDefinitionId(@Nullable Output<String> attributeDefinitionId) {
            this.attributeDefinitionId = attributeDefinitionId;
            return this;
        }
        public Builder attributeDefinitionId(@Nullable String attributeDefinitionId) {
            this.attributeDefinitionId = Codegen.ofNullable(attributeDefinitionId);
            return this;
        }
        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = Codegen.ofNullable(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public AttributeArgs build() {
            return new AttributeArgs(attributeDefinitionId, values);
        }
    }
}
