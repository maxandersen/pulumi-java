// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices.outputs;

import io.pulumi.azurenative.managedservices.outputs.PlanResponse;
import io.pulumi.azurenative.managedservices.outputs.RegistrationAssignmentPropertiesResponseProperties;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegistrationAssignmentPropertiesResponseRegistrationDefinition {
    /**
     * Fully qualified path of the registration definition.
     * 
     */
    private final String id;
    /**
     * Name of the registration definition.
     * 
     */
    private final String name;
    /**
     * Plan details for the managed services.
     * 
     */
    private final @Nullable PlanResponse plan;
    /**
     * Properties of registration definition inside registration assignment.
     * 
     */
    private final @Nullable RegistrationAssignmentPropertiesResponseProperties properties;
    /**
     * Type of the resource (Microsoft.ManagedServices/registrationDefinitions).
     * 
     */
    private final String type;

    @CustomType.Constructor
    private RegistrationAssignmentPropertiesResponseRegistrationDefinition(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("plan") @Nullable PlanResponse plan,
        @CustomType.Parameter("properties") @Nullable RegistrationAssignmentPropertiesResponseProperties properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.plan = plan;
        this.properties = properties;
        this.type = type;
    }

    /**
     * Fully qualified path of the registration definition.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Name of the registration definition.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Plan details for the managed services.
     * 
    */
    public Optional<PlanResponse> plan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * Properties of registration definition inside registration assignment.
     * 
    */
    public Optional<RegistrationAssignmentPropertiesResponseProperties> properties() {
        return Optional.ofNullable(this.properties);
    }
    /**
     * Type of the resource (Microsoft.ManagedServices/registrationDefinitions).
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistrationAssignmentPropertiesResponseRegistrationDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable PlanResponse plan;
        private @Nullable RegistrationAssignmentPropertiesResponseProperties properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistrationAssignmentPropertiesResponseRegistrationDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder plan(@Nullable PlanResponse plan) {
            this.plan = plan;
            return this;
        }
        public Builder properties(@Nullable RegistrationAssignmentPropertiesResponseProperties properties) {
            this.properties = properties;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public RegistrationAssignmentPropertiesResponseRegistrationDefinition build() {
            return new RegistrationAssignmentPropertiesResponseRegistrationDefinition(id, name, plan, properties, type);
        }
    }
}
