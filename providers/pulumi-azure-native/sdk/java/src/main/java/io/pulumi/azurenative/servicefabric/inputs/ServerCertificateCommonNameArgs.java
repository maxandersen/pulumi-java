// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the server certificate details using common name.
 * 
 */
public final class ServerCertificateCommonNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerCertificateCommonNameArgs Empty = new ServerCertificateCommonNameArgs();

    /**
     * The common name of the server certificate.
     * 
     */
    @Import(name="certificateCommonName", required=true)
      private final Output<String> certificateCommonName;

    public Output<String> certificateCommonName() {
        return this.certificateCommonName;
    }

    /**
     * The issuer thumbprint of the server certificate.
     * 
     */
    @Import(name="certificateIssuerThumbprint", required=true)
      private final Output<String> certificateIssuerThumbprint;

    public Output<String> certificateIssuerThumbprint() {
        return this.certificateIssuerThumbprint;
    }

    public ServerCertificateCommonNameArgs(
        Output<String> certificateCommonName,
        Output<String> certificateIssuerThumbprint) {
        this.certificateCommonName = Objects.requireNonNull(certificateCommonName, "expected parameter 'certificateCommonName' to be non-null");
        this.certificateIssuerThumbprint = Objects.requireNonNull(certificateIssuerThumbprint, "expected parameter 'certificateIssuerThumbprint' to be non-null");
    }

    private ServerCertificateCommonNameArgs() {
        this.certificateCommonName = Codegen.empty();
        this.certificateIssuerThumbprint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerCertificateCommonNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificateCommonName;
        private Output<String> certificateIssuerThumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerCertificateCommonNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateCommonName = defaults.certificateCommonName;
    	      this.certificateIssuerThumbprint = defaults.certificateIssuerThumbprint;
        }

        public Builder certificateCommonName(Output<String> certificateCommonName) {
            this.certificateCommonName = Objects.requireNonNull(certificateCommonName);
            return this;
        }
        public Builder certificateCommonName(String certificateCommonName) {
            this.certificateCommonName = Output.of(Objects.requireNonNull(certificateCommonName));
            return this;
        }
        public Builder certificateIssuerThumbprint(Output<String> certificateIssuerThumbprint) {
            this.certificateIssuerThumbprint = Objects.requireNonNull(certificateIssuerThumbprint);
            return this;
        }
        public Builder certificateIssuerThumbprint(String certificateIssuerThumbprint) {
            this.certificateIssuerThumbprint = Output.of(Objects.requireNonNull(certificateIssuerThumbprint));
            return this;
        }        public ServerCertificateCommonNameArgs build() {
            return new ServerCertificateCommonNameArgs(certificateCommonName, certificateIssuerThumbprint);
        }
    }
}
