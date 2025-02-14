// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.azurenative.appplatform.outputs.GatewayInstanceResponse;
import com.pulumi.azurenative.appplatform.outputs.GatewayOperatorResourceRequestsResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GatewayOperatorPropertiesResponse {
    /**
     * @return Collection of instances belong to Spring Cloud Gateway operator.
     * 
     */
    private final List<GatewayInstanceResponse> instances;
    /**
     * @return The requested resource quantity for required CPU and Memory.
     * 
     */
    private final GatewayOperatorResourceRequestsResponse resourceRequests;

    @CustomType.Constructor
    private GatewayOperatorPropertiesResponse(
        @CustomType.Parameter("instances") List<GatewayInstanceResponse> instances,
        @CustomType.Parameter("resourceRequests") GatewayOperatorResourceRequestsResponse resourceRequests) {
        this.instances = instances;
        this.resourceRequests = resourceRequests;
    }

    /**
     * @return Collection of instances belong to Spring Cloud Gateway operator.
     * 
     */
    public List<GatewayInstanceResponse> instances() {
        return this.instances;
    }
    /**
     * @return The requested resource quantity for required CPU and Memory.
     * 
     */
    public GatewayOperatorResourceRequestsResponse resourceRequests() {
        return this.resourceRequests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayOperatorPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GatewayInstanceResponse> instances;
        private GatewayOperatorResourceRequestsResponse resourceRequests;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayOperatorPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.resourceRequests = defaults.resourceRequests;
        }

        public Builder instances(List<GatewayInstanceResponse> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(GatewayInstanceResponse... instances) {
            return instances(List.of(instances));
        }
        public Builder resourceRequests(GatewayOperatorResourceRequestsResponse resourceRequests) {
            this.resourceRequests = Objects.requireNonNull(resourceRequests);
            return this;
        }        public GatewayOperatorPropertiesResponse build() {
            return new GatewayOperatorPropertiesResponse(instances, resourceRequests);
        }
    }
}
