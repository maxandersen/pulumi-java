// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ForwardingRuleServiceDirectoryRegistrationResponse {
    /**
     * Service Directory namespace to register the forwarding rule under.
     * 
     */
    private final String namespace;
    /**
     * Service Directory service to register the forwarding rule under.
     * 
     */
    private final String service;
    /**
     * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs Forwarding Rules on the same network should use the same Service Directory region.
     * 
     */
    private final String serviceDirectoryRegion;

    @OutputCustomType.Constructor
    private ForwardingRuleServiceDirectoryRegistrationResponse(
        @OutputCustomType.Parameter("namespace") String namespace,
        @OutputCustomType.Parameter("service") String service,
        @OutputCustomType.Parameter("serviceDirectoryRegion") String serviceDirectoryRegion) {
        this.namespace = namespace;
        this.service = service;
        this.serviceDirectoryRegion = serviceDirectoryRegion;
    }

    /**
     * Service Directory namespace to register the forwarding rule under.
     * 
    */
    public String getNamespace() {
        return this.namespace;
    }
    /**
     * Service Directory service to register the forwarding rule under.
     * 
    */
    public String getService() {
        return this.service;
    }
    /**
     * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs Forwarding Rules on the same network should use the same Service Directory region.
     * 
    */
    public String getServiceDirectoryRegion() {
        return this.serviceDirectoryRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardingRuleServiceDirectoryRegistrationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespace;
        private String service;
        private String serviceDirectoryRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardingRuleServiceDirectoryRegistrationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
    	      this.service = defaults.service;
    	      this.serviceDirectoryRegion = defaults.serviceDirectoryRegion;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setServiceDirectoryRegion(String serviceDirectoryRegion) {
            this.serviceDirectoryRegion = Objects.requireNonNull(serviceDirectoryRegion);
            return this;
        }
        public ForwardingRuleServiceDirectoryRegistrationResponse build() {
            return new ForwardingRuleServiceDirectoryRegistrationResponse(namespace, service, serviceDirectoryRegion);
        }
    }
}
