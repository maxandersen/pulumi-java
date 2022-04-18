// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration of a virtual network to which API Management service is deployed.
 * 
 */
public final class VirtualNetworkConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkConfigurationResponse Empty = new VirtualNetworkConfigurationResponse();

    /**
     * The full resource ID of a subnet in a virtual network to deploy the API Management service in.
     * 
     */
    @Import(name="subnetResourceId")
      private final @Nullable String subnetResourceId;

    public Optional<String> subnetResourceId() {
        return this.subnetResourceId == null ? Optional.empty() : Optional.ofNullable(this.subnetResourceId);
    }

    /**
     * The name of the subnet.
     * 
     */
    @Import(name="subnetname", required=true)
      private final String subnetname;

    public String subnetname() {
        return this.subnetname;
    }

    /**
     * The virtual network ID. This is typically a GUID. Expect a null GUID by default.
     * 
     */
    @Import(name="vnetid", required=true)
      private final String vnetid;

    public String vnetid() {
        return this.vnetid;
    }

    public VirtualNetworkConfigurationResponse(
        @Nullable String subnetResourceId,
        String subnetname,
        String vnetid) {
        this.subnetResourceId = subnetResourceId;
        this.subnetname = Objects.requireNonNull(subnetname, "expected parameter 'subnetname' to be non-null");
        this.vnetid = Objects.requireNonNull(vnetid, "expected parameter 'vnetid' to be non-null");
    }

    private VirtualNetworkConfigurationResponse() {
        this.subnetResourceId = null;
        this.subnetname = null;
        this.vnetid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subnetResourceId;
        private String subnetname;
        private String vnetid;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetResourceId = defaults.subnetResourceId;
    	      this.subnetname = defaults.subnetname;
    	      this.vnetid = defaults.vnetid;
        }

        public Builder subnetResourceId(@Nullable String subnetResourceId) {
            this.subnetResourceId = subnetResourceId;
            return this;
        }
        public Builder subnetname(String subnetname) {
            this.subnetname = Objects.requireNonNull(subnetname);
            return this;
        }
        public Builder vnetid(String vnetid) {
            this.vnetid = Objects.requireNonNull(vnetid);
            return this;
        }        public VirtualNetworkConfigurationResponse build() {
            return new VirtualNetworkConfigurationResponse(subnetResourceId, subnetname, vnetid);
        }
    }
}
