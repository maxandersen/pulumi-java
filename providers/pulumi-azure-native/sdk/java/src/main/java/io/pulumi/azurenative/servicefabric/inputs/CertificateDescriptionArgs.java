// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the certificate details.
 * 
 */
public final class CertificateDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateDescriptionArgs Empty = new CertificateDescriptionArgs();

    /**
     * Thumbprint of the primary certificate.
     * 
     */
    @Import(name="thumbprint", required=true)
      private final Output<String> thumbprint;

    public Output<String> thumbprint() {
        return this.thumbprint;
    }

    /**
     * Thumbprint of the secondary certificate.
     * 
     */
    @Import(name="thumbprintSecondary")
      private final @Nullable Output<String> thumbprintSecondary;

    public Output<String> thumbprintSecondary() {
        return this.thumbprintSecondary == null ? Codegen.empty() : this.thumbprintSecondary;
    }

    /**
     * The local certificate store location.
     * 
     */
    @Import(name="x509StoreName")
      private final @Nullable Output<String> x509StoreName;

    public Output<String> x509StoreName() {
        return this.x509StoreName == null ? Codegen.empty() : this.x509StoreName;
    }

    public CertificateDescriptionArgs(
        Output<String> thumbprint,
        @Nullable Output<String> thumbprintSecondary,
        @Nullable Output<String> x509StoreName) {
        this.thumbprint = Objects.requireNonNull(thumbprint, "expected parameter 'thumbprint' to be non-null");
        this.thumbprintSecondary = thumbprintSecondary;
        this.x509StoreName = x509StoreName;
    }

    private CertificateDescriptionArgs() {
        this.thumbprint = Codegen.empty();
        this.thumbprintSecondary = Codegen.empty();
        this.x509StoreName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> thumbprint;
        private @Nullable Output<String> thumbprintSecondary;
        private @Nullable Output<String> x509StoreName;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.thumbprint = defaults.thumbprint;
    	      this.thumbprintSecondary = defaults.thumbprintSecondary;
    	      this.x509StoreName = defaults.x509StoreName;
        }

        public Builder thumbprint(Output<String> thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }
        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Output.of(Objects.requireNonNull(thumbprint));
            return this;
        }
        public Builder thumbprintSecondary(@Nullable Output<String> thumbprintSecondary) {
            this.thumbprintSecondary = thumbprintSecondary;
            return this;
        }
        public Builder thumbprintSecondary(@Nullable String thumbprintSecondary) {
            this.thumbprintSecondary = Codegen.ofNullable(thumbprintSecondary);
            return this;
        }
        public Builder x509StoreName(@Nullable Output<String> x509StoreName) {
            this.x509StoreName = x509StoreName;
            return this;
        }
        public Builder x509StoreName(@Nullable String x509StoreName) {
            this.x509StoreName = Codegen.ofNullable(x509StoreName);
            return this;
        }        public CertificateDescriptionArgs build() {
            return new CertificateDescriptionArgs(thumbprint, thumbprintSecondary, x509StoreName);
        }
    }
}
