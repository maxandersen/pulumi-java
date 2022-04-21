// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PacketMirroringFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final PacketMirroringFilterResponse Empty = new PacketMirroringFilterResponse();

    /**
     * IP CIDR ranges that apply as filter on the source (ingress) or destination (egress) IP in the IP header. Only IPv4 is supported. If no ranges are specified, all traffic that matches the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
     * 
     */
    @Import(name="cidrRanges", required=true)
    private List<String> cidrRanges;

    public List<String> cidrRanges() {
        return this.cidrRanges;
    }

    /**
     * Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH.
     * 
     */
    @Import(name="direction", required=true)
    private String direction;

    public String direction() {
        return this.direction;
    }

    /**
     * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
     * 
     */
    @Import(name="ipProtocols", required=true)
    private List<String> ipProtocols;

    public List<String> ipProtocols() {
        return this.ipProtocols;
    }

    private PacketMirroringFilterResponse() {}

    private PacketMirroringFilterResponse(PacketMirroringFilterResponse $) {
        this.cidrRanges = $.cidrRanges;
        this.direction = $.direction;
        this.ipProtocols = $.ipProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PacketMirroringFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketMirroringFilterResponse $;

        public Builder() {
            $ = new PacketMirroringFilterResponse();
        }

        public Builder(PacketMirroringFilterResponse defaults) {
            $ = new PacketMirroringFilterResponse(Objects.requireNonNull(defaults));
        }

        public Builder cidrRanges(List<String> cidrRanges) {
            $.cidrRanges = cidrRanges;
            return this;
        }

        public Builder cidrRanges(String... cidrRanges) {
            return cidrRanges(List.of(cidrRanges));
        }

        public Builder direction(String direction) {
            $.direction = direction;
            return this;
        }

        public Builder ipProtocols(List<String> ipProtocols) {
            $.ipProtocols = ipProtocols;
            return this;
        }

        public Builder ipProtocols(String... ipProtocols) {
            return ipProtocols(List.of(ipProtocols));
        }

        public PacketMirroringFilterResponse build() {
            $.cidrRanges = Objects.requireNonNull($.cidrRanges, "expected parameter 'cidrRanges' to be non-null");
            $.direction = Objects.requireNonNull($.direction, "expected parameter 'direction' to be non-null");
            $.ipProtocols = Objects.requireNonNull($.ipProtocols, "expected parameter 'ipProtocols' to be non-null");
            return $;
        }
    }

}
