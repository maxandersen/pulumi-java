// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * InputMapping creates a &#39;virtual&#39; property that will be injected into the properties before sending the request to the underlying API.
 * 
 */
public final class InputMappingResponse extends com.pulumi.resources.InvokeArgs {

    public static final InputMappingResponse Empty = new InputMappingResponse();

    /**
     * The name of the field that is going to be injected.
     * 
     */
    @Import(name="fieldName", required=true)
      private final String fieldName;

    public String fieldName() {
        return this.fieldName;
    }

    /**
     * The location where this mapping applies.
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    /**
     * Regex to evaluate on method to decide if input applies.
     * 
     */
    @Import(name="methodMatch", required=true)
      private final String methodMatch;

    public String methodMatch() {
        return this.methodMatch;
    }

    /**
     * A jsonPath expression to select an element.
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String value() {
        return this.value;
    }

    public InputMappingResponse(
        String fieldName,
        String location,
        String methodMatch,
        String value) {
        this.fieldName = Objects.requireNonNull(fieldName, "expected parameter 'fieldName' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.methodMatch = Objects.requireNonNull(methodMatch, "expected parameter 'methodMatch' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private InputMappingResponse() {
        this.fieldName = null;
        this.location = null;
        this.methodMatch = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fieldName;
        private String location;
        private String methodMatch;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(InputMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldName = defaults.fieldName;
    	      this.location = defaults.location;
    	      this.methodMatch = defaults.methodMatch;
    	      this.value = defaults.value;
        }

        public Builder fieldName(String fieldName) {
            this.fieldName = Objects.requireNonNull(fieldName);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder methodMatch(String methodMatch) {
            this.methodMatch = Objects.requireNonNull(methodMatch);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public InputMappingResponse build() {
            return new InputMappingResponse(fieldName, location, methodMatch, value);
        }
    }
}
