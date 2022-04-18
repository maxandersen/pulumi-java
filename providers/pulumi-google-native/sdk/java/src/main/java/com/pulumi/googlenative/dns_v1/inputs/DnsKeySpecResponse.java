// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.inputs;

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
      private final String algorithm;

    public String algorithm() {
        return this.algorithm;
    }

    /**
     * Length of the keys in bits.
     * 
     */
    @Import(name="keyLength", required=true)
      private final Integer keyLength;

    public Integer keyLength() {
        return this.keyLength;
    }

    /**
     * Specifies whether this is a key signing key (KSK) or a zone signing key (ZSK). Key signing keys have the Secure Entry Point flag set and, when active, are only used to sign resource record sets of type DNSKEY. Zone signing keys do not have the Secure Entry Point flag set and are used to sign all other types of resource record sets.
     * 
     */
    @Import(name="keyType", required=true)
      private final String keyType;

    public String keyType() {
        return this.keyType;
    }

    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    public DnsKeySpecResponse(
        String algorithm,
        Integer keyLength,
        String keyType,
        String kind) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.keyLength = Objects.requireNonNull(keyLength, "expected parameter 'keyLength' to be non-null");
        this.keyType = Objects.requireNonNull(keyType, "expected parameter 'keyType' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
    }

    private DnsKeySpecResponse() {
        this.algorithm = null;
        this.keyLength = null;
        this.keyType = null;
        this.kind = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsKeySpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private Integer keyLength;
        private String keyType;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsKeySpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.keyLength = defaults.keyLength;
    	      this.keyType = defaults.keyType;
    	      this.kind = defaults.kind;
        }

        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder keyLength(Integer keyLength) {
            this.keyLength = Objects.requireNonNull(keyLength);
            return this;
        }
        public Builder keyType(String keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }        public DnsKeySpecResponse build() {
            return new DnsKeySpecResponse(algorithm, keyLength, keyType, kind);
        }
    }
}
