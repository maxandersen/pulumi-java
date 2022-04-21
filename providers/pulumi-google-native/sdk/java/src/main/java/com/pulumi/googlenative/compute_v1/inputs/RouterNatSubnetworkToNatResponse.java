// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Defines the IP ranges that want to use NAT for a subnetwork.
 * 
 */
public final class RouterNatSubnetworkToNatResponse extends com.pulumi.resources.InvokeArgs {

    public static final RouterNatSubnetworkToNatResponse Empty = new RouterNatSubnetworkToNatResponse();

    /**
     * URL for the subnetwork resource that will use NAT.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if &#34;LIST_OF_SECONDARY_IP_RANGES&#34; is one of the values in source_ip_ranges_to_nat.
     * 
     */
    @Import(name="secondaryIpRangeNames", required=true)
    private List<String> secondaryIpRangeNames;

    public List<String> secondaryIpRangeNames() {
        return this.secondaryIpRangeNames;
    }

    /**
     * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: [&#34;PRIMARY_IP_RANGE&#34;, &#34;LIST_OF_SECONDARY_IP_RANGES&#34;] Default: [ALL_IP_RANGES]
     * 
     */
    @Import(name="sourceIpRangesToNat", required=true)
    private List<String> sourceIpRangesToNat;

    public List<String> sourceIpRangesToNat() {
        return this.sourceIpRangesToNat;
    }

    private RouterNatSubnetworkToNatResponse() {}

    private RouterNatSubnetworkToNatResponse(RouterNatSubnetworkToNatResponse $) {
        this.name = $.name;
        this.secondaryIpRangeNames = $.secondaryIpRangeNames;
        this.sourceIpRangesToNat = $.sourceIpRangesToNat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouterNatSubnetworkToNatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterNatSubnetworkToNatResponse $;

        public Builder() {
            $ = new RouterNatSubnetworkToNatResponse();
        }

        public Builder(RouterNatSubnetworkToNatResponse defaults) {
            $ = new RouterNatSubnetworkToNatResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder secondaryIpRangeNames(List<String> secondaryIpRangeNames) {
            $.secondaryIpRangeNames = secondaryIpRangeNames;
            return this;
        }

        public Builder secondaryIpRangeNames(String... secondaryIpRangeNames) {
            return secondaryIpRangeNames(List.of(secondaryIpRangeNames));
        }

        public Builder sourceIpRangesToNat(List<String> sourceIpRangesToNat) {
            $.sourceIpRangesToNat = sourceIpRangesToNat;
            return this;
        }

        public Builder sourceIpRangesToNat(String... sourceIpRangesToNat) {
            return sourceIpRangesToNat(List.of(sourceIpRangesToNat));
        }

        public RouterNatSubnetworkToNatResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.secondaryIpRangeNames = Objects.requireNonNull($.secondaryIpRangeNames, "expected parameter 'secondaryIpRangeNames' to be non-null");
            $.sourceIpRangesToNat = Objects.requireNonNull($.sourceIpRangesToNat, "expected parameter 'sourceIpRangesToNat' to be non-null");
            return $;
        }
    }

}
