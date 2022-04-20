// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayHostnameConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayHostnameConfigurationArgs Empty = new GetGatewayHostnameConfigurationArgs();

    /**
     * Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
     * 
     */
    @Import(name="gatewayId", required=true)
      private final String gatewayId;

    public String gatewayId() {
        return this.gatewayId;
    }

    /**
     * Gateway hostname configuration identifier. Must be unique in the scope of parent Gateway entity.
     * 
     */
    @Import(name="hcId", required=true)
      private final String hcId;

    public String hcId() {
        return this.hcId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    public GetGatewayHostnameConfigurationArgs(
        String gatewayId,
        String hcId,
        String resourceGroupName,
        String serviceName) {
        this.gatewayId = Objects.requireNonNull(gatewayId, "expected parameter 'gatewayId' to be non-null");
        this.hcId = Objects.requireNonNull(hcId, "expected parameter 'hcId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetGatewayHostnameConfigurationArgs() {
        this.gatewayId = null;
        this.hcId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayHostnameConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewayId;
        private String hcId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayHostnameConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayId = defaults.gatewayId;
    	      this.hcId = defaults.hcId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder gatewayId(String gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }
        public Builder hcId(String hcId) {
            this.hcId = Objects.requireNonNull(hcId);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }        public GetGatewayHostnameConfigurationArgs build() {
            return new GetGatewayHostnameConfigurationArgs(gatewayId, hcId, resourceGroupName, serviceName);
        }
    }
}
