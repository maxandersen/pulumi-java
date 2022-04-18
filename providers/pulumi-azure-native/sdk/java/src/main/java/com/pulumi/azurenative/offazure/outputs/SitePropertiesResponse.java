// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.offazure.outputs;

import com.pulumi.azurenative.offazure.outputs.SiteAgentPropertiesResponse;
import com.pulumi.azurenative.offazure.outputs.SiteSpnPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SitePropertiesResponse {
    /**
     * On-premises agent details.
     * 
     */
    private final @Nullable SiteAgentPropertiesResponse agentDetails;
    /**
     * Appliance Name.
     * 
     */
    private final @Nullable String applianceName;
    /**
     * ARM ID of migration hub solution for SDS.
     * 
     */
    private final @Nullable String discoverySolutionId;
    /**
     * Service endpoint.
     * 
     */
    private final String serviceEndpoint;
    /**
     * Service principal identity details used by agent for communication to the service.
     * 
     */
    private final @Nullable SiteSpnPropertiesResponse servicePrincipalIdentityDetails;

    @CustomType.Constructor
    private SitePropertiesResponse(
        @CustomType.Parameter("agentDetails") @Nullable SiteAgentPropertiesResponse agentDetails,
        @CustomType.Parameter("applianceName") @Nullable String applianceName,
        @CustomType.Parameter("discoverySolutionId") @Nullable String discoverySolutionId,
        @CustomType.Parameter("serviceEndpoint") String serviceEndpoint,
        @CustomType.Parameter("servicePrincipalIdentityDetails") @Nullable SiteSpnPropertiesResponse servicePrincipalIdentityDetails) {
        this.agentDetails = agentDetails;
        this.applianceName = applianceName;
        this.discoverySolutionId = discoverySolutionId;
        this.serviceEndpoint = serviceEndpoint;
        this.servicePrincipalIdentityDetails = servicePrincipalIdentityDetails;
    }

    /**
     * On-premises agent details.
     * 
    */
    public Optional<SiteAgentPropertiesResponse> agentDetails() {
        return Optional.ofNullable(this.agentDetails);
    }
    /**
     * Appliance Name.
     * 
    */
    public Optional<String> applianceName() {
        return Optional.ofNullable(this.applianceName);
    }
    /**
     * ARM ID of migration hub solution for SDS.
     * 
    */
    public Optional<String> discoverySolutionId() {
        return Optional.ofNullable(this.discoverySolutionId);
    }
    /**
     * Service endpoint.
     * 
    */
    public String serviceEndpoint() {
        return this.serviceEndpoint;
    }
    /**
     * Service principal identity details used by agent for communication to the service.
     * 
    */
    public Optional<SiteSpnPropertiesResponse> servicePrincipalIdentityDetails() {
        return Optional.ofNullable(this.servicePrincipalIdentityDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SitePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SiteAgentPropertiesResponse agentDetails;
        private @Nullable String applianceName;
        private @Nullable String discoverySolutionId;
        private String serviceEndpoint;
        private @Nullable SiteSpnPropertiesResponse servicePrincipalIdentityDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(SitePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentDetails = defaults.agentDetails;
    	      this.applianceName = defaults.applianceName;
    	      this.discoverySolutionId = defaults.discoverySolutionId;
    	      this.serviceEndpoint = defaults.serviceEndpoint;
    	      this.servicePrincipalIdentityDetails = defaults.servicePrincipalIdentityDetails;
        }

        public Builder agentDetails(@Nullable SiteAgentPropertiesResponse agentDetails) {
            this.agentDetails = agentDetails;
            return this;
        }
        public Builder applianceName(@Nullable String applianceName) {
            this.applianceName = applianceName;
            return this;
        }
        public Builder discoverySolutionId(@Nullable String discoverySolutionId) {
            this.discoverySolutionId = discoverySolutionId;
            return this;
        }
        public Builder serviceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint);
            return this;
        }
        public Builder servicePrincipalIdentityDetails(@Nullable SiteSpnPropertiesResponse servicePrincipalIdentityDetails) {
            this.servicePrincipalIdentityDetails = servicePrincipalIdentityDetails;
            return this;
        }        public SitePropertiesResponse build() {
            return new SitePropertiesResponse(agentDetails, applianceName, discoverySolutionId, serviceEndpoint, servicePrincipalIdentityDetails);
        }
    }
}
