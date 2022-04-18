// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managedservices.outputs;

import com.pulumi.azurenative.managedservices.outputs.RegistrationAssignmentPropertiesResponseRegistrationDefinition;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RegistrationAssignmentPropertiesResponse {
    /**
     * Current state of the registration assignment.
     * 
     */
    private final String provisioningState;
    /**
     * Registration definition inside registration assignment.
     * 
     */
    private final RegistrationAssignmentPropertiesResponseRegistrationDefinition registrationDefinition;
    /**
     * Fully qualified path of the registration definition.
     * 
     */
    private final String registrationDefinitionId;

    @CustomType.Constructor
    private RegistrationAssignmentPropertiesResponse(
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("registrationDefinition") RegistrationAssignmentPropertiesResponseRegistrationDefinition registrationDefinition,
        @CustomType.Parameter("registrationDefinitionId") String registrationDefinitionId) {
        this.provisioningState = provisioningState;
        this.registrationDefinition = registrationDefinition;
        this.registrationDefinitionId = registrationDefinitionId;
    }

    /**
     * Current state of the registration assignment.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Registration definition inside registration assignment.
     * 
    */
    public RegistrationAssignmentPropertiesResponseRegistrationDefinition registrationDefinition() {
        return this.registrationDefinition;
    }
    /**
     * Fully qualified path of the registration definition.
     * 
    */
    public String registrationDefinitionId() {
        return this.registrationDefinitionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistrationAssignmentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String provisioningState;
        private RegistrationAssignmentPropertiesResponseRegistrationDefinition registrationDefinition;
        private String registrationDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistrationAssignmentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
    	      this.registrationDefinition = defaults.registrationDefinition;
    	      this.registrationDefinitionId = defaults.registrationDefinitionId;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder registrationDefinition(RegistrationAssignmentPropertiesResponseRegistrationDefinition registrationDefinition) {
            this.registrationDefinition = Objects.requireNonNull(registrationDefinition);
            return this;
        }
        public Builder registrationDefinitionId(String registrationDefinitionId) {
            this.registrationDefinitionId = Objects.requireNonNull(registrationDefinitionId);
            return this;
        }        public RegistrationAssignmentPropertiesResponse build() {
            return new RegistrationAssignmentPropertiesResponse(provisioningState, registrationDefinition, registrationDefinitionId);
        }
    }
}
