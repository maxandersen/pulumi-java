// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs Empty = new CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs();

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as &#34;TLS WWW client authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    @Import(name="clientAuth")
      private final @Nullable Output<Boolean> clientAuth;

    public Output<Boolean> clientAuth() {
        return this.clientAuth == null ? Codegen.empty() : this.clientAuth;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as &#34;Signing of downloadable executable code client authentication&#34;.
     * 
     */
    @Import(name="codeSigning")
      private final @Nullable Output<Boolean> codeSigning;

    public Output<Boolean> codeSigning() {
        return this.codeSigning == null ? Codegen.empty() : this.codeSigning;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as &#34;Email protection&#34;.
     * 
     */
    @Import(name="emailProtection")
      private final @Nullable Output<Boolean> emailProtection;

    public Output<Boolean> emailProtection() {
        return this.emailProtection == null ? Codegen.empty() : this.emailProtection;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as &#34;Signing OCSP responses&#34;.
     * 
     */
    @Import(name="ocspSigning")
      private final @Nullable Output<Boolean> ocspSigning;

    public Output<Boolean> ocspSigning() {
        return this.ocspSigning == null ? Codegen.empty() : this.ocspSigning;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as &#34;TLS WWW server authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    @Import(name="serverAuth")
      private final @Nullable Output<Boolean> serverAuth;

    public Output<Boolean> serverAuth() {
        return this.serverAuth == null ? Codegen.empty() : this.serverAuth;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as &#34;Binding the hash of an object to a time&#34;.
     * 
     */
    @Import(name="timeStamping")
      private final @Nullable Output<Boolean> timeStamping;

    public Output<Boolean> timeStamping() {
        return this.timeStamping == null ? Codegen.empty() : this.timeStamping;
    }

    public CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs(
        @Nullable Output<Boolean> clientAuth,
        @Nullable Output<Boolean> codeSigning,
        @Nullable Output<Boolean> emailProtection,
        @Nullable Output<Boolean> ocspSigning,
        @Nullable Output<Boolean> serverAuth,
        @Nullable Output<Boolean> timeStamping) {
        this.clientAuth = clientAuth;
        this.codeSigning = codeSigning;
        this.emailProtection = emailProtection;
        this.ocspSigning = ocspSigning;
        this.serverAuth = serverAuth;
        this.timeStamping = timeStamping;
    }

    private CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs() {
        this.clientAuth = Codegen.empty();
        this.codeSigning = Codegen.empty();
        this.emailProtection = Codegen.empty();
        this.ocspSigning = Codegen.empty();
        this.serverAuth = Codegen.empty();
        this.timeStamping = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> clientAuth;
        private @Nullable Output<Boolean> codeSigning;
        private @Nullable Output<Boolean> emailProtection;
        private @Nullable Output<Boolean> ocspSigning;
        private @Nullable Output<Boolean> serverAuth;
        private @Nullable Output<Boolean> timeStamping;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAuth = defaults.clientAuth;
    	      this.codeSigning = defaults.codeSigning;
    	      this.emailProtection = defaults.emailProtection;
    	      this.ocspSigning = defaults.ocspSigning;
    	      this.serverAuth = defaults.serverAuth;
    	      this.timeStamping = defaults.timeStamping;
        }

        public Builder clientAuth(@Nullable Output<Boolean> clientAuth) {
            this.clientAuth = clientAuth;
            return this;
        }
        public Builder clientAuth(@Nullable Boolean clientAuth) {
            this.clientAuth = Codegen.ofNullable(clientAuth);
            return this;
        }
        public Builder codeSigning(@Nullable Output<Boolean> codeSigning) {
            this.codeSigning = codeSigning;
            return this;
        }
        public Builder codeSigning(@Nullable Boolean codeSigning) {
            this.codeSigning = Codegen.ofNullable(codeSigning);
            return this;
        }
        public Builder emailProtection(@Nullable Output<Boolean> emailProtection) {
            this.emailProtection = emailProtection;
            return this;
        }
        public Builder emailProtection(@Nullable Boolean emailProtection) {
            this.emailProtection = Codegen.ofNullable(emailProtection);
            return this;
        }
        public Builder ocspSigning(@Nullable Output<Boolean> ocspSigning) {
            this.ocspSigning = ocspSigning;
            return this;
        }
        public Builder ocspSigning(@Nullable Boolean ocspSigning) {
            this.ocspSigning = Codegen.ofNullable(ocspSigning);
            return this;
        }
        public Builder serverAuth(@Nullable Output<Boolean> serverAuth) {
            this.serverAuth = serverAuth;
            return this;
        }
        public Builder serverAuth(@Nullable Boolean serverAuth) {
            this.serverAuth = Codegen.ofNullable(serverAuth);
            return this;
        }
        public Builder timeStamping(@Nullable Output<Boolean> timeStamping) {
            this.timeStamping = timeStamping;
            return this;
        }
        public Builder timeStamping(@Nullable Boolean timeStamping) {
            this.timeStamping = Codegen.ofNullable(timeStamping);
            return this;
        }        public CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs build() {
            return new CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs(clientAuth, codeSigning, emailProtection, ocspSigning, serverAuth, timeStamping);
        }
    }
}
