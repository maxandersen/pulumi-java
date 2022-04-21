// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managedservices.inputs;

import com.pulumi.azurenative.managedservices.inputs.PlanResponse;
import com.pulumi.azurenative.managedservices.inputs.RegistrationAssignmentPropertiesResponseProperties;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Registration definition inside registration assignment.
 * 
 */
public final class RegistrationAssignmentPropertiesResponseRegistrationDefinition extends com.pulumi.resources.InvokeArgs {

    public static final RegistrationAssignmentPropertiesResponseRegistrationDefinition Empty = new RegistrationAssignmentPropertiesResponseRegistrationDefinition();

    /**
     * Fully qualified path of the registration definition.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * Name of the registration definition.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Plan details for the managed services.
     * 
     */
    @Import(name="plan")
    private @Nullable PlanResponse plan;

    public Optional<PlanResponse> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * Properties of registration definition inside registration assignment.
     * 
     */
    @Import(name="properties")
    private @Nullable RegistrationAssignmentPropertiesResponseProperties properties;

    public Optional<RegistrationAssignmentPropertiesResponseProperties> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Type of the resource (Microsoft.ManagedServices/registrationDefinitions).
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private RegistrationAssignmentPropertiesResponseRegistrationDefinition() {}

    private RegistrationAssignmentPropertiesResponseRegistrationDefinition(RegistrationAssignmentPropertiesResponseRegistrationDefinition $) {
        this.id = $.id;
        this.name = $.name;
        this.plan = $.plan;
        this.properties = $.properties;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistrationAssignmentPropertiesResponseRegistrationDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistrationAssignmentPropertiesResponseRegistrationDefinition $;

        public Builder() {
            $ = new RegistrationAssignmentPropertiesResponseRegistrationDefinition();
        }

        public Builder(RegistrationAssignmentPropertiesResponseRegistrationDefinition defaults) {
            $ = new RegistrationAssignmentPropertiesResponseRegistrationDefinition(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder plan(@Nullable PlanResponse plan) {
            $.plan = plan;
            return this;
        }

        public Builder properties(@Nullable RegistrationAssignmentPropertiesResponseProperties properties) {
            $.properties = properties;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public RegistrationAssignmentPropertiesResponseRegistrationDefinition build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
