// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.RosettaNetPipBusinessDocumentResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RosettaNetPipRoleSettingsResponse {
    /**
     * The action name.
     * 
     */
    private final String action;
    /**
     * The RosettaNet ProcessConfiguration business document.
     * 
     */
    private final RosettaNetPipBusinessDocumentResponse businessDocument;
    /**
     * The description.
     * 
     */
    private final @Nullable String description;
    /**
     * The role name.
     * 
     */
    private final String role;
    /**
     * The RosettaNet ProcessConfiguration role type.
     * 
     */
    private final String roleType;
    /**
     * The service name.
     * 
     */
    private final String service;
    /**
     * The service classification name.
     * 
     */
    private final String serviceClassification;

    @CustomType.Constructor
    private RosettaNetPipRoleSettingsResponse(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("businessDocument") RosettaNetPipBusinessDocumentResponse businessDocument,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("role") String role,
        @CustomType.Parameter("roleType") String roleType,
        @CustomType.Parameter("service") String service,
        @CustomType.Parameter("serviceClassification") String serviceClassification) {
        this.action = action;
        this.businessDocument = businessDocument;
        this.description = description;
        this.role = role;
        this.roleType = roleType;
        this.service = service;
        this.serviceClassification = serviceClassification;
    }

    /**
     * The action name.
     * 
    */
    public String action() {
        return this.action;
    }
    /**
     * The RosettaNet ProcessConfiguration business document.
     * 
    */
    public RosettaNetPipBusinessDocumentResponse businessDocument() {
        return this.businessDocument;
    }
    /**
     * The description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The role name.
     * 
    */
    public String role() {
        return this.role;
    }
    /**
     * The RosettaNet ProcessConfiguration role type.
     * 
    */
    public String roleType() {
        return this.roleType;
    }
    /**
     * The service name.
     * 
    */
    public String service() {
        return this.service;
    }
    /**
     * The service classification name.
     * 
    */
    public String serviceClassification() {
        return this.serviceClassification;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetPipRoleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private RosettaNetPipBusinessDocumentResponse businessDocument;
        private @Nullable String description;
        private String role;
        private String roleType;
        private String service;
        private String serviceClassification;

        public Builder() {
    	      // Empty
        }

        public Builder(RosettaNetPipRoleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.businessDocument = defaults.businessDocument;
    	      this.description = defaults.description;
    	      this.role = defaults.role;
    	      this.roleType = defaults.roleType;
    	      this.service = defaults.service;
    	      this.serviceClassification = defaults.serviceClassification;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder businessDocument(RosettaNetPipBusinessDocumentResponse businessDocument) {
            this.businessDocument = Objects.requireNonNull(businessDocument);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder roleType(String roleType) {
            this.roleType = Objects.requireNonNull(roleType);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder serviceClassification(String serviceClassification) {
            this.serviceClassification = Objects.requireNonNull(serviceClassification);
            return this;
        }        public RosettaNetPipRoleSettingsResponse build() {
            return new RosettaNetPipRoleSettingsResponse(action, businessDocument, description, role, roleType, service, serviceClassification);
        }
    }
}
