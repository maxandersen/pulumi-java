// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.domains_v1beta1.inputs.CustomDnsResponse;
import com.pulumi.googlenative.domains_v1beta1.inputs.GlueRecordResponse;
import com.pulumi.googlenative.domains_v1beta1.inputs.GoogleDomainsDnsResponse;
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
      private final CustomDnsResponse customDns;

    public CustomDnsResponse customDns() {
        return this.customDns;
    }

    /**
     * The list of glue records for this `Registration`. Commonly empty.
     * 
     */
    @Import(name="glueRecords", required=true)
      private final List<GlueRecordResponse> glueRecords;

    public List<GlueRecordResponse> glueRecords() {
        return this.glueRecords;
    }

    /**
     * The free DNS zone provided by [Google Domains](https://domains.google/).
     * 
     */
    @Import(name="googleDomainsDns", required=true)
      private final GoogleDomainsDnsResponse googleDomainsDns;

    public GoogleDomainsDnsResponse googleDomainsDns() {
        return this.googleDomainsDns;
    }

    public DnsSettingsResponse(
        CustomDnsResponse customDns,
        List<GlueRecordResponse> glueRecords,
        GoogleDomainsDnsResponse googleDomainsDns) {
        this.customDns = Objects.requireNonNull(customDns, "expected parameter 'customDns' to be non-null");
        this.glueRecords = Objects.requireNonNull(glueRecords, "expected parameter 'glueRecords' to be non-null");
        this.googleDomainsDns = Objects.requireNonNull(googleDomainsDns, "expected parameter 'googleDomainsDns' to be non-null");
    }

    private DnsSettingsResponse() {
        this.customDns = null;
        this.glueRecords = List.of();
        this.googleDomainsDns = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDnsResponse customDns;
        private List<GlueRecordResponse> glueRecords;
        private GoogleDomainsDnsResponse googleDomainsDns;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDns = defaults.customDns;
    	      this.glueRecords = defaults.glueRecords;
    	      this.googleDomainsDns = defaults.googleDomainsDns;
        }

        public Builder customDns(CustomDnsResponse customDns) {
            this.customDns = Objects.requireNonNull(customDns);
            return this;
        }
        public Builder glueRecords(List<GlueRecordResponse> glueRecords) {
            this.glueRecords = Objects.requireNonNull(glueRecords);
            return this;
        }
        public Builder glueRecords(GlueRecordResponse... glueRecords) {
            return glueRecords(List.of(glueRecords));
        }
        public Builder googleDomainsDns(GoogleDomainsDnsResponse googleDomainsDns) {
            this.googleDomainsDns = Objects.requireNonNull(googleDomainsDns);
            return this;
        }        public DnsSettingsResponse build() {
            return new DnsSettingsResponse(customDns, glueRecords, googleDomainsDns);
        }
    }
}
