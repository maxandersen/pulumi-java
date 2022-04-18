// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acm.inputs;

import com.pulumi.aws.acm.inputs.CertificateDomainValidationOptionGetArgs;
import com.pulumi.aws.acm.inputs.CertificateOptionsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateState extends com.pulumi.resources.ResourceArgs {

    public static final CertificateState Empty = new CertificateState();

    /**
     * The ARN of the certificate
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * ARN of an ACM PCA
     * 
     */
    @Import(name="certificateAuthorityArn")
      private final @Nullable Output<String> certificateAuthorityArn;

    public Output<String> certificateAuthorityArn() {
        return this.certificateAuthorityArn == null ? Codegen.empty() : this.certificateAuthorityArn;
    }

    /**
     * The certificate's PEM-formatted public key
     * 
     */
    @Import(name="certificateBody")
      private final @Nullable Output<String> certificateBody;

    public Output<String> certificateBody() {
        return this.certificateBody == null ? Codegen.empty() : this.certificateBody;
    }

    /**
     * The certificate's PEM-formatted chain
     * * Creating a private CA issued certificate
     * 
     */
    @Import(name="certificateChain")
      private final @Nullable Output<String> certificateChain;

    public Output<String> certificateChain() {
        return this.certificateChain == null ? Codegen.empty() : this.certificateChain;
    }

    /**
     * A domain name for which the certificate should be issued
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> domainName() {
        return this.domainName == null ? Codegen.empty() : this.domainName;
    }

    /**
     * Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g., if SANs are defined. Only set if `DNS`-validation was used.
     * 
     */
    @Import(name="domainValidationOptions")
      private final @Nullable Output<List<CertificateDomainValidationOptionGetArgs>> domainValidationOptions;

    public Output<List<CertificateDomainValidationOptionGetArgs>> domainValidationOptions() {
        return this.domainValidationOptions == null ? Codegen.empty() : this.domainValidationOptions;
    }

    /**
     * Configuration block used to set certificate options. Detailed below.
     * * Importing an existing certificate
     * 
     */
    @Import(name="options")
      private final @Nullable Output<CertificateOptionsGetArgs> options;

    public Output<CertificateOptionsGetArgs> options() {
        return this.options == null ? Codegen.empty() : this.options;
    }

    /**
     * The certificate's PEM-formatted private key
     * 
     */
    @Import(name="privateKey")
      private final @Nullable Output<String> privateKey;

    public Output<String> privateKey() {
        return this.privateKey == null ? Codegen.empty() : this.privateKey;
    }

    /**
     * Status of the certificate.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * Set of domains that should be SANs in the issued certificate. To remove all elements of a previously configured list, set this value equal to an empty list (`[]`).
     * 
     */
    @Import(name="subjectAlternativeNames")
      private final @Nullable Output<List<String>> subjectAlternativeNames;

    public Output<List<String>> subjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? Codegen.empty() : this.subjectAlternativeNames;
    }

    /**
     * A map of tags to assign to the resource..
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
     * 
     */
    @Import(name="validationEmails")
      private final @Nullable Output<List<String>> validationEmails;

    public Output<List<String>> validationEmails() {
        return this.validationEmails == null ? Codegen.empty() : this.validationEmails;
    }

    /**
     * Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into the provider.
     * 
     */
    @Import(name="validationMethod")
      private final @Nullable Output<String> validationMethod;

    public Output<String> validationMethod() {
        return this.validationMethod == null ? Codegen.empty() : this.validationMethod;
    }

    public CertificateState(
        @Nullable Output<String> arn,
        @Nullable Output<String> certificateAuthorityArn,
        @Nullable Output<String> certificateBody,
        @Nullable Output<String> certificateChain,
        @Nullable Output<String> domainName,
        @Nullable Output<List<CertificateDomainValidationOptionGetArgs>> domainValidationOptions,
        @Nullable Output<CertificateOptionsGetArgs> options,
        @Nullable Output<String> privateKey,
        @Nullable Output<String> status,
        @Nullable Output<List<String>> subjectAlternativeNames,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<List<String>> validationEmails,
        @Nullable Output<String> validationMethod) {
        this.arn = arn;
        this.certificateAuthorityArn = certificateAuthorityArn;
        this.certificateBody = certificateBody;
        this.certificateChain = certificateChain;
        this.domainName = domainName;
        this.domainValidationOptions = domainValidationOptions;
        this.options = options;
        this.privateKey = privateKey;
        this.status = status;
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.validationEmails = validationEmails;
        this.validationMethod = validationMethod;
    }

    private CertificateState() {
        this.arn = Codegen.empty();
        this.certificateAuthorityArn = Codegen.empty();
        this.certificateBody = Codegen.empty();
        this.certificateChain = Codegen.empty();
        this.domainName = Codegen.empty();
        this.domainValidationOptions = Codegen.empty();
        this.options = Codegen.empty();
        this.privateKey = Codegen.empty();
        this.status = Codegen.empty();
        this.subjectAlternativeNames = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.validationEmails = Codegen.empty();
        this.validationMethod = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> certificateAuthorityArn;
        private @Nullable Output<String> certificateBody;
        private @Nullable Output<String> certificateChain;
        private @Nullable Output<String> domainName;
        private @Nullable Output<List<CertificateDomainValidationOptionGetArgs>> domainValidationOptions;
        private @Nullable Output<CertificateOptionsGetArgs> options;
        private @Nullable Output<String> privateKey;
        private @Nullable Output<String> status;
        private @Nullable Output<List<String>> subjectAlternativeNames;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<List<String>> validationEmails;
        private @Nullable Output<String> validationMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificateAuthorityArn = defaults.certificateAuthorityArn;
    	      this.certificateBody = defaults.certificateBody;
    	      this.certificateChain = defaults.certificateChain;
    	      this.domainName = defaults.domainName;
    	      this.domainValidationOptions = defaults.domainValidationOptions;
    	      this.options = defaults.options;
    	      this.privateKey = defaults.privateKey;
    	      this.status = defaults.status;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.validationEmails = defaults.validationEmails;
    	      this.validationMethod = defaults.validationMethod;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder certificateAuthorityArn(@Nullable Output<String> certificateAuthorityArn) {
            this.certificateAuthorityArn = certificateAuthorityArn;
            return this;
        }
        public Builder certificateAuthorityArn(@Nullable String certificateAuthorityArn) {
            this.certificateAuthorityArn = Codegen.ofNullable(certificateAuthorityArn);
            return this;
        }
        public Builder certificateBody(@Nullable Output<String> certificateBody) {
            this.certificateBody = certificateBody;
            return this;
        }
        public Builder certificateBody(@Nullable String certificateBody) {
            this.certificateBody = Codegen.ofNullable(certificateBody);
            return this;
        }
        public Builder certificateChain(@Nullable Output<String> certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }
        public Builder certificateChain(@Nullable String certificateChain) {
            this.certificateChain = Codegen.ofNullable(certificateChain);
            return this;
        }
        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Codegen.ofNullable(domainName);
            return this;
        }
        public Builder domainValidationOptions(@Nullable Output<List<CertificateDomainValidationOptionGetArgs>> domainValidationOptions) {
            this.domainValidationOptions = domainValidationOptions;
            return this;
        }
        public Builder domainValidationOptions(@Nullable List<CertificateDomainValidationOptionGetArgs> domainValidationOptions) {
            this.domainValidationOptions = Codegen.ofNullable(domainValidationOptions);
            return this;
        }
        public Builder domainValidationOptions(CertificateDomainValidationOptionGetArgs... domainValidationOptions) {
            return domainValidationOptions(List.of(domainValidationOptions));
        }
        public Builder options(@Nullable Output<CertificateOptionsGetArgs> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable CertificateOptionsGetArgs options) {
            this.options = Codegen.ofNullable(options);
            return this;
        }
        public Builder privateKey(@Nullable Output<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = Codegen.ofNullable(privateKey);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder subjectAlternativeNames(@Nullable Output<List<String>> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public Builder subjectAlternativeNames(@Nullable List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = Codegen.ofNullable(subjectAlternativeNames);
            return this;
        }
        public Builder subjectAlternativeNames(String... subjectAlternativeNames) {
            return subjectAlternativeNames(List.of(subjectAlternativeNames));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder validationEmails(@Nullable Output<List<String>> validationEmails) {
            this.validationEmails = validationEmails;
            return this;
        }
        public Builder validationEmails(@Nullable List<String> validationEmails) {
            this.validationEmails = Codegen.ofNullable(validationEmails);
            return this;
        }
        public Builder validationEmails(String... validationEmails) {
            return validationEmails(List.of(validationEmails));
        }
        public Builder validationMethod(@Nullable Output<String> validationMethod) {
            this.validationMethod = validationMethod;
            return this;
        }
        public Builder validationMethod(@Nullable String validationMethod) {
            this.validationMethod = Codegen.ofNullable(validationMethod);
            return this;
        }        public CertificateState build() {
            return new CertificateState(arn, certificateAuthorityArn, certificateBody, certificateChain, domainName, domainValidationOptions, options, privateKey, status, subjectAlternativeNames, tags, tagsAll, validationEmails, validationMethod);
        }
    }
}
