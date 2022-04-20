// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkloadNetworkDnsZoneArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkloadNetworkDnsZoneArgs Empty = new GetWorkloadNetworkDnsZoneArgs();

    /**
     * NSX DNS Zone identifier. Generally the same as the DNS Zone&#39;s display name
     * 
     */
    @Import(name="dnsZoneId", required=true)
      private final String dnsZoneId;

    public String dnsZoneId() {
        return this.dnsZoneId;
    }

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
      private final String privateCloudName;

    public String privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetWorkloadNetworkDnsZoneArgs(
        String dnsZoneId,
        String privateCloudName,
        String resourceGroupName) {
        this.dnsZoneId = Objects.requireNonNull(dnsZoneId, "expected parameter 'dnsZoneId' to be non-null");
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetWorkloadNetworkDnsZoneArgs() {
        this.dnsZoneId = null;
        this.privateCloudName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadNetworkDnsZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dnsZoneId;
        private String privateCloudName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadNetworkDnsZoneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsZoneId = defaults.dnsZoneId;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder dnsZoneId(String dnsZoneId) {
            this.dnsZoneId = Objects.requireNonNull(dnsZoneId);
            return this;
        }
        public Builder privateCloudName(String privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetWorkloadNetworkDnsZoneArgs build() {
            return new GetWorkloadNetworkDnsZoneArgs(dnsZoneId, privateCloudName, resourceGroupName);
        }
    }
}
