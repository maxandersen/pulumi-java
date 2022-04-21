// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.domains_v1beta1.inputs.DsRecordArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for an arbitrary DNS provider.
 * 
 */
public final class CustomDnsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomDnsArgs Empty = new CustomDnsArgs();

    /**
     * The list of DS records for this domain, which are used to enable DNSSEC. The domain&#39;s DNS provider can provide the values to set here. If this field is empty, DNSSEC is disabled.
     * 
     */
    @Import(name="dsRecords")
    private @Nullable Output<List<DsRecordArgs>> dsRecords;

    public Optional<Output<List<DsRecordArgs>>> dsRecords() {
        return Optional.ofNullable(this.dsRecords);
    }

    /**
     * A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format.
     * 
     */
    @Import(name="nameServers", required=true)
    private Output<List<String>> nameServers;

    public Output<List<String>> nameServers() {
        return this.nameServers;
    }

    private CustomDnsArgs() {}

    private CustomDnsArgs(CustomDnsArgs $) {
        this.dsRecords = $.dsRecords;
        this.nameServers = $.nameServers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDnsArgs $;

        public Builder() {
            $ = new CustomDnsArgs();
        }

        public Builder(CustomDnsArgs defaults) {
            $ = new CustomDnsArgs(Objects.requireNonNull(defaults));
        }

        public Builder dsRecords(@Nullable Output<List<DsRecordArgs>> dsRecords) {
            $.dsRecords = dsRecords;
            return this;
        }

        public Builder dsRecords(List<DsRecordArgs> dsRecords) {
            return dsRecords(Output.of(dsRecords));
        }

        public Builder dsRecords(DsRecordArgs... dsRecords) {
            return dsRecords(List.of(dsRecords));
        }

        public Builder nameServers(Output<List<String>> nameServers) {
            $.nameServers = nameServers;
            return this;
        }

        public Builder nameServers(List<String> nameServers) {
            return nameServers(Output.of(nameServers));
        }

        public Builder nameServers(String... nameServers) {
            return nameServers(List.of(nameServers));
        }

        public CustomDnsArgs build() {
            $.nameServers = Objects.requireNonNull($.nameServers, "expected parameter 'nameServers' to be non-null");
            return $;
        }
    }

}
