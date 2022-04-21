// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1alpha2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.domains_v1alpha2.inputs.CustomDnsResponse;
import com.pulumi.googlenative.domains_v1alpha2.inputs.GlueRecordResponse;
import com.pulumi.googlenative.domains_v1alpha2.inputs.GoogleDomainsDnsResponse;
import java.util.List;
import java.util.Objects;


/**
 * Defines the DNS configuration of a `Registration`, including name servers, DNSSEC, and glue records.
 * 
 */
public final class DnsSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DnsSettingsResponse Empty = new DnsSettingsResponse();

    /**
     * An arbitrary DNS provider identified by its name servers.
     * 
     */
    @Import(name="customDns", required=true)
    private CustomDnsResponse customDns;

    public CustomDnsResponse customDns() {
        return this.customDns;
    }

    /**
     * The list of glue records for this `Registration`. Commonly empty.
     * 
     */
    @Import(name="glueRecords", required=true)
    private List<GlueRecordResponse> glueRecords;

    public List<GlueRecordResponse> glueRecords() {
        return this.glueRecords;
    }

    /**
     * The free DNS zone provided by [Google Domains](https://domains.google/).
     * 
     */
    @Import(name="googleDomainsDns", required=true)
    private GoogleDomainsDnsResponse googleDomainsDns;

    public GoogleDomainsDnsResponse googleDomainsDns() {
        return this.googleDomainsDns;
    }

    private DnsSettingsResponse() {}

    private DnsSettingsResponse(DnsSettingsResponse $) {
        this.customDns = $.customDns;
        this.glueRecords = $.glueRecords;
        this.googleDomainsDns = $.googleDomainsDns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnsSettingsResponse $;

        public Builder() {
            $ = new DnsSettingsResponse();
        }

        public Builder(DnsSettingsResponse defaults) {
            $ = new DnsSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder customDns(CustomDnsResponse customDns) {
            $.customDns = customDns;
            return this;
        }

        public Builder glueRecords(List<GlueRecordResponse> glueRecords) {
            $.glueRecords = glueRecords;
            return this;
        }

        public Builder glueRecords(GlueRecordResponse... glueRecords) {
            return glueRecords(List.of(glueRecords));
        }

        public Builder googleDomainsDns(GoogleDomainsDnsResponse googleDomainsDns) {
            $.googleDomainsDns = googleDomainsDns;
            return this;
        }

        public DnsSettingsResponse build() {
            $.customDns = Objects.requireNonNull($.customDns, "expected parameter 'customDns' to be non-null");
            $.glueRecords = Objects.requireNonNull($.glueRecords, "expected parameter 'glueRecords' to be non-null");
            $.googleDomainsDns = Objects.requireNonNull($.googleDomainsDns, "expected parameter 'googleDomainsDns' to be non-null");
            return $;
        }
    }

}
