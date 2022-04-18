// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationsmanagement.inputs;

import com.pulumi.azurenative.operationsmanagement.inputs.ArmTemplateParameterResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ManagementConfiguration properties supported by the OperationsManagement resource provider.
 * 
 */
public final class ManagementConfigurationPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagementConfigurationPropertiesResponse Empty = new ManagementConfigurationPropertiesResponse();

    /**
     * The applicationId of the appliance for this Management.
     * 
     */
    @Import(name="applicationId")
      private final @Nullable String applicationId;

    public Optional<String> applicationId() {
        return this.applicationId == null ? Optional.empty() : Optional.ofNullable(this.applicationId);
    }

    /**
     * Parameters to run the ARM template
     * 
     */
    @Import(name="parameters", required=true)
      private final List<ArmTemplateParameterResponse> parameters;

    public List<ArmTemplateParameterResponse> parameters() {
        return this.parameters;
    }

    /**
     * The type of the parent resource.
     * 
     */
    @Import(name="parentResourceType", required=true)
      private final String parentResourceType;

    public String parentResourceType() {
        return this.parentResourceType;
    }

    /**
     * The provisioning state for the ManagementConfiguration.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The Json object containing the ARM template to deploy
     * 
     */
    @Import(name="template", required=true)
      private final Object template;

    public Object template() {
        return this.template;
    }

    public ManagementConfigurationPropertiesResponse(
        @Nullable String applicationId,
        List<ArmTemplateParameterResponse> parameters,
        String parentResourceType,
        String provisioningState,
        Object template) {
        this.applicationId = applicationId;
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.parentResourceType = Objects.requireNonNull(parentResourceType, "expected parameter 'parentResourceType' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
    }

    private ManagementConfigurationPropertiesResponse() {
        this.applicationId = null;
        this.parameters = List.of();
        this.parentResourceType = null;
        this.provisioningState = null;
        this.template = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementConfigurationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;
        private List<ArmTemplateParameterResponse> parameters;
        private String parentResourceType;
        private String provisioningState;
        private Object template;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementConfigurationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.parameters = defaults.parameters;
    	      this.parentResourceType = defaults.parentResourceType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.template = defaults.template;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder parameters(List<ArmTemplateParameterResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(ArmTemplateParameterResponse... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder parentResourceType(String parentResourceType) {
            this.parentResourceType = Objects.requireNonNull(parentResourceType);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder template(Object template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }        public ManagementConfigurationPropertiesResponse build() {
            return new ManagementConfigurationPropertiesResponse(applicationId, parameters, parentResourceType, provisioningState, template);
        }
    }
}
