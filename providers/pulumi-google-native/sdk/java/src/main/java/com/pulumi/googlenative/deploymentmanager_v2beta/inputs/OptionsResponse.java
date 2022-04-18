// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager_v2beta.inputs.AsyncOptionsResponse;
import com.pulumi.googlenative.deploymentmanager_v2beta.inputs.InputMappingResponse;
import com.pulumi.googlenative.deploymentmanager_v2beta.inputs.ValidationOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Options allows customized resource handling by Deployment Manager.
 * 
 */
public final class OptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final OptionsResponse Empty = new OptionsResponse();

    /**
     * Options regarding how to thread async requests.
     * 
     */
    @Import(name="asyncOptions", required=true)
      private final List<AsyncOptionsResponse> asyncOptions;

    public List<AsyncOptionsResponse> asyncOptions() {
        return this.asyncOptions;
    }

    /**
     * The mappings that apply for requests.
     * 
     */
    @Import(name="inputMappings", required=true)
      private final List<InputMappingResponse> inputMappings;

    public List<InputMappingResponse> inputMappings() {
        return this.inputMappings;
    }

    /**
     * Options for how to validate and process properties on a resource.
     * 
     */
    @Import(name="validationOptions", required=true)
      private final ValidationOptionsResponse validationOptions;

    public ValidationOptionsResponse validationOptions() {
        return this.validationOptions;
    }

    /**
     * Additional properties block described as a jsonSchema, these properties will never be part of the json payload, but they can be consumed by InputMappings, this must be a valid json schema draft-04. The properties specified here will be decouple in a different section. This schema will be merged to the schema validation, and properties here will be extracted From the payload and consumed explicitly by InputMappings. ex: field1: type: string field2: type: number
     * 
     */
    @Import(name="virtualProperties", required=true)
      private final String virtualProperties;

    public String virtualProperties() {
        return this.virtualProperties;
    }

    public OptionsResponse(
        List<AsyncOptionsResponse> asyncOptions,
        List<InputMappingResponse> inputMappings,
        ValidationOptionsResponse validationOptions,
        String virtualProperties) {
        this.asyncOptions = Objects.requireNonNull(asyncOptions, "expected parameter 'asyncOptions' to be non-null");
        this.inputMappings = Objects.requireNonNull(inputMappings, "expected parameter 'inputMappings' to be non-null");
        this.validationOptions = Objects.requireNonNull(validationOptions, "expected parameter 'validationOptions' to be non-null");
        this.virtualProperties = Objects.requireNonNull(virtualProperties, "expected parameter 'virtualProperties' to be non-null");
    }

    private OptionsResponse() {
        this.asyncOptions = List.of();
        this.inputMappings = List.of();
        this.validationOptions = null;
        this.virtualProperties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AsyncOptionsResponse> asyncOptions;
        private List<InputMappingResponse> inputMappings;
        private ValidationOptionsResponse validationOptions;
        private String virtualProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asyncOptions = defaults.asyncOptions;
    	      this.inputMappings = defaults.inputMappings;
    	      this.validationOptions = defaults.validationOptions;
    	      this.virtualProperties = defaults.virtualProperties;
        }

        public Builder asyncOptions(List<AsyncOptionsResponse> asyncOptions) {
            this.asyncOptions = Objects.requireNonNull(asyncOptions);
            return this;
        }
        public Builder asyncOptions(AsyncOptionsResponse... asyncOptions) {
            return asyncOptions(List.of(asyncOptions));
        }
        public Builder inputMappings(List<InputMappingResponse> inputMappings) {
            this.inputMappings = Objects.requireNonNull(inputMappings);
            return this;
        }
        public Builder inputMappings(InputMappingResponse... inputMappings) {
            return inputMappings(List.of(inputMappings));
        }
        public Builder validationOptions(ValidationOptionsResponse validationOptions) {
            this.validationOptions = Objects.requireNonNull(validationOptions);
            return this;
        }
        public Builder virtualProperties(String virtualProperties) {
            this.virtualProperties = Objects.requireNonNull(virtualProperties);
            return this;
        }        public OptionsResponse build() {
            return new OptionsResponse(asyncOptions, inputMappings, validationOptions, virtualProperties);
        }
    }
}
