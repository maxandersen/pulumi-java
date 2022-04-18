// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datapipeline.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPipelineDefinitionParameterObjectAttribute {
    /**
     * Field identifier.
     * 
     */
    private final String key;
    /**
     * Field value, expressed as a String.
     * 
     */
    private final String stringValue;

    @CustomType.Constructor
    private GetPipelineDefinitionParameterObjectAttribute(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("stringValue") String stringValue) {
        this.key = key;
        this.stringValue = stringValue;
    }

    /**
     * Field identifier.
     * 
    */
    public String key() {
        return this.key;
    }
    /**
     * Field value, expressed as a String.
     * 
    */
    public String stringValue() {
        return this.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineDefinitionParameterObjectAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineDefinitionParameterObjectAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder stringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }        public GetPipelineDefinitionParameterObjectAttribute build() {
            return new GetPipelineDefinitionParameterObjectAttribute(key, stringValue);
        }
    }
}
