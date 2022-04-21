// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Parameters for DnsKey key generation. Used for generating initial keys for a new ManagedZone and as default when adding a new DnsKey.
 * 
 */
public final class DnsKeySpecResponse extends com.pulumi.resources.InvokeArgs {

    public static final DnsKeySpecResponse Empty = new DnsKeySpecResponse();

    /**
     * String mnemonic specifying the DNSSEC algorithm of this key.
     * 
     */
    @Import(name="algorithm", required=true)
    private String algorithm;

    public String algorithm() {
        return this.algorithm;
    }

    /**
     * Length of the keys in bits.
     * 
     */
    @Import(name="keyLength", required=true)
    private Integer keyLength;

    public Integer keyLength() {
        return this.keyLength;
    }

    /**
     * Specifies whether this is a key signing key (KSK) or a zone signing key (ZSK). Key signing keys have the Secure Entry Point flag set and, when active, are only used to sign resource record sets of type DNSKEY. Zone signing keys do not have the Secure Entry Point flag set and are used to sign all other types of resource record sets.
     * 
     */
    @Import(name="keyType", required=true)
    private String keyType;

    public String keyType() {
        return this.keyType;
    }

    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    private DnsKeySpecResponse() {}

    private DnsKeySpecResponse(DnsKeySpecResponse $) {
        this.algorithm = $.algorithm;
        this.keyLength = $.keyLength;
        this.keyType = $.keyType;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnsKeySpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnsKeySpecResponse $;

        public Builder() {
            $ = new DnsKeySpecResponse();
        }

        public Builder(DnsKeySpecResponse defaults) {
            $ = new DnsKeySpecResponse(Objects.requireNonNull(defaults));
        }

        public Builder algorithm(String algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        public Builder keyLength(Integer keyLength) {
            $.keyLength = keyLength;
            return this;
        }

        public Builder keyType(String keyType) {
            $.keyType = keyType;
            return this;
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public DnsKeySpecResponse build() {
            $.algorithm = Objects.requireNonNull($.algorithm, "expected parameter 'algorithm' to be non-null");
            $.keyLength = Objects.requireNonNull($.keyLength, "expected parameter 'keyLength' to be non-null");
            $.keyType = Objects.requireNonNull($.keyType, "expected parameter 'keyType' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            return $;
        }
    }

}
