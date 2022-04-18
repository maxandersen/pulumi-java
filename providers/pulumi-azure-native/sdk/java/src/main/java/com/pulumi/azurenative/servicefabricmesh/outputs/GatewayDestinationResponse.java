// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GatewayDestinationResponse {
    /**
     * Name of the service fabric Mesh application.
     * 
     */
    private final String applicationName;
    /**
     * name of the endpoint in the service.
     * 
     */
    private final String endpointName;
    /**
     * service that contains the endpoint.
     * 
     */
    private final String serviceName;

    @CustomType.Constructor
    private GatewayDestinationResponse(
        @CustomType.Parameter("applicationName") String applicationName,
        @CustomType.Parameter("endpointName") String endpointName,
        @CustomType.Parameter("serviceName") String serviceName) {
        this.applicationName = applicationName;
        this.endpointName = endpointName;
        this.serviceName = serviceName;
    }

    /**
     * Name of the service fabric Mesh application.
     * 
    */
    public String applicationName() {
        return this.applicationName;
    }
    /**
     * name of the endpoint in the service.
     * 
    */
    public String endpointName() {
        return this.endpointName;
    }
    /**
     * service that contains the endpoint.
     * 
    */
    public String serviceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationName;
        private String endpointName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.endpointName = defaults.endpointName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder applicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }
        public Builder endpointName(String endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }        public GatewayDestinationResponse build() {
            return new GatewayDestinationResponse(applicationName, endpointName, serviceName);
        }
    }
}
