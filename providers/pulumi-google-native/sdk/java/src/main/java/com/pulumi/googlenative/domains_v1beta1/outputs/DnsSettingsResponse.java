// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.domains_v1beta1.outputs.CustomDnsResponse;
import com.pulumi.googlenative.domains_v1beta1.outputs.GlueRecordResponse;
import com.pulumi.googlenative.domains_v1beta1.outputs.GoogleDomainsDnsResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DnsSettingsResponse {
    /**
     * An arbitrary DNS provider identified by its name servers.
     * 
     */
    private final CustomDnsResponse customDns;
    /**
     * The list of glue records for this `Registration`. Commonly empty.
     * 
     */
    private final List<GlueRecordResponse> glueRecords;
    /**
     * The free DNS zone provided by [Google Domains](https://domains.google/).
     * 
     */
    private final GoogleDomainsDnsResponse googleDomainsDns;

    @CustomType.Constructor
    private DnsSettingsResponse(
        @CustomType.Parameter("customDns") CustomDnsResponse customDns,
        @CustomType.Parameter("glueRecords") List<GlueRecordResponse> glueRecords,
        @CustomType.Parameter("googleDomainsDns") GoogleDomainsDnsResponse googleDomainsDns) {
        this.customDns = customDns;
        this.glueRecords = glueRecords;
        this.googleDomainsDns = googleDomainsDns;
    }

    /**
     * An arbitrary DNS provider identified by its name servers.
     * 
    */
    public CustomDnsResponse customDns() {
        return this.customDns;
    }
    /**
     * The list of glue records for this `Registration`. Commonly empty.
     * 
    */
    public List<GlueRecordResponse> glueRecords() {
        return this.glueRecords;
    }
    /**
     * The free DNS zone provided by [Google Domains](https://domains.google/).
     * 
    */
    public GoogleDomainsDnsResponse googleDomainsDns() {
        return this.googleDomainsDns;
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
