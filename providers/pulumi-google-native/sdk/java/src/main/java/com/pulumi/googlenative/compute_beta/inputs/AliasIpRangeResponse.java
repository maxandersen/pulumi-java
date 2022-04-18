// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An alias IP range attached to an instance's network interface.
 * 
 */
public final class AliasIpRangeResponse extends com.pulumi.resources.InvokeArgs {

    public static final AliasIpRangeResponse Empty = new AliasIpRangeResponse();

    /**
     * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
     * 
     */
    @Import(name="ipCidrRange", required=true)
      private final String ipCidrRange;

    public String ipCidrRange() {
        return this.ipCidrRange;
    }

    /**
     * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
     * 
     */
    @Import(name="subnetworkRangeName", required=true)
      private final String subnetworkRangeName;

    public String subnetworkRangeName() {
        return this.subnetworkRangeName;
    }

    public AliasIpRangeResponse(
        String ipCidrRange,
        String subnetworkRangeName) {
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange, "expected parameter 'ipCidrRange' to be non-null");
        this.subnetworkRangeName = Objects.requireNonNull(subnetworkRangeName, "expected parameter 'subnetworkRangeName' to be non-null");
    }

    private AliasIpRangeResponse() {
        this.ipCidrRange = null;
        this.subnetworkRangeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasIpRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipCidrRange;
        private String subnetworkRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasIpRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.subnetworkRangeName = defaults.subnetworkRangeName;
        }

        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }
        public Builder subnetworkRangeName(String subnetworkRangeName) {
            this.subnetworkRangeName = Objects.requireNonNull(subnetworkRangeName);
            return this;
        }        public AliasIpRangeResponse build() {
            return new AliasIpRangeResponse(ipCidrRange, subnetworkRangeName);
        }
    }
}
