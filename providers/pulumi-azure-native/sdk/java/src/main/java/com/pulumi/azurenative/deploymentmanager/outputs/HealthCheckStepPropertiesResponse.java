// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.outputs;

import com.pulumi.azurenative.deploymentmanager.outputs.RestHealthCheckStepAttributesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HealthCheckStepPropertiesResponse {
    /**
     * The health check step attributes
     * 
     */
    private final RestHealthCheckStepAttributesResponse attributes;
    /**
     * The type of step.
     * Expected value is 'HealthCheck'.
     * 
     */
    private final String stepType;

    @CustomType.Constructor
    private HealthCheckStepPropertiesResponse(
        @CustomType.Parameter("attributes") RestHealthCheckStepAttributesResponse attributes,
        @CustomType.Parameter("stepType") String stepType) {
        this.attributes = attributes;
        this.stepType = stepType;
    }

    /**
     * The health check step attributes
     * 
    */
    public RestHealthCheckStepAttributesResponse attributes() {
        return this.attributes;
    }
    /**
     * The type of step.
     * Expected value is 'HealthCheck'.
     * 
    */
    public String stepType() {
        return this.stepType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckStepPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestHealthCheckStepAttributesResponse attributes;
        private String stepType;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckStepPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.stepType = defaults.stepType;
        }

        public Builder attributes(RestHealthCheckStepAttributesResponse attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder stepType(String stepType) {
            this.stepType = Objects.requireNonNull(stepType);
            return this;
        }        public HealthCheckStepPropertiesResponse build() {
            return new HealthCheckStepPropertiesResponse(attributes, stepType);
        }
    }
}
