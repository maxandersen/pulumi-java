// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualNetworkConfigurationResponse {
    /**
     * Data management's service public IP address resource id.
     * 
     */
    private final String dataManagementPublicIpId;
    /**
     * Engine service's public IP address resource id.
     * 
     */
    private final String enginePublicIpId;
    /**
     * The subnet resource id.
     * 
     */
    private final String subnetId;

    @CustomType.Constructor
    private VirtualNetworkConfigurationResponse(
        @CustomType.Parameter("dataManagementPublicIpId") String dataManagementPublicIpId,
        @CustomType.Parameter("enginePublicIpId") String enginePublicIpId,
        @CustomType.Parameter("subnetId") String subnetId) {
        this.dataManagementPublicIpId = dataManagementPublicIpId;
        this.enginePublicIpId = enginePublicIpId;
        this.subnetId = subnetId;
    }

    /**
     * Data management's service public IP address resource id.
     * 
    */
    public String dataManagementPublicIpId() {
        return this.dataManagementPublicIpId;
    }
    /**
     * Engine service's public IP address resource id.
     * 
    */
    public String enginePublicIpId() {
        return this.enginePublicIpId;
    }
    /**
     * The subnet resource id.
     * 
    */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataManagementPublicIpId;
        private String enginePublicIpId;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataManagementPublicIpId = defaults.dataManagementPublicIpId;
    	      this.enginePublicIpId = defaults.enginePublicIpId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder dataManagementPublicIpId(String dataManagementPublicIpId) {
            this.dataManagementPublicIpId = Objects.requireNonNull(dataManagementPublicIpId);
            return this;
        }
        public Builder enginePublicIpId(String enginePublicIpId) {
            this.enginePublicIpId = Objects.requireNonNull(enginePublicIpId);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public VirtualNetworkConfigurationResponse build() {
            return new VirtualNetworkConfigurationResponse(dataManagementPublicIpId, enginePublicIpId, subnetId);
        }
    }
}
