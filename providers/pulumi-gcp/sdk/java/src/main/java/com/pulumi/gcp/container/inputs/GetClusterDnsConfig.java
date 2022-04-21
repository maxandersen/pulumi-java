// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterDnsConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterDnsConfig Empty = new GetClusterDnsConfig();

    @Import(name="clusterDns", required=true)
    private String clusterDns;

    public String clusterDns() {
        return this.clusterDns;
    }

    @Import(name="clusterDnsDomain", required=true)
    private String clusterDnsDomain;

    public String clusterDnsDomain() {
        return this.clusterDnsDomain;
    }

    @Import(name="clusterDnsScope", required=true)
    private String clusterDnsScope;

    public String clusterDnsScope() {
        return this.clusterDnsScope;
    }

    private GetClusterDnsConfig() {}

    private GetClusterDnsConfig(GetClusterDnsConfig $) {
        this.clusterDns = $.clusterDns;
        this.clusterDnsDomain = $.clusterDnsDomain;
        this.clusterDnsScope = $.clusterDnsScope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterDnsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterDnsConfig $;

        public Builder() {
            $ = new GetClusterDnsConfig();
        }

        public Builder(GetClusterDnsConfig defaults) {
            $ = new GetClusterDnsConfig(Objects.requireNonNull(defaults));
        }

        public Builder clusterDns(String clusterDns) {
            $.clusterDns = clusterDns;
            return this;
        }

        public Builder clusterDnsDomain(String clusterDnsDomain) {
            $.clusterDnsDomain = clusterDnsDomain;
            return this;
        }

        public Builder clusterDnsScope(String clusterDnsScope) {
            $.clusterDnsScope = clusterDnsScope;
            return this;
        }

        public GetClusterDnsConfig build() {
            $.clusterDns = Objects.requireNonNull($.clusterDns, "expected parameter 'clusterDns' to be non-null");
            $.clusterDnsDomain = Objects.requireNonNull($.clusterDnsDomain, "expected parameter 'clusterDnsDomain' to be non-null");
            $.clusterDnsScope = Objects.requireNonNull($.clusterDnsScope, "expected parameter 'clusterDnsScope' to be non-null");
            return $;
        }
    }

}
