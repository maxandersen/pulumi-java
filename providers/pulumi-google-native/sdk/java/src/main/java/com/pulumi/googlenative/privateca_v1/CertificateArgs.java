// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.privateca_v1.enums.CertificateSubjectMode;
import com.pulumi.googlenative.privateca_v1.inputs.CertificateConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    @Import(name="caPoolId", required=true)
      private final Output<String> caPoolId;

    public Output<String> caPoolId() {
        return this.caPoolId;
    }

    @Import(name="certificateId")
      private final @Nullable Output<String> certificateId;

    public Output<String> certificateId() {
        return this.certificateId == null ? Codegen.empty() : this.certificateId;
    }

    /**
     * Immutable. The resource name for a CertificateTemplate used to issue this certificate, in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`. If this is specified, the caller must have the necessary permission to use this template. If this is omitted, no template will be used. This template must be in the same location as the Certificate.
     * 
     */
    @Import(name="certificateTemplate")
      private final @Nullable Output<String> certificateTemplate;

    public Output<String> certificateTemplate() {
        return this.certificateTemplate == null ? Codegen.empty() : this.certificateTemplate;
    }

    /**
     * Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
     * 
     */
    @Import(name="config")
      private final @Nullable Output<CertificateConfigArgs> config;

    public Output<CertificateConfigArgs> config() {
        return this.config == null ? Codegen.empty() : this.config;
    }

    @Import(name="issuingCertificateAuthorityId")
      private final @Nullable Output<String> issuingCertificateAuthorityId;

    public Output<String> issuingCertificateAuthorityId() {
        return this.issuingCertificateAuthorityId == null ? Codegen.empty() : this.issuingCertificateAuthorityId;
    }

    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Immutable. The desired lifetime of a certificate. Used to create the &#34;not_before_time&#34; and &#34;not_after_time&#34; fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
     * 
     */
    @Import(name="lifetime", required=true)
      private final Output<String> lifetime;

    public Output<String> lifetime() {
        return this.lifetime;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Immutable. A pem-encoded X.509 certificate signing request (CSR).
     * 
     */
    @Import(name="pemCsr")
      private final @Nullable Output<String> pemCsr;

    public Output<String> pemCsr() {
        return this.pemCsr == null ? Codegen.empty() : this.pemCsr;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * Immutable. Specifies how the Certificate&#39;s identity fields are to be decided. If this is omitted, the `DEFAULT` subject mode will be used.
     * 
     */
    @Import(name="subjectMode")
      private final @Nullable Output<CertificateSubjectMode> subjectMode;

    public Output<CertificateSubjectMode> subjectMode() {
        return this.subjectMode == null ? Codegen.empty() : this.subjectMode;
    }

    @Import(name="validateOnly")
      private final @Nullable Output<String> validateOnly;

    public Output<String> validateOnly() {
        return this.validateOnly == null ? Codegen.empty() : this.validateOnly;
    }

    public CertificateArgs(
        Output<String> caPoolId,
        @Nullable Output<String> certificateId,
        @Nullable Output<String> certificateTemplate,
        @Nullable Output<CertificateConfigArgs> config,
        @Nullable Output<String> issuingCertificateAuthorityId,
        @Nullable Output<Map<String,String>> labels,
        Output<String> lifetime,
        @Nullable Output<String> location,
        @Nullable Output<String> pemCsr,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<CertificateSubjectMode> subjectMode,
        @Nullable Output<String> validateOnly) {
        this.caPoolId = Objects.requireNonNull(caPoolId, "expected parameter 'caPoolId' to be non-null");
        this.certificateId = certificateId;
        this.certificateTemplate = certificateTemplate;
        this.config = config;
        this.issuingCertificateAuthorityId = issuingCertificateAuthorityId;
        this.labels = labels;
        this.lifetime = Objects.requireNonNull(lifetime, "expected parameter 'lifetime' to be non-null");
        this.location = location;
        this.pemCsr = pemCsr;
        this.project = project;
        this.requestId = requestId;
        this.subjectMode = subjectMode;
        this.validateOnly = validateOnly;
    }

    private CertificateArgs() {
        this.caPoolId = Codegen.empty();
        this.certificateId = Codegen.empty();
        this.certificateTemplate = Codegen.empty();
        this.config = Codegen.empty();
        this.issuingCertificateAuthorityId = Codegen.empty();
        this.labels = Codegen.empty();
        this.lifetime = Codegen.empty();
        this.location = Codegen.empty();
        this.pemCsr = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.subjectMode = Codegen.empty();
        this.validateOnly = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> caPoolId;
        private @Nullable Output<String> certificateId;
        private @Nullable Output<String> certificateTemplate;
        private @Nullable Output<CertificateConfigArgs> config;
        private @Nullable Output<String> issuingCertificateAuthorityId;
        private @Nullable Output<Map<String,String>> labels;
        private Output<String> lifetime;
        private @Nullable Output<String> location;
        private @Nullable Output<String> pemCsr;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<CertificateSubjectMode> subjectMode;
        private @Nullable Output<String> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caPoolId = defaults.caPoolId;
    	      this.certificateId = defaults.certificateId;
    	      this.certificateTemplate = defaults.certificateTemplate;
    	      this.config = defaults.config;
    	      this.issuingCertificateAuthorityId = defaults.issuingCertificateAuthorityId;
    	      this.labels = defaults.labels;
    	      this.lifetime = defaults.lifetime;
    	      this.location = defaults.location;
    	      this.pemCsr = defaults.pemCsr;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.subjectMode = defaults.subjectMode;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder caPoolId(Output<String> caPoolId) {
            this.caPoolId = Objects.requireNonNull(caPoolId);
            return this;
        }
        public Builder caPoolId(String caPoolId) {
            this.caPoolId = Output.of(Objects.requireNonNull(caPoolId));
            return this;
        }
        public Builder certificateId(@Nullable Output<String> certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public Builder certificateId(@Nullable String certificateId) {
            this.certificateId = Codegen.ofNullable(certificateId);
            return this;
        }
        public Builder certificateTemplate(@Nullable Output<String> certificateTemplate) {
            this.certificateTemplate = certificateTemplate;
            return this;
        }
        public Builder certificateTemplate(@Nullable String certificateTemplate) {
            this.certificateTemplate = Codegen.ofNullable(certificateTemplate);
            return this;
        }
        public Builder config(@Nullable Output<CertificateConfigArgs> config) {
            this.config = config;
            return this;
        }
        public Builder config(@Nullable CertificateConfigArgs config) {
            this.config = Codegen.ofNullable(config);
            return this;
        }
        public Builder issuingCertificateAuthorityId(@Nullable Output<String> issuingCertificateAuthorityId) {
            this.issuingCertificateAuthorityId = issuingCertificateAuthorityId;
            return this;
        }
        public Builder issuingCertificateAuthorityId(@Nullable String issuingCertificateAuthorityId) {
            this.issuingCertificateAuthorityId = Codegen.ofNullable(issuingCertificateAuthorityId);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder lifetime(Output<String> lifetime) {
            this.lifetime = Objects.requireNonNull(lifetime);
            return this;
        }
        public Builder lifetime(String lifetime) {
            this.lifetime = Output.of(Objects.requireNonNull(lifetime));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder pemCsr(@Nullable Output<String> pemCsr) {
            this.pemCsr = pemCsr;
            return this;
        }
        public Builder pemCsr(@Nullable String pemCsr) {
            this.pemCsr = Codegen.ofNullable(pemCsr);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder subjectMode(@Nullable Output<CertificateSubjectMode> subjectMode) {
            this.subjectMode = subjectMode;
            return this;
        }
        public Builder subjectMode(@Nullable CertificateSubjectMode subjectMode) {
            this.subjectMode = Codegen.ofNullable(subjectMode);
            return this;
        }
        public Builder validateOnly(@Nullable Output<String> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }
        public Builder validateOnly(@Nullable String validateOnly) {
            this.validateOnly = Codegen.ofNullable(validateOnly);
            return this;
        }        public CertificateArgs build() {
            return new CertificateArgs(caPoolId, certificateId, certificateTemplate, config, issuingCertificateAuthorityId, labels, lifetime, location, pemCsr, project, requestId, subjectMode, validateOnly);
        }
    }
}
