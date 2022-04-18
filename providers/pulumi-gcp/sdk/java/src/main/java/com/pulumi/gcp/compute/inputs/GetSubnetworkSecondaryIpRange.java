// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubnetworkSecondaryIpRange extends com.pulumi.resources.InvokeArgs {

    public static final GetSubnetworkSecondaryIpRange Empty = new GetSubnetworkSecondaryIpRange();

    /**
     * The range of IP addresses belonging to this subnetwork
     * secondary range.
     * 
     */
    @Import(name="ipCidrRange", required=true)
      private final String ipCidrRange;

    public String ipCidrRange() {
        return this.ipCidrRange;
    }

    /**
     * The name associated with this subnetwork secondary range, used
     * when adding an alias IP range to a VM instance.
     * 
     */
    @Import(name="rangeName", required=true)
      private final String rangeName;

    public String rangeName() {
        return this.rangeName;
    }

    public GetSubnetworkSecondaryIpRange(
        String ipCidrRange,
        String rangeName) {
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange, "expected parameter 'ipCidrRange' to be non-null");
        this.rangeName = Objects.requireNonNull(rangeName, "expected parameter 'rangeName' to be non-null");
    }

    private GetSubnetworkSecondaryIpRange() {
        this.ipCidrRange = null;
        this.rangeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetworkSecondaryIpRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipCidrRange;
        private String rangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetworkSecondaryIpRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.rangeName = defaults.rangeName;
        }

        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }
        public Builder rangeName(String rangeName) {
            this.rangeName = Objects.requireNonNull(rangeName);
            return this;
        }        public GetSubnetworkSecondaryIpRange build() {
            return new GetSubnetworkSecondaryIpRange(ipCidrRange, rangeName);
        }
    }
}
