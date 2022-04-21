// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Defines a host on your domain that is a DNS name server for your domain and/or other domains. Glue records are a way of making the IP address of a name server known, even when it serves DNS queries for its parent domain. For example, when `ns.example.com` is a name server for `example.com`, the host `ns.example.com` must have a glue record to break the circular DNS reference.
 * 
 */
public final class GlueRecordResponse extends com.pulumi.resources.InvokeArgs {

    public static final GlueRecordResponse Empty = new GlueRecordResponse();

    /**
     * Domain name of the host in Punycode format.
     * 
     */
    @Import(name="hostName", required=true)
    private String hostName;

    public String hostName() {
        return this.hostName;
    }

    /**
     * List of IPv4 addresses corresponding to this host in the standard decimal format (e.g. `198.51.100.1`). At least one of `ipv4_address` and `ipv6_address` must be set.
     * 
     */
    @Import(name="ipv4Addresses", required=true)
    private List<String> ipv4Addresses;

    public List<String> ipv4Addresses() {
        return this.ipv4Addresses;
    }

    /**
     * List of IPv6 addresses corresponding to this host in the standard hexadecimal format (e.g. `2001:db8::`). At least one of `ipv4_address` and `ipv6_address` must be set.
     * 
     */
    @Import(name="ipv6Addresses", required=true)
    private List<String> ipv6Addresses;

    public List<String> ipv6Addresses() {
        return this.ipv6Addresses;
    }

    private GlueRecordResponse() {}

    private GlueRecordResponse(GlueRecordResponse $) {
        this.hostName = $.hostName;
        this.ipv4Addresses = $.ipv4Addresses;
        this.ipv6Addresses = $.ipv6Addresses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlueRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlueRecordResponse $;

        public Builder() {
            $ = new GlueRecordResponse();
        }

        public Builder(GlueRecordResponse defaults) {
            $ = new GlueRecordResponse(Objects.requireNonNull(defaults));
        }

        public Builder hostName(String hostName) {
            $.hostName = hostName;
            return this;
        }

        public Builder ipv4Addresses(List<String> ipv4Addresses) {
            $.ipv4Addresses = ipv4Addresses;
            return this;
        }

        public Builder ipv4Addresses(String... ipv4Addresses) {
            return ipv4Addresses(List.of(ipv4Addresses));
        }

        public Builder ipv6Addresses(List<String> ipv6Addresses) {
            $.ipv6Addresses = ipv6Addresses;
            return this;
        }

        public Builder ipv6Addresses(String... ipv6Addresses) {
            return ipv6Addresses(List.of(ipv6Addresses));
        }

        public GlueRecordResponse build() {
            $.hostName = Objects.requireNonNull($.hostName, "expected parameter 'hostName' to be non-null");
            $.ipv4Addresses = Objects.requireNonNull($.ipv4Addresses, "expected parameter 'ipv4Addresses' to be non-null");
            $.ipv6Addresses = Objects.requireNonNull($.ipv6Addresses, "expected parameter 'ipv6Addresses' to be non-null");
            return $;
        }
    }

}
