// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateResponse extends com.pulumi.resources.InvokeArgs {

    public static final CertificateResponse Empty = new CertificateResponse();

    /**
     * PEM formatted public key.
     * 
     */
    @Import(name="pem")
      private final @Nullable String pem;

    public Optional<String> pem() {
        return this.pem == null ? Optional.empty() : Optional.ofNullable(this.pem);
    }

    public CertificateResponse(@Nullable String pem) {
        this.pem = pem;
    }

    private CertificateResponse() {
        this.pem = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String pem;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pem = defaults.pem;
        }

        public Builder pem(@Nullable String pem) {
            this.pem = pem;
            return this;
        }        public CertificateResponse build() {
            return new CertificateResponse(pem);
        }
    }
}
