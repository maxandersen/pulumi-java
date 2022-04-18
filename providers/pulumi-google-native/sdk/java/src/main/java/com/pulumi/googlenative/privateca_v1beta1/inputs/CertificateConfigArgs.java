// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.privateca_v1beta1.inputs.PublicKeyArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.ReusableConfigWrapperArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.SubjectConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A CertificateConfig describes an X.509 certificate or CSR that is to be created, as an alternative to using ASN.1.
 * 
 */
public final class CertificateConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateConfigArgs Empty = new CertificateConfigArgs();

    /**
     * Optional. The public key that corresponds to this config. This is, for example, used when issuing Certificates, but not when creating a self-signed CertificateAuthority or CertificateAuthority CSR.
     * 
     */
    @Import(name="publicKey")
      private final @Nullable Output<PublicKeyArgs> publicKey;

    public Output<PublicKeyArgs> publicKey() {
        return this.publicKey == null ? Codegen.empty() : this.publicKey;
    }

    /**
     * Describes how some of the technical fields in a certificate should be populated.
     * 
     */
    @Import(name="reusableConfig", required=true)
      private final Output<ReusableConfigWrapperArgs> reusableConfig;

    public Output<ReusableConfigWrapperArgs> reusableConfig() {
        return this.reusableConfig;
    }

    /**
     * Specifies some of the values in a certificate that are related to the subject.
     * 
     */
    @Import(name="subjectConfig", required=true)
      private final Output<SubjectConfigArgs> subjectConfig;

    public Output<SubjectConfigArgs> subjectConfig() {
        return this.subjectConfig;
    }

    public CertificateConfigArgs(
        @Nullable Output<PublicKeyArgs> publicKey,
        Output<ReusableConfigWrapperArgs> reusableConfig,
        Output<SubjectConfigArgs> subjectConfig) {
        this.publicKey = publicKey;
        this.reusableConfig = Objects.requireNonNull(reusableConfig, "expected parameter 'reusableConfig' to be non-null");
        this.subjectConfig = Objects.requireNonNull(subjectConfig, "expected parameter 'subjectConfig' to be non-null");
    }

    private CertificateConfigArgs() {
        this.publicKey = Codegen.empty();
        this.reusableConfig = Codegen.empty();
        this.subjectConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PublicKeyArgs> publicKey;
        private Output<ReusableConfigWrapperArgs> reusableConfig;
        private Output<SubjectConfigArgs> subjectConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKey = defaults.publicKey;
    	      this.reusableConfig = defaults.reusableConfig;
    	      this.subjectConfig = defaults.subjectConfig;
        }

        public Builder publicKey(@Nullable Output<PublicKeyArgs> publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public Builder publicKey(@Nullable PublicKeyArgs publicKey) {
            this.publicKey = Codegen.ofNullable(publicKey);
            return this;
        }
        public Builder reusableConfig(Output<ReusableConfigWrapperArgs> reusableConfig) {
            this.reusableConfig = Objects.requireNonNull(reusableConfig);
            return this;
        }
        public Builder reusableConfig(ReusableConfigWrapperArgs reusableConfig) {
            this.reusableConfig = Output.of(Objects.requireNonNull(reusableConfig));
            return this;
        }
        public Builder subjectConfig(Output<SubjectConfigArgs> subjectConfig) {
            this.subjectConfig = Objects.requireNonNull(subjectConfig);
            return this;
        }
        public Builder subjectConfig(SubjectConfigArgs subjectConfig) {
            this.subjectConfig = Output.of(Objects.requireNonNull(subjectConfig));
            return this;
        }        public CertificateConfigArgs build() {
            return new CertificateConfigArgs(publicKey, reusableConfig, subjectConfig);
        }
    }
}
