// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VMwareV2FabricSpecificDetailsResponse {
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is &#39;VMwareV2&#39;.
     * 
     */
    private final String instanceType;
    /**
     * The Migration solution ARM Id.
     * 
     */
    private final String migrationSolutionId;
    /**
     * The service endpoint.
     * 
     */
    private final String serviceEndpoint;
    /**
     * The service resource Id.
     * 
     */
    private final String serviceResourceId;
    /**
     * The ARM Id of the VMware site.
     * 
     */
    private final String vmwareSiteId;

    @CustomType.Constructor
    private VMwareV2FabricSpecificDetailsResponse(
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("migrationSolutionId") String migrationSolutionId,
        @CustomType.Parameter("serviceEndpoint") String serviceEndpoint,
        @CustomType.Parameter("serviceResourceId") String serviceResourceId,
        @CustomType.Parameter("vmwareSiteId") String vmwareSiteId) {
        this.instanceType = instanceType;
        this.migrationSolutionId = migrationSolutionId;
        this.serviceEndpoint = serviceEndpoint;
        this.serviceResourceId = serviceResourceId;
        this.vmwareSiteId = vmwareSiteId;
    }

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is &#39;VMwareV2&#39;.
     * 
    */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * The Migration solution ARM Id.
     * 
    */
    public String migrationSolutionId() {
        return this.migrationSolutionId;
    }
    /**
     * The service endpoint.
     * 
    */
    public String serviceEndpoint() {
        return this.serviceEndpoint;
    }
    /**
     * The service resource Id.
     * 
    */
    public String serviceResourceId() {
        return this.serviceResourceId;
    }
    /**
     * The ARM Id of the VMware site.
     * 
    */
    public String vmwareSiteId() {
        return this.vmwareSiteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareV2FabricSpecificDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;
        private String migrationSolutionId;
        private String serviceEndpoint;
        private String serviceResourceId;
        private String vmwareSiteId;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareV2FabricSpecificDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.migrationSolutionId = defaults.migrationSolutionId;
    	      this.serviceEndpoint = defaults.serviceEndpoint;
    	      this.serviceResourceId = defaults.serviceResourceId;
    	      this.vmwareSiteId = defaults.vmwareSiteId;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder migrationSolutionId(String migrationSolutionId) {
            this.migrationSolutionId = Objects.requireNonNull(migrationSolutionId);
            return this;
        }
        public Builder serviceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint);
            return this;
        }
        public Builder serviceResourceId(String serviceResourceId) {
            this.serviceResourceId = Objects.requireNonNull(serviceResourceId);
            return this;
        }
        public Builder vmwareSiteId(String vmwareSiteId) {
            this.vmwareSiteId = Objects.requireNonNull(vmwareSiteId);
            return this;
        }        public VMwareV2FabricSpecificDetailsResponse build() {
            return new VMwareV2FabricSpecificDetailsResponse(instanceType, migrationSolutionId, serviceEndpoint, serviceResourceId, vmwareSiteId);
        }
    }
}
