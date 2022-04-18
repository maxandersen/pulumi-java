// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EnvelopeSignatureResponse {
    private final String keyid;
    private final String sig;

    @CustomType.Constructor
    private EnvelopeSignatureResponse(
        @CustomType.Parameter("keyid") String keyid,
        @CustomType.Parameter("sig") String sig) {
        this.keyid = keyid;
        this.sig = sig;
    }

    public String keyid() {
        return this.keyid;
    }
    public String sig() {
        return this.sig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvelopeSignatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyid;
        private String sig;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvelopeSignatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyid = defaults.keyid;
    	      this.sig = defaults.sig;
        }

        public Builder keyid(String keyid) {
            this.keyid = Objects.requireNonNull(keyid);
            return this;
        }
        public Builder sig(String sig) {
            this.sig = Objects.requireNonNull(sig);
            return this;
        }        public EnvelopeSignatureResponse build() {
            return new EnvelopeSignatureResponse(keyid, sig);
        }
    }
}
