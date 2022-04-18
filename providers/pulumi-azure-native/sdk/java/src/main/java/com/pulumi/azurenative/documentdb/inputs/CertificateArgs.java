// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * PEM formatted public key.
     * 
     */
    @Import(name="pem")
      private final @Nullable Output<String> pem;

    public Output<String> pem() {
        return this.pem == null ? Codegen.empty() : this.pem;
    }

    public CertificateArgs(@Nullable Output<String> pem) {
        this.pem = pem;
    }

    private CertificateArgs() {
        this.pem = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> pem;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pem = defaults.pem;
        }

        public Builder pem(@Nullable Output<String> pem) {
            this.pem = pem;
            return this;
        }
        public Builder pem(@Nullable String pem) {
            this.pem = Codegen.ofNullable(pem);
            return this;
        }        public CertificateArgs build() {
            return new CertificateArgs(pem);
        }
    }
}
