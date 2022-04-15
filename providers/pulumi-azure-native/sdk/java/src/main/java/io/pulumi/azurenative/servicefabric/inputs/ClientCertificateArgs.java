// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Client Certificate definition.
 * 
 */
public final class ClientCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClientCertificateArgs Empty = new ClientCertificateArgs();

    /**
     * Certificate Common name.
     * 
     */
    @Import(name="commonName")
      private final @Nullable Output<String> commonName;

    public Output<String> commonName() {
        return this.commonName == null ? Codegen.empty() : this.commonName;
    }

    /**
     * Whether the certificate is admin or not.
     * 
     */
    @Import(name="isAdmin", required=true)
      private final Output<Boolean> isAdmin;

    public Output<Boolean> isAdmin() {
        return this.isAdmin;
    }

    /**
     * Issuer thumbprint for the certificate. Only used together with CommonName.
     * 
     */
    @Import(name="issuerThumbprint")
      private final @Nullable Output<String> issuerThumbprint;

    public Output<String> issuerThumbprint() {
        return this.issuerThumbprint == null ? Codegen.empty() : this.issuerThumbprint;
    }

    /**
     * Certificate Thumbprint.
     * 
     */
    @Import(name="thumbprint")
      private final @Nullable Output<String> thumbprint;

    public Output<String> thumbprint() {
        return this.thumbprint == null ? Codegen.empty() : this.thumbprint;
    }

    public ClientCertificateArgs(
        @Nullable Output<String> commonName,
        Output<Boolean> isAdmin,
        @Nullable Output<String> issuerThumbprint,
        @Nullable Output<String> thumbprint) {
        this.commonName = commonName;
        this.isAdmin = Objects.requireNonNull(isAdmin, "expected parameter 'isAdmin' to be non-null");
        this.issuerThumbprint = issuerThumbprint;
        this.thumbprint = thumbprint;
    }

    private ClientCertificateArgs() {
        this.commonName = Codegen.empty();
        this.isAdmin = Codegen.empty();
        this.issuerThumbprint = Codegen.empty();
        this.thumbprint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> commonName;
        private Output<Boolean> isAdmin;
        private @Nullable Output<String> issuerThumbprint;
        private @Nullable Output<String> thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.isAdmin = defaults.isAdmin;
    	      this.issuerThumbprint = defaults.issuerThumbprint;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder commonName(@Nullable Output<String> commonName) {
            this.commonName = commonName;
            return this;
        }
        public Builder commonName(@Nullable String commonName) {
            this.commonName = Codegen.ofNullable(commonName);
            return this;
        }
        public Builder isAdmin(Output<Boolean> isAdmin) {
            this.isAdmin = Objects.requireNonNull(isAdmin);
            return this;
        }
        public Builder isAdmin(Boolean isAdmin) {
            this.isAdmin = Output.of(Objects.requireNonNull(isAdmin));
            return this;
        }
        public Builder issuerThumbprint(@Nullable Output<String> issuerThumbprint) {
            this.issuerThumbprint = issuerThumbprint;
            return this;
        }
        public Builder issuerThumbprint(@Nullable String issuerThumbprint) {
            this.issuerThumbprint = Codegen.ofNullable(issuerThumbprint);
            return this;
        }
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = Codegen.ofNullable(thumbprint);
            return this;
        }        public ClientCertificateArgs build() {
            return new ClientCertificateArgs(commonName, isAdmin, issuerThumbprint, thumbprint);
        }
    }
}
