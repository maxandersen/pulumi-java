// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.appengine_v1alpha.inputs.CertificateRawDataArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizedCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizedCertificateArgs Empty = new AuthorizedCertificateArgs();

    @Import(name="appId", required=true)
      private final Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }

    /**
     * The SSL certificate serving the AuthorizedCertificate resource. This must be obtained independently from a certificate authority.
     * 
     */
    @Import(name="certificateRawData")
      private final @Nullable Output<CertificateRawDataArgs> certificateRawData;

    public Output<CertificateRawDataArgs> certificateRawData() {
        return this.certificateRawData == null ? Codegen.empty() : this.certificateRawData;
    }

    /**
     * The user-specified display name of the certificate. This is not guaranteed to be unique. Example: My Certificate.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    public AuthorizedCertificateArgs(
        Output<String> appId,
        @Nullable Output<CertificateRawDataArgs> certificateRawData,
        @Nullable Output<String> displayName) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.certificateRawData = certificateRawData;
        this.displayName = displayName;
    }

    private AuthorizedCertificateArgs() {
        this.appId = Codegen.empty();
        this.certificateRawData = Codegen.empty();
        this.displayName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizedCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appId;
        private @Nullable Output<CertificateRawDataArgs> certificateRawData;
        private @Nullable Output<String> displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizedCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.certificateRawData = defaults.certificateRawData;
    	      this.displayName = defaults.displayName;
        }

        public Builder appId(Output<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder appId(String appId) {
            this.appId = Output.of(Objects.requireNonNull(appId));
            return this;
        }
        public Builder certificateRawData(@Nullable Output<CertificateRawDataArgs> certificateRawData) {
            this.certificateRawData = certificateRawData;
            return this;
        }
        public Builder certificateRawData(@Nullable CertificateRawDataArgs certificateRawData) {
            this.certificateRawData = Codegen.ofNullable(certificateRawData);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }        public AuthorizedCertificateArgs build() {
            return new AuthorizedCertificateArgs(appId, certificateRawData, displayName);
        }
    }
}
