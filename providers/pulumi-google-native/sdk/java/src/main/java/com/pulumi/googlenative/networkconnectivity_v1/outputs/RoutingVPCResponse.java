// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkconnectivity_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RoutingVPCResponse {
    /**
     * @return If true, indicates that this VPC network is currently associated with spokes that use the data transfer feature (spokes where the site_to_site_data_transfer field is set to true). If you create new spokes that use data transfer, they must be associated with this VPC network. At most, one VPC network will have this field set to true.
     * 
     */
    private final Boolean requiredForNewSiteToSiteDataTransferSpokes;
    /**
     * @return The URI of the VPC network.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private RoutingVPCResponse(
        @CustomType.Parameter("requiredForNewSiteToSiteDataTransferSpokes") Boolean requiredForNewSiteToSiteDataTransferSpokes,
        @CustomType.Parameter("uri") String uri) {
        this.requiredForNewSiteToSiteDataTransferSpokes = requiredForNewSiteToSiteDataTransferSpokes;
        this.uri = uri;
    }

    /**
     * @return If true, indicates that this VPC network is currently associated with spokes that use the data transfer feature (spokes where the site_to_site_data_transfer field is set to true). If you create new spokes that use data transfer, they must be associated with this VPC network. At most, one VPC network will have this field set to true.
     * 
     */
    public Boolean requiredForNewSiteToSiteDataTransferSpokes() {
        return this.requiredForNewSiteToSiteDataTransferSpokes;
    }
    /**
     * @return The URI of the VPC network.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingVPCResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean requiredForNewSiteToSiteDataTransferSpokes;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingVPCResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requiredForNewSiteToSiteDataTransferSpokes = defaults.requiredForNewSiteToSiteDataTransferSpokes;
    	      this.uri = defaults.uri;
        }

        public Builder requiredForNewSiteToSiteDataTransferSpokes(Boolean requiredForNewSiteToSiteDataTransferSpokes) {
            this.requiredForNewSiteToSiteDataTransferSpokes = Objects.requireNonNull(requiredForNewSiteToSiteDataTransferSpokes);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public RoutingVPCResponse build() {
            return new RoutingVPCResponse(requiredForNewSiteToSiteDataTransferSpokes, uri);
        }
    }
}
