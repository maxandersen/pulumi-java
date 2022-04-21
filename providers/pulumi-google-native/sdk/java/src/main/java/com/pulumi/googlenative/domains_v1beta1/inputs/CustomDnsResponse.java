// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.domains_v1beta1.inputs.DsRecordResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration for an arbitrary DNS provider.
 * 
 */
public final class CustomDnsResponse extends com.pulumi.resources.InvokeArgs {

    public static final CustomDnsResponse Empty = new CustomDnsResponse();

    /**
     * The list of DS records for this domain, which are used to enable DNSSEC. The domain&#39;s DNS provider can provide the values to set here. If this field is empty, DNSSEC is disabled.
     * 
     */
    @Import(name="dsRecords", required=true)
    private List<DsRecordResponse> dsRecords;

    public List<DsRecordResponse> dsRecords() {
        return this.dsRecords;
    }

    /**
     * A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format.
     * 
     */
    @Import(name="nameServers", required=true)
    private List<String> nameServers;

    public List<String> nameServers() {
        return this.nameServers;
    }

    private CustomDnsResponse() {}

    private CustomDnsResponse(CustomDnsResponse $) {
        this.dsRecords = $.dsRecords;
        this.nameServers = $.nameServers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDnsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDnsResponse $;

        public Builder() {
            $ = new CustomDnsResponse();
        }

        public Builder(CustomDnsResponse defaults) {
            $ = new CustomDnsResponse(Objects.requireNonNull(defaults));
        }

        public Builder dsRecords(List<DsRecordResponse> dsRecords) {
            $.dsRecords = dsRecords;
            return this;
        }

        public Builder dsRecords(DsRecordResponse... dsRecords) {
            return dsRecords(List.of(dsRecords));
        }

        public Builder nameServers(List<String> nameServers) {
            $.nameServers = nameServers;
            return this;
        }

        public Builder nameServers(String... nameServers) {
            return nameServers(List.of(nameServers));
        }

        public CustomDnsResponse build() {
            $.dsRecords = Objects.requireNonNull($.dsRecords, "expected parameter 'dsRecords' to be non-null");
            $.nameServers = Objects.requireNonNull($.nameServers, "expected parameter 'nameServers' to be non-null");
            return $;
        }
    }

}
